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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Current physical location data of a given SIM card. Accuracy is given in meters.
 */
@ApiModel(description = "Current physical location data of a given SIM card. Accuracy is given in meters.")
@JsonPropertyOrder({
  SIMCardCurrentDeviceLocation.JSON_PROPERTY_LATITUDE,
  SIMCardCurrentDeviceLocation.JSON_PROPERTY_LONGITUDE,
  SIMCardCurrentDeviceLocation.JSON_PROPERTY_ACCURACY,
  SIMCardCurrentDeviceLocation.JSON_PROPERTY_ACCURACY_UNIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SIMCardCurrentDeviceLocation {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Float latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Float longitude;

  public static final String JSON_PROPERTY_ACCURACY = "accuracy";
  private Integer accuracy;

  public static final String JSON_PROPERTY_ACCURACY_UNIT = "accuracy_unit";
  private String accuracyUnit = "m";

  public SIMCardCurrentDeviceLocation() { 
  }

  public SIMCardCurrentDeviceLocation latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "41.143", value = "")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }


  public SIMCardCurrentDeviceLocation longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "-8.605", value = "")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  public SIMCardCurrentDeviceLocation accuracy(Integer accuracy) {
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1250", value = "")
  @JsonProperty(JSON_PROPERTY_ACCURACY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAccuracy() {
    return accuracy;
  }


  @JsonProperty(JSON_PROPERTY_ACCURACY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }


  public SIMCardCurrentDeviceLocation accuracyUnit(String accuracyUnit) {
    this.accuracyUnit = accuracyUnit;
    return this;
  }

   /**
   * Get accuracyUnit
   * @return accuracyUnit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "m", value = "")
  @JsonProperty(JSON_PROPERTY_ACCURACY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccuracyUnit() {
    return accuracyUnit;
  }


  @JsonProperty(JSON_PROPERTY_ACCURACY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccuracyUnit(String accuracyUnit) {
    this.accuracyUnit = accuracyUnit;
  }


  /**
   * Return true if this SIMCard_current_device_location object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SIMCardCurrentDeviceLocation siMCardCurrentDeviceLocation = (SIMCardCurrentDeviceLocation) o;
    return Objects.equals(this.latitude, siMCardCurrentDeviceLocation.latitude) &&
        Objects.equals(this.longitude, siMCardCurrentDeviceLocation.longitude) &&
        Objects.equals(this.accuracy, siMCardCurrentDeviceLocation.accuracy) &&
        Objects.equals(this.accuracyUnit, siMCardCurrentDeviceLocation.accuracyUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, accuracy, accuracyUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SIMCardCurrentDeviceLocation {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    accuracyUnit: ").append(toIndentedString(accuracyUnit)).append("\n");
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

