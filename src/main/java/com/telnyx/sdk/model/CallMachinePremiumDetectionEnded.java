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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.CallMachinePremiumDetectionEndedPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallMachinePremiumDetectionEnded
 */
@JsonPropertyOrder({
  CallMachinePremiumDetectionEnded.JSON_PROPERTY_RECORD_TYPE,
  CallMachinePremiumDetectionEnded.JSON_PROPERTY_EVENT_TYPE,
  CallMachinePremiumDetectionEnded.JSON_PROPERTY_ID,
  CallMachinePremiumDetectionEnded.JSON_PROPERTY_OCCURRED_AT,
  CallMachinePremiumDetectionEnded.JSON_PROPERTY_PAYLOAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallMachinePremiumDetectionEnded {
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  /**
   * The type of event being delivered.
   */
  public enum EventTypeEnum {
    CALL_MACHINE_PREMIUM_DETECTION_ENDED("call.machine.premium.detection.ended");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private EventTypeEnum eventType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_OCCURRED_AT = "occurred_at";
  private OffsetDateTime occurredAt;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private CallMachinePremiumDetectionEndedPayload payload;


  public CallMachinePremiumDetectionEnded recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "event", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public CallMachinePremiumDetectionEnded eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of event being delivered.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "call.machine.premium.detection.ended", value = "The type of event being delivered.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public CallMachinePremiumDetectionEnded id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public CallMachinePremiumDetectionEnded occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when the event occurred.
   * @return occurredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521992Z", value = "ISO 8601 datetime of when the event occurred.")
  @JsonProperty(JSON_PROPERTY_OCCURRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }


  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  public CallMachinePremiumDetectionEnded payload(CallMachinePremiumDetectionEndedPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallMachinePremiumDetectionEndedPayload getPayload() {
    return payload;
  }


  public void setPayload(CallMachinePremiumDetectionEndedPayload payload) {
    this.payload = payload;
  }


  /**
   * Return true if this CallMachinePremiumDetectionEnded object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallMachinePremiumDetectionEnded callMachinePremiumDetectionEnded = (CallMachinePremiumDetectionEnded) o;
    return Objects.equals(this.recordType, callMachinePremiumDetectionEnded.recordType) &&
        Objects.equals(this.eventType, callMachinePremiumDetectionEnded.eventType) &&
        Objects.equals(this.id, callMachinePremiumDetectionEnded.id) &&
        Objects.equals(this.occurredAt, callMachinePremiumDetectionEnded.occurredAt) &&
        Objects.equals(this.payload, callMachinePremiumDetectionEnded.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, eventType, id, occurredAt, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallMachinePremiumDetectionEnded {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

