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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * BulkMessagingSettingsUpdatePhoneNumbers
 */
@JsonPropertyOrder(
    {
        BulkMessagingSettingsUpdatePhoneNumbers.JSON_PROPERTY_RECORD_TYPE,
        BulkMessagingSettingsUpdatePhoneNumbers.JSON_PROPERTY_ORDER_ID,
        BulkMessagingSettingsUpdatePhoneNumbers.JSON_PROPERTY_SUCCESS,
        BulkMessagingSettingsUpdatePhoneNumbers.JSON_PROPERTY_PENDING,
        BulkMessagingSettingsUpdatePhoneNumbers.JSON_PROPERTY_FAILED,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BulkMessagingSettingsUpdatePhoneNumbers {

    /**
     * Identifies the type of the resource.
     */
    public enum RecordTypeEnum {
        MESSAGING_NUMBERS_BULK_UPDATE(
            String.valueOf("messaging_numbers_bulk_update")
        );

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

    public static final String JSON_PROPERTY_ORDER_ID = "order_id";
    private UUID orderId;

    public static final String JSON_PROPERTY_SUCCESS = "success";
    private List<String> success = null;

    public static final String JSON_PROPERTY_PENDING = "pending";
    private List<String> pending = null;

    public static final String JSON_PROPERTY_FAILED = "failed";
    private List<String> failed = null;

    public BulkMessagingSettingsUpdatePhoneNumbers() {}

    @JsonCreator
    public BulkMessagingSettingsUpdatePhoneNumbers(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) RecordTypeEnum recordType,
        @JsonProperty(JSON_PROPERTY_ORDER_ID) UUID orderId
    ) {
        this();
        this.recordType = recordType;
        this.orderId = orderId;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "messaging_numbers_bulk_update",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    /**
     * Order ID to verify bulk update status.
     * @return orderId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Order ID to verify bulk update status.")
    @JsonProperty(JSON_PROPERTY_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getOrderId() {
        return orderId;
    }

    public BulkMessagingSettingsUpdatePhoneNumbers success(
        List<String> success
    ) {
        this.success = success;
        return this;
    }

    public BulkMessagingSettingsUpdatePhoneNumbers addsuccessItem(
        String successItem
    ) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    /**
     * Phoned numbers updated successfully.
     * @return success
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Phoned numbers updated successfully.")
    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getSuccess() {
        return success;
    }

    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuccess(List<String> success) {
        this.success = success;
    }

    public BulkMessagingSettingsUpdatePhoneNumbers pending(
        List<String> pending
    ) {
        this.pending = pending;
        return this;
    }

    public BulkMessagingSettingsUpdatePhoneNumbers addpendingItem(
        String pendingItem
    ) {
        if (this.pending == null) {
            this.pending = new ArrayList<>();
        }
        this.pending.add(pendingItem);
        return this;
    }

    /**
     * Phone numbers pending to be updated.
     * @return pending
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Phone numbers pending to be updated.")
    @JsonProperty(JSON_PROPERTY_PENDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getPending() {
        return pending;
    }

    @JsonProperty(JSON_PROPERTY_PENDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPending(List<String> pending) {
        this.pending = pending;
    }

    public BulkMessagingSettingsUpdatePhoneNumbers failed(List<String> failed) {
        this.failed = failed;
        return this;
    }

    public BulkMessagingSettingsUpdatePhoneNumbers addfailedItem(
        String failedItem
    ) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    /**
     * Phone numbers that failed to update.
     * @return failed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Phone numbers that failed to update.")
    @JsonProperty(JSON_PROPERTY_FAILED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getFailed() {
        return failed;
    }

    @JsonProperty(JSON_PROPERTY_FAILED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailed(List<String> failed) {
        this.failed = failed;
    }

    /**
     * Return true if this BulkMessagingSettingsUpdatePhoneNumbers object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkMessagingSettingsUpdatePhoneNumbers bulkMessagingSettingsUpdatePhoneNumbers =
            (BulkMessagingSettingsUpdatePhoneNumbers) o;
        return (
            Objects.equals(
                this.recordType,
                bulkMessagingSettingsUpdatePhoneNumbers.recordType
            ) &&
            Objects.equals(
                this.orderId,
                bulkMessagingSettingsUpdatePhoneNumbers.orderId
            ) &&
            Objects.equals(
                this.success,
                bulkMessagingSettingsUpdatePhoneNumbers.success
            ) &&
            Objects.equals(
                this.pending,
                bulkMessagingSettingsUpdatePhoneNumbers.pending
            ) &&
            Objects.equals(
                this.failed,
                bulkMessagingSettingsUpdatePhoneNumbers.failed
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, orderId, success, pending, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkMessagingSettingsUpdatePhoneNumbers {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    orderId: ")
            .append(toIndentedString(orderId))
            .append("\n");
        sb
            .append("    success: ")
            .append(toIndentedString(success))
            .append("\n");
        sb
            .append("    pending: ")
            .append(toIndentedString(pending))
            .append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
