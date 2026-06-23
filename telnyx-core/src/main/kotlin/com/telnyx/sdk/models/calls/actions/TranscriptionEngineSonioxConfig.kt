// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionEngineSonioxConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val transcriptionEngine: JsonField<TranscriptionEngine>,
    private val enableEndpointDetection: JsonField<Boolean>,
    private val interimResults: JsonField<Boolean>,
    private val language: JsonField<String>,
    private val maxEndpointDelayMs: JsonField<Long>,
    private val transcriptionModel: JsonField<TranscriptionModel>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
        @JsonProperty("enable_endpoint_detection")
        @ExcludeMissing
        enableEndpointDetection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("interim_results")
        @ExcludeMissing
        interimResults: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_endpoint_delay_ms")
        @ExcludeMissing
        maxEndpointDelayMs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transcription_model")
        @ExcludeMissing
        transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
    ) : this(
        transcriptionEngine,
        enableEndpointDetection,
        interimResults,
        language,
        maxEndpointDelayMs,
        transcriptionModel,
        mutableMapOf(),
    )

    /**
     * Engine identifier for Soniox transcription service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transcriptionEngine(): TranscriptionEngine =
        transcriptionEngine.getRequired("transcription_engine")

    /**
     * When true, Soniox emits end-of-utterance events at the cadence configured by
     * `max_endpoint_delay_ms`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableEndpointDetection(): Optional<Boolean> =
        enableEndpointDetection.getOptional("enable_endpoint_detection")

    /**
     * Whether to send also interim results. If set to false, only final results will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

    /**
     * ISO 639-1 language hint (e.g. `en`, `es`), or `auto` to omit the hint and let Soniox
     * auto-detect supported languages multilingually.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * Maximum silence (in milliseconds) before Soniox emits an end-of-utterance event. Only honored
     * when `enable_endpoint_detection` is true. Range: 500-3000 ms.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxEndpointDelayMs(): Optional<Long> =
        maxEndpointDelayMs.getOptional("max_endpoint_delay_ms")

    /**
     * The model to use for transcription.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionModel(): Optional<TranscriptionModel> =
        transcriptionModel.getOptional("transcription_model")

    /**
     * Returns the raw JSON value of [transcriptionEngine].
     *
     * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcription_engine")
    @ExcludeMissing
    fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

    /**
     * Returns the raw JSON value of [enableEndpointDetection].
     *
     * Unlike [enableEndpointDetection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_endpoint_detection")
    @ExcludeMissing
    fun _enableEndpointDetection(): JsonField<Boolean> = enableEndpointDetection

    /**
     * Returns the raw JSON value of [interimResults].
     *
     * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interim_results")
    @ExcludeMissing
    fun _interimResults(): JsonField<Boolean> = interimResults

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [maxEndpointDelayMs].
     *
     * Unlike [maxEndpointDelayMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_endpoint_delay_ms")
    @ExcludeMissing
    fun _maxEndpointDelayMs(): JsonField<Long> = maxEndpointDelayMs

    /**
     * Returns the raw JSON value of [transcriptionModel].
     *
     * Unlike [transcriptionModel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcription_model")
    @ExcludeMissing
    fun _transcriptionModel(): JsonField<TranscriptionModel> = transcriptionModel

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
         * Returns a mutable builder for constructing an instance of
         * [TranscriptionEngineSonioxConfig].
         *
         * The following fields are required:
         * ```java
         * .transcriptionEngine()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionEngineSonioxConfig]. */
    class Builder internal constructor() {

        private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
        private var enableEndpointDetection: JsonField<Boolean> = JsonMissing.of()
        private var interimResults: JsonField<Boolean> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var maxEndpointDelayMs: JsonField<Long> = JsonMissing.of()
        private var transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionEngineSonioxConfig: TranscriptionEngineSonioxConfig) =
            apply {
                transcriptionEngine = transcriptionEngineSonioxConfig.transcriptionEngine
                enableEndpointDetection = transcriptionEngineSonioxConfig.enableEndpointDetection
                interimResults = transcriptionEngineSonioxConfig.interimResults
                language = transcriptionEngineSonioxConfig.language
                maxEndpointDelayMs = transcriptionEngineSonioxConfig.maxEndpointDelayMs
                transcriptionModel = transcriptionEngineSonioxConfig.transcriptionModel
                additionalProperties =
                    transcriptionEngineSonioxConfig.additionalProperties.toMutableMap()
            }

        /** Engine identifier for Soniox transcription service */
        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
            transcriptionEngine(JsonField.of(transcriptionEngine))

        /**
         * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEngine] with a well-typed
         * [TranscriptionEngine] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
            this.transcriptionEngine = transcriptionEngine
        }

        /**
         * When true, Soniox emits end-of-utterance events at the cadence configured by
         * `max_endpoint_delay_ms`.
         */
        fun enableEndpointDetection(enableEndpointDetection: Boolean) =
            enableEndpointDetection(JsonField.of(enableEndpointDetection))

        /**
         * Sets [Builder.enableEndpointDetection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableEndpointDetection] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableEndpointDetection(enableEndpointDetection: JsonField<Boolean>) = apply {
            this.enableEndpointDetection = enableEndpointDetection
        }

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         */
        fun interimResults(interimResults: Boolean) = interimResults(JsonField.of(interimResults))

        /**
         * Sets [Builder.interimResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interimResults] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interimResults(interimResults: JsonField<Boolean>) = apply {
            this.interimResults = interimResults
        }

        /**
         * ISO 639-1 language hint (e.g. `en`, `es`), or `auto` to omit the hint and let Soniox
         * auto-detect supported languages multilingually.
         */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /**
         * Maximum silence (in milliseconds) before Soniox emits an end-of-utterance event. Only
         * honored when `enable_endpoint_detection` is true. Range: 500-3000 ms.
         */
        fun maxEndpointDelayMs(maxEndpointDelayMs: Long) =
            maxEndpointDelayMs(JsonField.of(maxEndpointDelayMs))

        /**
         * Sets [Builder.maxEndpointDelayMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxEndpointDelayMs] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxEndpointDelayMs(maxEndpointDelayMs: JsonField<Long>) = apply {
            this.maxEndpointDelayMs = maxEndpointDelayMs
        }

        /** The model to use for transcription. */
        fun transcriptionModel(transcriptionModel: TranscriptionModel) =
            transcriptionModel(JsonField.of(transcriptionModel))

        /**
         * Sets [Builder.transcriptionModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionModel] with a well-typed
         * [TranscriptionModel] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionModel(transcriptionModel: JsonField<TranscriptionModel>) = apply {
            this.transcriptionModel = transcriptionModel
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
         * Returns an immutable instance of [TranscriptionEngineSonioxConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .transcriptionEngine()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptionEngineSonioxConfig =
            TranscriptionEngineSonioxConfig(
                checkRequired("transcriptionEngine", transcriptionEngine),
                enableEndpointDetection,
                interimResults,
                language,
                maxEndpointDelayMs,
                transcriptionModel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TranscriptionEngineSonioxConfig = apply {
        if (validated) {
            return@apply
        }

        transcriptionEngine().validate()
        enableEndpointDetection()
        interimResults()
        language()
        maxEndpointDelayMs()
        transcriptionModel().ifPresent { it.validate() }
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
        (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (if (enableEndpointDetection.asKnown().isPresent) 1 else 0) +
            (if (interimResults.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (maxEndpointDelayMs.asKnown().isPresent) 1 else 0) +
            (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0)

    /** Engine identifier for Soniox transcription service */
    class TranscriptionEngine
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

            @JvmField val SONIOX = of("Soniox")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            SONIOX
        }

        /**
         * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionEngine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SONIOX,
            /**
             * An enum member indicating that [TranscriptionEngine] was instantiated with an unknown
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
                SONIOX -> Value.SONIOX
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
                SONIOX -> Known.SONIOX
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TranscriptionEngine = apply {
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

            return other is TranscriptionEngine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The model to use for transcription. */
    class TranscriptionModel
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

            @JvmField val SONIOX_STT_RT_V4 = of("soniox/stt-rt-v4")

            @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
        }

        /** An enum containing [TranscriptionModel]'s known values. */
        enum class Known {
            SONIOX_STT_RT_V4
        }

        /**
         * An enum containing [TranscriptionModel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionModel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SONIOX_STT_RT_V4,
            /**
             * An enum member indicating that [TranscriptionModel] was instantiated with an unknown
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
                SONIOX_STT_RT_V4 -> Value.SONIOX_STT_RT_V4
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
                SONIOX_STT_RT_V4 -> Known.SONIOX_STT_RT_V4
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionModel: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TranscriptionModel = apply {
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

            return other is TranscriptionModel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineSonioxConfig &&
            transcriptionEngine == other.transcriptionEngine &&
            enableEndpointDetection == other.enableEndpointDetection &&
            interimResults == other.interimResults &&
            language == other.language &&
            maxEndpointDelayMs == other.maxEndpointDelayMs &&
            transcriptionModel == other.transcriptionModel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            transcriptionEngine,
            enableEndpointDetection,
            interimResults,
            language,
            maxEndpointDelayMs,
            transcriptionModel,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionEngineSonioxConfig{transcriptionEngine=$transcriptionEngine, enableEndpointDetection=$enableEndpointDetection, interimResults=$interimResults, language=$language, maxEndpointDelayMs=$maxEndpointDelayMs, transcriptionModel=$transcriptionModel, additionalProperties=$additionalProperties}"
}
