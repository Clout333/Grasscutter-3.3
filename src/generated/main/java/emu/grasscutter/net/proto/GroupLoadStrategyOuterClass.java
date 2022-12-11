// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupLoadStrategy.proto

package emu.grasscutter.net.proto;

public final class GroupLoadStrategyOuterClass {
  private GroupLoadStrategyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GroupLoadStrategy}
   */
  public enum GroupLoadStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GROUP_LOAD_STRATEGY_NONE = 0;</code>
     */
    GROUP_LOAD_STRATEGY_NONE(0),
    /**
     * <code>GROUP_LOAD_STRATEGY_SINGLE = 1;</code>
     */
    GROUP_LOAD_STRATEGY_SINGLE(1),
    /**
     * <code>GROUP_LOAD_STRATEGY_MULTI = 2;</code>
     */
    GROUP_LOAD_STRATEGY_MULTI(2),
    /**
     * <code>GROUP_LOAD_STRATEGY_ALL = 3;</code>
     */
    GROUP_LOAD_STRATEGY_ALL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GROUP_LOAD_STRATEGY_NONE = 0;</code>
     */
    public static final int GROUP_LOAD_STRATEGY_NONE_VALUE = 0;
    /**
     * <code>GROUP_LOAD_STRATEGY_SINGLE = 1;</code>
     */
    public static final int GROUP_LOAD_STRATEGY_SINGLE_VALUE = 1;
    /**
     * <code>GROUP_LOAD_STRATEGY_MULTI = 2;</code>
     */
    public static final int GROUP_LOAD_STRATEGY_MULTI_VALUE = 2;
    /**
     * <code>GROUP_LOAD_STRATEGY_ALL = 3;</code>
     */
    public static final int GROUP_LOAD_STRATEGY_ALL_VALUE = 3;


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
    public static GroupLoadStrategy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GroupLoadStrategy forNumber(int value) {
      switch (value) {
        case 0: return GROUP_LOAD_STRATEGY_NONE;
        case 1: return GROUP_LOAD_STRATEGY_SINGLE;
        case 2: return GROUP_LOAD_STRATEGY_MULTI;
        case 3: return GROUP_LOAD_STRATEGY_ALL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GroupLoadStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GroupLoadStrategy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GroupLoadStrategy>() {
            public GroupLoadStrategy findValueByNumber(int number) {
              return GroupLoadStrategy.forNumber(number);
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
      return emu.grasscutter.net.proto.GroupLoadStrategyOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GroupLoadStrategy[] VALUES = values();

    public static GroupLoadStrategy valueOf(
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

    private GroupLoadStrategy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GroupLoadStrategy)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GroupLoadStrategy.proto*\215\001\n\021GroupLoadS" +
      "trategy\022\034\n\030GROUP_LOAD_STRATEGY_NONE\020\000\022\036\n" +
      "\032GROUP_LOAD_STRATEGY_SINGLE\020\001\022\035\n\031GROUP_L" +
      "OAD_STRATEGY_MULTI\020\002\022\033\n\027GROUP_LOAD_STRAT" +
      "EGY_ALL\020\003B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
