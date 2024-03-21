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
import com.telnyx.sdk.model.SoleProprietorData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * BulkCreationRequest
 */
@JsonPropertyOrder({
  BulkCreationRequest.JSON_PROPERTY_BRANDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkCreationRequest {
  public static final String JSON_PROPERTY_BRANDS = "brands";
  private List<SoleProprietorData> brands = new ArrayList<>();

  public BulkCreationRequest() { 
  }

  public BulkCreationRequest brands(List<SoleProprietorData> brands) {
    this.brands = brands;
    return this;
  }

  public BulkCreationRequest addBrandsItem(SoleProprietorData brandsItem) {
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * Get brands
   * @return brands
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BRANDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SoleProprietorData> getBrands() {
    return brands;
  }


  @JsonProperty(JSON_PROPERTY_BRANDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrands(List<SoleProprietorData> brands) {
    this.brands = brands;
  }


  /**
   * Return true if this BulkCreationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCreationRequest bulkCreationRequest = (BulkCreationRequest) o;
    return Objects.equals(this.brands, bulkCreationRequest.brands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCreationRequest {\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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

