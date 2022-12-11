// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeGetFishFarmingInfoRsp.proto

package emu.grasscutter.net.proto;

public final class HomeGetFishFarmingInfoRspOuterClass {
  private HomeGetFishFarmingInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeGetFishFarmingInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeGetFishFarmingInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> 
        getFishFarmingInfoListList();
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getFishFarmingInfoList(int index);
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    int getFishFarmingInfoListCount();
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
        getFishFarmingInfoListOrBuilderList();
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4567;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeGetFishFarmingInfoRsp}
   */
  public static final class HomeGetFishFarmingInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeGetFishFarmingInfoRsp)
      HomeGetFishFarmingInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeGetFishFarmingInfoRsp.newBuilder() to construct.
    private HomeGetFishFarmingInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeGetFishFarmingInfoRsp() {
      fishFarmingInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeGetFishFarmingInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeGetFishFarmingInfoRsp(
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fishFarmingInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              fishFarmingInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.parser(), extensionRegistry));
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          fishFarmingInfoList_ = java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.internal_static_HomeGetFishFarmingInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.internal_static_HomeGetFishFarmingInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.class, emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int FISH_FARMING_INFO_LIST_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> fishFarmingInfoList_;
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> getFishFarmingInfoListList() {
      return fishFarmingInfoList_;
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
        getFishFarmingInfoListOrBuilderList() {
      return fishFarmingInfoList_;
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    @java.lang.Override
    public int getFishFarmingInfoListCount() {
      return fishFarmingInfoList_.size();
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getFishFarmingInfoList(int index) {
      return fishFarmingInfoList_.get(index);
    }
    /**
     * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
        int index) {
      return fishFarmingInfoList_.get(index);
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
      for (int i = 0; i < fishFarmingInfoList_.size(); i++) {
        output.writeMessage(12, fishFarmingInfoList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fishFarmingInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, fishFarmingInfoList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp other = (emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getFishFarmingInfoListList()
          .equals(other.getFishFarmingInfoListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getFishFarmingInfoListCount() > 0) {
        hash = (37 * hash) + FISH_FARMING_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishFarmingInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp prototype) {
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
     *   CMD_ID = 4567;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeGetFishFarmingInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeGetFishFarmingInfoRsp)
        emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.internal_static_HomeGetFishFarmingInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.internal_static_HomeGetFishFarmingInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.class, emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.newBuilder()
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
          getFishFarmingInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fishFarmingInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.internal_static_HomeGetFishFarmingInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp build() {
        emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp buildPartial() {
        emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp result = new emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (fishFarmingInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fishFarmingInfoList_ = java.util.Collections.unmodifiableList(fishFarmingInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fishFarmingInfoList_ = fishFarmingInfoList_;
        } else {
          result.fishFarmingInfoList_ = fishFarmingInfoListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp other) {
        if (other == emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (fishFarmingInfoListBuilder_ == null) {
          if (!other.fishFarmingInfoList_.isEmpty()) {
            if (fishFarmingInfoList_.isEmpty()) {
              fishFarmingInfoList_ = other.fishFarmingInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFishFarmingInfoListIsMutable();
              fishFarmingInfoList_.addAll(other.fishFarmingInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.fishFarmingInfoList_.isEmpty()) {
            if (fishFarmingInfoListBuilder_.isEmpty()) {
              fishFarmingInfoListBuilder_.dispose();
              fishFarmingInfoListBuilder_ = null;
              fishFarmingInfoList_ = other.fishFarmingInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fishFarmingInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFishFarmingInfoListFieldBuilder() : null;
            } else {
              fishFarmingInfoListBuilder_.addAllMessages(other.fishFarmingInfoList_);
            }
          }
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
        emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> fishFarmingInfoList_ =
        java.util.Collections.emptyList();
      private void ensureFishFarmingInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishFarmingInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo>(fishFarmingInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> fishFarmingInfoListBuilder_;

      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> getFishFarmingInfoListList() {
        if (fishFarmingInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        } else {
          return fishFarmingInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public int getFishFarmingInfoListCount() {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.size();
        } else {
          return fishFarmingInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getFishFarmingInfoList(int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.get(index);
        } else {
          return fishFarmingInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder setFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.set(index, value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder setFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder addFishFarmingInfoList(emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder addFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(index, value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder addFishFarmingInfoList(
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder addFishFarmingInfoList(
          int index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder addAllFishFarmingInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo> values) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fishFarmingInfoList_);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder clearFishFarmingInfoList() {
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public Builder removeFishFarmingInfoList(int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.remove(index);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder getFishFarmingInfoListBuilder(
          int index) {
        return getFishFarmingInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
          int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.get(index);  } else {
          return fishFarmingInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
           getFishFarmingInfoListOrBuilderList() {
        if (fishFarmingInfoListBuilder_ != null) {
          return fishFarmingInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        }
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder addFishFarmingInfoListBuilder() {
        return getFishFarmingInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder addFishFarmingInfoListBuilder(
          int index) {
        return getFishFarmingInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeFishFarmingInfo fish_farming_info_list = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder> 
           getFishFarmingInfoListBuilderList() {
        return getFishFarmingInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder> 
          getFishFarmingInfoListFieldBuilder() {
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder, emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder>(
                  fishFarmingInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fishFarmingInfoList_ = null;
        }
        return fishFarmingInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeGetFishFarmingInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeGetFishFarmingInfoRsp)
    private static final emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp();
    }

    public static emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeGetFishFarmingInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeGetFishFarmingInfoRsp>() {
      @java.lang.Override
      public HomeGetFishFarmingInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeGetFishFarmingInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeGetFishFarmingInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeGetFishFarmingInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGetFishFarmingInfoRspOuterClass.HomeGetFishFarmingInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeGetFishFarmingInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeGetFishFarmingInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeGetFishFarmingInfoRsp.proto\032\031HomeF" +
      "ishFarmingInfo.proto\"b\n\031HomeGetFishFarmi" +
      "ngInfoRsp\022\017\n\007retcode\030\017 \001(\005\0224\n\026fish_farmi" +
      "ng_info_list\030\014 \003(\0132\024.HomeFishFarmingInfo" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeGetFishFarmingInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeGetFishFarmingInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeGetFishFarmingInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "FishFarmingInfoList", });
    emu.grasscutter.net.proto.HomeFishFarmingInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
