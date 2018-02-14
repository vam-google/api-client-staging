// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ImportAgentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  java.lang.String getAgentUri();
  /**
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   */
  com.google.protobuf.ByteString
      getAgentUriBytes();

  /**
   * <pre>
   * The agent to import.
   * Example for how to import an agent via the command line:
   * curl &#92;
   *   'https://dialogflow.googleapis.com/v2beta1/projects/&lt;project_name&gt;/agent:import&#92;
   *    -X POST &#92;
   *    -H 'Authorization: Bearer '$(gcloud auth print-access-token) &#92;
   *    -H 'Accept: application/json' &#92;
   *    -H 'Content-Type: application/json' &#92;
   *    --compressed &#92;
   *    --data-binary "{
   *       'agentContent': '$(cat &lt;agent zip file&gt; | base64 -w 0)'
   *    }"
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   */
  com.google.protobuf.ByteString getAgentContent();

  public com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.AgentCase getAgentCase();
}
