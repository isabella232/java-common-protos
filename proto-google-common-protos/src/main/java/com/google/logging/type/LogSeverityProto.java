/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/type/log_severity.proto

package com.google.logging.type;

public final class LogSeverityProto {
  private LogSeverityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/logging/type/log_severity.proto"
          + "\022\023google.logging.type\032\034google/api/annota"
          + "tions.proto*\202\001\n\013LogSeverity\022\013\n\007DEFAULT\020\000"
          + "\022\t\n\005DEBUG\020d\022\t\n\004INFO\020\310\001\022\013\n\006NOTICE\020\254\002\022\014\n\007W"
          + "ARNING\020\220\003\022\n\n\005ERROR\020\364\003\022\r\n\010CRITICAL\020\330\004\022\n\n\005"
          + "ALERT\020\274\005\022\016\n\tEMERGENCY\020\240\006B\276\001\n\027com.google."
          + "logging.typeB\020LogSeverityProtoP\001Z8google"
          + ".golang.org/genproto/googleapis/logging/"
          + "type;ltype\252\002\031Google.Cloud.Logging.Type\312\002"
          + "\031Google\\Cloud\\Logging\\Type\352\002\034Google::Clo"
          + "ud::Logging::Typeb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
