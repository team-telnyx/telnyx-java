// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = TranscriptionEngineDeepgramConfig.Deserializer::class)
@JsonSerialize(using = TranscriptionEngineDeepgramConfig.Serializer::class)
class TranscriptionEngineDeepgramConfig
private constructor(
    private val deepgramNova2: DeepgramNova2? = null,
    private val deepgramNova3: DeepgramNova3? = null,
    private val _json: JsonValue? = null,
) {

    fun deepgramNova2(): Optional<DeepgramNova2> = Optional.ofNullable(deepgramNova2)

    fun deepgramNova3(): Optional<DeepgramNova3> = Optional.ofNullable(deepgramNova3)

    fun isDeepgramNova2(): Boolean = deepgramNova2 != null

    fun isDeepgramNova3(): Boolean = deepgramNova3 != null

    fun asDeepgramNova2(): DeepgramNova2 = deepgramNova2.getOrThrow("deepgramNova2")

    fun asDeepgramNova3(): DeepgramNova3 = deepgramNova3.getOrThrow("deepgramNova3")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            deepgramNova2 != null -> visitor.visitDeepgramNova2(deepgramNova2)
            deepgramNova3 != null -> visitor.visitDeepgramNova3(deepgramNova3)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TranscriptionEngineDeepgramConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2) {
                    deepgramNova2.validate()
                }

                override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3) {
                    deepgramNova3.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2) =
                    deepgramNova2.validity()

                override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3) =
                    deepgramNova3.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineDeepgramConfig &&
            deepgramNova2 == other.deepgramNova2 &&
            deepgramNova3 == other.deepgramNova3
    }

    override fun hashCode(): Int = Objects.hash(deepgramNova2, deepgramNova3)

    override fun toString(): String =
        when {
            deepgramNova2 != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova2=$deepgramNova2}"
            deepgramNova3 != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova3=$deepgramNova3}"
            _json != null -> "TranscriptionEngineDeepgramConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TranscriptionEngineDeepgramConfig")
        }

    companion object {

        @JvmStatic
        fun ofDeepgramNova2(deepgramNova2: DeepgramNova2) =
            TranscriptionEngineDeepgramConfig(deepgramNova2 = deepgramNova2)

        @JvmStatic
        fun ofDeepgramNova3(deepgramNova3: DeepgramNova3) =
            TranscriptionEngineDeepgramConfig(deepgramNova3 = deepgramNova3)
    }

    /**
     * An interface that defines how to map each variant of [TranscriptionEngineDeepgramConfig] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitDeepgramNova2(deepgramNova2: DeepgramNova2): T

        fun visitDeepgramNova3(deepgramNova3: DeepgramNova3): T

        /**
         * Maps an unknown variant of [TranscriptionEngineDeepgramConfig] to a value of type [T].
         *
         * An instance of [TranscriptionEngineDeepgramConfig] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown TranscriptionEngineDeepgramConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TranscriptionEngineDeepgramConfig>(
            TranscriptionEngineDeepgramConfig::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): TranscriptionEngineDeepgramConfig {
            val json = JsonValue.fromJsonNode(node)
            val transcriptionModel =
                json.asObject().getOrNull()?.get("transcription_model")?.asString()?.getOrNull()

            when (transcriptionModel) {
                "deepgram/nova-2" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova2>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova2 = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
                "deepgram/nova-3" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova3>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova3 = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
            }

            return TranscriptionEngineDeepgramConfig(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<TranscriptionEngineDeepgramConfig>(
            TranscriptionEngineDeepgramConfig::class
        ) {

        override fun serialize(
            value: TranscriptionEngineDeepgramConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.deepgramNova2 != null -> generator.writeObject(value.deepgramNova2)
                value.deepgramNova3 != null -> generator.writeObject(value.deepgramNova3)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TranscriptionEngineDeepgramConfig")
            }
        }
    }

    class DeepgramNova2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionModel: JsonValue,
        private val interimResults: JsonField<Boolean>,
        private val keywordsBoosting: JsonField<KeywordsBoosting>,
        private val language: JsonField<Language>,
        private val utteranceEndMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_model")
            @ExcludeMissing
            transcriptionModel: JsonValue = JsonMissing.of(),
            @JsonProperty("interim_results")
            @ExcludeMissing
            interimResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("keywords_boosting")
            @ExcludeMissing
            keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
            @JsonProperty("utterance_end_ms")
            @ExcludeMissing
            utteranceEndMs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            transcriptionEngine,
            transcriptionModel,
            interimResults,
            keywordsBoosting,
            language,
            utteranceEndMs,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionEngine(): TranscriptionEngine =
            transcriptionEngine.getRequired("transcription_engine")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("deepgram/nova-2")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("transcription_model")
        @ExcludeMissing
        fun _transcriptionModel(): JsonValue = transcriptionModel

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

        /**
         * Keywords and their respective intensifiers (boosting values) to improve transcription
         * accuracy for specific words or phrases. The intensifier should be a numeric value.
         * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keywordsBoosting(): Optional<KeywordsBoosting> =
            keywordsBoosting.getOptional("keywords_boosting")

        /**
         * Language to use for speech recognition with nova-2 model
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

        /**
         * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to 5000
         * ms.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun utteranceEndMs(): Optional<Long> = utteranceEndMs.getOptional("utterance_end_ms")

        /**
         * Returns the raw JSON value of [transcriptionEngine].
         *
         * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

        /**
         * Returns the raw JSON value of [interimResults].
         *
         * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interim_results")
        @ExcludeMissing
        fun _interimResults(): JsonField<Boolean> = interimResults

        /**
         * Returns the raw JSON value of [keywordsBoosting].
         *
         * Unlike [keywordsBoosting], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("keywords_boosting")
        @ExcludeMissing
        fun _keywordsBoosting(): JsonField<KeywordsBoosting> = keywordsBoosting

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

        /**
         * Returns the raw JSON value of [utteranceEndMs].
         *
         * Unlike [utteranceEndMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("utterance_end_ms")
        @ExcludeMissing
        fun _utteranceEndMs(): JsonField<Long> = utteranceEndMs

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
             * Returns a mutable builder for constructing an instance of [DeepgramNova2].
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepgramNova2]. */
        class Builder internal constructor() {

            private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
            private var transcriptionModel: JsonValue = JsonValue.from("deepgram/nova-2")
            private var interimResults: JsonField<Boolean> = JsonMissing.of()
            private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
            private var language: JsonField<Language> = JsonMissing.of()
            private var utteranceEndMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepgramNova2: DeepgramNova2) = apply {
                transcriptionEngine = deepgramNova2.transcriptionEngine
                transcriptionModel = deepgramNova2.transcriptionModel
                interimResults = deepgramNova2.interimResults
                keywordsBoosting = deepgramNova2.keywordsBoosting
                language = deepgramNova2.language
                utteranceEndMs = deepgramNova2.utteranceEndMs
                additionalProperties = deepgramNova2.additionalProperties.toMutableMap()
            }

            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("deepgram/nova-2")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcriptionModel(transcriptionModel: JsonValue) = apply {
                this.transcriptionModel = transcriptionModel
            }

            /**
             * Whether to send also interim results. If set to false, only final results will be
             * sent.
             */
            fun interimResults(interimResults: Boolean) =
                interimResults(JsonField.of(interimResults))

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
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             */
            fun keywordsBoosting(keywordsBoosting: KeywordsBoosting) =
                keywordsBoosting(JsonField.of(keywordsBoosting))

            /**
             * Sets [Builder.keywordsBoosting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywordsBoosting] with a well-typed
             * [KeywordsBoosting] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
                this.keywordsBoosting = keywordsBoosting
            }

            /** Language to use for speech recognition with nova-2 model */
            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

            /**
             * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to
             * 5000 ms.
             */
            fun utteranceEndMs(utteranceEndMs: Long) = utteranceEndMs(JsonField.of(utteranceEndMs))

            /**
             * Sets [Builder.utteranceEndMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.utteranceEndMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun utteranceEndMs(utteranceEndMs: JsonField<Long>) = apply {
                this.utteranceEndMs = utteranceEndMs
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
             * Returns an immutable instance of [DeepgramNova2].
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
            fun build(): DeepgramNova2 =
                DeepgramNova2(
                    checkRequired("transcriptionEngine", transcriptionEngine),
                    transcriptionModel,
                    interimResults,
                    keywordsBoosting,
                    language,
                    utteranceEndMs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DeepgramNova2 = apply {
            if (validated) {
                return@apply
            }

            transcriptionEngine().validate()
            _transcriptionModel().let {
                if (it != JsonValue.from("deepgram/nova-2")) {
                    throw TelnyxInvalidDataException(
                        "'transcriptionModel' is invalid, received $it"
                    )
                }
            }
            interimResults()
            keywordsBoosting().ifPresent { it.validate() }
            language().ifPresent { it.validate() }
            utteranceEndMs()
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
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                transcriptionModel.let { if (it == JsonValue.from("deepgram/nova-2")) 1 else 0 } +
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (if (utteranceEndMs.asKnown().isPresent) 1 else 0)

        class TranscriptionEngine
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                DEEPGRAM
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM,
                /**
                 * An enum member indicating that [TranscriptionEngine] was instantiated with an
                 * unknown value.
                 */
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
                    DEEPGRAM -> Value.DEEPGRAM
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
                    DEEPGRAM -> Known.DEEPGRAM
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
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

        /**
         * Keywords and their respective intensifiers (boosting values) to improve transcription
         * accuracy for specific words or phrases. The intensifier should be a numeric value.
         * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
         */
        class KeywordsBoosting
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [KeywordsBoosting]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [KeywordsBoosting]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(keywordsBoosting: KeywordsBoosting) = apply {
                    additionalProperties = keywordsBoosting.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [KeywordsBoosting].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): KeywordsBoosting = KeywordsBoosting(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): KeywordsBoosting = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is KeywordsBoosting &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "KeywordsBoosting{additionalProperties=$additionalProperties}"
        }

        /** Language to use for speech recognition with nova-2 model */
        class Language @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val BG = of("bg")

                @JvmField val CA = of("ca")

                @JvmField val ZH_CN = of("zh-CN")

                @JvmField val ZH_HANS = of("zh-Hans")

                @JvmField val ZH_TW = of("zh-TW")

                @JvmField val ZH_HANT = of("zh-Hant")

                @JvmField val ZH_HK = of("zh-HK")

                @JvmField val CS = of("cs")

                @JvmField val DA_DK = of("da-DK")

                @JvmField val NL_BE = of("nl-BE")

                @JvmField val EN_US = of("en-US")

                @JvmField val EN_AU = of("en-AU")

                @JvmField val EN_GB = of("en-GB")

                @JvmField val EN_NZ = of("en-NZ")

                @JvmField val EN_IN = of("en-IN")

                @JvmField val ET = of("et")

                @JvmField val FI = of("fi")

                @JvmField val FR = of("fr")

                @JvmField val FR_CA = of("fr-CA")

                @JvmField val DE_CH = of("de-CH")

                @JvmField val EL = of("el")

                @JvmField val HI = of("hi")

                @JvmField val HU = of("hu")

                @JvmField val ID = of("id")

                @JvmField val IT = of("it")

                @JvmField val JA = of("ja")

                @JvmField val KO_KR = of("ko-KR")

                @JvmField val LV = of("lv")

                @JvmField val LT = of("lt")

                @JvmField val MS = of("ms")

                @JvmField val NO = of("no")

                @JvmField val PL = of("pl")

                @JvmField val PT_BR = of("pt-BR")

                @JvmField val PT_PT = of("pt-PT")

                @JvmField val RO = of("ro")

                @JvmField val RU = of("ru")

                @JvmField val SK = of("sk")

                @JvmField val ES_419 = of("es-419")

                @JvmField val SV_SE = of("sv-SE")

                @JvmField val TH_TH = of("th-TH")

                @JvmField val TR = of("tr")

                @JvmField val UK = of("uk")

                @JvmField val VI = of("vi")

                @JvmField val AUTO_DETECT = of("auto_detect")

                @JvmStatic fun of(value: String) = Language(JsonField.of(value))
            }

            /** An enum containing [Language]'s known values. */
            enum class Known {
                BG,
                CA,
                ZH_CN,
                ZH_HANS,
                ZH_TW,
                ZH_HANT,
                ZH_HK,
                CS,
                DA_DK,
                NL_BE,
                EN_US,
                EN_AU,
                EN_GB,
                EN_NZ,
                EN_IN,
                ET,
                FI,
                FR,
                FR_CA,
                DE_CH,
                EL,
                HI,
                HU,
                ID,
                IT,
                JA,
                KO_KR,
                LV,
                LT,
                MS,
                NO,
                PL,
                PT_BR,
                PT_PT,
                RO,
                RU,
                SK,
                ES_419,
                SV_SE,
                TH_TH,
                TR,
                UK,
                VI,
                AUTO_DETECT,
            }

            /**
             * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Language] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BG,
                CA,
                ZH_CN,
                ZH_HANS,
                ZH_TW,
                ZH_HANT,
                ZH_HK,
                CS,
                DA_DK,
                NL_BE,
                EN_US,
                EN_AU,
                EN_GB,
                EN_NZ,
                EN_IN,
                ET,
                FI,
                FR,
                FR_CA,
                DE_CH,
                EL,
                HI,
                HU,
                ID,
                IT,
                JA,
                KO_KR,
                LV,
                LT,
                MS,
                NO,
                PL,
                PT_BR,
                PT_PT,
                RO,
                RU,
                SK,
                ES_419,
                SV_SE,
                TH_TH,
                TR,
                UK,
                VI,
                AUTO_DETECT,
                /**
                 * An enum member indicating that [Language] was instantiated with an unknown value.
                 */
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
                    BG -> Value.BG
                    CA -> Value.CA
                    ZH_CN -> Value.ZH_CN
                    ZH_HANS -> Value.ZH_HANS
                    ZH_TW -> Value.ZH_TW
                    ZH_HANT -> Value.ZH_HANT
                    ZH_HK -> Value.ZH_HK
                    CS -> Value.CS
                    DA_DK -> Value.DA_DK
                    NL_BE -> Value.NL_BE
                    EN_US -> Value.EN_US
                    EN_AU -> Value.EN_AU
                    EN_GB -> Value.EN_GB
                    EN_NZ -> Value.EN_NZ
                    EN_IN -> Value.EN_IN
                    ET -> Value.ET
                    FI -> Value.FI
                    FR -> Value.FR
                    FR_CA -> Value.FR_CA
                    DE_CH -> Value.DE_CH
                    EL -> Value.EL
                    HI -> Value.HI
                    HU -> Value.HU
                    ID -> Value.ID
                    IT -> Value.IT
                    JA -> Value.JA
                    KO_KR -> Value.KO_KR
                    LV -> Value.LV
                    LT -> Value.LT
                    MS -> Value.MS
                    NO -> Value.NO
                    PL -> Value.PL
                    PT_BR -> Value.PT_BR
                    PT_PT -> Value.PT_PT
                    RO -> Value.RO
                    RU -> Value.RU
                    SK -> Value.SK
                    ES_419 -> Value.ES_419
                    SV_SE -> Value.SV_SE
                    TH_TH -> Value.TH_TH
                    TR -> Value.TR
                    UK -> Value.UK
                    VI -> Value.VI
                    AUTO_DETECT -> Value.AUTO_DETECT
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
                    BG -> Known.BG
                    CA -> Known.CA
                    ZH_CN -> Known.ZH_CN
                    ZH_HANS -> Known.ZH_HANS
                    ZH_TW -> Known.ZH_TW
                    ZH_HANT -> Known.ZH_HANT
                    ZH_HK -> Known.ZH_HK
                    CS -> Known.CS
                    DA_DK -> Known.DA_DK
                    NL_BE -> Known.NL_BE
                    EN_US -> Known.EN_US
                    EN_AU -> Known.EN_AU
                    EN_GB -> Known.EN_GB
                    EN_NZ -> Known.EN_NZ
                    EN_IN -> Known.EN_IN
                    ET -> Known.ET
                    FI -> Known.FI
                    FR -> Known.FR
                    FR_CA -> Known.FR_CA
                    DE_CH -> Known.DE_CH
                    EL -> Known.EL
                    HI -> Known.HI
                    HU -> Known.HU
                    ID -> Known.ID
                    IT -> Known.IT
                    JA -> Known.JA
                    KO_KR -> Known.KO_KR
                    LV -> Known.LV
                    LT -> Known.LT
                    MS -> Known.MS
                    NO -> Known.NO
                    PL -> Known.PL
                    PT_BR -> Known.PT_BR
                    PT_PT -> Known.PT_PT
                    RO -> Known.RO
                    RU -> Known.RU
                    SK -> Known.SK
                    ES_419 -> Known.ES_419
                    SV_SE -> Known.SV_SE
                    TH_TH -> Known.TH_TH
                    TR -> Known.TR
                    UK -> Known.UK
                    VI -> Known.VI
                    AUTO_DETECT -> Known.AUTO_DETECT
                    else -> throw TelnyxInvalidDataException("Unknown Language: $value")
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

            fun validate(): Language = apply {
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

                return other is Language && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeepgramNova2 &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionModel == other.transcriptionModel &&
                interimResults == other.interimResults &&
                keywordsBoosting == other.keywordsBoosting &&
                language == other.language &&
                utteranceEndMs == other.utteranceEndMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                transcriptionEngine,
                transcriptionModel,
                interimResults,
                keywordsBoosting,
                language,
                utteranceEndMs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepgramNova2{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, interimResults=$interimResults, keywordsBoosting=$keywordsBoosting, language=$language, utteranceEndMs=$utteranceEndMs, additionalProperties=$additionalProperties}"
    }

    class DeepgramNova3
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionModel: JsonValue,
        private val interimResults: JsonField<Boolean>,
        private val keywordsBoosting: JsonField<KeywordsBoosting>,
        private val language: JsonField<Language>,
        private val utteranceEndMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_model")
            @ExcludeMissing
            transcriptionModel: JsonValue = JsonMissing.of(),
            @JsonProperty("interim_results")
            @ExcludeMissing
            interimResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("keywords_boosting")
            @ExcludeMissing
            keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
            @JsonProperty("utterance_end_ms")
            @ExcludeMissing
            utteranceEndMs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            transcriptionEngine,
            transcriptionModel,
            interimResults,
            keywordsBoosting,
            language,
            utteranceEndMs,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionEngine(): TranscriptionEngine =
            transcriptionEngine.getRequired("transcription_engine")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("deepgram/nova-3")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("transcription_model")
        @ExcludeMissing
        fun _transcriptionModel(): JsonValue = transcriptionModel

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

        /**
         * Keywords and their respective intensifiers (boosting values) to improve transcription
         * accuracy for specific words or phrases. The intensifier should be a numeric value.
         * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keywordsBoosting(): Optional<KeywordsBoosting> =
            keywordsBoosting.getOptional("keywords_boosting")

        /**
         * Language to use for speech recognition with nova-3 model
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

        /**
         * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to 5000
         * ms.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun utteranceEndMs(): Optional<Long> = utteranceEndMs.getOptional("utterance_end_ms")

        /**
         * Returns the raw JSON value of [transcriptionEngine].
         *
         * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

        /**
         * Returns the raw JSON value of [interimResults].
         *
         * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interim_results")
        @ExcludeMissing
        fun _interimResults(): JsonField<Boolean> = interimResults

        /**
         * Returns the raw JSON value of [keywordsBoosting].
         *
         * Unlike [keywordsBoosting], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("keywords_boosting")
        @ExcludeMissing
        fun _keywordsBoosting(): JsonField<KeywordsBoosting> = keywordsBoosting

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

        /**
         * Returns the raw JSON value of [utteranceEndMs].
         *
         * Unlike [utteranceEndMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("utterance_end_ms")
        @ExcludeMissing
        fun _utteranceEndMs(): JsonField<Long> = utteranceEndMs

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
             * Returns a mutable builder for constructing an instance of [DeepgramNova3].
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepgramNova3]. */
        class Builder internal constructor() {

            private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
            private var transcriptionModel: JsonValue = JsonValue.from("deepgram/nova-3")
            private var interimResults: JsonField<Boolean> = JsonMissing.of()
            private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
            private var language: JsonField<Language> = JsonMissing.of()
            private var utteranceEndMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepgramNova3: DeepgramNova3) = apply {
                transcriptionEngine = deepgramNova3.transcriptionEngine
                transcriptionModel = deepgramNova3.transcriptionModel
                interimResults = deepgramNova3.interimResults
                keywordsBoosting = deepgramNova3.keywordsBoosting
                language = deepgramNova3.language
                utteranceEndMs = deepgramNova3.utteranceEndMs
                additionalProperties = deepgramNova3.additionalProperties.toMutableMap()
            }

            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("deepgram/nova-3")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcriptionModel(transcriptionModel: JsonValue) = apply {
                this.transcriptionModel = transcriptionModel
            }

            /**
             * Whether to send also interim results. If set to false, only final results will be
             * sent.
             */
            fun interimResults(interimResults: Boolean) =
                interimResults(JsonField.of(interimResults))

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
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             */
            fun keywordsBoosting(keywordsBoosting: KeywordsBoosting) =
                keywordsBoosting(JsonField.of(keywordsBoosting))

            /**
             * Sets [Builder.keywordsBoosting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywordsBoosting] with a well-typed
             * [KeywordsBoosting] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
                this.keywordsBoosting = keywordsBoosting
            }

            /** Language to use for speech recognition with nova-3 model */
            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

            /**
             * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to
             * 5000 ms.
             */
            fun utteranceEndMs(utteranceEndMs: Long) = utteranceEndMs(JsonField.of(utteranceEndMs))

            /**
             * Sets [Builder.utteranceEndMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.utteranceEndMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun utteranceEndMs(utteranceEndMs: JsonField<Long>) = apply {
                this.utteranceEndMs = utteranceEndMs
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
             * Returns an immutable instance of [DeepgramNova3].
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
            fun build(): DeepgramNova3 =
                DeepgramNova3(
                    checkRequired("transcriptionEngine", transcriptionEngine),
                    transcriptionModel,
                    interimResults,
                    keywordsBoosting,
                    language,
                    utteranceEndMs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DeepgramNova3 = apply {
            if (validated) {
                return@apply
            }

            transcriptionEngine().validate()
            _transcriptionModel().let {
                if (it != JsonValue.from("deepgram/nova-3")) {
                    throw TelnyxInvalidDataException(
                        "'transcriptionModel' is invalid, received $it"
                    )
                }
            }
            interimResults()
            keywordsBoosting().ifPresent { it.validate() }
            language().ifPresent { it.validate() }
            utteranceEndMs()
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
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                transcriptionModel.let { if (it == JsonValue.from("deepgram/nova-3")) 1 else 0 } +
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (if (utteranceEndMs.asKnown().isPresent) 1 else 0)

        class TranscriptionEngine
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                DEEPGRAM
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM,
                /**
                 * An enum member indicating that [TranscriptionEngine] was instantiated with an
                 * unknown value.
                 */
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
                    DEEPGRAM -> Value.DEEPGRAM
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
                    DEEPGRAM -> Known.DEEPGRAM
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
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

        /**
         * Keywords and their respective intensifiers (boosting values) to improve transcription
         * accuracy for specific words or phrases. The intensifier should be a numeric value.
         * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
         */
        class KeywordsBoosting
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [KeywordsBoosting]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [KeywordsBoosting]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(keywordsBoosting: KeywordsBoosting) = apply {
                    additionalProperties = keywordsBoosting.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [KeywordsBoosting].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): KeywordsBoosting = KeywordsBoosting(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): KeywordsBoosting = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is KeywordsBoosting &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "KeywordsBoosting{additionalProperties=$additionalProperties}"
        }

        /** Language to use for speech recognition with nova-3 model */
        class Language @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val EN_US = of("en-US")

                @JvmField val EN_AU = of("en-AU")

                @JvmField val EN_GB = of("en-GB")

                @JvmField val EN_IN = of("en-IN")

                @JvmField val EN_NZ = of("en-NZ")

                @JvmField val DE = of("de")

                @JvmField val NL = of("nl")

                @JvmField val SV_SE = of("sv-SE")

                @JvmField val DA_DK = of("da-DK")

                @JvmField val ES = of("es")

                @JvmField val ES_419 = of("es-419")

                @JvmField val FR = of("fr")

                @JvmField val FR_CA = of("fr-CA")

                @JvmField val PT_BR = of("pt-BR")

                @JvmField val PT_PT = of("pt-PT")

                @JvmField val AUTO_DETECT = of("auto_detect")

                @JvmStatic fun of(value: String) = Language(JsonField.of(value))
            }

            /** An enum containing [Language]'s known values. */
            enum class Known {
                EN_US,
                EN_AU,
                EN_GB,
                EN_IN,
                EN_NZ,
                DE,
                NL,
                SV_SE,
                DA_DK,
                ES,
                ES_419,
                FR,
                FR_CA,
                PT_BR,
                PT_PT,
                AUTO_DETECT,
            }

            /**
             * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Language] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EN_US,
                EN_AU,
                EN_GB,
                EN_IN,
                EN_NZ,
                DE,
                NL,
                SV_SE,
                DA_DK,
                ES,
                ES_419,
                FR,
                FR_CA,
                PT_BR,
                PT_PT,
                AUTO_DETECT,
                /**
                 * An enum member indicating that [Language] was instantiated with an unknown value.
                 */
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
                    EN_US -> Value.EN_US
                    EN_AU -> Value.EN_AU
                    EN_GB -> Value.EN_GB
                    EN_IN -> Value.EN_IN
                    EN_NZ -> Value.EN_NZ
                    DE -> Value.DE
                    NL -> Value.NL
                    SV_SE -> Value.SV_SE
                    DA_DK -> Value.DA_DK
                    ES -> Value.ES
                    ES_419 -> Value.ES_419
                    FR -> Value.FR
                    FR_CA -> Value.FR_CA
                    PT_BR -> Value.PT_BR
                    PT_PT -> Value.PT_PT
                    AUTO_DETECT -> Value.AUTO_DETECT
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
                    EN_US -> Known.EN_US
                    EN_AU -> Known.EN_AU
                    EN_GB -> Known.EN_GB
                    EN_IN -> Known.EN_IN
                    EN_NZ -> Known.EN_NZ
                    DE -> Known.DE
                    NL -> Known.NL
                    SV_SE -> Known.SV_SE
                    DA_DK -> Known.DA_DK
                    ES -> Known.ES
                    ES_419 -> Known.ES_419
                    FR -> Known.FR
                    FR_CA -> Known.FR_CA
                    PT_BR -> Known.PT_BR
                    PT_PT -> Known.PT_PT
                    AUTO_DETECT -> Known.AUTO_DETECT
                    else -> throw TelnyxInvalidDataException("Unknown Language: $value")
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

            fun validate(): Language = apply {
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

                return other is Language && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeepgramNova3 &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionModel == other.transcriptionModel &&
                interimResults == other.interimResults &&
                keywordsBoosting == other.keywordsBoosting &&
                language == other.language &&
                utteranceEndMs == other.utteranceEndMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                transcriptionEngine,
                transcriptionModel,
                interimResults,
                keywordsBoosting,
                language,
                utteranceEndMs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepgramNova3{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, interimResults=$interimResults, keywordsBoosting=$keywordsBoosting, language=$language, utteranceEndMs=$utteranceEndMs, additionalProperties=$additionalProperties}"
    }
}
