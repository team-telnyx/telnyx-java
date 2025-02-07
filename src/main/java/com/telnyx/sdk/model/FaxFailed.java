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
import com.telnyx.sdk.model.FaxFailedPayload;
import com.telnyx.sdk.model.RecordType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * FaxFailed
 */
@JsonPropertyOrder(
    {
        FaxFailed.JSON_PROPERTY_RECORD_TYPE,
        FaxFailed.JSON_PROPERTY_ID,
        FaxFailed.JSON_PROPERTY_EVENT_TYPE,
        FaxFailed.JSON_PROPERTY_PAYLOAD,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class FaxFailed {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private RecordType recordType;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    /**
     * The type of event being delivered.
     */
    public enum EventTypeEnum {
        FAX_FAILED(String.valueOf("fax.failed"));

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
    private FaxFailedPayload payload;

    public FaxFailed() {}

    public FaxFailed recordType(RecordType recordType) {
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
    public RecordType getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }

    public FaxFailed id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Identifies the type of resource.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0",
        value = "Identifies the type of resource."
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

    public FaxFailed eventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of event being delivered.
     * @return eventType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "fax.failed",
        value = "The type of event being delivered."
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

    public FaxFailed payload(FaxFailedPayload payload) {
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
    public FaxFailedPayload getPayload() {
        return payload;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPayload(FaxFailedPayload payload) {
        this.payload = payload;
    }

    /**
     * Return true if this FaxFailed object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaxFailed faxFailed = (FaxFailed) o;
        return (
            Objects.equals(this.recordType, faxFailed.recordType) &&
            Objects.equals(this.id, faxFailed.id) &&
            Objects.equals(this.eventType, faxFailed.eventType) &&
            Objects.equals(this.payload, faxFailed.payload)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, id, eventType, payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaxFailed {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    eventType: ")
            .append(toIndentedString(eventType))
            .append("\n");
        sb
            .append("    payload: ")
            .append(toIndentedString(payload))
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
