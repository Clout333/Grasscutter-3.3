// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartySailStage.proto

package emu.grasscutter.net.proto;

public final class IslandPartySailStageOuterClass {
  private IslandPartySailStageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code IslandPartySailStage}
   */
  public enum IslandPartySailStage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ISLAND_PARTY_SAIL_STAGE_NONE = 0;</code>
     */
    ISLAND_PARTY_SAIL_STAGE_NONE(0),
    /**
     * <code>ISLAND_PARTY_SAIL_STAGE_SAIL = 1;</code>
     */
    ISLAND_PARTY_SAIL_STAGE_SAIL(1),
    /**
     * <code>ISLAND_PARTY_SAIL_STAGE_BATTLE = 2;</code>
     */
    ISLAND_PARTY_SAIL_STAGE_BATTLE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ISLAND_PARTY_SAIL_STAGE_NONE = 0;</code>
     */
    public static final int ISLAND_PARTY_SAIL_STAGE_NONE_VALUE = 0;
    /**
     * <code>ISLAND_PARTY_SAIL_STAGE_SAIL = 1;</code>
     */
    public static final int ISLAND_PARTY_SAIL_STAGE_SAIL_VALUE = 1;
    /**
     * <code>ISLAND_PARTY_SAIL_STAGE_BATTLE = 2;</code>
     */
    public static final int ISLAND_PARTY_SAIL_STAGE_BATTLE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IslandPartySailStage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IslandPartySailStage forNumber(int value) {
      switch (value) {
        case 0: return ISLAND_PARTY_SAIL_STAGE_NONE;
        case 1: return ISLAND_PARTY_SAIL_STAGE_SAIL;
        case 2: return ISLAND_PARTY_SAIL_STAGE_BATTLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IslandPartySailStage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IslandPartySailStage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IslandPartySailStage>() {
            public IslandPartySailStage findValueByNumber(int number) {
              return IslandPartySailStage.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IslandPartySailStageOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final IslandPartySailStage[] VALUES = values();

    public static IslandPartySailStage valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private IslandPartySailStage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:IslandPartySailStage)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IslandPartySailStage.proto*~\n\024IslandPa" +
      "rtySailStage\022 \n\034ISLAND_PARTY_SAIL_STAGE_" +
      "NONE\020\000\022 \n\034ISLAND_PARTY_SAIL_STAGE_SAIL\020\001" +
      "\022\"\n\036ISLAND_PARTY_SAIL_STAGE_BATTLE\020\002B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
