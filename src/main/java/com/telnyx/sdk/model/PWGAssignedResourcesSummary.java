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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The summary of the resource that have been assigned to the Private Wireless Gateway
 */
@ApiModel(description = "The summary of the resource that have been assigned to the Private Wireless Gateway")
@JsonPropertyOrder({
  PWGAssignedResourcesSummary.JSON_PROPERTY_RECORD_TYPE,
  PWGAssignedResourcesSummary.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PWGAssignedResourcesSummary {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public PWGAssignedResourcesSummary() { 
  }

  @JsonCreator
  public PWGAssignedResourcesSummary(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_COUNT) Integer count
  ) {
    this();
    this.recordType = recordType;
    this.count = count;
  }

   /**
   * The type of the resource assigned to the Private Wireless Gateway
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sim_card_group", value = "The type of the resource assigned to the Private Wireless Gateway")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The current count of a resource type assigned to the Private Wireless Gateway
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The current count of a resource type assigned to the Private Wireless Gateway")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }




  /**
   * Return true if this PWGAssignedResourcesSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PWGAssignedResourcesSummary pwGAssignedResourcesSummary = (PWGAssignedResourcesSummary) o;
    return Objects.equals(this.recordType, pwGAssignedResourcesSummary.recordType) &&
        Objects.equals(this.count, pwGAssignedResourcesSummary.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PWGAssignedResourcesSummary {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

