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
import com.telnyx.sdk.model.ButtonParameterType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * TemplateButtonParameter
 */
@JsonPropertyOrder({
  TemplateButtonParameter.JSON_PROPERTY_TYPE,
  TemplateButtonParameter.JSON_PROPERTY_PAYLOAD,
  TemplateButtonParameter.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateButtonParameter {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ButtonParameterType type;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public TemplateButtonParameter() { 
  }

  public TemplateButtonParameter type(ButtonParameterType type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of parameter for the button.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates the type of parameter for the button.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ButtonParameterType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ButtonParameterType type) {
    this.type = type;
  }


  public TemplateButtonParameter payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Required for quick_reply buttons. Developer-defined payload that will be returned when the button is clicked in addition to the display text on the button.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required for quick_reply buttons. Developer-defined payload that will be returned when the button is clicked in addition to the display text on the button.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(String payload) {
    this.payload = payload;
  }


  public TemplateButtonParameter text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Required for url buttons. Developer provided suffix that will be appended to a previously created dynamic URL button.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required for url buttons. Developer provided suffix that will be appended to a previously created dynamic URL button.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Return true if this TemplateButtonParameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateButtonParameter templateButtonParameter = (TemplateButtonParameter) o;
    return Objects.equals(this.type, templateButtonParameter.type) &&
        Objects.equals(this.payload, templateButtonParameter.payload) &&
        Objects.equals(this.text, templateButtonParameter.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, payload, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateButtonParameter {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
