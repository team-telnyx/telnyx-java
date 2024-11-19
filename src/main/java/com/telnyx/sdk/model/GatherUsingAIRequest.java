/*
 * Telnyx API
 * Notifications and Notification Settings.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.Assistant;
import com.telnyx.sdk.model.CallAIGatherEndedPayloadMessageHistoryInner;
import com.telnyx.sdk.model.GatherUsingAIRequestVoiceSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GatherUsingAIRequest
 */
@JsonPropertyOrder({
  GatherUsingAIRequest.JSON_PROPERTY_PARAMETERS,
  GatherUsingAIRequest.JSON_PROPERTY_VOICE,
  GatherUsingAIRequest.JSON_PROPERTY_VOICE_SETTINGS,
  GatherUsingAIRequest.JSON_PROPERTY_GREETING,
  GatherUsingAIRequest.JSON_PROPERTY_ASSISTANT,
  GatherUsingAIRequest.JSON_PROPERTY_MESSAGE_HISTORY,
  GatherUsingAIRequest.JSON_PROPERTY_CLIENT_STATE,
  GatherUsingAIRequest.JSON_PROPERTY_COMMAND_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GatherUsingAIRequest {
  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private Object parameters;

  public static final String JSON_PROPERTY_VOICE = "voice";
  private String voice = "Telnyx.LibriTTS.0";

  public static final String JSON_PROPERTY_VOICE_SETTINGS = "voice_settings";
  private GatherUsingAIRequestVoiceSettings voiceSettings;

  public static final String JSON_PROPERTY_GREETING = "greeting";
  private String greeting;

  public static final String JSON_PROPERTY_ASSISTANT = "assistant";
  private Assistant assistant;

  public static final String JSON_PROPERTY_MESSAGE_HISTORY = "message_history";
  private List<CallAIGatherEndedPayloadMessageHistoryInner> messageHistory = null;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public GatherUsingAIRequest() { 
  }

  public GatherUsingAIRequest parameters(Object parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * The parameters described as a JSON Schema object that needs to be gathered by the voice assistant. See the [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation about the format
   * @return parameters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"properties\":{\"age\":{\"description\":\"The age of the customer.\",\"type\":\"integer\"},\"location\":{\"description\":\"The location of the customer.\",\"type\":\"string\"}},\"required\":[\"age\",\"location\"],\"type\":\"object\"}", required = true, value = "The parameters described as a JSON Schema object that needs to be gathered by the voice assistant. See the [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation about the format")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }


  public GatherUsingAIRequest voice(String voice) {
    this.voice = voice;
    return this;
  }

   /**
   * The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS voices only, for ElevenLabs voices you can pass the voice as &#x60;ElevenLabs.&lt;model_id&gt;.&lt;voice_id&gt;&#x60;, for Telnyx voices you can pass the voice as &#x60;Telnyx.&lt;model_id&gt;.&lt;voice_id&gt;&#x60;, for AWS Polly voices you can pass the voice as &#x60;AWS.Polly.&lt;voice_id&gt;&#x60;
   * @return voice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Telnyx.LibriTTS.0", value = "The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS voices only, for ElevenLabs voices you can pass the voice as `ElevenLabs.<model_id>.<voice_id>`, for Telnyx voices you can pass the voice as `Telnyx.<model_id>.<voice_id>`, for AWS Polly voices you can pass the voice as `AWS.Polly.<voice_id>`")
  @JsonProperty(JSON_PROPERTY_VOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVoice() {
    return voice;
  }


  @JsonProperty(JSON_PROPERTY_VOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoice(String voice) {
    this.voice = voice;
  }


  public GatherUsingAIRequest voiceSettings(GatherUsingAIRequestVoiceSettings voiceSettings) {
    this.voiceSettings = voiceSettings;
    return this;
  }

   /**
   * Get voiceSettings
   * @return voiceSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOICE_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GatherUsingAIRequestVoiceSettings getVoiceSettings() {
    return voiceSettings;
  }


  @JsonProperty(JSON_PROPERTY_VOICE_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoiceSettings(GatherUsingAIRequestVoiceSettings voiceSettings) {
    this.voiceSettings = voiceSettings;
  }


  public GatherUsingAIRequest greeting(String greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Text that will be played when the gathering starts, if none then nothing will be played when the gathering starts. The greeting can be text for any voice or SSML for &#x60;AWS.Polly.&lt;voice_id&gt;&#x60; voices. There is a 3,000 character limit.
   * @return greeting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello, can you tell me your age and where you live?", value = "Text that will be played when the gathering starts, if none then nothing will be played when the gathering starts. The greeting can be text for any voice or SSML for `AWS.Polly.<voice_id>` voices. There is a 3,000 character limit.")
  @JsonProperty(JSON_PROPERTY_GREETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGreeting() {
    return greeting;
  }


  @JsonProperty(JSON_PROPERTY_GREETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }


  public GatherUsingAIRequest assistant(Assistant assistant) {
    this.assistant = assistant;
    return this;
  }

   /**
   * Get assistant
   * @return assistant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSISTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Assistant getAssistant() {
    return assistant;
  }


  @JsonProperty(JSON_PROPERTY_ASSISTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssistant(Assistant assistant) {
    this.assistant = assistant;
  }


  public GatherUsingAIRequest messageHistory(List<CallAIGatherEndedPayloadMessageHistoryInner> messageHistory) {
    this.messageHistory = messageHistory;
    return this;
  }

  public GatherUsingAIRequest addmessageHistoryItem(CallAIGatherEndedPayloadMessageHistoryInner messageHistoryItem) {
    if (this.messageHistory == null) {
      this.messageHistory = new ArrayList<>();
    }
    this.messageHistory.add(messageHistoryItem);
    return this;
  }

   /**
   * The message history you want the voice assistant to be aware of, this can be useful to keep the context of the conversation, or to pass additional information to the voice assistant.
   * @return messageHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The message history you want the voice assistant to be aware of, this can be useful to keep the context of the conversation, or to pass additional information to the voice assistant.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CallAIGatherEndedPayloadMessageHistoryInner> getMessageHistory() {
    return messageHistory;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageHistory(List<CallAIGatherEndedPayloadMessageHistoryInner> messageHistory) {
    this.messageHistory = messageHistory;
  }


  public GatherUsingAIRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public GatherUsingAIRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`.")
  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommandId() {
    return commandId;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommandId(String commandId) {
    this.commandId = commandId;
  }


  /**
   * Return true if this GatherUsingAIRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatherUsingAIRequest gatherUsingAIRequest = (GatherUsingAIRequest) o;
    return Objects.equals(this.parameters, gatherUsingAIRequest.parameters) &&
        Objects.equals(this.voice, gatherUsingAIRequest.voice) &&
        Objects.equals(this.voiceSettings, gatherUsingAIRequest.voiceSettings) &&
        Objects.equals(this.greeting, gatherUsingAIRequest.greeting) &&
        Objects.equals(this.assistant, gatherUsingAIRequest.assistant) &&
        Objects.equals(this.messageHistory, gatherUsingAIRequest.messageHistory) &&
        Objects.equals(this.clientState, gatherUsingAIRequest.clientState) &&
        Objects.equals(this.commandId, gatherUsingAIRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, voice, voiceSettings, greeting, assistant, messageHistory, clientState, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatherUsingAIRequest {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
    sb.append("    voiceSettings: ").append(toIndentedString(voiceSettings)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
    sb.append("    messageHistory: ").append(toIndentedString(messageHistory)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

