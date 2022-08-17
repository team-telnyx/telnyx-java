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
 * DialogflowConfig
 */
@JsonPropertyOrder({
  DialogflowConfig.JSON_PROPERTY_ANALYZE_SENTIMENT,
  DialogflowConfig.JSON_PROPERTY_PARTIAL_AUTOMATED_AGENT_REPLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DialogflowConfig {
  public static final String JSON_PROPERTY_ANALYZE_SENTIMENT = "analyze_sentiment";
  private Boolean analyzeSentiment = false;

  public static final String JSON_PROPERTY_PARTIAL_AUTOMATED_AGENT_REPLY = "partial_automated_agent_reply";
  private Boolean partialAutomatedAgentReply = false;

  public DialogflowConfig() { 
  }

  public DialogflowConfig analyzeSentiment(Boolean analyzeSentiment) {
    this.analyzeSentiment = analyzeSentiment;
    return this;
  }

   /**
   * Enable sentiment analysis from Dialogflow.
   * @return analyzeSentiment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable sentiment analysis from Dialogflow.")
  @JsonProperty(JSON_PROPERTY_ANALYZE_SENTIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAnalyzeSentiment() {
    return analyzeSentiment;
  }


  @JsonProperty(JSON_PROPERTY_ANALYZE_SENTIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalyzeSentiment(Boolean analyzeSentiment) {
    this.analyzeSentiment = analyzeSentiment;
  }


  public DialogflowConfig partialAutomatedAgentReply(Boolean partialAutomatedAgentReply) {
    this.partialAutomatedAgentReply = partialAutomatedAgentReply;
    return this;
  }

   /**
   * Enable partial automated agent reply from Dialogflow.
   * @return partialAutomatedAgentReply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable partial automated agent reply from Dialogflow.")
  @JsonProperty(JSON_PROPERTY_PARTIAL_AUTOMATED_AGENT_REPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPartialAutomatedAgentReply() {
    return partialAutomatedAgentReply;
  }


  @JsonProperty(JSON_PROPERTY_PARTIAL_AUTOMATED_AGENT_REPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartialAutomatedAgentReply(Boolean partialAutomatedAgentReply) {
    this.partialAutomatedAgentReply = partialAutomatedAgentReply;
  }


  /**
   * Return true if this DialogflowConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogflowConfig dialogflowConfig = (DialogflowConfig) o;
    return Objects.equals(this.analyzeSentiment, dialogflowConfig.analyzeSentiment) &&
        Objects.equals(this.partialAutomatedAgentReply, dialogflowConfig.partialAutomatedAgentReply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzeSentiment, partialAutomatedAgentReply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowConfig {\n");
    sb.append("    analyzeSentiment: ").append(toIndentedString(analyzeSentiment)).append("\n");
    sb.append("    partialAutomatedAgentReply: ").append(toIndentedString(partialAutomatedAgentReply)).append("\n");
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

