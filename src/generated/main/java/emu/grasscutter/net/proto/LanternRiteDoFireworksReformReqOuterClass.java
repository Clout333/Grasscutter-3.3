// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteDoFireworksReformReq.proto

package emu.grasscutter.net.proto;

public final class LanternRiteDoFireworksReformReqOuterClass {
  private LanternRiteDoFireworksReformReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteDoFireworksReformReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteDoFireworksReformReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 challenge_id = 13;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 factor_id = 9;</code>
     * @return The factorId.
     */
    int getFactorId();

    /**
     * <code>uint32 skill_id = 4;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8517;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code LanternRiteDoFireworksReformReq}
   */
  public static final class LanternRiteDoFireworksReformReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteDoFireworksReformReq)
      LanternRiteDoFireworksReformReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteDoFireworksReformReq.newBuilder() to construct.
    private LanternRiteDoFireworksReformReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteDoFireworksReformReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteDoFireworksReformReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanternRiteDoFireworksReformReq(
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
            case 32: {

              skillId_ = input.readUInt32();
              break;
            }
            case 72: {

              factorId_ = input.readUInt32();
              break;
            }
            case 104: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 120: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.internal_static_LanternRiteDoFireworksReformReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.internal_static_LanternRiteDoFireworksReformReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.class, emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 15;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 13;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 13;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int FACTOR_ID_FIELD_NUMBER = 9;
    private int factorId_;
    /**
     * <code>uint32 factor_id = 9;</code>
     * @return The factorId.
     */
    @java.lang.Override
    public int getFactorId() {
      return factorId_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 4;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 4;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (skillId_ != 0) {
        output.writeUInt32(4, skillId_);
      }
      if (factorId_ != 0) {
        output.writeUInt32(9, factorId_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(13, challengeId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, skillId_);
      }
      if (factorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, factorId_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, challengeId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq other = (emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getFactorId()
          != other.getFactorId()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + FACTOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFactorId();
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq prototype) {
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
     *   CMD_ID = 8517;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code LanternRiteDoFireworksReformReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteDoFireworksReformReq)
        emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.internal_static_LanternRiteDoFireworksReformReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.internal_static_LanternRiteDoFireworksReformReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.class, emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.newBuilder()
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
        stageId_ = 0;

        challengeId_ = 0;

        factorId_ = 0;

        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.internal_static_LanternRiteDoFireworksReformReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq build() {
        emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq buildPartial() {
        emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq result = new emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq(this);
        result.stageId_ = stageId_;
        result.challengeId_ = challengeId_;
        result.factorId_ = factorId_;
        result.skillId_ = skillId_;
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
        if (other instanceof emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq) {
          return mergeFrom((emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq other) {
        if (other == emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getFactorId() != 0) {
          setFactorId(other.getFactorId());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
        emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 13;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 13;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int factorId_ ;
      /**
       * <code>uint32 factor_id = 9;</code>
       * @return The factorId.
       */
      @java.lang.Override
      public int getFactorId() {
        return factorId_;
      }
      /**
       * <code>uint32 factor_id = 9;</code>
       * @param value The factorId to set.
       * @return This builder for chaining.
       */
      public Builder setFactorId(int value) {
        
        factorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 factor_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFactorId() {
        
        factorId_ = 0;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 4;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 4;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteDoFireworksReformReq)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteDoFireworksReformReq)
    private static final emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq();
    }

    public static emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteDoFireworksReformReq>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteDoFireworksReformReq>() {
      @java.lang.Override
      public LanternRiteDoFireworksReformReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanternRiteDoFireworksReformReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanternRiteDoFireworksReformReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteDoFireworksReformReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanternRiteDoFireworksReformReqOuterClass.LanternRiteDoFireworksReformReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteDoFireworksReformReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteDoFireworksReformReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%LanternRiteDoFireworksReformReq.proto\"" +
      "n\n\037LanternRiteDoFireworksReformReq\022\020\n\010st" +
      "age_id\030\017 \001(\r\022\024\n\014challenge_id\030\r \001(\r\022\021\n\tfa" +
      "ctor_id\030\t \001(\r\022\020\n\010skill_id\030\004 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteDoFireworksReformReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteDoFireworksReformReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteDoFireworksReformReq_descriptor,
        new java.lang.String[] { "StageId", "ChallengeId", "FactorId", "SkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
