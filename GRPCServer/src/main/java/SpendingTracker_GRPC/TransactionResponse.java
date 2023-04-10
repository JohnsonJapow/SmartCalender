// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpendingTracker.proto

package SpendingTracker_GRPC;

/**
 * Protobuf type {@code extra_smart.TransactionResponse}
 */
public  final class TransactionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:extra_smart.TransactionResponse)
    TransactionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransactionResponse.newBuilder() to construct.
  private TransactionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransactionResponse() {
    balance_ = 0F;
    records_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransactionResponse(
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
          case 13: {

            balance_ = input.readFloat();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              records_ = new java.util.ArrayList<SpendingTracker_GRPC.TransactionRecord>();
              mutable_bitField0_ |= 0x00000002;
            }
            records_.add(
                input.readMessage(SpendingTracker_GRPC.TransactionRecord.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        records_ = java.util.Collections.unmodifiableList(records_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SpendingTracker_GRPC.SmartServiceImpl.internal_static_extra_smart_TransactionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SpendingTracker_GRPC.SmartServiceImpl.internal_static_extra_smart_TransactionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SpendingTracker_GRPC.TransactionResponse.class, SpendingTracker_GRPC.TransactionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int BALANCE_FIELD_NUMBER = 1;
  private float balance_;
  /**
   * <code>float balance = 1;</code>
   */
  public float getBalance() {
    return balance_;
  }

  public static final int RECORDS_FIELD_NUMBER = 2;
  private java.util.List<SpendingTracker_GRPC.TransactionRecord> records_;
  /**
   * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
   */
  public java.util.List<SpendingTracker_GRPC.TransactionRecord> getRecordsList() {
    return records_;
  }
  /**
   * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
   */
  public java.util.List<? extends SpendingTracker_GRPC.TransactionRecordOrBuilder> 
      getRecordsOrBuilderList() {
    return records_;
  }
  /**
   * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
   */
  public int getRecordsCount() {
    return records_.size();
  }
  /**
   * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
   */
  public SpendingTracker_GRPC.TransactionRecord getRecords(int index) {
    return records_.get(index);
  }
  /**
   * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
   */
  public SpendingTracker_GRPC.TransactionRecordOrBuilder getRecordsOrBuilder(
      int index) {
    return records_.get(index);
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
    if (balance_ != 0F) {
      output.writeFloat(1, balance_);
    }
    for (int i = 0; i < records_.size(); i++) {
      output.writeMessage(2, records_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (balance_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, balance_);
    }
    for (int i = 0; i < records_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, records_.get(i));
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
    if (!(obj instanceof SpendingTracker_GRPC.TransactionResponse)) {
      return super.equals(obj);
    }
    SpendingTracker_GRPC.TransactionResponse other = (SpendingTracker_GRPC.TransactionResponse) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getBalance())
        == java.lang.Float.floatToIntBits(
            other.getBalance()));
    result = result && getRecordsList()
        .equals(other.getRecordsList());
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
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBalance());
    if (getRecordsCount() > 0) {
      hash = (37 * hash) + RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SpendingTracker_GRPC.TransactionResponse parseFrom(
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
  public static Builder newBuilder(SpendingTracker_GRPC.TransactionResponse prototype) {
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
   * Protobuf type {@code extra_smart.TransactionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:extra_smart.TransactionResponse)
      SpendingTracker_GRPC.TransactionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SpendingTracker_GRPC.SmartServiceImpl.internal_static_extra_smart_TransactionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SpendingTracker_GRPC.SmartServiceImpl.internal_static_extra_smart_TransactionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SpendingTracker_GRPC.TransactionResponse.class, SpendingTracker_GRPC.TransactionResponse.Builder.class);
    }

    // Construct using SpendingTracker_GRPC.TransactionResponse.newBuilder()
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
        getRecordsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      balance_ = 0F;

      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SpendingTracker_GRPC.SmartServiceImpl.internal_static_extra_smart_TransactionResponse_descriptor;
    }

    @java.lang.Override
    public SpendingTracker_GRPC.TransactionResponse getDefaultInstanceForType() {
      return SpendingTracker_GRPC.TransactionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public SpendingTracker_GRPC.TransactionResponse build() {
      SpendingTracker_GRPC.TransactionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public SpendingTracker_GRPC.TransactionResponse buildPartial() {
      SpendingTracker_GRPC.TransactionResponse result = new SpendingTracker_GRPC.TransactionResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.balance_ = balance_;
      if (recordsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          records_ = java.util.Collections.unmodifiableList(records_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.records_ = records_;
      } else {
        result.records_ = recordsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof SpendingTracker_GRPC.TransactionResponse) {
        return mergeFrom((SpendingTracker_GRPC.TransactionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SpendingTracker_GRPC.TransactionResponse other) {
      if (other == SpendingTracker_GRPC.TransactionResponse.getDefaultInstance()) return this;
      if (other.getBalance() != 0F) {
        setBalance(other.getBalance());
      }
      if (recordsBuilder_ == null) {
        if (!other.records_.isEmpty()) {
          if (records_.isEmpty()) {
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRecordsIsMutable();
            records_.addAll(other.records_);
          }
          onChanged();
        }
      } else {
        if (!other.records_.isEmpty()) {
          if (recordsBuilder_.isEmpty()) {
            recordsBuilder_.dispose();
            recordsBuilder_ = null;
            records_ = other.records_;
            bitField0_ = (bitField0_ & ~0x00000002);
            recordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecordsFieldBuilder() : null;
          } else {
            recordsBuilder_.addAllMessages(other.records_);
          }
        }
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
      SpendingTracker_GRPC.TransactionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SpendingTracker_GRPC.TransactionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private float balance_ ;
    /**
     * <code>float balance = 1;</code>
     */
    public float getBalance() {
      return balance_;
    }
    /**
     * <code>float balance = 1;</code>
     */
    public Builder setBalance(float value) {
      
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float balance = 1;</code>
     */
    public Builder clearBalance() {
      
      balance_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<SpendingTracker_GRPC.TransactionRecord> records_ =
      java.util.Collections.emptyList();
    private void ensureRecordsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        records_ = new java.util.ArrayList<SpendingTracker_GRPC.TransactionRecord>(records_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        SpendingTracker_GRPC.TransactionRecord, SpendingTracker_GRPC.TransactionRecord.Builder, SpendingTracker_GRPC.TransactionRecordOrBuilder> recordsBuilder_;

    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public java.util.List<SpendingTracker_GRPC.TransactionRecord> getRecordsList() {
      if (recordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(records_);
      } else {
        return recordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public int getRecordsCount() {
      if (recordsBuilder_ == null) {
        return records_.size();
      } else {
        return recordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public SpendingTracker_GRPC.TransactionRecord getRecords(int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);
      } else {
        return recordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder setRecords(
        int index, SpendingTracker_GRPC.TransactionRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.set(index, value);
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder setRecords(
        int index, SpendingTracker_GRPC.TransactionRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder addRecords(SpendingTracker_GRPC.TransactionRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder addRecords(
        int index, SpendingTracker_GRPC.TransactionRecord value) {
      if (recordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordsIsMutable();
        records_.add(index, value);
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder addRecords(
        SpendingTracker_GRPC.TransactionRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder addRecords(
        int index, SpendingTracker_GRPC.TransactionRecord.Builder builderForValue) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder addAllRecords(
        java.lang.Iterable<? extends SpendingTracker_GRPC.TransactionRecord> values) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, records_);
        onChanged();
      } else {
        recordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder clearRecords() {
      if (recordsBuilder_ == null) {
        records_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        recordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public Builder removeRecords(int index) {
      if (recordsBuilder_ == null) {
        ensureRecordsIsMutable();
        records_.remove(index);
        onChanged();
      } else {
        recordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public SpendingTracker_GRPC.TransactionRecord.Builder getRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public SpendingTracker_GRPC.TransactionRecordOrBuilder getRecordsOrBuilder(
        int index) {
      if (recordsBuilder_ == null) {
        return records_.get(index);  } else {
        return recordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public java.util.List<? extends SpendingTracker_GRPC.TransactionRecordOrBuilder> 
         getRecordsOrBuilderList() {
      if (recordsBuilder_ != null) {
        return recordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(records_);
      }
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public SpendingTracker_GRPC.TransactionRecord.Builder addRecordsBuilder() {
      return getRecordsFieldBuilder().addBuilder(
          SpendingTracker_GRPC.TransactionRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public SpendingTracker_GRPC.TransactionRecord.Builder addRecordsBuilder(
        int index) {
      return getRecordsFieldBuilder().addBuilder(
          index, SpendingTracker_GRPC.TransactionRecord.getDefaultInstance());
    }
    /**
     * <code>repeated .extra_smart.TransactionRecord records = 2;</code>
     */
    public java.util.List<SpendingTracker_GRPC.TransactionRecord.Builder> 
         getRecordsBuilderList() {
      return getRecordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        SpendingTracker_GRPC.TransactionRecord, SpendingTracker_GRPC.TransactionRecord.Builder, SpendingTracker_GRPC.TransactionRecordOrBuilder> 
        getRecordsFieldBuilder() {
      if (recordsBuilder_ == null) {
        recordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            SpendingTracker_GRPC.TransactionRecord, SpendingTracker_GRPC.TransactionRecord.Builder, SpendingTracker_GRPC.TransactionRecordOrBuilder>(
                records_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        records_ = null;
      }
      return recordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:extra_smart.TransactionResponse)
  }

  // @@protoc_insertion_point(class_scope:extra_smart.TransactionResponse)
  private static final SpendingTracker_GRPC.TransactionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SpendingTracker_GRPC.TransactionResponse();
  }

  public static SpendingTracker_GRPC.TransactionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransactionResponse>
      PARSER = new com.google.protobuf.AbstractParser<TransactionResponse>() {
    @java.lang.Override
    public TransactionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransactionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransactionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransactionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public SpendingTracker_GRPC.TransactionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
