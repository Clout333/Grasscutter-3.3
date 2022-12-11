// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessLeftMonstersNotify.proto

package emu.grasscutter.net.proto;

public final class ChessLeftMonstersNotifyOuterClass {
  private ChessLeftMonstersNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessLeftMonstersNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessLeftMonstersNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 left_monsters = 5;</code>
     * @return The leftMonsters.
     */
    int getLeftMonsters();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5336;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChessLeftMonstersNotify}
   */
  public static final class ChessLeftMonstersNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessLeftMonstersNotify)
      ChessLeftMonstersNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessLeftMonstersNotify.newBuilder() to construct.
    private ChessLeftMonstersNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessLeftMonstersNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessLeftMonstersNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChessLeftMonstersNotify(
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
            case 40: {

              leftMonsters_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.internal_static_ChessLeftMonstersNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.internal_static_ChessLeftMonstersNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.class, emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.Builder.class);
    }

    public static final int LEFT_MONSTERS_FIELD_NUMBER = 5;
    private int leftMonsters_;
    /**
     * <code>uint32 left_monsters = 5;</code>
     * @return The leftMonsters.
     */
    @java.lang.Override
    public int getLeftMonsters() {
      return leftMonsters_;
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
      if (leftMonsters_ != 0) {
        output.writeUInt32(5, leftMonsters_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (leftMonsters_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, leftMonsters_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify other = (emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify) obj;

      if (getLeftMonsters()
          != other.getLeftMonsters()) return false;
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
      hash = (37 * hash) + LEFT_MONSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getLeftMonsters();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify prototype) {
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
     *   CMD_ID = 5336;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChessLeftMonstersNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessLeftMonstersNotify)
        emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.internal_static_ChessLeftMonstersNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.internal_static_ChessLeftMonstersNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.class, emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.newBuilder()
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
        leftMonsters_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.internal_static_ChessLeftMonstersNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify build() {
        emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify buildPartial() {
        emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify result = new emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify(this);
        result.leftMonsters_ = leftMonsters_;
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
        if (other instanceof emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify other) {
        if (other == emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify.getDefaultInstance()) return this;
        if (other.getLeftMonsters() != 0) {
          setLeftMonsters(other.getLeftMonsters());
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
        emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int leftMonsters_ ;
      /**
       * <code>uint32 left_monsters = 5;</code>
       * @return The leftMonsters.
       */
      @java.lang.Override
      public int getLeftMonsters() {
        return leftMonsters_;
      }
      /**
       * <code>uint32 left_monsters = 5;</code>
       * @param value The leftMonsters to set.
       * @return This builder for chaining.
       */
      public Builder setLeftMonsters(int value) {
        
        leftMonsters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_monsters = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftMonsters() {
        
        leftMonsters_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChessLeftMonstersNotify)
    }

    // @@protoc_insertion_point(class_scope:ChessLeftMonstersNotify)
    private static final emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify();
    }

    public static emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessLeftMonstersNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChessLeftMonstersNotify>() {
      @java.lang.Override
      public ChessLeftMonstersNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChessLeftMonstersNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChessLeftMonstersNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessLeftMonstersNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChessLeftMonstersNotifyOuterClass.ChessLeftMonstersNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessLeftMonstersNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessLeftMonstersNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ChessLeftMonstersNotify.proto\"0\n\027Chess" +
      "LeftMonstersNotify\022\025\n\rleft_monsters\030\005 \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessLeftMonstersNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessLeftMonstersNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessLeftMonstersNotify_descriptor,
        new java.lang.String[] { "LeftMonsters", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}