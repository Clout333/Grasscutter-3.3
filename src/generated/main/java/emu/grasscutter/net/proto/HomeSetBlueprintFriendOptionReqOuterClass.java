// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSetBlueprintFriendOptionReq.proto

package emu.grasscutter.net.proto;

public final class HomeSetBlueprintFriendOptionReqOuterClass {
  private HomeSetBlueprintFriendOptionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSetBlueprintFriendOptionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSetBlueprintFriendOptionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_allow_friend_copy = 8;</code>
     * @return The isAllowFriendCopy.
     */
    boolean getIsAllowFriendCopy();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4472;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeSetBlueprintFriendOptionReq}
   */
  public static final class HomeSetBlueprintFriendOptionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSetBlueprintFriendOptionReq)
      HomeSetBlueprintFriendOptionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSetBlueprintFriendOptionReq.newBuilder() to construct.
    private HomeSetBlueprintFriendOptionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSetBlueprintFriendOptionReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSetBlueprintFriendOptionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeSetBlueprintFriendOptionReq(
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
            case 64: {

              isAllowFriendCopy_ = input.readBool();
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
      return emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.internal_static_HomeSetBlueprintFriendOptionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.internal_static_HomeSetBlueprintFriendOptionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.class, emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.Builder.class);
    }

    public static final int IS_ALLOW_FRIEND_COPY_FIELD_NUMBER = 8;
    private boolean isAllowFriendCopy_;
    /**
     * <code>bool is_allow_friend_copy = 8;</code>
     * @return The isAllowFriendCopy.
     */
    @java.lang.Override
    public boolean getIsAllowFriendCopy() {
      return isAllowFriendCopy_;
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
      if (isAllowFriendCopy_ != false) {
        output.writeBool(8, isAllowFriendCopy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAllowFriendCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isAllowFriendCopy_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq other = (emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq) obj;

      if (getIsAllowFriendCopy()
          != other.getIsAllowFriendCopy()) return false;
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
      hash = (37 * hash) + IS_ALLOW_FRIEND_COPY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowFriendCopy());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq prototype) {
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 4472;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeSetBlueprintFriendOptionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSetBlueprintFriendOptionReq)
        emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.internal_static_HomeSetBlueprintFriendOptionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.internal_static_HomeSetBlueprintFriendOptionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.class, emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.newBuilder()
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
        isAllowFriendCopy_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.internal_static_HomeSetBlueprintFriendOptionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq build() {
        emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq buildPartial() {
        emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq result = new emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq(this);
        result.isAllowFriendCopy_ = isAllowFriendCopy_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq other) {
        if (other == emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq.getDefaultInstance()) return this;
        if (other.getIsAllowFriendCopy() != false) {
          setIsAllowFriendCopy(other.getIsAllowFriendCopy());
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
        emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAllowFriendCopy_ ;
      /**
       * <code>bool is_allow_friend_copy = 8;</code>
       * @return The isAllowFriendCopy.
       */
      @java.lang.Override
      public boolean getIsAllowFriendCopy() {
        return isAllowFriendCopy_;
      }
      /**
       * <code>bool is_allow_friend_copy = 8;</code>
       * @param value The isAllowFriendCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowFriendCopy(boolean value) {
        
        isAllowFriendCopy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_friend_copy = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowFriendCopy() {
        
        isAllowFriendCopy_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeSetBlueprintFriendOptionReq)
    }

    // @@protoc_insertion_point(class_scope:HomeSetBlueprintFriendOptionReq)
    private static final emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq();
    }

    public static emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSetBlueprintFriendOptionReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeSetBlueprintFriendOptionReq>() {
      @java.lang.Override
      public HomeSetBlueprintFriendOptionReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeSetBlueprintFriendOptionReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeSetBlueprintFriendOptionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSetBlueprintFriendOptionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSetBlueprintFriendOptionReqOuterClass.HomeSetBlueprintFriendOptionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSetBlueprintFriendOptionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSetBlueprintFriendOptionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HomeSetBlueprintFriendOptionReq.proto\"" +
      "?\n\037HomeSetBlueprintFriendOptionReq\022\034\n\024is" +
      "_allow_friend_copy\030\010 \001(\010B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSetBlueprintFriendOptionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSetBlueprintFriendOptionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSetBlueprintFriendOptionReq_descriptor,
        new java.lang.String[] { "IsAllowFriendCopy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
