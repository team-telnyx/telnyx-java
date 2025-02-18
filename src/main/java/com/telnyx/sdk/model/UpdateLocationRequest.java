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
 * UpdateLocationRequest
 */
@JsonPropertyOrder(
    { UpdateLocationRequest.JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateLocationRequest {

    public static final String JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID =
        "static_emergency_address_id";
    private UUID staticEmergencyAddressId;

    public UpdateLocationRequest() {}

    public UpdateLocationRequest staticEmergencyAddressId(
        UUID staticEmergencyAddressId
    ) {
        this.staticEmergencyAddressId = staticEmergencyAddressId;
        return this;
    }

    /**
     * A new static emergency address ID to update the location with
     * @return staticEmergencyAddressId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "A new static emergency address ID to update the location with"
    )
    @JsonProperty(JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getStaticEmergencyAddressId() {
        return staticEmergencyAddressId;
    }

    @JsonProperty(JSON_PROPERTY_STATIC_EMERGENCY_ADDRESS_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStaticEmergencyAddressId(UUID staticEmergencyAddressId) {
        this.staticEmergencyAddressId = staticEmergencyAddressId;
    }

    /**
     * Return true if this updateLocation_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLocationRequest updateLocationRequest = (UpdateLocationRequest) o;
        return Objects.equals(
            this.staticEmergencyAddressId,
            updateLocationRequest.staticEmergencyAddressId
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(staticEmergencyAddressId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLocationRequest {\n");
        sb
            .append("    staticEmergencyAddressId: ")
            .append(toIndentedString(staticEmergencyAddressId))
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
