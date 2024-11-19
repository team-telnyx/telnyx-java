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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MdrPostUsageReportRequest
 */
@JsonPropertyOrder({
  MdrPostUsageReportRequest.JSON_PROPERTY_START_DATE,
  MdrPostUsageReportRequest.JSON_PROPERTY_END_DATE,
  MdrPostUsageReportRequest.JSON_PROPERTY_AGGREGATION_TYPE,
  MdrPostUsageReportRequest.JSON_PROPERTY_PROFILES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class MdrPostUsageReportRequest {
  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  /**
   * Gets or Sets aggregationType
   */
  public enum AggregationTypeEnum {
    NO_AGGREGATION(String.valueOf("NO_AGGREGATION")),
    
    PROFILE(String.valueOf("PROFILE")),
    
    TAGS(String.valueOf("TAGS"));

    private String value;

    AggregationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AggregationTypeEnum fromValue(String value) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AGGREGATION_TYPE = "aggregation_type";
  private AggregationTypeEnum aggregationType;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private String profiles;

  public MdrPostUsageReportRequest() { 
  }

  public MdrPostUsageReportRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public MdrPostUsageReportRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public MdrPostUsageReportRequest aggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Get aggregationType
   * @return aggregationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }


  public MdrPostUsageReportRequest profiles(String profiles) {
    this.profiles = profiles;
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My profile", value = "")
  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfiles() {
    return profiles;
  }


  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfiles(String profiles) {
    this.profiles = profiles;
  }


  /**
   * Return true if this MdrPostUsageReportRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdrPostUsageReportRequest mdrPostUsageReportRequest = (MdrPostUsageReportRequest) o;
    return Objects.equals(this.startDate, mdrPostUsageReportRequest.startDate) &&
        Objects.equals(this.endDate, mdrPostUsageReportRequest.endDate) &&
        Objects.equals(this.aggregationType, mdrPostUsageReportRequest.aggregationType) &&
        Objects.equals(this.profiles, mdrPostUsageReportRequest.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, aggregationType, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdrPostUsageReportRequest {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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

