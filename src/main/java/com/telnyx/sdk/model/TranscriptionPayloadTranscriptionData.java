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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * TranscriptionPayloadTranscriptionData
 */
@JsonPropertyOrder({
  TranscriptionPayloadTranscriptionData.JSON_PROPERTY_CONFIDENCE,
  TranscriptionPayloadTranscriptionData.JSON_PROPERTY_IS_FINAL,
  TranscriptionPayloadTranscriptionData.JSON_PROPERTY_TRANSCRIPT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TranscriptionPayloadTranscriptionData {
  public static final String JSON_PROPERTY_CONFIDENCE = "confidence";
  private Double confidence;

  public static final String JSON_PROPERTY_IS_FINAL = "is_final";
  private Boolean isFinal;

  public static final String JSON_PROPERTY_TRANSCRIPT = "transcript";
  private String transcript;

  public TranscriptionPayloadTranscriptionData() { 
  }

  public TranscriptionPayloadTranscriptionData confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Speech recognition confidence level.
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.977219", value = "Speech recognition confidence level.")
  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConfidence() {
    return confidence;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  public TranscriptionPayloadTranscriptionData isFinal(Boolean isFinal) {
    this.isFinal = isFinal;
    return this;
  }

   /**
   * When false, it means that this is an interim result.
   * @return isFinal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When false, it means that this is an interim result.")
  @JsonProperty(JSON_PROPERTY_IS_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFinal() {
    return isFinal;
  }


  @JsonProperty(JSON_PROPERTY_IS_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
  }


  public TranscriptionPayloadTranscriptionData transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * Recognized text.
   * @return transcript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "hello this is a test speech", value = "Recognized text.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTranscript() {
    return transcript;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }


  /**
   * Return true if this Transcription_payload_transcription_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionPayloadTranscriptionData transcriptionPayloadTranscriptionData = (TranscriptionPayloadTranscriptionData) o;
    return Objects.equals(this.confidence, transcriptionPayloadTranscriptionData.confidence) &&
        Objects.equals(this.isFinal, transcriptionPayloadTranscriptionData.isFinal) &&
        Objects.equals(this.transcript, transcriptionPayloadTranscriptionData.transcript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, isFinal, transcript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionPayloadTranscriptionData {\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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

