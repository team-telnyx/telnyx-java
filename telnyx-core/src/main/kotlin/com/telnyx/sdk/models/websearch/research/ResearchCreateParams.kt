// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Starts a deep research task that runs multiple searches, reads sources, and synthesizes an answer
 * with citations.
 *
 * ## Synchronous mode (default)
 *
 * When `background` is `false` or omitted, the request blocks until the research completes and
 * returns the answer with citations. This can take up to 120 seconds depending on
 * `research_effort`.
 *
 * ## Asynchronous mode
 *
 * When `background` is `true`, the request returns immediately with a `task_id` and `status:
 * pending`. Poll `GET /web_search/research/{task_id}` to check when the research completes and
 * retrieve the answer.
 */
class ResearchCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The research question or topic.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * When `true`, the research runs asynchronously. The response returns a `task_id` immediately
     * instead of waiting for the result. Poll `GET /web_search/research/{task_id}` to check status.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun background(): Optional<Boolean> = body.background()

    /**
     * Maximum number of sources to use.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxSources(): Optional<Long> = body.maxSources()

    /**
     * Research depth level. `lite` is fastest, `deep` is most thorough.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun researchEffort(): Optional<ResearchEffort> = body.researchEffort()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [background].
     *
     * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _background(): JsonField<Boolean> = body._background()

    /**
     * Returns the raw JSON value of [maxSources].
     *
     * Unlike [maxSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxSources(): JsonField<Long> = body._maxSources()

    /**
     * Returns the raw JSON value of [researchEffort].
     *
     * Unlike [researchEffort], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _researchEffort(): JsonField<ResearchEffort> = body._researchEffort()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResearchCreateParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResearchCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(researchCreateParams: ResearchCreateParams) = apply {
            body = researchCreateParams.body.toBuilder()
            additionalHeaders = researchCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = researchCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         * - [background]
         * - [maxSources]
         * - [researchEffort]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The research question or topic. */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /**
         * When `true`, the research runs asynchronously. The response returns a `task_id`
         * immediately instead of waiting for the result. Poll `GET /web_search/research/{task_id}`
         * to check status.
         */
        fun background(background: Boolean) = apply { body.background(background) }

        /**
         * Sets [Builder.background] to an arbitrary JSON value.
         *
         * You should usually call [Builder.background] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun background(background: JsonField<Boolean>) = apply { body.background(background) }

        /** Maximum number of sources to use. */
        fun maxSources(maxSources: Long) = apply { body.maxSources(maxSources) }

        /**
         * Sets [Builder.maxSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSources] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxSources(maxSources: JsonField<Long>) = apply { body.maxSources(maxSources) }

        /** Research depth level. `lite` is fastest, `deep` is most thorough. */
        fun researchEffort(researchEffort: ResearchEffort) = apply {
            body.researchEffort(researchEffort)
        }

        /**
         * Sets [Builder.researchEffort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.researchEffort] with a well-typed [ResearchEffort] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun researchEffort(researchEffort: JsonField<ResearchEffort>) = apply {
            body.researchEffort(researchEffort)
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
         * Returns an immutable instance of [ResearchCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResearchCreateParams =
            ResearchCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val query: JsonField<String>,
        private val background: JsonField<Boolean>,
        private val maxSources: JsonField<Long>,
        private val researchEffort: JsonField<ResearchEffort>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("background")
            @ExcludeMissing
            background: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_sources")
            @ExcludeMissing
            maxSources: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("research_effort")
            @ExcludeMissing
            researchEffort: JsonField<ResearchEffort> = JsonMissing.of(),
        ) : this(query, background, maxSources, researchEffort, mutableMapOf())

        /**
         * The research question or topic.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * When `true`, the research runs asynchronously. The response returns a `task_id`
         * immediately instead of waiting for the result. Poll `GET /web_search/research/{task_id}`
         * to check status.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun background(): Optional<Boolean> = background.getOptional("background")

        /**
         * Maximum number of sources to use.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxSources(): Optional<Long> = maxSources.getOptional("max_sources")

        /**
         * Research depth level. `lite` is fastest, `deep` is most thorough.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun researchEffort(): Optional<ResearchEffort> =
            researchEffort.getOptional("research_effort")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [background].
         *
         * Unlike [background], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("background")
        @ExcludeMissing
        fun _background(): JsonField<Boolean> = background

        /**
         * Returns the raw JSON value of [maxSources].
         *
         * Unlike [maxSources], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_sources") @ExcludeMissing fun _maxSources(): JsonField<Long> = maxSources

        /**
         * Returns the raw JSON value of [researchEffort].
         *
         * Unlike [researchEffort], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("research_effort")
        @ExcludeMissing
        fun _researchEffort(): JsonField<ResearchEffort> = researchEffort

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .query()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var query: JsonField<String>? = null
            private var background: JsonField<Boolean> = JsonMissing.of()
            private var maxSources: JsonField<Long> = JsonMissing.of()
            private var researchEffort: JsonField<ResearchEffort> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                background = body.background
                maxSources = body.maxSources
                researchEffort = body.researchEffort
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The research question or topic. */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /**
             * When `true`, the research runs asynchronously. The response returns a `task_id`
             * immediately instead of waiting for the result. Poll `GET
             * /web_search/research/{task_id}` to check status.
             */
            fun background(background: Boolean) = background(JsonField.of(background))

            /**
             * Sets [Builder.background] to an arbitrary JSON value.
             *
             * You should usually call [Builder.background] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun background(background: JsonField<Boolean>) = apply { this.background = background }

            /** Maximum number of sources to use. */
            fun maxSources(maxSources: Long) = maxSources(JsonField.of(maxSources))

            /**
             * Sets [Builder.maxSources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSources] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSources(maxSources: JsonField<Long>) = apply { this.maxSources = maxSources }

            /** Research depth level. `lite` is fastest, `deep` is most thorough. */
            fun researchEffort(researchEffort: ResearchEffort) =
                researchEffort(JsonField.of(researchEffort))

            /**
             * Sets [Builder.researchEffort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.researchEffort] with a well-typed [ResearchEffort]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun researchEffort(researchEffort: JsonField<ResearchEffort>) = apply {
                this.researchEffort = researchEffort
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
             *
             * The following fields are required:
             * ```java
             * .query()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("query", query),
                    background,
                    maxSources,
                    researchEffort,
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

            query()
            background()
            maxSources()
            researchEffort().ifPresent { it.validate() }
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
            (if (query.asKnown().isPresent) 1 else 0) +
                (if (background.asKnown().isPresent) 1 else 0) +
                (if (maxSources.asKnown().isPresent) 1 else 0) +
                (researchEffort.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                background == other.background &&
                maxSources == other.maxSources &&
                researchEffort == other.researchEffort &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(query, background, maxSources, researchEffort, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, background=$background, maxSources=$maxSources, researchEffort=$researchEffort, additionalProperties=$additionalProperties}"
    }

    /** Research depth level. `lite` is fastest, `deep` is most thorough. */
    class ResearchEffort @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val LITE = of("lite")

            @JvmField val STANDARD = of("standard")

            @JvmField val DEEP = of("deep")

            @JvmStatic fun of(value: String) = ResearchEffort(JsonField.of(value))
        }

        /** An enum containing [ResearchEffort]'s known values. */
        enum class Known {
            LITE,
            STANDARD,
            DEEP,
        }

        /**
         * An enum containing [ResearchEffort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResearchEffort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LITE,
            STANDARD,
            DEEP,
            /**
             * An enum member indicating that [ResearchEffort] was instantiated with an unknown
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
                LITE -> Value.LITE
                STANDARD -> Value.STANDARD
                DEEP -> Value.DEEP
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
                LITE -> Known.LITE
                STANDARD -> Known.STANDARD
                DEEP -> Known.DEEP
                else -> throw TelnyxInvalidDataException("Unknown ResearchEffort: $value")
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
        fun validate(): ResearchEffort = apply {
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

            return other is ResearchEffort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResearchCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ResearchCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
