// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: factorial-service.proto

package com.b4u.grpc.factorial.model;

public final class FactorialProto {
  private FactorialProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FactorialNumberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FactorialNumberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Factorial_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Factorial_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027factorial-service.proto\",\n\026FactorialNu" +
      "mberRequest\022\022\n\nb4u_number\030\001 \001(\005\"\037\n\tFacto" +
      "rial\022\022\n\nb4u_result\030\001 \001(\0052G\n\020FactorialSer" +
      "vice\0223\n\014getFactorial\022\027.FactorialNumberRe" +
      "quest\032\n.FactorialB0\n\034com.b4u.grpc.factor" +
      "ial.modelB\016FactorialProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FactorialNumberRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FactorialNumberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FactorialNumberRequest_descriptor,
        new java.lang.String[] { "B4UNumber", });
    internal_static_Factorial_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Factorial_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Factorial_descriptor,
        new java.lang.String[] { "B4UResult", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
