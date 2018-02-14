// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Request for the Publish method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.PublishRequest}
 */
public  final class PublishRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PublishRequest)
    PublishRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublishRequest.newBuilder() to construct.
  private PublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublishRequest() {
    topic_ = "";
    messages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PublishRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              messages_ = new java.util.ArrayList<com.google.pubsub.v1.PubsubMessage>();
              mutable_bitField0_ |= 0x00000002;
            }
            messages_.add(
                input.readMessage(com.google.pubsub.v1.PubsubMessage.parser(), extensionRegistry));
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
        messages_ = java.util.Collections.unmodifiableList(messages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PublishRequest.class, com.google.pubsub.v1.PublishRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TOPIC_FIELD_NUMBER = 1;
  private volatile java.lang.Object topic_;
  /**
   * <pre>
   * The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGES_FIELD_NUMBER = 2;
  private java.util.List<com.google.pubsub.v1.PubsubMessage> messages_;
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  public java.util.List<com.google.pubsub.v1.PubsubMessage> getMessagesList() {
    return messages_;
  }
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  public java.util.List<? extends com.google.pubsub.v1.PubsubMessageOrBuilder> 
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  public com.google.pubsub.v1.PubsubMessage getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <pre>
   * The messages to publish.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
   */
  public com.google.pubsub.v1.PubsubMessageOrBuilder getMessagesOrBuilder(
      int index) {
    return messages_.get(index);
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
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(2, messages_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, messages_.get(i));
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
    if (!(obj instanceof com.google.pubsub.v1.PublishRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.PublishRequest other = (com.google.pubsub.v1.PublishRequest) obj;

    boolean result = true;
    result = result && getTopic()
        .equals(other.getTopic());
    result = result && getMessagesList()
        .equals(other.getMessagesList());
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.PublishRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.PublishRequest parseFrom(
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
  public static Builder newBuilder(com.google.pubsub.v1.PublishRequest prototype) {
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
   * <pre>
   * Request for the Publish method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.PublishRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PublishRequest)
      com.google.pubsub.v1.PublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PublishRequest.class, com.google.pubsub.v1.PublishRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PublishRequest.newBuilder()
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
        getMessagesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      topic_ = "";

      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_PublishRequest_descriptor;
    }

    public com.google.pubsub.v1.PublishRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.PublishRequest.getDefaultInstance();
    }

    public com.google.pubsub.v1.PublishRequest build() {
      com.google.pubsub.v1.PublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.PublishRequest buildPartial() {
      com.google.pubsub.v1.PublishRequest result = new com.google.pubsub.v1.PublishRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.topic_ = topic_;
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.PublishRequest) {
        return mergeFrom((com.google.pubsub.v1.PublishRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PublishRequest other) {
      if (other == com.google.pubsub.v1.PublishRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000002);
            messagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessagesFieldBuilder() : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.pubsub.v1.PublishRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.PublishRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object topic_ = "";
    /**
     * <pre>
     * The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.pubsub.v1.PubsubMessage> messages_ =
      java.util.Collections.emptyList();
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        messages_ = new java.util.ArrayList<com.google.pubsub.v1.PubsubMessage>(messages_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.pubsub.v1.PubsubMessage, com.google.pubsub.v1.PubsubMessage.Builder, com.google.pubsub.v1.PubsubMessageOrBuilder> messagesBuilder_;

    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public java.util.List<com.google.pubsub.v1.PubsubMessage> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessage getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder setMessages(
        int index, com.google.pubsub.v1.PubsubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder setMessages(
        int index, com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder addMessages(com.google.pubsub.v1.PubsubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder addMessages(
        int index, com.google.pubsub.v1.PubsubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder addMessages(
        com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder addMessages(
        int index, com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends com.google.pubsub.v1.PubsubMessage> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder getMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessageOrBuilder getMessagesOrBuilder(
        int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);  } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public java.util.List<? extends com.google.pubsub.v1.PubsubMessageOrBuilder> 
         getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder().addBuilder(
          com.google.pubsub.v1.PubsubMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder addMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().addBuilder(
          index, com.google.pubsub.v1.PubsubMessage.getDefaultInstance());
    }
    /**
     * <pre>
     * The messages to publish.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.PubsubMessage messages = 2;</code>
     */
    public java.util.List<com.google.pubsub.v1.PubsubMessage.Builder> 
         getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.pubsub.v1.PubsubMessage, com.google.pubsub.v1.PubsubMessage.Builder, com.google.pubsub.v1.PubsubMessageOrBuilder> 
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.PubsubMessage, com.google.pubsub.v1.PubsubMessage.Builder, com.google.pubsub.v1.PubsubMessageOrBuilder>(
                messages_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        messages_ = null;
      }
      return messagesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    public final Builder setTopicWithTopicName(com.google.pubsub.v1.TopicName value) {
      if (value == null) {
        return setTopic("");
      }
      return setTopic(value.toString());
    }
    
    public final com.google.pubsub.v1.TopicName getTopicAsTopicName() {
      java.lang.String str = getTopic();
      if (str.isEmpty()) {
        return null;
      }
      return com.google.pubsub.v1.TopicName.parse(str);
    }
    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PublishRequest)
  }

  public final com.google.pubsub.v1.TopicName getTopicAsTopicName() {
    java.lang.String str = getTopic();
    if (str.isEmpty()) {
      return null;
    }
    return com.google.pubsub.v1.TopicName.parse(str);
  }
  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PublishRequest)
  private static final com.google.pubsub.v1.PublishRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PublishRequest();
  }

  public static com.google.pubsub.v1.PublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishRequest>
      PARSER = new com.google.protobuf.AbstractParser<PublishRequest>() {
    public PublishRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PublishRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishRequest> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.PublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

