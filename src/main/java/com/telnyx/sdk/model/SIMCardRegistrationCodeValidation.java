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
import com.fasterxml.jackson.annotation.JsonIgnore;
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
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SIMCardRegistrationCodeValidation
 */
@JsonPropertyOrder(
    {
        SIMCardRegistrationCodeValidation.JSON_PROPERTY_RECORD_TYPE,
        SIMCardRegistrationCodeValidation.JSON_PROPERTY_REGISTRATION_CODE,
        SIMCardRegistrationCodeValidation.JSON_PROPERTY_VALID,
        SIMCardRegistrationCodeValidation.JSON_PROPERTY_INVALID_DETAIL,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardRegistrationCodeValidation {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_REGISTRATION_CODE =
        "registration_code";
    private String registrationCode;

    public static final String JSON_PROPERTY_VALID = "valid";
    private Boolean valid;

    public static final String JSON_PROPERTY_INVALID_DETAIL = "invalid_detail";
    private JsonNullable<String> invalidDetail = JsonNullable.<
            String
        >undefined();

    public SIMCardRegistrationCodeValidation() {}

    public SIMCardRegistrationCodeValidation recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "sim_card_registration_code_validation",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public SIMCardRegistrationCodeValidation registrationCode(
        String registrationCode
    ) {
        this.registrationCode = registrationCode;
        return this;
    }

    /**
     * The 10-digit SIM card registration code
     * @return registrationCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0123456789",
        value = "The 10-digit SIM card registration code"
    )
    @JsonProperty(JSON_PROPERTY_REGISTRATION_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRegistrationCode() {
        return registrationCode;
    }

    @JsonProperty(JSON_PROPERTY_REGISTRATION_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public SIMCardRegistrationCodeValidation valid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * The attribute that denotes whether the code is valid or not
     * @return valid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "The attribute that denotes whether the code is valid or not"
    )
    @JsonProperty(JSON_PROPERTY_VALID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getValid() {
        return valid;
    }

    @JsonProperty(JSON_PROPERTY_VALID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public SIMCardRegistrationCodeValidation invalidDetail(
        String invalidDetail
    ) {
        this.invalidDetail = JsonNullable.<String>of(invalidDetail);
        return this;
    }

    /**
     * The validation message
     * @return invalidDetail
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "This code has already been used.",
        value = "The validation message"
    )
    @JsonIgnore
    public String getInvalidDetail() {
        return invalidDetail.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_INVALID_DETAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getInvalidDetail_JsonNullable() {
        return invalidDetail;
    }

    @JsonProperty(JSON_PROPERTY_INVALID_DETAIL)
    public void setInvalidDetail_JsonNullable(
        JsonNullable<String> invalidDetail
    ) {
        this.invalidDetail = invalidDetail;
    }

    public void setInvalidDetail(String invalidDetail) {
        this.invalidDetail = JsonNullable.<String>of(invalidDetail);
    }

    /**
     * Return true if this SIMCardRegistrationCodeValidation object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardRegistrationCodeValidation siMCardRegistrationCodeValidation =
            (SIMCardRegistrationCodeValidation) o;
        return (
            Objects.equals(
                this.recordType,
                siMCardRegistrationCodeValidation.recordType
            ) &&
            Objects.equals(
                this.registrationCode,
                siMCardRegistrationCodeValidation.registrationCode
            ) &&
            Objects.equals(
                this.valid,
                siMCardRegistrationCodeValidation.valid
            ) &&
            equalsNullable(
                this.invalidDetail,
                siMCardRegistrationCodeValidation.invalidDetail
            )
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            registrationCode,
            valid,
            hashCodeNullable(invalidDetail)
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardRegistrationCodeValidation {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    registrationCode: ")
            .append(toIndentedString(registrationCode))
            .append("\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
        sb
            .append("    invalidDetail: ")
            .append(toIndentedString(invalidDetail))
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
