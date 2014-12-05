// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Base.proto

package com.miapsoft.opq.proto;

public final class Base {
  private Base() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BaseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string type = 1;
    /**
     * <code>required string type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required string type = 1;</code>
     */
    java.lang.String getType();
    /**
     * <code>required string type = 1;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    // optional bytes item = 2;
    /**
     * <code>optional bytes item = 2;</code>
     */
    boolean hasItem();
    /**
     * <code>optional bytes item = 2;</code>
     */
    com.google.protobuf.ByteString getItem();

    // repeated bytes items = 3;
    /**
     * <code>repeated bytes items = 3;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getItemsList();
    /**
     * <code>repeated bytes items = 3;</code>
     */
    int getItemsCount();
    /**
     * <code>repeated bytes items = 3;</code>
     */
    com.google.protobuf.ByteString getItems(int index);
  }
  /**
   * Protobuf type {@code com.miapsoft.opq.proto.BaseProto}
   *
   * <pre>
   *��������
   * </pre>
   */
  public static final class BaseProto extends
      com.google.protobuf.GeneratedMessage
      implements BaseProtoOrBuilder {
    // Use BaseProto.newBuilder() to construct.
    private BaseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BaseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BaseProto defaultInstance;
    public static BaseProto getDefaultInstance() {
      return defaultInstance;
    }

    public BaseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BaseProto(
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
              type_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              item_ = input.readBytes();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                items_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000004;
              }
              items_.add(input.readBytes());
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.miapsoft.opq.proto.Base.internal_static_com_miapsoft_opq_proto_BaseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.miapsoft.opq.proto.Base.internal_static_com_miapsoft_opq_proto_BaseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.miapsoft.opq.proto.Base.BaseProto.class, com.miapsoft.opq.proto.Base.BaseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<BaseProto> PARSER =
        new com.google.protobuf.AbstractParser<BaseProto>() {
      public BaseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BaseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BaseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private java.lang.Object type_;
    /**
     * <code>required string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional bytes item = 2;
    public static final int ITEM_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString item_;
    /**
     * <code>optional bytes item = 2;</code>
     */
    public boolean hasItem() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes item = 2;</code>
     */
    public com.google.protobuf.ByteString getItem() {
      return item_;
    }

    // repeated bytes items = 3;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.ByteString> items_;
    /**
     * <code>repeated bytes items = 3;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getItemsList() {
      return items_;
    }
    /**
     * <code>repeated bytes items = 3;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     * <code>repeated bytes items = 3;</code>
     */
    public com.google.protobuf.ByteString getItems(int index) {
      return items_.get(index);
    }

    private void initFields() {
      type_ = "";
      item_ = com.google.protobuf.ByteString.EMPTY;
      items_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, item_);
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeBytes(3, items_.get(i));
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
          .computeBytesSize(1, getTypeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, item_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < items_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(items_.get(i));
        }
        size += dataSize;
        size += 1 * getItemsList().size();
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

    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.miapsoft.opq.proto.Base.BaseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.miapsoft.opq.proto.Base.BaseProto prototype) {
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
     * Protobuf type {@code com.miapsoft.opq.proto.BaseProto}
     *
     * <pre>
     *��������
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.miapsoft.opq.proto.Base.BaseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.miapsoft.opq.proto.Base.internal_static_com_miapsoft_opq_proto_BaseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.miapsoft.opq.proto.Base.internal_static_com_miapsoft_opq_proto_BaseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.miapsoft.opq.proto.Base.BaseProto.class, com.miapsoft.opq.proto.Base.BaseProto.Builder.class);
      }

      // Construct using com.miapsoft.opq.proto.Base.BaseProto.newBuilder()
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
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        item_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.miapsoft.opq.proto.Base.internal_static_com_miapsoft_opq_proto_BaseProto_descriptor;
      }

      public com.miapsoft.opq.proto.Base.BaseProto getDefaultInstanceForType() {
        return com.miapsoft.opq.proto.Base.BaseProto.getDefaultInstance();
      }

      public com.miapsoft.opq.proto.Base.BaseProto build() {
        com.miapsoft.opq.proto.Base.BaseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.miapsoft.opq.proto.Base.BaseProto buildPartial() {
        com.miapsoft.opq.proto.Base.BaseProto result = new com.miapsoft.opq.proto.Base.BaseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.item_ = item_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.items_ = items_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.miapsoft.opq.proto.Base.BaseProto) {
          return mergeFrom((com.miapsoft.opq.proto.Base.BaseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.miapsoft.opq.proto.Base.BaseProto other) {
        if (other == com.miapsoft.opq.proto.Base.BaseProto.getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasItem()) {
          setItem(other.getItem());
        }
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.miapsoft.opq.proto.Base.BaseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.miapsoft.opq.proto.Base.BaseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string type = 1;
      private java.lang.Object type_ = "";
      /**
       * <code>required string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string type = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string type = 1;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 1;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      // optional bytes item = 2;
      private com.google.protobuf.ByteString item_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes item = 2;</code>
       */
      public boolean hasItem() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes item = 2;</code>
       */
      public com.google.protobuf.ByteString getItem() {
        return item_;
      }
      /**
       * <code>optional bytes item = 2;</code>
       */
      public Builder setItem(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        item_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes item = 2;</code>
       */
      public Builder clearItem() {
        bitField0_ = (bitField0_ & ~0x00000002);
        item_ = getDefaultInstance().getItem();
        onChanged();
        return this;
      }

      // repeated bytes items = 3;
      private java.util.List<com.google.protobuf.ByteString> items_ = java.util.Collections.emptyList();
      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          items_ = new java.util.ArrayList<com.google.protobuf.ByteString>(items_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getItemsList() {
        return java.util.Collections.unmodifiableList(items_);
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public int getItemsCount() {
        return items_.size();
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public com.google.protobuf.ByteString getItems(int index) {
        return items_.get(index);
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public Builder setItems(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public Builder addItems(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureItemsIsMutable();
        items_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureItemsIsMutable();
        super.addAll(values, items_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes items = 3;</code>
       */
      public Builder clearItems() {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.miapsoft.opq.proto.BaseProto)
    }

    static {
      defaultInstance = new BaseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.miapsoft.opq.proto.BaseProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_miapsoft_opq_proto_BaseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_miapsoft_opq_proto_BaseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nBase.proto\022\026com.miapsoft.opq.proto\"6\n\t" +
      "BaseProto\022\014\n\004type\030\001 \002(\t\022\014\n\004item\030\002 \001(\014\022\r\n" +
      "\005items\030\003 \003(\014"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_miapsoft_opq_proto_BaseProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_miapsoft_opq_proto_BaseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_miapsoft_opq_proto_BaseProto_descriptor,
              new java.lang.String[] { "Type", "Item", "Items", });
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