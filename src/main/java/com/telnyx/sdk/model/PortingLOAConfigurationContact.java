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

/**
 * The contact information of the company.
 */
@ApiModel(description = "The contact information of the company.")
@JsonPropertyOrder(
    {
        PortingLOAConfigurationContact.JSON_PROPERTY_EMAIL,
        PortingLOAConfigurationContact.JSON_PROPERTY_PHONE_NUMBER,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingLOAConfigurationContact {

    public static final String JSON_PROPERTY_EMAIL = "email";
    private String email;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public PortingLOAConfigurationContact() {}

    public PortingLOAConfigurationContact email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email address of the contact
     * @return email
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "testing@telnyx.com",
        value = "The email address of the contact"
    )
    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEmail() {
        return email;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmail(String email) {
        this.email = email;
    }

    public PortingLOAConfigurationContact phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The phone number of the contact
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+12003270001",
        value = "The phone number of the contact"
    )
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

    /**
     * Return true if this PortingLOAConfiguration_contact object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingLOAConfigurationContact portingLOAConfigurationContact =
            (PortingLOAConfigurationContact) o;
        return (
            Objects.equals(this.email, portingLOAConfigurationContact.email) &&
            Objects.equals(
                this.phoneNumber,
                portingLOAConfigurationContact.phoneNumber
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingLOAConfigurationContact {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
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
