// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSChangeDeckNameReq.proto

package emu.grasscutter.net.proto;

public final class GCGDSChangeDeckNameReqOuterClass {
  private GCGDSChangeDeckNameReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSChangeDeckNameReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSChangeDeckNameReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3300_OIPMFIIBPHB = 11;</code>
     * @return The unk3300OIPMFIIBPHB.
     */
    boolean getUnk3300OIPMFIIBPHB();

    /**
     * <code>uint32 deck_id = 2;</code>
     * @return The deckId.
     */
    int getDeckId();

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7463;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGDSChangeDeckNameReq}
   */
  public static final class GCGDSChangeDeckNameReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSChangeDeckNameReq)
      GCGDSChangeDeckNameReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSChangeDeckNameReq.newBuilder() to construct.
    private GCGDSChangeDeckNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSChangeDeckNameReq() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSChangeDeckNameReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSChangeDeckNameReq(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              deckId_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300OIPMFIIBPHB_ = input.readBool();
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
      return emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.internal_static_GCGDSChangeDeckNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.internal_static_GCGDSChangeDeckNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.class, emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.Builder.class);
    }

    public static final int UNK3300_OIPMFIIBPHB_FIELD_NUMBER = 11;
    private boolean unk3300OIPMFIIBPHB_;
    /**
     * <code>bool Unk3300_OIPMFIIBPHB = 11;</code>
     * @return The unk3300OIPMFIIBPHB.
     */
    @java.lang.Override
    public boolean getUnk3300OIPMFIIBPHB() {
      return unk3300OIPMFIIBPHB_;
    }

    public static final int DECK_ID_FIELD_NUMBER = 2;
    private int deckId_;
    /**
     * <code>uint32 deck_id = 2;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (deckId_ != 0) {
        output.writeUInt32(2, deckId_);
      }
      if (unk3300OIPMFIIBPHB_ != false) {
        output.writeBool(11, unk3300OIPMFIIBPHB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (deckId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, deckId_);
      }
      if (unk3300OIPMFIIBPHB_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, unk3300OIPMFIIBPHB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq other = (emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq) obj;

      if (getUnk3300OIPMFIIBPHB()
          != other.getUnk3300OIPMFIIBPHB()) return false;
      if (getDeckId()
          != other.getDeckId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
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
      hash = (37 * hash) + UNK3300_OIPMFIIBPHB_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300OIPMFIIBPHB());
      hash = (37 * hash) + DECK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeckId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq prototype) {
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
     *   CMD_ID = 7463;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGDSChangeDeckNameReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSChangeDeckNameReq)
        emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.internal_static_GCGDSChangeDeckNameReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.internal_static_GCGDSChangeDeckNameReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.class, emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.newBuilder()
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
        unk3300OIPMFIIBPHB_ = false;

        deckId_ = 0;

        name_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.internal_static_GCGDSChangeDeckNameReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq build() {
        emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq buildPartial() {
        emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq result = new emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq(this);
        result.unk3300OIPMFIIBPHB_ = unk3300OIPMFIIBPHB_;
        result.deckId_ = deckId_;
        result.name_ = name_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq other) {
        if (other == emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq.getDefaultInstance()) return this;
        if (other.getUnk3300OIPMFIIBPHB() != false) {
          setUnk3300OIPMFIIBPHB(other.getUnk3300OIPMFIIBPHB());
        }
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
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
        emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3300OIPMFIIBPHB_ ;
      /**
       * <code>bool Unk3300_OIPMFIIBPHB = 11;</code>
       * @return The unk3300OIPMFIIBPHB.
       */
      @java.lang.Override
      public boolean getUnk3300OIPMFIIBPHB() {
        return unk3300OIPMFIIBPHB_;
      }
      /**
       * <code>bool Unk3300_OIPMFIIBPHB = 11;</code>
       * @param value The unk3300OIPMFIIBPHB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300OIPMFIIBPHB(boolean value) {
        
        unk3300OIPMFIIBPHB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_OIPMFIIBPHB = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300OIPMFIIBPHB() {
        
        unk3300OIPMFIIBPHB_ = false;
        onChanged();
        return this;
      }

      private int deckId_ ;
      /**
       * <code>uint32 deck_id = 2;</code>
       * @return The deckId.
       */
      @java.lang.Override
      public int getDeckId() {
        return deckId_;
      }
      /**
       * <code>uint32 deck_id = 2;</code>
       * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int value) {
        
        deckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 deck_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
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


      // @@protoc_insertion_point(builder_scope:GCGDSChangeDeckNameReq)
    }

    // @@protoc_insertion_point(class_scope:GCGDSChangeDeckNameReq)
    private static final emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq();
    }

    public static emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSChangeDeckNameReq>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSChangeDeckNameReq>() {
      @java.lang.Override
      public GCGDSChangeDeckNameReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSChangeDeckNameReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSChangeDeckNameReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSChangeDeckNameReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSChangeDeckNameReqOuterClass.GCGDSChangeDeckNameReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSChangeDeckNameReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSChangeDeckNameReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGDSChangeDeckNameReq.proto\"T\n\026GCGDSC" +
      "hangeDeckNameReq\022\033\n\023Unk3300_OIPMFIIBPHB\030" +
      "\013 \001(\010\022\017\n\007deck_id\030\002 \001(\r\022\014\n\004name\030\001 \001(\tB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSChangeDeckNameReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSChangeDeckNameReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSChangeDeckNameReq_descriptor,
        new java.lang.String[] { "Unk3300OIPMFIIBPHB", "DeckId", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}