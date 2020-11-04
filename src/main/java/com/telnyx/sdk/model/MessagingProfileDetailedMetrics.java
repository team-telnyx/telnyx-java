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
import com.telnyx.sdk.model.MessagingProfileDetailedMetric;
import com.telnyx.sdk.model.MessagingProfileHighLevelMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MessagingProfileDetailedMetrics
 */
@JsonPropertyOrder({
  MessagingProfileDetailedMetrics.JSON_PROPERTY_OVERVIEW,
  MessagingProfileDetailedMetrics.JSON_PROPERTY_DETAILED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessagingProfileDetailedMetrics {
  public static final String JSON_PROPERTY_OVERVIEW = "overview";
  private MessagingProfileHighLevelMetrics overview;

  public static final String JSON_PROPERTY_DETAILED = "detailed";
  private List<MessagingProfileDetailedMetric> detailed = null;


  public MessagingProfileDetailedMetrics overview(MessagingProfileHighLevelMetrics overview) {
    this.overview = overview;
    return this;
  }

   /**
   * Get overview
   * @return overview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessagingProfileHighLevelMetrics getOverview() {
    return overview;
  }


  public void setOverview(MessagingProfileHighLevelMetrics overview) {
    this.overview = overview;
  }


  public MessagingProfileDetailedMetrics detailed(List<MessagingProfileDetailedMetric> detailed) {
    this.detailed = detailed;
    return this;
  }

  public MessagingProfileDetailedMetrics addDetailedItem(MessagingProfileDetailedMetric detailedItem) {
    if (this.detailed == null) {
      this.detailed = new ArrayList<>();
    }
    this.detailed.add(detailedItem);
    return this;
  }

   /**
   * Get detailed
   * @return detailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MessagingProfileDetailedMetric> getDetailed() {
    return detailed;
  }


  public void setDetailed(List<MessagingProfileDetailedMetric> detailed) {
    this.detailed = detailed;
  }


  /**
   * Return true if this MessagingProfileDetailedMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProfileDetailedMetrics messagingProfileDetailedMetrics = (MessagingProfileDetailedMetrics) o;
    return Objects.equals(this.overview, messagingProfileDetailedMetrics.overview) &&
        Objects.equals(this.detailed, messagingProfileDetailedMetrics.detailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overview, detailed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingProfileDetailedMetrics {\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
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
