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
 * SendSIPInfoRequest
 */
@JsonPropertyOrder(
    {
        SendSIPInfoRequest.JSON_PROPERTY_CONTENT_TYPE,
        SendSIPInfoRequest.JSON_PROPERTY_BODY,
        SendSIPInfoRequest.JSON_PROPERTY_CLIENT_STATE,
        SendSIPInfoRequest.JSON_PROPERTY_COMMAND_ID,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SendSIPInfoRequest {

    public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
    private String contentType;

    public static final String JSON_PROPERTY_BODY = "body";
    private String body;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    public SendSIPInfoRequest() {}

    public SendSIPInfoRequest contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Content type of the INFO body. Must be MIME type compliant. There is a 1,400 bytes limit
     * @return contentType
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "application/json",
        required = true,
        value = "Content type of the INFO body. Must be MIME type compliant. There is a 1,400 bytes limit"
    )
    @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContentType() {
        return contentType;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public SendSIPInfoRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Content of the SIP INFO
     * @return body
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "{\"key\": \"value\", \"numValue\": 100}",
        required = true,
        value = "Content of the SIP INFO"
    )
    @JsonProperty(JSON_PROPERTY_BODY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBody() {
        return body;
    }

    @JsonProperty(JSON_PROPERTY_BODY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBody(String body) {
        this.body = body;
    }

    public SendSIPInfoRequest clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
     * @return clientState
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string."
    )
    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getClientState() {
        return clientState;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClientState(String clientState) {
        this.clientState = clientState;
    }

    public SendSIPInfoRequest commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
     * @return commandId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "891510ac-f3e4-11e8-af5b-de00688a4901",
        value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`."
    )
    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCommandId() {
        return commandId;
    }

    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * Return true if this SendSIPInfoRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendSIPInfoRequest sendSIPInfoRequest = (SendSIPInfoRequest) o;
        return (
            Objects.equals(this.contentType, sendSIPInfoRequest.contentType) &&
            Objects.equals(this.body, sendSIPInfoRequest.body) &&
            Objects.equals(this.clientState, sendSIPInfoRequest.clientState) &&
            Objects.equals(this.commandId, sendSIPInfoRequest.commandId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, body, clientState, commandId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendSIPInfoRequest {\n");
        sb
            .append("    contentType: ")
            .append(toIndentedString(contentType))
            .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
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
