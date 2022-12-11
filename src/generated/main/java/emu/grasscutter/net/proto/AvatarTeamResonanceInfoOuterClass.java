// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarTeamResonanceInfo.proto

package emu.grasscutter.net.proto;

public final class AvatarTeamResonanceInfoOuterClass {
  private AvatarTeamResonanceInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarTeamResonanceInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarTeamResonanceInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 9;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
     * @return A list containing the unk3300MBJEEEEEJCE.
     */
    java.util.List<java.lang.Integer> getUnk3300MBJEEEEEJCEList();
    /**
     * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
     * @return The count of unk3300MBJEEEEEJCE.
     */
    int getUnk3300MBJEEEEEJCECount();
    /**
     * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
     * @param index The index of the element to return.
     * @return The unk3300MBJEEEEEJCE at the given index.
     */
    int getUnk3300MBJEEEEEJCE(int index);

    /**
     * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
     * @return A list containing the unk3300LPAKGGBBDNJ.
     */
    java.util.List<java.lang.Integer> getUnk3300LPAKGGBBDNJList();
    /**
     * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
     * @return The count of unk3300LPAKGGBBDNJ.
     */
    int getUnk3300LPAKGGBBDNJCount();
    /**
     * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
     * @param index The index of the element to return.
     * @return The unk3300LPAKGGBBDNJ at the given index.
     */
    int getUnk3300LPAKGGBBDNJ(int index);
  }
  /**
   * Protobuf type {@code AvatarTeamResonanceInfo}
   */
  public static final class AvatarTeamResonanceInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarTeamResonanceInfo)
      AvatarTeamResonanceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarTeamResonanceInfo.newBuilder() to construct.
    private AvatarTeamResonanceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarTeamResonanceInfo() {
      unk3300MBJEEEEEJCE_ = emptyIntList();
      unk3300LPAKGGBBDNJ_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarTeamResonanceInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarTeamResonanceInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 64: {

              entityId_ = input.readUInt32();
              break;
            }
            case 72: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                unk3300LPAKGGBBDNJ_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              unk3300LPAKGGBBDNJ_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                unk3300LPAKGGBBDNJ_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3300LPAKGGBBDNJ_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3300MBJEEEEEJCE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3300MBJEEEEEJCE_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unk3300MBJEEEEEJCE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unk3300MBJEEEEEJCE_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          unk3300LPAKGGBBDNJ_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk3300MBJEEEEEJCE_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.class, emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 9;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 9;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 8;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int UNK3300_MBJEEEEEJCE_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList unk3300MBJEEEEEJCE_;
    /**
     * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
     * @return A list containing the unk3300MBJEEEEEJCE.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300MBJEEEEEJCEList() {
      return unk3300MBJEEEEEJCE_;
    }
    /**
     * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
     * @return The count of unk3300MBJEEEEEJCE.
     */
    public int getUnk3300MBJEEEEEJCECount() {
      return unk3300MBJEEEEEJCE_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
     * @param index The index of the element to return.
     * @return The unk3300MBJEEEEEJCE at the given index.
     */
    public int getUnk3300MBJEEEEEJCE(int index) {
      return unk3300MBJEEEEEJCE_.getInt(index);
    }
    private int unk3300MBJEEEEEJCEMemoizedSerializedSize = -1;

    public static final int UNK3300_LPAKGGBBDNJ_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList unk3300LPAKGGBBDNJ_;
    /**
     * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
     * @return A list containing the unk3300LPAKGGBBDNJ.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3300LPAKGGBBDNJList() {
      return unk3300LPAKGGBBDNJ_;
    }
    /**
     * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
     * @return The count of unk3300LPAKGGBBDNJ.
     */
    public int getUnk3300LPAKGGBBDNJCount() {
      return unk3300LPAKGGBBDNJ_.size();
    }
    /**
     * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
     * @param index The index of the element to return.
     * @return The unk3300LPAKGGBBDNJ at the given index.
     */
    public int getUnk3300LPAKGGBBDNJ(int index) {
      return unk3300LPAKGGBBDNJ_.getInt(index);
    }
    private int unk3300LPAKGGBBDNJMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (entityId_ != 0) {
        output.writeUInt32(8, entityId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(9, avatarGuid_);
      }
      if (getUnk3300LPAKGGBBDNJList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(unk3300LPAKGGBBDNJMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300LPAKGGBBDNJ_.size(); i++) {
        output.writeUInt32NoTag(unk3300LPAKGGBBDNJ_.getInt(i));
      }
      if (getUnk3300MBJEEEEEJCEList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(unk3300MBJEEEEEJCEMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3300MBJEEEEEJCE_.size(); i++) {
        output.writeUInt32NoTag(unk3300MBJEEEEEJCE_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, entityId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, avatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300LPAKGGBBDNJ_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300LPAKGGBBDNJ_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300LPAKGGBBDNJList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300LPAKGGBBDNJMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3300MBJEEEEEJCE_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3300MBJEEEEEJCE_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3300MBJEEEEEJCEList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3300MBJEEEEEJCEMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo other = (emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (!getUnk3300MBJEEEEEJCEList()
          .equals(other.getUnk3300MBJEEEEEJCEList())) return false;
      if (!getUnk3300LPAKGGBBDNJList()
          .equals(other.getUnk3300LPAKGGBBDNJList())) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (getUnk3300MBJEEEEEJCECount() > 0) {
        hash = (37 * hash) + UNK3300_MBJEEEEEJCE_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300MBJEEEEEJCEList().hashCode();
      }
      if (getUnk3300LPAKGGBBDNJCount() > 0) {
        hash = (37 * hash) + UNK3300_LPAKGGBBDNJ_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3300LPAKGGBBDNJList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo prototype) {
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
     * Protobuf type {@code AvatarTeamResonanceInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarTeamResonanceInfo)
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.class, emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.newBuilder()
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
        avatarGuid_ = 0L;

        entityId_ = 0;

        unk3300MBJEEEEEJCE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300LPAKGGBBDNJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.internal_static_AvatarTeamResonanceInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo build() {
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo buildPartial() {
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo result = new emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo(this);
        int from_bitField0_ = bitField0_;
        result.avatarGuid_ = avatarGuid_;
        result.entityId_ = entityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3300MBJEEEEEJCE_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3300MBJEEEEEJCE_ = unk3300MBJEEEEEJCE_;
        if (((bitField0_ & 0x00000002) != 0)) {
          unk3300LPAKGGBBDNJ_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.unk3300LPAKGGBBDNJ_ = unk3300LPAKGGBBDNJ_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo other) {
        if (other == emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (!other.unk3300MBJEEEEEJCE_.isEmpty()) {
          if (unk3300MBJEEEEEJCE_.isEmpty()) {
            unk3300MBJEEEEEJCE_ = other.unk3300MBJEEEEEJCE_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3300MBJEEEEEJCEIsMutable();
            unk3300MBJEEEEEJCE_.addAll(other.unk3300MBJEEEEEJCE_);
          }
          onChanged();
        }
        if (!other.unk3300LPAKGGBBDNJ_.isEmpty()) {
          if (unk3300LPAKGGBBDNJ_.isEmpty()) {
            unk3300LPAKGGBBDNJ_ = other.unk3300LPAKGGBBDNJ_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUnk3300LPAKGGBBDNJIsMutable();
            unk3300LPAKGGBBDNJ_.addAll(other.unk3300LPAKGGBBDNJ_);
          }
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
        emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 9;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 9;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300MBJEEEEEJCE_ = emptyIntList();
      private void ensureUnk3300MBJEEEEEJCEIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3300MBJEEEEEJCE_ = mutableCopy(unk3300MBJEEEEEJCE_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @return A list containing the unk3300MBJEEEEEJCE.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300MBJEEEEEJCEList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300MBJEEEEEJCE_) : unk3300MBJEEEEEJCE_;
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @return The count of unk3300MBJEEEEEJCE.
       */
      public int getUnk3300MBJEEEEEJCECount() {
        return unk3300MBJEEEEEJCE_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @param index The index of the element to return.
       * @return The unk3300MBJEEEEEJCE at the given index.
       */
      public int getUnk3300MBJEEEEEJCE(int index) {
        return unk3300MBJEEEEEJCE_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @param index The index to set the value at.
       * @param value The unk3300MBJEEEEEJCE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MBJEEEEEJCE(
          int index, int value) {
        ensureUnk3300MBJEEEEEJCEIsMutable();
        unk3300MBJEEEEEJCE_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @param value The unk3300MBJEEEEEJCE to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300MBJEEEEEJCE(int value) {
        ensureUnk3300MBJEEEEEJCEIsMutable();
        unk3300MBJEEEEEJCE_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @param values The unk3300MBJEEEEEJCE to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300MBJEEEEEJCE(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300MBJEEEEEJCEIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300MBJEEEEEJCE_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_MBJEEEEEJCE = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MBJEEEEEJCE() {
        unk3300MBJEEEEEJCE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3300LPAKGGBBDNJ_ = emptyIntList();
      private void ensureUnk3300LPAKGGBBDNJIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          unk3300LPAKGGBBDNJ_ = mutableCopy(unk3300LPAKGGBBDNJ_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @return A list containing the unk3300LPAKGGBBDNJ.
       */
      public java.util.List<java.lang.Integer>
          getUnk3300LPAKGGBBDNJList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(unk3300LPAKGGBBDNJ_) : unk3300LPAKGGBBDNJ_;
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @return The count of unk3300LPAKGGBBDNJ.
       */
      public int getUnk3300LPAKGGBBDNJCount() {
        return unk3300LPAKGGBBDNJ_.size();
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @param index The index of the element to return.
       * @return The unk3300LPAKGGBBDNJ at the given index.
       */
      public int getUnk3300LPAKGGBBDNJ(int index) {
        return unk3300LPAKGGBBDNJ_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @param index The index to set the value at.
       * @param value The unk3300LPAKGGBBDNJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LPAKGGBBDNJ(
          int index, int value) {
        ensureUnk3300LPAKGGBBDNJIsMutable();
        unk3300LPAKGGBBDNJ_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @param value The unk3300LPAKGGBBDNJ to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3300LPAKGGBBDNJ(int value) {
        ensureUnk3300LPAKGGBBDNJIsMutable();
        unk3300LPAKGGBBDNJ_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @param values The unk3300LPAKGGBBDNJ to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3300LPAKGGBBDNJ(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3300LPAKGGBBDNJIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3300LPAKGGBBDNJ_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3300_LPAKGGBBDNJ = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LPAKGGBBDNJ() {
        unk3300LPAKGGBBDNJ_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:AvatarTeamResonanceInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarTeamResonanceInfo)
    private static final emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo();
    }

    public static emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarTeamResonanceInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarTeamResonanceInfo>() {
      @java.lang.Override
      public AvatarTeamResonanceInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarTeamResonanceInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarTeamResonanceInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarTeamResonanceInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarTeamResonanceInfoOuterClass.AvatarTeamResonanceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarTeamResonanceInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarTeamResonanceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarTeamResonanceInfo.proto\"{\n\027Avata" +
      "rTeamResonanceInfo\022\023\n\013avatar_guid\030\t \001(\004\022" +
      "\021\n\tentity_id\030\010 \001(\r\022\033\n\023Unk3300_MBJEEEEEJC" +
      "E\030\017 \003(\r\022\033\n\023Unk3300_LPAKGGBBDNJ\030\r \003(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarTeamResonanceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarTeamResonanceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarTeamResonanceInfo_descriptor,
        new java.lang.String[] { "AvatarGuid", "EntityId", "Unk3300MBJEEEEEJCE", "Unk3300LPAKGGBBDNJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}