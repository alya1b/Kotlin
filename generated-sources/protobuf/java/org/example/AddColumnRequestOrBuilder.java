// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generate.proto

package org.example;

public interface AddColumnRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.AddColumnRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 tableIndex = 1;</code>
   * @return The tableIndex.
   */
  int getTableIndex();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.org.example.ColumnType columnType = 3;</code>
   * @return The enum numeric value on the wire for columnType.
   */
  int getColumnTypeValue();
  /**
   * <code>.org.example.ColumnType columnType = 3;</code>
   * @return The columnType.
   */
  org.example.ColumnType getColumnType();
}
