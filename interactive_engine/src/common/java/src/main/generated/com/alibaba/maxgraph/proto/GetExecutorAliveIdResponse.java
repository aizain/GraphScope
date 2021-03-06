// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code GetExecutorAliveIdResponse}
 */
public  final class GetExecutorAliveIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetExecutorAliveIdResponse)
    GetExecutorAliveIdResponseOrBuilder {
  // Use GetExecutorAliveIdResponse.newBuilder() to construct.
  private GetExecutorAliveIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetExecutorAliveIdResponse() {
    aliveId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetExecutorAliveIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.alibaba.maxgraph.proto.Response.Builder subBuilder = null;
            if (response_ != null) {
              subBuilder = response_.toBuilder();
            }
            response_ = input.readMessage(com.alibaba.maxgraph.proto.Response.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(response_);
              response_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            aliveId_ = input.readUInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Data.internal_static_GetExecutorAliveIdResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Data.internal_static_GetExecutorAliveIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.class, com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private com.alibaba.maxgraph.proto.Response response_;
  /**
   * <code>optional .Response response = 1;</code>
   */
  public boolean hasResponse() {
    return response_ != null;
  }
  /**
   * <code>optional .Response response = 1;</code>
   */
  public com.alibaba.maxgraph.proto.Response getResponse() {
    return response_ == null ? com.alibaba.maxgraph.proto.Response.getDefaultInstance() : response_;
  }
  /**
   * <code>optional .Response response = 1;</code>
   */
  public com.alibaba.maxgraph.proto.ResponseOrBuilder getResponseOrBuilder() {
    return getResponse();
  }

  public static final int ALIVEID_FIELD_NUMBER = 2;
  private long aliveId_;
  /**
   * <code>optional uint64 aliveId = 2;</code>
   */
  public long getAliveId() {
    return aliveId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (response_ != null) {
      output.writeMessage(1, getResponse());
    }
    if (aliveId_ != 0L) {
      output.writeUInt64(2, aliveId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (response_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
    }
    if (aliveId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, aliveId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse other = (com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse) obj;

    boolean result = true;
    result = result && (hasResponse() == other.hasResponse());
    if (hasResponse()) {
      result = result && getResponse()
          .equals(other.getResponse());
    }
    result = result && (getAliveId()
        == other.getAliveId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    hash = (37 * hash) + ALIVEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAliveId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code GetExecutorAliveIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetExecutorAliveIdResponse)
      com.alibaba.maxgraph.proto.GetExecutorAliveIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Data.internal_static_GetExecutorAliveIdResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Data.internal_static_GetExecutorAliveIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.class, com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (responseBuilder_ == null) {
        response_ = null;
      } else {
        response_ = null;
        responseBuilder_ = null;
      }
      aliveId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Data.internal_static_GetExecutorAliveIdResponse_descriptor;
    }

    public com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse build() {
      com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse buildPartial() {
      com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse result = new com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse(this);
      if (responseBuilder_ == null) {
        result.response_ = response_;
      } else {
        result.response_ = responseBuilder_.build();
      }
      result.aliveId_ = aliveId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse) {
        return mergeFrom((com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse other) {
      if (other == com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse.getDefaultInstance()) return this;
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
      }
      if (other.getAliveId() != 0L) {
        setAliveId(other.getAliveId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.alibaba.maxgraph.proto.Response response_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.Response, com.alibaba.maxgraph.proto.Response.Builder, com.alibaba.maxgraph.proto.ResponseOrBuilder> responseBuilder_;
    /**
     * <code>optional .Response response = 1;</code>
     */
    public boolean hasResponse() {
      return responseBuilder_ != null || response_ != null;
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public com.alibaba.maxgraph.proto.Response getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? com.alibaba.maxgraph.proto.Response.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public Builder setResponse(com.alibaba.maxgraph.proto.Response value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public Builder setResponse(
        com.alibaba.maxgraph.proto.Response.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public Builder mergeResponse(com.alibaba.maxgraph.proto.Response value) {
      if (responseBuilder_ == null) {
        if (response_ != null) {
          response_ =
            com.alibaba.maxgraph.proto.Response.newBuilder(response_).mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        responseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public Builder clearResponse() {
      if (responseBuilder_ == null) {
        response_ = null;
        onChanged();
      } else {
        response_ = null;
        responseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public com.alibaba.maxgraph.proto.Response.Builder getResponseBuilder() {
      
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    public com.alibaba.maxgraph.proto.ResponseOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ?
            com.alibaba.maxgraph.proto.Response.getDefaultInstance() : response_;
      }
    }
    /**
     * <code>optional .Response response = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.Response, com.alibaba.maxgraph.proto.Response.Builder, com.alibaba.maxgraph.proto.ResponseOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.maxgraph.proto.Response, com.alibaba.maxgraph.proto.Response.Builder, com.alibaba.maxgraph.proto.ResponseOrBuilder>(
                getResponse(),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
    }

    private long aliveId_ ;
    /**
     * <code>optional uint64 aliveId = 2;</code>
     */
    public long getAliveId() {
      return aliveId_;
    }
    /**
     * <code>optional uint64 aliveId = 2;</code>
     */
    public Builder setAliveId(long value) {
      
      aliveId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 aliveId = 2;</code>
     */
    public Builder clearAliveId() {
      
      aliveId_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:GetExecutorAliveIdResponse)
  }

  // @@protoc_insertion_point(class_scope:GetExecutorAliveIdResponse)
  private static final com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse();
  }

  public static com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetExecutorAliveIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetExecutorAliveIdResponse>() {
    public GetExecutorAliveIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetExecutorAliveIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetExecutorAliveIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetExecutorAliveIdResponse> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.GetExecutorAliveIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

