// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldRoutineTypeInfo.proto

package emu.grasscutter.net.proto;

public final class WorldRoutineTypeInfoOuterClass {
  private WorldRoutineTypeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldRoutineTypeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldRoutineTypeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 next_refresh_time = 13;</code>
     * @return The nextRefreshTime.
     */
    int getNextRefreshTime();

    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo> 
        getWorldRoutineInfoListList();
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getWorldRoutineInfoList(int index);
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    int getWorldRoutineInfoListCount();
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> 
        getWorldRoutineInfoListOrBuilderList();
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder getWorldRoutineInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 routine_type = 2;</code>
     * @return The routineType.
     */
    int getRoutineType();
  }
  /**
   * Protobuf type {@code WorldRoutineTypeInfo}
   */
  public static final class WorldRoutineTypeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldRoutineTypeInfo)
      WorldRoutineTypeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldRoutineTypeInfo.newBuilder() to construct.
    private WorldRoutineTypeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldRoutineTypeInfo() {
      worldRoutineInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldRoutineTypeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldRoutineTypeInfo(
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
            case 16: {

              routineType_ = input.readUInt32();
              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                worldRoutineInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              worldRoutineInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.parser(), extensionRegistry));
              break;
            }
            case 104: {

              nextRefreshTime_ = input.readUInt32();
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
          worldRoutineInfoList_ = java.util.Collections.unmodifiableList(worldRoutineInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.internal_static_WorldRoutineTypeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.internal_static_WorldRoutineTypeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.class, emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder.class);
    }

    public static final int NEXT_REFRESH_TIME_FIELD_NUMBER = 13;
    private int nextRefreshTime_;
    /**
     * <code>uint32 next_refresh_time = 13;</code>
     * @return The nextRefreshTime.
     */
    @java.lang.Override
    public int getNextRefreshTime() {
      return nextRefreshTime_;
    }

    public static final int WORLD_ROUTINE_INFO_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo> worldRoutineInfoList_;
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo> getWorldRoutineInfoListList() {
      return worldRoutineInfoList_;
    }
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> 
        getWorldRoutineInfoListOrBuilderList() {
      return worldRoutineInfoList_;
    }
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    @java.lang.Override
    public int getWorldRoutineInfoListCount() {
      return worldRoutineInfoList_.size();
    }
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getWorldRoutineInfoList(int index) {
      return worldRoutineInfoList_.get(index);
    }
    /**
     * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder getWorldRoutineInfoListOrBuilder(
        int index) {
      return worldRoutineInfoList_.get(index);
    }

    public static final int ROUTINE_TYPE_FIELD_NUMBER = 2;
    private int routineType_;
    /**
     * <code>uint32 routine_type = 2;</code>
     * @return The routineType.
     */
    @java.lang.Override
    public int getRoutineType() {
      return routineType_;
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
      if (routineType_ != 0) {
        output.writeUInt32(2, routineType_);
      }
      for (int i = 0; i < worldRoutineInfoList_.size(); i++) {
        output.writeMessage(10, worldRoutineInfoList_.get(i));
      }
      if (nextRefreshTime_ != 0) {
        output.writeUInt32(13, nextRefreshTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (routineType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, routineType_);
      }
      for (int i = 0; i < worldRoutineInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, worldRoutineInfoList_.get(i));
      }
      if (nextRefreshTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, nextRefreshTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo other = (emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo) obj;

      if (getNextRefreshTime()
          != other.getNextRefreshTime()) return false;
      if (!getWorldRoutineInfoListList()
          .equals(other.getWorldRoutineInfoListList())) return false;
      if (getRoutineType()
          != other.getRoutineType()) return false;
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
      hash = (37 * hash) + NEXT_REFRESH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getNextRefreshTime();
      if (getWorldRoutineInfoListCount() > 0) {
        hash = (37 * hash) + WORLD_ROUTINE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWorldRoutineInfoListList().hashCode();
      }
      hash = (37 * hash) + ROUTINE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRoutineType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo prototype) {
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
     * Protobuf type {@code WorldRoutineTypeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldRoutineTypeInfo)
        emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.internal_static_WorldRoutineTypeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.internal_static_WorldRoutineTypeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.class, emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.newBuilder()
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
          getWorldRoutineInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        nextRefreshTime_ = 0;

        if (worldRoutineInfoListBuilder_ == null) {
          worldRoutineInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          worldRoutineInfoListBuilder_.clear();
        }
        routineType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.internal_static_WorldRoutineTypeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo build() {
        emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo buildPartial() {
        emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo result = new emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo(this);
        int from_bitField0_ = bitField0_;
        result.nextRefreshTime_ = nextRefreshTime_;
        if (worldRoutineInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            worldRoutineInfoList_ = java.util.Collections.unmodifiableList(worldRoutineInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.worldRoutineInfoList_ = worldRoutineInfoList_;
        } else {
          result.worldRoutineInfoList_ = worldRoutineInfoListBuilder_.build();
        }
        result.routineType_ = routineType_;
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
        if (other instanceof emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo other) {
        if (other == emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.getDefaultInstance()) return this;
        if (other.getNextRefreshTime() != 0) {
          setNextRefreshTime(other.getNextRefreshTime());
        }
        if (worldRoutineInfoListBuilder_ == null) {
          if (!other.worldRoutineInfoList_.isEmpty()) {
            if (worldRoutineInfoList_.isEmpty()) {
              worldRoutineInfoList_ = other.worldRoutineInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWorldRoutineInfoListIsMutable();
              worldRoutineInfoList_.addAll(other.worldRoutineInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.worldRoutineInfoList_.isEmpty()) {
            if (worldRoutineInfoListBuilder_.isEmpty()) {
              worldRoutineInfoListBuilder_.dispose();
              worldRoutineInfoListBuilder_ = null;
              worldRoutineInfoList_ = other.worldRoutineInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              worldRoutineInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWorldRoutineInfoListFieldBuilder() : null;
            } else {
              worldRoutineInfoListBuilder_.addAllMessages(other.worldRoutineInfoList_);
            }
          }
        }
        if (other.getRoutineType() != 0) {
          setRoutineType(other.getRoutineType());
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
        emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int nextRefreshTime_ ;
      /**
       * <code>uint32 next_refresh_time = 13;</code>
       * @return The nextRefreshTime.
       */
      @java.lang.Override
      public int getNextRefreshTime() {
        return nextRefreshTime_;
      }
      /**
       * <code>uint32 next_refresh_time = 13;</code>
       * @param value The nextRefreshTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextRefreshTime(int value) {
        
        nextRefreshTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 next_refresh_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextRefreshTime() {
        
        nextRefreshTime_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo> worldRoutineInfoList_ =
        java.util.Collections.emptyList();
      private void ensureWorldRoutineInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          worldRoutineInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo>(worldRoutineInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> worldRoutineInfoListBuilder_;

      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo> getWorldRoutineInfoListList() {
        if (worldRoutineInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(worldRoutineInfoList_);
        } else {
          return worldRoutineInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public int getWorldRoutineInfoListCount() {
        if (worldRoutineInfoListBuilder_ == null) {
          return worldRoutineInfoList_.size();
        } else {
          return worldRoutineInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo getWorldRoutineInfoList(int index) {
        if (worldRoutineInfoListBuilder_ == null) {
          return worldRoutineInfoList_.get(index);
        } else {
          return worldRoutineInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder setWorldRoutineInfoList(
          int index, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo value) {
        if (worldRoutineInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.set(index, value);
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder setWorldRoutineInfoList(
          int index, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder builderForValue) {
        if (worldRoutineInfoListBuilder_ == null) {
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder addWorldRoutineInfoList(emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo value) {
        if (worldRoutineInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.add(value);
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder addWorldRoutineInfoList(
          int index, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo value) {
        if (worldRoutineInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.add(index, value);
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder addWorldRoutineInfoList(
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder builderForValue) {
        if (worldRoutineInfoListBuilder_ == null) {
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder addWorldRoutineInfoList(
          int index, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder builderForValue) {
        if (worldRoutineInfoListBuilder_ == null) {
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder addAllWorldRoutineInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo> values) {
        if (worldRoutineInfoListBuilder_ == null) {
          ensureWorldRoutineInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, worldRoutineInfoList_);
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder clearWorldRoutineInfoList() {
        if (worldRoutineInfoListBuilder_ == null) {
          worldRoutineInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public Builder removeWorldRoutineInfoList(int index) {
        if (worldRoutineInfoListBuilder_ == null) {
          ensureWorldRoutineInfoListIsMutable();
          worldRoutineInfoList_.remove(index);
          onChanged();
        } else {
          worldRoutineInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder getWorldRoutineInfoListBuilder(
          int index) {
        return getWorldRoutineInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder getWorldRoutineInfoListOrBuilder(
          int index) {
        if (worldRoutineInfoListBuilder_ == null) {
          return worldRoutineInfoList_.get(index);  } else {
          return worldRoutineInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> 
           getWorldRoutineInfoListOrBuilderList() {
        if (worldRoutineInfoListBuilder_ != null) {
          return worldRoutineInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(worldRoutineInfoList_);
        }
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder addWorldRoutineInfoListBuilder() {
        return getWorldRoutineInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder addWorldRoutineInfoListBuilder(
          int index) {
        return getWorldRoutineInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WorldRoutineInfo world_routine_info_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder> 
           getWorldRoutineInfoListBuilderList() {
        return getWorldRoutineInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder> 
          getWorldRoutineInfoListFieldBuilder() {
        if (worldRoutineInfoListBuilder_ == null) {
          worldRoutineInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder, emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder>(
                  worldRoutineInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          worldRoutineInfoList_ = null;
        }
        return worldRoutineInfoListBuilder_;
      }

      private int routineType_ ;
      /**
       * <code>uint32 routine_type = 2;</code>
       * @return The routineType.
       */
      @java.lang.Override
      public int getRoutineType() {
        return routineType_;
      }
      /**
       * <code>uint32 routine_type = 2;</code>
       * @param value The routineType to set.
       * @return This builder for chaining.
       */
      public Builder setRoutineType(int value) {
        
        routineType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 routine_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoutineType() {
        
        routineType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WorldRoutineTypeInfo)
    }

    // @@protoc_insertion_point(class_scope:WorldRoutineTypeInfo)
    private static final emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo();
    }

    public static emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldRoutineTypeInfo>
        PARSER = new com.google.protobuf.AbstractParser<WorldRoutineTypeInfo>() {
      @java.lang.Override
      public WorldRoutineTypeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldRoutineTypeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldRoutineTypeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldRoutineTypeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldRoutineTypeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldRoutineTypeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032WorldRoutineTypeInfo.proto\032\026WorldRouti" +
      "neInfo.proto\"{\n\024WorldRoutineTypeInfo\022\031\n\021" +
      "next_refresh_time\030\r \001(\r\0222\n\027world_routine" +
      "_info_list\030\n \003(\0132\021.WorldRoutineInfo\022\024\n\014r" +
      "outine_type\030\002 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldRoutineTypeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldRoutineTypeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldRoutineTypeInfo_descriptor,
        new java.lang.String[] { "NextRefreshTime", "WorldRoutineInfoList", "RoutineType", });
    emu.grasscutter.net.proto.WorldRoutineInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
