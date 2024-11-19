/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import com.telnyx.sdk.model.PaginationMeta;
import com.telnyx.sdk.model.RegulatoryRequirementsPhoneNumbers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ListRegulatoryRequirementsPhoneNumbers200Response
 */
@JsonPropertyOrder({
  ListRegulatoryRequirementsPhoneNumbers200Response.JSON_PROPERTY_DATA,
  ListRegulatoryRequirementsPhoneNumbers200Response.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ListRegulatoryRequirementsPhoneNumbers200Response {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<RegulatoryRequirementsPhoneNumbers> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public ListRegulatoryRequirementsPhoneNumbers200Response() { 
  }

  public ListRegulatoryRequirementsPhoneNumbers200Response data(List<RegulatoryRequirementsPhoneNumbers> data) {
    this.data = data;
    return this;
  }

  public ListRegulatoryRequirementsPhoneNumbers200Response adddataItem(RegulatoryRequirementsPhoneNumbers dataItem) {
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

  public List<RegulatoryRequirementsPhoneNumbers> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<RegulatoryRequirementsPhoneNumbers> data) {
    this.data = data;
  }


  public ListRegulatoryRequirementsPhoneNumbers200Response meta(PaginationMeta meta) {
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
   * Return true if this ListRegulatoryRequirementsPhoneNumbers_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRegulatoryRequirementsPhoneNumbers200Response listRegulatoryRequirementsPhoneNumbers200Response = (ListRegulatoryRequirementsPhoneNumbers200Response) o;
    return Objects.equals(this.data, listRegulatoryRequirementsPhoneNumbers200Response.data) &&
        Objects.equals(this.meta, listRegulatoryRequirementsPhoneNumbers200Response.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRegulatoryRequirementsPhoneNumbers200Response {\n");
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

