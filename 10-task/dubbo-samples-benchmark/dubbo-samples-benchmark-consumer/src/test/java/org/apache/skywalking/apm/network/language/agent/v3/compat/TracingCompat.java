// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/TracingCompat.proto

package org.apache.skywalking.apm.network.language.agent.v3.compat;

@Deprecated public final class TracingCompat {
  private TracingCompat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\"language-agent/TracingCompat.proto\032\024co" +
      "mmon/Command.proto\032\034language-agent/Traci" +
      "ng.proto2\257\001\n\031TraceSegmentReportService\022D" +
      "\n\007collect\022\034.skywalking.v3.SegmentObject\032" +
      "\027.skywalking.v3.Commands\"\000(\001\022L\n\rcollectI" +
      "nSync\022 .skywalking.v3.SegmentCollection\032" +
      "\027.skywalking.v3.Commands\"\000B\253\001\n:org.apach" +
      "e.skywalking.apm.network.language.agent." +
      "v3.compatP\001ZAskywalking.apache.org/repo/" +
      "goapi/collect/language/agent/v3/compat\270\001" +
      "\001\252\002$SkyWalking.NetworkProtocol.V3.Compat" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.skywalking.apm.network.common.v3.CommandOuterClass.getDescriptor(),
          org.apache.skywalking.apm.network.language.agent.v3.Tracing.getDescriptor(),
        });
    org.apache.skywalking.apm.network.common.v3.CommandOuterClass.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.v3.Tracing.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}