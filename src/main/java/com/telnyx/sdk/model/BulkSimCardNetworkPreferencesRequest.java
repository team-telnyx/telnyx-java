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
import com.telnyx.sdk.model.MobileNetworkOperatorPreferencesRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * BulkSimCardNetworkPreferencesRequest
 */
@JsonPropertyOrder({
  BulkSimCardNetworkPreferencesRequest.JSON_PROPERTY_SIM_CARD_IDS,
  BulkSimCardNetworkPreferencesRequest.JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class BulkSimCardNetworkPreferencesRequest {
  public static final String JSON_PROPERTY_SIM_CARD_IDS = "sim_card_ids";
  private List<UUID> simCardIds = null;

  public static final String JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES = "mobile_network_operators_preferences";
  private List<MobileNetworkOperatorPreferencesRequest> mobileNetworkOperatorsPreferences = null;

  public BulkSimCardNetworkPreferencesRequest() { 
  }

  public BulkSimCardNetworkPreferencesRequest simCardIds(List<UUID> simCardIds) {
    this.simCardIds = simCardIds;
    return this;
  }

  public BulkSimCardNetworkPreferencesRequest addsimCardIdsItem(UUID simCardIdsItem) {
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


  public BulkSimCardNetworkPreferencesRequest mobileNetworkOperatorsPreferences(List<MobileNetworkOperatorPreferencesRequest> mobileNetworkOperatorsPreferences) {
    this.mobileNetworkOperatorsPreferences = mobileNetworkOperatorsPreferences;
    return this;
  }

  public BulkSimCardNetworkPreferencesRequest addmobileNetworkOperatorsPreferencesItem(MobileNetworkOperatorPreferencesRequest mobileNetworkOperatorsPreferencesItem) {
    if (this.mobileNetworkOperatorsPreferences == null) {
      this.mobileNetworkOperatorsPreferences = new ArrayList<>();
    }
    this.mobileNetworkOperatorsPreferences.add(mobileNetworkOperatorsPreferencesItem);
    return this;
  }

   /**
   * A list of mobile network operators and the priority that should be applied when the SIM is connecting to the network.
   * @return mobileNetworkOperatorsPreferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of mobile network operators and the priority that should be applied when the SIM is connecting to the network.")
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MobileNetworkOperatorPreferencesRequest> getMobileNetworkOperatorsPreferences() {
    return mobileNetworkOperatorsPreferences;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileNetworkOperatorsPreferences(List<MobileNetworkOperatorPreferencesRequest> mobileNetworkOperatorsPreferences) {
    this.mobileNetworkOperatorsPreferences = mobileNetworkOperatorsPreferences;
  }


  /**
   * Return true if this BulkSimCardNetworkPreferences_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSimCardNetworkPreferencesRequest bulkSimCardNetworkPreferencesRequest = (BulkSimCardNetworkPreferencesRequest) o;
    return Objects.equals(this.simCardIds, bulkSimCardNetworkPreferencesRequest.simCardIds) &&
        Objects.equals(this.mobileNetworkOperatorsPreferences, bulkSimCardNetworkPreferencesRequest.mobileNetworkOperatorsPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simCardIds, mobileNetworkOperatorsPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSimCardNetworkPreferencesRequest {\n");
    sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
    sb.append("    mobileNetworkOperatorsPreferences: ").append(toIndentedString(mobileNetworkOperatorsPreferences)).append("\n");
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

