// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserRelationCheck.proto

package com.miapsoft.opq.proto;

public final class UserRelationCheck {
  private UserRelationCheck() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserRelationCheckProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string fromId = 1;
    /**
     * <code>optional string fromId = 1;</code>
     */
    boolean hasFromId();
    /**
     * <code>optional string fromId = 1;</code>
     */
    java.lang.String getFromId();
    /**
     * <code>optional string fromId = 1;</code>
     */
    com.google.protobuf.ByteString
        getFromIdBytes();

    // optional string toId = 2;
    /**
     * <code>optional string toId = 2;</code>
     */
    boolean hasToId();
    /**
     * <code>optional string toId = 2;</code>
     */
    java.lang.String getToId();
    /**
     * <code>optional string toId = 2;</code>
     */
    com.google.protobuf.ByteString
        getToIdBytes();

    // optional int32 isAgree = 3;
    /**
     * <code>optional int32 isAgree = 3;</code>
     */
    boolean hasIsAgree();
    /**
     * <code>optional int32 isAgree = 3;</code>
     */
    int getIsAgree();

    // optional int32 toIdIsReceived = 4;
    /**
     * <code>optional int32 toIdIsReceived = 4;</code>
     */
    boolean hasToIdIsReceived();
    /**
     * <code>optional int32 toIdIsReceived = 4;</code>
     */
    int getToIdIsReceived();

    // optional int32 fromIdIsReceived = 5;
    /**
     * <code>optional int32 fromIdIsReceived = 5;</code>
     */
    boolean hasFromIdIsReceived();
    /**
     * <code>optional int32 fromIdIsReceived = 5;</code>
     */
    int getFromIdIsReceived();
  }
  /**
   * Protobuf type {@code com.miapsoft.opq.proto.UserRelationCheckProto}
   *
   * <pre>
   *用户关系表
   * </pre>
   */
  public static final class UserRelationCheckProto extends
      com.google.protobuf.GeneratedMessage
      implements UserRelationCheckProtoOrBuilder {
    // Use UserRelationCheckProto.newBuilder() to construct.
    private UserRelationCheckProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private UserRelationCheckProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final UserRelationCheckProto defaultInstance;
    public static UserRelationCheckProto getDefaultInstance() {
      return defaultInstance;
    }

    public UserRelationCheckProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private UserRelationCheckProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fromId_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              toId_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              isAgree_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              toIdIsReceived_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              fromIdIsReceived_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.miapsoft.opq.proto.UserRelationCheck.internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.miapsoft.opq.proto.UserRelationCheck.internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.class, com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.Builder.class);
    }

    public static com.google.protobuf.Parser<UserRelationCheckProto> PARSER =
        new com.google.protobuf.AbstractParser<UserRelationCheckProto>() {
      public UserRelationCheckProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserRelationCheckProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UserRelationCheckProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string fromId = 1;
    public static final int FROMID_FIELD_NUMBER = 1;
    private java.lang.Object fromId_;
    /**
     * <code>optional string fromId = 1;</code>
     */
    public boolean hasFromId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string fromId = 1;</code>
     */
    public java.lang.String getFromId() {
      java.lang.Object ref = fromId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fromId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string fromId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFromIdBytes() {
      java.lang.Object ref = fromId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string toId = 2;
    public static final int TOID_FIELD_NUMBER = 2;
    private java.lang.Object toId_;
    /**
     * <code>optional string toId = 2;</code>
     */
    public boolean hasToId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string toId = 2;</code>
     */
    public java.lang.String getToId() {
      java.lang.Object ref = toId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          toId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string toId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToIdBytes() {
      java.lang.Object ref = toId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int32 isAgree = 3;
    public static final int ISAGREE_FIELD_NUMBER = 3;
    private int isAgree_;
    /**
     * <code>optional int32 isAgree = 3;</code>
     */
    public boolean hasIsAgree() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 isAgree = 3;</code>
     */
    public int getIsAgree() {
      return isAgree_;
    }

    // optional int32 toIdIsReceived = 4;
    public static final int TOIDISRECEIVED_FIELD_NUMBER = 4;
    private int toIdIsReceived_;
    /**
     * <code>optional int32 toIdIsReceived = 4;</code>
     */
    public boolean hasToIdIsReceived() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 toIdIsReceived = 4;</code>
     */
    public int getToIdIsReceived() {
      return toIdIsReceived_;
    }

    // optional int32 fromIdIsReceived = 5;
    public static final int FROMIDISRECEIVED_FIELD_NUMBER = 5;
    private int fromIdIsReceived_;
    /**
     * <code>optional int32 fromIdIsReceived = 5;</code>
     */
    public boolean hasFromIdIsReceived() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 fromIdIsReceived = 5;</code>
     */
    public int getFromIdIsReceived() {
      return fromIdIsReceived_;
    }

    private void initFields() {
      fromId_ = "";
      toId_ = "";
      isAgree_ = 0;
      toIdIsReceived_ = 0;
      fromIdIsReceived_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFromIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getToIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, isAgree_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, toIdIsReceived_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, fromIdIsReceived_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getFromIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getToIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, isAgree_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, toIdIsReceived_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, fromIdIsReceived_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.miapsoft.opq.proto.UserRelationCheckProto}
     *
     * <pre>
     *用户关系表
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.miapsoft.opq.proto.UserRelationCheck.internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.miapsoft.opq.proto.UserRelationCheck.internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.class, com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.Builder.class);
      }

      // Construct using com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fromId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        toId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        isAgree_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        toIdIsReceived_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        fromIdIsReceived_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.miapsoft.opq.proto.UserRelationCheck.internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_descriptor;
      }

      public com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto getDefaultInstanceForType() {
        return com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.getDefaultInstance();
      }

      public com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto build() {
        com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto buildPartial() {
        com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto result = new com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fromId_ = fromId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.toId_ = toId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.isAgree_ = isAgree_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.toIdIsReceived_ = toIdIsReceived_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.fromIdIsReceived_ = fromIdIsReceived_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto) {
          return mergeFrom((com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto other) {
        if (other == com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto.getDefaultInstance()) return this;
        if (other.hasFromId()) {
          bitField0_ |= 0x00000001;
          fromId_ = other.fromId_;
          onChanged();
        }
        if (other.hasToId()) {
          bitField0_ |= 0x00000002;
          toId_ = other.toId_;
          onChanged();
        }
        if (other.hasIsAgree()) {
          setIsAgree(other.getIsAgree());
        }
        if (other.hasToIdIsReceived()) {
          setToIdIsReceived(other.getToIdIsReceived());
        }
        if (other.hasFromIdIsReceived()) {
          setFromIdIsReceived(other.getFromIdIsReceived());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.miapsoft.opq.proto.UserRelationCheck.UserRelationCheckProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string fromId = 1;
      private java.lang.Object fromId_ = "";
      /**
       * <code>optional string fromId = 1;</code>
       */
      public boolean hasFromId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string fromId = 1;</code>
       */
      public java.lang.String getFromId() {
        java.lang.Object ref = fromId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          fromId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string fromId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFromIdBytes() {
        java.lang.Object ref = fromId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fromId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string fromId = 1;</code>
       */
      public Builder setFromId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fromId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string fromId = 1;</code>
       */
      public Builder clearFromId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fromId_ = getDefaultInstance().getFromId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string fromId = 1;</code>
       */
      public Builder setFromIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fromId_ = value;
        onChanged();
        return this;
      }

      // optional string toId = 2;
      private java.lang.Object toId_ = "";
      /**
       * <code>optional string toId = 2;</code>
       */
      public boolean hasToId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string toId = 2;</code>
       */
      public java.lang.String getToId() {
        java.lang.Object ref = toId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          toId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string toId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getToIdBytes() {
        java.lang.Object ref = toId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          toId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string toId = 2;</code>
       */
      public Builder setToId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        toId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string toId = 2;</code>
       */
      public Builder clearToId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        toId_ = getDefaultInstance().getToId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string toId = 2;</code>
       */
      public Builder setToIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        toId_ = value;
        onChanged();
        return this;
      }

      // optional int32 isAgree = 3;
      private int isAgree_ ;
      /**
       * <code>optional int32 isAgree = 3;</code>
       */
      public boolean hasIsAgree() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 isAgree = 3;</code>
       */
      public int getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>optional int32 isAgree = 3;</code>
       */
      public Builder setIsAgree(int value) {
        bitField0_ |= 0x00000004;
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 isAgree = 3;</code>
       */
      public Builder clearIsAgree() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isAgree_ = 0;
        onChanged();
        return this;
      }

      // optional int32 toIdIsReceived = 4;
      private int toIdIsReceived_ ;
      /**
       * <code>optional int32 toIdIsReceived = 4;</code>
       */
      public boolean hasToIdIsReceived() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 toIdIsReceived = 4;</code>
       */
      public int getToIdIsReceived() {
        return toIdIsReceived_;
      }
      /**
       * <code>optional int32 toIdIsReceived = 4;</code>
       */
      public Builder setToIdIsReceived(int value) {
        bitField0_ |= 0x00000008;
        toIdIsReceived_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 toIdIsReceived = 4;</code>
       */
      public Builder clearToIdIsReceived() {
        bitField0_ = (bitField0_ & ~0x00000008);
        toIdIsReceived_ = 0;
        onChanged();
        return this;
      }

      // optional int32 fromIdIsReceived = 5;
      private int fromIdIsReceived_ ;
      /**
       * <code>optional int32 fromIdIsReceived = 5;</code>
       */
      public boolean hasFromIdIsReceived() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 fromIdIsReceived = 5;</code>
       */
      public int getFromIdIsReceived() {
        return fromIdIsReceived_;
      }
      /**
       * <code>optional int32 fromIdIsReceived = 5;</code>
       */
      public Builder setFromIdIsReceived(int value) {
        bitField0_ |= 0x00000010;
        fromIdIsReceived_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 fromIdIsReceived = 5;</code>
       */
      public Builder clearFromIdIsReceived() {
        bitField0_ = (bitField0_ & ~0x00000010);
        fromIdIsReceived_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.miapsoft.opq.proto.UserRelationCheckProto)
    }

    static {
      defaultInstance = new UserRelationCheckProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.miapsoft.opq.proto.UserRelationCheckProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027UserRelationCheck.proto\022\026com.miapsoft." +
      "opq.proto\"y\n\026UserRelationCheckProto\022\016\n\006f" +
      "romId\030\001 \001(\t\022\014\n\004toId\030\002 \001(\t\022\017\n\007isAgree\030\003 \001" +
      "(\005\022\026\n\016toIdIsReceived\030\004 \001(\005\022\030\n\020fromIdIsRe" +
      "ceived\030\005 \001(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_miapsoft_opq_proto_UserRelationCheckProto_descriptor,
              new java.lang.String[] { "FromId", "ToId", "IsAgree", "ToIdIsReceived", "FromIdIsReceived", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
