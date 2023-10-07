// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSelectOnStageCostInfo.proto

package emu.grasscutter.net.proto;

public final class GCGSelectOnStageCostInfoOuterClass {
  private GCGSelectOnStageCostInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSelectOnStageCostInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSelectOnStageCostInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> 
        getCostMapList();
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getCostMap(int index);
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    int getCostMapCount();
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getCostMapOrBuilderList();
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getCostMapOrBuilder(
        int index);

    /**
     * <code>uint32 card_guid = 13;</code>
     * @return The cardGuid.
     */
    int getCardGuid();
  }
  /**
   * <pre>
   * Obf: CDKNMFIMBMH
   * </pre>
   *
   * Protobuf type {@code GCGSelectOnStageCostInfo}
   */
  public static final class GCGSelectOnStageCostInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSelectOnStageCostInfo)
      GCGSelectOnStageCostInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSelectOnStageCostInfo.newBuilder() to construct.
    private GCGSelectOnStageCostInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSelectOnStageCostInfo() {
      costMap_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSelectOnStageCostInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGSelectOnStageCostInfo(
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
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                costMap_ = new java.util.ArrayList<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair>();
                mutable_bitField0_ |= 0x00000001;
              }
              costMap_.add(
                  input.readMessage(emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.parser(), extensionRegistry));
              break;
            }
            case 104: {

              cardGuid_ = input.readUInt32();
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
          costMap_ = java.util.Collections.unmodifiableList(costMap_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.internal_static_GCGSelectOnStageCostInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.internal_static_GCGSelectOnStageCostInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.class, emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.Builder.class);
    }

    public static final int COST_MAP_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> costMap_;
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> getCostMapList() {
      return costMap_;
    }
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getCostMapOrBuilderList() {
      return costMap_;
    }
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    @java.lang.Override
    public int getCostMapCount() {
      return costMap_.size();
    }
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getCostMap(int index) {
      return costMap_.get(index);
    }
    /**
     * <code>repeated .Uint32Pair cost_map = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getCostMapOrBuilder(
        int index) {
      return costMap_.get(index);
    }

    public static final int CARD_GUID_FIELD_NUMBER = 13;
    private int cardGuid_;
    /**
     * <code>uint32 card_guid = 13;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
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
      for (int i = 0; i < costMap_.size(); i++) {
        output.writeMessage(10, costMap_.get(i));
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(13, cardGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < costMap_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, costMap_.get(i));
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cardGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo other = (emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo) obj;

      if (!getCostMapList()
          .equals(other.getCostMapList())) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
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
      if (getCostMapCount() > 0) {
        hash = (37 * hash) + COST_MAP_FIELD_NUMBER;
        hash = (53 * hash) + getCostMapList().hashCode();
      }
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo prototype) {
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
     * Obf: CDKNMFIMBMH
     * </pre>
     *
     * Protobuf type {@code GCGSelectOnStageCostInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSelectOnStageCostInfo)
        emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.internal_static_GCGSelectOnStageCostInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.internal_static_GCGSelectOnStageCostInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.class, emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.newBuilder()
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
          getCostMapFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (costMapBuilder_ == null) {
          costMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          costMapBuilder_.clear();
        }
        cardGuid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.internal_static_GCGSelectOnStageCostInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo build() {
        emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo buildPartial() {
        emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo result = new emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo(this);
        int from_bitField0_ = bitField0_;
        if (costMapBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            costMap_ = java.util.Collections.unmodifiableList(costMap_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.costMap_ = costMap_;
        } else {
          result.costMap_ = costMapBuilder_.build();
        }
        result.cardGuid_ = cardGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo other) {
        if (other == emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo.getDefaultInstance()) return this;
        if (costMapBuilder_ == null) {
          if (!other.costMap_.isEmpty()) {
            if (costMap_.isEmpty()) {
              costMap_ = other.costMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCostMapIsMutable();
              costMap_.addAll(other.costMap_);
            }
            onChanged();
          }
        } else {
          if (!other.costMap_.isEmpty()) {
            if (costMapBuilder_.isEmpty()) {
              costMapBuilder_.dispose();
              costMapBuilder_ = null;
              costMap_ = other.costMap_;
              bitField0_ = (bitField0_ & ~0x00000001);
              costMapBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCostMapFieldBuilder() : null;
            } else {
              costMapBuilder_.addAllMessages(other.costMap_);
            }
          }
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
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
        emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> costMap_ =
        java.util.Collections.emptyList();
      private void ensureCostMapIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          costMap_ = new java.util.ArrayList<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair>(costMap_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> costMapBuilder_;

      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> getCostMapList() {
        if (costMapBuilder_ == null) {
          return java.util.Collections.unmodifiableList(costMap_);
        } else {
          return costMapBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public int getCostMapCount() {
        if (costMapBuilder_ == null) {
          return costMap_.size();
        } else {
          return costMapBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getCostMap(int index) {
        if (costMapBuilder_ == null) {
          return costMap_.get(index);
        } else {
          return costMapBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder setCostMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (costMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCostMapIsMutable();
          costMap_.set(index, value);
          onChanged();
        } else {
          costMapBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder setCostMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (costMapBuilder_ == null) {
          ensureCostMapIsMutable();
          costMap_.set(index, builderForValue.build());
          onChanged();
        } else {
          costMapBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder addCostMap(emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (costMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCostMapIsMutable();
          costMap_.add(value);
          onChanged();
        } else {
          costMapBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder addCostMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
        if (costMapBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCostMapIsMutable();
          costMap_.add(index, value);
          onChanged();
        } else {
          costMapBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder addCostMap(
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (costMapBuilder_ == null) {
          ensureCostMapIsMutable();
          costMap_.add(builderForValue.build());
          onChanged();
        } else {
          costMapBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder addCostMap(
          int index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (costMapBuilder_ == null) {
          ensureCostMapIsMutable();
          costMap_.add(index, builderForValue.build());
          onChanged();
        } else {
          costMapBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder addAllCostMap(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair> values) {
        if (costMapBuilder_ == null) {
          ensureCostMapIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, costMap_);
          onChanged();
        } else {
          costMapBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder clearCostMap() {
        if (costMapBuilder_ == null) {
          costMap_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          costMapBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public Builder removeCostMap(int index) {
        if (costMapBuilder_ == null) {
          ensureCostMapIsMutable();
          costMap_.remove(index);
          onChanged();
        } else {
          costMapBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder getCostMapBuilder(
          int index) {
        return getCostMapFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getCostMapOrBuilder(
          int index) {
        if (costMapBuilder_ == null) {
          return costMap_.get(index);  } else {
          return costMapBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
           getCostMapOrBuilderList() {
        if (costMapBuilder_ != null) {
          return costMapBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(costMap_);
        }
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder addCostMapBuilder() {
        return getCostMapFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder addCostMapBuilder(
          int index) {
        return getCostMapFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair cost_map = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder> 
           getCostMapBuilderList() {
        return getCostMapFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder> 
          getCostMapFieldBuilder() {
        if (costMapBuilder_ == null) {
          costMapBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder>(
                  costMap_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          costMap_ = null;
        }
        return costMapBuilder_;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 13;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 13;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGSelectOnStageCostInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSelectOnStageCostInfo)
    private static final emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo();
    }

    public static emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSelectOnStageCostInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSelectOnStageCostInfo>() {
      @java.lang.Override
      public GCGSelectOnStageCostInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGSelectOnStageCostInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGSelectOnStageCostInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSelectOnStageCostInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGSelectOnStageCostInfoOuterClass.GCGSelectOnStageCostInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSelectOnStageCostInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSelectOnStageCostInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GCGSelectOnStageCostInfo.proto\032\020Uint32" +
      "Pair.proto\"L\n\030GCGSelectOnStageCostInfo\022\035" +
      "\n\010cost_map\030\n \003(\0132\013.Uint32Pair\022\021\n\tcard_gu" +
      "id\030\r \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_GCGSelectOnStageCostInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSelectOnStageCostInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSelectOnStageCostInfo_descriptor,
        new java.lang.String[] { "CostMap", "CardGuid", });
    emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
