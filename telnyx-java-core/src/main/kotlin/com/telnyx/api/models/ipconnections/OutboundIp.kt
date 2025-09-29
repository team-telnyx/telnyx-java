// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ipconnections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OutboundIp
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aniOverride: JsonField<String>,
    private val aniOverrideType: JsonField<AniOverrideType>,
    private val callParkingEnabled: JsonField<Boolean>,
    private val channelLimit: JsonField<Long>,
    private val generateRingbackTone: JsonField<Boolean>,
    private val instantRingbackEnabled: JsonField<Boolean>,
    private val ipAuthenticationMethod: JsonField<IpAuthenticationMethod>,
    private val ipAuthenticationToken: JsonField<String>,
    private val localization: JsonField<String>,
    private val outboundVoiceProfileId: JsonField<String>,
    private val t38ReinviteSource: JsonField<T38ReinviteSource>,
    private val techPrefix: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ani_override")
        @ExcludeMissing
        aniOverride: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ani_override_type")
        @ExcludeMissing
        aniOverrideType: JsonField<AniOverrideType> = JsonMissing.of(),
        @JsonProperty("call_parking_enabled")
        @ExcludeMissing
        callParkingEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("channel_limit")
        @ExcludeMissing
        channelLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("generate_ringback_tone")
        @ExcludeMissing
        generateRingbackTone: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("instant_ringback_enabled")
        @ExcludeMissing
        instantRingbackEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ip_authentication_method")
        @ExcludeMissing
        ipAuthenticationMethod: JsonField<IpAuthenticationMethod> = JsonMissing.of(),
        @JsonProperty("ip_authentication_token")
        @ExcludeMissing
        ipAuthenticationToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("localization")
        @ExcludeMissing
        localization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outbound_voice_profile_id")
        @ExcludeMissing
        outboundVoiceProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("t38_reinvite_source")
        @ExcludeMissing
        t38ReinviteSource: JsonField<T38ReinviteSource> = JsonMissing.of(),
        @JsonProperty("tech_prefix")
        @ExcludeMissing
        techPrefix: JsonField<String> = JsonMissing.of(),
    ) : this(
        aniOverride,
        aniOverrideType,
        callParkingEnabled,
        channelLimit,
        generateRingbackTone,
        instantRingbackEnabled,
        ipAuthenticationMethod,
        ipAuthenticationToken,
        localization,
        outboundVoiceProfileId,
        t38ReinviteSource,
        techPrefix,
        mutableMapOf(),
    )

    /**
     * Set a phone number as the ani_override value to override caller id number on outbound calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aniOverride(): Optional<String> = aniOverride.getOptional("ani_override")

    /**
     * Specifies when we apply your ani_override setting. Only applies when ani_override is not
     * blank.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aniOverrideType(): Optional<AniOverrideType> =
        aniOverrideType.getOptional("ani_override_type")

    /**
     * Forces all SIP calls originated on this connection to be "parked" instead of "bridged" to the
     * destination specified on the URI. Parked calls will return ringback to the caller and will
     * await for a Call Control command to define which action will be taken next.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callParkingEnabled(): Optional<Boolean> =
        callParkingEnabled.getOptional("call_parking_enabled")

    /**
     * When set, this will limit the total number of outbound calls to phone numbers associated with
     * this connection.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelLimit(): Optional<Long> = channelLimit.getOptional("channel_limit")

    /**
     * Generate ringback tone through 183 session progress message with early media.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generateRingbackTone(): Optional<Boolean> =
        generateRingbackTone.getOptional("generate_ringback_tone")

    /**
     * When set, ringback will not wait for indication before sending ringback tone to calling
     * party.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instantRingbackEnabled(): Optional<Boolean> =
        instantRingbackEnabled.getOptional("instant_ringback_enabled")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAuthenticationMethod(): Optional<IpAuthenticationMethod> =
        ipAuthenticationMethod.getOptional("ip_authentication_method")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAuthenticationToken(): Optional<String> =
        ipAuthenticationToken.getOptional("ip_authentication_token")

    /**
     * A 2-character country code specifying the country whose national dialing rules should be
     * used. For example, if set to `US` then any US number can be dialed without preprending +1 to
     * the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by
     * default.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun localization(): Optional<String> = localization.getOptional("localization")

    /**
     * Identifies the associated outbound voice profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outboundVoiceProfileId(): Optional<String> =
        outboundVoiceProfileId.getOptional("outbound_voice_profile_id")

    /**
     * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting
     * dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default, Telnyx will send
     * the re-invite. If set to `customer`, the caller is expected to send the t.38 reinvite.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun t38ReinviteSource(): Optional<T38ReinviteSource> =
        t38ReinviteSource.getOptional("t38_reinvite_source")

    /**
     * Numerical chars only, exactly 4 characters.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun techPrefix(): Optional<String> = techPrefix.getOptional("tech_prefix")

    /**
     * Returns the raw JSON value of [aniOverride].
     *
     * Unlike [aniOverride], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ani_override")
    @ExcludeMissing
    fun _aniOverride(): JsonField<String> = aniOverride

    /**
     * Returns the raw JSON value of [aniOverrideType].
     *
     * Unlike [aniOverrideType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ani_override_type")
    @ExcludeMissing
    fun _aniOverrideType(): JsonField<AniOverrideType> = aniOverrideType

    /**
     * Returns the raw JSON value of [callParkingEnabled].
     *
     * Unlike [callParkingEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("call_parking_enabled")
    @ExcludeMissing
    fun _callParkingEnabled(): JsonField<Boolean> = callParkingEnabled

    /**
     * Returns the raw JSON value of [channelLimit].
     *
     * Unlike [channelLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_limit")
    @ExcludeMissing
    fun _channelLimit(): JsonField<Long> = channelLimit

    /**
     * Returns the raw JSON value of [generateRingbackTone].
     *
     * Unlike [generateRingbackTone], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("generate_ringback_tone")
    @ExcludeMissing
    fun _generateRingbackTone(): JsonField<Boolean> = generateRingbackTone

    /**
     * Returns the raw JSON value of [instantRingbackEnabled].
     *
     * Unlike [instantRingbackEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("instant_ringback_enabled")
    @ExcludeMissing
    fun _instantRingbackEnabled(): JsonField<Boolean> = instantRingbackEnabled

    /**
     * Returns the raw JSON value of [ipAuthenticationMethod].
     *
     * Unlike [ipAuthenticationMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ip_authentication_method")
    @ExcludeMissing
    fun _ipAuthenticationMethod(): JsonField<IpAuthenticationMethod> = ipAuthenticationMethod

    /**
     * Returns the raw JSON value of [ipAuthenticationToken].
     *
     * Unlike [ipAuthenticationToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ip_authentication_token")
    @ExcludeMissing
    fun _ipAuthenticationToken(): JsonField<String> = ipAuthenticationToken

    /**
     * Returns the raw JSON value of [localization].
     *
     * Unlike [localization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("localization")
    @ExcludeMissing
    fun _localization(): JsonField<String> = localization

    /**
     * Returns the raw JSON value of [outboundVoiceProfileId].
     *
     * Unlike [outboundVoiceProfileId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("outbound_voice_profile_id")
    @ExcludeMissing
    fun _outboundVoiceProfileId(): JsonField<String> = outboundVoiceProfileId

    /**
     * Returns the raw JSON value of [t38ReinviteSource].
     *
     * Unlike [t38ReinviteSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("t38_reinvite_source")
    @ExcludeMissing
    fun _t38ReinviteSource(): JsonField<T38ReinviteSource> = t38ReinviteSource

    /**
     * Returns the raw JSON value of [techPrefix].
     *
     * Unlike [techPrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tech_prefix") @ExcludeMissing fun _techPrefix(): JsonField<String> = techPrefix

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [OutboundIp]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutboundIp]. */
    class Builder internal constructor() {

        private var aniOverride: JsonField<String> = JsonMissing.of()
        private var aniOverrideType: JsonField<AniOverrideType> = JsonMissing.of()
        private var callParkingEnabled: JsonField<Boolean> = JsonMissing.of()
        private var channelLimit: JsonField<Long> = JsonMissing.of()
        private var generateRingbackTone: JsonField<Boolean> = JsonMissing.of()
        private var instantRingbackEnabled: JsonField<Boolean> = JsonMissing.of()
        private var ipAuthenticationMethod: JsonField<IpAuthenticationMethod> = JsonMissing.of()
        private var ipAuthenticationToken: JsonField<String> = JsonMissing.of()
        private var localization: JsonField<String> = JsonMissing.of()
        private var outboundVoiceProfileId: JsonField<String> = JsonMissing.of()
        private var t38ReinviteSource: JsonField<T38ReinviteSource> = JsonMissing.of()
        private var techPrefix: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(outboundIp: OutboundIp) = apply {
            aniOverride = outboundIp.aniOverride
            aniOverrideType = outboundIp.aniOverrideType
            callParkingEnabled = outboundIp.callParkingEnabled
            channelLimit = outboundIp.channelLimit
            generateRingbackTone = outboundIp.generateRingbackTone
            instantRingbackEnabled = outboundIp.instantRingbackEnabled
            ipAuthenticationMethod = outboundIp.ipAuthenticationMethod
            ipAuthenticationToken = outboundIp.ipAuthenticationToken
            localization = outboundIp.localization
            outboundVoiceProfileId = outboundIp.outboundVoiceProfileId
            t38ReinviteSource = outboundIp.t38ReinviteSource
            techPrefix = outboundIp.techPrefix
            additionalProperties = outboundIp.additionalProperties.toMutableMap()
        }

        /**
         * Set a phone number as the ani_override value to override caller id number on outbound
         * calls.
         */
        fun aniOverride(aniOverride: String) = aniOverride(JsonField.of(aniOverride))

        /**
         * Sets [Builder.aniOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aniOverride] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aniOverride(aniOverride: JsonField<String>) = apply { this.aniOverride = aniOverride }

        /**
         * Specifies when we apply your ani_override setting. Only applies when ani_override is not
         * blank.
         */
        fun aniOverrideType(aniOverrideType: AniOverrideType) =
            aniOverrideType(JsonField.of(aniOverrideType))

        /**
         * Sets [Builder.aniOverrideType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aniOverrideType] with a well-typed [AniOverrideType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aniOverrideType(aniOverrideType: JsonField<AniOverrideType>) = apply {
            this.aniOverrideType = aniOverrideType
        }

        /**
         * Forces all SIP calls originated on this connection to be "parked" instead of "bridged" to
         * the destination specified on the URI. Parked calls will return ringback to the caller and
         * will await for a Call Control command to define which action will be taken next.
         */
        fun callParkingEnabled(callParkingEnabled: Boolean?) =
            callParkingEnabled(JsonField.ofNullable(callParkingEnabled))

        /**
         * Alias for [Builder.callParkingEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun callParkingEnabled(callParkingEnabled: Boolean) =
            callParkingEnabled(callParkingEnabled as Boolean?)

        /**
         * Alias for calling [Builder.callParkingEnabled] with `callParkingEnabled.orElse(null)`.
         */
        fun callParkingEnabled(callParkingEnabled: Optional<Boolean>) =
            callParkingEnabled(callParkingEnabled.getOrNull())

        /**
         * Sets [Builder.callParkingEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callParkingEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callParkingEnabled(callParkingEnabled: JsonField<Boolean>) = apply {
            this.callParkingEnabled = callParkingEnabled
        }

        /**
         * When set, this will limit the total number of outbound calls to phone numbers associated
         * with this connection.
         */
        fun channelLimit(channelLimit: Long) = channelLimit(JsonField.of(channelLimit))

        /**
         * Sets [Builder.channelLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelLimit(channelLimit: JsonField<Long>) = apply { this.channelLimit = channelLimit }

        /** Generate ringback tone through 183 session progress message with early media. */
        fun generateRingbackTone(generateRingbackTone: Boolean) =
            generateRingbackTone(JsonField.of(generateRingbackTone))

        /**
         * Sets [Builder.generateRingbackTone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generateRingbackTone] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun generateRingbackTone(generateRingbackTone: JsonField<Boolean>) = apply {
            this.generateRingbackTone = generateRingbackTone
        }

        /**
         * When set, ringback will not wait for indication before sending ringback tone to calling
         * party.
         */
        fun instantRingbackEnabled(instantRingbackEnabled: Boolean) =
            instantRingbackEnabled(JsonField.of(instantRingbackEnabled))

        /**
         * Sets [Builder.instantRingbackEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instantRingbackEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instantRingbackEnabled(instantRingbackEnabled: JsonField<Boolean>) = apply {
            this.instantRingbackEnabled = instantRingbackEnabled
        }

        fun ipAuthenticationMethod(ipAuthenticationMethod: IpAuthenticationMethod) =
            ipAuthenticationMethod(JsonField.of(ipAuthenticationMethod))

        /**
         * Sets [Builder.ipAuthenticationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAuthenticationMethod] with a well-typed
         * [IpAuthenticationMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun ipAuthenticationMethod(ipAuthenticationMethod: JsonField<IpAuthenticationMethod>) =
            apply {
                this.ipAuthenticationMethod = ipAuthenticationMethod
            }

        fun ipAuthenticationToken(ipAuthenticationToken: String) =
            ipAuthenticationToken(JsonField.of(ipAuthenticationToken))

        /**
         * Sets [Builder.ipAuthenticationToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAuthenticationToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ipAuthenticationToken(ipAuthenticationToken: JsonField<String>) = apply {
            this.ipAuthenticationToken = ipAuthenticationToken
        }

        /**
         * A 2-character country code specifying the country whose national dialing rules should be
         * used. For example, if set to `US` then any US number can be dialed without preprending +1
         * to the number. When left blank, Telnyx will try US and GB dialing rules, in that order,
         * by default.
         */
        fun localization(localization: String) = localization(JsonField.of(localization))

        /**
         * Sets [Builder.localization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.localization] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun localization(localization: JsonField<String>) = apply {
            this.localization = localization
        }

        /** Identifies the associated outbound voice profile. */
        fun outboundVoiceProfileId(outboundVoiceProfileId: String) =
            outboundVoiceProfileId(JsonField.of(outboundVoiceProfileId))

        /**
         * Sets [Builder.outboundVoiceProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outboundVoiceProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outboundVoiceProfileId(outboundVoiceProfileId: JsonField<String>) = apply {
            this.outboundVoiceProfileId = outboundVoiceProfileId
        }

        /**
         * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting
         * dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default, Telnyx will
         * send the re-invite. If set to `customer`, the caller is expected to send the t.38
         * reinvite.
         */
        fun t38ReinviteSource(t38ReinviteSource: T38ReinviteSource) =
            t38ReinviteSource(JsonField.of(t38ReinviteSource))

        /**
         * Sets [Builder.t38ReinviteSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.t38ReinviteSource] with a well-typed [T38ReinviteSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun t38ReinviteSource(t38ReinviteSource: JsonField<T38ReinviteSource>) = apply {
            this.t38ReinviteSource = t38ReinviteSource
        }

        /** Numerical chars only, exactly 4 characters. */
        fun techPrefix(techPrefix: String) = techPrefix(JsonField.of(techPrefix))

        /**
         * Sets [Builder.techPrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.techPrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun techPrefix(techPrefix: JsonField<String>) = apply { this.techPrefix = techPrefix }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [OutboundIp].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OutboundIp =
            OutboundIp(
                aniOverride,
                aniOverrideType,
                callParkingEnabled,
                channelLimit,
                generateRingbackTone,
                instantRingbackEnabled,
                ipAuthenticationMethod,
                ipAuthenticationToken,
                localization,
                outboundVoiceProfileId,
                t38ReinviteSource,
                techPrefix,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OutboundIp = apply {
        if (validated) {
            return@apply
        }

        aniOverride()
        aniOverrideType().ifPresent { it.validate() }
        callParkingEnabled()
        channelLimit()
        generateRingbackTone()
        instantRingbackEnabled()
        ipAuthenticationMethod().ifPresent { it.validate() }
        ipAuthenticationToken()
        localization()
        outboundVoiceProfileId()
        t38ReinviteSource().ifPresent { it.validate() }
        techPrefix()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (aniOverride.asKnown().isPresent) 1 else 0) +
            (aniOverrideType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (callParkingEnabled.asKnown().isPresent) 1 else 0) +
            (if (channelLimit.asKnown().isPresent) 1 else 0) +
            (if (generateRingbackTone.asKnown().isPresent) 1 else 0) +
            (if (instantRingbackEnabled.asKnown().isPresent) 1 else 0) +
            (ipAuthenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ipAuthenticationToken.asKnown().isPresent) 1 else 0) +
            (if (localization.asKnown().isPresent) 1 else 0) +
            (if (outboundVoiceProfileId.asKnown().isPresent) 1 else 0) +
            (t38ReinviteSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (techPrefix.asKnown().isPresent) 1 else 0)

    /**
     * Specifies when we apply your ani_override setting. Only applies when ani_override is not
     * blank.
     */
    class AniOverrideType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALWAYS = of("always")

            @JvmField val NORMAL = of("normal")

            @JvmField val EMERGENCY = of("emergency")

            @JvmStatic fun of(value: String) = AniOverrideType(JsonField.of(value))
        }

        /** An enum containing [AniOverrideType]'s known values. */
        enum class Known {
            ALWAYS,
            NORMAL,
            EMERGENCY,
        }

        /**
         * An enum containing [AniOverrideType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AniOverrideType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALWAYS,
            NORMAL,
            EMERGENCY,
            /**
             * An enum member indicating that [AniOverrideType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ALWAYS -> Value.ALWAYS
                NORMAL -> Value.NORMAL
                EMERGENCY -> Value.EMERGENCY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ALWAYS -> Known.ALWAYS
                NORMAL -> Known.NORMAL
                EMERGENCY -> Known.EMERGENCY
                else -> throw TelnyxInvalidDataException("Unknown AniOverrideType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): AniOverrideType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AniOverrideType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class IpAuthenticationMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TECH_PREFIXP_CHARGE_INFO = of("tech-prefixp-charge-info")

            @JvmField val TOKEN = of("token")

            @JvmStatic fun of(value: String) = IpAuthenticationMethod(JsonField.of(value))
        }

        /** An enum containing [IpAuthenticationMethod]'s known values. */
        enum class Known {
            TECH_PREFIXP_CHARGE_INFO,
            TOKEN,
        }

        /**
         * An enum containing [IpAuthenticationMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [IpAuthenticationMethod] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TECH_PREFIXP_CHARGE_INFO,
            TOKEN,
            /**
             * An enum member indicating that [IpAuthenticationMethod] was instantiated with an
             * unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TECH_PREFIXP_CHARGE_INFO -> Value.TECH_PREFIXP_CHARGE_INFO
                TOKEN -> Value.TOKEN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TECH_PREFIXP_CHARGE_INFO -> Known.TECH_PREFIXP_CHARGE_INFO
                TOKEN -> Known.TOKEN
                else -> throw TelnyxInvalidDataException("Unknown IpAuthenticationMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): IpAuthenticationMethod = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IpAuthenticationMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This setting only affects connections with Fax-type Outbound Voice Profiles. The setting
     * dictates whether or not Telnyx sends a t.38 reinvite.<br/><br/> By default, Telnyx will send
     * the re-invite. If set to `customer`, the caller is expected to send the t.38 reinvite.
     */
    class T38ReinviteSource @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TELNYX = of("telnyx")

            @JvmField val CUSTOMER = of("customer")

            @JvmField val DISABLED = of("disabled")

            @JvmField val PASSTHRU = of("passthru")

            @JvmField val CALLER_PASSTHRU = of("caller-passthru")

            @JvmField val CALLEE_PASSTHRU = of("callee-passthru")

            @JvmStatic fun of(value: String) = T38ReinviteSource(JsonField.of(value))
        }

        /** An enum containing [T38ReinviteSource]'s known values. */
        enum class Known {
            TELNYX,
            CUSTOMER,
            DISABLED,
            PASSTHRU,
            CALLER_PASSTHRU,
            CALLEE_PASSTHRU,
        }

        /**
         * An enum containing [T38ReinviteSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [T38ReinviteSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TELNYX,
            CUSTOMER,
            DISABLED,
            PASSTHRU,
            CALLER_PASSTHRU,
            CALLEE_PASSTHRU,
            /**
             * An enum member indicating that [T38ReinviteSource] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TELNYX -> Value.TELNYX
                CUSTOMER -> Value.CUSTOMER
                DISABLED -> Value.DISABLED
                PASSTHRU -> Value.PASSTHRU
                CALLER_PASSTHRU -> Value.CALLER_PASSTHRU
                CALLEE_PASSTHRU -> Value.CALLEE_PASSTHRU
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TELNYX -> Known.TELNYX
                CUSTOMER -> Known.CUSTOMER
                DISABLED -> Known.DISABLED
                PASSTHRU -> Known.PASSTHRU
                CALLER_PASSTHRU -> Known.CALLER_PASSTHRU
                CALLEE_PASSTHRU -> Known.CALLEE_PASSTHRU
                else -> throw TelnyxInvalidDataException("Unknown T38ReinviteSource: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): T38ReinviteSource = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is T38ReinviteSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutboundIp &&
            aniOverride == other.aniOverride &&
            aniOverrideType == other.aniOverrideType &&
            callParkingEnabled == other.callParkingEnabled &&
            channelLimit == other.channelLimit &&
            generateRingbackTone == other.generateRingbackTone &&
            instantRingbackEnabled == other.instantRingbackEnabled &&
            ipAuthenticationMethod == other.ipAuthenticationMethod &&
            ipAuthenticationToken == other.ipAuthenticationToken &&
            localization == other.localization &&
            outboundVoiceProfileId == other.outboundVoiceProfileId &&
            t38ReinviteSource == other.t38ReinviteSource &&
            techPrefix == other.techPrefix &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aniOverride,
            aniOverrideType,
            callParkingEnabled,
            channelLimit,
            generateRingbackTone,
            instantRingbackEnabled,
            ipAuthenticationMethod,
            ipAuthenticationToken,
            localization,
            outboundVoiceProfileId,
            t38ReinviteSource,
            techPrefix,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutboundIp{aniOverride=$aniOverride, aniOverrideType=$aniOverrideType, callParkingEnabled=$callParkingEnabled, channelLimit=$channelLimit, generateRingbackTone=$generateRingbackTone, instantRingbackEnabled=$instantRingbackEnabled, ipAuthenticationMethod=$ipAuthenticationMethod, ipAuthenticationToken=$ipAuthenticationToken, localization=$localization, outboundVoiceProfileId=$outboundVoiceProfileId, t38ReinviteSource=$t38ReinviteSource, techPrefix=$techPrefix, additionalProperties=$additionalProperties}"
}
