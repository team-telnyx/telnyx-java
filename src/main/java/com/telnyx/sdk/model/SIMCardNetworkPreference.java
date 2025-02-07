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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.MobileNetworkOperatorPreferencesResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * SIMCardNetworkPreference
 */
@JsonPropertyOrder(
    {
        SIMCardNetworkPreference.JSON_PROPERTY_RECORD_TYPE,
        SIMCardNetworkPreference.JSON_PROPERTY_SIM_CARD_ID,
        SIMCardNetworkPreference.JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES,
        SIMCardNetworkPreference.JSON_PROPERTY_CREATED_AT,
        SIMCardNetworkPreference.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class SIMCardNetworkPreference {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_SIM_CARD_ID = "sim_card_id";
    private UUID simCardId;

    public static final String JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES =
        "mobile_network_operators_preferences";
    private List<
        MobileNetworkOperatorPreferencesResponse
    > mobileNetworkOperatorsPreferences = null;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public SIMCardNetworkPreference() {}

    @JsonCreator
    public SIMCardNetworkPreference(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
    ) {
        this();
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "sim_card_network_preferences", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    public SIMCardNetworkPreference simCardId(UUID simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * Get simCardId
     * @return simCardId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "6b14e151-8493-4fa1-8664-1cc4e6d14158",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getSimCardId() {
        return simCardId;
    }

    @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSimCardId(UUID simCardId) {
        this.simCardId = simCardId;
    }

    public SIMCardNetworkPreference mobileNetworkOperatorsPreferences(
        List<
            MobileNetworkOperatorPreferencesResponse
        > mobileNetworkOperatorsPreferences
    ) {
        this.mobileNetworkOperatorsPreferences =
            mobileNetworkOperatorsPreferences;
        return this;
    }

    public SIMCardNetworkPreference addMobileNetworkOperatorsPreferencesItem(
        MobileNetworkOperatorPreferencesResponse mobileNetworkOperatorsPreferencesItem
    ) {
        if (this.mobileNetworkOperatorsPreferences == null) {
            this.mobileNetworkOperatorsPreferences = new ArrayList<>();
        }
        this.mobileNetworkOperatorsPreferences.add(
                mobileNetworkOperatorsPreferencesItem
            );
        return this;
    }

    /**
     * A list of mobile network operators and the priority that should be applied when the SIM is connecting to the network.
     * @return mobileNetworkOperatorsPreferences
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "A list of mobile network operators and the priority that should be applied when the SIM is connecting to the network."
    )
    @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        MobileNetworkOperatorPreferencesResponse
    > getMobileNetworkOperatorsPreferences() {
        return mobileNetworkOperatorsPreferences;
    }

    @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMobileNetworkOperatorsPreferences(
        List<
            MobileNetworkOperatorPreferencesResponse
        > mobileNetworkOperatorsPreferences
    ) {
        this.mobileNetworkOperatorsPreferences =
            mobileNetworkOperatorsPreferences;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Return true if this SIMCardNetworkPreference object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardNetworkPreference siMCardNetworkPreference =
            (SIMCardNetworkPreference) o;
        return (
            Objects.equals(
                this.recordType,
                siMCardNetworkPreference.recordType
            ) &&
            Objects.equals(
                this.simCardId,
                siMCardNetworkPreference.simCardId
            ) &&
            Objects.equals(
                this.mobileNetworkOperatorsPreferences,
                siMCardNetworkPreference.mobileNetworkOperatorsPreferences
            ) &&
            Objects.equals(
                this.createdAt,
                siMCardNetworkPreference.createdAt
            ) &&
            Objects.equals(this.updatedAt, siMCardNetworkPreference.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            simCardId,
            mobileNetworkOperatorsPreferences,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardNetworkPreference {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    simCardId: ")
            .append(toIndentedString(simCardId))
            .append("\n");
        sb
            .append("    mobileNetworkOperatorsPreferences: ")
            .append(toIndentedString(mobileNetworkOperatorsPreferences))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
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
