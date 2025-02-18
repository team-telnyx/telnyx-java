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
import com.telnyx.sdk.model.CustomerServiceRecordResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * CustomerServiceRecord
 */
@JsonPropertyOrder(
    {
        CustomerServiceRecord.JSON_PROPERTY_ID,
        CustomerServiceRecord.JSON_PROPERTY_PHONE_NUMBER,
        CustomerServiceRecord.JSON_PROPERTY_STATUS,
        CustomerServiceRecord.JSON_PROPERTY_ERROR_MESSAGE,
        CustomerServiceRecord.JSON_PROPERTY_RESULT,
        CustomerServiceRecord.JSON_PROPERTY_RECORD_TYPE,
        CustomerServiceRecord.JSON_PROPERTY_CREATED_AT,
        CustomerServiceRecord.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CustomerServiceRecord {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    /**
     * The status of the customer service record
     */
    public enum StatusEnum {
        PENDING(String.valueOf("pending")),

        COMPLETED(String.valueOf("completed")),

        FAILED(String.valueOf("failed"));

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

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
    private String errorMessage;

    public static final String JSON_PROPERTY_RESULT = "result";
    private CustomerServiceRecordResult result;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public CustomerServiceRecord() {}

    @JsonCreator
    public CustomerServiceRecord(
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
     * Uniquely identifies this customer service record
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "f1486bae-f067-460c-ad43-73a92848f902",
        value = "Uniquely identifies this customer service record"
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    public CustomerServiceRecord phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The phone number of the customer service record.
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+12065551212",
        value = "The phone number of the customer service record."
    )
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

    public CustomerServiceRecord status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the customer service record
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "completed",
        value = "The status of the customer service record"
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

    public CustomerServiceRecord errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * The error message in case status is &#x60;failed&#x60;. This field would be null in case of &#x60;pending&#x60; or &#x60;completed&#x60; status.
     * @return errorMessage
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "CSR information not available.",
        value = "The error message in case status is `failed`. This field would be null in case of `pending` or `completed` status."
    )
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CustomerServiceRecord result(CustomerServiceRecordResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CustomerServiceRecordResult getResult() {
        return result;
    }

    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResult(CustomerServiceRecordResult result) {
        this.result = result;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "customer_service_record",
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
     * ISO 8601 formatted date indicating when the resource was created.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Return true if this CustomerServiceRecord object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerServiceRecord customerServiceRecord = (CustomerServiceRecord) o;
        return (
            Objects.equals(this.id, customerServiceRecord.id) &&
            Objects.equals(
                this.phoneNumber,
                customerServiceRecord.phoneNumber
            ) &&
            Objects.equals(this.status, customerServiceRecord.status) &&
            Objects.equals(
                this.errorMessage,
                customerServiceRecord.errorMessage
            ) &&
            Objects.equals(this.result, customerServiceRecord.result) &&
            Objects.equals(this.recordType, customerServiceRecord.recordType) &&
            Objects.equals(this.createdAt, customerServiceRecord.createdAt) &&
            Objects.equals(this.updatedAt, customerServiceRecord.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            phoneNumber,
            status,
            errorMessage,
            result,
            recordType,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerServiceRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    errorMessage: ")
            .append(toIndentedString(errorMessage))
            .append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
