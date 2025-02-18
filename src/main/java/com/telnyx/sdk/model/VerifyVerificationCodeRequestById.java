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
 * VerifyVerificationCodeRequestById
 */
@JsonPropertyOrder(
    {
        VerifyVerificationCodeRequestById.JSON_PROPERTY_CODE,
        VerifyVerificationCodeRequestById.JSON_PROPERTY_STATUS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VerifyVerificationCodeRequestById {

    public static final String JSON_PROPERTY_CODE = "code";
    private String code;

    /**
     * Identifies if the verification code has been accepted or rejected. Only permitted if custom_code was used for the verification.
     */
    public enum StatusEnum {
        ACCEPTED(String.valueOf("accepted")),

        REJECTED(String.valueOf("rejected"));

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public VerifyVerificationCodeRequestById() {}

    public VerifyVerificationCodeRequestById code(String code) {
        this.code = code;
        return this;
    }

    /**
     * This is the code the user submits for verification.
     * @return code
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "17686",
        value = "This is the code the user submits for verification."
    )
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCode(String code) {
        this.code = code;
    }

    public VerifyVerificationCodeRequestById status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Identifies if the verification code has been accepted or rejected. Only permitted if custom_code was used for the verification.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "accepted",
        value = "Identifies if the verification code has been accepted or rejected. Only permitted if custom_code was used for the verification."
    )
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Return true if this VerifyVerificationCodeRequestById object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyVerificationCodeRequestById verifyVerificationCodeRequestById =
            (VerifyVerificationCodeRequestById) o;
        return (
            Objects.equals(this.code, verifyVerificationCodeRequestById.code) &&
            Objects.equals(
                this.status,
                verifyVerificationCodeRequestById.status
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyVerificationCodeRequestById {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
