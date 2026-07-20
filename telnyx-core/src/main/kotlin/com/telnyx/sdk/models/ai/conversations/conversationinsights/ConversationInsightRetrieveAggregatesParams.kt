// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.conversationinsights

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Aggregate conversation insights by specified fields */
class ConversationInsightRetrieveAggregatesParams
private constructor(
    private val createdAt: String?,
    private val groupBy: List<String>?,
    private val insightId: String?,
    private val metadata: Metadata?,
    private val show: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filter by creation datetime to scope the aggregation window. Supports range operators (e.g.,
     * `created_at=gte.2025-01-01T00:00:00Z` for the start of the range,
     * `created_at=lt.2025-01-02T00:00:00Z` for the end). To build per-day time series (as the
     * portal does for the 'Insights Over Time' chart), issue one request per day bounded by
     * `created_at=gte.<day_start>` and `created_at=lt.<next_day_start>`.
     */
    fun createdAt(): Optional<String> = Optional.ofNullable(createdAt)

    /**
     * Fields to group by (can be comma-separated or multiple parameters). Prefix a field with
     * 'metadata.' (e.g. 'metadata.assistant_id') to group by the conversation's metadata instead of
     * the insight result.
     *
     * Common fields used for over-time charts:
     * - `score` — Group by the insight's score value (e.g. for Agent Instruction Following, User
     *   Satisfaction).
     * - `metadata.assistant_id` — Group by the assistant that handled the conversation.
     * - `metadata.assistant_version_id` — Group by the assistant version, useful for comparing
     *   performance across versions in the portal's 'Insights Over Time' chart.
     * - `metadata.telnyx_conversation_channel` — Group by conversation channel (phone_call,
     *   web_chat, etc.).
     */
    fun groupBy(): Optional<List<String>> = Optional.ofNullable(groupBy)

    /**
     * Optional insight ID to filter conversation insights. Only insights matching this ID will be
     * included in the aggregation.
     */
    fun insightId(): Optional<String> = Optional.ofNullable(insightId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    /**
     * Fields to include in the result (can be comma-separated or multiple parameters). Supports the
     * same 'metadata.<key>' prefix as group_by. Each returned row will contain the grouped field
     * values plus a `record_count` indicating how many conversation insights match that
     * combination.
     */
    fun show(): Optional<List<String>> = Optional.ofNullable(show)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConversationInsightRetrieveAggregatesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConversationInsightRetrieveAggregatesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConversationInsightRetrieveAggregatesParams]. */
    class Builder internal constructor() {

        private var createdAt: String? = null
        private var groupBy: MutableList<String>? = null
        private var insightId: String? = null
        private var metadata: Metadata? = null
        private var show: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            conversationInsightRetrieveAggregatesParams: ConversationInsightRetrieveAggregatesParams
        ) = apply {
            createdAt = conversationInsightRetrieveAggregatesParams.createdAt
            groupBy = conversationInsightRetrieveAggregatesParams.groupBy?.toMutableList()
            insightId = conversationInsightRetrieveAggregatesParams.insightId
            metadata = conversationInsightRetrieveAggregatesParams.metadata
            show = conversationInsightRetrieveAggregatesParams.show?.toMutableList()
            additionalHeaders =
                conversationInsightRetrieveAggregatesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                conversationInsightRetrieveAggregatesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Filter by creation datetime to scope the aggregation window. Supports range operators
         * (e.g., `created_at=gte.2025-01-01T00:00:00Z` for the start of the range,
         * `created_at=lt.2025-01-02T00:00:00Z` for the end). To build per-day time series (as the
         * portal does for the 'Insights Over Time' chart), issue one request per day bounded by
         * `created_at=gte.<day_start>` and `created_at=lt.<next_day_start>`.
         */
        fun createdAt(createdAt: String?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<String>) = createdAt(createdAt.getOrNull())

        /**
         * Fields to group by (can be comma-separated or multiple parameters). Prefix a field with
         * 'metadata.' (e.g. 'metadata.assistant_id') to group by the conversation's metadata
         * instead of the insight result.
         *
         * Common fields used for over-time charts:
         * - `score` — Group by the insight's score value (e.g. for Agent Instruction Following,
         *   User Satisfaction).
         * - `metadata.assistant_id` — Group by the assistant that handled the conversation.
         * - `metadata.assistant_version_id` — Group by the assistant version, useful for comparing
         *   performance across versions in the portal's 'Insights Over Time' chart.
         * - `metadata.telnyx_conversation_channel` — Group by conversation channel (phone_call,
         *   web_chat, etc.).
         */
        fun groupBy(groupBy: List<String>?) = apply { this.groupBy = groupBy?.toMutableList() }

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<List<String>>) = groupBy(groupBy.getOrNull())

        /**
         * Adds a single [String] to [Builder.groupBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroupBy(groupBy: String) = apply {
            this.groupBy = (this.groupBy ?: mutableListOf()).apply { add(groupBy) }
        }

        /**
         * Optional insight ID to filter conversation insights. Only insights matching this ID will
         * be included in the aggregation.
         */
        fun insightId(insightId: String?) = apply { this.insightId = insightId }

        /** Alias for calling [Builder.insightId] with `insightId.orElse(null)`. */
        fun insightId(insightId: Optional<String>) = insightId(insightId.getOrNull())

        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Fields to include in the result (can be comma-separated or multiple parameters). Supports
         * the same 'metadata.<key>' prefix as group_by. Each returned row will contain the grouped
         * field values plus a `record_count` indicating how many conversation insights match that
         * combination.
         */
        fun show(show: List<String>?) = apply { this.show = show?.toMutableList() }

        /** Alias for calling [Builder.show] with `show.orElse(null)`. */
        fun show(show: Optional<List<String>>) = show(show.getOrNull())

        /**
         * Adds a single [String] to [Builder.show].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addShow(show: String) = apply {
            this.show = (this.show ?: mutableListOf()).apply { add(show) }
        }

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
         * Returns an immutable instance of [ConversationInsightRetrieveAggregatesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConversationInsightRetrieveAggregatesParams =
            ConversationInsightRetrieveAggregatesParams(
                createdAt,
                groupBy?.toImmutable(),
                insightId,
                metadata,
                show?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAt?.let { put("created_at", it) }
                groupBy?.let { put("group_by", it.joinToString(",")) }
                insightId?.let { put("insight_id", it) }
                metadata?.let {
                    it.assistantId().ifPresent { put("metadata[assistant_id]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                show?.let { put("show", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    class Metadata
    private constructor(
        private val assistantId: String?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter by assistant ID (e.g., `metadata.assistant_id=eq.<assistant_id>`). When provided,
         * only conversation insights for the specified assistant are aggregated. Used by the portal
         * to scope the 'Insights Over Time' chart to a single assistant.
         */
        fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var assistantId: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                assistantId = metadata.assistantId
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            /**
             * Filter by assistant ID (e.g., `metadata.assistant_id=eq.<assistant_id>`). When
             * provided, only conversation insights for the specified assistant are aggregated. Used
             * by the portal to scope the 'Insights Over Time' chart to a single assistant.
             */
            fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

            /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
            fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

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
            fun build(): Metadata = Metadata(assistantId, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                assistantId == other.assistantId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(assistantId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{assistantId=$assistantId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversationInsightRetrieveAggregatesParams &&
            createdAt == other.createdAt &&
            groupBy == other.groupBy &&
            insightId == other.insightId &&
            metadata == other.metadata &&
            show == other.show &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdAt,
            groupBy,
            insightId,
            metadata,
            show,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ConversationInsightRetrieveAggregatesParams{createdAt=$createdAt, groupBy=$groupBy, insightId=$insightId, metadata=$metadata, show=$show, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
