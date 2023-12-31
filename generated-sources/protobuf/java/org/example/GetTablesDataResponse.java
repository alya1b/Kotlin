// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generate.proto

package org.example;

/**
 * Protobuf type {@code org.example.GetTablesDataResponse}
 */
public final class GetTablesDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.GetTablesDataResponse)
    GetTablesDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTablesDataResponse.newBuilder() to construct.
  private GetTablesDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTablesDataResponse() {
    tablesData_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTablesDataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.RemoteDBProto.internal_static_org_example_GetTablesDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.RemoteDBProto.internal_static_org_example_GetTablesDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.GetTablesDataResponse.class, org.example.GetTablesDataResponse.Builder.class);
  }

  public static final int TABLESDATA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.example.TableData> tablesData_;
  /**
   * <code>repeated .org.example.TableData tablesData = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.TableData> getTablesDataList() {
    return tablesData_;
  }
  /**
   * <code>repeated .org.example.TableData tablesData = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.TableDataOrBuilder> 
      getTablesDataOrBuilderList() {
    return tablesData_;
  }
  /**
   * <code>repeated .org.example.TableData tablesData = 1;</code>
   */
  @java.lang.Override
  public int getTablesDataCount() {
    return tablesData_.size();
  }
  /**
   * <code>repeated .org.example.TableData tablesData = 1;</code>
   */
  @java.lang.Override
  public org.example.TableData getTablesData(int index) {
    return tablesData_.get(index);
  }
  /**
   * <code>repeated .org.example.TableData tablesData = 1;</code>
   */
  @java.lang.Override
  public org.example.TableDataOrBuilder getTablesDataOrBuilder(
      int index) {
    return tablesData_.get(index);
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
    for (int i = 0; i < tablesData_.size(); i++) {
      output.writeMessage(1, tablesData_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tablesData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tablesData_.get(i));
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
    if (!(obj instanceof org.example.GetTablesDataResponse)) {
      return super.equals(obj);
    }
    org.example.GetTablesDataResponse other = (org.example.GetTablesDataResponse) obj;

    if (!getTablesDataList()
        .equals(other.getTablesDataList())) return false;
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
    if (getTablesDataCount() > 0) {
      hash = (37 * hash) + TABLESDATA_FIELD_NUMBER;
      hash = (53 * hash) + getTablesDataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.GetTablesDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.GetTablesDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.GetTablesDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.GetTablesDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.GetTablesDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.GetTablesDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.GetTablesDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.GetTablesDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.GetTablesDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.GetTablesDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.GetTablesDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.GetTablesDataResponse parseFrom(
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
  public static Builder newBuilder(org.example.GetTablesDataResponse prototype) {
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
   * Protobuf type {@code org.example.GetTablesDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.GetTablesDataResponse)
      org.example.GetTablesDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.RemoteDBProto.internal_static_org_example_GetTablesDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.RemoteDBProto.internal_static_org_example_GetTablesDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.GetTablesDataResponse.class, org.example.GetTablesDataResponse.Builder.class);
    }

    // Construct using org.example.GetTablesDataResponse.newBuilder()
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
      if (tablesDataBuilder_ == null) {
        tablesData_ = java.util.Collections.emptyList();
      } else {
        tablesData_ = null;
        tablesDataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.RemoteDBProto.internal_static_org_example_GetTablesDataResponse_descriptor;
    }

    @java.lang.Override
    public org.example.GetTablesDataResponse getDefaultInstanceForType() {
      return org.example.GetTablesDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.GetTablesDataResponse build() {
      org.example.GetTablesDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.GetTablesDataResponse buildPartial() {
      org.example.GetTablesDataResponse result = new org.example.GetTablesDataResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.example.GetTablesDataResponse result) {
      if (tablesDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tablesData_ = java.util.Collections.unmodifiableList(tablesData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tablesData_ = tablesData_;
      } else {
        result.tablesData_ = tablesDataBuilder_.build();
      }
    }

    private void buildPartial0(org.example.GetTablesDataResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof org.example.GetTablesDataResponse) {
        return mergeFrom((org.example.GetTablesDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.GetTablesDataResponse other) {
      if (other == org.example.GetTablesDataResponse.getDefaultInstance()) return this;
      if (tablesDataBuilder_ == null) {
        if (!other.tablesData_.isEmpty()) {
          if (tablesData_.isEmpty()) {
            tablesData_ = other.tablesData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTablesDataIsMutable();
            tablesData_.addAll(other.tablesData_);
          }
          onChanged();
        }
      } else {
        if (!other.tablesData_.isEmpty()) {
          if (tablesDataBuilder_.isEmpty()) {
            tablesDataBuilder_.dispose();
            tablesDataBuilder_ = null;
            tablesData_ = other.tablesData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tablesDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTablesDataFieldBuilder() : null;
          } else {
            tablesDataBuilder_.addAllMessages(other.tablesData_);
          }
        }
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
              org.example.TableData m =
                  input.readMessage(
                      org.example.TableData.parser(),
                      extensionRegistry);
              if (tablesDataBuilder_ == null) {
                ensureTablesDataIsMutable();
                tablesData_.add(m);
              } else {
                tablesDataBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<org.example.TableData> tablesData_ =
      java.util.Collections.emptyList();
    private void ensureTablesDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tablesData_ = new java.util.ArrayList<org.example.TableData>(tablesData_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.TableData, org.example.TableData.Builder, org.example.TableDataOrBuilder> tablesDataBuilder_;

    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public java.util.List<org.example.TableData> getTablesDataList() {
      if (tablesDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tablesData_);
      } else {
        return tablesDataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public int getTablesDataCount() {
      if (tablesDataBuilder_ == null) {
        return tablesData_.size();
      } else {
        return tablesDataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public org.example.TableData getTablesData(int index) {
      if (tablesDataBuilder_ == null) {
        return tablesData_.get(index);
      } else {
        return tablesDataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder setTablesData(
        int index, org.example.TableData value) {
      if (tablesDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTablesDataIsMutable();
        tablesData_.set(index, value);
        onChanged();
      } else {
        tablesDataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder setTablesData(
        int index, org.example.TableData.Builder builderForValue) {
      if (tablesDataBuilder_ == null) {
        ensureTablesDataIsMutable();
        tablesData_.set(index, builderForValue.build());
        onChanged();
      } else {
        tablesDataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder addTablesData(org.example.TableData value) {
      if (tablesDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTablesDataIsMutable();
        tablesData_.add(value);
        onChanged();
      } else {
        tablesDataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder addTablesData(
        int index, org.example.TableData value) {
      if (tablesDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTablesDataIsMutable();
        tablesData_.add(index, value);
        onChanged();
      } else {
        tablesDataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder addTablesData(
        org.example.TableData.Builder builderForValue) {
      if (tablesDataBuilder_ == null) {
        ensureTablesDataIsMutable();
        tablesData_.add(builderForValue.build());
        onChanged();
      } else {
        tablesDataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder addTablesData(
        int index, org.example.TableData.Builder builderForValue) {
      if (tablesDataBuilder_ == null) {
        ensureTablesDataIsMutable();
        tablesData_.add(index, builderForValue.build());
        onChanged();
      } else {
        tablesDataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder addAllTablesData(
        java.lang.Iterable<? extends org.example.TableData> values) {
      if (tablesDataBuilder_ == null) {
        ensureTablesDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tablesData_);
        onChanged();
      } else {
        tablesDataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder clearTablesData() {
      if (tablesDataBuilder_ == null) {
        tablesData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tablesDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public Builder removeTablesData(int index) {
      if (tablesDataBuilder_ == null) {
        ensureTablesDataIsMutable();
        tablesData_.remove(index);
        onChanged();
      } else {
        tablesDataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public org.example.TableData.Builder getTablesDataBuilder(
        int index) {
      return getTablesDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public org.example.TableDataOrBuilder getTablesDataOrBuilder(
        int index) {
      if (tablesDataBuilder_ == null) {
        return tablesData_.get(index);  } else {
        return tablesDataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public java.util.List<? extends org.example.TableDataOrBuilder> 
         getTablesDataOrBuilderList() {
      if (tablesDataBuilder_ != null) {
        return tablesDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tablesData_);
      }
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public org.example.TableData.Builder addTablesDataBuilder() {
      return getTablesDataFieldBuilder().addBuilder(
          org.example.TableData.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public org.example.TableData.Builder addTablesDataBuilder(
        int index) {
      return getTablesDataFieldBuilder().addBuilder(
          index, org.example.TableData.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.TableData tablesData = 1;</code>
     */
    public java.util.List<org.example.TableData.Builder> 
         getTablesDataBuilderList() {
      return getTablesDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.TableData, org.example.TableData.Builder, org.example.TableDataOrBuilder> 
        getTablesDataFieldBuilder() {
      if (tablesDataBuilder_ == null) {
        tablesDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.TableData, org.example.TableData.Builder, org.example.TableDataOrBuilder>(
                tablesData_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tablesData_ = null;
      }
      return tablesDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.example.GetTablesDataResponse)
  }

  // @@protoc_insertion_point(class_scope:org.example.GetTablesDataResponse)
  private static final org.example.GetTablesDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.GetTablesDataResponse();
  }

  public static org.example.GetTablesDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTablesDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTablesDataResponse>() {
    @java.lang.Override
    public GetTablesDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTablesDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTablesDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.GetTablesDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

