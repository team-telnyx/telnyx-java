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
import com.telnyx.sdk.model.PortingPhoneNumberBlockActivationRangesInner;
import com.telnyx.sdk.model.PortingPhoneNumberBlockPhoneNumberRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * PortingPhoneNumberBlock
 */
@JsonPropertyOrder(
    {
        PortingPhoneNumberBlock.JSON_PROPERTY_ID,
        PortingPhoneNumberBlock.JSON_PROPERTY_COUNTRY_CODE,
        PortingPhoneNumberBlock.JSON_PROPERTY_PHONE_NUMBER_TYPE,
        PortingPhoneNumberBlock.JSON_PROPERTY_PHONE_NUMBER_RANGE,
        PortingPhoneNumberBlock.JSON_PROPERTY_ACTIVATION_RANGES,
        PortingPhoneNumberBlock.JSON_PROPERTY_RECORD_TYPE,
        PortingPhoneNumberBlock.JSON_PROPERTY_CREATED_AT,
        PortingPhoneNumberBlock.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingPhoneNumberBlock {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
    private String countryCode;

    /**
     * Specifies the phone number type for this porting phone number block.
     */
    public enum PhoneNumberTypeEnum {
        LANDLINE(String.valueOf("landline")),

        LOCAL(String.valueOf("local")),

        MOBILE(String.valueOf("mobile")),

        NATIONAL(String.valueOf("national")),

        SHARED_COST(String.valueOf("shared_cost")),

        TOLL_FREE(String.valueOf("toll_free"));

        private String value;

        PhoneNumberTypeEnum(String value) {
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
        public static PhoneNumberTypeEnum fromValue(String value) {
            for (PhoneNumberTypeEnum b : PhoneNumberTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE =
        "phone_number_type";
    private PhoneNumberTypeEnum phoneNumberType;

    public static final String JSON_PROPERTY_PHONE_NUMBER_RANGE =
        "phone_number_range";
    private PortingPhoneNumberBlockPhoneNumberRange phoneNumberRange;

    public static final String JSON_PROPERTY_ACTIVATION_RANGES =
        "activation_ranges";
    private List<
        PortingPhoneNumberBlockActivationRangesInner
    > activationRanges = null;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public PortingPhoneNumberBlock() {}

    @JsonCreator
    public PortingPhoneNumberBlock(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Uniquely identifies this porting phone number block.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "f24151b6-3389-41d3-8747-7dd8c681e5e2",
        value = "Uniquely identifies this porting phone number block."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    public PortingPhoneNumberBlock countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Specifies the country code for this porting phone number block. It is a two-letter ISO 3166-1 alpha-2 country code.
     * @return countryCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "DE",
        value = "Specifies the country code for this porting phone number block. It is a two-letter ISO 3166-1 alpha-2 country code."
    )
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public PortingPhoneNumberBlock phoneNumberType(
        PhoneNumberTypeEnum phoneNumberType
    ) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }

    /**
     * Specifies the phone number type for this porting phone number block.
     * @return phoneNumberType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "local",
        value = "Specifies the phone number type for this porting phone number block."
    )
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PhoneNumberTypeEnum getPhoneNumberType() {
        return phoneNumberType;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public PortingPhoneNumberBlock phoneNumberRange(
        PortingPhoneNumberBlockPhoneNumberRange phoneNumberRange
    ) {
        this.phoneNumberRange = phoneNumberRange;
        return this;
    }

    /**
     * Get phoneNumberRange
     * @return phoneNumberRange
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_RANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortingPhoneNumberBlockPhoneNumberRange getPhoneNumberRange() {
        return phoneNumberRange;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_RANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumberRange(
        PortingPhoneNumberBlockPhoneNumberRange phoneNumberRange
    ) {
        this.phoneNumberRange = phoneNumberRange;
    }

    public PortingPhoneNumberBlock activationRanges(
        List<PortingPhoneNumberBlockActivationRangesInner> activationRanges
    ) {
        this.activationRanges = activationRanges;
        return this;
    }

    public PortingPhoneNumberBlock addactivationRangesItem(
        PortingPhoneNumberBlockActivationRangesInner activationRangesItem
    ) {
        if (this.activationRanges == null) {
            this.activationRanges = new ArrayList<>();
        }
        this.activationRanges.add(activationRangesItem);
        return this;
    }

    /**
     * Specifies the activation ranges for this porting phone number block. The activation range must be within the phone number range and should not overlap with other activation ranges.
     * @return activationRanges
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Specifies the activation ranges for this porting phone number block. The activation range must be within the phone number range and should not overlap with other activation ranges."
    )
    @JsonProperty(JSON_PROPERTY_ACTIVATION_RANGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        PortingPhoneNumberBlockActivationRangesInner
    > getActivationRanges() {
        return activationRanges;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_RANGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActivationRanges(
        List<PortingPhoneNumberBlockActivationRangesInner> activationRanges
    ) {
        this.activationRanges = activationRanges;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "porting_phone_number_block",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was last updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was last updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Return true if this PortingPhoneNumberBlock object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingPhoneNumberBlock portingPhoneNumberBlock =
            (PortingPhoneNumberBlock) o;
        return (
            Objects.equals(this.id, portingPhoneNumberBlock.id) &&
            Objects.equals(
                this.countryCode,
                portingPhoneNumberBlock.countryCode
            ) &&
            Objects.equals(
                this.phoneNumberType,
                portingPhoneNumberBlock.phoneNumberType
            ) &&
            Objects.equals(
                this.phoneNumberRange,
                portingPhoneNumberBlock.phoneNumberRange
            ) &&
            Objects.equals(
                this.activationRanges,
                portingPhoneNumberBlock.activationRanges
            ) &&
            Objects.equals(
                this.recordType,
                portingPhoneNumberBlock.recordType
            ) &&
            Objects.equals(this.createdAt, portingPhoneNumberBlock.createdAt) &&
            Objects.equals(this.updatedAt, portingPhoneNumberBlock.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            countryCode,
            phoneNumberType,
            phoneNumberRange,
            activationRanges,
            recordType,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingPhoneNumberBlock {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    countryCode: ")
            .append(toIndentedString(countryCode))
            .append("\n");
        sb
            .append("    phoneNumberType: ")
            .append(toIndentedString(phoneNumberType))
            .append("\n");
        sb
            .append("    phoneNumberRange: ")
            .append(toIndentedString(phoneNumberRange))
            .append("\n");
        sb
            .append("    activationRanges: ")
            .append(toIndentedString(activationRanges))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
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
