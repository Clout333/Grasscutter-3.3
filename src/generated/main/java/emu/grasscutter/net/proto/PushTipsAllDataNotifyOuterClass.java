// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushTipsAllDataNotify.proto

package emu.grasscutter.net.proto;

public final class PushTipsAllDataNotifyOuterClass {
  private PushTipsAllDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PushTipsAllDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PushTipsAllDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData> 
        getPushTipsListList();
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData getPushTipsList(int index);
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    int getPushTipsListCount();
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
        getPushTipsListOrBuilderList();
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder getPushTipsListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2237;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PushTipsAllDataNotify}
   */
  public static final class PushTipsAllDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PushTipsAllDataNotify)
      PushTipsAllDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PushTipsAllDataNotify.newBuilder() to construct.
    private PushTipsAllDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PushTipsAllDataNotify() {
      pushTipsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PushTipsAllDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PushTipsAllDataNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pushTipsList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData>();
                mutable_bitField0_ |= 0x00000001;
              }
              pushTipsList_.add(
                  input.readMessage(emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.parser(), extensionRegistry));
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
          pushTipsList_ = java.util.Collections.unmodifiableList(pushTipsList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.class, emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.Builder.class);
    }

    public static final int PUSH_TIPS_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData> pushTipsList_;
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData> getPushTipsListList() {
      return pushTipsList_;
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
        getPushTipsListOrBuilderList() {
      return pushTipsList_;
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    @java.lang.Override
    public int getPushTipsListCount() {
      return pushTipsList_.size();
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData getPushTipsList(int index) {
      return pushTipsList_.get(index);
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder getPushTipsListOrBuilder(
        int index) {
      return pushTipsList_.get(index);
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
      for (int i = 0; i < pushTipsList_.size(); i++) {
        output.writeMessage(4, pushTipsList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pushTipsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, pushTipsList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify other = (emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify) obj;

      if (!getPushTipsListList()
          .equals(other.getPushTipsListList())) return false;
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
      if (getPushTipsListCount() > 0) {
        hash = (37 * hash) + PUSH_TIPS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPushTipsListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify prototype) {
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
     *   CMD_ID = 2237;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PushTipsAllDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PushTipsAllDataNotify)
        emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.class, emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.newBuilder()
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
          getPushTipsListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (pushTipsListBuilder_ == null) {
          pushTipsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pushTipsListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify build() {
        emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify buildPartial() {
        emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify result = new emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (pushTipsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pushTipsList_ = java.util.Collections.unmodifiableList(pushTipsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pushTipsList_ = pushTipsList_;
        } else {
          result.pushTipsList_ = pushTipsListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify other) {
        if (other == emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.getDefaultInstance()) return this;
        if (pushTipsListBuilder_ == null) {
          if (!other.pushTipsList_.isEmpty()) {
            if (pushTipsList_.isEmpty()) {
              pushTipsList_ = other.pushTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePushTipsListIsMutable();
              pushTipsList_.addAll(other.pushTipsList_);
            }
            onChanged();
          }
        } else {
          if (!other.pushTipsList_.isEmpty()) {
            if (pushTipsListBuilder_.isEmpty()) {
              pushTipsListBuilder_.dispose();
              pushTipsListBuilder_ = null;
              pushTipsList_ = other.pushTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pushTipsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPushTipsListFieldBuilder() : null;
            } else {
              pushTipsListBuilder_.addAllMessages(other.pushTipsList_);
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
        emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData> pushTipsList_ =
        java.util.Collections.emptyList();
      private void ensurePushTipsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pushTipsList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData>(pushTipsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder> pushTipsListBuilder_;

      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData> getPushTipsListList() {
        if (pushTipsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pushTipsList_);
        } else {
          return pushTipsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public int getPushTipsListCount() {
        if (pushTipsListBuilder_ == null) {
          return pushTipsList_.size();
        } else {
          return pushTipsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData getPushTipsList(int index) {
        if (pushTipsListBuilder_ == null) {
          return pushTipsList_.get(index);
        } else {
          return pushTipsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder setPushTipsList(
          int index, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData value) {
        if (pushTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePushTipsListIsMutable();
          pushTipsList_.set(index, value);
          onChanged();
        } else {
          pushTipsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder setPushTipsList(
          int index, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder builderForValue) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pushTipsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder addPushTipsList(emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData value) {
        if (pushTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePushTipsListIsMutable();
          pushTipsList_.add(value);
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder addPushTipsList(
          int index, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData value) {
        if (pushTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePushTipsListIsMutable();
          pushTipsList_.add(index, value);
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder addPushTipsList(
          emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder builderForValue) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.add(builderForValue.build());
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder addPushTipsList(
          int index, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder builderForValue) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder addAllPushTipsList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData> values) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pushTipsList_);
          onChanged();
        } else {
          pushTipsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder clearPushTipsList() {
        if (pushTipsListBuilder_ == null) {
          pushTipsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pushTipsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public Builder removePushTipsList(int index) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.remove(index);
          onChanged();
        } else {
          pushTipsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder getPushTipsListBuilder(
          int index) {
        return getPushTipsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder getPushTipsListOrBuilder(
          int index) {
        if (pushTipsListBuilder_ == null) {
          return pushTipsList_.get(index);  } else {
          return pushTipsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
           getPushTipsListOrBuilderList() {
        if (pushTipsListBuilder_ != null) {
          return pushTipsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pushTipsList_);
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder addPushTipsListBuilder() {
        return getPushTipsListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.getDefaultInstance());
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder addPushTipsListBuilder(
          int index) {
        return getPushTipsListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.getDefaultInstance());
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder> 
           getPushTipsListBuilderList() {
        return getPushTipsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
          getPushTipsListFieldBuilder() {
        if (pushTipsListBuilder_ == null) {
          pushTipsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsData.Builder, emu.grasscutter.net.proto.PushTipsDataOuterClass.PushTipsDataOrBuilder>(
                  pushTipsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pushTipsList_ = null;
        }
        return pushTipsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PushTipsAllDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PushTipsAllDataNotify)
    private static final emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify();
    }

    public static emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushTipsAllDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PushTipsAllDataNotify>() {
      @java.lang.Override
      public PushTipsAllDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PushTipsAllDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PushTipsAllDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PushTipsAllDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PushTipsAllDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PushTipsAllDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PushTipsAllDataNotify.proto\032\022PushTipsD" +
      "ata.proto\">\n\025PushTipsAllDataNotify\022%\n\016pu" +
      "sh_tips_list\030\004 \003(\0132\r.PushTipsDataB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PushTipsDataOuterClass.getDescriptor(),
        });
    internal_static_PushTipsAllDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PushTipsAllDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PushTipsAllDataNotify_descriptor,
        new java.lang.String[] { "PushTipsList", });
    emu.grasscutter.net.proto.PushTipsDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
