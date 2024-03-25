// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface JVMMetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.JVMMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 time = 1;</code>
   * @return The time.
   */
  long getTime();

  /**
   * <code>.skywalking.v3.CPU cpu = 2;</code>
   * @return Whether the cpu field is set.
   */
  boolean hasCpu();
  /**
   * <code>.skywalking.v3.CPU cpu = 2;</code>
   * @return The cpu.
   */
  org.apache.skywalking.apm.network.common.v3.CPU getCpu();
  /**
   * <code>.skywalking.v3.CPU cpu = 2;</code>
   */
  org.apache.skywalking.apm.network.common.v3.CPUOrBuilder getCpuOrBuilder();

  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  java.util.List<Memory>
      getMemoryList();
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  Memory getMemory(int index);
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  int getMemoryCount();
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  java.util.List<? extends MemoryOrBuilder>
      getMemoryOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.Memory memory = 3;</code>
   */
  MemoryOrBuilder getMemoryOrBuilder(
      int index);

  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  java.util.List<MemoryPool>
      getMemoryPoolList();
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  MemoryPool getMemoryPool(int index);
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  int getMemoryPoolCount();
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  java.util.List<? extends MemoryPoolOrBuilder>
      getMemoryPoolOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.MemoryPool memoryPool = 4;</code>
   */
  MemoryPoolOrBuilder getMemoryPoolOrBuilder(
      int index);

  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  java.util.List<GC>
      getGcList();
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  GC getGc(int index);
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  int getGcCount();
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  java.util.List<? extends GCOrBuilder>
      getGcOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.GC gc = 5;</code>
   */
  GCOrBuilder getGcOrBuilder(
      int index);

  /**
   * <code>.skywalking.v3.Thread thread = 6;</code>
   * @return Whether the thread field is set.
   */
  boolean hasThread();
  /**
   * <code>.skywalking.v3.Thread thread = 6;</code>
   * @return The thread.
   */
  Thread getThread();
  /**
   * <code>.skywalking.v3.Thread thread = 6;</code>
   */
  ThreadOrBuilder getThreadOrBuilder();

  /**
   * <code>.skywalking.v3.Class clazz = 7;</code>
   * @return Whether the clazz field is set.
   */
  boolean hasClazz();
  /**
   * <code>.skywalking.v3.Class clazz = 7;</code>
   * @return The clazz.
   */
  Class getClazz();
  /**
   * <code>.skywalking.v3.Class clazz = 7;</code>
   */
  ClassOrBuilder getClazzOrBuilder();
}