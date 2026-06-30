// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Performs semantic vector search across conversation history records.
 *
 * **How it works:**
 * 1. The query text is embedded into a 1024-dimensional vector using the multilingual-e5-large
 *    model.
 * 2. The vector is compared against indexed record chunks using semantic similarity search.
 * 3. When no region is specified, all regions are queried in parallel (fan-out) and results are
 *    merged by score.
 * 4. Results are ranked by similarity score (descending) and paginated via `page[number]` /
 *    `page[size]`.
 *
 * **Authentication:** Requires a Telnyx API key via `Authorization: Bearer <key>`. Results are
 * automatically scoped to the caller's organization — `organization_id` is injected from the auth
 * token and cannot be overridden.
 *
 * **Chunking:** Records are split into chunks of up to 480 tokens with 64-token overlap at
 * ingestion time. Each search result represents a single chunk, with `chunk_index` and
 * `chunk_total` indicating its position within the original record.
 *
 * **Filtering:** Use `filter[field][operator]=value` query parameters to narrow results before
 * vector search.
 *
 * Top-level filterable fields: `user_id`, `region`, `record_id`, `record_created_at`,
 * `ingested_at`, `retention`
 *
 * Note: `retention` is filter-only — it can be used to narrow results but is not returned in the
 * response body.
 *
 * Metadata fields: any field not in the list above is resolved to `data.metadata.<field>` (e.g.,
 * `filter[language]=en` → `data.metadata.language`).
 *
 * Supported filter operators:
 * - `eq` — exact match (default when no operator specified)
 * - `in` — match any of comma-separated values
 * - `gte`, `gt`, `lte`, `lt` — range comparisons (useful for date filtering)
 * - `contains` — wildcard substring match
 *
 * **Examples:**
 *
 * ```
 * GET /v2/ai/conversation_histories?q=billing+issue&page[size]=10
 * GET /v2/ai/conversation_histories?q=setup+guide&region=USA&min_score=0.5
 * GET /v2/ai/conversation_histories?q=refund&filter[record_created_at][gte]=2026-01-01T00:00:00Z
 * GET /v2/ai/conversation_histories?q=outage&filter[region][in]=USA,DEU
 * GET /v2/ai/conversation_histories?q=hold+time&filter[language]=en
 * ```
 */
class AiRetrieveConversationHistoriesParams
private constructor(
    private val q: String,
    private val filterIngestedAtGte: OffsetDateTime?,
    private val filterIngestedAtLte: OffsetDateTime?,
    private val filterRecordCreatedAtGte: OffsetDateTime?,
    private val filterRecordCreatedAtLte: OffsetDateTime?,
    private val filterRecordId: String?,
    private val filterRegionIn: String?,
    private val filterRetention: String?,
    private val filterUserId: String?,
    private val minScore: Float?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val region: Region?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Natural language search query. The text is embedded into a 1024-dimensional vector and
     * compared against indexed record chunks using semantic similarity.
     */
    fun q(): String = q

    /**
     * Only include records ingested (chunked, embedded, and indexed) on or after this ISO 8601
     * timestamp.
     */
    fun filterIngestedAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(filterIngestedAtGte)

    /**
     * Only include records ingested (chunked, embedded, and indexed) on or before this ISO 8601
     * timestamp.
     */
    fun filterIngestedAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(filterIngestedAtLte)

    /** Only include records whose original creation time is on or after this ISO 8601 timestamp. */
    fun filterRecordCreatedAtGte(): Optional<OffsetDateTime> =
        Optional.ofNullable(filterRecordCreatedAtGte)

    /**
     * Only include records whose original creation time is on or before this ISO 8601 timestamp.
     */
    fun filterRecordCreatedAtLte(): Optional<OffsetDateTime> =
        Optional.ofNullable(filterRecordCreatedAtLte)

    /** Filter to chunks belonging to a specific parent record (exact match). */
    fun filterRecordId(): Optional<String> = Optional.ofNullable(filterRecordId)

    /**
     * Filter by the region stored on the record. Comma-separated to match multiple regions (USA,
     * DEU, AUS, UAE). Distinct from the `region` parameter, which selects which cluster(s) are
     * queried.
     */
    fun filterRegionIn(): Optional<String> = Optional.ofNullable(filterRegionIn)

    /** Filter by retention policy (exact match). Filter-only: not returned in the response body. */
    fun filterRetention(): Optional<String> = Optional.ofNullable(filterRetention)

    /** Filter to records owned by a specific user (exact match). */
    fun filterUserId(): Optional<String> = Optional.ofNullable(filterUserId)

    /**
     * Minimum cosine similarity score threshold (0.0 to 1.0). Results below this threshold are
     * excluded.
     */
    fun minScore(): Optional<Float> = Optional.ofNullable(minScore)

    /** Page number to return (1-based). Defaults to 1. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** Number of results per page. Defaults to 20, maximum 100. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Restrict search to a specific region. When omitted, all regions are queried in parallel
     * (fan-out) and results are merged by similarity score.
     */
    fun region(): Optional<Region> = Optional.ofNullable(region)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AiRetrieveConversationHistoriesParams].
         *
         * The following fields are required:
         * ```java
         * .q()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiRetrieveConversationHistoriesParams]. */
    class Builder internal constructor() {

        private var q: String? = null
        private var filterIngestedAtGte: OffsetDateTime? = null
        private var filterIngestedAtLte: OffsetDateTime? = null
        private var filterRecordCreatedAtGte: OffsetDateTime? = null
        private var filterRecordCreatedAtLte: OffsetDateTime? = null
        private var filterRecordId: String? = null
        private var filterRegionIn: String? = null
        private var filterRetention: String? = null
        private var filterUserId: String? = null
        private var minScore: Float? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var region: Region? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            aiRetrieveConversationHistoriesParams: AiRetrieveConversationHistoriesParams
        ) = apply {
            q = aiRetrieveConversationHistoriesParams.q
            filterIngestedAtGte = aiRetrieveConversationHistoriesParams.filterIngestedAtGte
            filterIngestedAtLte = aiRetrieveConversationHistoriesParams.filterIngestedAtLte
            filterRecordCreatedAtGte =
                aiRetrieveConversationHistoriesParams.filterRecordCreatedAtGte
            filterRecordCreatedAtLte =
                aiRetrieveConversationHistoriesParams.filterRecordCreatedAtLte
            filterRecordId = aiRetrieveConversationHistoriesParams.filterRecordId
            filterRegionIn = aiRetrieveConversationHistoriesParams.filterRegionIn
            filterRetention = aiRetrieveConversationHistoriesParams.filterRetention
            filterUserId = aiRetrieveConversationHistoriesParams.filterUserId
            minScore = aiRetrieveConversationHistoriesParams.minScore
            pageNumber = aiRetrieveConversationHistoriesParams.pageNumber
            pageSize = aiRetrieveConversationHistoriesParams.pageSize
            region = aiRetrieveConversationHistoriesParams.region
            additionalHeaders = aiRetrieveConversationHistoriesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                aiRetrieveConversationHistoriesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Natural language search query. The text is embedded into a 1024-dimensional vector and
         * compared against indexed record chunks using semantic similarity.
         */
        fun q(q: String) = apply { this.q = q }

        /**
         * Only include records ingested (chunked, embedded, and indexed) on or after this ISO 8601
         * timestamp.
         */
        fun filterIngestedAtGte(filterIngestedAtGte: OffsetDateTime?) = apply {
            this.filterIngestedAtGte = filterIngestedAtGte
        }

        /**
         * Alias for calling [Builder.filterIngestedAtGte] with `filterIngestedAtGte.orElse(null)`.
         */
        fun filterIngestedAtGte(filterIngestedAtGte: Optional<OffsetDateTime>) =
            filterIngestedAtGte(filterIngestedAtGte.getOrNull())

        /**
         * Only include records ingested (chunked, embedded, and indexed) on or before this ISO 8601
         * timestamp.
         */
        fun filterIngestedAtLte(filterIngestedAtLte: OffsetDateTime?) = apply {
            this.filterIngestedAtLte = filterIngestedAtLte
        }

        /**
         * Alias for calling [Builder.filterIngestedAtLte] with `filterIngestedAtLte.orElse(null)`.
         */
        fun filterIngestedAtLte(filterIngestedAtLte: Optional<OffsetDateTime>) =
            filterIngestedAtLte(filterIngestedAtLte.getOrNull())

        /**
         * Only include records whose original creation time is on or after this ISO 8601 timestamp.
         */
        fun filterRecordCreatedAtGte(filterRecordCreatedAtGte: OffsetDateTime?) = apply {
            this.filterRecordCreatedAtGte = filterRecordCreatedAtGte
        }

        /**
         * Alias for calling [Builder.filterRecordCreatedAtGte] with
         * `filterRecordCreatedAtGte.orElse(null)`.
         */
        fun filterRecordCreatedAtGte(filterRecordCreatedAtGte: Optional<OffsetDateTime>) =
            filterRecordCreatedAtGte(filterRecordCreatedAtGte.getOrNull())

        /**
         * Only include records whose original creation time is on or before this ISO 8601
         * timestamp.
         */
        fun filterRecordCreatedAtLte(filterRecordCreatedAtLte: OffsetDateTime?) = apply {
            this.filterRecordCreatedAtLte = filterRecordCreatedAtLte
        }

        /**
         * Alias for calling [Builder.filterRecordCreatedAtLte] with
         * `filterRecordCreatedAtLte.orElse(null)`.
         */
        fun filterRecordCreatedAtLte(filterRecordCreatedAtLte: Optional<OffsetDateTime>) =
            filterRecordCreatedAtLte(filterRecordCreatedAtLte.getOrNull())

        /** Filter to chunks belonging to a specific parent record (exact match). */
        fun filterRecordId(filterRecordId: String?) = apply { this.filterRecordId = filterRecordId }

        /** Alias for calling [Builder.filterRecordId] with `filterRecordId.orElse(null)`. */
        fun filterRecordId(filterRecordId: Optional<String>) =
            filterRecordId(filterRecordId.getOrNull())

        /**
         * Filter by the region stored on the record. Comma-separated to match multiple regions
         * (USA, DEU, AUS, UAE). Distinct from the `region` parameter, which selects which
         * cluster(s) are queried.
         */
        fun filterRegionIn(filterRegionIn: String?) = apply { this.filterRegionIn = filterRegionIn }

        /** Alias for calling [Builder.filterRegionIn] with `filterRegionIn.orElse(null)`. */
        fun filterRegionIn(filterRegionIn: Optional<String>) =
            filterRegionIn(filterRegionIn.getOrNull())

        /**
         * Filter by retention policy (exact match). Filter-only: not returned in the response body.
         */
        fun filterRetention(filterRetention: String?) = apply {
            this.filterRetention = filterRetention
        }

        /** Alias for calling [Builder.filterRetention] with `filterRetention.orElse(null)`. */
        fun filterRetention(filterRetention: Optional<String>) =
            filterRetention(filterRetention.getOrNull())

        /** Filter to records owned by a specific user (exact match). */
        fun filterUserId(filterUserId: String?) = apply { this.filterUserId = filterUserId }

        /** Alias for calling [Builder.filterUserId] with `filterUserId.orElse(null)`. */
        fun filterUserId(filterUserId: Optional<String>) = filterUserId(filterUserId.getOrNull())

        /**
         * Minimum cosine similarity score threshold (0.0 to 1.0). Results below this threshold are
         * excluded.
         */
        fun minScore(minScore: Float?) = apply { this.minScore = minScore }

        /**
         * Alias for [Builder.minScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minScore(minScore: Float) = minScore(minScore as Float?)

        /** Alias for calling [Builder.minScore] with `minScore.orElse(null)`. */
        fun minScore(minScore: Optional<Float>) = minScore(minScore.getOrNull())

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

        /** Number of results per page. Defaults to 20, maximum 100. */
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
         * Restrict search to a specific region. When omitted, all regions are queried in parallel
         * (fan-out) and results are merged by similarity score.
         */
        fun region(region: Region?) = apply { this.region = region }

        /** Alias for calling [Builder.region] with `region.orElse(null)`. */
        fun region(region: Optional<Region>) = region(region.getOrNull())

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
         * Returns an immutable instance of [AiRetrieveConversationHistoriesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .q()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiRetrieveConversationHistoriesParams =
            AiRetrieveConversationHistoriesParams(
                checkRequired("q", q),
                filterIngestedAtGte,
                filterIngestedAtLte,
                filterRecordCreatedAtGte,
                filterRecordCreatedAtLte,
                filterRecordId,
                filterRegionIn,
                filterRetention,
                filterUserId,
                minScore,
                pageNumber,
                pageSize,
                region,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("q", q)
                filterIngestedAtGte?.let {
                    put(
                        "filter[ingested_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterIngestedAtLte?.let {
                    put(
                        "filter[ingested_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterRecordCreatedAtGte?.let {
                    put(
                        "filter[record_created_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterRecordCreatedAtLte?.let {
                    put(
                        "filter[record_created_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterRecordId?.let { put("filter[record_id]", it) }
                filterRegionIn?.let { put("filter[region][in]", it) }
                filterRetention?.let { put("filter[retention]", it) }
                filterUserId?.let { put("filter[user_id]", it) }
                minScore?.let { put("min_score", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                region?.let { put("region", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Restrict search to a specific region. When omitted, all regions are queried in parallel
     * (fan-out) and results are merged by similarity score.
     */
    class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USA = of("USA")

            @JvmField val DEU = of("DEU")

            @JvmField val AUS = of("AUS")

            @JvmField val UAE = of("UAE")

            @JvmStatic fun of(value: String) = Region(JsonField.of(value))
        }

        /** An enum containing [Region]'s known values. */
        enum class Known {
            USA,
            DEU,
            AUS,
            UAE,
        }

        /**
         * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Region] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USA,
            DEU,
            AUS,
            UAE,
            /** An enum member indicating that [Region] was instantiated with an unknown value. */
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
                USA -> Value.USA
                DEU -> Value.DEU
                AUS -> Value.AUS
                UAE -> Value.UAE
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
                USA -> Known.USA
                DEU -> Known.DEU
                AUS -> Known.AUS
                UAE -> Known.UAE
                else -> throw TelnyxInvalidDataException("Unknown Region: $value")
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
        fun validate(): Region = apply {
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

            return other is Region && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiRetrieveConversationHistoriesParams &&
            q == other.q &&
            filterIngestedAtGte == other.filterIngestedAtGte &&
            filterIngestedAtLte == other.filterIngestedAtLte &&
            filterRecordCreatedAtGte == other.filterRecordCreatedAtGte &&
            filterRecordCreatedAtLte == other.filterRecordCreatedAtLte &&
            filterRecordId == other.filterRecordId &&
            filterRegionIn == other.filterRegionIn &&
            filterRetention == other.filterRetention &&
            filterUserId == other.filterUserId &&
            minScore == other.minScore &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            region == other.region &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            q,
            filterIngestedAtGte,
            filterIngestedAtLte,
            filterRecordCreatedAtGte,
            filterRecordCreatedAtLte,
            filterRecordId,
            filterRegionIn,
            filterRetention,
            filterUserId,
            minScore,
            pageNumber,
            pageSize,
            region,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AiRetrieveConversationHistoriesParams{q=$q, filterIngestedAtGte=$filterIngestedAtGte, filterIngestedAtLte=$filterIngestedAtLte, filterRecordCreatedAtGte=$filterRecordCreatedAtGte, filterRecordCreatedAtLte=$filterRecordCreatedAtLte, filterRecordId=$filterRecordId, filterRegionIn=$filterRegionIn, filterRetention=$filterRetention, filterUserId=$filterUserId, minScore=$minScore, pageNumber=$pageNumber, pageSize=$pageSize, region=$region, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
