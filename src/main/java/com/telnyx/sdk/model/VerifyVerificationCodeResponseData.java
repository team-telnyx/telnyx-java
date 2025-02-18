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
 * VerifyVerificationCodeResponseData
 */
@JsonPropertyOrder(
    {
        VerifyVerificationCodeResponseData.JSON_PROPERTY_PHONE_NUMBER,
        VerifyVerificationCodeResponseData.JSON_PROPERTY_RESPONSE_CODE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VerifyVerificationCodeResponseData {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    /**
     * Identifies if the verification code has been accepted or rejected.
     */
    public enum ResponseCodeEnum {
        ACCEPTED(String.valueOf("accepted")),

        REJECTED(String.valueOf("rejected"));

        private String value;

        ResponseCodeEnum(String value) {
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
        public static ResponseCodeEnum fromValue(String value) {
            for (ResponseCodeEnum b : ResponseCodeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RESPONSE_CODE = "response_code";
    private ResponseCodeEnum responseCode;

    public VerifyVerificationCodeResponseData() {}

    public VerifyVerificationCodeResponseData phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * +E164 formatted phone number.
     * @return phoneNumber
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "+13035551234",
        required = true,
        value = "+E164 formatted phone number."
    )
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

    public VerifyVerificationCodeResponseData responseCode(
        ResponseCodeEnum responseCode
    ) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * Identifies if the verification code has been accepted or rejected.
     * @return responseCode
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "accepted",
        required = true,
        value = "Identifies if the verification code has been accepted or rejected."
    )
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ResponseCodeEnum getResponseCode() {
        return responseCode;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResponseCode(ResponseCodeEnum responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Return true if this VerifyVerificationCodeResponse_data object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyVerificationCodeResponseData verifyVerificationCodeResponseData =
            (VerifyVerificationCodeResponseData) o;
        return (
            Objects.equals(
                this.phoneNumber,
                verifyVerificationCodeResponseData.phoneNumber
            ) &&
            Objects.equals(
                this.responseCode,
                verifyVerificationCodeResponseData.responseCode
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, responseCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyVerificationCodeResponseData {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    responseCode: ")
            .append(toIndentedString(responseCode))
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
