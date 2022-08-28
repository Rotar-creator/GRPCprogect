package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: Rotar.proto")
public final class RotarGrpc {

  private RotarGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.Rotar";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.RotarOuterClass.HelloRequest,
      com.example.grpc.RotarOuterClass.HelloResponse> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.example.grpc.RotarOuterClass.HelloRequest.class,
      responseType = com.example.grpc.RotarOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.RotarOuterClass.HelloRequest,
      com.example.grpc.RotarOuterClass.HelloResponse> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.RotarOuterClass.HelloRequest, com.example.grpc.RotarOuterClass.HelloResponse> getGreetingMethod;
    if ((getGreetingMethod = RotarGrpc.getGreetingMethod) == null) {
      synchronized (RotarGrpc.class) {
        if ((getGreetingMethod = RotarGrpc.getGreetingMethod) == null) {
          RotarGrpc.getGreetingMethod = getGreetingMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.RotarOuterClass.HelloRequest, com.example.grpc.RotarOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.RotarOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.RotarOuterClass.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RotarMethodDescriptorSupplier("greeting"))
              .build();
        }
      }
    }
    return getGreetingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RotarStub newStub(io.grpc.Channel channel) {
    return new RotarStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RotarBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RotarBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RotarFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RotarFutureStub(channel);
  }

  /**
   */
  public static abstract class RotarImplBase implements io.grpc.BindableService {

    /**
     */
    public void greeting(com.example.grpc.RotarOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.RotarOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.RotarOuterClass.HelloRequest,
                com.example.grpc.RotarOuterClass.HelloResponse>(
                  this, METHODID_GREETING)))
          .build();
    }
  }

  /**
   */
  public static final class RotarStub extends io.grpc.stub.AbstractStub<RotarStub> {
    private RotarStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RotarStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RotarStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RotarStub(channel, callOptions);
    }

    /**
     */
    public void greeting(com.example.grpc.RotarOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.RotarOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RotarBlockingStub extends io.grpc.stub.AbstractStub<RotarBlockingStub> {
    private RotarBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RotarBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RotarBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RotarBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.RotarOuterClass.HelloResponse greeting(com.example.grpc.RotarOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RotarFutureStub extends io.grpc.stub.AbstractStub<RotarFutureStub> {
    private RotarFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RotarFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RotarFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RotarFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.RotarOuterClass.HelloResponse> greeting(
        com.example.grpc.RotarOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RotarImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RotarImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.example.grpc.RotarOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.RotarOuterClass.HelloResponse>) responseObserver);
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

  private static abstract class RotarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RotarBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.RotarOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rotar");
    }
  }

  private static final class RotarFileDescriptorSupplier
      extends RotarBaseDescriptorSupplier {
    RotarFileDescriptorSupplier() {}
  }

  private static final class RotarMethodDescriptorSupplier
      extends RotarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RotarMethodDescriptorSupplier(String methodName) {
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
      synchronized (RotarGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RotarFileDescriptorSupplier())
              .addMethod(getGreetingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
