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
import com.telnyx.sdk.model.PaginationMeta;
import com.telnyx.sdk.model.VirtualCrossConnectRegion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VirtaulCrossConnectRegionList200Response
 */
@JsonPropertyOrder({
  VirtaulCrossConnectRegionList200Response.JSON_PROPERTY_DATA,
  VirtaulCrossConnectRegionList200Response.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtaulCrossConnectRegionList200Response {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<VirtualCrossConnectRegion> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public VirtaulCrossConnectRegionList200Response() { 
  }

  public VirtaulCrossConnectRegionList200Response data(List<VirtualCrossConnectRegion> data) {
    this.data = data;
    return this;
  }

  public VirtaulCrossConnectRegionList200Response addDataItem(VirtualCrossConnectRegion dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VirtualCrossConnectRegion> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<VirtualCrossConnectRegion> data) {
    this.data = data;
  }


  public VirtaulCrossConnectRegionList200Response meta(PaginationMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
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
   * Return true if this VirtaulCrossConnectRegionList_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtaulCrossConnectRegionList200Response virtaulCrossConnectRegionList200Response = (VirtaulCrossConnectRegionList200Response) o;
    return Objects.equals(this.data, virtaulCrossConnectRegionList200Response.data) &&
        Objects.equals(this.meta, virtaulCrossConnectRegionList200Response.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtaulCrossConnectRegionList200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

