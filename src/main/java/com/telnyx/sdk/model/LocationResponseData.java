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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * LocationResponseData
 */
@JsonPropertyOrder(
    {
        LocationResponseData.JSON_PROPERTY_LOCATION_ID,
        LocationResponseData.JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID,
        LocationResponseData.JSON_PROPERTY_ACCEPTED_ADDRESS_SUGGESTIONS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class LocationResponseData {

    public static final String JSON_PROPERTY_LOCATION_ID = "location_id";
    private UUID locationId;

    public static final String JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID =
        "static_emergency_address_id";
    private UUID staticEmergencyAddressId;

    public static final String JSON_PROPERTY_ACCEPTED_ADDRESS_SUGGESTIONS =
        "accepted_address_suggestions";
    private Boolean acceptedAddressSuggestions;

    public LocationResponseData() {}

    public LocationResponseData locationId(UUID locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * Get locationId
     * @return locationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LOCATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getLocationId() {
        return locationId;
    }

    @JsonProperty(JSON_PROPERTY_LOCATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public LocationResponseData staticEmergencyAddressId(
        UUID staticEmergencyAddressId
    ) {
        this.staticEmergencyAddressId = staticEmergencyAddressId;
        return this;
    }

    /**
     * Get staticEmergencyAddressId
     * @return staticEmergencyAddressId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getStaticEmergencyAddressId() {
        return staticEmergencyAddressId;
    }

    @JsonProperty(JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStaticEmergencyAddressId(UUID staticEmergencyAddressId) {
        this.staticEmergencyAddressId = staticEmergencyAddressId;
    }

    public LocationResponseData acceptedAddressSuggestions(
        Boolean acceptedAddressSuggestions
    ) {
        this.acceptedAddressSuggestions = acceptedAddressSuggestions;
        return this;
    }

    /**
     * Get acceptedAddressSuggestions
     * @return acceptedAddressSuggestions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ACCEPTED_ADDRESS_SUGGESTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAcceptedAddressSuggestions() {
        return acceptedAddressSuggestions;
    }

    @JsonProperty(JSON_PROPERTY_ACCEPTED_ADDRESS_SUGGESTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAcceptedAddressSuggestions(
        Boolean acceptedAddressSuggestions
    ) {
        this.acceptedAddressSuggestions = acceptedAddressSuggestions;
    }

    /**
     * Return true if this LocationResponse_data object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocationResponseData locationResponseData = (LocationResponseData) o;
        return (
            Objects.equals(this.locationId, locationResponseData.locationId) &&
            Objects.equals(
                this.staticEmergencyAddressId,
                locationResponseData.staticEmergencyAddressId
            ) &&
            Objects.equals(
                this.acceptedAddressSuggestions,
                locationResponseData.acceptedAddressSuggestions
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            locationId,
            staticEmergencyAddressId,
            acceptedAddressSuggestions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationResponseData {\n");
        sb
            .append("    locationId: ")
            .append(toIndentedString(locationId))
            .append("\n");
        sb
            .append("    staticEmergencyAddressId: ")
            .append(toIndentedString(staticEmergencyAddressId))
            .append("\n");
        sb
            .append("    acceptedAddressSuggestions: ")
            .append(toIndentedString(acceptedAddressSuggestions))
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
