// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Performs a real-time web search and returns structured, LLM-ready JSON results with titles, URLs,
 * descriptions, and snippets. Supports filtering by domain, country, safe search, freshness, and
 * live crawl.
 *
 * **Note:** `include_domains` and `exclude_domains` cannot be used in the same request. Use one or
 * the other.
 */
class WebSearchCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The search query text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * Number of results to return (1-100).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = body.count()

    /**
     * Two-letter country code (ISO 3166-1 alpha-2) to bias results.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = body.country()

    /**
     * Exclude results from these domains (bare hostnames, e.g. `pinterest.com`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeDomains(): Optional<List<String>> = body.excludeDomains()

    /**
     * Time-based filter for results. Common values: `day`, `week`, `month`, `year`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun freshness(): Optional<String> = body.freshness()

    /**
     * Restrict results to these domains (bare hostnames, e.g. `arxiv.org`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeDomains(): Optional<List<String>> = body.includeDomains()

    /**
     * When true, the provider crawls pages in real-time for fresh content. The boolean is
     * translated to the provider's internal enum internally; callers always pass `true` or `false`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun livecrawl(): Optional<Boolean> = body.livecrawl()

    /**
     * Safe search filter level.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun safesearch(): Optional<Safesearch> = body.safesearch()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _count(): JsonField<Long> = body._count()

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _country(): JsonField<String> = body._country()

    /**
     * Returns the raw JSON value of [excludeDomains].
     *
     * Unlike [excludeDomains], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _excludeDomains(): JsonField<List<String>> = body._excludeDomains()

    /**
     * Returns the raw JSON value of [freshness].
     *
     * Unlike [freshness], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _freshness(): JsonField<String> = body._freshness()

    /**
     * Returns the raw JSON value of [includeDomains].
     *
     * Unlike [includeDomains], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeDomains(): JsonField<List<String>> = body._includeDomains()

    /**
     * Returns the raw JSON value of [livecrawl].
     *
     * Unlike [livecrawl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _livecrawl(): JsonField<Boolean> = body._livecrawl()

    /**
     * Returns the raw JSON value of [safesearch].
     *
     * Unlike [safesearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _safesearch(): JsonField<Safesearch> = body._safesearch()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebSearchCreateParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebSearchCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webSearchCreateParams: WebSearchCreateParams) = apply {
            body = webSearchCreateParams.body.toBuilder()
            additionalHeaders = webSearchCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = webSearchCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         * - [count]
         * - [country]
         * - [excludeDomains]
         * - [freshness]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The search query text. */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Number of results to return (1-100). */
        fun count(count: Long) = apply { body.count(count) }

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { body.count(count) }

        /** Two-letter country code (ISO 3166-1 alpha-2) to bias results. */
        fun country(country: String) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { body.country(country) }

        /** Exclude results from these domains (bare hostnames, e.g. `pinterest.com`). */
        fun excludeDomains(excludeDomains: List<String>) = apply {
            body.excludeDomains(excludeDomains)
        }

        /**
         * Sets [Builder.excludeDomains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeDomains] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeDomains(excludeDomains: JsonField<List<String>>) = apply {
            body.excludeDomains(excludeDomains)
        }

        /**
         * Adds a single [String] to [excludeDomains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludeDomain(excludeDomain: String) = apply { body.addExcludeDomain(excludeDomain) }

        /** Time-based filter for results. Common values: `day`, `week`, `month`, `year`. */
        fun freshness(freshness: String) = apply { body.freshness(freshness) }

        /**
         * Sets [Builder.freshness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.freshness] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun freshness(freshness: JsonField<String>) = apply { body.freshness(freshness) }

        /** Restrict results to these domains (bare hostnames, e.g. `arxiv.org`). */
        fun includeDomains(includeDomains: List<String>) = apply {
            body.includeDomains(includeDomains)
        }

        /**
         * Sets [Builder.includeDomains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeDomains] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeDomains(includeDomains: JsonField<List<String>>) = apply {
            body.includeDomains(includeDomains)
        }

        /**
         * Adds a single [String] to [includeDomains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludeDomain(includeDomain: String) = apply { body.addIncludeDomain(includeDomain) }

        /**
         * When true, the provider crawls pages in real-time for fresh content. The boolean is
         * translated to the provider's internal enum internally; callers always pass `true` or
         * `false`.
         */
        fun livecrawl(livecrawl: Boolean) = apply { body.livecrawl(livecrawl) }

        /**
         * Sets [Builder.livecrawl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.livecrawl] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun livecrawl(livecrawl: JsonField<Boolean>) = apply { body.livecrawl(livecrawl) }

        /** Safe search filter level. */
        fun safesearch(safesearch: Safesearch) = apply { body.safesearch(safesearch) }

        /**
         * Sets [Builder.safesearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.safesearch] with a well-typed [Safesearch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun safesearch(safesearch: JsonField<Safesearch>) = apply { body.safesearch(safesearch) }

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
         * Returns an immutable instance of [WebSearchCreateParams].
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
        fun build(): WebSearchCreateParams =
            WebSearchCreateParams(
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
        private val count: JsonField<Long>,
        private val country: JsonField<String>,
        private val excludeDomains: JsonField<List<String>>,
        private val freshness: JsonField<String>,
        private val includeDomains: JsonField<List<String>>,
        private val livecrawl: JsonField<Boolean>,
        private val safesearch: JsonField<Safesearch>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exclude_domains")
            @ExcludeMissing
            excludeDomains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("freshness")
            @ExcludeMissing
            freshness: JsonField<String> = JsonMissing.of(),
            @JsonProperty("include_domains")
            @ExcludeMissing
            includeDomains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("livecrawl")
            @ExcludeMissing
            livecrawl: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("safesearch")
            @ExcludeMissing
            safesearch: JsonField<Safesearch> = JsonMissing.of(),
        ) : this(
            query,
            count,
            country,
            excludeDomains,
            freshness,
            includeDomains,
            livecrawl,
            safesearch,
            mutableMapOf(),
        )

        /**
         * The search query text.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * Number of results to return (1-100).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun count(): Optional<Long> = count.getOptional("count")

        /**
         * Two-letter country code (ISO 3166-1 alpha-2) to bias results.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Exclude results from these domains (bare hostnames, e.g. `pinterest.com`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excludeDomains(): Optional<List<String>> = excludeDomains.getOptional("exclude_domains")

        /**
         * Time-based filter for results. Common values: `day`, `week`, `month`, `year`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun freshness(): Optional<String> = freshness.getOptional("freshness")

        /**
         * Restrict results to these domains (bare hostnames, e.g. `arxiv.org`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeDomains(): Optional<List<String>> = includeDomains.getOptional("include_domains")

        /**
         * When true, the provider crawls pages in real-time for fresh content. The boolean is
         * translated to the provider's internal enum internally; callers always pass `true` or
         * `false`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun livecrawl(): Optional<Boolean> = livecrawl.getOptional("livecrawl")

        /**
         * Safe search filter level.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun safesearch(): Optional<Safesearch> = safesearch.getOptional("safesearch")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [excludeDomains].
         *
         * Unlike [excludeDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclude_domains")
        @ExcludeMissing
        fun _excludeDomains(): JsonField<List<String>> = excludeDomains

        /**
         * Returns the raw JSON value of [freshness].
         *
         * Unlike [freshness], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freshness") @ExcludeMissing fun _freshness(): JsonField<String> = freshness

        /**
         * Returns the raw JSON value of [includeDomains].
         *
         * Unlike [includeDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_domains")
        @ExcludeMissing
        fun _includeDomains(): JsonField<List<String>> = includeDomains

        /**
         * Returns the raw JSON value of [livecrawl].
         *
         * Unlike [livecrawl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("livecrawl") @ExcludeMissing fun _livecrawl(): JsonField<Boolean> = livecrawl

        /**
         * Returns the raw JSON value of [safesearch].
         *
         * Unlike [safesearch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("safesearch")
        @ExcludeMissing
        fun _safesearch(): JsonField<Safesearch> = safesearch

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
            private var count: JsonField<Long> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var excludeDomains: JsonField<MutableList<String>>? = null
            private var freshness: JsonField<String> = JsonMissing.of()
            private var includeDomains: JsonField<MutableList<String>>? = null
            private var livecrawl: JsonField<Boolean> = JsonMissing.of()
            private var safesearch: JsonField<Safesearch> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                count = body.count
                country = body.country
                excludeDomains = body.excludeDomains.map { it.toMutableList() }
                freshness = body.freshness
                includeDomains = body.includeDomains.map { it.toMutableList() }
                livecrawl = body.livecrawl
                safesearch = body.safesearch
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The search query text. */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Number of results to return (1-100). */
            fun count(count: Long) = count(JsonField.of(count))

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun count(count: JsonField<Long>) = apply { this.count = count }

            /** Two-letter country code (ISO 3166-1 alpha-2) to bias results. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Exclude results from these domains (bare hostnames, e.g. `pinterest.com`). */
            fun excludeDomains(excludeDomains: List<String>) =
                excludeDomains(JsonField.of(excludeDomains))

            /**
             * Sets [Builder.excludeDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun excludeDomains(excludeDomains: JsonField<List<String>>) = apply {
                this.excludeDomains = excludeDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [excludeDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExcludeDomain(excludeDomain: String) = apply {
                excludeDomains =
                    (excludeDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("excludeDomains", it).add(excludeDomain)
                    }
            }

            /** Time-based filter for results. Common values: `day`, `week`, `month`, `year`. */
            fun freshness(freshness: String) = freshness(JsonField.of(freshness))

            /**
             * Sets [Builder.freshness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freshness] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freshness(freshness: JsonField<String>) = apply { this.freshness = freshness }

            /** Restrict results to these domains (bare hostnames, e.g. `arxiv.org`). */
            fun includeDomains(includeDomains: List<String>) =
                includeDomains(JsonField.of(includeDomains))

            /**
             * Sets [Builder.includeDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeDomains(includeDomains: JsonField<List<String>>) = apply {
                this.includeDomains = includeDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [includeDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIncludeDomain(includeDomain: String) = apply {
                includeDomains =
                    (includeDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includeDomains", it).add(includeDomain)
                    }
            }

            /**
             * When true, the provider crawls pages in real-time for fresh content. The boolean is
             * translated to the provider's internal enum internally; callers always pass `true` or
             * `false`.
             */
            fun livecrawl(livecrawl: Boolean) = livecrawl(JsonField.of(livecrawl))

            /**
             * Sets [Builder.livecrawl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.livecrawl] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun livecrawl(livecrawl: JsonField<Boolean>) = apply { this.livecrawl = livecrawl }

            /** Safe search filter level. */
            fun safesearch(safesearch: Safesearch) = safesearch(JsonField.of(safesearch))

            /**
             * Sets [Builder.safesearch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.safesearch] with a well-typed [Safesearch] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun safesearch(safesearch: JsonField<Safesearch>) = apply {
                this.safesearch = safesearch
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
                    count,
                    country,
                    (excludeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    freshness,
                    (includeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    livecrawl,
                    safesearch,
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
            count()
            country()
            excludeDomains()
            freshness()
            includeDomains()
            livecrawl()
            safesearch().ifPresent { it.validate() }
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
                (if (count.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (excludeDomains.asKnown().getOrNull()?.size ?: 0) +
                (if (freshness.asKnown().isPresent) 1 else 0) +
                (includeDomains.asKnown().getOrNull()?.size ?: 0) +
                (if (livecrawl.asKnown().isPresent) 1 else 0) +
                (safesearch.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                count == other.count &&
                country == other.country &&
                excludeDomains == other.excludeDomains &&
                freshness == other.freshness &&
                includeDomains == other.includeDomains &&
                livecrawl == other.livecrawl &&
                safesearch == other.safesearch &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                query,
                count,
                country,
                excludeDomains,
                freshness,
                includeDomains,
                livecrawl,
                safesearch,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, count=$count, country=$country, excludeDomains=$excludeDomains, freshness=$freshness, includeDomains=$includeDomains, livecrawl=$livecrawl, safesearch=$safesearch, additionalProperties=$additionalProperties}"
    }

    /** Safe search filter level. */
    class Safesearch @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OFF = of("off")

            @JvmField val MODERATE = of("moderate")

            @JvmField val STRICT = of("strict")

            @JvmStatic fun of(value: String) = Safesearch(JsonField.of(value))
        }

        /** An enum containing [Safesearch]'s known values. */
        enum class Known {
            OFF,
            MODERATE,
            STRICT,
        }

        /**
         * An enum containing [Safesearch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Safesearch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OFF,
            MODERATE,
            STRICT,
            /**
             * An enum member indicating that [Safesearch] was instantiated with an unknown value.
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
                OFF -> Value.OFF
                MODERATE -> Value.MODERATE
                STRICT -> Value.STRICT
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
                OFF -> Known.OFF
                MODERATE -> Known.MODERATE
                STRICT -> Known.STRICT
                else -> throw TelnyxInvalidDataException("Unknown Safesearch: $value")
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
        fun validate(): Safesearch = apply {
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

            return other is Safesearch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebSearchCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebSearchCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
