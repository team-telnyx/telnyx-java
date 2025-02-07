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
import com.telnyx.sdk.model.VerifiedNumberRecordType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VerifiedNumberResponse
 */
@JsonPropertyOrder(
    {
        VerifiedNumberResponse.JSON_PROPERTY_PHONE_NUMBER,
        VerifiedNumberResponse.JSON_PROPERTY_RECORD_TYPE,
        VerifiedNumberResponse.JSON_PROPERTY_VERIFIED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VerifiedNumberResponse {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private VerifiedNumberRecordType recordType;

    public static final String JSON_PROPERTY_VERIFIED_AT = "verified_at";
    private String verifiedAt;

    public VerifiedNumberResponse() {}

    public VerifiedNumberResponse phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "+15551234567", value = "")
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

    public VerifiedNumberResponse recordType(
        VerifiedNumberRecordType recordType
    ) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public VerifiedNumberRecordType getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(VerifiedNumberRecordType recordType) {
        this.recordType = recordType;
    }

    public VerifiedNumberResponse verifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
        return this;
    }

    /**
     * Get verifiedAt
     * @return verifiedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "2020-09-14T17:03:32.965812", value = "")
    @JsonProperty(JSON_PROPERTY_VERIFIED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVerifiedAt() {
        return verifiedAt;
    }

    @JsonProperty(JSON_PROPERTY_VERIFIED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVerifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    /**
     * Return true if this VerifiedNumberResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifiedNumberResponse verifiedNumberResponse =
            (VerifiedNumberResponse) o;
        return (
            Objects.equals(
                this.phoneNumber,
                verifiedNumberResponse.phoneNumber
            ) &&
            Objects.equals(
                this.recordType,
                verifiedNumberResponse.recordType
            ) &&
            Objects.equals(this.verifiedAt, verifiedNumberResponse.verifiedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, recordType, verifiedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifiedNumberResponse {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    verifiedAt: ")
            .append(toIndentedString(verifiedAt))
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
