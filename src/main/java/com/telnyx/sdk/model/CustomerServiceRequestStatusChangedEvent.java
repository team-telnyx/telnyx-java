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
import com.telnyx.sdk.model.CustomerServiceRequestStatusChangedEventPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * CustomerServiceRequestStatusChangedEvent
 */
@JsonPropertyOrder(
    {
        CustomerServiceRequestStatusChangedEvent.JSON_PROPERTY_ID,
        CustomerServiceRequestStatusChangedEvent.JSON_PROPERTY_EVENT_TYPE,
        CustomerServiceRequestStatusChangedEvent.JSON_PROPERTY_PAYLOAD,
        CustomerServiceRequestStatusChangedEvent.JSON_PROPERTY_OCCURRED_AT,
        CustomerServiceRequestStatusChangedEvent.JSON_PROPERTY_RECORD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class CustomerServiceRequestStatusChangedEvent {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    /**
     * The type of the callback event.
     */
    public enum EventTypeEnum {
        CUSTOMER_SERVICE_REQUEST_STATUS_CHANGED(
            "customer_service_request.status_changed"
        );

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            for (EventTypeEnum b : EventTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
    private EventTypeEnum eventType;

    public static final String JSON_PROPERTY_PAYLOAD = "payload";
    private CustomerServiceRequestStatusChangedEventPayload payload;

    public static final String JSON_PROPERTY_OCCURRED_AT = "occurred_at";
    private OffsetDateTime occurredAt;

    /**
     * Identifies the type of the resource.
     */
    public enum RecordTypeEnum {
        EVENT("event");

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

    public CustomerServiceRequestStatusChangedEvent() {}

    public CustomerServiceRequestStatusChangedEvent id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the callback event.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "d3c462b5-8afa-4d48-9af1-4f9b1f00e7bd",
        value = "Uniquely identifies the callback event."
    )
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

    public CustomerServiceRequestStatusChangedEvent eventType(
        EventTypeEnum eventType
    ) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of the callback event.
     * @return eventType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "customer_service_request.status_changed",
        value = "The type of the callback event."
    )
    @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EventTypeEnum getEventType() {
        return eventType;
    }

    @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public CustomerServiceRequestStatusChangedEvent payload(
        CustomerServiceRequestStatusChangedEventPayload payload
    ) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     * @return payload
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CustomerServiceRequestStatusChangedEventPayload getPayload() {
        return payload;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPayload(
        CustomerServiceRequestStatusChangedEventPayload payload
    ) {
        this.payload = payload;
    }

    public CustomerServiceRequestStatusChangedEvent occurredAt(
        OffsetDateTime occurredAt
    ) {
        this.occurredAt = occurredAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the callback event occurred.
     * @return occurredAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the callback event occurred."
    )
    @JsonProperty(JSON_PROPERTY_OCCURRED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getOccurredAt() {
        return occurredAt;
    }

    @JsonProperty(JSON_PROPERTY_OCCURRED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOccurredAt(OffsetDateTime occurredAt) {
        this.occurredAt = occurredAt;
    }

    public CustomerServiceRequestStatusChangedEvent recordType(
        RecordTypeEnum recordType
    ) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "event",
        value = "Identifies the type of the resource."
    )
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
     * Return true if this CustomerServiceRequestStatusChangedEvent object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerServiceRequestStatusChangedEvent customerServiceRequestStatusChangedEvent =
            (CustomerServiceRequestStatusChangedEvent) o;
        return (
            Objects.equals(
                this.id,
                customerServiceRequestStatusChangedEvent.id
            ) &&
            Objects.equals(
                this.eventType,
                customerServiceRequestStatusChangedEvent.eventType
            ) &&
            Objects.equals(
                this.payload,
                customerServiceRequestStatusChangedEvent.payload
            ) &&
            Objects.equals(
                this.occurredAt,
                customerServiceRequestStatusChangedEvent.occurredAt
            ) &&
            Objects.equals(
                this.recordType,
                customerServiceRequestStatusChangedEvent.recordType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventType, payload, occurredAt, recordType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerServiceRequestStatusChangedEvent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    eventType: ")
            .append(toIndentedString(eventType))
            .append("\n");
        sb
            .append("    payload: ")
            .append(toIndentedString(payload))
            .append("\n");
        sb
            .append("    occurredAt: ")
            .append(toIndentedString(occurredAt))
            .append("\n");
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
