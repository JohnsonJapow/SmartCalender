package EventManager_GRPC;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: EventManager.proto")
public final class EventManagerGrpc {

  private EventManagerGrpc() {}

  public static final String SERVICE_NAME = "extra_smart.EventManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<EventManager_GRPC.Event,
      EventManager_GRPC.EventResponse> getAddEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEvent",
      requestType = EventManager_GRPC.Event.class,
      responseType = EventManager_GRPC.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<EventManager_GRPC.Event,
      EventManager_GRPC.EventResponse> getAddEventMethod() {
    io.grpc.MethodDescriptor<EventManager_GRPC.Event, EventManager_GRPC.EventResponse> getAddEventMethod;
    if ((getAddEventMethod = EventManagerGrpc.getAddEventMethod) == null) {
      synchronized (EventManagerGrpc.class) {
        if ((getAddEventMethod = EventManagerGrpc.getAddEventMethod) == null) {
          EventManagerGrpc.getAddEventMethod = getAddEventMethod = 
              io.grpc.MethodDescriptor.<EventManager_GRPC.Event, EventManager_GRPC.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "extra_smart.EventManager", "AddEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventManager_GRPC.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventManager_GRPC.EventResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventManagerMethodDescriptorSupplier("AddEvent"))
                  .build();
          }
        }
     }
     return getAddEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EventManager_GRPC.EventModificationRequest,
      EventManager_GRPC.EventResponse> getModifyEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyEvent",
      requestType = EventManager_GRPC.EventModificationRequest.class,
      responseType = EventManager_GRPC.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<EventManager_GRPC.EventModificationRequest,
      EventManager_GRPC.EventResponse> getModifyEventMethod() {
    io.grpc.MethodDescriptor<EventManager_GRPC.EventModificationRequest, EventManager_GRPC.EventResponse> getModifyEventMethod;
    if ((getModifyEventMethod = EventManagerGrpc.getModifyEventMethod) == null) {
      synchronized (EventManagerGrpc.class) {
        if ((getModifyEventMethod = EventManagerGrpc.getModifyEventMethod) == null) {
          EventManagerGrpc.getModifyEventMethod = getModifyEventMethod = 
              io.grpc.MethodDescriptor.<EventManager_GRPC.EventModificationRequest, EventManager_GRPC.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "extra_smart.EventManager", "ModifyEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventManager_GRPC.EventModificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventManager_GRPC.EventResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventManagerMethodDescriptorSupplier("ModifyEvent"))
                  .build();
          }
        }
     }
     return getModifyEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EventManager_GRPC.DateRange,
      EventManager_GRPC.Event> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvents",
      requestType = EventManager_GRPC.DateRange.class,
      responseType = EventManager_GRPC.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<EventManager_GRPC.DateRange,
      EventManager_GRPC.Event> getListEventsMethod() {
    io.grpc.MethodDescriptor<EventManager_GRPC.DateRange, EventManager_GRPC.Event> getListEventsMethod;
    if ((getListEventsMethod = EventManagerGrpc.getListEventsMethod) == null) {
      synchronized (EventManagerGrpc.class) {
        if ((getListEventsMethod = EventManagerGrpc.getListEventsMethod) == null) {
          EventManagerGrpc.getListEventsMethod = getListEventsMethod = 
              io.grpc.MethodDescriptor.<EventManager_GRPC.DateRange, EventManager_GRPC.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "extra_smart.EventManager", "ListEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventManager_GRPC.DateRange.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventManager_GRPC.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventManagerMethodDescriptorSupplier("ListEvents"))
                  .build();
          }
        }
     }
     return getListEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventManagerStub newStub(io.grpc.Channel channel) {
    return new EventManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class EventManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void addEvent(EventManager_GRPC.Event request,
        io.grpc.stub.StreamObserver<EventManager_GRPC.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddEventMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<EventManager_GRPC.EventModificationRequest> modifyEvent(
        io.grpc.stub.StreamObserver<EventManager_GRPC.EventResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getModifyEventMethod(), responseObserver);
    }

    /**
     */
    public void listEvents(EventManager_GRPC.DateRange request,
        io.grpc.stub.StreamObserver<EventManager_GRPC.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                EventManager_GRPC.Event,
                EventManager_GRPC.EventResponse>(
                  this, METHODID_ADD_EVENT)))
          .addMethod(
            getModifyEventMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                EventManager_GRPC.EventModificationRequest,
                EventManager_GRPC.EventResponse>(
                  this, METHODID_MODIFY_EVENT)))
          .addMethod(
            getListEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                EventManager_GRPC.DateRange,
                EventManager_GRPC.Event>(
                  this, METHODID_LIST_EVENTS)))
          .build();
    }
  }

  /**
   */
  public static final class EventManagerStub extends io.grpc.stub.AbstractStub<EventManagerStub> {
    private EventManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventManagerStub(channel, callOptions);
    }

    /**
     */
    public void addEvent(EventManager_GRPC.Event request,
        io.grpc.stub.StreamObserver<EventManager_GRPC.EventResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<EventManager_GRPC.EventModificationRequest> modifyEvent(
        io.grpc.stub.StreamObserver<EventManager_GRPC.EventResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getModifyEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void listEvents(EventManager_GRPC.DateRange request,
        io.grpc.stub.StreamObserver<EventManager_GRPC.Event> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventManagerBlockingStub extends io.grpc.stub.AbstractStub<EventManagerBlockingStub> {
    private EventManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public EventManager_GRPC.EventResponse addEvent(EventManager_GRPC.Event request) {
      return blockingUnaryCall(
          getChannel(), getAddEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<EventManager_GRPC.Event> listEvents(
        EventManager_GRPC.DateRange request) {
      return blockingServerStreamingCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventManagerFutureStub extends io.grpc.stub.AbstractStub<EventManagerFutureStub> {
    private EventManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<EventManager_GRPC.EventResponse> addEvent(
        EventManager_GRPC.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getAddEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_EVENT = 0;
  private static final int METHODID_LIST_EVENTS = 1;
  private static final int METHODID_MODIFY_EVENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_EVENT:
          serviceImpl.addEvent((EventManager_GRPC.Event) request,
              (io.grpc.stub.StreamObserver<EventManager_GRPC.EventResponse>) responseObserver);
          break;
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((EventManager_GRPC.DateRange) request,
              (io.grpc.stub.StreamObserver<EventManager_GRPC.Event>) responseObserver);
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
        case METHODID_MODIFY_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.modifyEvent(
              (io.grpc.stub.StreamObserver<EventManager_GRPC.EventResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return EventManager_GRPC.SmartServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventManager");
    }
  }

  private static final class EventManagerFileDescriptorSupplier
      extends EventManagerBaseDescriptorSupplier {
    EventManagerFileDescriptorSupplier() {}
  }

  private static final class EventManagerMethodDescriptorSupplier
      extends EventManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventManagerFileDescriptorSupplier())
              .addMethod(getAddEventMethod())
              .addMethod(getModifyEventMethod())
              .addMethod(getListEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
