package com.b4u.server;

import com.b4u.grpc.bank.model.*;
import io.grpc.stub.StreamObserver;
import io.grpc.Status;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(AccountDB.getBalance(accountNumber))
                .build();
        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<Money> responseObserver) {
        int accountNumber = request.getAccountNumber();
        int amount = request.getAmount();
        int balance = AccountDB.getBalance(accountNumber);
        if(balance < amount){
            Status status = Status.FAILED_PRECONDITION.withDescription("No enough money. You have only " + balance);
            responseObserver.onError(status.asRuntimeException());
            return;
        }
        for (int i = 0; i < (amount/10); i++) {
            Money money = Money.newBuilder().setValue(10).build();
            responseObserver.onNext(money);
            AccountDB.deductBalance(accountNumber, 10);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<DepositRequest> cashDeposit(StreamObserver<Balance> responseObserver) {
        return new StreamObserver<DepositRequest>() {
            private int accountBalance;
            @Override
            public void onNext(DepositRequest depositRequest) {
                int accountNumber = depositRequest.getAccountNumber();
                int amount = depositRequest.getAmount();
                this.accountBalance = AccountDB.addBalance(accountNumber, amount);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Balance balance = Balance.newBuilder().setAmount(this.accountBalance).build();
                responseObserver.onNext(balance);
                responseObserver.onCompleted();
            }
        };
    }
}
