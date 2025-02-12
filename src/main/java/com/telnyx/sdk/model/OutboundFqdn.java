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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.EncryptedMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OutboundFqdn
 */
@JsonPropertyOrder(
    {
        OutboundFqdn.JSON_PROPERTY_ANI_OVERRIDE,
        OutboundFqdn.JSON_PROPERTY_ANI_OVERRIDE_TYPE,
        OutboundFqdn.JSON_PROPERTY_CALL_PARKING_ENABLED,
        OutboundFqdn.JSON_PROPERTY_CHANNEL_LIMIT,
        OutboundFqdn.JSON_PROPERTY_GENERATE_RINGBACK_TONE,
        OutboundFqdn.JSON_PROPERTY_INSTANT_RINGBACK_ENABLED,
        OutboundFqdn.JSON_PROPERTY_IP_AUTHENTICATION_METHOD,
        OutboundFqdn.JSON_PROPERTY_IP_AUTHENTICATION_TOKEN,
        OutboundFqdn.JSON_PROPERTY_LOCALIZATION,
        OutboundFqdn.JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID,
        OutboundFqdn.JSON_PROPERTY_T38_REINVITE_SOURCE,
        OutboundFqdn.JSON_PROPERTY_TECH_PREFIX,
        OutboundFqdn.JSON_PROPERTY_ENCRYPTED_MEDIA,
        OutboundFqdn.JSON_PROPERTY_TIMEOUT1XX_SECS,
        OutboundFqdn.JSON_PROPERTY_TIMEOUT2XX_SECS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class OutboundFqdn {

    public static final String JSON_PROPERTY_ANI_OVERRIDE = "ani_override";
    private String aniOverride;

    /**
     * Specifies when we should apply your ani_override setting. Only applies when ani_override is not blank.
     */
    public enum AniOverrideTypeEnum {
        ALWAYS(String.valueOf("always")),

        NORMAL(String.valueOf("normal")),

        EMERGENCY(String.valueOf("emergency"));

        private String value;

        AniOverrideTypeEnum(String value) {
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
        public static AniOverrideTypeEnum fromValue(String value) {
            for (AniOverrideTypeEnum b : AniOverrideTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_ANI_OVERRIDE_TYPE =
        "ani_override_type";
    private AniOverrideTypeEnum aniOverrideType = AniOverrideTypeEnum.ALWAYS;

    public static final String JSON_PROPERTY_CALL_PARKING_ENABLED =
        "call_parking_enabled";
    private JsonNullable<Boolean> callParkingEnabled = JsonNullable.<Boolean>of(
        false
    );

    public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
    private Integer channelLimit;

    public static final String JSON_PROPERTY_GENERATE_RINGBACK_TONE =
        "generate_ringback_tone";
    private Boolean generateRingbackTone = false;

    public static final String JSON_PROPERTY_INSTANT_RINGBACK_ENABLED =
        "instant_ringback_enabled";
    private Boolean instantRingbackEnabled = false;

    /**
     * Gets or Sets ipAuthenticationMethod
     */
    public enum IpAuthenticationMethodEnum {
        CREDENTIAL_AUTHENTICATION(String.valueOf("credential-authentication")),

        IP_AUTHENTICATION(String.valueOf("ip-authentication"));

        private String value;

        IpAuthenticationMethodEnum(String value) {
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
        public static IpAuthenticationMethodEnum fromValue(String value) {
            for (IpAuthenticationMethodEnum b : IpAuthenticationMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_IP_AUTHENTICATION_METHOD =
        "ip_authentication_method";
    private IpAuthenticationMethodEnum ipAuthenticationMethod =
        IpAuthenticationMethodEnum.IP_AUTHENTICATION;

    public static final String JSON_PROPERTY_IP_AUTHENTICATION_TOKEN =
        "ip_authentication_token";
    private String ipAuthenticationToken;

    public static final String JSON_PROPERTY_LOCALIZATION = "localization";
    private String localization = "US";

    public static final String JSON_PROPERTY_OUTBOUND_VOICE_PROFILE_ID =
        "outbound_voice_profile_id";
    private String outboundVoiceProfileId;

    /**
     * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite. By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite.
     */
    public enum T38ReinviteSourceEnum {
        TELNYX(String.valueOf("telnyx")),

        CUSTOMER(String.valueOf("customer")),

        DISABLED(String.valueOf("disabled")),

        PASSTHRU(String.valueOf("passthru")),

        CALLER_PASSTHRU(String.valueOf("caller-passthru")),

        CALLEE_PASSTHRU(String.valueOf("callee-passthru"));

        private String value;

        T38ReinviteSourceEnum(String value) {
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
        public static T38ReinviteSourceEnum fromValue(String value) {
            for (T38ReinviteSourceEnum b : T38ReinviteSourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_T38_REINVITE_SOURCE =
        "t38_reinvite_source";
    private T38ReinviteSourceEnum t38ReinviteSource =
        T38ReinviteSourceEnum.CUSTOMER;

    public static final String JSON_PROPERTY_TECH_PREFIX = "tech_prefix";
    private String techPrefix;

    public static final String JSON_PROPERTY_ENCRYPTED_MEDIA =
        "encrypted_media";
    private JsonNullable<EncryptedMedia> encryptedMedia = JsonNullable.<
            EncryptedMedia
        >undefined();

    public static final String JSON_PROPERTY_TIMEOUT1XX_SECS =
        "timeout_1xx_secs";
    private Integer timeout1xxSecs = 3;

    public static final String JSON_PROPERTY_TIMEOUT2XX_SECS =
        "timeout_2xx_secs";
    private Integer timeout2xxSecs = 90;

    public OutboundFqdn() {}

    public OutboundFqdn aniOverride(String aniOverride) {
        this.aniOverride = aniOverride;
        return this;
    }

    /**
     * Set a phone number as the ani_override value to override caller id number on outbound calls.
     * @return aniOverride
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Set a phone number as the ani_override value to override caller id number on outbound calls."
    )
    @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAniOverride() {
        return aniOverride;
    }

    @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAniOverride(String aniOverride) {
        this.aniOverride = aniOverride;
    }

    public OutboundFqdn aniOverrideType(AniOverrideTypeEnum aniOverrideType) {
        this.aniOverrideType = aniOverrideType;
        return this;
    }

    /**
     * Specifies when we should apply your ani_override setting. Only applies when ani_override is not blank.
     * @return aniOverrideType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "normal",
        value = "Specifies when we should apply your ani_override setting. Only applies when ani_override is not blank."
    )
    @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AniOverrideTypeEnum getAniOverrideType() {
        return aniOverrideType;
    }

    @JsonProperty(JSON_PROPERTY_ANI_OVERRIDE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAniOverrideType(AniOverrideTypeEnum aniOverrideType) {
        this.aniOverrideType = aniOverrideType;
    }

    public OutboundFqdn callParkingEnabled(Boolean callParkingEnabled) {
        this.callParkingEnabled = JsonNullable.<Boolean>of(callParkingEnabled);
        return this;
    }

    /**
     * Forces all SIP calls originated on this connection to be \\\&quot;parked\\\&quot; instead of \\\&quot;bridged\\\&quot; to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next.
     * @return callParkingEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Forces all SIP calls originated on this connection to be \\\"parked\\\" instead of \\\"bridged\\\" to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next."
    )
    @JsonIgnore
    public Boolean getCallParkingEnabled() {
        return callParkingEnabled.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_CALL_PARKING_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<Boolean> getCallParkingEnabled_JsonNullable() {
        return callParkingEnabled;
    }

    @JsonProperty(JSON_PROPERTY_CALL_PARKING_ENABLED)
    public void setCallParkingEnabled_JsonNullable(
        JsonNullable<Boolean> callParkingEnabled
    ) {
        this.callParkingEnabled = callParkingEnabled;
    }

    public void setCallParkingEnabled(Boolean callParkingEnabled) {
        this.callParkingEnabled = JsonNullable.<Boolean>of(callParkingEnabled);
    }

    public OutboundFqdn channelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * When set, this will limit the total number of inbound calls to phone numbers associated with this connection.
     * @return channelLimit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
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

    public OutboundFqdn generateRingbackTone(Boolean generateRingbackTone) {
        this.generateRingbackTone = generateRingbackTone;
        return this;
    }

    /**
     * Generate ringback tone through 183 session progress message with early media.
     * @return generateRingbackTone
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Generate ringback tone through 183 session progress message with early media."
    )
    @JsonProperty(JSON_PROPERTY_GENERATE_RINGBACK_TONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getGenerateRingbackTone() {
        return generateRingbackTone;
    }

    @JsonProperty(JSON_PROPERTY_GENERATE_RINGBACK_TONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGenerateRingbackTone(Boolean generateRingbackTone) {
        this.generateRingbackTone = generateRingbackTone;
    }

    public OutboundFqdn instantRingbackEnabled(Boolean instantRingbackEnabled) {
        this.instantRingbackEnabled = instantRingbackEnabled;
        return this;
    }

    /**
     * When set, ringback will not wait for indication before sending ringback tone to calling party.
     * @return instantRingbackEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "When set, ringback will not wait for indication before sending ringback tone to calling party."
    )
    @JsonProperty(JSON_PROPERTY_INSTANT_RINGBACK_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getInstantRingbackEnabled() {
        return instantRingbackEnabled;
    }

    @JsonProperty(JSON_PROPERTY_INSTANT_RINGBACK_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstantRingbackEnabled(Boolean instantRingbackEnabled) {
        this.instantRingbackEnabled = instantRingbackEnabled;
    }

    public OutboundFqdn ipAuthenticationMethod(
        IpAuthenticationMethodEnum ipAuthenticationMethod
    ) {
        this.ipAuthenticationMethod = ipAuthenticationMethod;
        return this;
    }

    /**
     * Get ipAuthenticationMethod
     * @return ipAuthenticationMethod
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "credential-authentication", value = "")
    @JsonProperty(JSON_PROPERTY_IP_AUTHENTICATION_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public IpAuthenticationMethodEnum getIpAuthenticationMethod() {
        return ipAuthenticationMethod;
    }

    @JsonProperty(JSON_PROPERTY_IP_AUTHENTICATION_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIpAuthenticationMethod(
        IpAuthenticationMethodEnum ipAuthenticationMethod
    ) {
        this.ipAuthenticationMethod = ipAuthenticationMethod;
    }

    public OutboundFqdn ipAuthenticationToken(String ipAuthenticationToken) {
        this.ipAuthenticationToken = ipAuthenticationToken;
        return this;
    }

    /**
     * Get ipAuthenticationToken
     * @return ipAuthenticationToken
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IP_AUTHENTICATION_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIpAuthenticationToken() {
        return ipAuthenticationToken;
    }

    @JsonProperty(JSON_PROPERTY_IP_AUTHENTICATION_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIpAuthenticationToken(String ipAuthenticationToken) {
        this.ipAuthenticationToken = ipAuthenticationToken;
    }

    public OutboundFqdn localization(String localization) {
        this.localization = localization;
        return this;
    }

    /**
     * A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to &#x60;US&#x60; then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default.\&quot;,
     * @return localization
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "US",
        value = "A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to `US` then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default.\","
    )
    @JsonProperty(JSON_PROPERTY_LOCALIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLocalization() {
        return localization;
    }

    @JsonProperty(JSON_PROPERTY_LOCALIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public OutboundFqdn outboundVoiceProfileId(String outboundVoiceProfileId) {
        this.outboundVoiceProfileId = outboundVoiceProfileId;
        return this;
    }

    /**
     * Identifies the associated outbound voice profile.
     * @return outboundVoiceProfileId
     **/
    @javax.annotation.Nullable
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

    public OutboundFqdn t38ReinviteSource(
        T38ReinviteSourceEnum t38ReinviteSource
    ) {
        this.t38ReinviteSource = t38ReinviteSource;
        return this;
    }

    /**
     * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite. By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite.
     * @return t38ReinviteSource
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite. By default, Telnyx will send the re-invite. If set to `customer`, the caller is expected to send the t.38 reinvite."
    )
    @JsonProperty(JSON_PROPERTY_T38_REINVITE_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public T38ReinviteSourceEnum getT38ReinviteSource() {
        return t38ReinviteSource;
    }

    @JsonProperty(JSON_PROPERTY_T38_REINVITE_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setT38ReinviteSource(T38ReinviteSourceEnum t38ReinviteSource) {
        this.t38ReinviteSource = t38ReinviteSource;
    }

    public OutboundFqdn techPrefix(String techPrefix) {
        this.techPrefix = techPrefix;
        return this;
    }

    /**
     * Numerical chars only, exactly 4 characters.
     * @return techPrefix
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Numerical chars only, exactly 4 characters.")
    @JsonProperty(JSON_PROPERTY_TECH_PREFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTechPrefix() {
        return techPrefix;
    }

    @JsonProperty(JSON_PROPERTY_TECH_PREFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTechPrefix(String techPrefix) {
        this.techPrefix = techPrefix;
    }

    public OutboundFqdn encryptedMedia(EncryptedMedia encryptedMedia) {
        this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
        return this;
    }

    /**
     * Get encryptedMedia
     * @return encryptedMedia
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonIgnore
    public EncryptedMedia getEncryptedMedia() {
        return encryptedMedia.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<EncryptedMedia> getEncryptedMedia_JsonNullable() {
        return encryptedMedia;
    }

    @JsonProperty(JSON_PROPERTY_ENCRYPTED_MEDIA)
    public void setEncryptedMedia_JsonNullable(
        JsonNullable<EncryptedMedia> encryptedMedia
    ) {
        this.encryptedMedia = encryptedMedia;
    }

    public void setEncryptedMedia(EncryptedMedia encryptedMedia) {
        this.encryptedMedia = JsonNullable.<EncryptedMedia>of(encryptedMedia);
    }

    public OutboundFqdn timeout1xxSecs(Integer timeout1xxSecs) {
        this.timeout1xxSecs = timeout1xxSecs;
        return this;
    }

    /**
     * Time(sec) before aborting if connection is not made.
     * minimum: 1
     * maximum: 120
     * @return timeout1xxSecs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Time(sec) before aborting if connection is not made."
    )
    @JsonProperty(JSON_PROPERTY_TIMEOUT1XX_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTimeout1xxSecs() {
        return timeout1xxSecs;
    }

    @JsonProperty(JSON_PROPERTY_TIMEOUT1XX_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimeout1xxSecs(Integer timeout1xxSecs) {
        this.timeout1xxSecs = timeout1xxSecs;
    }

    public OutboundFqdn timeout2xxSecs(Integer timeout2xxSecs) {
        this.timeout2xxSecs = timeout2xxSecs;
        return this;
    }

    /**
     * Time(sec) before aborting if call is unanswered (min: 1, max: 600).
     * minimum: 1
     * maximum: 600
     * @return timeout2xxSecs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Time(sec) before aborting if call is unanswered (min: 1, max: 600)."
    )
    @JsonProperty(JSON_PROPERTY_TIMEOUT2XX_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTimeout2xxSecs() {
        return timeout2xxSecs;
    }

    @JsonProperty(JSON_PROPERTY_TIMEOUT2XX_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimeout2xxSecs(Integer timeout2xxSecs) {
        this.timeout2xxSecs = timeout2xxSecs;
    }

    /**
     * Return true if this OutboundFqdn object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutboundFqdn outboundFqdn = (OutboundFqdn) o;
        return (
            Objects.equals(this.aniOverride, outboundFqdn.aniOverride) &&
            Objects.equals(
                this.aniOverrideType,
                outboundFqdn.aniOverrideType
            ) &&
            equalsNullable(
                this.callParkingEnabled,
                outboundFqdn.callParkingEnabled
            ) &&
            Objects.equals(this.channelLimit, outboundFqdn.channelLimit) &&
            Objects.equals(
                this.generateRingbackTone,
                outboundFqdn.generateRingbackTone
            ) &&
            Objects.equals(
                this.instantRingbackEnabled,
                outboundFqdn.instantRingbackEnabled
            ) &&
            Objects.equals(
                this.ipAuthenticationMethod,
                outboundFqdn.ipAuthenticationMethod
            ) &&
            Objects.equals(
                this.ipAuthenticationToken,
                outboundFqdn.ipAuthenticationToken
            ) &&
            Objects.equals(this.localization, outboundFqdn.localization) &&
            Objects.equals(
                this.outboundVoiceProfileId,
                outboundFqdn.outboundVoiceProfileId
            ) &&
            Objects.equals(
                this.t38ReinviteSource,
                outboundFqdn.t38ReinviteSource
            ) &&
            Objects.equals(this.techPrefix, outboundFqdn.techPrefix) &&
            equalsNullable(this.encryptedMedia, outboundFqdn.encryptedMedia) &&
            Objects.equals(this.timeout1xxSecs, outboundFqdn.timeout1xxSecs) &&
            Objects.equals(this.timeout2xxSecs, outboundFqdn.timeout2xxSecs)
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            aniOverride,
            aniOverrideType,
            hashCodeNullable(callParkingEnabled),
            channelLimit,
            generateRingbackTone,
            instantRingbackEnabled,
            ipAuthenticationMethod,
            ipAuthenticationToken,
            localization,
            outboundVoiceProfileId,
            t38ReinviteSource,
            techPrefix,
            hashCodeNullable(encryptedMedia),
            timeout1xxSecs,
            timeout2xxSecs
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutboundFqdn {\n");
        sb
            .append("    aniOverride: ")
            .append(toIndentedString(aniOverride))
            .append("\n");
        sb
            .append("    aniOverrideType: ")
            .append(toIndentedString(aniOverrideType))
            .append("\n");
        sb
            .append("    callParkingEnabled: ")
            .append(toIndentedString(callParkingEnabled))
            .append("\n");
        sb
            .append("    channelLimit: ")
            .append(toIndentedString(channelLimit))
            .append("\n");
        sb
            .append("    generateRingbackTone: ")
            .append(toIndentedString(generateRingbackTone))
            .append("\n");
        sb
            .append("    instantRingbackEnabled: ")
            .append(toIndentedString(instantRingbackEnabled))
            .append("\n");
        sb
            .append("    ipAuthenticationMethod: ")
            .append(toIndentedString(ipAuthenticationMethod))
            .append("\n");
        sb
            .append("    ipAuthenticationToken: ")
            .append(toIndentedString(ipAuthenticationToken))
            .append("\n");
        sb
            .append("    localization: ")
            .append(toIndentedString(localization))
            .append("\n");
        sb
            .append("    outboundVoiceProfileId: ")
            .append(toIndentedString(outboundVoiceProfileId))
            .append("\n");
        sb
            .append("    t38ReinviteSource: ")
            .append(toIndentedString(t38ReinviteSource))
            .append("\n");
        sb
            .append("    techPrefix: ")
            .append(toIndentedString(techPrefix))
            .append("\n");
        sb
            .append("    encryptedMedia: ")
            .append(toIndentedString(encryptedMedia))
            .append("\n");
        sb
            .append("    timeout1xxSecs: ")
            .append(toIndentedString(timeout1xxSecs))
            .append("\n");
        sb
            .append("    timeout2xxSecs: ")
            .append(toIndentedString(timeout2xxSecs))
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
