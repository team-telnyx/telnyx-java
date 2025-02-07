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
 * GatherUsingAIRequestMessageHistoryInner
 */
@JsonPropertyOrder({
  GatherUsingAIRequestMessageHistoryInner.JSON_PROPERTY_CONTENT,
  GatherUsingAIRequestMessageHistoryInner.JSON_PROPERTY_ROLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GatherUsingAIRequestMessageHistoryInner {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  /**
   * The role of the message sender
   */
  public enum RoleEnum {
    ASSISTANT(String.valueOf("assistant")),
    
    USER(String.valueOf("user"));

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  public GatherUsingAIRequestMessageHistoryInner() { 
  }

  public GatherUsingAIRequestMessageHistoryInner content(String content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the message
   * @return content
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Hello, I'm 29 and I live in Paris.", value = "The content of the message")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public GatherUsingAIRequestMessageHistoryInner role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the message sender
   * @return role
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "user", value = "The role of the message sender")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * Return true if this GatherUsingAIRequest_message_history_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatherUsingAIRequestMessageHistoryInner gatherUsingAIRequestMessageHistoryInner = (GatherUsingAIRequestMessageHistoryInner) o;
    return Objects.equals(this.content, gatherUsingAIRequestMessageHistoryInner.content) &&
        Objects.equals(this.role, gatherUsingAIRequestMessageHistoryInner.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatherUsingAIRequestMessageHistoryInner {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

