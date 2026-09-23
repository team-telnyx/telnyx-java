// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botchallenge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Generates a reverse-CAPTCHA challenge used to gate the bot signup flow. A random active problem
 * is selected from the pool; math problems are returned obfuscated (case randomization, symbol
 * injection, spacing noise) with an unobfuscated rounding instruction appended, while string and
 * binary problems are returned as-is. The response contains a single-use nonce, the problem text,
 * and the current terms-and-conditions and privacy-policy URLs, which must be echoed back on the
 * signup request. Challenges expire after a short window (10 minutes by default) and can only be
 * answered once. This endpoint is public and unauthenticated.
 */
class BotChallengeCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Name of the LLM the client is using.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmModelName(): Optional<String> = body.llmModelName()

    /**
     * Parameter count of the client LLM.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmParameterCount(): Optional<String> = body.llmParameterCount()

    /**
     * Quantization of the client LLM.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmQuantization(): Optional<String> = body.llmQuantization()

    /**
     * Returns the raw JSON value of [llmModelName].
     *
     * Unlike [llmModelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmModelName(): JsonField<String> = body._llmModelName()

    /**
     * Returns the raw JSON value of [llmParameterCount].
     *
     * Unlike [llmParameterCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _llmParameterCount(): JsonField<String> = body._llmParameterCount()

    /**
     * Returns the raw JSON value of [llmQuantization].
     *
     * Unlike [llmQuantization], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _llmQuantization(): JsonField<String> = body._llmQuantization()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BotChallengeCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BotChallengeCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BotChallengeCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(botChallengeCreateParams: BotChallengeCreateParams) = apply {
            body = botChallengeCreateParams.body.toBuilder()
            additionalHeaders = botChallengeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = botChallengeCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [llmModelName]
         * - [llmParameterCount]
         * - [llmQuantization]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Name of the LLM the client is using. */
        fun llmModelName(llmModelName: String) = apply { body.llmModelName(llmModelName) }

        /**
         * Sets [Builder.llmModelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmModelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun llmModelName(llmModelName: JsonField<String>) = apply {
            body.llmModelName(llmModelName)
        }

        /** Parameter count of the client LLM. */
        fun llmParameterCount(llmParameterCount: String) = apply {
            body.llmParameterCount(llmParameterCount)
        }

        /**
         * Sets [Builder.llmParameterCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmParameterCount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmParameterCount(llmParameterCount: JsonField<String>) = apply {
            body.llmParameterCount(llmParameterCount)
        }

        /** Quantization of the client LLM. */
        fun llmQuantization(llmQuantization: String) = apply {
            body.llmQuantization(llmQuantization)
        }

        /**
         * Sets [Builder.llmQuantization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmQuantization] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun llmQuantization(llmQuantization: JsonField<String>) = apply {
            body.llmQuantization(llmQuantization)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [BotChallengeCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BotChallengeCreateParams =
            BotChallengeCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Optional self-reported metadata about the LLM solving the challenge. Analytics only; values
     * are truncated to 50 characters.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val llmModelName: JsonField<String>,
        private val llmParameterCount: JsonField<String>,
        private val llmQuantization: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("llm_model_name")
            @ExcludeMissing
            llmModelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_parameter_count")
            @ExcludeMissing
            llmParameterCount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("llm_quantization")
            @ExcludeMissing
            llmQuantization: JsonField<String> = JsonMissing.of(),
        ) : this(llmModelName, llmParameterCount, llmQuantization, mutableMapOf())

        /**
         * Name of the LLM the client is using.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmModelName(): Optional<String> = llmModelName.getOptional("llm_model_name")

        /**
         * Parameter count of the client LLM.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmParameterCount(): Optional<String> =
            llmParameterCount.getOptional("llm_parameter_count")

        /**
         * Quantization of the client LLM.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun llmQuantization(): Optional<String> = llmQuantization.getOptional("llm_quantization")

        /**
         * Returns the raw JSON value of [llmModelName].
         *
         * Unlike [llmModelName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_model_name")
        @ExcludeMissing
        fun _llmModelName(): JsonField<String> = llmModelName

        /**
         * Returns the raw JSON value of [llmParameterCount].
         *
         * Unlike [llmParameterCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_parameter_count")
        @ExcludeMissing
        fun _llmParameterCount(): JsonField<String> = llmParameterCount

        /**
         * Returns the raw JSON value of [llmQuantization].
         *
         * Unlike [llmQuantization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("llm_quantization")
        @ExcludeMissing
        fun _llmQuantization(): JsonField<String> = llmQuantization

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var llmModelName: JsonField<String> = JsonMissing.of()
            private var llmParameterCount: JsonField<String> = JsonMissing.of()
            private var llmQuantization: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                llmModelName = body.llmModelName
                llmParameterCount = body.llmParameterCount
                llmQuantization = body.llmQuantization
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the LLM the client is using. */
            fun llmModelName(llmModelName: String) = llmModelName(JsonField.of(llmModelName))

            /**
             * Sets [Builder.llmModelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmModelName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmModelName(llmModelName: JsonField<String>) = apply {
                this.llmModelName = llmModelName
            }

            /** Parameter count of the client LLM. */
            fun llmParameterCount(llmParameterCount: String) =
                llmParameterCount(JsonField.of(llmParameterCount))

            /**
             * Sets [Builder.llmParameterCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmParameterCount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmParameterCount(llmParameterCount: JsonField<String>) = apply {
                this.llmParameterCount = llmParameterCount
            }

            /** Quantization of the client LLM. */
            fun llmQuantization(llmQuantization: String) =
                llmQuantization(JsonField.of(llmQuantization))

            /**
             * Sets [Builder.llmQuantization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.llmQuantization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun llmQuantization(llmQuantization: JsonField<String>) = apply {
                this.llmQuantization = llmQuantization
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    llmModelName,
                    llmParameterCount,
                    llmQuantization,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            llmModelName()
            llmParameterCount()
            llmQuantization()
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
            (if (llmModelName.asKnown().isPresent) 1 else 0) +
                (if (llmParameterCount.asKnown().isPresent) 1 else 0) +
                (if (llmQuantization.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                llmModelName == other.llmModelName &&
                llmParameterCount == other.llmParameterCount &&
                llmQuantization == other.llmQuantization &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(llmModelName, llmParameterCount, llmQuantization, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{llmModelName=$llmModelName, llmParameterCount=$llmParameterCount, llmQuantization=$llmQuantization, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BotChallengeCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BotChallengeCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
