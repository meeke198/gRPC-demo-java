package com.b4u.grpc.book.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: book-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.b4u.grpc.book.model.SearchRequest,
      com.b4u.grpc.book.model.Book> getSearchByAuthorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchByAuthor",
      requestType = com.b4u.grpc.book.model.SearchRequest.class,
      responseType = com.b4u.grpc.book.model.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.b4u.grpc.book.model.SearchRequest,
      com.b4u.grpc.book.model.Book> getSearchByAuthorMethod() {
    io.grpc.MethodDescriptor<com.b4u.grpc.book.model.SearchRequest, com.b4u.grpc.book.model.Book> getSearchByAuthorMethod;
    if ((getSearchByAuthorMethod = BookServiceGrpc.getSearchByAuthorMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSearchByAuthorMethod = BookServiceGrpc.getSearchByAuthorMethod) == null) {
          BookServiceGrpc.getSearchByAuthorMethod = getSearchByAuthorMethod =
              io.grpc.MethodDescriptor.<com.b4u.grpc.book.model.SearchRequest, com.b4u.grpc.book.model.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchByAuthor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.b4u.grpc.book.model.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.b4u.grpc.book.model.Book.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("searchByAuthor"))
              .build();
        }
      }
    }
    return getSearchByAuthorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.b4u.grpc.book.model.SearchRequest,
      com.b4u.grpc.book.model.Books> getGetListBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListBook",
      requestType = com.b4u.grpc.book.model.SearchRequest.class,
      responseType = com.b4u.grpc.book.model.Books.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.b4u.grpc.book.model.SearchRequest,
      com.b4u.grpc.book.model.Books> getGetListBookMethod() {
    io.grpc.MethodDescriptor<com.b4u.grpc.book.model.SearchRequest, com.b4u.grpc.book.model.Books> getGetListBookMethod;
    if ((getGetListBookMethod = BookServiceGrpc.getGetListBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetListBookMethod = BookServiceGrpc.getGetListBookMethod) == null) {
          BookServiceGrpc.getGetListBookMethod = getGetListBookMethod =
              io.grpc.MethodDescriptor.<com.b4u.grpc.book.model.SearchRequest, com.b4u.grpc.book.model.Books>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getListBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.b4u.grpc.book.model.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.b4u.grpc.book.model.Books.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("getListBook"))
              .build();
        }
      }
    }
    return getGetListBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void searchByAuthor(com.b4u.grpc.book.model.SearchRequest request,
        io.grpc.stub.StreamObserver<com.b4u.grpc.book.model.Book> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchByAuthorMethod(), responseObserver);
    }

    /**
     */
    default void getListBook(com.b4u.grpc.book.model.SearchRequest request,
        io.grpc.stub.StreamObserver<com.b4u.grpc.book.model.Books> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListBookMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookService.
   */
  public static abstract class BookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookService.
   */
  public static final class BookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchByAuthor(com.b4u.grpc.book.model.SearchRequest request,
        io.grpc.stub.StreamObserver<com.b4u.grpc.book.model.Book> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchByAuthorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListBook(com.b4u.grpc.book.model.SearchRequest request,
        io.grpc.stub.StreamObserver<com.b4u.grpc.book.model.Books> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookService.
   */
  public static final class BookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.b4u.grpc.book.model.Book> searchByAuthor(
        com.b4u.grpc.book.model.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchByAuthorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.b4u.grpc.book.model.Books getListBook(com.b4u.grpc.book.model.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListBookMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookService.
   */
  public static final class BookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.b4u.grpc.book.model.Books> getListBook(
        com.b4u.grpc.book.model.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_BY_AUTHOR = 0;
  private static final int METHODID_GET_LIST_BOOK = 1;

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
        case METHODID_SEARCH_BY_AUTHOR:
          serviceImpl.searchByAuthor((com.b4u.grpc.book.model.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.b4u.grpc.book.model.Book>) responseObserver);
          break;
        case METHODID_GET_LIST_BOOK:
          serviceImpl.getListBook((com.b4u.grpc.book.model.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.b4u.grpc.book.model.Books>) responseObserver);
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
          getSearchByAuthorMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.b4u.grpc.book.model.SearchRequest,
              com.b4u.grpc.book.model.Book>(
                service, METHODID_SEARCH_BY_AUTHOR)))
        .addMethod(
          getGetListBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.b4u.grpc.book.model.SearchRequest,
              com.b4u.grpc.book.model.Books>(
                service, METHODID_GET_LIST_BOOK)))
        .build();
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.b4u.grpc.book.model.BookProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getSearchByAuthorMethod())
              .addMethod(getGetListBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
