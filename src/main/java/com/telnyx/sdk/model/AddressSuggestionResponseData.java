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
 * AddressSuggestionResponseData
 */
@JsonPropertyOrder(
    {
        AddressSuggestionResponseData.JSON_PROPERTY_ACCEPTED,
        AddressSuggestionResponseData.JSON_PROPERTY_ID,
        AddressSuggestionResponseData.JSON_PROPERTY_RECORD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AddressSuggestionResponseData {

    public static final String JSON_PROPERTY_ACCEPTED = "accepted";
    private Boolean accepted;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    /**
     * Gets or Sets recordType
     */
    public enum RecordTypeEnum {
        ADDRESS_SUGGESTION(String.valueOf("address_suggestion"));

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            for (RecordTypeEnum b : RecordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private RecordTypeEnum recordType;

    public AddressSuggestionResponseData() {}

    public AddressSuggestionResponseData accepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }

    /**
     * Indicates if the address suggestions are accepted.
     * @return accepted
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates if the address suggestions are accepted."
    )
    @JsonProperty(JSON_PROPERTY_ACCEPTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAccepted() {
        return accepted;
    }

    @JsonProperty(JSON_PROPERTY_ACCEPTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public AddressSuggestionResponseData id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * The UUID of the location.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The UUID of the location.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(UUID id) {
        this.id = id;
    }

    public AddressSuggestionResponseData recordType(RecordTypeEnum recordType) {
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
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    /**
     * Return true if this AddressSuggestionResponse_data object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressSuggestionResponseData addressSuggestionResponseData =
            (AddressSuggestionResponseData) o;
        return (
            Objects.equals(
                this.accepted,
                addressSuggestionResponseData.accepted
            ) &&
            Objects.equals(this.id, addressSuggestionResponseData.id) &&
            Objects.equals(
                this.recordType,
                addressSuggestionResponseData.recordType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(accepted, id, recordType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressSuggestionResponseData {\n");
        sb
            .append("    accepted: ")
            .append(toIndentedString(accepted))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
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
