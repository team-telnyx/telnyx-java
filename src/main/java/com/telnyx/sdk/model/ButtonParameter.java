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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ButtonParameter
 */
@JsonPropertyOrder({
  ButtonParameter.JSON_PROPERTY_TYPE,
  ButtonParameter.JSON_PROPERTY_PAYLOAD,
  ButtonParameter.JSON_PROPERTY_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ButtonParameter {
  public static final String JSON_PROPERTY_TYPE = "type";
  private Object type = null;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private JsonNullable<Object> payload = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<Object> text = JsonNullable.<Object>of(null);

  public ButtonParameter() { 
  }

  public ButtonParameter type(Object type) {
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

  public Object getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(Object type) {
    this.type = type;
  }


  public ButtonParameter payload(Object payload) {
    this.payload = JsonNullable.<Object>of(payload);
    return this;
  }

   /**
   * Developer-defined payload that will be returned when the button is clicked in addition to the display text on the button. Required for quick_reply buttons.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Developer-defined payload that will be returned when the button is clicked in addition to the display text on the button. Required for quick_reply buttons.")
  @JsonIgnore

  public Object getPayload() {
        return payload.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPayload_JsonNullable() {
    return payload;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  public void setPayload_JsonNullable(JsonNullable<Object> payload) {
    this.payload = payload;
  }

  public void setPayload(Object payload) {
    this.payload = JsonNullable.<Object>of(payload);
  }


  public ButtonParameter text(Object text) {
    this.text = JsonNullable.<Object>of(text);
    return this;
  }

   /**
   * Developer provided suffix that will be appended to a previously created dynamic URL button. Required for url buttons.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Developer provided suffix that will be appended to a previously created dynamic URL button. Required for url buttons.")
  @JsonIgnore

  public Object getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<Object> text) {
    this.text = text;
  }

  public void setText(Object text) {
    this.text = JsonNullable.<Object>of(text);
  }


  /**
   * Return true if this ButtonParameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ButtonParameter buttonParameter = (ButtonParameter) o;
    return Objects.equals(this.type, buttonParameter.type) &&
        equalsNullable(this.payload, buttonParameter.payload) &&
        equalsNullable(this.text, buttonParameter.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hashCodeNullable(payload), hashCodeNullable(text));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ButtonParameter {\n");
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

