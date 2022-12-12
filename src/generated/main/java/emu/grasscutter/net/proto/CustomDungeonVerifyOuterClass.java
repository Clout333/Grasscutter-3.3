// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonVerify.proto

package emu.grasscutter.net.proto;

public final class CustomDungeonVerifyOuterClass {
  private CustomDungeonVerifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomDungeonVerifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomDungeonVerify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string region = 13;</code>
     * @return The region.
     */
    java.lang.String getRegion();
    /**
     * <code>string region = 13;</code>
     * @return The bytes for region.
     */
    com.google.protobuf.ByteString
        getRegionBytes();

    /**
     * <code>uint32 timestamp = 5;</code>
     * @return The timestamp.
     */
    int getTimestamp();

    /**
     * <code>uint64 dungeon_guid = 1;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();

    /**
     * <code>uint32 lang = 6;</code>
     * @return The lang.
     */
    int getLang();
  }
  /**
   * Protobuf type {@code CustomDungeonVerify}
   */
  public static final class CustomDungeonVerify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomDungeonVerify)
      CustomDungeonVerifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomDungeonVerify.newBuilder() to construct.
    private CustomDungeonVerify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomDungeonVerify() {
      region_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomDungeonVerify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomDungeonVerify(
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

              dungeonGuid_ = input.readUInt64();
              break;
            }
            case 24: {

              uid_ = input.readUInt32();
              break;
            }
            case 40: {

              timestamp_ = input.readUInt32();
              break;
            }
            case 48: {

              lang_ = input.readUInt32();
              break;
            }
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              region_ = s;
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
      return emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.internal_static_CustomDungeonVerify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.internal_static_CustomDungeonVerify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.class, emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 3;
    private int uid_;
    /**
     * <code>uint32 uid = 3;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int REGION_FIELD_NUMBER = 13;
    private volatile java.lang.Object region_;
    /**
     * <code>string region = 13;</code>
     * @return The region.
     */
    @java.lang.Override
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      }
    }
    /**
     * <code>string region = 13;</code>
     * @return The bytes for region.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private int timestamp_;
    /**
     * <code>uint32 timestamp = 5;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public int getTimestamp() {
      return timestamp_;
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 1;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 1;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
    }

    public static final int LANG_FIELD_NUMBER = 6;
    private int lang_;
    /**
     * <code>uint32 lang = 6;</code>
     * @return The lang.
     */
    @java.lang.Override
    public int getLang() {
      return lang_;
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
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(1, dungeonGuid_);
      }
      if (uid_ != 0) {
        output.writeUInt32(3, uid_);
      }
      if (timestamp_ != 0) {
        output.writeUInt32(5, timestamp_);
      }
      if (lang_ != 0) {
        output.writeUInt32(6, lang_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, region_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, dungeonGuid_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, uid_);
      }
      if (timestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, timestamp_);
      }
      if (lang_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lang_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, region_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify other = (emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getRegion()
          .equals(other.getRegion())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
      if (getLang()
          != other.getLang()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + REGION_FIELD_NUMBER;
      hash = (53 * hash) + getRegion().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp();
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (37 * hash) + LANG_FIELD_NUMBER;
      hash = (53 * hash) + getLang();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify prototype) {
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
     * Protobuf type {@code CustomDungeonVerify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomDungeonVerify)
        emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.internal_static_CustomDungeonVerify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.internal_static_CustomDungeonVerify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.class, emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.newBuilder()
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
        uid_ = 0;

        region_ = "";

        timestamp_ = 0;

        dungeonGuid_ = 0L;

        lang_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.internal_static_CustomDungeonVerify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify build() {
        emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify buildPartial() {
        emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify result = new emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify(this);
        result.uid_ = uid_;
        result.region_ = region_;
        result.timestamp_ = timestamp_;
        result.dungeonGuid_ = dungeonGuid_;
        result.lang_ = lang_;
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
        if (other instanceof emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify) {
          return mergeFrom((emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify other) {
        if (other == emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getRegion().isEmpty()) {
          region_ = other.region_;
          onChanged();
        }
        if (other.getTimestamp() != 0) {
          setTimestamp(other.getTimestamp());
        }
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
        }
        if (other.getLang() != 0) {
          setLang(other.getLang());
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
        emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 3;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object region_ = "";
      /**
       * <code>string region = 13;</code>
       * @return The region.
       */
      public java.lang.String getRegion() {
        java.lang.Object ref = region_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          region_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string region = 13;</code>
       * @return The bytes for region.
       */
      public com.google.protobuf.ByteString
          getRegionBytes() {
        java.lang.Object ref = region_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          region_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string region = 13;</code>
       * @param value The region to set.
       * @return This builder for chaining.
       */
      public Builder setRegion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        region_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string region = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRegion() {
        
        region_ = getDefaultInstance().getRegion();
        onChanged();
        return this;
      }
      /**
       * <code>string region = 13;</code>
       * @param value The bytes for region to set.
       * @return This builder for chaining.
       */
      public Builder setRegionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        region_ = value;
        onChanged();
        return this;
      }

      private int timestamp_ ;
      /**
       * <code>uint32 timestamp = 5;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public int getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>uint32 timestamp = 5;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(int value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timestamp = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0;
        onChanged();
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
        onChanged();
        return this;
      }

      private int lang_ ;
      /**
       * <code>uint32 lang = 6;</code>
       * @return The lang.
       */
      @java.lang.Override
      public int getLang() {
        return lang_;
      }
      /**
       * <code>uint32 lang = 6;</code>
       * @param value The lang to set.
       * @return This builder for chaining.
       */
      public Builder setLang(int value) {
        
        lang_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 lang = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLang() {
        
        lang_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CustomDungeonVerify)
    }

    // @@protoc_insertion_point(class_scope:CustomDungeonVerify)
    private static final emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify();
    }

    public static emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomDungeonVerify>
        PARSER = new com.google.protobuf.AbstractParser<CustomDungeonVerify>() {
      @java.lang.Override
      public CustomDungeonVerify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomDungeonVerify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomDungeonVerify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomDungeonVerify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CustomDungeonVerifyOuterClass.CustomDungeonVerify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomDungeonVerify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomDungeonVerify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031CustomDungeonVerify.proto\"i\n\023CustomDun" +
      "geonVerify\022\013\n\003uid\030\003 \001(\r\022\016\n\006region\030\r \001(\t\022" +
      "\021\n\ttimestamp\030\005 \001(\r\022\024\n\014dungeon_guid\030\001 \001(\004" +
      "\022\014\n\004lang\030\006 \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomDungeonVerify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomDungeonVerify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomDungeonVerify_descriptor,
        new java.lang.String[] { "Uid", "Region", "Timestamp", "DungeonGuid", "Lang", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
