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
import com.telnyx.sdk.model.MobileOperatorNetworkPreferencesRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * BulkSIMCardNetworkPreferencesRequest
 */
@JsonPropertyOrder({
  BulkSIMCardNetworkPreferencesRequest.JSON_PROPERTY_SIM_CARD_IDS,
  BulkSIMCardNetworkPreferencesRequest.JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BulkSIMCardNetworkPreferencesRequest {
  public static final String JSON_PROPERTY_SIM_CARD_IDS = "sim_card_ids";
  private List<UUID> simCardIds = null;

  public static final String JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES = "mobile_operator_networks_preferences";
  private List<MobileOperatorNetworkPreferencesRequest> mobileOperatorNetworksPreferences = null;

  public BulkSIMCardNetworkPreferencesRequest() { 
  }

  public BulkSIMCardNetworkPreferencesRequest simCardIds(List<UUID> simCardIds) {
    this.simCardIds = simCardIds;
    return this;
  }

  public BulkSIMCardNetworkPreferencesRequest addSimCardIdsItem(UUID simCardIdsItem) {
    if (this.simCardIds == null) {
      this.simCardIds = new ArrayList<>();
    }
    this.simCardIds.add(simCardIdsItem);
    return this;
  }

   /**
   * Get simCardIds
   * @return simCardIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"6b14e151-8493-4fa1-8664-1cc4e6d14158\",\"6b14e151-8493-4fa1-8664-1cc4e6d14158\"]", value = "")
  @JsonProperty(JSON_PROPERTY_SIM_CARD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getSimCardIds() {
    return simCardIds;
  }


  @JsonProperty(JSON_PROPERTY_SIM_CARD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimCardIds(List<UUID> simCardIds) {
    this.simCardIds = simCardIds;
  }


  public BulkSIMCardNetworkPreferencesRequest mobileOperatorNetworksPreferences(List<MobileOperatorNetworkPreferencesRequest> mobileOperatorNetworksPreferences) {
    this.mobileOperatorNetworksPreferences = mobileOperatorNetworksPreferences;
    return this;
  }

  public BulkSIMCardNetworkPreferencesRequest addMobileOperatorNetworksPreferencesItem(MobileOperatorNetworkPreferencesRequest mobileOperatorNetworksPreferencesItem) {
    if (this.mobileOperatorNetworksPreferences == null) {
      this.mobileOperatorNetworksPreferences = new ArrayList<>();
    }
    this.mobileOperatorNetworksPreferences.add(mobileOperatorNetworksPreferencesItem);
    return this;
  }

   /**
   * A list of mobile operator networks and the priority that should be applied when the SIM is connecting to the network.
   * @return mobileOperatorNetworksPreferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of mobile operator networks and the priority that should be applied when the SIM is connecting to the network.")
  @JsonProperty(JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MobileOperatorNetworkPreferencesRequest> getMobileOperatorNetworksPreferences() {
    return mobileOperatorNetworksPreferences;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_OPERATOR_NETWORKS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileOperatorNetworksPreferences(List<MobileOperatorNetworkPreferencesRequest> mobileOperatorNetworksPreferences) {
    this.mobileOperatorNetworksPreferences = mobileOperatorNetworksPreferences;
  }


  /**
   * Return true if this BulkSIMCardNetworkPreferences_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSIMCardNetworkPreferencesRequest bulkSIMCardNetworkPreferencesRequest = (BulkSIMCardNetworkPreferencesRequest) o;
    return Objects.equals(this.simCardIds, bulkSIMCardNetworkPreferencesRequest.simCardIds) &&
        Objects.equals(this.mobileOperatorNetworksPreferences, bulkSIMCardNetworkPreferencesRequest.mobileOperatorNetworksPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simCardIds, mobileOperatorNetworksPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSIMCardNetworkPreferencesRequest {\n");
    sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
    sb.append("    mobileOperatorNetworksPreferences: ").append(toIndentedString(mobileOperatorNetworksPreferences)).append("\n");
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

