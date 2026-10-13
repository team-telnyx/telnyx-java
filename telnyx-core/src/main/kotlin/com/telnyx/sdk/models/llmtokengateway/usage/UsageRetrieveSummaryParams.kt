// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.usage

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Gateway reference/enforcement usage, not invoice truth or BYOK provider charges. Requires the
 * dedicated llm_token_gateway.usage.read V2 action for combined spend and guardrail reporting;
 * existing spend.read and guardrail_events.read grants do not grant this endpoint. All totals, UTC
 * daily buckets, models and latest 20 guardrail events share one database snapshot. UTC half-open
 * dates, at most 31 days. Zero-filled days; at most 1000 models (503 rather than truncation on
 * overflow/timeout). Known tokens sum independently known categories across latest attempt
 * evidence, including corrections; unknown spend is excluded and unknown_requests/reserved_spend
 * remain explicit. Guardrail counts count events, not distinct requests. No raw spend events,
 * prompts or secrets. This read-only report creates no pagination snapshot and accepts no
 * pagination parameters.
 */
class UsageRetrieveSummaryParams
private constructor(
    private val endDate: LocalDate,
    private val startDate: LocalDate,
    private val tokenGroupId: String,
    private val metadata: Metadata?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endDate(): LocalDate = endDate

    fun startDate(): LocalDate = startDate

    fun tokenGroupId(): String = tokenGroupId

    /**
     * Request tag filters as metadata[<key>]=<value>, at most 5, combined with AND. A value matches
     * the tag's text form exactly (booleans as true/false, integers in decimal), so
     * metadata[flag]=true matches both boolean true and the string "true". Keys are case-sensitive;
     * reserved-prefix keys are rejected. Unindexed: bounded by the account, the date range and the
     * report timeout.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageRetrieveSummaryParams].
         *
         * The following fields are required:
         * ```java
         * .endDate()
         * .startDate()
         * .tokenGroupId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageRetrieveSummaryParams]. */
    class Builder internal constructor() {

        private var endDate: LocalDate? = null
        private var startDate: LocalDate? = null
        private var tokenGroupId: String? = null
        private var metadata: Metadata? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageRetrieveSummaryParams: UsageRetrieveSummaryParams) = apply {
            endDate = usageRetrieveSummaryParams.endDate
            startDate = usageRetrieveSummaryParams.startDate
            tokenGroupId = usageRetrieveSummaryParams.tokenGroupId
            metadata = usageRetrieveSummaryParams.metadata
            additionalHeaders = usageRetrieveSummaryParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageRetrieveSummaryParams.additionalQueryParams.toBuilder()
        }

        fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

        fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

        fun tokenGroupId(tokenGroupId: String) = apply { this.tokenGroupId = tokenGroupId }

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
         * Returns an immutable instance of [UsageRetrieveSummaryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endDate()
         * .startDate()
         * .tokenGroupId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageRetrieveSummaryParams =
            UsageRetrieveSummaryParams(
                checkRequired("endDate", endDate),
                checkRequired("startDate", startDate),
                checkRequired("tokenGroupId", tokenGroupId),
                metadata,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("end_date", endDate.toString())
                put("start_date", startDate.toString())
                put("token_group_id", tokenGroupId)
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
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

        return other is UsageRetrieveSummaryParams &&
            endDate == other.endDate &&
            startDate == other.startDate &&
            tokenGroupId == other.tokenGroupId &&
            metadata == other.metadata &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endDate,
            startDate,
            tokenGroupId,
            metadata,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "UsageRetrieveSummaryParams{endDate=$endDate, startDate=$startDate, tokenGroupId=$tokenGroupId, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
