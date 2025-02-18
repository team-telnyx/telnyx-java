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
 * CallControlApplicationInbound
 */
@JsonPropertyOrder(
    {
        CallControlApplicationInbound.JSON_PROPERTY_CHANNEL_LIMIT,
        CallControlApplicationInbound.JSON_PROPERTY_SHAKEN_STIR_ENABLED,
        CallControlApplicationInbound.JSON_PROPERTY_SIP_SUBDOMAIN,
        CallControlApplicationInbound.JSON_PROPERTY_SIP_SUBDOMAIN_RECEIVE_SETTINGS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallControlApplicationInbound {

    public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
    private Integer channelLimit;

    public static final String JSON_PROPERTY_SHAKEN_STIR_ENABLED =
        "shaken_stir_enabled";
    private Boolean shakenStirEnabled = false;

    public static final String JSON_PROPERTY_SIP_SUBDOMAIN = "sip_subdomain";
    private String sipSubdomain;

    /**
     * This option can be enabled to receive calls from: \&quot;Anyone\&quot; (any SIP endpoint in the public Internet) or \&quot;Only my connections\&quot; (any connection assigned to the same Telnyx user).
     */
    public enum SipSubdomainReceiveSettingsEnum {
        ONLY_MY_CONNECTIONS(String.valueOf("only_my_connections")),

        FROM_ANYONE(String.valueOf("from_anyone"));

        private String value;

        SipSubdomainReceiveSettingsEnum(String value) {
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
        public static SipSubdomainReceiveSettingsEnum fromValue(String value) {
            for (SipSubdomainReceiveSettingsEnum b : SipSubdomainReceiveSettingsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_SIP_SUBDOMAIN_RECEIVE_SETTINGS =
        "sip_subdomain_receive_settings";
    private SipSubdomainReceiveSettingsEnum sipSubdomainReceiveSettings =
        SipSubdomainReceiveSettingsEnum.FROM_ANYONE;

    public CallControlApplicationInbound() {}

    public CallControlApplicationInbound channelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * When set, this will limit the total number of inbound calls to phone numbers associated with this connection.
     * @return channelLimit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "10",
        value = "When set, this will limit the total number of inbound calls to phone numbers associated with this connection."
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

    public CallControlApplicationInbound shakenStirEnabled(
        Boolean shakenStirEnabled
    ) {
        this.shakenStirEnabled = shakenStirEnabled;
        return this;
    }

    /**
     * When enabled Telnyx will include Shaken/Stir data in the Webhook for new inbound calls.
     * @return shakenStirEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "When enabled Telnyx will include Shaken/Stir data in the Webhook for new inbound calls."
    )
    @JsonProperty(JSON_PROPERTY_SHAKEN_STIR_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getShakenStirEnabled() {
        return shakenStirEnabled;
    }

    @JsonProperty(JSON_PROPERTY_SHAKEN_STIR_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setShakenStirEnabled(Boolean shakenStirEnabled) {
        this.shakenStirEnabled = shakenStirEnabled;
    }

    public CallControlApplicationInbound sipSubdomain(String sipSubdomain) {
        this.sipSubdomain = sipSubdomain;
        return this;
    }

    /**
     * Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the same way a phone number is used, from a SIP endpoint. Example: the subdomain \&quot;example.sip.telnyx.com\&quot; can be called from any SIP endpoint by using the SIP URI \&quot;sip:@example.sip.telnyx.com\&quot; where the user part can be any alphanumeric value. Please note TLS encrypted calls are not allowed for subdomain calls.
     * @return sipSubdomain
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "example",
        value = "Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the same way a phone number is used, from a SIP endpoint. Example: the subdomain \"example.sip.telnyx.com\" can be called from any SIP endpoint by using the SIP URI \"sip:@example.sip.telnyx.com\" where the user part can be any alphanumeric value. Please note TLS encrypted calls are not allowed for subdomain calls."
    )
    @JsonProperty(JSON_PROPERTY_SIP_SUBDOMAIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSipSubdomain() {
        return sipSubdomain;
    }

    @JsonProperty(JSON_PROPERTY_SIP_SUBDOMAIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipSubdomain(String sipSubdomain) {
        this.sipSubdomain = sipSubdomain;
    }

    public CallControlApplicationInbound sipSubdomainReceiveSettings(
        SipSubdomainReceiveSettingsEnum sipSubdomainReceiveSettings
    ) {
        this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings;
        return this;
    }

    /**
     * This option can be enabled to receive calls from: \&quot;Anyone\&quot; (any SIP endpoint in the public Internet) or \&quot;Only my connections\&quot; (any connection assigned to the same Telnyx user).
     * @return sipSubdomainReceiveSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "only_my_connections",
        value = "This option can be enabled to receive calls from: \"Anyone\" (any SIP endpoint in the public Internet) or \"Only my connections\" (any connection assigned to the same Telnyx user)."
    )
    @JsonProperty(JSON_PROPERTY_SIP_SUBDOMAIN_RECEIVE_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SipSubdomainReceiveSettingsEnum getSipSubdomainReceiveSettings() {
        return sipSubdomainReceiveSettings;
    }

    @JsonProperty(JSON_PROPERTY_SIP_SUBDOMAIN_RECEIVE_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipSubdomainReceiveSettings(
        SipSubdomainReceiveSettingsEnum sipSubdomainReceiveSettings
    ) {
        this.sipSubdomainReceiveSettings = sipSubdomainReceiveSettings;
    }

    /**
     * Return true if this CallControlApplicationInbound object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallControlApplicationInbound callControlApplicationInbound =
            (CallControlApplicationInbound) o;
        return (
            Objects.equals(
                this.channelLimit,
                callControlApplicationInbound.channelLimit
            ) &&
            Objects.equals(
                this.shakenStirEnabled,
                callControlApplicationInbound.shakenStirEnabled
            ) &&
            Objects.equals(
                this.sipSubdomain,
                callControlApplicationInbound.sipSubdomain
            ) &&
            Objects.equals(
                this.sipSubdomainReceiveSettings,
                callControlApplicationInbound.sipSubdomainReceiveSettings
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            channelLimit,
            shakenStirEnabled,
            sipSubdomain,
            sipSubdomainReceiveSettings
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallControlApplicationInbound {\n");
        sb
            .append("    channelLimit: ")
            .append(toIndentedString(channelLimit))
            .append("\n");
        sb
            .append("    shakenStirEnabled: ")
            .append(toIndentedString(shakenStirEnabled))
            .append("\n");
        sb
            .append("    sipSubdomain: ")
            .append(toIndentedString(sipSubdomain))
            .append("\n");
        sb
            .append("    sipSubdomainReceiveSettings: ")
            .append(toIndentedString(sipSubdomainReceiveSettings))
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
