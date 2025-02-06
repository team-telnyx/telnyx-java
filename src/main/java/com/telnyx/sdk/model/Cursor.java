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
 * Cursor
 */
@JsonPropertyOrder({
  Cursor.JSON_PROPERTY_AFTER,
  Cursor.JSON_PROPERTY_BEFORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Cursor {
  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public static final String JSON_PROPERTY_BEFORE = "before";
  private String before;

  public Cursor() { 
  }

  public Cursor after(String after) {
    this.after = after;
    return this;
  }

   /**
   * Opaque identifier of next page.
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI=", value = "Opaque identifier of next page.")
  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfter() {
    return after;
  }


  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfter(String after) {
    this.after = after;
  }


  public Cursor before(String before) {
    this.before = before;
    return this;
  }

   /**
   * Opaque identifier of previous page.
   * @return before
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v1:g3QAAAADZAAKdGVsbnl4X2lkc2wAAAABbQAAACRlYmRiYzdkNi1kZWRmLTExZWQtYTM3MS0wMjQyMGFlZjAwYjRqZAAJdGltZXN0YW1wbggA8Le4pGhpVxdkAAR0eXBlZAAFYWZ0ZXI=", value = "Opaque identifier of previous page.")
  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBefore() {
    return before;
  }


  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBefore(String before) {
    this.before = before;
  }


  /**
   * Return true if this Cursor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cursor cursor = (Cursor) o;
    return Objects.equals(this.after, cursor.after) &&
        Objects.equals(this.before, cursor.before);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cursor {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
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

