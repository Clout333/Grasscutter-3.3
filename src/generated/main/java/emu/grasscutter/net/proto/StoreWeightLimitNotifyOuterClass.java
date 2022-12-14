// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreWeightLimitNotify.proto

package emu.grasscutter.net.proto;

public final class StoreWeightLimitNotifyOuterClass {
  private StoreWeightLimitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StoreWeightLimitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StoreWeightLimitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reliquary_count_limit = 14;</code>
     * @return The reliquaryCountLimit.
     */
    int getReliquaryCountLimit();

    /**
     * <code>uint32 Unk3300_NIKMCBLHFNJ = 10;</code>
     * @return The unk3300NIKMCBLHFNJ.
     */
    int getUnk3300NIKMCBLHFNJ();

    /**
     * <code>uint32 Unk3300_OONMFCGDMMF = 5;</code>
     * @return The unk3300OONMFCGDMMF.
     */
    int getUnk3300OONMFCGDMMF();

    /**
     * <code>uint32 Unk3300_JGPODDEKAPB = 1;</code>
     * @return The unk3300JGPODDEKAPB.
     */
    int getUnk3300JGPODDEKAPB();

    /**
     * <code>uint32 weight_limit = 8;</code>
     * @return The weightLimit.
     */
    int getWeightLimit();

    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The storeType.
     */
    emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 630;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code StoreWeightLimitNotify}
   */
  public static final class StoreWeightLimitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StoreWeightLimitNotify)
      StoreWeightLimitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StoreWeightLimitNotify.newBuilder() to construct.
    private StoreWeightLimitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StoreWeightLimitNotify() {
      storeType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StoreWeightLimitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StoreWeightLimitNotify(
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

              unk3300JGPODDEKAPB_ = input.readUInt32();
              break;
            }
            case 40: {

              unk3300OONMFCGDMMF_ = input.readUInt32();
              break;
            }
            case 64: {

              weightLimit_ = input.readUInt32();
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              storeType_ = rawValue;
              break;
            }
            case 80: {

              unk3300NIKMCBLHFNJ_ = input.readUInt32();
              break;
            }
            case 112: {

              reliquaryCountLimit_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.class, emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.Builder.class);
    }

    public static final int RELIQUARY_COUNT_LIMIT_FIELD_NUMBER = 14;
    private int reliquaryCountLimit_;
    /**
     * <code>uint32 reliquary_count_limit = 14;</code>
     * @return The reliquaryCountLimit.
     */
    @java.lang.Override
    public int getReliquaryCountLimit() {
      return reliquaryCountLimit_;
    }

    public static final int UNK3300_NIKMCBLHFNJ_FIELD_NUMBER = 10;
    private int unk3300NIKMCBLHFNJ_;
    /**
     * <code>uint32 Unk3300_NIKMCBLHFNJ = 10;</code>
     * @return The unk3300NIKMCBLHFNJ.
     */
    @java.lang.Override
    public int getUnk3300NIKMCBLHFNJ() {
      return unk3300NIKMCBLHFNJ_;
    }

    public static final int UNK3300_OONMFCGDMMF_FIELD_NUMBER = 5;
    private int unk3300OONMFCGDMMF_;
    /**
     * <code>uint32 Unk3300_OONMFCGDMMF = 5;</code>
     * @return The unk3300OONMFCGDMMF.
     */
    @java.lang.Override
    public int getUnk3300OONMFCGDMMF() {
      return unk3300OONMFCGDMMF_;
    }

    public static final int UNK3300_JGPODDEKAPB_FIELD_NUMBER = 1;
    private int unk3300JGPODDEKAPB_;
    /**
     * <code>uint32 Unk3300_JGPODDEKAPB = 1;</code>
     * @return The unk3300JGPODDEKAPB.
     */
    @java.lang.Override
    public int getUnk3300JGPODDEKAPB() {
      return unk3300JGPODDEKAPB_;
    }

    public static final int WEIGHT_LIMIT_FIELD_NUMBER = 8;
    private int weightLimit_;
    /**
     * <code>uint32 weight_limit = 8;</code>
     * @return The weightLimit.
     */
    @java.lang.Override
    public int getWeightLimit() {
      return weightLimit_;
    }

    public static final int STORE_TYPE_FIELD_NUMBER = 9;
    private int storeType_;
    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
      return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
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
      if (unk3300JGPODDEKAPB_ != 0) {
        output.writeUInt32(1, unk3300JGPODDEKAPB_);
      }
      if (unk3300OONMFCGDMMF_ != 0) {
        output.writeUInt32(5, unk3300OONMFCGDMMF_);
      }
      if (weightLimit_ != 0) {
        output.writeUInt32(8, weightLimit_);
      }
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        output.writeEnum(9, storeType_);
      }
      if (unk3300NIKMCBLHFNJ_ != 0) {
        output.writeUInt32(10, unk3300NIKMCBLHFNJ_);
      }
      if (reliquaryCountLimit_ != 0) {
        output.writeUInt32(14, reliquaryCountLimit_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300JGPODDEKAPB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300JGPODDEKAPB_);
      }
      if (unk3300OONMFCGDMMF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300OONMFCGDMMF_);
      }
      if (weightLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, weightLimit_);
      }
      if (storeType_ != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, storeType_);
      }
      if (unk3300NIKMCBLHFNJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300NIKMCBLHFNJ_);
      }
      if (reliquaryCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, reliquaryCountLimit_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify other = (emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) obj;

      if (getReliquaryCountLimit()
          != other.getReliquaryCountLimit()) return false;
      if (getUnk3300NIKMCBLHFNJ()
          != other.getUnk3300NIKMCBLHFNJ()) return false;
      if (getUnk3300OONMFCGDMMF()
          != other.getUnk3300OONMFCGDMMF()) return false;
      if (getUnk3300JGPODDEKAPB()
          != other.getUnk3300JGPODDEKAPB()) return false;
      if (getWeightLimit()
          != other.getWeightLimit()) return false;
      if (storeType_ != other.storeType_) return false;
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
      hash = (37 * hash) + RELIQUARY_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getReliquaryCountLimit();
      hash = (37 * hash) + UNK3300_NIKMCBLHFNJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NIKMCBLHFNJ();
      hash = (37 * hash) + UNK3300_OONMFCGDMMF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300OONMFCGDMMF();
      hash = (37 * hash) + UNK3300_JGPODDEKAPB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JGPODDEKAPB();
      hash = (37 * hash) + WEIGHT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeightLimit();
      hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify prototype) {
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
     *   CMD_ID = 630;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code StoreWeightLimitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StoreWeightLimitNotify)
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.class, emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.newBuilder()
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
        reliquaryCountLimit_ = 0;

        unk3300NIKMCBLHFNJ_ = 0;

        unk3300OONMFCGDMMF_ = 0;

        unk3300JGPODDEKAPB_ = 0;

        weightLimit_ = 0;

        storeType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify build() {
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify buildPartial() {
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result = new emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify(this);
        result.reliquaryCountLimit_ = reliquaryCountLimit_;
        result.unk3300NIKMCBLHFNJ_ = unk3300NIKMCBLHFNJ_;
        result.unk3300OONMFCGDMMF_ = unk3300OONMFCGDMMF_;
        result.unk3300JGPODDEKAPB_ = unk3300JGPODDEKAPB_;
        result.weightLimit_ = weightLimit_;
        result.storeType_ = storeType_;
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
        if (other instanceof emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) {
          return mergeFrom((emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify other) {
        if (other == emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.getDefaultInstance()) return this;
        if (other.getReliquaryCountLimit() != 0) {
          setReliquaryCountLimit(other.getReliquaryCountLimit());
        }
        if (other.getUnk3300NIKMCBLHFNJ() != 0) {
          setUnk3300NIKMCBLHFNJ(other.getUnk3300NIKMCBLHFNJ());
        }
        if (other.getUnk3300OONMFCGDMMF() != 0) {
          setUnk3300OONMFCGDMMF(other.getUnk3300OONMFCGDMMF());
        }
        if (other.getUnk3300JGPODDEKAPB() != 0) {
          setUnk3300JGPODDEKAPB(other.getUnk3300JGPODDEKAPB());
        }
        if (other.getWeightLimit() != 0) {
          setWeightLimit(other.getWeightLimit());
        }
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
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
        emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reliquaryCountLimit_ ;
      /**
       * <code>uint32 reliquary_count_limit = 14;</code>
       * @return The reliquaryCountLimit.
       */
      @java.lang.Override
      public int getReliquaryCountLimit() {
        return reliquaryCountLimit_;
      }
      /**
       * <code>uint32 reliquary_count_limit = 14;</code>
       * @param value The reliquaryCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setReliquaryCountLimit(int value) {
        
        reliquaryCountLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliquary_count_limit = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliquaryCountLimit() {
        
        reliquaryCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int unk3300NIKMCBLHFNJ_ ;
      /**
       * <code>uint32 Unk3300_NIKMCBLHFNJ = 10;</code>
       * @return The unk3300NIKMCBLHFNJ.
       */
      @java.lang.Override
      public int getUnk3300NIKMCBLHFNJ() {
        return unk3300NIKMCBLHFNJ_;
      }
      /**
       * <code>uint32 Unk3300_NIKMCBLHFNJ = 10;</code>
       * @param value The unk3300NIKMCBLHFNJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NIKMCBLHFNJ(int value) {
        
        unk3300NIKMCBLHFNJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NIKMCBLHFNJ = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NIKMCBLHFNJ() {
        
        unk3300NIKMCBLHFNJ_ = 0;
        onChanged();
        return this;
      }

      private int unk3300OONMFCGDMMF_ ;
      /**
       * <code>uint32 Unk3300_OONMFCGDMMF = 5;</code>
       * @return The unk3300OONMFCGDMMF.
       */
      @java.lang.Override
      public int getUnk3300OONMFCGDMMF() {
        return unk3300OONMFCGDMMF_;
      }
      /**
       * <code>uint32 Unk3300_OONMFCGDMMF = 5;</code>
       * @param value The unk3300OONMFCGDMMF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300OONMFCGDMMF(int value) {
        
        unk3300OONMFCGDMMF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_OONMFCGDMMF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300OONMFCGDMMF() {
        
        unk3300OONMFCGDMMF_ = 0;
        onChanged();
        return this;
      }

      private int unk3300JGPODDEKAPB_ ;
      /**
       * <code>uint32 Unk3300_JGPODDEKAPB = 1;</code>
       * @return The unk3300JGPODDEKAPB.
       */
      @java.lang.Override
      public int getUnk3300JGPODDEKAPB() {
        return unk3300JGPODDEKAPB_;
      }
      /**
       * <code>uint32 Unk3300_JGPODDEKAPB = 1;</code>
       * @param value The unk3300JGPODDEKAPB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JGPODDEKAPB(int value) {
        
        unk3300JGPODDEKAPB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JGPODDEKAPB = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JGPODDEKAPB() {
        
        unk3300JGPODDEKAPB_ = 0;
        onChanged();
        return this;
      }

      private int weightLimit_ ;
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @return The weightLimit.
       */
      @java.lang.Override
      public int getWeightLimit() {
        return weightLimit_;
      }
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @param value The weightLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeightLimit(int value) {
        
        weightLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeightLimit() {
        
        weightLimit_ = 0;
        onChanged();
        return this;
      }

      private int storeType_ = 0;
      /**
       * <code>.StoreType store_type = 9;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        
        storeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
        return result == null ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        
        storeType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StoreWeightLimitNotify)
    }

    // @@protoc_insertion_point(class_scope:StoreWeightLimitNotify)
    private static final emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify();
    }

    public static emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StoreWeightLimitNotify>
        PARSER = new com.google.protobuf.AbstractParser<StoreWeightLimitNotify>() {
      @java.lang.Override
      public StoreWeightLimitNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StoreWeightLimitNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StoreWeightLimitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StoreWeightLimitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StoreWeightLimitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StoreWeightLimitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034StoreWeightLimitNotify.proto\032\017StoreTyp" +
      "e.proto\"\304\001\n\026StoreWeightLimitNotify\022\035\n\025re" +
      "liquary_count_limit\030\016 \001(\r\022\033\n\023Unk3300_NIK" +
      "MCBLHFNJ\030\n \001(\r\022\033\n\023Unk3300_OONMFCGDMMF\030\005 " +
      "\001(\r\022\033\n\023Unk3300_JGPODDEKAPB\030\001 \001(\r\022\024\n\014weig" +
      "ht_limit\030\010 \001(\r\022\036\n\nstore_type\030\t \001(\0162\n.Sto" +
      "reTypeB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_StoreWeightLimitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StoreWeightLimitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StoreWeightLimitNotify_descriptor,
        new java.lang.String[] { "ReliquaryCountLimit", "Unk3300NIKMCBLHFNJ", "Unk3300OONMFCGDMMF", "Unk3300JGPODDEKAPB", "WeightLimit", "StoreType", });
    emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
