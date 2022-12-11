// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemoveCustomDungeonReq.proto

package emu.grasscutter.net.proto;

public final class RemoveCustomDungeonReqOuterClass {
  private RemoveCustomDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RemoveCustomDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RemoveCustomDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 dungeon_guid = 7;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6234;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RemoveCustomDungeonReq}
   */
  public static final class RemoveCustomDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RemoveCustomDungeonReq)
      RemoveCustomDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveCustomDungeonReq.newBuilder() to construct.
    private RemoveCustomDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveCustomDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RemoveCustomDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveCustomDungeonReq(
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
            case 56: {

              dungeonGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.internal_static_RemoveCustomDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.internal_static_RemoveCustomDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.class, emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.Builder.class);
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 7;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 7;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
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
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(7, dungeonGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, dungeonGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq other = (emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq) obj;

      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
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
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq prototype) {
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
     *   CMD_ID = 6234;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RemoveCustomDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RemoveCustomDungeonReq)
        emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.internal_static_RemoveCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.internal_static_RemoveCustomDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.class, emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.newBuilder()
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
        dungeonGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.internal_static_RemoveCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq build() {
        emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq buildPartial() {
        emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq result = new emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq(this);
        result.dungeonGuid_ = dungeonGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq other) {
        if (other == emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq.getDefaultInstance()) return this;
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
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
        emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 7;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 7;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:RemoveCustomDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:RemoveCustomDungeonReq)
    private static final emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq();
    }

    public static emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RemoveCustomDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<RemoveCustomDungeonReq>() {
      @java.lang.Override
      public RemoveCustomDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveCustomDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RemoveCustomDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveCustomDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RemoveCustomDungeonReqOuterClass.RemoveCustomDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveCustomDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveCustomDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034RemoveCustomDungeonReq.proto\".\n\026Remove" +
      "CustomDungeonReq\022\024\n\014dungeon_guid\030\007 \001(\004B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RemoveCustomDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RemoveCustomDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveCustomDungeonReq_descriptor,
        new java.lang.String[] { "DungeonGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
