// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generate.proto

package org.example;

/**
 * Protobuf type {@code org.example.MergeTablesRequest}
 */
public final class MergeTablesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.MergeTablesRequest)
    MergeTablesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MergeTablesRequest.newBuilder() to construct.
  private MergeTablesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MergeTablesRequest() {
    name1_ = "";
    name2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MergeTablesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.RemoteDBProto.internal_static_org_example_MergeTablesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.RemoteDBProto.internal_static_org_example_MergeTablesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.MergeTablesRequest.class, org.example.MergeTablesRequest.Builder.class);
  }

  public static final int NAME1_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name1_ = "";
  /**
   * <code>string Name1 = 1;</code>
   * @return The name1.
   */
  @java.lang.Override
  public java.lang.String getName1() {
    java.lang.Object ref = name1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name1_ = s;
      return s;
    }
  }
  /**
   * <code>string Name1 = 1;</code>
   * @return The bytes for name1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getName1Bytes() {
    java.lang.Object ref = name1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME2_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name2_ = "";
  /**
   * <code>string Name2 = 2;</code>
   * @return The name2.
   */
  @java.lang.Override
  public java.lang.String getName2() {
    java.lang.Object ref = name2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name2_ = s;
      return s;
    }
  }
  /**
   * <code>string Name2 = 2;</code>
   * @return The bytes for name2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getName2Bytes() {
    java.lang.Object ref = name2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name2_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name2_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.MergeTablesRequest)) {
      return super.equals(obj);
    }
    org.example.MergeTablesRequest other = (org.example.MergeTablesRequest) obj;

    if (!getName1()
        .equals(other.getName1())) return false;
    if (!getName2()
        .equals(other.getName2())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME1_FIELD_NUMBER;
    hash = (53 * hash) + getName1().hashCode();
    hash = (37 * hash) + NAME2_FIELD_NUMBER;
    hash = (53 * hash) + getName2().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.MergeTablesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.MergeTablesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.MergeTablesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.MergeTablesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.MergeTablesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.MergeTablesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.MergeTablesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.MergeTablesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.MergeTablesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.MergeTablesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.MergeTablesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.MergeTablesRequest parseFrom(
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
  public static Builder newBuilder(org.example.MergeTablesRequest prototype) {
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
   * Protobuf type {@code org.example.MergeTablesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.MergeTablesRequest)
      org.example.MergeTablesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.RemoteDBProto.internal_static_org_example_MergeTablesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.RemoteDBProto.internal_static_org_example_MergeTablesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.MergeTablesRequest.class, org.example.MergeTablesRequest.Builder.class);
    }

    // Construct using org.example.MergeTablesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name1_ = "";
      name2_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.RemoteDBProto.internal_static_org_example_MergeTablesRequest_descriptor;
    }

    @java.lang.Override
    public org.example.MergeTablesRequest getDefaultInstanceForType() {
      return org.example.MergeTablesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.MergeTablesRequest build() {
      org.example.MergeTablesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.MergeTablesRequest buildPartial() {
      org.example.MergeTablesRequest result = new org.example.MergeTablesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.example.MergeTablesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name1_ = name1_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name2_ = name2_;
      }
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
      if (other instanceof org.example.MergeTablesRequest) {
        return mergeFrom((org.example.MergeTablesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.MergeTablesRequest other) {
      if (other == org.example.MergeTablesRequest.getDefaultInstance()) return this;
      if (!other.getName1().isEmpty()) {
        name1_ = other.name1_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName2().isEmpty()) {
        name2_ = other.name2_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              name1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object name1_ = "";
    /**
     * <code>string Name1 = 1;</code>
     * @return The name1.
     */
    public java.lang.String getName1() {
      java.lang.Object ref = name1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Name1 = 1;</code>
     * @return The bytes for name1.
     */
    public com.google.protobuf.ByteString
        getName1Bytes() {
      java.lang.Object ref = name1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Name1 = 1;</code>
     * @param value The name1 to set.
     * @return This builder for chaining.
     */
    public Builder setName1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string Name1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName1() {
      name1_ = getDefaultInstance().getName1();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string Name1 = 1;</code>
     * @param value The bytes for name1 to set.
     * @return This builder for chaining.
     */
    public Builder setName1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name1_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name2_ = "";
    /**
     * <code>string Name2 = 2;</code>
     * @return The name2.
     */
    public java.lang.String getName2() {
      java.lang.Object ref = name2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Name2 = 2;</code>
     * @return The bytes for name2.
     */
    public com.google.protobuf.ByteString
        getName2Bytes() {
      java.lang.Object ref = name2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Name2 = 2;</code>
     * @param value The name2 to set.
     * @return This builder for chaining.
     */
    public Builder setName2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name2_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string Name2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName2() {
      name2_ = getDefaultInstance().getName2();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string Name2 = 2;</code>
     * @param value The bytes for name2 to set.
     * @return This builder for chaining.
     */
    public Builder setName2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name2_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:org.example.MergeTablesRequest)
  }

  // @@protoc_insertion_point(class_scope:org.example.MergeTablesRequest)
  private static final org.example.MergeTablesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.MergeTablesRequest();
  }

  public static org.example.MergeTablesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MergeTablesRequest>
      PARSER = new com.google.protobuf.AbstractParser<MergeTablesRequest>() {
    @java.lang.Override
    public MergeTablesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MergeTablesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MergeTablesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.MergeTablesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
