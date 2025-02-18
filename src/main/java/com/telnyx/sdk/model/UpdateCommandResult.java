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
 * UpdateCommandResult
 */
@JsonPropertyOrder(
    {
        UpdateCommandResult.JSON_PROPERTY_SID,
        UpdateCommandResult.JSON_PROPERTY_STATUS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateCommandResult {

    public static final String JSON_PROPERTY_SID = "sid";
    private String sid;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public UpdateCommandResult() {}

    public UpdateCommandResult sid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get sid
     * @return sid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "c46e06d7-b78f-4b13-96b6-c576af9640ff",
        value = ""
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

    public UpdateCommandResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "accepted", value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Return true if this UpdateCommandResult object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCommandResult updateCommandResult = (UpdateCommandResult) o;
        return (
            Objects.equals(this.sid, updateCommandResult.sid) &&
            Objects.equals(this.status, updateCommandResult.status)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCommandResult {\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
