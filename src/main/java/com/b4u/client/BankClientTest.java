package com.b4u.client;

import com.b4u.grpc.bank.model.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class BankClientTest {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9000)
                .usePlaintext()
                .build();

     //   getBalance(managedChannel);
     //     getBalanceAsync(managedChannel);
     //   withdraw(managedChannel);
     //   withdrawAsync(managedChannel);
        cashStreamingRequest(managedChannel);
    }

    private static void getBalance(ManagedChannel managedChannel) {
        BankServiceGrpc.BankServiceBlockingStub blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);

        BalanceCheckRequest balanceCheckRequest = BalanceCheckRequest.newBuilder()
                .setAccountNumber(1)
                .build();
        Balance balance = blockingStub.getBalance(balanceCheckRequest);
        System.out.println("Received : " + balance.getAmount());

    }

    private static void getBalanceAsync(ManagedChannel managedChannel) throws InterruptedException {
        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc.newStub(managedChannel);

        BalanceCheckRequest balanceCheckRequest = BalanceCheckRequest.newBuilder()
                .setAccountNumber(8)
                .build();
        CountDownLatch latch = new CountDownLatch(1);

        bankServiceStub.getBalance(balanceCheckRequest, new StreamObserver<Balance>() {
            @Override
            public void onNext(Balance balance) {
                System.out.println("Final Balance : " + balance.getAmount());
            }
            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }
            @Override
            public void onCompleted() {
                System.out.println("Server is done!");
                latch.countDown();
            }
        });
        latch.await();
    }

    private static void withdraw(ManagedChannel managedChannel) {
        BankServiceGrpc.BankServiceBlockingStub blockingStub =
                BankServiceGrpc.newBlockingStub(managedChannel);

        WithdrawRequest withdrawRequest = WithdrawRequest.newBuilder().setAccountNumber(1).setAmount(40).build();
        blockingStub.withdraw(withdrawRequest)
                .forEachRemaining(money -> System.out.println("Received : " + money.getValue()));

    }

    private static void withdrawAsync(ManagedChannel managedChannel) throws InterruptedException {
        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc.newStub(managedChannel);
        WithdrawRequest withdrawRequest = WithdrawRequest
                .newBuilder().setAccountNumber(3).setAmount(60).build();

        CountDownLatch latch = new CountDownLatch(1);
        bankServiceStub.withdraw(withdrawRequest, new StreamObserver<Money>() {
            @Override
            public void onNext(Money money) {
                System.out.println("Received : " + money.getValue()
                );
            }
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                latch.countDown();
            }
            @Override
            public void onCompleted() {
                System.out.println("Server is done!!");
                latch.countDown();
            }
        });
        latch.await();
    }
    public static void cashStreamingRequest(ManagedChannel managedChannel) throws InterruptedException {
        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc.newStub(managedChannel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<DepositRequest> streamObserver = bankServiceStub.cashDeposit(new StreamObserver<Balance>() {
            @Override
            public void onNext(Balance balance) {
                System.out.println("Final Balance : " + balance.getAmount()
                );
            }

            @Override
            public void onError(Throwable throwable) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done!"
                );
                latch.countDown();
            }
        });
        for (int i = 0; i < 2; i++) {
            DepositRequest depositRequest = DepositRequest.newBuilder().setAccountNumber(1).setAmount(10).build();
            streamObserver.onNext(depositRequest);
        }
        streamObserver.onCompleted();
        latch.await();
    }

}
