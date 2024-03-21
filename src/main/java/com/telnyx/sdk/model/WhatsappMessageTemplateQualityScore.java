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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The quality rating shows how messages from your template have been received by your customers in a rolling window of the past 24 hours. The possible values are provided by WhatsApp and are subject to change.
 */
@ApiModel(description = "The quality rating shows how messages from your template have been received by your customers in a rolling window of the past 24 hours. The possible values are provided by WhatsApp and are subject to change.")
@JsonPropertyOrder({
  WhatsappMessageTemplateQualityScore.JSON_PROPERTY_SCORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappMessageTemplateQualityScore {
  /**
   * Gets or Sets score
   */
  public enum ScoreEnum {
    UNKNOWN("UNKNOWN"),
    
    HIGH("HIGH"),
    
    MEDIUM("MEDIUM"),
    
    LOW("LOW");

    private String value;

    ScoreEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScoreEnum fromValue(String value) {
      for (ScoreEnum b : ScoreEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCORE = "score";
  private ScoreEnum score;

  public WhatsappMessageTemplateQualityScore() { 
  }

  public WhatsappMessageTemplateQualityScore score(ScoreEnum score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNKNOWN", value = "")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScoreEnum getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(ScoreEnum score) {
    this.score = score;
  }


  /**
   * Return true if this WhatsappMessageTemplate_quality_score object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappMessageTemplateQualityScore whatsappMessageTemplateQualityScore = (WhatsappMessageTemplateQualityScore) o;
    return Objects.equals(this.score, whatsappMessageTemplateQualityScore.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappMessageTemplateQualityScore {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

