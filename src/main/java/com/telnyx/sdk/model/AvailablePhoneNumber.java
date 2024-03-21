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
import com.telnyx.sdk.model.CostInformation;
import com.telnyx.sdk.model.Feature;
import com.telnyx.sdk.model.RegionInformation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * AvailablePhoneNumber
 */
@JsonPropertyOrder({
  AvailablePhoneNumber.JSON_PROPERTY_RECORD_TYPE,
  AvailablePhoneNumber.JSON_PROPERTY_PHONE_NUMBER,
  AvailablePhoneNumber.JSON_PROPERTY_VANITY_FORMAT,
  AvailablePhoneNumber.JSON_PROPERTY_BEST_EFFORT,
  AvailablePhoneNumber.JSON_PROPERTY_QUICKSHIP,
  AvailablePhoneNumber.JSON_PROPERTY_RESERVABLE,
  AvailablePhoneNumber.JSON_PROPERTY_REGION_INFORMATION,
  AvailablePhoneNumber.JSON_PROPERTY_COST_INFORMATION,
  AvailablePhoneNumber.JSON_PROPERTY_FEATURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AvailablePhoneNumber {
  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    AVAILABLE_PHONE_NUMBER("available_phone_number");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_VANITY_FORMAT = "vanity_format";
  private String vanityFormat;

  public static final String JSON_PROPERTY_BEST_EFFORT = "best_effort";
  private Boolean bestEffort;

  public static final String JSON_PROPERTY_QUICKSHIP = "quickship";
  private Boolean quickship;

  public static final String JSON_PROPERTY_RESERVABLE = "reservable";
  private Boolean reservable;

  public static final String JSON_PROPERTY_REGION_INFORMATION = "region_information";
  private List<RegionInformation> regionInformation = null;

  public static final String JSON_PROPERTY_COST_INFORMATION = "cost_information";
  private CostInformation costInformation;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<Feature> features = null;

  public AvailablePhoneNumber() { 
  }

  public AvailablePhoneNumber recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "available_phone_number", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public AvailablePhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19705555098", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AvailablePhoneNumber vanityFormat(String vanityFormat) {
    this.vanityFormat = vanityFormat;
    return this;
  }

   /**
   * Get vanityFormat
   * @return vanityFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VANITY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVanityFormat() {
    return vanityFormat;
  }


  @JsonProperty(JSON_PROPERTY_VANITY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVanityFormat(String vanityFormat) {
    this.vanityFormat = vanityFormat;
  }


  public AvailablePhoneNumber bestEffort(Boolean bestEffort) {
    this.bestEffort = bestEffort;
    return this;
  }

   /**
   * Specifies whether the phone number is an exact match based on the search criteria or not.
   * @return bestEffort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Specifies whether the phone number is an exact match based on the search criteria or not.")
  @JsonProperty(JSON_PROPERTY_BEST_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBestEffort() {
    return bestEffort;
  }


  @JsonProperty(JSON_PROPERTY_BEST_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBestEffort(Boolean bestEffort) {
    this.bestEffort = bestEffort;
  }


  public AvailablePhoneNumber quickship(Boolean quickship) {
    this.quickship = quickship;
    return this;
  }

   /**
   * Specifies whether the phone number can receive calls immediately after purchase or not.
   * @return quickship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether the phone number can receive calls immediately after purchase or not.")
  @JsonProperty(JSON_PROPERTY_QUICKSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getQuickship() {
    return quickship;
  }


  @JsonProperty(JSON_PROPERTY_QUICKSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuickship(Boolean quickship) {
    this.quickship = quickship;
  }


  public AvailablePhoneNumber reservable(Boolean reservable) {
    this.reservable = reservable;
    return this;
  }

   /**
   * Specifies whether the phone number can be reserved before purchase or not.
   * @return reservable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies whether the phone number can be reserved before purchase or not.")
  @JsonProperty(JSON_PROPERTY_RESERVABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReservable() {
    return reservable;
  }


  @JsonProperty(JSON_PROPERTY_RESERVABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReservable(Boolean reservable) {
    this.reservable = reservable;
  }


  public AvailablePhoneNumber regionInformation(List<RegionInformation> regionInformation) {
    this.regionInformation = regionInformation;
    return this;
  }

  public AvailablePhoneNumber addRegionInformationItem(RegionInformation regionInformationItem) {
    if (this.regionInformation == null) {
      this.regionInformation = new ArrayList<>();
    }
    this.regionInformation.add(regionInformationItem);
    return this;
  }

   /**
   * Get regionInformation
   * @return regionInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RegionInformation> getRegionInformation() {
    return regionInformation;
  }


  @JsonProperty(JSON_PROPERTY_REGION_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionInformation(List<RegionInformation> regionInformation) {
    this.regionInformation = regionInformation;
  }


  public AvailablePhoneNumber costInformation(CostInformation costInformation) {
    this.costInformation = costInformation;
    return this;
  }

   /**
   * Get costInformation
   * @return costInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CostInformation getCostInformation() {
    return costInformation;
  }


  @JsonProperty(JSON_PROPERTY_COST_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostInformation(CostInformation costInformation) {
    this.costInformation = costInformation;
  }


  public AvailablePhoneNumber features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public AvailablePhoneNumber addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Feature> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }


  /**
   * Return true if this AvailablePhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePhoneNumber availablePhoneNumber = (AvailablePhoneNumber) o;
    return Objects.equals(this.recordType, availablePhoneNumber.recordType) &&
        Objects.equals(this.phoneNumber, availablePhoneNumber.phoneNumber) &&
        Objects.equals(this.vanityFormat, availablePhoneNumber.vanityFormat) &&
        Objects.equals(this.bestEffort, availablePhoneNumber.bestEffort) &&
        Objects.equals(this.quickship, availablePhoneNumber.quickship) &&
        Objects.equals(this.reservable, availablePhoneNumber.reservable) &&
        Objects.equals(this.regionInformation, availablePhoneNumber.regionInformation) &&
        Objects.equals(this.costInformation, availablePhoneNumber.costInformation) &&
        Objects.equals(this.features, availablePhoneNumber.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, phoneNumber, vanityFormat, bestEffort, quickship, reservable, regionInformation, costInformation, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePhoneNumber {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    vanityFormat: ").append(toIndentedString(vanityFormat)).append("\n");
    sb.append("    bestEffort: ").append(toIndentedString(bestEffort)).append("\n");
    sb.append("    quickship: ").append(toIndentedString(quickship)).append("\n");
    sb.append("    reservable: ").append(toIndentedString(reservable)).append("\n");
    sb.append("    regionInformation: ").append(toIndentedString(regionInformation)).append("\n");
    sb.append("    costInformation: ").append(toIndentedString(costInformation)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

