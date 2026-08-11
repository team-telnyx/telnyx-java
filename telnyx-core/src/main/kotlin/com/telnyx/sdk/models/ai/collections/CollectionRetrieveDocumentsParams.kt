// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Runs search over the documents in a collection, ranked by relevance to `query`. The collection's
 * `retrieval_type` setting selects the strategy: `vector` (semantic similarity), `hybrid` (vector
 * similarity fused with keyword matching), or `keyword` (lexical BM25 matching). When `query` is
 * omitted, returns a plain catalog listing of the collection's documents.
 *
 * **How it works:**
 * 1. For `vector` and `hybrid`, the `query` text is embedded into a 1024-dimensional vector using
 *    the multilingual-e5-large model.
 * 2. For `vector`, the embedding is compared against the collection's indexed document chunks using
 *    semantic similarity; for `hybrid`, those similarity scores are fused with keyword-match
 *    scores; for `keyword`, only lexical BM25 matching is applied.
 * 3. Results are ranked by `score` (descending) and paginated via `page[number]` / `page[size]`.
 *
 * **Authentication:** Requires a Telnyx API key via `Authorization: Bearer <key>`. Results are
 * automatically scoped to your organization and cannot be overridden.
 *
 * **Filtering:** Use `filter[field][operator]=value` query parameters to narrow results before
 * search. Supported operators: `eq` (default), `in`, `gte`, `gt`, `lte`, `lt`, `contains`. Metadata
 * fields resolve to `metadata.<field>`.
 *
 * **Examples:**
 * - `GET /v2/ai/collections/my-collection/documents?query=billing+issue&top_k=10`
 * - `GET /v2/ai/collections/my-collection/documents?query=refund&sources=voice,message`
 * - `GET
 *   /v2/ai/collections/my-collection/documents?query=outage&filter[record_created_at][gte]=2026-01-01T00:00:00Z`
 */
class CollectionRetrieveDocumentsParams
private constructor(
    private val slug: String?,
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val query: String?,
    private val retrievalType: RetrievalType?,
    private val sources: String?,
    private val topK: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun slug(): Optional<String> = Optional.ofNullable(slug)

    /**
     * Field filters applied before ranking, using `filter[field][operator]=value`. Supported
     * operators: `eq` (default), `in`, `gte`, `gt`, `lte`, `lt`, `contains`. Known fields:
     * `record_type`, `record_id`, `user_id`, `record_created_at`, `ingested_at`; any other name
     * resolves to a `metadata.<field>` filter. Example: `filter[record_id][eq]=rec_123`.
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Page number to return (1-based). Defaults to 1. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Number of results per page. Defaults to 20. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Natural-language search query. When provided, the text is matched against the collection's
     * document chunks using the collection's `retrieval_type` (vector or hybrid). When omitted,
     * documents are returned as a plain catalog listing.
     */
    fun query(): Optional<String> = Optional.ofNullable(query)

    /**
     * Override the collection's configured retrieval strategy for this request. Echoed back in
     * `meta.retrieval_type`.
     */
    fun retrievalType(): Optional<RetrievalType> = Optional.ofNullable(retrievalType)

    /**
     * Comma-separated list of source types to restrict the search to. When omitted, all of the
     * collection's sources are searched.
     */
    fun sources(): Optional<String> = Optional.ofNullable(sources)

    /**
     * Maximum number of ranked results to consider. When omitted, the collection's configured
     * `top_k` setting is used.
     */
    fun topK(): Optional<Long> = Optional.ofNullable(topK)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CollectionRetrieveDocumentsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CollectionRetrieveDocumentsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectionRetrieveDocumentsParams]. */
    class Builder internal constructor() {

        private var slug: String? = null
        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var query: String? = null
        private var retrievalType: RetrievalType? = null
        private var sources: String? = null
        private var topK: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(collectionRetrieveDocumentsParams: CollectionRetrieveDocumentsParams) =
            apply {
                slug = collectionRetrieveDocumentsParams.slug
                filter = collectionRetrieveDocumentsParams.filter
                pageNumber = collectionRetrieveDocumentsParams.pageNumber
                pageSize = collectionRetrieveDocumentsParams.pageSize
                query = collectionRetrieveDocumentsParams.query
                retrievalType = collectionRetrieveDocumentsParams.retrievalType
                sources = collectionRetrieveDocumentsParams.sources
                topK = collectionRetrieveDocumentsParams.topK
                additionalHeaders = collectionRetrieveDocumentsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    collectionRetrieveDocumentsParams.additionalQueryParams.toBuilder()
            }

        fun slug(slug: String?) = apply { this.slug = slug }

        /** Alias for calling [Builder.slug] with `slug.orElse(null)`. */
        fun slug(slug: Optional<String>) = slug(slug.getOrNull())

        /**
         * Field filters applied before ranking, using `filter[field][operator]=value`. Supported
         * operators: `eq` (default), `in`, `gte`, `gt`, `lte`, `lt`, `contains`. Known fields:
         * `record_type`, `record_id`, `user_id`, `record_created_at`, `ingested_at`; any other name
         * resolves to a `metadata.<field>` filter. Example: `filter[record_id][eq]=rec_123`.
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Page number to return (1-based). Defaults to 1. */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** Number of results per page. Defaults to 20. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Natural-language search query. When provided, the text is matched against the
         * collection's document chunks using the collection's `retrieval_type` (vector or hybrid).
         * When omitted, documents are returned as a plain catalog listing.
         */
        fun query(query: String?) = apply { this.query = query }

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

        /**
         * Override the collection's configured retrieval strategy for this request. Echoed back in
         * `meta.retrieval_type`.
         */
        fun retrievalType(retrievalType: RetrievalType?) = apply {
            this.retrievalType = retrievalType
        }

        /** Alias for calling [Builder.retrievalType] with `retrievalType.orElse(null)`. */
        fun retrievalType(retrievalType: Optional<RetrievalType>) =
            retrievalType(retrievalType.getOrNull())

        /**
         * Comma-separated list of source types to restrict the search to. When omitted, all of the
         * collection's sources are searched.
         */
        fun sources(sources: String?) = apply { this.sources = sources }

        /** Alias for calling [Builder.sources] with `sources.orElse(null)`. */
        fun sources(sources: Optional<String>) = sources(sources.getOrNull())

        /**
         * Maximum number of ranked results to consider. When omitted, the collection's configured
         * `top_k` setting is used.
         */
        fun topK(topK: Long?) = apply { this.topK = topK }

        /**
         * Alias for [Builder.topK].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun topK(topK: Long) = topK(topK as Long?)

        /** Alias for calling [Builder.topK] with `topK.orElse(null)`. */
        fun topK(topK: Optional<Long>) = topK(topK.getOrNull())

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
         * Returns an immutable instance of [CollectionRetrieveDocumentsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CollectionRetrieveDocumentsParams =
            CollectionRetrieveDocumentsParams(
                slug,
                filter,
                pageNumber,
                pageSize,
                query,
                retrievalType,
                sources,
                topK,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> slug ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                query?.let { put("query", it) }
                retrievalType?.let { put("retrieval_type", it.toString()) }
                sources?.let { put("sources", it) }
                topK?.let { put("top_k", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Field filters applied before ranking, using `filter[field][operator]=value`. Supported
     * operators: `eq` (default), `in`, `gte`, `gt`, `lte`, `lt`, `contains`. Known fields:
     * `record_type`, `record_id`, `user_id`, `record_created_at`, `ingested_at`; any other name
     * resolves to a `metadata.<field>` filter. Example: `filter[record_id][eq]=rec_123`.
     */
    class Filter private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter = Filter(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filter{additionalProperties=$additionalProperties}"
    }

    /**
     * Override the collection's configured retrieval strategy for this request. Echoed back in
     * `meta.retrieval_type`.
     */
    class RetrievalType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val VECTOR = of("vector")

            @JvmField val HYBRID = of("hybrid")

            @JvmField val KEYWORD = of("keyword")

            @JvmStatic fun of(value: String) = RetrievalType(JsonField.of(value))
        }

        /** An enum containing [RetrievalType]'s known values. */
        enum class Known {
            VECTOR,
            HYBRID,
            KEYWORD,
        }

        /**
         * An enum containing [RetrievalType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RetrievalType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VECTOR,
            HYBRID,
            KEYWORD,
            /**
             * An enum member indicating that [RetrievalType] was instantiated with an unknown
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
                VECTOR -> Value.VECTOR
                HYBRID -> Value.HYBRID
                KEYWORD -> Value.KEYWORD
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
                VECTOR -> Known.VECTOR
                HYBRID -> Known.HYBRID
                KEYWORD -> Known.KEYWORD
                else -> throw TelnyxInvalidDataException("Unknown RetrievalType: $value")
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
        fun validate(): RetrievalType = apply {
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

            return other is RetrievalType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionRetrieveDocumentsParams &&
            slug == other.slug &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            query == other.query &&
            retrievalType == other.retrievalType &&
            sources == other.sources &&
            topK == other.topK &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            slug,
            filter,
            pageNumber,
            pageSize,
            query,
            retrievalType,
            sources,
            topK,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CollectionRetrieveDocumentsParams{slug=$slug, filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, query=$query, retrievalType=$retrievalType, sources=$sources, topK=$topK, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
