// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book-service.proto

package com.b4u.grpc.book.model;

public interface BookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Book)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string author = 2;</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <code>string author = 2;</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <code>int32 price = 3;</code>
   * @return The price.
   */
  int getPrice();
}
