// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessPlayerInfo.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessPlayerInfoOuterClass {
  private IrodoriChessPlayerInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessPlayerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessPlayerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 settle_score = 11;</code>
     * @return The settleScore.
     */
    int getSettleScore();

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 building_points = 8;</code>
     * @return The buildingPoints.
     */
    int getBuildingPoints();
  }
  /**
   * Protobuf type {@code IrodoriChessPlayerInfo}
   */
  public static final class IrodoriChessPlayerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessPlayerInfo)
      IrodoriChessPlayerInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessPlayerInfo.newBuilder() to construct.
    private IrodoriChessPlayerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessPlayerInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessPlayerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessPlayerInfo(
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
            case 64: {

              buildingPoints_ = input.readUInt32();
              break;
            }
            case 80: {

              uid_ = input.readUInt32();
              break;
            }
            case 88: {

              settleScore_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.internal_static_IrodoriChessPlayerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.internal_static_IrodoriChessPlayerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.class, emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder.class);
    }

    public static final int SETTLE_SCORE_FIELD_NUMBER = 11;
    private int settleScore_;
    /**
     * <code>uint32 settle_score = 11;</code>
     * @return The settleScore.
     */
    @java.lang.Override
    public int getSettleScore() {
      return settleScore_;
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int BUILDING_POINTS_FIELD_NUMBER = 8;
    private int buildingPoints_;
    /**
     * <code>uint32 building_points = 8;</code>
     * @return The buildingPoints.
     */
    @java.lang.Override
    public int getBuildingPoints() {
      return buildingPoints_;
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
      if (buildingPoints_ != 0) {
        output.writeUInt32(8, buildingPoints_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      if (settleScore_ != 0) {
        output.writeUInt32(11, settleScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (buildingPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, buildingPoints_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
      }
      if (settleScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, settleScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo other = (emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo) obj;

      if (getSettleScore()
          != other.getSettleScore()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getBuildingPoints()
          != other.getBuildingPoints()) return false;
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
      hash = (37 * hash) + SETTLE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getSettleScore();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + BUILDING_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingPoints();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo prototype) {
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
     * Protobuf type {@code IrodoriChessPlayerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessPlayerInfo)
        emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.internal_static_IrodoriChessPlayerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.internal_static_IrodoriChessPlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.class, emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.newBuilder()
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
        settleScore_ = 0;

        uid_ = 0;

        buildingPoints_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.internal_static_IrodoriChessPlayerInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo build() {
        emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo buildPartial() {
        emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo result = new emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo(this);
        result.settleScore_ = settleScore_;
        result.uid_ = uid_;
        result.buildingPoints_ = buildingPoints_;
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo other) {
        if (other == emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance()) return this;
        if (other.getSettleScore() != 0) {
          setSettleScore(other.getSettleScore());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getBuildingPoints() != 0) {
          setBuildingPoints(other.getBuildingPoints());
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
        emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int settleScore_ ;
      /**
       * <code>uint32 settle_score = 11;</code>
       * @return The settleScore.
       */
      @java.lang.Override
      public int getSettleScore() {
        return settleScore_;
      }
      /**
       * <code>uint32 settle_score = 11;</code>
       * @param value The settleScore to set.
       * @return This builder for chaining.
       */
      public Builder setSettleScore(int value) {
        
        settleScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 settle_score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSettleScore() {
        
        settleScore_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int buildingPoints_ ;
      /**
       * <code>uint32 building_points = 8;</code>
       * @return The buildingPoints.
       */
      @java.lang.Override
      public int getBuildingPoints() {
        return buildingPoints_;
      }
      /**
       * <code>uint32 building_points = 8;</code>
       * @param value The buildingPoints to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingPoints(int value) {
        
        buildingPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 building_points = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingPoints() {
        
        buildingPoints_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessPlayerInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessPlayerInfo)
    private static final emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo();
    }

    public static emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessPlayerInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessPlayerInfo>() {
      @java.lang.Override
      public IrodoriChessPlayerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessPlayerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessPlayerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessPlayerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessPlayerInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessPlayerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034IrodoriChessPlayerInfo.proto\"T\n\026Irodor" +
      "iChessPlayerInfo\022\024\n\014settle_score\030\013 \001(\r\022\013" +
      "\n\003uid\030\n \001(\r\022\027\n\017building_points\030\010 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessPlayerInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessPlayerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessPlayerInfo_descriptor,
        new java.lang.String[] { "SettleScore", "Uid", "BuildingPoints", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
