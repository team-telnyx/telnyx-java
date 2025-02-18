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
import com.telnyx.sdk.model.CustomSipHeader;
import com.telnyx.sdk.model.SipHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ReferRequest
 */
@JsonPropertyOrder(
    {
        ReferRequest.JSON_PROPERTY_SIP_ADDRESS,
        ReferRequest.JSON_PROPERTY_CLIENT_STATE,
        ReferRequest.JSON_PROPERTY_COMMAND_ID,
        ReferRequest.JSON_PROPERTY_CUSTOM_HEADERS,
        ReferRequest.JSON_PROPERTY_SIP_AUTH_USERNAME,
        ReferRequest.JSON_PROPERTY_SIP_AUTH_PASSWORD,
        ReferRequest.JSON_PROPERTY_SIP_HEADERS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ReferRequest {

    public static final String JSON_PROPERTY_SIP_ADDRESS = "sip_address";
    private String sipAddress;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    public static final String JSON_PROPERTY_CUSTOM_HEADERS = "custom_headers";
    private List<CustomSipHeader> customHeaders = null;

    public static final String JSON_PROPERTY_SIP_AUTH_USERNAME =
        "sip_auth_username";
    private String sipAuthUsername;

    public static final String JSON_PROPERTY_SIP_AUTH_PASSWORD =
        "sip_auth_password";
    private String sipAuthPassword;

    public static final String JSON_PROPERTY_SIP_HEADERS = "sip_headers";
    private List<SipHeader> sipHeaders = null;

    public ReferRequest() {}

    public ReferRequest sipAddress(String sipAddress) {
        this.sipAddress = sipAddress;
        return this;
    }

    /**
     * The SIP URI to which the call will be referred to.
     * @return sipAddress
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "sip:username@sip.non-telnyx-address.com",
        required = true,
        value = "The SIP URI to which the call will be referred to."
    )
    @JsonProperty(JSON_PROPERTY_SIP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSipAddress() {
        return sipAddress;
    }

    @JsonProperty(JSON_PROPERTY_SIP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSipAddress(String sipAddress) {
        this.sipAddress = sipAddress;
    }

    public ReferRequest clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
     * @return clientState
     **/
    @jakarta.annotation.Nullable
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

    public ReferRequest commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed.
     * @return commandId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "891510ac-f3e4-11e8-af5b-de00688a4901",
        value = "Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same `command_id` as one that has already been executed."
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

    public ReferRequest customHeaders(List<CustomSipHeader> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    public ReferRequest addcustomHeadersItem(
        CustomSipHeader customHeadersItem
    ) {
        if (this.customHeaders == null) {
            this.customHeaders = new ArrayList<>();
        }
        this.customHeaders.add(customHeadersItem);
        return this;
    }

    /**
     * Custom headers to be added to the SIP INVITE.
     * @return customHeaders
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[{\"name\":\"head_1\",\"value\":\"val_1\"},{\"name\":\"head_2\",\"value\":\"val_2\"}]",
        value = "Custom headers to be added to the SIP INVITE."
    )
    @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<CustomSipHeader> getCustomHeaders() {
        return customHeaders;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomHeaders(List<CustomSipHeader> customHeaders) {
        this.customHeaders = customHeaders;
    }

    public ReferRequest sipAuthUsername(String sipAuthUsername) {
        this.sipAuthUsername = sipAuthUsername;
        return this;
    }

    /**
     * SIP Authentication username used for SIP challenges.
     * @return sipAuthUsername
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "SIP Authentication username used for SIP challenges."
    )
    @JsonProperty(JSON_PROPERTY_SIP_AUTH_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSipAuthUsername() {
        return sipAuthUsername;
    }

    @JsonProperty(JSON_PROPERTY_SIP_AUTH_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipAuthUsername(String sipAuthUsername) {
        this.sipAuthUsername = sipAuthUsername;
    }

    public ReferRequest sipAuthPassword(String sipAuthPassword) {
        this.sipAuthPassword = sipAuthPassword;
        return this;
    }

    /**
     * SIP Authentication password used for SIP challenges.
     * @return sipAuthPassword
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "SIP Authentication password used for SIP challenges."
    )
    @JsonProperty(JSON_PROPERTY_SIP_AUTH_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSipAuthPassword() {
        return sipAuthPassword;
    }

    @JsonProperty(JSON_PROPERTY_SIP_AUTH_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipAuthPassword(String sipAuthPassword) {
        this.sipAuthPassword = sipAuthPassword;
    }

    public ReferRequest sipHeaders(List<SipHeader> sipHeaders) {
        this.sipHeaders = sipHeaders;
        return this;
    }

    public ReferRequest addsipHeadersItem(SipHeader sipHeadersItem) {
        if (this.sipHeaders == null) {
            this.sipHeaders = new ArrayList<>();
        }
        this.sipHeaders.add(sipHeadersItem);
        return this;
    }

    /**
     * SIP headers to be added to the request. Currently only User-to-User header is supported.
     * @return sipHeaders
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[{\"name\":\"User-to-User\",\"value\":\"value\"}]",
        value = "SIP headers to be added to the request. Currently only User-to-User header is supported."
    )
    @JsonProperty(JSON_PROPERTY_SIP_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<SipHeader> getSipHeaders() {
        return sipHeaders;
    }

    @JsonProperty(JSON_PROPERTY_SIP_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipHeaders(List<SipHeader> sipHeaders) {
        this.sipHeaders = sipHeaders;
    }

    /**
     * Return true if this ReferRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferRequest referRequest = (ReferRequest) o;
        return (
            Objects.equals(this.sipAddress, referRequest.sipAddress) &&
            Objects.equals(this.clientState, referRequest.clientState) &&
            Objects.equals(this.commandId, referRequest.commandId) &&
            Objects.equals(this.customHeaders, referRequest.customHeaders) &&
            Objects.equals(
                this.sipAuthUsername,
                referRequest.sipAuthUsername
            ) &&
            Objects.equals(
                this.sipAuthPassword,
                referRequest.sipAuthPassword
            ) &&
            Objects.equals(this.sipHeaders, referRequest.sipHeaders)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sipAddress,
            clientState,
            commandId,
            customHeaders,
            sipAuthUsername,
            sipAuthPassword,
            sipHeaders
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferRequest {\n");
        sb
            .append("    sipAddress: ")
            .append(toIndentedString(sipAddress))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
            .append("\n");
        sb
            .append("    customHeaders: ")
            .append(toIndentedString(customHeaders))
            .append("\n");
        sb
            .append("    sipAuthUsername: ")
            .append(toIndentedString(sipAuthUsername))
            .append("\n");
        sb
            .append("    sipAuthPassword: ")
            .append(toIndentedString(sipAuthPassword))
            .append("\n");
        sb
            .append("    sipHeaders: ")
            .append(toIndentedString(sipHeaders))
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
