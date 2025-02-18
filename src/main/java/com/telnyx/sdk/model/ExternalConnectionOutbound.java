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
 * ExternalConnectionOutbound
 */
@JsonPropertyOrder(
    {
        ExternalConnectionOutbound.JSON_PROPERTY_CHANNEL_LIMIT,
        ExternalConnectionOutbound.JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ExternalConnectionOutbound {

    public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
    private Integer channelLimit;

    public static final String JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID =
        "outbound_voice_profile_id";
    private String outboundVoiceProfileId;

    public ExternalConnectionOutbound() {}

    public ExternalConnectionOutbound channelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * When set, this will limit the number of concurrent outbound calls to phone numbers associated with this connection.
     * @return channelLimit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "10",
        value = "When set, this will limit the number of concurrent outbound calls to phone numbers associated with this connection."
    )
    @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getChannelLimit() {
        return channelLimit;
    }

    @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    public ExternalConnectionOutbound outboundVoiceProfileId(
        String outboundVoiceProfileId
    ) {
        this.outboundVoiceProfileId = outboundVoiceProfileId;
        return this;
    }

    /**
     * Identifies the associated outbound voice profile.
     * @return outboundVoiceProfileId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "1293384261075731499",
        value = "Identifies the associated outbound voice profile."
    )
    @JsonProperty(JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOutboundVoiceProfileId() {
        return outboundVoiceProfileId;
    }

    @JsonProperty(JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutboundVoiceProfileId(String outboundVoiceProfileId) {
        this.outboundVoiceProfileId = outboundVoiceProfileId;
    }

    /**
     * Return true if this ExternalConnection_outbound object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalConnectionOutbound externalConnectionOutbound =
            (ExternalConnectionOutbound) o;
        return (
            Objects.equals(
                this.channelLimit,
                externalConnectionOutbound.channelLimit
            ) &&
            Objects.equals(
                this.outboundVoiceProfileId,
                externalConnectionOutbound.outboundVoiceProfileId
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelLimit, outboundVoiceProfileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalConnectionOutbound {\n");
        sb
            .append("    channelLimit: ")
            .append(toIndentedString(channelLimit))
            .append("\n");
        sb
            .append("    outboundVoiceProfileId: ")
            .append(toIndentedString(outboundVoiceProfileId))
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
