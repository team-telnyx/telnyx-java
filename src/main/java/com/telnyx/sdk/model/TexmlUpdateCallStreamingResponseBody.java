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
 * TexmlUpdateCallStreamingResponseBody
 */
@JsonPropertyOrder(
    {
        TexmlUpdateCallStreamingResponseBody.JSON_PROPERTY_ACCOUNT_SID,
        TexmlUpdateCallStreamingResponseBody.JSON_PROPERTY_CALL_SID,
        TexmlUpdateCallStreamingResponseBody.JSON_PROPERTY_SID,
        TexmlUpdateCallStreamingResponseBody.JSON_PROPERTY_STATUS,
        TexmlUpdateCallStreamingResponseBody.JSON_PROPERTY_DATE_UPDATED,
        TexmlUpdateCallStreamingResponseBody.JSON_PROPERTY_URI,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class TexmlUpdateCallStreamingResponseBody {

    public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
    private String accountSid;

    public static final String JSON_PROPERTY_CALL_SID = "call_sid";
    private String callSid;

    public static final String JSON_PROPERTY_SID = "sid";
    private String sid;

    /**
     * The status of the streaming.
     */
    public enum StatusEnum {
        STOPPED(String.valueOf("stopped"));

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

    public static final String JSON_PROPERTY_DATE_UPDATED = "date_updated";
    private String dateUpdated;

    public static final String JSON_PROPERTY_URI = "uri";
    private String uri;

    public TexmlUpdateCallStreamingResponseBody() {}

    public TexmlUpdateCallStreamingResponseBody accountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    /**
     * Get accountSid
     * @return accountSid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "61bf923e-5e4d-4595-a110-56190ea18a1b",
        value = ""
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

    public TexmlUpdateCallStreamingResponseBody callSid(String callSid) {
        this.callSid = callSid;
        return this;
    }

    /**
     * Get callSid
     * @return callSid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA",
        value = ""
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

    public TexmlUpdateCallStreamingResponseBody sid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Identifier of a resource.
     * @return sid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "e9cea0be-7dbd-4b98-98b1-c0089d9d43b0",
        value = "Identifier of a resource."
    )
    @JsonProperty(JSON_PROPERTY_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSid() {
        return sid;
    }

    @JsonProperty(JSON_PROPERTY_SID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSid(String sid) {
        this.sid = sid;
    }

    public TexmlUpdateCallStreamingResponseBody status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the streaming.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "stopped",
        value = "The status of the streaming."
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

    public TexmlUpdateCallStreamingResponseBody dateUpdated(
        String dateUpdated
    ) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * Get dateUpdated
     * @return dateUpdated
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "Fri, 11 Aug 2023 19:12:11 +0000", value = "")
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

    public TexmlUpdateCallStreamingResponseBody uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The relative URI for this streaming resource.
     * @return uri
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json",
        value = "The relative URI for this streaming resource."
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
     * Return true if this TexmlUpdateCallStreamingResponseBody object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TexmlUpdateCallStreamingResponseBody texmlUpdateCallStreamingResponseBody =
            (TexmlUpdateCallStreamingResponseBody) o;
        return (
            Objects.equals(
                this.accountSid,
                texmlUpdateCallStreamingResponseBody.accountSid
            ) &&
            Objects.equals(
                this.callSid,
                texmlUpdateCallStreamingResponseBody.callSid
            ) &&
            Objects.equals(
                this.sid,
                texmlUpdateCallStreamingResponseBody.sid
            ) &&
            Objects.equals(
                this.status,
                texmlUpdateCallStreamingResponseBody.status
            ) &&
            Objects.equals(
                this.dateUpdated,
                texmlUpdateCallStreamingResponseBody.dateUpdated
            ) &&
            Objects.equals(this.uri, texmlUpdateCallStreamingResponseBody.uri)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, callSid, sid, status, dateUpdated, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TexmlUpdateCallStreamingResponseBody {\n");
        sb
            .append("    accountSid: ")
            .append(toIndentedString(accountSid))
            .append("\n");
        sb
            .append("    callSid: ")
            .append(toIndentedString(callSid))
            .append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    dateUpdated: ")
            .append(toIndentedString(dateUpdated))
            .append("\n");
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
