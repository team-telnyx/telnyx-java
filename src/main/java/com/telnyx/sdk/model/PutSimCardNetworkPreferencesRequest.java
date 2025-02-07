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
import com.telnyx.sdk.model.MobileNetworkOperatorPreferencesRequest;
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

/**
 * PutSimCardNetworkPreferencesRequest
 */
@JsonPropertyOrder(
    {
        PutSimCardNetworkPreferencesRequest.JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class PutSimCardNetworkPreferencesRequest {

    public static final String JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES =
        "mobile_network_operators_preferences";
    private List<
        MobileNetworkOperatorPreferencesRequest
    > mobileNetworkOperatorsPreferences = null;

    public PutSimCardNetworkPreferencesRequest() {}

    public PutSimCardNetworkPreferencesRequest mobileNetworkOperatorsPreferences(
        List<
            MobileNetworkOperatorPreferencesRequest
        > mobileNetworkOperatorsPreferences
    ) {
        this.mobileNetworkOperatorsPreferences =
            mobileNetworkOperatorsPreferences;
        return this;
    }

    public PutSimCardNetworkPreferencesRequest addMobileNetworkOperatorsPreferencesItem(
        MobileNetworkOperatorPreferencesRequest mobileNetworkOperatorsPreferencesItem
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
        MobileNetworkOperatorPreferencesRequest
    > getMobileNetworkOperatorsPreferences() {
        return mobileNetworkOperatorsPreferences;
    }

    @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMobileNetworkOperatorsPreferences(
        List<
            MobileNetworkOperatorPreferencesRequest
        > mobileNetworkOperatorsPreferences
    ) {
        this.mobileNetworkOperatorsPreferences =
            mobileNetworkOperatorsPreferences;
    }

    /**
     * Return true if this PutSimCardNetworkPreferences_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutSimCardNetworkPreferencesRequest putSimCardNetworkPreferencesRequest =
            (PutSimCardNetworkPreferencesRequest) o;
        return Objects.equals(
            this.mobileNetworkOperatorsPreferences,
            putSimCardNetworkPreferencesRequest.mobileNetworkOperatorsPreferences
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobileNetworkOperatorsPreferences);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutSimCardNetworkPreferencesRequest {\n");
        sb
            .append("    mobileNetworkOperatorsPreferences: ")
            .append(toIndentedString(mobileNetworkOperatorsPreferences))
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
