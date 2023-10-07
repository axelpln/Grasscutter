// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSCardData.proto

package emu.grasscutter.net.proto;

public final class GCGDSCardDataOuterClass {
  private GCGDSCardDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSCardDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSCardData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 CLHNMOECDEL = 13;</code>
     * @return A list containing the cLHNMOECDEL.
     */
    java.util.List<java.lang.Integer> getCLHNMOECDELList();
    /**
     * <code>repeated uint32 CLHNMOECDEL = 13;</code>
     * @return The count of cLHNMOECDEL.
     */
    int getCLHNMOECDELCount();
    /**
     * <code>repeated uint32 CLHNMOECDEL = 13;</code>
     * @param index The index of the element to return.
     * @return The cLHNMOECDEL at the given index.
     */
    int getCLHNMOECDEL(int index);

    /**
     * <code>uint32 face_type = 7;</code>
     * @return The faceType.
     */
    int getFaceType();

    /**
     * <code>repeated uint32 MGLKBANJKKA = 10;</code>
     * @return A list containing the mGLKBANJKKA.
     */
    java.util.List<java.lang.Integer> getMGLKBANJKKAList();
    /**
     * <code>repeated uint32 MGLKBANJKKA = 10;</code>
     * @return The count of mGLKBANJKKA.
     */
    int getMGLKBANJKKACount();
    /**
     * <code>repeated uint32 MGLKBANJKKA = 10;</code>
     * @param index The index of the element to return.
     * @return The mGLKBANJKKA at the given index.
     */
    int getMGLKBANJKKA(int index);

    /**
     * <code>uint32 num = 3;</code>
     * @return The num.
     */
    int getNum();

    /**
     * <code>uint32 card_id = 15;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 proficiency = 8;</code>
     * @return The proficiency.
     */
    int getProficiency();
  }
  /**
   * <pre>
   * Obf: GCFEBHIOJAJ
   * </pre>
   *
   * Protobuf type {@code GCGDSCardData}
   */
  public static final class GCGDSCardData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSCardData)
      GCGDSCardDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSCardData.newBuilder() to construct.
    private GCGDSCardData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSCardData() {
      cLHNMOECDEL_ = emptyIntList();
      mGLKBANJKKA_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSCardData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSCardData(
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
            case 24: {

              num_ = input.readUInt32();
              break;
            }
            case 56: {

              faceType_ = input.readUInt32();
              break;
            }
            case 64: {

              proficiency_ = input.readUInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                mGLKBANJKKA_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              mGLKBANJKKA_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                mGLKBANJKKA_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                mGLKBANJKKA_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cLHNMOECDEL_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cLHNMOECDEL_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cLHNMOECDEL_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cLHNMOECDEL_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              cardId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          mGLKBANJKKA_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          cLHNMOECDEL_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGDSCardDataOuterClass.internal_static_GCGDSCardData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSCardDataOuterClass.internal_static_GCGDSCardData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.class, emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.Builder.class);
    }

    public static final int CLHNMOECDEL_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList cLHNMOECDEL_;
    /**
     * <code>repeated uint32 CLHNMOECDEL = 13;</code>
     * @return A list containing the cLHNMOECDEL.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCLHNMOECDELList() {
      return cLHNMOECDEL_;
    }
    /**
     * <code>repeated uint32 CLHNMOECDEL = 13;</code>
     * @return The count of cLHNMOECDEL.
     */
    public int getCLHNMOECDELCount() {
      return cLHNMOECDEL_.size();
    }
    /**
     * <code>repeated uint32 CLHNMOECDEL = 13;</code>
     * @param index The index of the element to return.
     * @return The cLHNMOECDEL at the given index.
     */
    public int getCLHNMOECDEL(int index) {
      return cLHNMOECDEL_.getInt(index);
    }
    private int cLHNMOECDELMemoizedSerializedSize = -1;

    public static final int FACE_TYPE_FIELD_NUMBER = 7;
    private int faceType_;
    /**
     * <code>uint32 face_type = 7;</code>
     * @return The faceType.
     */
    @java.lang.Override
    public int getFaceType() {
      return faceType_;
    }

    public static final int MGLKBANJKKA_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList mGLKBANJKKA_;
    /**
     * <code>repeated uint32 MGLKBANJKKA = 10;</code>
     * @return A list containing the mGLKBANJKKA.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMGLKBANJKKAList() {
      return mGLKBANJKKA_;
    }
    /**
     * <code>repeated uint32 MGLKBANJKKA = 10;</code>
     * @return The count of mGLKBANJKKA.
     */
    public int getMGLKBANJKKACount() {
      return mGLKBANJKKA_.size();
    }
    /**
     * <code>repeated uint32 MGLKBANJKKA = 10;</code>
     * @param index The index of the element to return.
     * @return The mGLKBANJKKA at the given index.
     */
    public int getMGLKBANJKKA(int index) {
      return mGLKBANJKKA_.getInt(index);
    }
    private int mGLKBANJKKAMemoizedSerializedSize = -1;

    public static final int NUM_FIELD_NUMBER = 3;
    private int num_;
    /**
     * <code>uint32 num = 3;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 15;
    private int cardId_;
    /**
     * <code>uint32 card_id = 15;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int PROFICIENCY_FIELD_NUMBER = 8;
    private int proficiency_;
    /**
     * <code>uint32 proficiency = 8;</code>
     * @return The proficiency.
     */
    @java.lang.Override
    public int getProficiency() {
      return proficiency_;
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
      getSerializedSize();
      if (num_ != 0) {
        output.writeUInt32(3, num_);
      }
      if (faceType_ != 0) {
        output.writeUInt32(7, faceType_);
      }
      if (proficiency_ != 0) {
        output.writeUInt32(8, proficiency_);
      }
      if (getMGLKBANJKKAList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(mGLKBANJKKAMemoizedSerializedSize);
      }
      for (int i = 0; i < mGLKBANJKKA_.size(); i++) {
        output.writeUInt32NoTag(mGLKBANJKKA_.getInt(i));
      }
      if (getCLHNMOECDELList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(cLHNMOECDELMemoizedSerializedSize);
      }
      for (int i = 0; i < cLHNMOECDEL_.size(); i++) {
        output.writeUInt32NoTag(cLHNMOECDEL_.getInt(i));
      }
      if (cardId_ != 0) {
        output.writeUInt32(15, cardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (num_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, num_);
      }
      if (faceType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, faceType_);
      }
      if (proficiency_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, proficiency_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mGLKBANJKKA_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mGLKBANJKKA_.getInt(i));
        }
        size += dataSize;
        if (!getMGLKBANJKKAList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mGLKBANJKKAMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cLHNMOECDEL_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cLHNMOECDEL_.getInt(i));
        }
        size += dataSize;
        if (!getCLHNMOECDELList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cLHNMOECDELMemoizedSerializedSize = dataSize;
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cardId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData other = (emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData) obj;

      if (!getCLHNMOECDELList()
          .equals(other.getCLHNMOECDELList())) return false;
      if (getFaceType()
          != other.getFaceType()) return false;
      if (!getMGLKBANJKKAList()
          .equals(other.getMGLKBANJKKAList())) return false;
      if (getNum()
          != other.getNum()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (getProficiency()
          != other.getProficiency()) return false;
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
      if (getCLHNMOECDELCount() > 0) {
        hash = (37 * hash) + CLHNMOECDEL_FIELD_NUMBER;
        hash = (53 * hash) + getCLHNMOECDELList().hashCode();
      }
      hash = (37 * hash) + FACE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFaceType();
      if (getMGLKBANJKKACount() > 0) {
        hash = (37 * hash) + MGLKBANJKKA_FIELD_NUMBER;
        hash = (53 * hash) + getMGLKBANJKKAList().hashCode();
      }
      hash = (37 * hash) + NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNum();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + PROFICIENCY_FIELD_NUMBER;
      hash = (53 * hash) + getProficiency();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData prototype) {
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
     * Obf: GCFEBHIOJAJ
     * </pre>
     *
     * Protobuf type {@code GCGDSCardData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSCardData)
        emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSCardDataOuterClass.internal_static_GCGDSCardData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSCardDataOuterClass.internal_static_GCGDSCardData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.class, emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.newBuilder()
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
        cLHNMOECDEL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        faceType_ = 0;

        mGLKBANJKKA_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        num_ = 0;

        cardId_ = 0;

        proficiency_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSCardDataOuterClass.internal_static_GCGDSCardData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData build() {
        emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData buildPartial() {
        emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData result = new emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cLHNMOECDEL_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cLHNMOECDEL_ = cLHNMOECDEL_;
        result.faceType_ = faceType_;
        if (((bitField0_ & 0x00000002) != 0)) {
          mGLKBANJKKA_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.mGLKBANJKKA_ = mGLKBANJKKA_;
        result.num_ = num_;
        result.cardId_ = cardId_;
        result.proficiency_ = proficiency_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData other) {
        if (other == emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData.getDefaultInstance()) return this;
        if (!other.cLHNMOECDEL_.isEmpty()) {
          if (cLHNMOECDEL_.isEmpty()) {
            cLHNMOECDEL_ = other.cLHNMOECDEL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCLHNMOECDELIsMutable();
            cLHNMOECDEL_.addAll(other.cLHNMOECDEL_);
          }
          onChanged();
        }
        if (other.getFaceType() != 0) {
          setFaceType(other.getFaceType());
        }
        if (!other.mGLKBANJKKA_.isEmpty()) {
          if (mGLKBANJKKA_.isEmpty()) {
            mGLKBANJKKA_ = other.mGLKBANJKKA_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMGLKBANJKKAIsMutable();
            mGLKBANJKKA_.addAll(other.mGLKBANJKKA_);
          }
          onChanged();
        }
        if (other.getNum() != 0) {
          setNum(other.getNum());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getProficiency() != 0) {
          setProficiency(other.getProficiency());
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
        emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList cLHNMOECDEL_ = emptyIntList();
      private void ensureCLHNMOECDELIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cLHNMOECDEL_ = mutableCopy(cLHNMOECDEL_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @return A list containing the cLHNMOECDEL.
       */
      public java.util.List<java.lang.Integer>
          getCLHNMOECDELList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cLHNMOECDEL_) : cLHNMOECDEL_;
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @return The count of cLHNMOECDEL.
       */
      public int getCLHNMOECDELCount() {
        return cLHNMOECDEL_.size();
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @param index The index of the element to return.
       * @return The cLHNMOECDEL at the given index.
       */
      public int getCLHNMOECDEL(int index) {
        return cLHNMOECDEL_.getInt(index);
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @param index The index to set the value at.
       * @param value The cLHNMOECDEL to set.
       * @return This builder for chaining.
       */
      public Builder setCLHNMOECDEL(
          int index, int value) {
        ensureCLHNMOECDELIsMutable();
        cLHNMOECDEL_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @param value The cLHNMOECDEL to add.
       * @return This builder for chaining.
       */
      public Builder addCLHNMOECDEL(int value) {
        ensureCLHNMOECDELIsMutable();
        cLHNMOECDEL_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @param values The cLHNMOECDEL to add.
       * @return This builder for chaining.
       */
      public Builder addAllCLHNMOECDEL(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCLHNMOECDELIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cLHNMOECDEL_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CLHNMOECDEL = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCLHNMOECDEL() {
        cLHNMOECDEL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int faceType_ ;
      /**
       * <code>uint32 face_type = 7;</code>
       * @return The faceType.
       */
      @java.lang.Override
      public int getFaceType() {
        return faceType_;
      }
      /**
       * <code>uint32 face_type = 7;</code>
       * @param value The faceType to set.
       * @return This builder for chaining.
       */
      public Builder setFaceType(int value) {
        
        faceType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 face_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceType() {
        
        faceType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList mGLKBANJKKA_ = emptyIntList();
      private void ensureMGLKBANJKKAIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          mGLKBANJKKA_ = mutableCopy(mGLKBANJKKA_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @return A list containing the mGLKBANJKKA.
       */
      public java.util.List<java.lang.Integer>
          getMGLKBANJKKAList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(mGLKBANJKKA_) : mGLKBANJKKA_;
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @return The count of mGLKBANJKKA.
       */
      public int getMGLKBANJKKACount() {
        return mGLKBANJKKA_.size();
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @param index The index of the element to return.
       * @return The mGLKBANJKKA at the given index.
       */
      public int getMGLKBANJKKA(int index) {
        return mGLKBANJKKA_.getInt(index);
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @param index The index to set the value at.
       * @param value The mGLKBANJKKA to set.
       * @return This builder for chaining.
       */
      public Builder setMGLKBANJKKA(
          int index, int value) {
        ensureMGLKBANJKKAIsMutable();
        mGLKBANJKKA_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @param value The mGLKBANJKKA to add.
       * @return This builder for chaining.
       */
      public Builder addMGLKBANJKKA(int value) {
        ensureMGLKBANJKKAIsMutable();
        mGLKBANJKKA_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @param values The mGLKBANJKKA to add.
       * @return This builder for chaining.
       */
      public Builder addAllMGLKBANJKKA(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMGLKBANJKKAIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mGLKBANJKKA_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 MGLKBANJKKA = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMGLKBANJKKA() {
        mGLKBANJKKA_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int num_ ;
      /**
       * <code>uint32 num = 3;</code>
       * @return The num.
       */
      @java.lang.Override
      public int getNum() {
        return num_;
      }
      /**
       * <code>uint32 num = 3;</code>
       * @param value The num to set.
       * @return This builder for chaining.
       */
      public Builder setNum(int value) {
        
        num_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 num = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNum() {
        
        num_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 15;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 15;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int proficiency_ ;
      /**
       * <code>uint32 proficiency = 8;</code>
       * @return The proficiency.
       */
      @java.lang.Override
      public int getProficiency() {
        return proficiency_;
      }
      /**
       * <code>uint32 proficiency = 8;</code>
       * @param value The proficiency to set.
       * @return This builder for chaining.
       */
      public Builder setProficiency(int value) {
        
        proficiency_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 proficiency = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearProficiency() {
        
        proficiency_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSCardData)
    }

    // @@protoc_insertion_point(class_scope:GCGDSCardData)
    private static final emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData();
    }

    public static emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSCardData>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSCardData>() {
      @java.lang.Override
      public GCGDSCardData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSCardData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSCardData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSCardData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSCardDataOuterClass.GCGDSCardData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSCardData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSCardData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GCGDSCardData.proto\"\177\n\rGCGDSCardData\022\023" +
      "\n\013CLHNMOECDEL\030\r \003(\r\022\021\n\tface_type\030\007 \001(\r\022\023" +
      "\n\013MGLKBANJKKA\030\n \003(\r\022\013\n\003num\030\003 \001(\r\022\017\n\007card" +
      "_id\030\017 \001(\r\022\023\n\013proficiency\030\010 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSCardData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSCardData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSCardData_descriptor,
        new java.lang.String[] { "CLHNMOECDEL", "FaceType", "MGLKBANJKKA", "Num", "CardId", "Proficiency", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
