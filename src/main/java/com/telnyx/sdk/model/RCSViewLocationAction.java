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
import com.telnyx.sdk.model.RCSLatLng;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Opens the user&#39;s default map app and selects the agent-specified location.
 */
@ApiModel(description = "Opens the user's default map app and selects the agent-specified location.")
@JsonPropertyOrder({
  RCSViewLocationAction.JSON_PROPERTY_LAT_LONG,
  RCSViewLocationAction.JSON_PROPERTY_LABEL,
  RCSViewLocationAction.JSON_PROPERTY_QUERY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class RCSViewLocationAction {
  public static final String JSON_PROPERTY_LAT_LONG = "lat_long";
  private RCSLatLng latLong;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public RCSViewLocationAction() { 
  }

  public RCSViewLocationAction latLong(RCSLatLng latLong) {
    this.latLong = latLong;
    return this;
  }

   /**
   * Get latLong
   * @return latLong
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAT_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RCSLatLng getLatLong() {
    return latLong;
  }


  @JsonProperty(JSON_PROPERTY_LAT_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatLong(RCSLatLng latLong) {
    this.latLong = latLong;
  }


  public RCSViewLocationAction label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label of the pin dropped
   * @return label
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The label of the pin dropped")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public RCSViewLocationAction query(String query) {
    this.query = query;
    return this;
  }

   /**
   * query string (Android only)
   * @return query
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "query string (Android only)")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(String query) {
    this.query = query;
  }


  /**
   * Return true if this RCSViewLocationAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RCSViewLocationAction rcSViewLocationAction = (RCSViewLocationAction) o;
    return Objects.equals(this.latLong, rcSViewLocationAction.latLong) &&
        Objects.equals(this.label, rcSViewLocationAction.label) &&
        Objects.equals(this.query, rcSViewLocationAction.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latLong, label, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RCSViewLocationAction {\n");
    sb.append("    latLong: ").append(toIndentedString(latLong)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

