package com.b4u.server;

import com.b4u.grpc.factorial.model.Factorial;
import com.b4u.grpc.factorial.model.FactorialNumberRequest;
import com.b4u.grpc.factorial.model.FactorialServiceGrpc;
import io.grpc.stub.StreamObserver;
//implementing a gRPC service called FactorialService with a method getFactorial
// that takes a FactorialNumberRequest and responds with a Factorial message.
public class FactorialService extends FactorialServiceGrpc.FactorialServiceImplBase {

    @Override
    public void getFactorial(FactorialNumberRequest request, StreamObserver<Factorial> responseObserver) {
        int n = request.getB4UNumber();
        int result = 1;
        for (int i=1; i<=n; i++) {
            result *= i;
        }
        Factorial factorial = Factorial.newBuilder()
//        This line creates a new builder for the Factorial message.
                .setB4UResult(result)
                .build();
        responseObserver.onNext(factorial);
        responseObserver.onCompleted();
    }
}
