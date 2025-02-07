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
 * TexmlUpdateSiprecSessionResponseBody
 */
@JsonPropertyOrder(
    {
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_ACCOUNT_SID,
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_CALL_SID,
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_SID,
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_DATE_UPDATED,
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_STATUS,
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_URI,
        TexmlUpdateSiprecSessionResponseBody.JSON_PROPERTY_ERROR_CODE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class TexmlUpdateSiprecSessionResponseBody {

    public static final String JSON_PROPERTY_ACCOUNT_SID = "account_sid";
    private String accountSid;

    public static final String JSON_PROPERTY_CALL_SID = "call_sid";
    private String callSid;

    public static final String JSON_PROPERTY_SID = "sid";
    private String sid;

    public static final String JSON_PROPERTY_DATE_UPDATED = "date_updated";
    private String dateUpdated;

    /**
     * The status of the siprec session.
     */
    public enum StatusEnum {
        IN_PROGRESS(String.valueOf("in-progress")),

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

    public static final String JSON_PROPERTY_URI = "uri";
    private String uri;

    public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
    private String errorCode;

    public TexmlUpdateSiprecSessionResponseBody() {}

    public TexmlUpdateSiprecSessionResponseBody accountSid(String accountSid) {
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

    public TexmlUpdateSiprecSessionResponseBody callSid(String callSid) {
        this.callSid = callSid;
        return this;
    }

    /**
     * The id of the call the resource belongs to.
     * @return callSid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ",
        value = "The id of the call the resource belongs to."
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

    public TexmlUpdateSiprecSessionResponseBody sid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * The SID of the siprec session.
     * @return sid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "61bf923e-5e4d-4595-a110-56190ea18123",
        value = "The SID of the siprec session."
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

    public TexmlUpdateSiprecSessionResponseBody dateUpdated(
        String dateUpdated
    ) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * The date and time the siprec session was last updated.
     * @return dateUpdated
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Fri, 11 Aug 2023 19:12:11 +0000",
        value = "The date and time the siprec session was last updated."
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

    public TexmlUpdateSiprecSessionResponseBody status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the siprec session.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "in-progress",
        value = "The status of the siprec session."
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

    public TexmlUpdateSiprecSessionResponseBody uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI of the siprec session.
     * @return uri
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123",
        value = "The URI of the siprec session."
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

    public TexmlUpdateSiprecSessionResponseBody errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * The error code of the siprec session.
     * @return errorCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The error code of the siprec session.")
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Return true if this TexmlUpdateSiprecSessionResponseBody object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TexmlUpdateSiprecSessionResponseBody texmlUpdateSiprecSessionResponseBody =
            (TexmlUpdateSiprecSessionResponseBody) o;
        return (
            Objects.equals(
                this.accountSid,
                texmlUpdateSiprecSessionResponseBody.accountSid
            ) &&
            Objects.equals(
                this.callSid,
                texmlUpdateSiprecSessionResponseBody.callSid
            ) &&
            Objects.equals(
                this.sid,
                texmlUpdateSiprecSessionResponseBody.sid
            ) &&
            Objects.equals(
                this.dateUpdated,
                texmlUpdateSiprecSessionResponseBody.dateUpdated
            ) &&
            Objects.equals(
                this.status,
                texmlUpdateSiprecSessionResponseBody.status
            ) &&
            Objects.equals(
                this.uri,
                texmlUpdateSiprecSessionResponseBody.uri
            ) &&
            Objects.equals(
                this.errorCode,
                texmlUpdateSiprecSessionResponseBody.errorCode
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            callSid,
            sid,
            dateUpdated,
            status,
            uri,
            errorCode
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TexmlUpdateSiprecSessionResponseBody {\n");
        sb
            .append("    accountSid: ")
            .append(toIndentedString(accountSid))
            .append("\n");
        sb
            .append("    callSid: ")
            .append(toIndentedString(callSid))
            .append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb
            .append("    dateUpdated: ")
            .append(toIndentedString(dateUpdated))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb
            .append("    errorCode: ")
            .append(toIndentedString(errorCode))
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
