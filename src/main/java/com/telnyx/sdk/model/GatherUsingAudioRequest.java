/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GatherUsingAudioRequest
 */
@JsonPropertyOrder({
  GatherUsingAudioRequest.JSON_PROPERTY_AUDIO_URL,
  GatherUsingAudioRequest.JSON_PROPERTY_MEDIA_NAME,
  GatherUsingAudioRequest.JSON_PROPERTY_INVALID_AUDIO_URL,
  GatherUsingAudioRequest.JSON_PROPERTY_INVALID_MEDIA_NAME,
  GatherUsingAudioRequest.JSON_PROPERTY_MINIMUM_DIGITS,
  GatherUsingAudioRequest.JSON_PROPERTY_MAXIMUM_DIGITS,
  GatherUsingAudioRequest.JSON_PROPERTY_MAXIMUM_TRIES,
  GatherUsingAudioRequest.JSON_PROPERTY_TIMEOUT_MILLIS,
  GatherUsingAudioRequest.JSON_PROPERTY_TERMINATING_DIGIT,
  GatherUsingAudioRequest.JSON_PROPERTY_VALID_DIGITS,
  GatherUsingAudioRequest.JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS,
  GatherUsingAudioRequest.JSON_PROPERTY_CLIENT_STATE,
  GatherUsingAudioRequest.JSON_PROPERTY_COMMAND_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GatherUsingAudioRequest {
  public static final String JSON_PROPERTY_AUDIO_URL = "audio_url";
  private String audioUrl;

  public static final String JSON_PROPERTY_MEDIA_NAME = "media_name";
  private String mediaName;

  public static final String JSON_PROPERTY_INVALID_AUDIO_URL = "invalid_audio_url";
  private String invalidAudioUrl;

  public static final String JSON_PROPERTY_INVALID_MEDIA_NAME = "invalid_media_name";
  private String invalidMediaName;

  public static final String JSON_PROPERTY_MINIMUM_DIGITS = "minimum_digits";
  private Integer minimumDigits = 1;

  public static final String JSON_PROPERTY_MAXIMUM_DIGITS = "maximum_digits";
  private Integer maximumDigits = 128;

  public static final String JSON_PROPERTY_MAXIMUM_TRIES = "maximum_tries";
  private Integer maximumTries = 3;

  public static final String JSON_PROPERTY_TIMEOUT_MILLIS = "timeout_millis";
  private Integer timeoutMillis = 60000;

  public static final String JSON_PROPERTY_TERMINATING_DIGIT = "terminating_digit";
  private String terminatingDigit = "#";

  public static final String JSON_PROPERTY_VALID_DIGITS = "valid_digits";
  private String validDigits = "0123456789#*";

  public static final String JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS = "inter_digit_timeout_millis";
  private Integer interDigitTimeoutMillis = 5000;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public GatherUsingAudioRequest() { 
  }

  public GatherUsingAudioRequest audioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * The URL of a file to be played back at the beginning of each prompt. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot be used together in one request.
   * @return audioUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/message.wav", value = "The URL of a file to be played back at the beginning of each prompt. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot be used together in one request.")
  @JsonProperty(JSON_PROPERTY_AUDIO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudioUrl() {
    return audioUrl;
  }


  @JsonProperty(JSON_PROPERTY_AUDIO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }


  public GatherUsingAudioRequest mediaName(String mediaName) {
    this.mediaName = mediaName;
    return this;
  }

   /**
   * The media_name of a file to be played back at the beginning of each prompt. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file.
   * @return mediaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_media_uploaded_to_media_storage_api", value = "The media_name of a file to be played back at the beginning of each prompt. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file.")
  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaName() {
    return mediaName;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }


  public GatherUsingAudioRequest invalidAudioUrl(String invalidAudioUrl) {
    this.invalidAudioUrl = invalidAudioUrl;
    return this;
  }

   /**
   * The URL of a file to play when digits don&#39;t match the &#x60;valid_digits&#x60; parameter or the number of digits is not between &#x60;min&#x60; and &#x60;max&#x60;. The URL can point to either a WAV or MP3 file. invalid_media_name and invalid_audio_url cannot be used together in one request.
   * @return invalidAudioUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/invalid.wav", value = "The URL of a file to play when digits don't match the `valid_digits` parameter or the number of digits is not between `min` and `max`. The URL can point to either a WAV or MP3 file. invalid_media_name and invalid_audio_url cannot be used together in one request.")
  @JsonProperty(JSON_PROPERTY_INVALID_AUDIO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvalidAudioUrl() {
    return invalidAudioUrl;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_AUDIO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidAudioUrl(String invalidAudioUrl) {
    this.invalidAudioUrl = invalidAudioUrl;
  }


  public GatherUsingAudioRequest invalidMediaName(String invalidMediaName) {
    this.invalidMediaName = invalidMediaName;
    return this;
  }

   /**
   * The media_name of a file to be played back when digits don&#39;t match the &#x60;valid_digits&#x60; parameter or the number of digits is not between &#x60;min&#x60; and &#x60;max&#x60;. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file.
   * @return invalidMediaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_media_uploaded_to_media_storage_api", value = "The media_name of a file to be played back when digits don't match the `valid_digits` parameter or the number of digits is not between `min` and `max`. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file.")
  @JsonProperty(JSON_PROPERTY_INVALID_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvalidMediaName() {
    return invalidMediaName;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidMediaName(String invalidMediaName) {
    this.invalidMediaName = invalidMediaName;
  }


  public GatherUsingAudioRequest minimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
    return this;
  }

   /**
   * The minimum number of digits to fetch. This parameter has a minimum value of 1.
   * @return minimumDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The minimum number of digits to fetch. This parameter has a minimum value of 1.")
  @JsonProperty(JSON_PROPERTY_MINIMUM_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimumDigits() {
    return minimumDigits;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumDigits(Integer minimumDigits) {
    this.minimumDigits = minimumDigits;
  }


  public GatherUsingAudioRequest maximumDigits(Integer maximumDigits) {
    this.maximumDigits = maximumDigits;
    return this;
  }

   /**
   * The maximum number of digits to fetch. This parameter has a maximum value of 128.
   * @return maximumDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The maximum number of digits to fetch. This parameter has a maximum value of 128.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDigits() {
    return maximumDigits;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumDigits(Integer maximumDigits) {
    this.maximumDigits = maximumDigits;
  }


  public GatherUsingAudioRequest maximumTries(Integer maximumTries) {
    this.maximumTries = maximumTries;
    return this;
  }

   /**
   * The maximum number of times the file should be played if there is no input from the user on the call.
   * @return maximumTries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "The maximum number of times the file should be played if there is no input from the user on the call.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumTries() {
    return maximumTries;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_TRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumTries(Integer maximumTries) {
    this.maximumTries = maximumTries;
  }


  public GatherUsingAudioRequest timeoutMillis(Integer timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
    return this;
  }

   /**
   * The number of milliseconds to wait for a DTMF response after file playback ends before a replaying the sound file.
   * @return timeoutMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60000", value = "The number of milliseconds to wait for a DTMF response after file playback ends before a replaying the sound file.")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutMillis() {
    return timeoutMillis;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutMillis(Integer timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
  }


  public GatherUsingAudioRequest terminatingDigit(String terminatingDigit) {
    this.terminatingDigit = terminatingDigit;
    return this;
  }

   /**
   * The digit used to terminate input if fewer than &#x60;maximum_digits&#x60; digits have been gathered.
   * @return terminatingDigit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "#", value = "The digit used to terminate input if fewer than `maximum_digits` digits have been gathered.")
  @JsonProperty(JSON_PROPERTY_TERMINATING_DIGIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminatingDigit() {
    return terminatingDigit;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATING_DIGIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminatingDigit(String terminatingDigit) {
    this.terminatingDigit = terminatingDigit;
  }


  public GatherUsingAudioRequest validDigits(String validDigits) {
    this.validDigits = validDigits;
    return this;
  }

   /**
   * A list of all digits accepted as valid.
   * @return validDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "A list of all digits accepted as valid.")
  @JsonProperty(JSON_PROPERTY_VALID_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidDigits() {
    return validDigits;
  }


  @JsonProperty(JSON_PROPERTY_VALID_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidDigits(String validDigits) {
    this.validDigits = validDigits;
  }


  public GatherUsingAudioRequest interDigitTimeoutMillis(Integer interDigitTimeoutMillis) {
    this.interDigitTimeoutMillis = interDigitTimeoutMillis;
    return this;
  }

   /**
   * The number of milliseconds to wait for input between digits.
   * @return interDigitTimeoutMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000", value = "The number of milliseconds to wait for input between digits.")
  @JsonProperty(JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterDigitTimeoutMillis() {
    return interDigitTimeoutMillis;
  }


  @JsonProperty(JSON_PROPERTY_INTER_DIGIT_TIMEOUT_MILLIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterDigitTimeoutMillis(Integer interDigitTimeoutMillis) {
    this.interDigitTimeoutMillis = interDigitTimeoutMillis;
  }


  public GatherUsingAudioRequest clientState(String clientState) {
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


  public GatherUsingAudioRequest commandId(String commandId) {
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
   * Return true if this GatherUsingAudioRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatherUsingAudioRequest gatherUsingAudioRequest = (GatherUsingAudioRequest) o;
    return Objects.equals(this.audioUrl, gatherUsingAudioRequest.audioUrl) &&
        Objects.equals(this.mediaName, gatherUsingAudioRequest.mediaName) &&
        Objects.equals(this.invalidAudioUrl, gatherUsingAudioRequest.invalidAudioUrl) &&
        Objects.equals(this.invalidMediaName, gatherUsingAudioRequest.invalidMediaName) &&
        Objects.equals(this.minimumDigits, gatherUsingAudioRequest.minimumDigits) &&
        Objects.equals(this.maximumDigits, gatherUsingAudioRequest.maximumDigits) &&
        Objects.equals(this.maximumTries, gatherUsingAudioRequest.maximumTries) &&
        Objects.equals(this.timeoutMillis, gatherUsingAudioRequest.timeoutMillis) &&
        Objects.equals(this.terminatingDigit, gatherUsingAudioRequest.terminatingDigit) &&
        Objects.equals(this.validDigits, gatherUsingAudioRequest.validDigits) &&
        Objects.equals(this.interDigitTimeoutMillis, gatherUsingAudioRequest.interDigitTimeoutMillis) &&
        Objects.equals(this.clientState, gatherUsingAudioRequest.clientState) &&
        Objects.equals(this.commandId, gatherUsingAudioRequest.commandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioUrl, mediaName, invalidAudioUrl, invalidMediaName, minimumDigits, maximumDigits, maximumTries, timeoutMillis, terminatingDigit, validDigits, interDigitTimeoutMillis, clientState, commandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatherUsingAudioRequest {\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
    sb.append("    invalidAudioUrl: ").append(toIndentedString(invalidAudioUrl)).append("\n");
    sb.append("    invalidMediaName: ").append(toIndentedString(invalidMediaName)).append("\n");
    sb.append("    minimumDigits: ").append(toIndentedString(minimumDigits)).append("\n");
    sb.append("    maximumDigits: ").append(toIndentedString(maximumDigits)).append("\n");
    sb.append("    maximumTries: ").append(toIndentedString(maximumTries)).append("\n");
    sb.append("    timeoutMillis: ").append(toIndentedString(timeoutMillis)).append("\n");
    sb.append("    terminatingDigit: ").append(toIndentedString(terminatingDigit)).append("\n");
    sb.append("    validDigits: ").append(toIndentedString(validDigits)).append("\n");
    sb.append("    interDigitTimeoutMillis: ").append(toIndentedString(interDigitTimeoutMillis)).append("\n");
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

