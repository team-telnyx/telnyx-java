// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

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

class TelephonySettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultTexmlAppId: JsonField<String>,
    private val noiseSuppression: JsonField<NoiseSuppression>,
    private val noiseSuppressionConfig: JsonField<NoiseSuppressionConfig>,
    private val supportsUnauthenticatedWebCalls: JsonField<Boolean>,
    private val timeLimitSecs: JsonField<Long>,
    private val userIdleTimeoutSecs: JsonField<Long>,
    private val voicemailDetection: JsonField<VoicemailDetection>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_texml_app_id")
        @ExcludeMissing
        defaultTexmlAppId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("noise_suppression")
        @ExcludeMissing
        noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of(),
        @JsonProperty("noise_suppression_config")
        @ExcludeMissing
        noiseSuppressionConfig: JsonField<NoiseSuppressionConfig> = JsonMissing.of(),
        @JsonProperty("supports_unauthenticated_web_calls")
        @ExcludeMissing
        supportsUnauthenticatedWebCalls: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("time_limit_secs")
        @ExcludeMissing
        timeLimitSecs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("user_idle_timeout_secs")
        @ExcludeMissing
        userIdleTimeoutSecs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("voicemail_detection")
        @ExcludeMissing
        voicemailDetection: JsonField<VoicemailDetection> = JsonMissing.of(),
    ) : this(
        defaultTexmlAppId,
        noiseSuppression,
        noiseSuppressionConfig,
        supportsUnauthenticatedWebCalls,
        timeLimitSecs,
        userIdleTimeoutSecs,
        voicemailDetection,
        mutableMapOf(),
    )

    /**
     * Default Texml App used for voice calls with your assistant. This will be created
     * automatically on assistant creation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultTexmlAppId(): Optional<String> =
        defaultTexmlAppId.getOptional("default_texml_app_id")

    /**
     * The noise suppression engine to use. Use 'disabled' to turn off noise suppression.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppression(): Optional<NoiseSuppression> =
        noiseSuppression.getOptional("noise_suppression")

    /**
     * Configuration for noise suppression. Only applicable when noise_suppression is
     * 'deepfilternet'.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppressionConfig(): Optional<NoiseSuppressionConfig> =
        noiseSuppressionConfig.getOptional("noise_suppression_config")

    /**
     * When enabled, allows users to interact with your AI assistant directly from your website
     * without requiring authentication. This is required for FE widgets that work with assistants
     * that have telephony enabled.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportsUnauthenticatedWebCalls(): Optional<Boolean> =
        supportsUnauthenticatedWebCalls.getOptional("supports_unauthenticated_web_calls")

    /**
     * Maximum duration in seconds for the AI assistant to participate on the call. When this limit
     * is reached the assistant will be stopped. This limit does not apply to portions of a call
     * without an active assistant (for instance, a call transferred to a human representative).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeLimitSecs(): Optional<Long> = timeLimitSecs.getOptional("time_limit_secs")

    /**
     * Maximum duration in seconds of end user silence on the call. When this limit is reached the
     * assistant will be stopped. This limit does not apply to portions of a call without an active
     * assistant (for instance, a call transferred to a human representative).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userIdleTimeoutSecs(): Optional<Long> =
        userIdleTimeoutSecs.getOptional("user_idle_timeout_secs")

    /**
     * Configuration for voicemail detection (AMD - Answering Machine Detection) on outgoing calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voicemailDetection(): Optional<VoicemailDetection> =
        voicemailDetection.getOptional("voicemail_detection")

    /**
     * Returns the raw JSON value of [defaultTexmlAppId].
     *
     * Unlike [defaultTexmlAppId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_texml_app_id")
    @ExcludeMissing
    fun _defaultTexmlAppId(): JsonField<String> = defaultTexmlAppId

    /**
     * Returns the raw JSON value of [noiseSuppression].
     *
     * Unlike [noiseSuppression], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("noise_suppression")
    @ExcludeMissing
    fun _noiseSuppression(): JsonField<NoiseSuppression> = noiseSuppression

    /**
     * Returns the raw JSON value of [noiseSuppressionConfig].
     *
     * Unlike [noiseSuppressionConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("noise_suppression_config")
    @ExcludeMissing
    fun _noiseSuppressionConfig(): JsonField<NoiseSuppressionConfig> = noiseSuppressionConfig

    /**
     * Returns the raw JSON value of [supportsUnauthenticatedWebCalls].
     *
     * Unlike [supportsUnauthenticatedWebCalls], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("supports_unauthenticated_web_calls")
    @ExcludeMissing
    fun _supportsUnauthenticatedWebCalls(): JsonField<Boolean> = supportsUnauthenticatedWebCalls

    /**
     * Returns the raw JSON value of [timeLimitSecs].
     *
     * Unlike [timeLimitSecs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_limit_secs")
    @ExcludeMissing
    fun _timeLimitSecs(): JsonField<Long> = timeLimitSecs

    /**
     * Returns the raw JSON value of [userIdleTimeoutSecs].
     *
     * Unlike [userIdleTimeoutSecs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("user_idle_timeout_secs")
    @ExcludeMissing
    fun _userIdleTimeoutSecs(): JsonField<Long> = userIdleTimeoutSecs

    /**
     * Returns the raw JSON value of [voicemailDetection].
     *
     * Unlike [voicemailDetection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("voicemail_detection")
    @ExcludeMissing
    fun _voicemailDetection(): JsonField<VoicemailDetection> = voicemailDetection

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

        /** Returns a mutable builder for constructing an instance of [TelephonySettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TelephonySettings]. */
    class Builder internal constructor() {

        private var defaultTexmlAppId: JsonField<String> = JsonMissing.of()
        private var noiseSuppression: JsonField<NoiseSuppression> = JsonMissing.of()
        private var noiseSuppressionConfig: JsonField<NoiseSuppressionConfig> = JsonMissing.of()
        private var supportsUnauthenticatedWebCalls: JsonField<Boolean> = JsonMissing.of()
        private var timeLimitSecs: JsonField<Long> = JsonMissing.of()
        private var userIdleTimeoutSecs: JsonField<Long> = JsonMissing.of()
        private var voicemailDetection: JsonField<VoicemailDetection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(telephonySettings: TelephonySettings) = apply {
            defaultTexmlAppId = telephonySettings.defaultTexmlAppId
            noiseSuppression = telephonySettings.noiseSuppression
            noiseSuppressionConfig = telephonySettings.noiseSuppressionConfig
            supportsUnauthenticatedWebCalls = telephonySettings.supportsUnauthenticatedWebCalls
            timeLimitSecs = telephonySettings.timeLimitSecs
            userIdleTimeoutSecs = telephonySettings.userIdleTimeoutSecs
            voicemailDetection = telephonySettings.voicemailDetection
            additionalProperties = telephonySettings.additionalProperties.toMutableMap()
        }

        /**
         * Default Texml App used for voice calls with your assistant. This will be created
         * automatically on assistant creation.
         */
        fun defaultTexmlAppId(defaultTexmlAppId: String) =
            defaultTexmlAppId(JsonField.of(defaultTexmlAppId))

        /**
         * Sets [Builder.defaultTexmlAppId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultTexmlAppId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultTexmlAppId(defaultTexmlAppId: JsonField<String>) = apply {
            this.defaultTexmlAppId = defaultTexmlAppId
        }

        /** The noise suppression engine to use. Use 'disabled' to turn off noise suppression. */
        fun noiseSuppression(noiseSuppression: NoiseSuppression) =
            noiseSuppression(JsonField.of(noiseSuppression))

        /**
         * Sets [Builder.noiseSuppression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppression] with a well-typed [NoiseSuppression]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun noiseSuppression(noiseSuppression: JsonField<NoiseSuppression>) = apply {
            this.noiseSuppression = noiseSuppression
        }

        /**
         * Configuration for noise suppression. Only applicable when noise_suppression is
         * 'deepfilternet'.
         */
        fun noiseSuppressionConfig(noiseSuppressionConfig: NoiseSuppressionConfig) =
            noiseSuppressionConfig(JsonField.of(noiseSuppressionConfig))

        /**
         * Sets [Builder.noiseSuppressionConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppressionConfig] with a well-typed
         * [NoiseSuppressionConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun noiseSuppressionConfig(noiseSuppressionConfig: JsonField<NoiseSuppressionConfig>) =
            apply {
                this.noiseSuppressionConfig = noiseSuppressionConfig
            }

        /**
         * When enabled, allows users to interact with your AI assistant directly from your website
         * without requiring authentication. This is required for FE widgets that work with
         * assistants that have telephony enabled.
         */
        fun supportsUnauthenticatedWebCalls(supportsUnauthenticatedWebCalls: Boolean) =
            supportsUnauthenticatedWebCalls(JsonField.of(supportsUnauthenticatedWebCalls))

        /**
         * Sets [Builder.supportsUnauthenticatedWebCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportsUnauthenticatedWebCalls] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun supportsUnauthenticatedWebCalls(supportsUnauthenticatedWebCalls: JsonField<Boolean>) =
            apply {
                this.supportsUnauthenticatedWebCalls = supportsUnauthenticatedWebCalls
            }

        /**
         * Maximum duration in seconds for the AI assistant to participate on the call. When this
         * limit is reached the assistant will be stopped. This limit does not apply to portions of
         * a call without an active assistant (for instance, a call transferred to a human
         * representative).
         */
        fun timeLimitSecs(timeLimitSecs: Long) = timeLimitSecs(JsonField.of(timeLimitSecs))

        /**
         * Sets [Builder.timeLimitSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeLimitSecs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeLimitSecs(timeLimitSecs: JsonField<Long>) = apply {
            this.timeLimitSecs = timeLimitSecs
        }

        /**
         * Maximum duration in seconds of end user silence on the call. When this limit is reached
         * the assistant will be stopped. This limit does not apply to portions of a call without an
         * active assistant (for instance, a call transferred to a human representative).
         */
        fun userIdleTimeoutSecs(userIdleTimeoutSecs: Long) =
            userIdleTimeoutSecs(JsonField.of(userIdleTimeoutSecs))

        /**
         * Sets [Builder.userIdleTimeoutSecs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIdleTimeoutSecs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userIdleTimeoutSecs(userIdleTimeoutSecs: JsonField<Long>) = apply {
            this.userIdleTimeoutSecs = userIdleTimeoutSecs
        }

        /**
         * Configuration for voicemail detection (AMD - Answering Machine Detection) on outgoing
         * calls.
         */
        fun voicemailDetection(voicemailDetection: VoicemailDetection) =
            voicemailDetection(JsonField.of(voicemailDetection))

        /**
         * Sets [Builder.voicemailDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voicemailDetection] with a well-typed
         * [VoicemailDetection] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun voicemailDetection(voicemailDetection: JsonField<VoicemailDetection>) = apply {
            this.voicemailDetection = voicemailDetection
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
         * Returns an immutable instance of [TelephonySettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TelephonySettings =
            TelephonySettings(
                defaultTexmlAppId,
                noiseSuppression,
                noiseSuppressionConfig,
                supportsUnauthenticatedWebCalls,
                timeLimitSecs,
                userIdleTimeoutSecs,
                voicemailDetection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TelephonySettings = apply {
        if (validated) {
            return@apply
        }

        defaultTexmlAppId()
        noiseSuppression().ifPresent { it.validate() }
        noiseSuppressionConfig().ifPresent { it.validate() }
        supportsUnauthenticatedWebCalls()
        timeLimitSecs()
        userIdleTimeoutSecs()
        voicemailDetection().ifPresent { it.validate() }
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
        (if (defaultTexmlAppId.asKnown().isPresent) 1 else 0) +
            (noiseSuppression.asKnown().getOrNull()?.validity() ?: 0) +
            (noiseSuppressionConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (supportsUnauthenticatedWebCalls.asKnown().isPresent) 1 else 0) +
            (if (timeLimitSecs.asKnown().isPresent) 1 else 0) +
            (if (userIdleTimeoutSecs.asKnown().isPresent) 1 else 0) +
            (voicemailDetection.asKnown().getOrNull()?.validity() ?: 0)

    /** The noise suppression engine to use. Use 'disabled' to turn off noise suppression. */
    class NoiseSuppression @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val KRISP = of("krisp")

            @JvmField val DEEPFILTERNET = of("deepfilternet")

            @JvmField val DISABLED = of("disabled")

            @JvmStatic fun of(value: String) = NoiseSuppression(JsonField.of(value))
        }

        /** An enum containing [NoiseSuppression]'s known values. */
        enum class Known {
            KRISP,
            DEEPFILTERNET,
            DISABLED,
        }

        /**
         * An enum containing [NoiseSuppression]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NoiseSuppression] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KRISP,
            DEEPFILTERNET,
            DISABLED,
            /**
             * An enum member indicating that [NoiseSuppression] was instantiated with an unknown
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
                KRISP -> Value.KRISP
                DEEPFILTERNET -> Value.DEEPFILTERNET
                DISABLED -> Value.DISABLED
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
                KRISP -> Known.KRISP
                DEEPFILTERNET -> Known.DEEPFILTERNET
                DISABLED -> Known.DISABLED
                else -> throw TelnyxInvalidDataException("Unknown NoiseSuppression: $value")
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

        fun validate(): NoiseSuppression = apply {
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

            return other is NoiseSuppression && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration for noise suppression. Only applicable when noise_suppression is
     * 'deepfilternet'.
     */
    class NoiseSuppressionConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attenuationLimit: JsonField<Long>,
        private val mode: JsonField<Mode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attenuation_limit")
            @ExcludeMissing
            attenuationLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        ) : this(attenuationLimit, mode, mutableMapOf())

        /**
         * Attenuation limit for noise suppression. Range: 0-100.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attenuationLimit(): Optional<Long> = attenuationLimit.getOptional("attenuation_limit")

        /**
         * Mode for noise suppression configuration.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * Returns the raw JSON value of [attenuationLimit].
         *
         * Unlike [attenuationLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attenuation_limit")
        @ExcludeMissing
        fun _attenuationLimit(): JsonField<Long> = attenuationLimit

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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

            /**
             * Returns a mutable builder for constructing an instance of [NoiseSuppressionConfig].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NoiseSuppressionConfig]. */
        class Builder internal constructor() {

            private var attenuationLimit: JsonField<Long> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(noiseSuppressionConfig: NoiseSuppressionConfig) = apply {
                attenuationLimit = noiseSuppressionConfig.attenuationLimit
                mode = noiseSuppressionConfig.mode
                additionalProperties = noiseSuppressionConfig.additionalProperties.toMutableMap()
            }

            /** Attenuation limit for noise suppression. Range: 0-100. */
            fun attenuationLimit(attenuationLimit: Long) =
                attenuationLimit(JsonField.of(attenuationLimit))

            /**
             * Sets [Builder.attenuationLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attenuationLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attenuationLimit(attenuationLimit: JsonField<Long>) = apply {
                this.attenuationLimit = attenuationLimit
            }

            /** Mode for noise suppression configuration. */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

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
             * Returns an immutable instance of [NoiseSuppressionConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): NoiseSuppressionConfig =
                NoiseSuppressionConfig(attenuationLimit, mode, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): NoiseSuppressionConfig = apply {
            if (validated) {
                return@apply
            }

            attenuationLimit()
            mode().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (attenuationLimit.asKnown().isPresent) 1 else 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0)

        /** Mode for noise suppression configuration. */
        class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ADVANCED = of("advanced")

                @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                ADVANCED
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADVANCED,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ADVANCED -> Value.ADVANCED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ADVANCED -> Known.ADVANCED
                    else -> throw TelnyxInvalidDataException("Unknown Mode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Mode = apply {
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

                return other is Mode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NoiseSuppressionConfig &&
                attenuationLimit == other.attenuationLimit &&
                mode == other.mode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(attenuationLimit, mode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NoiseSuppressionConfig{attenuationLimit=$attenuationLimit, mode=$mode, additionalProperties=$additionalProperties}"
    }

    /**
     * Configuration for voicemail detection (AMD - Answering Machine Detection) on outgoing calls.
     */
    class VoicemailDetection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val onVoicemailDetected: JsonField<OnVoicemailDetected>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("on_voicemail_detected")
            @ExcludeMissing
            onVoicemailDetected: JsonField<OnVoicemailDetected> = JsonMissing.of()
        ) : this(onVoicemailDetected, mutableMapOf())

        /**
         * Action to take when voicemail is detected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun onVoicemailDetected(): Optional<OnVoicemailDetected> =
            onVoicemailDetected.getOptional("on_voicemail_detected")

        /**
         * Returns the raw JSON value of [onVoicemailDetected].
         *
         * Unlike [onVoicemailDetected], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("on_voicemail_detected")
        @ExcludeMissing
        fun _onVoicemailDetected(): JsonField<OnVoicemailDetected> = onVoicemailDetected

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

            /** Returns a mutable builder for constructing an instance of [VoicemailDetection]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoicemailDetection]. */
        class Builder internal constructor() {

            private var onVoicemailDetected: JsonField<OnVoicemailDetected> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voicemailDetection: VoicemailDetection) = apply {
                onVoicemailDetected = voicemailDetection.onVoicemailDetected
                additionalProperties = voicemailDetection.additionalProperties.toMutableMap()
            }

            /** Action to take when voicemail is detected. */
            fun onVoicemailDetected(onVoicemailDetected: OnVoicemailDetected) =
                onVoicemailDetected(JsonField.of(onVoicemailDetected))

            /**
             * Sets [Builder.onVoicemailDetected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onVoicemailDetected] with a well-typed
             * [OnVoicemailDetected] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun onVoicemailDetected(onVoicemailDetected: JsonField<OnVoicemailDetected>) = apply {
                this.onVoicemailDetected = onVoicemailDetected
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
             * Returns an immutable instance of [VoicemailDetection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VoicemailDetection =
                VoicemailDetection(onVoicemailDetected, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): VoicemailDetection = apply {
            if (validated) {
                return@apply
            }

            onVoicemailDetected().ifPresent { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int = (onVoicemailDetected.asKnown().getOrNull()?.validity() ?: 0)

        /** Action to take when voicemail is detected. */
        class OnVoicemailDetected
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val action: JsonField<Action>,
            private val voicemailMessage: JsonField<VoicemailMessage>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("action")
                @ExcludeMissing
                action: JsonField<Action> = JsonMissing.of(),
                @JsonProperty("voicemail_message")
                @ExcludeMissing
                voicemailMessage: JsonField<VoicemailMessage> = JsonMissing.of(),
            ) : this(action, voicemailMessage, mutableMapOf())

            /**
             * The action to take when voicemail is detected.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun action(): Optional<Action> = action.getOptional("action")

            /**
             * Configuration for the voicemail message to leave. Only applicable when action is
             * 'leave_message_and_stop_assistant'.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun voicemailMessage(): Optional<VoicemailMessage> =
                voicemailMessage.getOptional("voicemail_message")

            /**
             * Returns the raw JSON value of [action].
             *
             * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

            /**
             * Returns the raw JSON value of [voicemailMessage].
             *
             * Unlike [voicemailMessage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("voicemail_message")
            @ExcludeMissing
            fun _voicemailMessage(): JsonField<VoicemailMessage> = voicemailMessage

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

                /**
                 * Returns a mutable builder for constructing an instance of [OnVoicemailDetected].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OnVoicemailDetected]. */
            class Builder internal constructor() {

                private var action: JsonField<Action> = JsonMissing.of()
                private var voicemailMessage: JsonField<VoicemailMessage> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(onVoicemailDetected: OnVoicemailDetected) = apply {
                    action = onVoicemailDetected.action
                    voicemailMessage = onVoicemailDetected.voicemailMessage
                    additionalProperties = onVoicemailDetected.additionalProperties.toMutableMap()
                }

                /** The action to take when voicemail is detected. */
                fun action(action: Action) = action(JsonField.of(action))

                /**
                 * Sets [Builder.action] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.action] with a well-typed [Action] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun action(action: JsonField<Action>) = apply { this.action = action }

                /**
                 * Configuration for the voicemail message to leave. Only applicable when action is
                 * 'leave_message_and_stop_assistant'.
                 */
                fun voicemailMessage(voicemailMessage: VoicemailMessage) =
                    voicemailMessage(JsonField.of(voicemailMessage))

                /**
                 * Sets [Builder.voicemailMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voicemailMessage] with a well-typed
                 * [VoicemailMessage] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun voicemailMessage(voicemailMessage: JsonField<VoicemailMessage>) = apply {
                    this.voicemailMessage = voicemailMessage
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OnVoicemailDetected].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OnVoicemailDetected =
                    OnVoicemailDetected(
                        action,
                        voicemailMessage,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OnVoicemailDetected = apply {
                if (validated) {
                    return@apply
                }

                action().ifPresent { it.validate() }
                voicemailMessage().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (action.asKnown().getOrNull()?.validity() ?: 0) +
                    (voicemailMessage.asKnown().getOrNull()?.validity() ?: 0)

            /** The action to take when voicemail is detected. */
            class Action @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val STOP_ASSISTANT = of("stop_assistant")

                    @JvmField
                    val LEAVE_MESSAGE_AND_STOP_ASSISTANT = of("leave_message_and_stop_assistant")

                    @JvmField val CONTINUE_ASSISTANT = of("continue_assistant")

                    @JvmStatic fun of(value: String) = Action(JsonField.of(value))
                }

                /** An enum containing [Action]'s known values. */
                enum class Known {
                    STOP_ASSISTANT,
                    LEAVE_MESSAGE_AND_STOP_ASSISTANT,
                    CONTINUE_ASSISTANT,
                }

                /**
                 * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Action] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    STOP_ASSISTANT,
                    LEAVE_MESSAGE_AND_STOP_ASSISTANT,
                    CONTINUE_ASSISTANT,
                    /**
                     * An enum member indicating that [Action] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        STOP_ASSISTANT -> Value.STOP_ASSISTANT
                        LEAVE_MESSAGE_AND_STOP_ASSISTANT -> Value.LEAVE_MESSAGE_AND_STOP_ASSISTANT
                        CONTINUE_ASSISTANT -> Value.CONTINUE_ASSISTANT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        STOP_ASSISTANT -> Known.STOP_ASSISTANT
                        LEAVE_MESSAGE_AND_STOP_ASSISTANT -> Known.LEAVE_MESSAGE_AND_STOP_ASSISTANT
                        CONTINUE_ASSISTANT -> Known.CONTINUE_ASSISTANT
                        else -> throw TelnyxInvalidDataException("Unknown Action: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Action = apply {
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

                    return other is Action && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Configuration for the voicemail message to leave. Only applicable when action is
             * 'leave_message_and_stop_assistant'.
             */
            class VoicemailMessage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val message: JsonField<String>,
                private val prompt: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("message")
                    @ExcludeMissing
                    message: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("prompt")
                    @ExcludeMissing
                    prompt: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                ) : this(message, prompt, type, mutableMapOf())

                /**
                 * The specific message to leave as voicemail. Only applicable when type is
                 * 'message'.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun message(): Optional<String> = message.getOptional("message")

                /**
                 * The prompt to use for generating the voicemail message. Only applicable when type
                 * is 'prompt'.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun prompt(): Optional<String> = prompt.getOptional("prompt")

                /**
                 * The type of voicemail message. Use 'prompt' to have the assistant generate a
                 * message based on a prompt, or 'message' to leave a specific message.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [message].
                 *
                 * Unlike [message], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

                /**
                 * Returns the raw JSON value of [prompt].
                 *
                 * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                    /**
                     * Returns a mutable builder for constructing an instance of [VoicemailMessage].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [VoicemailMessage]. */
                class Builder internal constructor() {

                    private var message: JsonField<String> = JsonMissing.of()
                    private var prompt: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(voicemailMessage: VoicemailMessage) = apply {
                        message = voicemailMessage.message
                        prompt = voicemailMessage.prompt
                        type = voicemailMessage.type
                        additionalProperties = voicemailMessage.additionalProperties.toMutableMap()
                    }

                    /**
                     * The specific message to leave as voicemail. Only applicable when type is
                     * 'message'.
                     */
                    fun message(message: String) = message(JsonField.of(message))

                    /**
                     * Sets [Builder.message] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.message] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun message(message: JsonField<String>) = apply { this.message = message }

                    /**
                     * The prompt to use for generating the voicemail message. Only applicable when
                     * type is 'prompt'.
                     */
                    fun prompt(prompt: String) = prompt(JsonField.of(prompt))

                    /**
                     * Sets [Builder.prompt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prompt] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

                    /**
                     * The type of voicemail message. Use 'prompt' to have the assistant generate a
                     * message based on a prompt, or 'message' to leave a specific message.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [VoicemailMessage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): VoicemailMessage =
                        VoicemailMessage(message, prompt, type, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): VoicemailMessage = apply {
                    if (validated) {
                        return@apply
                    }

                    message()
                    prompt()
                    type().ifPresent { it.validate() }
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (message.asKnown().isPresent) 1 else 0) +
                        (if (prompt.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * The type of voicemail message. Use 'prompt' to have the assistant generate a
                 * message based on a prompt, or 'message' to leave a specific message.
                 */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PROMPT = of("prompt")

                        @JvmField val MESSAGE = of("message")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PROMPT,
                        MESSAGE,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PROMPT,
                        MESSAGE,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PROMPT -> Value.PROMPT
                            MESSAGE -> Value.MESSAGE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PROMPT -> Known.PROMPT
                            MESSAGE -> Known.MESSAGE
                            else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws TelnyxInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            TelnyxInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Type = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VoicemailMessage &&
                        message == other.message &&
                        prompt == other.prompt &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(message, prompt, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VoicemailMessage{message=$message, prompt=$prompt, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OnVoicemailDetected &&
                    action == other.action &&
                    voicemailMessage == other.voicemailMessage &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(action, voicemailMessage, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OnVoicemailDetected{action=$action, voicemailMessage=$voicemailMessage, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoicemailDetection &&
                onVoicemailDetected == other.onVoicemailDetected &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(onVoicemailDetected, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoicemailDetection{onVoicemailDetected=$onVoicemailDetected, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelephonySettings &&
            defaultTexmlAppId == other.defaultTexmlAppId &&
            noiseSuppression == other.noiseSuppression &&
            noiseSuppressionConfig == other.noiseSuppressionConfig &&
            supportsUnauthenticatedWebCalls == other.supportsUnauthenticatedWebCalls &&
            timeLimitSecs == other.timeLimitSecs &&
            userIdleTimeoutSecs == other.userIdleTimeoutSecs &&
            voicemailDetection == other.voicemailDetection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultTexmlAppId,
            noiseSuppression,
            noiseSuppressionConfig,
            supportsUnauthenticatedWebCalls,
            timeLimitSecs,
            userIdleTimeoutSecs,
            voicemailDetection,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TelephonySettings{defaultTexmlAppId=$defaultTexmlAppId, noiseSuppression=$noiseSuppression, noiseSuppressionConfig=$noiseSuppressionConfig, supportsUnauthenticatedWebCalls=$supportsUnauthenticatedWebCalls, timeLimitSecs=$timeLimitSecs, userIdleTimeoutSecs=$userIdleTimeoutSecs, voicemailDetection=$voicemailDetection, additionalProperties=$additionalProperties}"
}
