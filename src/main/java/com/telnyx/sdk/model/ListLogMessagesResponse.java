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
import com.telnyx.sdk.model.LogMessage;
import com.telnyx.sdk.model.PaginationMeta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ListLogMessagesResponse
 */
@JsonPropertyOrder({
  ListLogMessagesResponse.JSON_PROPERTY_LOG_MESSAGES,
  ListLogMessagesResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ListLogMessagesResponse {
  public static final String JSON_PROPERTY_LOG_MESSAGES = "log_messages";
  private List<LogMessage> logMessages = null;

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public ListLogMessagesResponse() { 
  }

  public ListLogMessagesResponse logMessages(List<LogMessage> logMessages) {
    this.logMessages = logMessages;
    return this;
  }

  public ListLogMessagesResponse addlogMessagesItem(LogMessage logMessagesItem) {
    if (this.logMessages == null) {
      this.logMessages = new ArrayList<>();
    }
    this.logMessages.add(logMessagesItem);
    return this;
  }

   /**
   * Get logMessages
   * @return logMessages
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogMessage> getLogMessages() {
    return logMessages;
  }


  @JsonProperty(JSON_PROPERTY_LOG_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogMessages(List<LogMessage> logMessages) {
    this.logMessages = logMessages;
  }


  public ListLogMessagesResponse meta(PaginationMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaginationMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this List_Log_Messages_Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLogMessagesResponse listLogMessagesResponse = (ListLogMessagesResponse) o;
    return Objects.equals(this.logMessages, listLogMessagesResponse.logMessages) &&
        Objects.equals(this.meta, listLogMessagesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logMessages, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLogMessagesResponse {\n");
    sb.append("    logMessages: ").append(toIndentedString(logMessages)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

