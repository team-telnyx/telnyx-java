// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.allMaxBy
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new voice clone by capturing the voice identity of an existing voice design. The clone
 * can then be used for text-to-speech synthesis.
 */
class VoiceCloneCreateParams
private constructor(
    private val params: Params,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Request body for creating a voice clone from an existing voice design. */
    fun params(): Params = params

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceCloneCreateParams].
         *
         * The following fields are required:
         * ```java
         * .params()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoiceCloneCreateParams]. */
    class Builder internal constructor() {

        private var params: Params? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(voiceCloneCreateParams: VoiceCloneCreateParams) = apply {
            params = voiceCloneCreateParams.params
            additionalHeaders = voiceCloneCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = voiceCloneCreateParams.additionalQueryParams.toBuilder()
        }

        /** Request body for creating a voice clone from an existing voice design. */
        fun params(params: Params) = apply { this.params = params }

        /** Alias for calling [params] with `Params.ofTelnyxDesignClone(telnyxDesignClone)`. */
        fun params(telnyxDesignClone: Params.TelnyxDesignClone) =
            params(Params.ofTelnyxDesignClone(telnyxDesignClone))

        /** Alias for calling [params] with `Params.ofMinimaxDesignClone(minimaxDesignClone)`. */
        fun params(minimaxDesignClone: Params.MinimaxDesignClone) =
            params(Params.ofMinimaxDesignClone(minimaxDesignClone))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [VoiceCloneCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .params()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoiceCloneCreateParams =
            VoiceCloneCreateParams(
                checkRequired("params", params),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Params = params

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for creating a voice clone from an existing voice design. */
    @JsonDeserialize(using = Params.Deserializer::class)
    @JsonSerialize(using = Params.Serializer::class)
    class Params
    private constructor(
        private val telnyxDesignClone: TelnyxDesignClone? = null,
        private val minimaxDesignClone: MinimaxDesignClone? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Create a voice clone from a voice design using the Telnyx provider. */
        fun telnyxDesignClone(): Optional<TelnyxDesignClone> =
            Optional.ofNullable(telnyxDesignClone)

        /** Create a voice clone from a voice design using the Minimax provider. */
        fun minimaxDesignClone(): Optional<MinimaxDesignClone> =
            Optional.ofNullable(minimaxDesignClone)

        fun isTelnyxDesignClone(): Boolean = telnyxDesignClone != null

        fun isMinimaxDesignClone(): Boolean = minimaxDesignClone != null

        /** Create a voice clone from a voice design using the Telnyx provider. */
        fun asTelnyxDesignClone(): TelnyxDesignClone =
            telnyxDesignClone.getOrThrow("telnyxDesignClone")

        /** Create a voice clone from a voice design using the Minimax provider. */
        fun asMinimaxDesignClone(): MinimaxDesignClone =
            minimaxDesignClone.getOrThrow("minimaxDesignClone")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                telnyxDesignClone != null -> visitor.visitTelnyxDesignClone(telnyxDesignClone)
                minimaxDesignClone != null -> visitor.visitMinimaxDesignClone(minimaxDesignClone)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitTelnyxDesignClone(telnyxDesignClone: TelnyxDesignClone) {
                        telnyxDesignClone.validate()
                    }

                    override fun visitMinimaxDesignClone(minimaxDesignClone: MinimaxDesignClone) {
                        minimaxDesignClone.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitTelnyxDesignClone(telnyxDesignClone: TelnyxDesignClone) =
                        telnyxDesignClone.validity()

                    override fun visitMinimaxDesignClone(minimaxDesignClone: MinimaxDesignClone) =
                        minimaxDesignClone.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Params &&
                telnyxDesignClone == other.telnyxDesignClone &&
                minimaxDesignClone == other.minimaxDesignClone
        }

        override fun hashCode(): Int = Objects.hash(telnyxDesignClone, minimaxDesignClone)

        override fun toString(): String =
            when {
                telnyxDesignClone != null -> "Params{telnyxDesignClone=$telnyxDesignClone}"
                minimaxDesignClone != null -> "Params{minimaxDesignClone=$minimaxDesignClone}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
            }

        companion object {

            /** Create a voice clone from a voice design using the Telnyx provider. */
            @JvmStatic
            fun ofTelnyxDesignClone(telnyxDesignClone: TelnyxDesignClone) =
                Params(telnyxDesignClone = telnyxDesignClone)

            /** Create a voice clone from a voice design using the Minimax provider. */
            @JvmStatic
            fun ofMinimaxDesignClone(minimaxDesignClone: MinimaxDesignClone) =
                Params(minimaxDesignClone = minimaxDesignClone)
        }

        /** An interface that defines how to map each variant of [Params] to a value of type [T]. */
        interface Visitor<out T> {

            /** Create a voice clone from a voice design using the Telnyx provider. */
            fun visitTelnyxDesignClone(telnyxDesignClone: TelnyxDesignClone): T

            /** Create a voice clone from a voice design using the Minimax provider. */
            fun visitMinimaxDesignClone(minimaxDesignClone: MinimaxDesignClone): T

            /**
             * Maps an unknown variant of [Params] to a value of type [T].
             *
             * An instance of [Params] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown Params: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Params>(Params::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Params {
                val json = JsonValue.fromJsonNode(node)
                val provider = json.asObject().getOrNull()?.get("provider")?.asString()?.getOrNull()

                when (provider) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<TelnyxDesignClone>())?.let {
                                Params(telnyxDesignClone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MinimaxDesignClone>())?.let {
                                Params(minimaxDesignClone = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Params(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Params>(Params::class) {

            override fun serialize(
                value: Params,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.telnyxDesignClone != null ->
                        generator.writeObject(value.telnyxDesignClone)
                    value.minimaxDesignClone != null ->
                        generator.writeObject(value.minimaxDesignClone)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Params")
                }
            }
        }

        /** Create a voice clone from a voice design using the Telnyx provider. */
        class TelnyxDesignClone
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val gender: JsonField<Gender>,
            private val language: JsonField<String>,
            private val name: JsonField<String>,
            private val voiceDesignId: JsonField<String>,
            private val provider: JsonField<Provider>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("gender")
                @ExcludeMissing
                gender: JsonField<Gender> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("voice_design_id")
                @ExcludeMissing
                voiceDesignId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<Provider> = JsonMissing.of(),
            ) : this(gender, language, name, voiceDesignId, provider, mutableMapOf())

            /**
             * Gender of the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gender(): Gender = gender.getRequired("gender")

            /**
             * ISO 639-1 language code for the clone. Supports the combined Telnyx language set.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun language(): String = language.getRequired("language")

            /**
             * Name for the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * UUID of the source voice design to clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun voiceDesignId(): String = voiceDesignId.getRequired("voice_design_id")

            /**
             * Voice synthesis provider. Defaults to `telnyx`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun provider(): Optional<Provider> = provider.getOptional("provider")

            /**
             * Returns the raw JSON value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [voiceDesignId].
             *
             * Unlike [voiceDesignId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("voice_design_id")
            @ExcludeMissing
            fun _voiceDesignId(): JsonField<String> = voiceDesignId

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): JsonField<Provider> = provider

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
                 * Returns a mutable builder for constructing an instance of [TelnyxDesignClone].
                 *
                 * The following fields are required:
                 * ```java
                 * .gender()
                 * .language()
                 * .name()
                 * .voiceDesignId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TelnyxDesignClone]. */
            class Builder internal constructor() {

                private var gender: JsonField<Gender>? = null
                private var language: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var voiceDesignId: JsonField<String>? = null
                private var provider: JsonField<Provider> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(telnyxDesignClone: TelnyxDesignClone) = apply {
                    gender = telnyxDesignClone.gender
                    language = telnyxDesignClone.language
                    name = telnyxDesignClone.name
                    voiceDesignId = telnyxDesignClone.voiceDesignId
                    provider = telnyxDesignClone.provider
                    additionalProperties = telnyxDesignClone.additionalProperties.toMutableMap()
                }

                /** Gender of the voice clone. */
                fun gender(gender: Gender) = gender(JsonField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

                /**
                 * ISO 639-1 language code for the clone. Supports the combined Telnyx language set.
                 */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

                /** Name for the voice clone. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** UUID of the source voice design to clone. */
                fun voiceDesignId(voiceDesignId: String) =
                    voiceDesignId(JsonField.of(voiceDesignId))

                /**
                 * Sets [Builder.voiceDesignId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voiceDesignId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun voiceDesignId(voiceDesignId: JsonField<String>) = apply {
                    this.voiceDesignId = voiceDesignId
                }

                /** Voice synthesis provider. Defaults to `telnyx`. */
                fun provider(provider: Provider) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
                 * Returns an immutable instance of [TelnyxDesignClone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .gender()
                 * .language()
                 * .name()
                 * .voiceDesignId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TelnyxDesignClone =
                    TelnyxDesignClone(
                        checkRequired("gender", gender),
                        checkRequired("language", language),
                        checkRequired("name", name),
                        checkRequired("voiceDesignId", voiceDesignId),
                        provider,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TelnyxDesignClone = apply {
                if (validated) {
                    return@apply
                }

                gender().validate()
                language()
                name()
                voiceDesignId()
                provider().ifPresent { it.validate() }
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
                (gender.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (language.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (voiceDesignId.asKnown().isPresent) 1 else 0) +
                    (provider.asKnown().getOrNull()?.validity() ?: 0)

            /** Gender of the voice clone. */
            class Gender @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MALE = of("male")

                    @JvmField val FEMALE = of("female")

                    @JvmField val NEUTRAL = of("neutral")

                    @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
                }

                /** An enum containing [Gender]'s known values. */
                enum class Known {
                    MALE,
                    FEMALE,
                    NEUTRAL,
                }

                /**
                 * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Gender] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MALE,
                    FEMALE,
                    NEUTRAL,
                    /**
                     * An enum member indicating that [Gender] was instantiated with an unknown
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
                        MALE -> Value.MALE
                        FEMALE -> Value.FEMALE
                        NEUTRAL -> Value.NEUTRAL
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
                        MALE -> Known.MALE
                        FEMALE -> Known.FEMALE
                        NEUTRAL -> Known.NEUTRAL
                        else -> throw TelnyxInvalidDataException("Unknown Gender: $value")
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

                fun validate(): Gender = apply {
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

                    return other is Gender && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Voice synthesis provider. Defaults to `telnyx`. */
            class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TELNYX = of("telnyx")

                    @JvmField val TELNYX = of("Telnyx")

                    @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                }

                /** An enum containing [Provider]'s known values. */
                enum class Known {
                    TELNYX,
                    TELNYX,
                }

                /**
                 * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Provider] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TELNYX,
                    TELNYX,
                    /**
                     * An enum member indicating that [Provider] was instantiated with an unknown
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
                        TELNYX -> Value.TELNYX
                        TELNYX -> Value.TELNYX
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
                        TELNYX -> Known.TELNYX
                        TELNYX -> Known.TELNYX
                        else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

                fun validate(): Provider = apply {
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

                    return other is Provider && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TelnyxDesignClone &&
                    gender == other.gender &&
                    language == other.language &&
                    name == other.name &&
                    voiceDesignId == other.voiceDesignId &&
                    provider == other.provider &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(gender, language, name, voiceDesignId, provider, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TelnyxDesignClone{gender=$gender, language=$language, name=$name, voiceDesignId=$voiceDesignId, provider=$provider, additionalProperties=$additionalProperties}"
        }

        /** Create a voice clone from a voice design using the Minimax provider. */
        class MinimaxDesignClone
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val gender: JsonField<Gender>,
            private val language: JsonField<String>,
            private val name: JsonField<String>,
            private val provider: JsonField<Provider>,
            private val voiceDesignId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("gender")
                @ExcludeMissing
                gender: JsonField<Gender> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<Provider> = JsonMissing.of(),
                @JsonProperty("voice_design_id")
                @ExcludeMissing
                voiceDesignId: JsonField<String> = JsonMissing.of(),
            ) : this(gender, language, name, provider, voiceDesignId, mutableMapOf())

            /**
             * Gender of the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gender(): Gender = gender.getRequired("gender")

            /**
             * ISO 639-1 language code for the clone. Supports the Minimax language set.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun language(): String = language.getRequired("language")

            /**
             * Name for the voice clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Voice synthesis provider. Must be `minimax`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): Provider = provider.getRequired("provider")

            /**
             * UUID of the source voice design to clone.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun voiceDesignId(): String = voiceDesignId.getRequired("voice_design_id")

            /**
             * Returns the raw JSON value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<Gender> = gender

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): JsonField<Provider> = provider

            /**
             * Returns the raw JSON value of [voiceDesignId].
             *
             * Unlike [voiceDesignId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("voice_design_id")
            @ExcludeMissing
            fun _voiceDesignId(): JsonField<String> = voiceDesignId

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
                 * Returns a mutable builder for constructing an instance of [MinimaxDesignClone].
                 *
                 * The following fields are required:
                 * ```java
                 * .gender()
                 * .language()
                 * .name()
                 * .provider()
                 * .voiceDesignId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MinimaxDesignClone]. */
            class Builder internal constructor() {

                private var gender: JsonField<Gender>? = null
                private var language: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var provider: JsonField<Provider>? = null
                private var voiceDesignId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimaxDesignClone: MinimaxDesignClone) = apply {
                    gender = minimaxDesignClone.gender
                    language = minimaxDesignClone.language
                    name = minimaxDesignClone.name
                    provider = minimaxDesignClone.provider
                    voiceDesignId = minimaxDesignClone.voiceDesignId
                    additionalProperties = minimaxDesignClone.additionalProperties.toMutableMap()
                }

                /** Gender of the voice clone. */
                fun gender(gender: Gender) = gender(JsonField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [Gender] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: JsonField<Gender>) = apply { this.gender = gender }

                /** ISO 639-1 language code for the clone. Supports the Minimax language set. */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

                /** Name for the voice clone. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Voice synthesis provider. Must be `minimax`. */
                fun provider(provider: Provider) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

                /** UUID of the source voice design to clone. */
                fun voiceDesignId(voiceDesignId: String) =
                    voiceDesignId(JsonField.of(voiceDesignId))

                /**
                 * Sets [Builder.voiceDesignId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.voiceDesignId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun voiceDesignId(voiceDesignId: JsonField<String>) = apply {
                    this.voiceDesignId = voiceDesignId
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
                 * Returns an immutable instance of [MinimaxDesignClone].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .gender()
                 * .language()
                 * .name()
                 * .provider()
                 * .voiceDesignId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MinimaxDesignClone =
                    MinimaxDesignClone(
                        checkRequired("gender", gender),
                        checkRequired("language", language),
                        checkRequired("name", name),
                        checkRequired("provider", provider),
                        checkRequired("voiceDesignId", voiceDesignId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MinimaxDesignClone = apply {
                if (validated) {
                    return@apply
                }

                gender().validate()
                language()
                name()
                provider().validate()
                voiceDesignId()
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
                (gender.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (language.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (provider.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (voiceDesignId.asKnown().isPresent) 1 else 0)

            /** Gender of the voice clone. */
            class Gender @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MALE = of("male")

                    @JvmField val FEMALE = of("female")

                    @JvmField val NEUTRAL = of("neutral")

                    @JvmStatic fun of(value: String) = Gender(JsonField.of(value))
                }

                /** An enum containing [Gender]'s known values. */
                enum class Known {
                    MALE,
                    FEMALE,
                    NEUTRAL,
                }

                /**
                 * An enum containing [Gender]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Gender] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MALE,
                    FEMALE,
                    NEUTRAL,
                    /**
                     * An enum member indicating that [Gender] was instantiated with an unknown
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
                        MALE -> Value.MALE
                        FEMALE -> Value.FEMALE
                        NEUTRAL -> Value.NEUTRAL
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
                        MALE -> Known.MALE
                        FEMALE -> Known.FEMALE
                        NEUTRAL -> Known.NEUTRAL
                        else -> throw TelnyxInvalidDataException("Unknown Gender: $value")
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

                fun validate(): Gender = apply {
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

                    return other is Gender && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Voice synthesis provider. Must be `minimax`. */
            class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val MINIMAX = of("minimax")

                    @JvmField val MINIMAX = of("Minimax")

                    @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                }

                /** An enum containing [Provider]'s known values. */
                enum class Known {
                    MINIMAX,
                    MINIMAX,
                }

                /**
                 * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Provider] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MINIMAX,
                    MINIMAX,
                    /**
                     * An enum member indicating that [Provider] was instantiated with an unknown
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
                        MINIMAX -> Value.MINIMAX
                        MINIMAX -> Value.MINIMAX
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
                        MINIMAX -> Known.MINIMAX
                        MINIMAX -> Known.MINIMAX
                        else -> throw TelnyxInvalidDataException("Unknown Provider: $value")
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

                fun validate(): Provider = apply {
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

                    return other is Provider && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MinimaxDesignClone &&
                    gender == other.gender &&
                    language == other.language &&
                    name == other.name &&
                    provider == other.provider &&
                    voiceDesignId == other.voiceDesignId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(gender, language, name, provider, voiceDesignId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MinimaxDesignClone{gender=$gender, language=$language, name=$name, provider=$provider, voiceDesignId=$voiceDesignId, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceCloneCreateParams &&
            params == other.params &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(params, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VoiceCloneCreateParams{params=$params, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
