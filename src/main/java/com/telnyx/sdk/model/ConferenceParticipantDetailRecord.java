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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ConferenceParticipantDetailRecord
 */
@JsonPropertyOrder(
    {
        ConferenceParticipantDetailRecord.JSON_PROPERTY_ID,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_USER_ID,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_CONFERENCE_ID,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_JOINED_AT,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_LEFT_AT,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_DESTINATION_NUMBER,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_ORIGINATING_NUMBER,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_CALL_LEG_ID,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_CALL_SESSION_ID,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_CALL_SEC,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_BILLED_SEC,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_IS_TELNYX_BILLABLE,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_RATE,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_RATE_MEASURED_IN,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_COST,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_CURRENCY,
        ConferenceParticipantDetailRecord.JSON_PROPERTY_RECORD_TYPE,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ConferenceParticipantDetailRecord {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_USER_ID = "user_id";
    private String userId;

    public static final String JSON_PROPERTY_CONFERENCE_ID = "conference_id";
    private String conferenceId;

    public static final String JSON_PROPERTY_JOINED_AT = "joined_at";
    private OffsetDateTime joinedAt;

    public static final String JSON_PROPERTY_LEFT_AT = "left_at";
    private OffsetDateTime leftAt;

    public static final String JSON_PROPERTY_DESTINATION_NUMBER =
        "destination_number";
    private String destinationNumber;

    public static final String JSON_PROPERTY_ORIGINATING_NUMBER =
        "originating_number";
    private String originatingNumber;

    public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
    private String callLegId;

    public static final String JSON_PROPERTY_CALL_SESSION_ID =
        "call_session_id";
    private String callSessionId;

    public static final String JSON_PROPERTY_CALL_SEC = "call_sec";
    private Integer callSec;

    public static final String JSON_PROPERTY_BILLED_SEC = "billed_sec";
    private Integer billedSec;

    public static final String JSON_PROPERTY_IS_TELNYX_BILLABLE =
        "is_telnyx_billable";
    private Boolean isTelnyxBillable;

    public static final String JSON_PROPERTY_RATE = "rate";
    private String rate;

    public static final String JSON_PROPERTY_RATE_MEASURED_IN =
        "rate_measured_in";
    private String rateMeasuredIn;

    public static final String JSON_PROPERTY_COST = "cost";
    private String cost;

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    private String currency;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType = "conference_participant_detail_record";

    public ConferenceParticipantDetailRecord() {}

    public ConferenceParticipantDetailRecord id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Participant id
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "3ca7bd3d-7d82-4e07-9df4-009123068320",
        value = "Participant id"
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public ConferenceParticipantDetailRecord userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * User id
     * @return userId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "3ca7bd3d-7d82-4e07-9df4-009123068320",
        value = "User id"
    )
    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUserId() {
        return userId;
    }

    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ConferenceParticipantDetailRecord conferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Conference id
     * @return conferenceId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "3ca7bd3d-7d82-4e07-9df4-009123068320",
        value = "Conference id"
    )
    @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getConferenceId() {
        return conferenceId;
    }

    @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public ConferenceParticipantDetailRecord joinedAt(OffsetDateTime joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }

    /**
     * Participant join time
     * @return joinedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2020-07-01T00:00-06:00",
        value = "Participant join time"
    )
    @JsonProperty(JSON_PROPERTY_JOINED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getJoinedAt() {
        return joinedAt;
    }

    @JsonProperty(JSON_PROPERTY_JOINED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setJoinedAt(OffsetDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public ConferenceParticipantDetailRecord leftAt(OffsetDateTime leftAt) {
        this.leftAt = leftAt;
        return this;
    }

    /**
     * Participant leave time
     * @return leftAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2020-07-01T00:00-06:00",
        value = "Participant leave time"
    )
    @JsonProperty(JSON_PROPERTY_LEFT_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getLeftAt() {
        return leftAt;
    }

    @JsonProperty(JSON_PROPERTY_LEFT_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLeftAt(OffsetDateTime leftAt) {
        this.leftAt = leftAt;
    }

    public ConferenceParticipantDetailRecord destinationNumber(
        String destinationNumber
    ) {
        this.destinationNumber = destinationNumber;
        return this;
    }

    /**
     * Number called by the participant to join the conference
     * @return destinationNumber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "+18005550199",
        value = "Number called by the participant to join the conference"
    )
    @JsonProperty(JSON_PROPERTY_DESTINATION_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDestinationNumber() {
        return destinationNumber;
    }

    @JsonProperty(JSON_PROPERTY_DESTINATION_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    public ConferenceParticipantDetailRecord originatingNumber(
        String originatingNumber
    ) {
        this.originatingNumber = originatingNumber;
        return this;
    }

    /**
     * Participant origin number used in the conference call
     * @return originatingNumber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "+18005550199",
        value = "Participant origin number used in the conference call"
    )
    @JsonProperty(JSON_PROPERTY_ORIGINATING_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOriginatingNumber() {
        return originatingNumber;
    }

    @JsonProperty(JSON_PROPERTY_ORIGINATING_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOriginatingNumber(String originatingNumber) {
        this.originatingNumber = originatingNumber;
    }

    public ConferenceParticipantDetailRecord callLegId(String callLegId) {
        this.callLegId = callLegId;
        return this;
    }

    /**
     * Telnyx UUID that identifies the conference call leg
     * @return callLegId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "3ca7bd3d-7d82-4e07-9df4-009123068320",
        value = "Telnyx UUID that identifies the conference call leg"
    )
    @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCallLegId() {
        return callLegId;
    }

    @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallLegId(String callLegId) {
        this.callLegId = callLegId;
    }

    public ConferenceParticipantDetailRecord callSessionId(
        String callSessionId
    ) {
        this.callSessionId = callSessionId;
        return this;
    }

    /**
     * Telnyx UUID that identifies with conference call session
     * @return callSessionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "3ca7bd3d-7d82-4e07-9df4-009123068320",
        value = "Telnyx UUID that identifies with conference call session"
    )
    @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCallSessionId() {
        return callSessionId;
    }

    @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallSessionId(String callSessionId) {
        this.callSessionId = callSessionId;
    }

    public ConferenceParticipantDetailRecord callSec(Integer callSec) {
        this.callSec = callSec;
        return this;
    }

    /**
     * Duration of the conference call in seconds
     * @return callSec
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "100",
        value = "Duration of the conference call in seconds"
    )
    @JsonProperty(JSON_PROPERTY_CALL_SEC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCallSec() {
        return callSec;
    }

    @JsonProperty(JSON_PROPERTY_CALL_SEC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallSec(Integer callSec) {
        this.callSec = callSec;
    }

    public ConferenceParticipantDetailRecord billedSec(Integer billedSec) {
        this.billedSec = billedSec;
        return this;
    }

    /**
     * Duration of the conference call for billing purposes
     * @return billedSec
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "120",
        value = "Duration of the conference call for billing purposes"
    )
    @JsonProperty(JSON_PROPERTY_BILLED_SEC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getBilledSec() {
        return billedSec;
    }

    @JsonProperty(JSON_PROPERTY_BILLED_SEC)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBilledSec(Integer billedSec) {
        this.billedSec = billedSec;
    }

    public ConferenceParticipantDetailRecord isTelnyxBillable(
        Boolean isTelnyxBillable
    ) {
        this.isTelnyxBillable = isTelnyxBillable;
        return this;
    }

    /**
     * Indicates whether Telnyx billing charges might be applicable
     * @return isTelnyxBillable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Indicates whether Telnyx billing charges might be applicable"
    )
    @JsonProperty(JSON_PROPERTY_IS_TELNYX_BILLABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsTelnyxBillable() {
        return isTelnyxBillable;
    }

    @JsonProperty(JSON_PROPERTY_IS_TELNYX_BILLABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsTelnyxBillable(Boolean isTelnyxBillable) {
        this.isTelnyxBillable = isTelnyxBillable;
    }

    public ConferenceParticipantDetailRecord rate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Currency amount per billing unit used to calculate the Telnyx billing cost
     * @return rate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "0.002",
        value = "Currency amount per billing unit used to calculate the Telnyx billing cost"
    )
    @JsonProperty(JSON_PROPERTY_RATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRate() {
        return rate;
    }

    @JsonProperty(JSON_PROPERTY_RATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRate(String rate) {
        this.rate = rate;
    }

    public ConferenceParticipantDetailRecord rateMeasuredIn(
        String rateMeasuredIn
    ) {
        this.rateMeasuredIn = rateMeasuredIn;
        return this;
    }

    /**
     * Billing unit used to calculate the Telnyx billing cost
     * @return rateMeasuredIn
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "minutes",
        value = "Billing unit used to calculate the Telnyx billing cost"
    )
    @JsonProperty(JSON_PROPERTY_RATE_MEASURED_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRateMeasuredIn() {
        return rateMeasuredIn;
    }

    @JsonProperty(JSON_PROPERTY_RATE_MEASURED_IN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRateMeasuredIn(String rateMeasuredIn) {
        this.rateMeasuredIn = rateMeasuredIn;
    }

    public ConferenceParticipantDetailRecord cost(String cost) {
        this.cost = cost;
        return this;
    }

    /**
     * Currency amount for Telnyx billing cost
     * @return cost
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "0.004",
        value = "Currency amount for Telnyx billing cost"
    )
    @JsonProperty(JSON_PROPERTY_COST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCost() {
        return cost;
    }

    @JsonProperty(JSON_PROPERTY_COST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCost(String cost) {
        this.cost = cost;
    }

    public ConferenceParticipantDetailRecord currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Telnyx account currency used to describe monetary values, including billing cost
     * @return currency
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "USD",
        value = "Telnyx account currency used to describe monetary values, including billing cost"
    )
    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCurrency() {
        return currency;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ConferenceParticipantDetailRecord recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "conference_participant_detail_record",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * Return true if this ConferenceParticipantDetailRecord object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConferenceParticipantDetailRecord conferenceParticipantDetailRecord =
            (ConferenceParticipantDetailRecord) o;
        return (
            Objects.equals(this.id, conferenceParticipantDetailRecord.id) &&
            Objects.equals(
                this.userId,
                conferenceParticipantDetailRecord.userId
            ) &&
            Objects.equals(
                this.conferenceId,
                conferenceParticipantDetailRecord.conferenceId
            ) &&
            Objects.equals(
                this.joinedAt,
                conferenceParticipantDetailRecord.joinedAt
            ) &&
            Objects.equals(
                this.leftAt,
                conferenceParticipantDetailRecord.leftAt
            ) &&
            Objects.equals(
                this.destinationNumber,
                conferenceParticipantDetailRecord.destinationNumber
            ) &&
            Objects.equals(
                this.originatingNumber,
                conferenceParticipantDetailRecord.originatingNumber
            ) &&
            Objects.equals(
                this.callLegId,
                conferenceParticipantDetailRecord.callLegId
            ) &&
            Objects.equals(
                this.callSessionId,
                conferenceParticipantDetailRecord.callSessionId
            ) &&
            Objects.equals(
                this.callSec,
                conferenceParticipantDetailRecord.callSec
            ) &&
            Objects.equals(
                this.billedSec,
                conferenceParticipantDetailRecord.billedSec
            ) &&
            Objects.equals(
                this.isTelnyxBillable,
                conferenceParticipantDetailRecord.isTelnyxBillable
            ) &&
            Objects.equals(this.rate, conferenceParticipantDetailRecord.rate) &&
            Objects.equals(
                this.rateMeasuredIn,
                conferenceParticipantDetailRecord.rateMeasuredIn
            ) &&
            Objects.equals(this.cost, conferenceParticipantDetailRecord.cost) &&
            Objects.equals(
                this.currency,
                conferenceParticipantDetailRecord.currency
            ) &&
            Objects.equals(
                this.recordType,
                conferenceParticipantDetailRecord.recordType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            userId,
            conferenceId,
            joinedAt,
            leftAt,
            destinationNumber,
            originatingNumber,
            callLegId,
            callSessionId,
            callSec,
            billedSec,
            isTelnyxBillable,
            rate,
            rateMeasuredIn,
            cost,
            currency,
            recordType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConferenceParticipantDetailRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb
            .append("    conferenceId: ")
            .append(toIndentedString(conferenceId))
            .append("\n");
        sb
            .append("    joinedAt: ")
            .append(toIndentedString(joinedAt))
            .append("\n");
        sb.append("    leftAt: ").append(toIndentedString(leftAt)).append("\n");
        sb
            .append("    destinationNumber: ")
            .append(toIndentedString(destinationNumber))
            .append("\n");
        sb
            .append("    originatingNumber: ")
            .append(toIndentedString(originatingNumber))
            .append("\n");
        sb
            .append("    callLegId: ")
            .append(toIndentedString(callLegId))
            .append("\n");
        sb
            .append("    callSessionId: ")
            .append(toIndentedString(callSessionId))
            .append("\n");
        sb
            .append("    callSec: ")
            .append(toIndentedString(callSec))
            .append("\n");
        sb
            .append("    billedSec: ")
            .append(toIndentedString(billedSec))
            .append("\n");
        sb
            .append("    isTelnyxBillable: ")
            .append(toIndentedString(isTelnyxBillable))
            .append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb
            .append("    rateMeasuredIn: ")
            .append(toIndentedString(rateMeasuredIn))
            .append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb
            .append("    currency: ")
            .append(toIndentedString(currency))
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
