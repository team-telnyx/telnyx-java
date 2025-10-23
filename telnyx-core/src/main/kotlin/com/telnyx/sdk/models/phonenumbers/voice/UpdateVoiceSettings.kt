// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateVoiceSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callForwarding: JsonField<CallForwarding>,
    private val callRecording: JsonField<CallRecording>,
    private val callerIdNameEnabled: JsonField<Boolean>,
    private val cnamListing: JsonField<CnamListing>,
    private val inboundCallScreening: JsonField<InboundCallScreening>,
    private val mediaFeatures: JsonField<MediaFeatures>,
    private val techPrefixEnabled: JsonField<Boolean>,
    private val translatedNumber: JsonField<String>,
    private val usagePaymentMethod: JsonField<UsagePaymentMethod>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("call_forwarding")
        @ExcludeMissing
        callForwarding: JsonField<CallForwarding> = JsonMissing.of(),
        @JsonProperty("call_recording")
        @ExcludeMissing
        callRecording: JsonField<CallRecording> = JsonMissing.of(),
        @JsonProperty("caller_id_name_enabled")
        @ExcludeMissing
        callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cnam_listing")
        @ExcludeMissing
        cnamListing: JsonField<CnamListing> = JsonMissing.of(),
        @JsonProperty("inbound_call_screening")
        @ExcludeMissing
        inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of(),
        @JsonProperty("media_features")
        @ExcludeMissing
        mediaFeatures: JsonField<MediaFeatures> = JsonMissing.of(),
        @JsonProperty("tech_prefix_enabled")
        @ExcludeMissing
        techPrefixEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("translated_number")
        @ExcludeMissing
        translatedNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_payment_method")
        @ExcludeMissing
        usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of(),
    ) : this(
        callForwarding,
        callRecording,
        callerIdNameEnabled,
        cnamListing,
        inboundCallScreening,
        mediaFeatures,
        techPrefixEnabled,
        translatedNumber,
        usagePaymentMethod,
        mutableMapOf(),
    )

    /**
     * The call forwarding settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callForwarding(): Optional<CallForwarding> = callForwarding.getOptional("call_forwarding")

    /**
     * The call recording settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecording(): Optional<CallRecording> = callRecording.getOptional("call_recording")

    /**
     * Controls whether the caller ID name is enabled for this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callerIdNameEnabled(): Optional<Boolean> =
        callerIdNameEnabled.getOptional("caller_id_name_enabled")

    /**
     * The CNAM listing settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cnamListing(): Optional<CnamListing> = cnamListing.getOptional("cnam_listing")

    /**
     * The inbound_call_screening setting is a phone number configuration option variable that
     * allows users to configure their settings to block or flag fraudulent calls. It can be set to
     * disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost
     * associated with it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundCallScreening(): Optional<InboundCallScreening> =
        inboundCallScreening.getOptional("inbound_call_screening")

    /**
     * The media features settings for a phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaFeatures(): Optional<MediaFeatures> = mediaFeatures.getOptional("media_features")

    /**
     * Controls whether a tech prefix is enabled for this phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun techPrefixEnabled(): Optional<Boolean> =
        techPrefixEnabled.getOptional("tech_prefix_enabled")

    /**
     * This field allows you to rewrite the destination number of an inbound call before the call is
     * routed to you. The value of this field may be any alphanumeric value, and the value will
     * replace the number originally dialed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun translatedNumber(): Optional<String> = translatedNumber.getOptional("translated_number")

    /**
     * Controls whether a number is billed per minute or uses your concurrent channels.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usagePaymentMethod(): Optional<UsagePaymentMethod> =
        usagePaymentMethod.getOptional("usage_payment_method")

    /**
     * Returns the raw JSON value of [callForwarding].
     *
     * Unlike [callForwarding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_forwarding")
    @ExcludeMissing
    fun _callForwarding(): JsonField<CallForwarding> = callForwarding

    /**
     * Returns the raw JSON value of [callRecording].
     *
     * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_recording")
    @ExcludeMissing
    fun _callRecording(): JsonField<CallRecording> = callRecording

    /**
     * Returns the raw JSON value of [callerIdNameEnabled].
     *
     * Unlike [callerIdNameEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("caller_id_name_enabled")
    @ExcludeMissing
    fun _callerIdNameEnabled(): JsonField<Boolean> = callerIdNameEnabled

    /**
     * Returns the raw JSON value of [cnamListing].
     *
     * Unlike [cnamListing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cnam_listing")
    @ExcludeMissing
    fun _cnamListing(): JsonField<CnamListing> = cnamListing

    /**
     * Returns the raw JSON value of [inboundCallScreening].
     *
     * Unlike [inboundCallScreening], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inbound_call_screening")
    @ExcludeMissing
    fun _inboundCallScreening(): JsonField<InboundCallScreening> = inboundCallScreening

    /**
     * Returns the raw JSON value of [mediaFeatures].
     *
     * Unlike [mediaFeatures], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("media_features")
    @ExcludeMissing
    fun _mediaFeatures(): JsonField<MediaFeatures> = mediaFeatures

    /**
     * Returns the raw JSON value of [techPrefixEnabled].
     *
     * Unlike [techPrefixEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tech_prefix_enabled")
    @ExcludeMissing
    fun _techPrefixEnabled(): JsonField<Boolean> = techPrefixEnabled

    /**
     * Returns the raw JSON value of [translatedNumber].
     *
     * Unlike [translatedNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("translated_number")
    @ExcludeMissing
    fun _translatedNumber(): JsonField<String> = translatedNumber

    /**
     * Returns the raw JSON value of [usagePaymentMethod].
     *
     * Unlike [usagePaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usage_payment_method")
    @ExcludeMissing
    fun _usagePaymentMethod(): JsonField<UsagePaymentMethod> = usagePaymentMethod

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

        /** Returns a mutable builder for constructing an instance of [UpdateVoiceSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateVoiceSettings]. */
    class Builder internal constructor() {

        private var callForwarding: JsonField<CallForwarding> = JsonMissing.of()
        private var callRecording: JsonField<CallRecording> = JsonMissing.of()
        private var callerIdNameEnabled: JsonField<Boolean> = JsonMissing.of()
        private var cnamListing: JsonField<CnamListing> = JsonMissing.of()
        private var inboundCallScreening: JsonField<InboundCallScreening> = JsonMissing.of()
        private var mediaFeatures: JsonField<MediaFeatures> = JsonMissing.of()
        private var techPrefixEnabled: JsonField<Boolean> = JsonMissing.of()
        private var translatedNumber: JsonField<String> = JsonMissing.of()
        private var usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateVoiceSettings: UpdateVoiceSettings) = apply {
            callForwarding = updateVoiceSettings.callForwarding
            callRecording = updateVoiceSettings.callRecording
            callerIdNameEnabled = updateVoiceSettings.callerIdNameEnabled
            cnamListing = updateVoiceSettings.cnamListing
            inboundCallScreening = updateVoiceSettings.inboundCallScreening
            mediaFeatures = updateVoiceSettings.mediaFeatures
            techPrefixEnabled = updateVoiceSettings.techPrefixEnabled
            translatedNumber = updateVoiceSettings.translatedNumber
            usagePaymentMethod = updateVoiceSettings.usagePaymentMethod
            additionalProperties = updateVoiceSettings.additionalProperties.toMutableMap()
        }

        /** The call forwarding settings for a phone number. */
        fun callForwarding(callForwarding: CallForwarding) =
            callForwarding(JsonField.of(callForwarding))

        /**
         * Sets [Builder.callForwarding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callForwarding] with a well-typed [CallForwarding] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callForwarding(callForwarding: JsonField<CallForwarding>) = apply {
            this.callForwarding = callForwarding
        }

        /** The call recording settings for a phone number. */
        fun callRecording(callRecording: CallRecording) = callRecording(JsonField.of(callRecording))

        /**
         * Sets [Builder.callRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecording] with a well-typed [CallRecording] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callRecording(callRecording: JsonField<CallRecording>) = apply {
            this.callRecording = callRecording
        }

        /** Controls whether the caller ID name is enabled for this phone number. */
        fun callerIdNameEnabled(callerIdNameEnabled: Boolean) =
            callerIdNameEnabled(JsonField.of(callerIdNameEnabled))

        /**
         * Sets [Builder.callerIdNameEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerIdNameEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callerIdNameEnabled(callerIdNameEnabled: JsonField<Boolean>) = apply {
            this.callerIdNameEnabled = callerIdNameEnabled
        }

        /** The CNAM listing settings for a phone number. */
        fun cnamListing(cnamListing: CnamListing) = cnamListing(JsonField.of(cnamListing))

        /**
         * Sets [Builder.cnamListing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cnamListing] with a well-typed [CnamListing] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cnamListing(cnamListing: JsonField<CnamListing>) = apply {
            this.cnamListing = cnamListing
        }

        /**
         * The inbound_call_screening setting is a phone number configuration option variable that
         * allows users to configure their settings to block or flag fraudulent calls. It can be set
         * to disabled, reject_calls, or flag_calls. This feature has an additional per-number
         * monthly cost associated with it.
         */
        fun inboundCallScreening(inboundCallScreening: InboundCallScreening) =
            inboundCallScreening(JsonField.of(inboundCallScreening))

        /**
         * Sets [Builder.inboundCallScreening] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundCallScreening] with a well-typed
         * [InboundCallScreening] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inboundCallScreening(inboundCallScreening: JsonField<InboundCallScreening>) = apply {
            this.inboundCallScreening = inboundCallScreening
        }

        /** The media features settings for a phone number. */
        fun mediaFeatures(mediaFeatures: MediaFeatures) = mediaFeatures(JsonField.of(mediaFeatures))

        /**
         * Sets [Builder.mediaFeatures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaFeatures] with a well-typed [MediaFeatures] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mediaFeatures(mediaFeatures: JsonField<MediaFeatures>) = apply {
            this.mediaFeatures = mediaFeatures
        }

        /** Controls whether a tech prefix is enabled for this phone number. */
        fun techPrefixEnabled(techPrefixEnabled: Boolean) =
            techPrefixEnabled(JsonField.of(techPrefixEnabled))

        /**
         * Sets [Builder.techPrefixEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.techPrefixEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun techPrefixEnabled(techPrefixEnabled: JsonField<Boolean>) = apply {
            this.techPrefixEnabled = techPrefixEnabled
        }

        /**
         * This field allows you to rewrite the destination number of an inbound call before the
         * call is routed to you. The value of this field may be any alphanumeric value, and the
         * value will replace the number originally dialed.
         */
        fun translatedNumber(translatedNumber: String) =
            translatedNumber(JsonField.of(translatedNumber))

        /**
         * Sets [Builder.translatedNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.translatedNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun translatedNumber(translatedNumber: JsonField<String>) = apply {
            this.translatedNumber = translatedNumber
        }

        /** Controls whether a number is billed per minute or uses your concurrent channels. */
        fun usagePaymentMethod(usagePaymentMethod: UsagePaymentMethod) =
            usagePaymentMethod(JsonField.of(usagePaymentMethod))

        /**
         * Sets [Builder.usagePaymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usagePaymentMethod] with a well-typed
         * [UsagePaymentMethod] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun usagePaymentMethod(usagePaymentMethod: JsonField<UsagePaymentMethod>) = apply {
            this.usagePaymentMethod = usagePaymentMethod
        }

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
         * Returns an immutable instance of [UpdateVoiceSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateVoiceSettings =
            UpdateVoiceSettings(
                callForwarding,
                callRecording,
                callerIdNameEnabled,
                cnamListing,
                inboundCallScreening,
                mediaFeatures,
                techPrefixEnabled,
                translatedNumber,
                usagePaymentMethod,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpdateVoiceSettings = apply {
        if (validated) {
            return@apply
        }

        callForwarding().ifPresent { it.validate() }
        callRecording().ifPresent { it.validate() }
        callerIdNameEnabled()
        cnamListing().ifPresent { it.validate() }
        inboundCallScreening().ifPresent { it.validate() }
        mediaFeatures().ifPresent { it.validate() }
        techPrefixEnabled()
        translatedNumber()
        usagePaymentMethod().ifPresent { it.validate() }
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
        (callForwarding.asKnown().getOrNull()?.validity() ?: 0) +
            (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
            (if (callerIdNameEnabled.asKnown().isPresent) 1 else 0) +
            (cnamListing.asKnown().getOrNull()?.validity() ?: 0) +
            (inboundCallScreening.asKnown().getOrNull()?.validity() ?: 0) +
            (mediaFeatures.asKnown().getOrNull()?.validity() ?: 0) +
            (if (techPrefixEnabled.asKnown().isPresent) 1 else 0) +
            (if (translatedNumber.asKnown().isPresent) 1 else 0) +
            (usagePaymentMethod.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The inbound_call_screening setting is a phone number configuration option variable that
     * allows users to configure their settings to block or flag fraudulent calls. It can be set to
     * disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost
     * associated with it.
     */
    class InboundCallScreening
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

            @JvmField val DISABLED = of("disabled")

            @JvmField val REJECT_CALLS = of("reject_calls")

            @JvmField val FLAG_CALLS = of("flag_calls")

            @JvmStatic fun of(value: String) = InboundCallScreening(JsonField.of(value))
        }

        /** An enum containing [InboundCallScreening]'s known values. */
        enum class Known {
            DISABLED,
            REJECT_CALLS,
            FLAG_CALLS,
        }

        /**
         * An enum containing [InboundCallScreening]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [InboundCallScreening] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISABLED,
            REJECT_CALLS,
            FLAG_CALLS,
            /**
             * An enum member indicating that [InboundCallScreening] was instantiated with an
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
                DISABLED -> Value.DISABLED
                REJECT_CALLS -> Value.REJECT_CALLS
                FLAG_CALLS -> Value.FLAG_CALLS
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
                DISABLED -> Known.DISABLED
                REJECT_CALLS -> Known.REJECT_CALLS
                FLAG_CALLS -> Known.FLAG_CALLS
                else -> throw TelnyxInvalidDataException("Unknown InboundCallScreening: $value")
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

        fun validate(): InboundCallScreening = apply {
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

            return other is InboundCallScreening && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Controls whether a number is billed per minute or uses your concurrent channels. */
    class UsagePaymentMethod
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

            @JvmField val PAY_PER_MINUTE = of("pay-per-minute")

            @JvmField val CHANNEL = of("channel")

            @JvmStatic fun of(value: String) = UsagePaymentMethod(JsonField.of(value))
        }

        /** An enum containing [UsagePaymentMethod]'s known values. */
        enum class Known {
            PAY_PER_MINUTE,
            CHANNEL,
        }

        /**
         * An enum containing [UsagePaymentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UsagePaymentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAY_PER_MINUTE,
            CHANNEL,
            /**
             * An enum member indicating that [UsagePaymentMethod] was instantiated with an unknown
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
                PAY_PER_MINUTE -> Value.PAY_PER_MINUTE
                CHANNEL -> Value.CHANNEL
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
                PAY_PER_MINUTE -> Known.PAY_PER_MINUTE
                CHANNEL -> Known.CHANNEL
                else -> throw TelnyxInvalidDataException("Unknown UsagePaymentMethod: $value")
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

        fun validate(): UsagePaymentMethod = apply {
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

            return other is UsagePaymentMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateVoiceSettings &&
            callForwarding == other.callForwarding &&
            callRecording == other.callRecording &&
            callerIdNameEnabled == other.callerIdNameEnabled &&
            cnamListing == other.cnamListing &&
            inboundCallScreening == other.inboundCallScreening &&
            mediaFeatures == other.mediaFeatures &&
            techPrefixEnabled == other.techPrefixEnabled &&
            translatedNumber == other.translatedNumber &&
            usagePaymentMethod == other.usagePaymentMethod &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callForwarding,
            callRecording,
            callerIdNameEnabled,
            cnamListing,
            inboundCallScreening,
            mediaFeatures,
            techPrefixEnabled,
            translatedNumber,
            usagePaymentMethod,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateVoiceSettings{callForwarding=$callForwarding, callRecording=$callRecording, callerIdNameEnabled=$callerIdNameEnabled, cnamListing=$cnamListing, inboundCallScreening=$inboundCallScreening, mediaFeatures=$mediaFeatures, techPrefixEnabled=$techPrefixEnabled, translatedNumber=$translatedNumber, usagePaymentMethod=$usagePaymentMethod, additionalProperties=$additionalProperties}"
}
