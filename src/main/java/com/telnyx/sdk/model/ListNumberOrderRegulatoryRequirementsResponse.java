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
import com.telnyx.sdk.model.RegulatoryRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ListNumberOrderRegulatoryRequirementsResponse
 */
@JsonPropertyOrder({
  ListNumberOrderRegulatoryRequirementsResponse.JSON_PROPERTY_DATA,
  ListNumberOrderRegulatoryRequirementsResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListNumberOrderRegulatoryRequirementsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<RegulatoryRequirement> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;


  public ListNumberOrderRegulatoryRequirementsResponse data(List<RegulatoryRequirement> data) {
    this.data = data;
    return this;
  }

  public ListNumberOrderRegulatoryRequirementsResponse addDataItem(RegulatoryRequirement dataItem) {
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

  public List<RegulatoryRequirement> getData() {
    return data;
  }


  public void setData(List<RegulatoryRequirement> data) {
    this.data = data;
  }


  public ListNumberOrderRegulatoryRequirementsResponse meta(PaginationMeta meta) {
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


  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this List_Number_Order_Regulatory_Requirements_Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListNumberOrderRegulatoryRequirementsResponse listNumberOrderRegulatoryRequirementsResponse = (ListNumberOrderRegulatoryRequirementsResponse) o;
    return Objects.equals(this.data, listNumberOrderRegulatoryRequirementsResponse.data) &&
        Objects.equals(this.meta, listNumberOrderRegulatoryRequirementsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListNumberOrderRegulatoryRequirementsResponse {\n");
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

