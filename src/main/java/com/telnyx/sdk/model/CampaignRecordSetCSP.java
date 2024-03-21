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
import com.telnyx.sdk.model.CampaignCSP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CampaignRecordSetCSP
 */
@JsonPropertyOrder({
  CampaignRecordSetCSP.JSON_PROPERTY_PAGE,
  CampaignRecordSetCSP.JSON_PROPERTY_RECORDS,
  CampaignRecordSetCSP.JSON_PROPERTY_TOTAL_RECORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CampaignRecordSetCSP {
  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_RECORDS = "records";
  private List<CampaignCSP> records = null;

  public static final String JSON_PROPERTY_TOTAL_RECORDS = "totalRecords";
  private Integer totalRecords;

  public CampaignRecordSetCSP() { 
  }

  public CampaignRecordSetCSP page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public CampaignRecordSetCSP records(List<CampaignCSP> records) {
    this.records = records;
    return this;
  }

  public CampaignRecordSetCSP addRecordsItem(CampaignCSP recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignCSP> getRecords() {
    return records;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecords(List<CampaignCSP> records) {
    this.records = records;
  }


  public CampaignRecordSetCSP totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

   /**
   * Get totalRecords
   * @return totalRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalRecords() {
    return totalRecords;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }


  /**
   * Return true if this CampaignRecordSet_CSP object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRecordSetCSP campaignRecordSetCSP = (CampaignRecordSetCSP) o;
    return Objects.equals(this.page, campaignRecordSetCSP.page) &&
        Objects.equals(this.records, campaignRecordSetCSP.records) &&
        Objects.equals(this.totalRecords, campaignRecordSetCSP.totalRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, records, totalRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRecordSetCSP {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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

