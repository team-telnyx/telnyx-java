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
 * CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner
 */
@JsonPropertyOrder(
    {
        CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner.JSON_PROPERTY_PORTING_PHONE_NUMBER_ID,
        CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner.JSON_PROPERTY_USER_BUNDLE_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner {

    public static final String JSON_PROPERTY_PORTING_PHONE_NUMBER_ID =
        "porting_phone_number_id";
    private UUID portingPhoneNumberId;

    public static final String JSON_PROPERTY_USER_BUNDLE_ID = "user_bundle_id";
    private UUID userBundleId;

    public CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner() {}

    public CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner portingPhoneNumberId(
        UUID portingPhoneNumberId
    ) {
        this.portingPhoneNumberId = portingPhoneNumberId;
        return this;
    }

    /**
     * Identifies the porting phone number to be configured.
     * @return portingPhoneNumberId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "927f4687-318c-44bc-9f2f-22a5898143a4",
        required = true,
        value = "Identifies the porting phone number to be configured."
    )
    @JsonProperty(JSON_PROPERTY_PORTING_PHONE_NUMBER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getPortingPhoneNumberId() {
        return portingPhoneNumberId;
    }

    @JsonProperty(JSON_PROPERTY_PORTING_PHONE_NUMBER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPortingPhoneNumberId(UUID portingPhoneNumberId) {
        this.portingPhoneNumberId = portingPhoneNumberId;
    }

    public CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner userBundleId(
        UUID userBundleId
    ) {
        this.userBundleId = userBundleId;
        return this;
    }

    /**
     * Identifies the user bundle to be associated with the porting phone number.
     * @return userBundleId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "ff901545-3e27-462a-ba9d-2b34654cab82",
        required = true,
        value = "Identifies the user bundle to be associated with the porting phone number."
    )
    @JsonProperty(JSON_PROPERTY_USER_BUNDLE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getUserBundleId() {
        return userBundleId;
    }

    @JsonProperty(JSON_PROPERTY_USER_BUNDLE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUserBundleId(UUID userBundleId) {
        this.userBundleId = userBundleId;
    }

    /**
     * Return true if this CreatePhoneNumberConfigurations_request_phone_number_configurations_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner createPhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner =
            (CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner) o;
        return (
            Objects.equals(
                this.portingPhoneNumberId,
                createPhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner.portingPhoneNumberId
            ) &&
            Objects.equals(
                this.userBundleId,
                createPhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner.userBundleId
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(portingPhoneNumberId, userBundleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class CreatePhoneNumberConfigurationsRequestPhoneNumberConfigurationsInner {\n"
        );
        sb
            .append("    portingPhoneNumberId: ")
            .append(toIndentedString(portingPhoneNumberId))
            .append("\n");
        sb
            .append("    userBundleId: ")
            .append(toIndentedString(userBundleId))
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
