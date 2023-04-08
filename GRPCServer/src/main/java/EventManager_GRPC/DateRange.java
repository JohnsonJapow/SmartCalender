// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventManager.proto

package EventManager_GRPC;

/**
 * Protobuf type {@code extra_smart.DateRange}
 */
public  final class DateRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:extra_smart.DateRange)
    DateRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DateRange.newBuilder() to construct.
  private DateRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DateRange() {
    startDate_ = 0L;
    endDate_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DateRange(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            startDate_ = input.readInt64();
            break;
          }
          case 16: {

            endDate_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return EventManager_GRPC.SmartServiceImpl.internal_static_extra_smart_DateRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return EventManager_GRPC.SmartServiceImpl.internal_static_extra_smart_DateRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            EventManager_GRPC.DateRange.class, EventManager_GRPC.DateRange.Builder.class);
  }

  public static final int START_DATE_FIELD_NUMBER = 1;
  private long startDate_;
  /**
   * <code>int64 start_date = 1;</code>
   */
  public long getStartDate() {
    return startDate_;
  }

  public static final int END_DATE_FIELD_NUMBER = 2;
  private long endDate_;
  /**
   * <code>int64 end_date = 2;</code>
   */
  public long getEndDate() {
    return endDate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startDate_ != 0L) {
      output.writeInt64(1, startDate_);
    }
    if (endDate_ != 0L) {
      output.writeInt64(2, endDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, startDate_);
    }
    if (endDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, endDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof EventManager_GRPC.DateRange)) {
      return super.equals(obj);
    }
    EventManager_GRPC.DateRange other = (EventManager_GRPC.DateRange) obj;

    boolean result = true;
    result = result && (getStartDate()
        == other.getStartDate());
    result = result && (getEndDate()
        == other.getEndDate());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + START_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartDate());
    hash = (37 * hash) + END_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndDate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static EventManager_GRPC.DateRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static EventManager_GRPC.DateRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static EventManager_GRPC.DateRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static EventManager_GRPC.DateRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static EventManager_GRPC.DateRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static EventManager_GRPC.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(EventManager_GRPC.DateRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code extra_smart.DateRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:extra_smart.DateRange)
      EventManager_GRPC.DateRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EventManager_GRPC.SmartServiceImpl.internal_static_extra_smart_DateRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EventManager_GRPC.SmartServiceImpl.internal_static_extra_smart_DateRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EventManager_GRPC.DateRange.class, EventManager_GRPC.DateRange.Builder.class);
    }

    // Construct using EventManager_GRPC.DateRange.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      startDate_ = 0L;

      endDate_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return EventManager_GRPC.SmartServiceImpl.internal_static_extra_smart_DateRange_descriptor;
    }

    @java.lang.Override
    public EventManager_GRPC.DateRange getDefaultInstanceForType() {
      return EventManager_GRPC.DateRange.getDefaultInstance();
    }

    @java.lang.Override
    public EventManager_GRPC.DateRange build() {
      EventManager_GRPC.DateRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public EventManager_GRPC.DateRange buildPartial() {
      EventManager_GRPC.DateRange result = new EventManager_GRPC.DateRange(this);
      result.startDate_ = startDate_;
      result.endDate_ = endDate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof EventManager_GRPC.DateRange) {
        return mergeFrom((EventManager_GRPC.DateRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(EventManager_GRPC.DateRange other) {
      if (other == EventManager_GRPC.DateRange.getDefaultInstance()) return this;
      if (other.getStartDate() != 0L) {
        setStartDate(other.getStartDate());
      }
      if (other.getEndDate() != 0L) {
        setEndDate(other.getEndDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      EventManager_GRPC.DateRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (EventManager_GRPC.DateRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startDate_ ;
    /**
     * <code>int64 start_date = 1;</code>
     */
    public long getStartDate() {
      return startDate_;
    }
    /**
     * <code>int64 start_date = 1;</code>
     */
    public Builder setStartDate(long value) {
      
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 start_date = 1;</code>
     */
    public Builder clearStartDate() {
      
      startDate_ = 0L;
      onChanged();
      return this;
    }

    private long endDate_ ;
    /**
     * <code>int64 end_date = 2;</code>
     */
    public long getEndDate() {
      return endDate_;
    }
    /**
     * <code>int64 end_date = 2;</code>
     */
    public Builder setEndDate(long value) {
      
      endDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 end_date = 2;</code>
     */
    public Builder clearEndDate() {
      
      endDate_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:extra_smart.DateRange)
  }

  // @@protoc_insertion_point(class_scope:extra_smart.DateRange)
  private static final EventManager_GRPC.DateRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new EventManager_GRPC.DateRange();
  }

  public static EventManager_GRPC.DateRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateRange>
      PARSER = new com.google.protobuf.AbstractParser<DateRange>() {
    @java.lang.Override
    public DateRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DateRange(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DateRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public EventManager_GRPC.DateRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

