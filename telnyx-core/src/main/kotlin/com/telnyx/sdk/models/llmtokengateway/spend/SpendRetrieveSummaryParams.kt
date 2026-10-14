// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.spend

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Return request counts, token counts and reference spend grouped by one attribution dimension.
 * Both UTC dates and group_by are required. Dates use a half-open range [start_date, end_date) of
 * at most 31 days. Cost reflects budget reference rates, not invoice charges. Unknown spend is
 * excluded and reported separately. The report snapshot supports at most 10,000 matching requests,
 * independently of page size. Exceeding this bound returns HTTP 503 without partial results. Narrow
 * the date range or resource filters before retrying. A failed report must not be interpreted as
 * zero usage. Request tags can filter either report and metadata:<key> can group the summary.
 */
class SpendRetrieveSummaryParams
private constructor(
    private val endDate: LocalDate,
    private val groupBy: SpendGroupBy,
    private val startDate: LocalDate,
    private val endUserId: String?,
    private val metadata: Metadata?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val pageSnapshot: String?,
    private val tokenGroupId: String?,
    private val tokenKeyId: String?,
    private val tokenUserId: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endDate(): LocalDate = endDate

    /**
     * A scope, or metadata:<key> to group by one request tag's text-form value; requests without
     * the key form one group with a null dimension_id.
     */
    fun groupBy(): SpendGroupBy = groupBy

    fun startDate(): LocalDate = startDate

    fun endUserId(): Optional<String> = Optional.ofNullable(endUserId)

    /**
     * Request tag filters as metadata[<key>]=<value>, at most 5, combined with AND. A value matches
     * the tag's text form exactly (booleans as true/false, integers in decimal), so
     * metadata[flag]=true matches both boolean true and the string "true". Keys are case-sensitive;
     * reserved-prefix keys are rejected. Unindexed: bounded by the account, the date range and the
     * report timeout.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Required after page 1; account/filter-bound 15-minute stable snapshot; expired/mismatch 409.
     */
    fun pageSnapshot(): Optional<String> = Optional.ofNullable(pageSnapshot)

    fun tokenGroupId(): Optional<String> = Optional.ofNullable(tokenGroupId)

    fun tokenKeyId(): Optional<String> = Optional.ofNullable(tokenKeyId)

    fun tokenUserId(): Optional<String> = Optional.ofNullable(tokenUserId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpendRetrieveSummaryParams].
         *
         * The following fields are required:
         * ```java
         * .endDate()
         * .groupBy()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpendRetrieveSummaryParams]. */
    class Builder internal constructor() {

        private var endDate: LocalDate? = null
        private var groupBy: SpendGroupBy? = null
        private var startDate: LocalDate? = null
        private var endUserId: String? = null
        private var metadata: Metadata? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var pageSnapshot: String? = null
        private var tokenGroupId: String? = null
        private var tokenKeyId: String? = null
        private var tokenUserId: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(spendRetrieveSummaryParams: SpendRetrieveSummaryParams) = apply {
            endDate = spendRetrieveSummaryParams.endDate
            groupBy = spendRetrieveSummaryParams.groupBy
            startDate = spendRetrieveSummaryParams.startDate
            endUserId = spendRetrieveSummaryParams.endUserId
            metadata = spendRetrieveSummaryParams.metadata
            pageNumber = spendRetrieveSummaryParams.pageNumber
            pageSize = spendRetrieveSummaryParams.pageSize
            pageSnapshot = spendRetrieveSummaryParams.pageSnapshot
            tokenGroupId = spendRetrieveSummaryParams.tokenGroupId
            tokenKeyId = spendRetrieveSummaryParams.tokenKeyId
            tokenUserId = spendRetrieveSummaryParams.tokenUserId
            additionalHeaders = spendRetrieveSummaryParams.additionalHeaders.toBuilder()
            additionalQueryParams = spendRetrieveSummaryParams.additionalQueryParams.toBuilder()
        }

        fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

        /**
         * A scope, or metadata:<key> to group by one request tag's text-form value; requests
         * without the key form one group with a null dimension_id.
         */
        fun groupBy(groupBy: SpendGroupBy) = apply { this.groupBy = groupBy }

        /**
         * Sets [groupBy] to an arbitrary [String].
         *
         * You should usually call [groupBy] with a well-typed [SpendGroupBy] constant instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(value: String) = groupBy(SpendGroupBy.of(value))

        fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

        fun endUserId(endUserId: String?) = apply { this.endUserId = endUserId }

        /** Alias for calling [Builder.endUserId] with `endUserId.orElse(null)`. */
        fun endUserId(endUserId: Optional<String>) = endUserId(endUserId.getOrNull())

        /**
         * Request tag filters as metadata[<key>]=<value>, at most 5, combined with AND. A value
         * matches the tag's text form exactly (booleans as true/false, integers in decimal), so
         * metadata[flag]=true matches both boolean true and the string "true". Keys are
         * case-sensitive; reserved-prefix keys are rejected. Unindexed: bounded by the account, the
         * date range and the report timeout.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

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
         * Required after page 1; account/filter-bound 15-minute stable snapshot;
         * expired/mismatch 409.
         */
        fun pageSnapshot(pageSnapshot: String?) = apply { this.pageSnapshot = pageSnapshot }

        /** Alias for calling [Builder.pageSnapshot] with `pageSnapshot.orElse(null)`. */
        fun pageSnapshot(pageSnapshot: Optional<String>) = pageSnapshot(pageSnapshot.getOrNull())

        fun tokenGroupId(tokenGroupId: String?) = apply { this.tokenGroupId = tokenGroupId }

        /** Alias for calling [Builder.tokenGroupId] with `tokenGroupId.orElse(null)`. */
        fun tokenGroupId(tokenGroupId: Optional<String>) = tokenGroupId(tokenGroupId.getOrNull())

        fun tokenKeyId(tokenKeyId: String?) = apply { this.tokenKeyId = tokenKeyId }

        /** Alias for calling [Builder.tokenKeyId] with `tokenKeyId.orElse(null)`. */
        fun tokenKeyId(tokenKeyId: Optional<String>) = tokenKeyId(tokenKeyId.getOrNull())

        fun tokenUserId(tokenUserId: String?) = apply { this.tokenUserId = tokenUserId }

        /** Alias for calling [Builder.tokenUserId] with `tokenUserId.orElse(null)`. */
        fun tokenUserId(tokenUserId: Optional<String>) = tokenUserId(tokenUserId.getOrNull())

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
         * Returns an immutable instance of [SpendRetrieveSummaryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endDate()
         * .groupBy()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpendRetrieveSummaryParams =
            SpendRetrieveSummaryParams(
                checkRequired("endDate", endDate),
                checkRequired("groupBy", groupBy),
                checkRequired("startDate", startDate),
                endUserId,
                metadata,
                pageNumber,
                pageSize,
                pageSnapshot,
                tokenGroupId,
                tokenKeyId,
                tokenUserId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("end_date", endDate.toString())
                put("group_by", groupBy.toString())
                put("start_date", startDate.toString())
                endUserId?.let { put("end_user_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                pageSnapshot?.let { put("page[snapshot]", it) }
                tokenGroupId?.let { put("token_group_id", it) }
                tokenKeyId?.let { put("token_key_id", it) }
                tokenUserId?.let { put("token_user_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Request tag filters as metadata[<key>]=<value>, at most 5, combined with AND. A value matches
     * the tag's text form exactly (booleans as true/false, integers in decimal), so
     * metadata[flag]=true matches both boolean true and the string "true". Keys are case-sensitive;
     * reserved-prefix keys are rejected. Unindexed: bounded by the account, the date range and the
     * report timeout.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpendRetrieveSummaryParams &&
            endDate == other.endDate &&
            groupBy == other.groupBy &&
            startDate == other.startDate &&
            endUserId == other.endUserId &&
            metadata == other.metadata &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            pageSnapshot == other.pageSnapshot &&
            tokenGroupId == other.tokenGroupId &&
            tokenKeyId == other.tokenKeyId &&
            tokenUserId == other.tokenUserId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endDate,
            groupBy,
            startDate,
            endUserId,
            metadata,
            pageNumber,
            pageSize,
            pageSnapshot,
            tokenGroupId,
            tokenKeyId,
            tokenUserId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SpendRetrieveSummaryParams{endDate=$endDate, groupBy=$groupBy, startDate=$startDate, endUserId=$endUserId, metadata=$metadata, pageNumber=$pageNumber, pageSize=$pageSize, pageSnapshot=$pageSnapshot, tokenGroupId=$tokenGroupId, tokenKeyId=$tokenKeyId, tokenUserId=$tokenUserId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
