// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: factorial-service.proto

package com.b4u.grpc.factorial.model;

/**
 * Protobuf type {@code FactorialNumberRequest}
 */
public  final class FactorialNumberRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FactorialNumberRequest)
    FactorialNumberRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FactorialNumberRequest.newBuilder() to construct.
  private FactorialNumberRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FactorialNumberRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FactorialNumberRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FactorialNumberRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            b4UNumber_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.b4u.grpc.factorial.model.FactorialProto.internal_static_FactorialNumberRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.b4u.grpc.factorial.model.FactorialProto.internal_static_FactorialNumberRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.b4u.grpc.factorial.model.FactorialNumberRequest.class, com.b4u.grpc.factorial.model.FactorialNumberRequest.Builder.class);
  }

  public static final int B4U_NUMBER_FIELD_NUMBER = 1;
  private int b4UNumber_;
  /**
   * <code>int32 b4u_number = 1;</code>
   * @return The b4uNumber.
   */
  public int getB4UNumber() {
    return b4UNumber_;
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
    if (b4UNumber_ != 0) {
      output.writeInt32(1, b4UNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (b4UNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, b4UNumber_);
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
    if (!(obj instanceof com.b4u.grpc.factorial.model.FactorialNumberRequest)) {
      return super.equals(obj);
    }
    com.b4u.grpc.factorial.model.FactorialNumberRequest other = (com.b4u.grpc.factorial.model.FactorialNumberRequest) obj;

    if (getB4UNumber()
        != other.getB4UNumber()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + B4U_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getB4UNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.b4u.grpc.factorial.model.FactorialNumberRequest parseFrom(
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
  public static Builder newBuilder(com.b4u.grpc.factorial.model.FactorialNumberRequest prototype) {
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
   * Protobuf type {@code FactorialNumberRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FactorialNumberRequest)
      com.b4u.grpc.factorial.model.FactorialNumberRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.b4u.grpc.factorial.model.FactorialProto.internal_static_FactorialNumberRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.b4u.grpc.factorial.model.FactorialProto.internal_static_FactorialNumberRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.b4u.grpc.factorial.model.FactorialNumberRequest.class, com.b4u.grpc.factorial.model.FactorialNumberRequest.Builder.class);
    }

    // Construct using com.b4u.grpc.factorial.model.FactorialNumberRequest.newBuilder()
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
      b4UNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.b4u.grpc.factorial.model.FactorialProto.internal_static_FactorialNumberRequest_descriptor;
    }

    @java.lang.Override
    public com.b4u.grpc.factorial.model.FactorialNumberRequest getDefaultInstanceForType() {
      return com.b4u.grpc.factorial.model.FactorialNumberRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.b4u.grpc.factorial.model.FactorialNumberRequest build() {
      com.b4u.grpc.factorial.model.FactorialNumberRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.b4u.grpc.factorial.model.FactorialNumberRequest buildPartial() {
      com.b4u.grpc.factorial.model.FactorialNumberRequest result = new com.b4u.grpc.factorial.model.FactorialNumberRequest(this);
      result.b4UNumber_ = b4UNumber_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.b4u.grpc.factorial.model.FactorialNumberRequest) {
        return mergeFrom((com.b4u.grpc.factorial.model.FactorialNumberRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.b4u.grpc.factorial.model.FactorialNumberRequest other) {
      if (other == com.b4u.grpc.factorial.model.FactorialNumberRequest.getDefaultInstance()) return this;
      if (other.getB4UNumber() != 0) {
        setB4UNumber(other.getB4UNumber());
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
      com.b4u.grpc.factorial.model.FactorialNumberRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.b4u.grpc.factorial.model.FactorialNumberRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int b4UNumber_ ;
    /**
     * <code>int32 b4u_number = 1;</code>
     * @return The b4uNumber.
     */
    public int getB4UNumber() {
      return b4UNumber_;
    }
    /**
     * <code>int32 b4u_number = 1;</code>
     * @param value The b4uNumber to set.
     * @return This builder for chaining.
     */
    public Builder setB4UNumber(int value) {
      
      b4UNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 b4u_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearB4UNumber() {
      
      b4UNumber_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FactorialNumberRequest)
  }

  // @@protoc_insertion_point(class_scope:FactorialNumberRequest)
  private static final com.b4u.grpc.factorial.model.FactorialNumberRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.b4u.grpc.factorial.model.FactorialNumberRequest();
  }

  public static com.b4u.grpc.factorial.model.FactorialNumberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FactorialNumberRequest>
      PARSER = new com.google.protobuf.AbstractParser<FactorialNumberRequest>() {
    @java.lang.Override
    public FactorialNumberRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FactorialNumberRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FactorialNumberRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FactorialNumberRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.b4u.grpc.factorial.model.FactorialNumberRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

