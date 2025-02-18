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
import com.telnyx.sdk.model.PortoutEventPayload;
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
 * PortoutEvent
 */
@JsonPropertyOrder(
    {
        PortoutEvent.JSON_PROPERTY_ID,
        PortoutEvent.JSON_PROPERTY_EVENT_TYPE,
        PortoutEvent.JSON_PROPERTY_PORTOUT_ID,
        PortoutEvent.JSON_PROPERTY_AVAILABLE_NOTIFICATION_METHODS,
        PortoutEvent.JSON_PROPERTY_PAYLOAD_STATUS,
        PortoutEvent.JSON_PROPERTY_PAYLOAD,
        PortoutEvent.JSON_PROPERTY_RECORD_TYPE,
        PortoutEvent.JSON_PROPERTY_CREATED_AT,
        PortoutEvent.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortoutEvent {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    /**
     * Identifies the event type
     */
    public enum EventTypeEnum {
        PORTOUT_STATUS_CHANGED(String.valueOf("portout.status_changed")),

        PORTOUT_FOC_DATE_CHANGED(String.valueOf("portout.foc_date_changed")),

        PORTOUT_NEW_COMMENT(String.valueOf("portout.new_comment"));

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

    public static final String JSON_PROPERTY_PORTOUT_ID = "portout_id";
    private UUID portoutId;

    /**
     * Gets or Sets availableNotificationMethods
     */
    public enum AvailableNotificationMethodsEnum {
        EMAIL(String.valueOf("email")),

        WEBHOOK(String.valueOf("webhook"));

        private String value;

        AvailableNotificationMethodsEnum(String value) {
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
        public static AvailableNotificationMethodsEnum fromValue(String value) {
            for (AvailableNotificationMethodsEnum b : AvailableNotificationMethodsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_AVAILABLE_NOTIFICATION_METHODS =
        "available_notification_methods";
    private List<
        AvailableNotificationMethodsEnum
    > availableNotificationMethods = null;

    /**
     * The status of the payload generation.
     */
    public enum PayloadStatusEnum {
        CREATED(String.valueOf("created")),

        COMPLETED(String.valueOf("completed"));

        private String value;

        PayloadStatusEnum(String value) {
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
        public static PayloadStatusEnum fromValue(String value) {
            for (PayloadStatusEnum b : PayloadStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_PAYLOAD_STATUS = "payload_status";
    private PayloadStatusEnum payloadStatus;

    public static final String JSON_PROPERTY_PAYLOAD = "payload";
    private PortoutEventPayload payload;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private OffsetDateTime updatedAt;

    public PortoutEvent() {}

    @JsonCreator
    public PortoutEvent(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
    ) {
        this();
        this.recordType = recordType;
    }

    public PortoutEvent id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the event.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "eef3340b-8903-4466-b445-89b697315a3a",
        value = "Uniquely identifies the event."
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

    public PortoutEvent eventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Identifies the event type
     * @return eventType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "portout.status_changed",
        value = "Identifies the event type"
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

    public PortoutEvent portoutId(UUID portoutId) {
        this.portoutId = portoutId;
        return this;
    }

    /**
     * Identifies the port-out order associated with the event.
     * @return portoutId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "9471c873-e3eb-4ca1-957d-f9a451334d52",
        value = "Identifies the port-out order associated with the event."
    )
    @JsonProperty(JSON_PROPERTY_PORTOUT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getPortoutId() {
        return portoutId;
    }

    @JsonProperty(JSON_PROPERTY_PORTOUT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPortoutId(UUID portoutId) {
        this.portoutId = portoutId;
    }

    public PortoutEvent availableNotificationMethods(
        List<AvailableNotificationMethodsEnum> availableNotificationMethods
    ) {
        this.availableNotificationMethods = availableNotificationMethods;
        return this;
    }

    public PortoutEvent addavailableNotificationMethodsItem(
        AvailableNotificationMethodsEnum availableNotificationMethodsItem
    ) {
        if (this.availableNotificationMethods == null) {
            this.availableNotificationMethods = new ArrayList<>();
        }
        this.availableNotificationMethods.add(availableNotificationMethodsItem);
        return this;
    }

    /**
     * Indicates the notification methods used.
     * @return availableNotificationMethods
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Indicates the notification methods used.")
    @JsonProperty(JSON_PROPERTY_AVAILABLE_NOTIFICATION_METHODS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        AvailableNotificationMethodsEnum
    > getAvailableNotificationMethods() {
        return availableNotificationMethods;
    }

    @JsonProperty(JSON_PROPERTY_AVAILABLE_NOTIFICATION_METHODS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAvailableNotificationMethods(
        List<AvailableNotificationMethodsEnum> availableNotificationMethods
    ) {
        this.availableNotificationMethods = availableNotificationMethods;
    }

    public PortoutEvent payloadStatus(PayloadStatusEnum payloadStatus) {
        this.payloadStatus = payloadStatus;
        return this;
    }

    /**
     * The status of the payload generation.
     * @return payloadStatus
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "created",
        value = "The status of the payload generation."
    )
    @JsonProperty(JSON_PROPERTY_PAYLOAD_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PayloadStatusEnum getPayloadStatus() {
        return payloadStatus;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPayloadStatus(PayloadStatusEnum payloadStatus) {
        this.payloadStatus = payloadStatus;
    }

    public PortoutEvent payload(PortoutEventPayload payload) {
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
    public PortoutEventPayload getPayload() {
        return payload;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPayload(PortoutEventPayload payload) {
        this.payload = payload;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "portout_event",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    public PortoutEvent createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
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

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PortoutEvent updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Return true if this PortoutEvent object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortoutEvent portoutEvent = (PortoutEvent) o;
        return (
            Objects.equals(this.id, portoutEvent.id) &&
            Objects.equals(this.eventType, portoutEvent.eventType) &&
            Objects.equals(this.portoutId, portoutEvent.portoutId) &&
            Objects.equals(
                this.availableNotificationMethods,
                portoutEvent.availableNotificationMethods
            ) &&
            Objects.equals(this.payloadStatus, portoutEvent.payloadStatus) &&
            Objects.equals(this.payload, portoutEvent.payload) &&
            Objects.equals(this.recordType, portoutEvent.recordType) &&
            Objects.equals(this.createdAt, portoutEvent.createdAt) &&
            Objects.equals(this.updatedAt, portoutEvent.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            eventType,
            portoutId,
            availableNotificationMethods,
            payloadStatus,
            payload,
            recordType,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortoutEvent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    eventType: ")
            .append(toIndentedString(eventType))
            .append("\n");
        sb
            .append("    portoutId: ")
            .append(toIndentedString(portoutId))
            .append("\n");
        sb
            .append("    availableNotificationMethods: ")
            .append(toIndentedString(availableNotificationMethods))
            .append("\n");
        sb
            .append("    payloadStatus: ")
            .append(toIndentedString(payloadStatus))
            .append("\n");
        sb
            .append("    payload: ")
            .append(toIndentedString(payload))
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
