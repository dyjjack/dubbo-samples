// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/Meter.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface LabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.Label)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string value = 2;</code>
   * @return The value.
   */
  String getValue();
  /**
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}