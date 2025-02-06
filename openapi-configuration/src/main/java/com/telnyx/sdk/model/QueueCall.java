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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * QueueCall
 */
@JsonPropertyOrder({
  QueueCall.JSON_PROPERTY_RECORD_TYPE,
  QueueCall.JSON_PROPERTY_CALL_SESSION_ID,
  QueueCall.JSON_PROPERTY_CALL_LEG_ID,
  QueueCall.JSON_PROPERTY_CALL_CONTROL_ID,
  QueueCall.JSON_PROPERTY_CONNECTION_ID,
  QueueCall.JSON_PROPERTY_FROM,
  QueueCall.JSON_PROPERTY_TO,
  QueueCall.JSON_PROPERTY_ENQUEUED_AT,
  QueueCall.JSON_PROPERTY_WAIT_TIME_SECS,
  QueueCall.JSON_PROPERTY_QUEUE_POSITION,
  QueueCall.JSON_PROPERTY_QUEUE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class QueueCall {
  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    QUEUE_CALL(String.valueOf("queue_call"));

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

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_ENQUEUED_AT = "enqueued_at";
  private String enqueuedAt;

  public static final String JSON_PROPERTY_WAIT_TIME_SECS = "wait_time_secs";
  private Integer waitTimeSecs;

  public static final String JSON_PROPERTY_QUEUE_POSITION = "queue_position";
  private Integer queuePosition;

  public static final String JSON_PROPERTY_QUEUE_ID = "queue_id";
  private String queueId;

  public QueueCall() { 
  }

  public QueueCall recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "queue_call", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public QueueCall callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call
   * @return callSessionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b68e-5013ef9657c1", required = true, value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallSessionId() {
    return callSessionId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public QueueCall callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events
   * @return callLegId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", required = true, value = "ID that is unique to the call and can be used to correlate webhook events")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallLegId() {
    return callLegId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public QueueCall callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Unique identifier and token for controlling the call.
   * @return callControlId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg", required = true, value = "Unique identifier and token for controlling the call.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCallControlId() {
    return callControlId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public QueueCall connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Call Control App ID (formerly Telnyx connection ID) used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", required = true, value = "Call Control App ID (formerly Telnyx connection ID) used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public QueueCall from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Number or SIP URI placing the call.
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+35319605860", required = true, value = "Number or SIP URI placing the call.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(String from) {
    this.from = from;
  }


  public QueueCall to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Destination number or SIP URI of the call.
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "+13129457420", required = true, value = "Destination number or SIP URI of the call.")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(String to) {
    this.to = to;
  }


  public QueueCall enqueuedAt(String enqueuedAt) {
    this.enqueuedAt = enqueuedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the call was put in the queue
   * @return enqueuedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-23T18:10:02.574Z", required = true, value = "ISO 8601 formatted date of when the call was put in the queue")
  @JsonProperty(JSON_PROPERTY_ENQUEUED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnqueuedAt() {
    return enqueuedAt;
  }


  @JsonProperty(JSON_PROPERTY_ENQUEUED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnqueuedAt(String enqueuedAt) {
    this.enqueuedAt = enqueuedAt;
  }


  public QueueCall waitTimeSecs(Integer waitTimeSecs) {
    this.waitTimeSecs = waitTimeSecs;
    return this;
  }

   /**
   * The time the call has been waiting in the queue, given in seconds
   * @return waitTimeSecs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "272", required = true, value = "The time the call has been waiting in the queue, given in seconds")
  @JsonProperty(JSON_PROPERTY_WAIT_TIME_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWaitTimeSecs() {
    return waitTimeSecs;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_TIME_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWaitTimeSecs(Integer waitTimeSecs) {
    this.waitTimeSecs = waitTimeSecs;
  }


  public QueueCall queuePosition(Integer queuePosition) {
    this.queuePosition = queuePosition;
    return this;
  }

   /**
   * Current position of the call in the queue
   * @return queuePosition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Current position of the call in the queue")
  @JsonProperty(JSON_PROPERTY_QUEUE_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQueuePosition() {
    return queuePosition;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueuePosition(Integer queuePosition) {
    this.queuePosition = queuePosition;
  }


  public QueueCall queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * Unique identifier of the queue the call is in.
   * @return queueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ae1626cc-6f42-11ea-becd-02420a0f8b69", required = true, value = "Unique identifier of the queue the call is in.")
  @JsonProperty(JSON_PROPERTY_QUEUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueueId() {
    return queueId;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Return true if this QueueCall object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueCall queueCall = (QueueCall) o;
    return Objects.equals(this.recordType, queueCall.recordType) &&
        Objects.equals(this.callSessionId, queueCall.callSessionId) &&
        Objects.equals(this.callLegId, queueCall.callLegId) &&
        Objects.equals(this.callControlId, queueCall.callControlId) &&
        Objects.equals(this.connectionId, queueCall.connectionId) &&
        Objects.equals(this.from, queueCall.from) &&
        Objects.equals(this.to, queueCall.to) &&
        Objects.equals(this.enqueuedAt, queueCall.enqueuedAt) &&
        Objects.equals(this.waitTimeSecs, queueCall.waitTimeSecs) &&
        Objects.equals(this.queuePosition, queueCall.queuePosition) &&
        Objects.equals(this.queueId, queueCall.queueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, callSessionId, callLegId, callControlId, connectionId, from, to, enqueuedAt, waitTimeSecs, queuePosition, queueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueCall {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    enqueuedAt: ").append(toIndentedString(enqueuedAt)).append("\n");
    sb.append("    waitTimeSecs: ").append(toIndentedString(waitTimeSecs)).append("\n");
    sb.append("    queuePosition: ").append(toIndentedString(queuePosition)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
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

