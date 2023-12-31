package com.b4u.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9000)
                .addService(new BankService())
                .addService(new FactorialService())
                .addService(new BookService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
