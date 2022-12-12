// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiracleRingDataNotify.proto

package emu.grasscutter.net.proto;

public final class MiracleRingDataNotifyOuterClass {
  private MiracleRingDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiracleRingDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MiracleRingDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_gadget_created = 15;</code>
     * @return The isGadgetCreated.
     */
    boolean getIsGadgetCreated();

    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 miracle_ring_cd = 9;</code>
     * @return The miracleRingCd.
     */
    int getMiracleRingCd();

    /**
     * <code>uint32 Unk3300_POIAEGJNEKP = 8;</code>
     * @return The unk3300POIAEGJNEKP.
     */
    int getUnk3300POIAEGJNEKP();

    /**
     * <code>uint32 last_take_reward_time = 12;</code>
     * @return The lastTakeRewardTime.
     */
    int getLastTakeRewardTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5222;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code MiracleRingDataNotify}
   */
  public static final class MiracleRingDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MiracleRingDataNotify)
      MiracleRingDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MiracleRingDataNotify.newBuilder() to construct.
    private MiracleRingDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiracleRingDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MiracleRingDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MiracleRingDataNotify(
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

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3300POIAEGJNEKP_ = input.readUInt32();
              break;
            }
            case 72: {

              miracleRingCd_ = input.readUInt32();
              break;
            }
            case 96: {

              lastTakeRewardTime_ = input.readUInt32();
              break;
            }
            case 120: {

              isGadgetCreated_ = input.readBool();
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
      return emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.class, emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.Builder.class);
    }

    public static final int IS_GADGET_CREATED_FIELD_NUMBER = 15;
    private boolean isGadgetCreated_;
    /**
     * <code>bool is_gadget_created = 15;</code>
     * @return The isGadgetCreated.
     */
    @java.lang.Override
    public boolean getIsGadgetCreated() {
      return isGadgetCreated_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 7;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int MIRACLE_RING_CD_FIELD_NUMBER = 9;
    private int miracleRingCd_;
    /**
     * <code>uint32 miracle_ring_cd = 9;</code>
     * @return The miracleRingCd.
     */
    @java.lang.Override
    public int getMiracleRingCd() {
      return miracleRingCd_;
    }

    public static final int UNK3300_POIAEGJNEKP_FIELD_NUMBER = 8;
    private int unk3300POIAEGJNEKP_;
    /**
     * <code>uint32 Unk3300_POIAEGJNEKP = 8;</code>
     * @return The unk3300POIAEGJNEKP.
     */
    @java.lang.Override
    public int getUnk3300POIAEGJNEKP() {
      return unk3300POIAEGJNEKP_;
    }

    public static final int LAST_TAKE_REWARD_TIME_FIELD_NUMBER = 12;
    private int lastTakeRewardTime_;
    /**
     * <code>uint32 last_take_reward_time = 12;</code>
     * @return The lastTakeRewardTime.
     */
    @java.lang.Override
    public int getLastTakeRewardTime() {
      return lastTakeRewardTime_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(7, gadgetEntityId_);
      }
      if (unk3300POIAEGJNEKP_ != 0) {
        output.writeUInt32(8, unk3300POIAEGJNEKP_);
      }
      if (miracleRingCd_ != 0) {
        output.writeUInt32(9, miracleRingCd_);
      }
      if (lastTakeRewardTime_ != 0) {
        output.writeUInt32(12, lastTakeRewardTime_);
      }
      if (isGadgetCreated_ != false) {
        output.writeBool(15, isGadgetCreated_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gadgetEntityId_);
      }
      if (unk3300POIAEGJNEKP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300POIAEGJNEKP_);
      }
      if (miracleRingCd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, miracleRingCd_);
      }
      if (lastTakeRewardTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, lastTakeRewardTime_);
      }
      if (isGadgetCreated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isGadgetCreated_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify other = (emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify) obj;

      if (getIsGadgetCreated()
          != other.getIsGadgetCreated()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getMiracleRingCd()
          != other.getMiracleRingCd()) return false;
      if (getUnk3300POIAEGJNEKP()
          != other.getUnk3300POIAEGJNEKP()) return false;
      if (getLastTakeRewardTime()
          != other.getLastTakeRewardTime()) return false;
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
      hash = (37 * hash) + IS_GADGET_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGadgetCreated());
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + MIRACLE_RING_CD_FIELD_NUMBER;
      hash = (53 * hash) + getMiracleRingCd();
      hash = (37 * hash) + UNK3300_POIAEGJNEKP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300POIAEGJNEKP();
      hash = (37 * hash) + LAST_TAKE_REWARD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastTakeRewardTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify prototype) {
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
     *   CMD_ID = 5222;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code MiracleRingDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MiracleRingDataNotify)
        emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.class, emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.newBuilder()
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
        isGadgetCreated_ = false;

        gadgetEntityId_ = 0;

        miracleRingCd_ = 0;

        unk3300POIAEGJNEKP_ = 0;

        lastTakeRewardTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.internal_static_MiracleRingDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify build() {
        emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify buildPartial() {
        emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify result = new emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify(this);
        result.isGadgetCreated_ = isGadgetCreated_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.miracleRingCd_ = miracleRingCd_;
        result.unk3300POIAEGJNEKP_ = unk3300POIAEGJNEKP_;
        result.lastTakeRewardTime_ = lastTakeRewardTime_;
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
        if (other instanceof emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify other) {
        if (other == emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify.getDefaultInstance()) return this;
        if (other.getIsGadgetCreated() != false) {
          setIsGadgetCreated(other.getIsGadgetCreated());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getMiracleRingCd() != 0) {
          setMiracleRingCd(other.getMiracleRingCd());
        }
        if (other.getUnk3300POIAEGJNEKP() != 0) {
          setUnk3300POIAEGJNEKP(other.getUnk3300POIAEGJNEKP());
        }
        if (other.getLastTakeRewardTime() != 0) {
          setLastTakeRewardTime(other.getLastTakeRewardTime());
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
        emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isGadgetCreated_ ;
      /**
       * <code>bool is_gadget_created = 15;</code>
       * @return The isGadgetCreated.
       */
      @java.lang.Override
      public boolean getIsGadgetCreated() {
        return isGadgetCreated_;
      }
      /**
       * <code>bool is_gadget_created = 15;</code>
       * @param value The isGadgetCreated to set.
       * @return This builder for chaining.
       */
      public Builder setIsGadgetCreated(boolean value) {
        
        isGadgetCreated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_gadget_created = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGadgetCreated() {
        
        isGadgetCreated_ = false;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int miracleRingCd_ ;
      /**
       * <code>uint32 miracle_ring_cd = 9;</code>
       * @return The miracleRingCd.
       */
      @java.lang.Override
      public int getMiracleRingCd() {
        return miracleRingCd_;
      }
      /**
       * <code>uint32 miracle_ring_cd = 9;</code>
       * @param value The miracleRingCd to set.
       * @return This builder for chaining.
       */
      public Builder setMiracleRingCd(int value) {
        
        miracleRingCd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 miracle_ring_cd = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMiracleRingCd() {
        
        miracleRingCd_ = 0;
        onChanged();
        return this;
      }

      private int unk3300POIAEGJNEKP_ ;
      /**
       * <code>uint32 Unk3300_POIAEGJNEKP = 8;</code>
       * @return The unk3300POIAEGJNEKP.
       */
      @java.lang.Override
      public int getUnk3300POIAEGJNEKP() {
        return unk3300POIAEGJNEKP_;
      }
      /**
       * <code>uint32 Unk3300_POIAEGJNEKP = 8;</code>
       * @param value The unk3300POIAEGJNEKP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300POIAEGJNEKP(int value) {
        
        unk3300POIAEGJNEKP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_POIAEGJNEKP = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300POIAEGJNEKP() {
        
        unk3300POIAEGJNEKP_ = 0;
        onChanged();
        return this;
      }

      private int lastTakeRewardTime_ ;
      /**
       * <code>uint32 last_take_reward_time = 12;</code>
       * @return The lastTakeRewardTime.
       */
      @java.lang.Override
      public int getLastTakeRewardTime() {
        return lastTakeRewardTime_;
      }
      /**
       * <code>uint32 last_take_reward_time = 12;</code>
       * @param value The lastTakeRewardTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastTakeRewardTime(int value) {
        
        lastTakeRewardTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_take_reward_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastTakeRewardTime() {
        
        lastTakeRewardTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MiracleRingDataNotify)
    }

    // @@protoc_insertion_point(class_scope:MiracleRingDataNotify)
    private static final emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify();
    }

    public static emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiracleRingDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<MiracleRingDataNotify>() {
      @java.lang.Override
      public MiracleRingDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MiracleRingDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MiracleRingDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiracleRingDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MiracleRingDataNotifyOuterClass.MiracleRingDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MiracleRingDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MiracleRingDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MiracleRingDataNotify.proto\"\241\001\n\025Miracl" +
      "eRingDataNotify\022\031\n\021is_gadget_created\030\017 \001" +
      "(\010\022\030\n\020gadget_entity_id\030\007 \001(\r\022\027\n\017miracle_" +
      "ring_cd\030\t \001(\r\022\033\n\023Unk3300_POIAEGJNEKP\030\010 \001" +
      "(\r\022\035\n\025last_take_reward_time\030\014 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MiracleRingDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MiracleRingDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MiracleRingDataNotify_descriptor,
        new java.lang.String[] { "IsGadgetCreated", "GadgetEntityId", "MiracleRingCd", "Unk3300POIAEGJNEKP", "LastTakeRewardTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
