// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriScanEntityRsp.proto

package emu.grasscutter.net.proto;

public final class IrodoriScanEntityRspOuterClass {
  private IrodoriScanEntityRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriScanEntityRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriScanEntityRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
     * @return Whether the themeData field is set.
     */
    boolean hasThemeData();
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
     * @return The themeData.
     */
    emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeData();
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
     */
    emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataOrBuilder();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_get_inspiration = 13;</code>
     * @return The isGetInspiration.
     */
    boolean getIsGetInspiration();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8840;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IrodoriScanEntityRsp}
   */
  public static final class IrodoriScanEntityRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriScanEntityRsp)
      IrodoriScanEntityRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriScanEntityRsp.newBuilder() to construct.
    private IrodoriScanEntityRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriScanEntityRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriScanEntityRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriScanEntityRsp(
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
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder subBuilder = null;
              if (themeData_ != null) {
                subBuilder = themeData_.toBuilder();
              }
              themeData_ = input.readMessage(emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(themeData_);
                themeData_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              isGetInspiration_ = input.readBool();
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
      return emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.internal_static_IrodoriScanEntityRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.internal_static_IrodoriScanEntityRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.class, emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.Builder.class);
    }

    public static final int THEME_DATA_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData themeData_;
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
     * @return Whether the themeData field is set.
     */
    @java.lang.Override
    public boolean hasThemeData() {
      return themeData_ != null;
    }
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
     * @return The themeData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeData() {
      return themeData_ == null ? emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance() : themeData_;
    }
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataOrBuilder() {
      return getThemeData();
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_GET_INSPIRATION_FIELD_NUMBER = 13;
    private boolean isGetInspiration_;
    /**
     * <code>bool is_get_inspiration = 13;</code>
     * @return The isGetInspiration.
     */
    @java.lang.Override
    public boolean getIsGetInspiration() {
      return isGetInspiration_;
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
      if (themeData_ != null) {
        output.writeMessage(1, getThemeData());
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (isGetInspiration_ != false) {
        output.writeBool(13, isGetInspiration_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (themeData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getThemeData());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (isGetInspiration_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isGetInspiration_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp other = (emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp) obj;

      if (hasThemeData() != other.hasThemeData()) return false;
      if (hasThemeData()) {
        if (!getThemeData()
            .equals(other.getThemeData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsGetInspiration()
          != other.getIsGetInspiration()) return false;
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
      if (hasThemeData()) {
        hash = (37 * hash) + THEME_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getThemeData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_GET_INSPIRATION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGetInspiration());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp prototype) {
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
     *   CMD_ID = 8840;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IrodoriScanEntityRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriScanEntityRsp)
        emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.internal_static_IrodoriScanEntityRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.internal_static_IrodoriScanEntityRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.class, emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.newBuilder()
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
        if (themeDataBuilder_ == null) {
          themeData_ = null;
        } else {
          themeData_ = null;
          themeDataBuilder_ = null;
        }
        retcode_ = 0;

        isGetInspiration_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.internal_static_IrodoriScanEntityRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp build() {
        emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp buildPartial() {
        emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp result = new emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp(this);
        if (themeDataBuilder_ == null) {
          result.themeData_ = themeData_;
        } else {
          result.themeData_ = themeDataBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.isGetInspiration_ = isGetInspiration_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp other) {
        if (other == emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp.getDefaultInstance()) return this;
        if (other.hasThemeData()) {
          mergeThemeData(other.getThemeData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsGetInspiration() != false) {
          setIsGetInspiration(other.getIsGetInspiration());
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
        emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData themeData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> themeDataBuilder_;
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       * @return Whether the themeData field is set.
       */
      public boolean hasThemeData() {
        return themeDataBuilder_ != null || themeData_ != null;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       * @return The themeData.
       */
      public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeData() {
        if (themeDataBuilder_ == null) {
          return themeData_ == null ? emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance() : themeData_;
        } else {
          return themeDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      public Builder setThemeData(emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          themeData_ = value;
          onChanged();
        } else {
          themeDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      public Builder setThemeData(
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder builderForValue) {
        if (themeDataBuilder_ == null) {
          themeData_ = builderForValue.build();
          onChanged();
        } else {
          themeDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      public Builder mergeThemeData(emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataBuilder_ == null) {
          if (themeData_ != null) {
            themeData_ =
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.newBuilder(themeData_).mergeFrom(value).buildPartial();
          } else {
            themeData_ = value;
          }
          onChanged();
        } else {
          themeDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      public Builder clearThemeData() {
        if (themeDataBuilder_ == null) {
          themeData_ = null;
          onChanged();
        } else {
          themeData_ = null;
          themeDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder getThemeDataBuilder() {
        
        onChanged();
        return getThemeDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataOrBuilder() {
        if (themeDataBuilder_ != null) {
          return themeDataBuilder_.getMessageOrBuilder();
        } else {
          return themeData_ == null ?
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance() : themeData_;
        }
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> 
          getThemeDataFieldBuilder() {
        if (themeDataBuilder_ == null) {
          themeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder>(
                  getThemeData(),
                  getParentForChildren(),
                  isClean());
          themeData_ = null;
        }
        return themeDataBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isGetInspiration_ ;
      /**
       * <code>bool is_get_inspiration = 13;</code>
       * @return The isGetInspiration.
       */
      @java.lang.Override
      public boolean getIsGetInspiration() {
        return isGetInspiration_;
      }
      /**
       * <code>bool is_get_inspiration = 13;</code>
       * @param value The isGetInspiration to set.
       * @return This builder for chaining.
       */
      public Builder setIsGetInspiration(boolean value) {
        
        isGetInspiration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_get_inspiration = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGetInspiration() {
        
        isGetInspiration_ = false;
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


      // @@protoc_insertion_point(builder_scope:IrodoriScanEntityRsp)
    }

    // @@protoc_insertion_point(class_scope:IrodoriScanEntityRsp)
    private static final emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp();
    }

    public static emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriScanEntityRsp>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriScanEntityRsp>() {
      @java.lang.Override
      public IrodoriScanEntityRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriScanEntityRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriScanEntityRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriScanEntityRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriScanEntityRspOuterClass.IrodoriScanEntityRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriScanEntityRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriScanEntityRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IrodoriScanEntityRsp.proto\032\034IrodoriPoe" +
      "tryThemeData.proto\"p\n\024IrodoriScanEntityR" +
      "sp\022+\n\ntheme_data\030\001 \001(\0132\027.IrodoriPoetryTh" +
      "emeData\022\017\n\007retcode\030\014 \001(\005\022\032\n\022is_get_inspi" +
      "ration\030\r \001(\010B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.getDescriptor(),
        });
    internal_static_IrodoriScanEntityRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriScanEntityRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriScanEntityRsp_descriptor,
        new java.lang.String[] { "ThemeData", "Retcode", "IsGetInspiration", });
    emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
