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
import com.telnyx.sdk.model.MessagingProfileHighLevelMetricsInbound;
import com.telnyx.sdk.model.MessagingProfileHighLevelMetricsOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * MessagingProfileHighLevelMetrics
 */
@JsonPropertyOrder(
    {
        MessagingProfileHighLevelMetrics.JSON_PROPERTY_RECORD_TYPE,
        MessagingProfileHighLevelMetrics.JSON_PROPERTY_MESSAGING_PROFILE_ID,
        MessagingProfileHighLevelMetrics.JSON_PROPERTY_PHONE_NUMBERS,
        MessagingProfileHighLevelMetrics.JSON_PROPERTY_OUTBOUND,
        MessagingProfileHighLevelMetrics.JSON_PROPERTY_INBOUND,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class MessagingProfileHighLevelMetrics {

    /**
     * Identifies the type of the resource.
     */
    public enum RecordTypeEnum {
        MESSAGING_PROFILE_METRICS(String.valueOf("messaging_profile_metrics"));

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

    public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID =
        "messaging_profile_id";
    private UUID messagingProfileId;

    public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
    private BigDecimal phoneNumbers;

    public static final String JSON_PROPERTY_OUTBOUND = "outbound";
    private MessagingProfileHighLevelMetricsOutbound outbound;

    public static final String JSON_PROPERTY_INBOUND = "inbound";
    private MessagingProfileHighLevelMetricsInbound inbound;

    public MessagingProfileHighLevelMetrics() {}

    @JsonCreator
    public MessagingProfileHighLevelMetrics(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) RecordTypeEnum recordType,
        @JsonProperty(
            JSON_PROPERTY_MESSAGING_PROFILE_ID
        ) UUID messagingProfileId,
        @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS) BigDecimal phoneNumbers
    ) {
        this();
        this.recordType = recordType;
        this.messagingProfileId = messagingProfileId;
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "messaging_profile_metrics",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    /**
     * Identifies the type of resource.
     * @return messagingProfileId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Identifies the type of resource.")
    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getMessagingProfileId() {
        return messagingProfileId;
    }

    /**
     * The number of phone numbers associated with the messaging profile.
     * @return phoneNumbers
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The number of phone numbers associated with the messaging profile."
    )
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getPhoneNumbers() {
        return phoneNumbers;
    }

    public MessagingProfileHighLevelMetrics outbound(
        MessagingProfileHighLevelMetricsOutbound outbound
    ) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Get outbound
     * @return outbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MessagingProfileHighLevelMetricsOutbound getOutbound() {
        return outbound;
    }

    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutbound(MessagingProfileHighLevelMetricsOutbound outbound) {
        this.outbound = outbound;
    }

    public MessagingProfileHighLevelMetrics inbound(
        MessagingProfileHighLevelMetricsInbound inbound
    ) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     * @return inbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MessagingProfileHighLevelMetricsInbound getInbound() {
        return inbound;
    }

    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInbound(MessagingProfileHighLevelMetricsInbound inbound) {
        this.inbound = inbound;
    }

    /**
     * Return true if this MessagingProfileHighLevelMetrics object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagingProfileHighLevelMetrics messagingProfileHighLevelMetrics =
            (MessagingProfileHighLevelMetrics) o;
        return (
            Objects.equals(
                this.recordType,
                messagingProfileHighLevelMetrics.recordType
            ) &&
            Objects.equals(
                this.messagingProfileId,
                messagingProfileHighLevelMetrics.messagingProfileId
            ) &&
            Objects.equals(
                this.phoneNumbers,
                messagingProfileHighLevelMetrics.phoneNumbers
            ) &&
            Objects.equals(
                this.outbound,
                messagingProfileHighLevelMetrics.outbound
            ) &&
            Objects.equals(
                this.inbound,
                messagingProfileHighLevelMetrics.inbound
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            messagingProfileId,
            phoneNumbers,
            outbound,
            inbound
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessagingProfileHighLevelMetrics {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    messagingProfileId: ")
            .append(toIndentedString(messagingProfileId))
            .append("\n");
        sb
            .append("    phoneNumbers: ")
            .append(toIndentedString(phoneNumbers))
            .append("\n");
        sb
            .append("    outbound: ")
            .append(toIndentedString(outbound))
            .append("\n");
        sb
            .append("    inbound: ")
            .append(toIndentedString(inbound))
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
