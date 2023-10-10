package com.b4u.client;

import com.b4u.grpc.factorial.model.Factorial;
import com.b4u.grpc.factorial.model.FactorialNumberRequest;
import com.b4u.grpc.factorial.model.FactorialServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class FactorialClientTest {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 9000)
                .usePlaintext()
                .build();
        FactorialServiceGrpc.FactorialServiceBlockingStub blockingStub = FactorialServiceGrpc.newBlockingStub(managedChannel);

        FactorialNumberRequest factorialNumberRequest = FactorialNumberRequest.newBuilder()
                .setB4UNumber(3).build();
        Factorial factorial = blockingStub.getFactorial(factorialNumberRequest);
        System.out.println("Factorial Number is: " + factorial.getB4UResult());
    }
}