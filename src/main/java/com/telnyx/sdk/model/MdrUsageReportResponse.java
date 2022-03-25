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
import com.telnyx.sdk.model.MdrUsageRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MdrUsageReportResponse
 */
@JsonPropertyOrder({
  MdrUsageReportResponse.JSON_PROPERTY_ID,
  MdrUsageReportResponse.JSON_PROPERTY_START_DATE,
  MdrUsageReportResponse.JSON_PROPERTY_END_DATE,
  MdrUsageReportResponse.JSON_PROPERTY_CONNECTIONS,
  MdrUsageReportResponse.JSON_PROPERTY_AGGREGATION_TYPE,
  MdrUsageReportResponse.JSON_PROPERTY_STATUS,
  MdrUsageReportResponse.JSON_PROPERTY_REPORT_URL,
  MdrUsageReportResponse.JSON_PROPERTY_RESULT,
  MdrUsageReportResponse.JSON_PROPERTY_CREATED_AT,
  MdrUsageReportResponse.JSON_PROPERTY_UPDATED_AT,
  MdrUsageReportResponse.JSON_PROPERTY_PROFILES,
  MdrUsageReportResponse.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MdrUsageReportResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_CONNECTIONS = "connections";
  private List<Long> connections = null;

  /**
   * Gets or Sets aggregationType
   */
  public enum AggregationTypeEnum {
    NO_AGGREGATION("NO_AGGREGATION"),
    
    PROFILE("PROFILE"),
    
    TAGS("TAGS");

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

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    COMPLETE("COMPLETE"),
    
    FAILED("FAILED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_REPORT_URL = "report_url";
  private String reportUrl;

  public static final String JSON_PROPERTY_RESULT = "result";
  private List<MdrUsageRecord> result = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private String profiles;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public MdrUsageReportResponse() { 
  }

  public MdrUsageReportResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the resource
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the resource")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public MdrUsageReportResponse startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public MdrUsageReportResponse endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public MdrUsageReportResponse connections(List<Long> connections) {
    this.connections = connections;
    return this;
  }

  public MdrUsageReportResponse addConnectionsItem(Long connectionsItem) {
    if (this.connections == null) {
      this.connections = new ArrayList<>();
    }
    this.connections.add(connectionsItem);
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConnections() {
    return connections;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnections(List<Long> connections) {
    this.connections = connections;
  }


  public MdrUsageReportResponse aggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Get aggregationType
   * @return aggregationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }


  public MdrUsageReportResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public MdrUsageReportResponse reportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
    return this;
  }

   /**
   * Get reportUrl
   * @return reportUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv", value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportUrl() {
    return reportUrl;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
  }


  public MdrUsageReportResponse result(List<MdrUsageRecord> result) {
    this.result = result;
    return this;
  }

  public MdrUsageReportResponse addResultItem(MdrUsageRecord resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MdrUsageRecord> getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(List<MdrUsageRecord> result) {
    this.result = result;
  }


  public MdrUsageReportResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MdrUsageReportResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-01T00:00-06:00", value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public MdrUsageReportResponse profiles(String profiles) {
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


  public MdrUsageReportResponse recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mdr_usage_report", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  /**
   * Return true if this MdrUsageReportResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdrUsageReportResponse mdrUsageReportResponse = (MdrUsageReportResponse) o;
    return Objects.equals(this.id, mdrUsageReportResponse.id) &&
        Objects.equals(this.startDate, mdrUsageReportResponse.startDate) &&
        Objects.equals(this.endDate, mdrUsageReportResponse.endDate) &&
        Objects.equals(this.connections, mdrUsageReportResponse.connections) &&
        Objects.equals(this.aggregationType, mdrUsageReportResponse.aggregationType) &&
        Objects.equals(this.status, mdrUsageReportResponse.status) &&
        Objects.equals(this.reportUrl, mdrUsageReportResponse.reportUrl) &&
        Objects.equals(this.result, mdrUsageReportResponse.result) &&
        Objects.equals(this.createdAt, mdrUsageReportResponse.createdAt) &&
        Objects.equals(this.updatedAt, mdrUsageReportResponse.updatedAt) &&
        Objects.equals(this.profiles, mdrUsageReportResponse.profiles) &&
        Objects.equals(this.recordType, mdrUsageReportResponse.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startDate, endDate, connections, aggregationType, status, reportUrl, result, createdAt, updatedAt, profiles, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdrUsageReportResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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
