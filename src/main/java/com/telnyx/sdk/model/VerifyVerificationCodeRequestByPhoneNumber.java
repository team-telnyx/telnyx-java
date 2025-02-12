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
 * VerifyVerificationCodeRequestByPhoneNumber
 */
@JsonPropertyOrder(
    {
        VerifyVerificationCodeRequestByPhoneNumber.JSON_PROPERTY_CODE,
        VerifyVerificationCodeRequestByPhoneNumber.JSON_PROPERTY_VERIFY_PROFILE_ID,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VerifyVerificationCodeRequestByPhoneNumber {

    public static final String JSON_PROPERTY_CODE = "code";
    private String code;

    public static final String JSON_PROPERTY_VERIFY_PROFILE_ID =
        "verify_profile_id";
    private UUID verifyProfileId;

    public VerifyVerificationCodeRequestByPhoneNumber() {}

    public VerifyVerificationCodeRequestByPhoneNumber code(String code) {
        this.code = code;
        return this;
    }

    /**
     * This is the code the user submits for verification.
     * @return code
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "17686",
        required = true,
        value = "This is the code the user submits for verification."
    )
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCode(String code) {
        this.code = code;
    }

    public VerifyVerificationCodeRequestByPhoneNumber verifyProfileId(
        UUID verifyProfileId
    ) {
        this.verifyProfileId = verifyProfileId;
        return this;
    }

    /**
     * The identifier of the associated Verify profile.
     * @return verifyProfileId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "12ade33a-21c0-473b-b055-b3c836e1c292",
        required = true,
        value = "The identifier of the associated Verify profile."
    )
    @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getVerifyProfileId() {
        return verifyProfileId;
    }

    @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVerifyProfileId(UUID verifyProfileId) {
        this.verifyProfileId = verifyProfileId;
    }

    /**
     * Return true if this VerifyVerificationCodeRequestByPhoneNumber object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyVerificationCodeRequestByPhoneNumber verifyVerificationCodeRequestByPhoneNumber =
            (VerifyVerificationCodeRequestByPhoneNumber) o;
        return (
            Objects.equals(
                this.code,
                verifyVerificationCodeRequestByPhoneNumber.code
            ) &&
            Objects.equals(
                this.verifyProfileId,
                verifyVerificationCodeRequestByPhoneNumber.verifyProfileId
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, verifyProfileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyVerificationCodeRequestByPhoneNumber {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb
            .append("    verifyProfileId: ")
            .append(toIndentedString(verifyProfileId))
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
