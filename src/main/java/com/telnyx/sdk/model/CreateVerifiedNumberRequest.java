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
 * CreateVerifiedNumberRequest
 */
@JsonPropertyOrder(
    {
        CreateVerifiedNumberRequest.JSON_PROPERTY_PHONE_NUMBER,
        CreateVerifiedNumberRequest.JSON_PROPERTY_VERIFICATION_METHOD,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateVerifiedNumberRequest {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    /**
     * Verification method.
     */
    public enum VerificationMethodEnum {
        SMS(String.valueOf("sms")),

        CALL(String.valueOf("call"));

        private String value;

        VerificationMethodEnum(String value) {
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
        public static VerificationMethodEnum fromValue(String value) {
            for (VerificationMethodEnum b : VerificationMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_VERIFICATION_METHOD =
        "verification_method";
    private VerificationMethodEnum verificationMethod;

    public CreateVerifiedNumberRequest() {}

    public CreateVerifiedNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     * @return phoneNumber
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "+15551234567", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CreateVerifiedNumberRequest verificationMethod(
        VerificationMethodEnum verificationMethod
    ) {
        this.verificationMethod = verificationMethod;
        return this;
    }

    /**
     * Verification method.
     * @return verificationMethod
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "sms",
        required = true,
        value = "Verification method."
    )
    @JsonProperty(JSON_PROPERTY_VERIFICATION_METHOD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public VerificationMethodEnum getVerificationMethod() {
        return verificationMethod;
    }

    @JsonProperty(JSON_PROPERTY_VERIFICATION_METHOD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVerificationMethod(
        VerificationMethodEnum verificationMethod
    ) {
        this.verificationMethod = verificationMethod;
    }

    /**
     * Return true if this Create_Verified_Number_Request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVerifiedNumberRequest createVerifiedNumberRequest =
            (CreateVerifiedNumberRequest) o;
        return (
            Objects.equals(
                this.phoneNumber,
                createVerifiedNumberRequest.phoneNumber
            ) &&
            Objects.equals(
                this.verificationMethod,
                createVerifiedNumberRequest.verificationMethod
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, verificationMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVerifiedNumberRequest {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    verificationMethod: ")
            .append(toIndentedString(verificationMethod))
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
