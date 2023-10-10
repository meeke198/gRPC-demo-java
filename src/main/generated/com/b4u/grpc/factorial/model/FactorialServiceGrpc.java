package com.b4u.grpc.factorial.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: factorial-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FactorialServiceGrpc {

  private FactorialServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "FactorialService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.b4u.grpc.factorial.model.FactorialNumberRequest,
      com.b4u.grpc.factorial.model.Factorial> getGetFactorialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFactorial",
      requestType = com.b4u.grpc.factorial.model.FactorialNumberRequest.class,
      responseType = com.b4u.grpc.factorial.model.Factorial.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.b4u.grpc.factorial.model.FactorialNumberRequest,
      com.b4u.grpc.factorial.model.Factorial> getGetFactorialMethod() {
    io.grpc.MethodDescriptor<com.b4u.grpc.factorial.model.FactorialNumberRequest, com.b4u.grpc.factorial.model.Factorial> getGetFactorialMethod;
    if ((getGetFactorialMethod = FactorialServiceGrpc.getGetFactorialMethod) == null) {
      synchronized (FactorialServiceGrpc.class) {
        if ((getGetFactorialMethod = FactorialServiceGrpc.getGetFactorialMethod) == null) {
          FactorialServiceGrpc.getGetFactorialMethod = getGetFactorialMethod =
              io.grpc.MethodDescriptor.<com.b4u.grpc.factorial.model.FactorialNumberRequest, com.b4u.grpc.factorial.model.Factorial>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFactorial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.b4u.grpc.factorial.model.FactorialNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.b4u.grpc.factorial.model.Factorial.getDefaultInstance()))
              .setSchemaDescriptor(new FactorialServiceMethodDescriptorSupplier("getFactorial"))
              .build();
        }
      }
    }
    return getGetFactorialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FactorialServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactorialServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactorialServiceStub>() {
        @java.lang.Override
        public FactorialServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactorialServiceStub(channel, callOptions);
        }
      };
    return FactorialServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FactorialServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactorialServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactorialServiceBlockingStub>() {
        @java.lang.Override
        public FactorialServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactorialServiceBlockingStub(channel, callOptions);
        }
      };
    return FactorialServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FactorialServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactorialServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactorialServiceFutureStub>() {
        @java.lang.Override
        public FactorialServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactorialServiceFutureStub(channel, callOptions);
        }
      };
    return FactorialServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    default void getFactorial(com.b4u.grpc.factorial.model.FactorialNumberRequest request,
        io.grpc.stub.StreamObserver<com.b4u.grpc.factorial.model.Factorial> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFactorialMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FactorialService.
   */
  public static abstract class FactorialServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FactorialServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FactorialService.
   */
  public static final class FactorialServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FactorialServiceStub> {
    private FactorialServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorialServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactorialServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getFactorial(com.b4u.grpc.factorial.model.FactorialNumberRequest request,
        io.grpc.stub.StreamObserver<com.b4u.grpc.factorial.model.Factorial> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFactorialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FactorialService.
   */
  public static final class FactorialServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FactorialServiceBlockingStub> {
    private FactorialServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorialServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactorialServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.b4u.grpc.factorial.model.Factorial getFactorial(com.b4u.grpc.factorial.model.FactorialNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFactorialMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FactorialService.
   */
  public static final class FactorialServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FactorialServiceFutureStub> {
    private FactorialServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactorialServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactorialServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.b4u.grpc.factorial.model.Factorial> getFactorial(
        com.b4u.grpc.factorial.model.FactorialNumberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFactorialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FACTORIAL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FACTORIAL:
          serviceImpl.getFactorial((com.b4u.grpc.factorial.model.FactorialNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.b4u.grpc.factorial.model.Factorial>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetFactorialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.b4u.grpc.factorial.model.FactorialNumberRequest,
              com.b4u.grpc.factorial.model.Factorial>(
                service, METHODID_GET_FACTORIAL)))
        .build();
  }

  private static abstract class FactorialServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FactorialServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.b4u.grpc.factorial.model.FactorialProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FactorialService");
    }
  }

  private static final class FactorialServiceFileDescriptorSupplier
      extends FactorialServiceBaseDescriptorSupplier {
    FactorialServiceFileDescriptorSupplier() {}
  }

  private static final class FactorialServiceMethodDescriptorSupplier
      extends FactorialServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FactorialServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FactorialServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FactorialServiceFileDescriptorSupplier())
              .addMethod(getGetFactorialMethod())
              .build();
        }
      }
    }
    return result;
  }
}
