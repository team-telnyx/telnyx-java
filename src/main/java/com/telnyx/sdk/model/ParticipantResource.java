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

/**
 * ParticipantResource
 */
@JsonPropertyOrder(
    {
        ParticipantResource.JSON_PROPERTY_ACCOUNT_SID,
        ParticipantResource.JSON_PROPERTY_API_VERSION,
        ParticipantResource.JSON_PROPERTY_CALL_SID,
        ParticipantResource.JSON_PROPERTY_CALL_SID_LEGACY,
        ParticipantResource.JSON_PROPERTY_COACHING,
        ParticipantResource.JSON_PROPERTY_COACHING_CALL_SID,
        ParticipantResource.JSON_PROPERTY_COACHING_CALL_SID_LEGACY,
        ParticipantResource.JSON_PROPERTY_DATE_CREATED,
        ParticipantResource.JSON_PROPERTY_DATE_UPDATED,
        ParticipantResource.JSON_PROPERTY_END_CONFERENCE_ON_EXIT,
        ParticipantResource.JSON_PROPERTY_HOLD,
        ParticipantResource.JSON_PROPERTY_MUTED,
        ParticipantResource.JSON_PROPERTY_STATUS,
        ParticipantResource.JSON_PROPERTY_URI,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ParticipantResource {

    public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
    private String accountSid;

    public static final String JSON_PROPERTY_API_VERSION = "api_version";
    private String apiVersion;

    public static final String JSON_PROPERTY_CALL_SID = "call_sid";
    private String callSid;

    public static final String JSON_PROPERTY_CALL_SID_LEGACY =
        "call_sid_legacy";
    private String callSidLegacy;

    public static final String JSON_PROPERTY_COACHING = "coaching";
    private Boolean coaching;

    public static final String JSON_PROPERTY_COACHING_CALL_SID =
        "coaching_call_sid";
    private String coachingCallSid;

    public static final String JSON_PROPERTY_COACHING_CALL_SID_LEGACY =
        "coaching_call_sid_legacy";
    private String coachingCallSidLegacy;

    public static final String JSON_PROPERTY_DATE_CREATED = "date_created";
    private String dateCreated;

    public static final String JSON_PROPERTY_DATE_UPDATED = "date_updated";
    private String dateUpdated;

    public static final String JSON_PROPERTY_END_CONFERENCE_ON_EXIT =
        "end_conference_on_exit";
    private Boolean endConferenceOnExit;

    public static final String JSON_PROPERTY_HOLD = "hold";
    private Boolean hold;

    public static final String JSON_PROPERTY_MUTED = "muted";
    private Boolean muted;

    /**
     * The status of the participant&#39;s call in the conference.
     */
    public enum StatusEnum {
        CONNECTING(String.valueOf("connecting")),

        CONNECTED(String.valueOf("connected")),

        COMPLETED(String.valueOf("completed"));

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

    public static final String JSON_PROPERTY_URI = "uri";
    private String uri;

    public ParticipantResource() {}

    public ParticipantResource accountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    /**
     * The id of the account the resource belongs to.
     * @return accountSid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "61bf923e-5e4d-4595-a110-56190ea18a1b",
        value = "The id of the account the resource belongs to."
    )
    @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAccountSid() {
        return accountSid;
    }

    @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public ParticipantResource apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The version of the API that was used to make the request.
     * @return apiVersion
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v2/texml",
        value = "The version of the API that was used to make the request."
    )
    @JsonProperty(JSON_PROPERTY_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty(JSON_PROPERTY_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ParticipantResource callSid(String callSid) {
        this.callSid = callSid;
        return this;
    }

    /**
     * The identifier of this participant&#39;s call.
     * @return callSid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ",
        value = "The identifier of this participant's call."
    )
    @JsonProperty(JSON_PROPERTY_CALL_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCallSid() {
        return callSid;
    }

    @JsonProperty(JSON_PROPERTY_CALL_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallSid(String callSid) {
        this.callSid = callSid;
    }

    public ParticipantResource callSidLegacy(String callSidLegacy) {
        this.callSidLegacy = callSidLegacy;
        return this;
    }

    /**
     * The identifier of this participant&#39;s call.
     * @return callSidLegacy
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ",
        value = "The identifier of this participant's call."
    )
    @JsonProperty(JSON_PROPERTY_CALL_SID_LEGACY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCallSidLegacy() {
        return callSidLegacy;
    }

    @JsonProperty(JSON_PROPERTY_CALL_SID_LEGACY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallSidLegacy(String callSidLegacy) {
        this.callSidLegacy = callSidLegacy;
    }

    public ParticipantResource coaching(Boolean coaching) {
        this.coaching = coaching;
        return this;
    }

    /**
     * Whether the participant is coaching another call.
     * @return coaching
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the participant is coaching another call."
    )
    @JsonProperty(JSON_PROPERTY_COACHING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCoaching() {
        return coaching;
    }

    @JsonProperty(JSON_PROPERTY_COACHING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoaching(Boolean coaching) {
        this.coaching = coaching;
    }

    public ParticipantResource coachingCallSid(String coachingCallSid) {
        this.coachingCallSid = coachingCallSid;
        return this;
    }

    /**
     * The identifier of the coached participant&#39;s call.
     * @return coachingCallSid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ",
        value = "The identifier of the coached participant's call."
    )
    @JsonProperty(JSON_PROPERTY_COACHING_CALL_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCoachingCallSid() {
        return coachingCallSid;
    }

    @JsonProperty(JSON_PROPERTY_COACHING_CALL_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoachingCallSid(String coachingCallSid) {
        this.coachingCallSid = coachingCallSid;
    }

    public ParticipantResource coachingCallSidLegacy(
        String coachingCallSidLegacy
    ) {
        this.coachingCallSidLegacy = coachingCallSidLegacy;
        return this;
    }

    /**
     * The identifier of the coached participant&#39;s call.
     * @return coachingCallSidLegacy
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ",
        value = "The identifier of the coached participant's call."
    )
    @JsonProperty(JSON_PROPERTY_COACHING_CALL_SID_LEGACY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCoachingCallSidLegacy() {
        return coachingCallSidLegacy;
    }

    @JsonProperty(JSON_PROPERTY_COACHING_CALL_SID_LEGACY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoachingCallSidLegacy(String coachingCallSidLegacy) {
        this.coachingCallSidLegacy = coachingCallSidLegacy;
    }

    public ParticipantResource dateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The timestamp of when the resource was created.
     * @return dateCreated
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Thu, 15 Jun 2023 09:56:45 +0000",
        value = "The timestamp of when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_DATE_CREATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty(JSON_PROPERTY_DATE_CREATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ParticipantResource dateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * The timestamp of when the resource was last updated.
     * @return dateUpdated
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Thu, 15 Jun 2023 09:56:45 +0000",
        value = "The timestamp of when the resource was last updated."
    )
    @JsonProperty(JSON_PROPERTY_DATE_UPDATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDateUpdated() {
        return dateUpdated;
    }

    @JsonProperty(JSON_PROPERTY_DATE_UPDATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ParticipantResource endConferenceOnExit(
        Boolean endConferenceOnExit
    ) {
        this.endConferenceOnExit = endConferenceOnExit;
        return this;
    }

    /**
     * Whether the conference ends when the participant leaves.
     * @return endConferenceOnExit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the conference ends when the participant leaves."
    )
    @JsonProperty(JSON_PROPERTY_END_CONFERENCE_ON_EXIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEndConferenceOnExit() {
        return endConferenceOnExit;
    }

    @JsonProperty(JSON_PROPERTY_END_CONFERENCE_ON_EXIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndConferenceOnExit(Boolean endConferenceOnExit) {
        this.endConferenceOnExit = endConferenceOnExit;
    }

    public ParticipantResource hold(Boolean hold) {
        this.hold = hold;
        return this;
    }

    /**
     * Whether the participant is on hold.
     * @return hold
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the participant is on hold."
    )
    @JsonProperty(JSON_PROPERTY_HOLD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getHold() {
        return hold;
    }

    @JsonProperty(JSON_PROPERTY_HOLD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHold(Boolean hold) {
        this.hold = hold;
    }

    public ParticipantResource muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * Whether the participant is muted.
     * @return muted
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the participant is muted."
    )
    @JsonProperty(JSON_PROPERTY_MUTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getMuted() {
        return muted;
    }

    @JsonProperty(JSON_PROPERTY_MUTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public ParticipantResource status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the participant&#39;s call in the conference.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "in-progress",
        value = "The status of the participant's call in the conference."
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

    public ParticipantResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The relative URI for this participant.
     * @return uri
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json",
        value = "The relative URI for this participant."
    )
    @JsonProperty(JSON_PROPERTY_URI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUri() {
        return uri;
    }

    @JsonProperty(JSON_PROPERTY_URI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Return true if this ParticipantResource object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantResource participantResource = (ParticipantResource) o;
        return (
            Objects.equals(this.accountSid, participantResource.accountSid) &&
            Objects.equals(this.apiVersion, participantResource.apiVersion) &&
            Objects.equals(this.callSid, participantResource.callSid) &&
            Objects.equals(
                this.callSidLegacy,
                participantResource.callSidLegacy
            ) &&
            Objects.equals(this.coaching, participantResource.coaching) &&
            Objects.equals(
                this.coachingCallSid,
                participantResource.coachingCallSid
            ) &&
            Objects.equals(
                this.coachingCallSidLegacy,
                participantResource.coachingCallSidLegacy
            ) &&
            Objects.equals(this.dateCreated, participantResource.dateCreated) &&
            Objects.equals(this.dateUpdated, participantResource.dateUpdated) &&
            Objects.equals(
                this.endConferenceOnExit,
                participantResource.endConferenceOnExit
            ) &&
            Objects.equals(this.hold, participantResource.hold) &&
            Objects.equals(this.muted, participantResource.muted) &&
            Objects.equals(this.status, participantResource.status) &&
            Objects.equals(this.uri, participantResource.uri)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            apiVersion,
            callSid,
            callSidLegacy,
            coaching,
            coachingCallSid,
            coachingCallSidLegacy,
            dateCreated,
            dateUpdated,
            endConferenceOnExit,
            hold,
            muted,
            status,
            uri
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParticipantResource {\n");
        sb
            .append("    accountSid: ")
            .append(toIndentedString(accountSid))
            .append("\n");
        sb
            .append("    apiVersion: ")
            .append(toIndentedString(apiVersion))
            .append("\n");
        sb
            .append("    callSid: ")
            .append(toIndentedString(callSid))
            .append("\n");
        sb
            .append("    callSidLegacy: ")
            .append(toIndentedString(callSidLegacy))
            .append("\n");
        sb
            .append("    coaching: ")
            .append(toIndentedString(coaching))
            .append("\n");
        sb
            .append("    coachingCallSid: ")
            .append(toIndentedString(coachingCallSid))
            .append("\n");
        sb
            .append("    coachingCallSidLegacy: ")
            .append(toIndentedString(coachingCallSidLegacy))
            .append("\n");
        sb
            .append("    dateCreated: ")
            .append(toIndentedString(dateCreated))
            .append("\n");
        sb
            .append("    dateUpdated: ")
            .append(toIndentedString(dateUpdated))
            .append("\n");
        sb
            .append("    endConferenceOnExit: ")
            .append(toIndentedString(endConferenceOnExit))
            .append("\n");
        sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
        sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
