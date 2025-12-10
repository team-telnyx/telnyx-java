// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get scheduled events for an assistant with pagination and filtering */
class ScheduledEventListParams
private constructor(
    private val assistantId: String?,
    private val conversationChannel: ConversationChannelType?,
    private val fromDate: OffsetDateTime?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val toDate: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun assistantId(): Optional<String> = Optional.ofNullable(assistantId)

    fun conversationChannel(): Optional<ConversationChannelType> =
        Optional.ofNullable(conversationChannel)

    fun fromDate(): Optional<OffsetDateTime> = Optional.ofNullable(fromDate)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun toDate(): Optional<OffsetDateTime> = Optional.ofNullable(toDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ScheduledEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ScheduledEventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledEventListParams]. */
    class Builder internal constructor() {

        private var assistantId: String? = null
        private var conversationChannel: ConversationChannelType? = null
        private var fromDate: OffsetDateTime? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var toDate: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(scheduledEventListParams: ScheduledEventListParams) = apply {
            assistantId = scheduledEventListParams.assistantId
            conversationChannel = scheduledEventListParams.conversationChannel
            fromDate = scheduledEventListParams.fromDate
            pageNumber = scheduledEventListParams.pageNumber
            pageSize = scheduledEventListParams.pageSize
            toDate = scheduledEventListParams.toDate
            additionalHeaders = scheduledEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = scheduledEventListParams.additionalQueryParams.toBuilder()
        }

        fun assistantId(assistantId: String?) = apply { this.assistantId = assistantId }

        /** Alias for calling [Builder.assistantId] with `assistantId.orElse(null)`. */
        fun assistantId(assistantId: Optional<String>) = assistantId(assistantId.getOrNull())

        fun conversationChannel(conversationChannel: ConversationChannelType?) = apply {
            this.conversationChannel = conversationChannel
        }

        /**
         * Alias for calling [Builder.conversationChannel] with `conversationChannel.orElse(null)`.
         */
        fun conversationChannel(conversationChannel: Optional<ConversationChannelType>) =
            conversationChannel(conversationChannel.getOrNull())

        fun fromDate(fromDate: OffsetDateTime?) = apply { this.fromDate = fromDate }

        /** Alias for calling [Builder.fromDate] with `fromDate.orElse(null)`. */
        fun fromDate(fromDate: Optional<OffsetDateTime>) = fromDate(fromDate.getOrNull())

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

        fun toDate(toDate: OffsetDateTime?) = apply { this.toDate = toDate }

        /** Alias for calling [Builder.toDate] with `toDate.orElse(null)`. */
        fun toDate(toDate: Optional<OffsetDateTime>) = toDate(toDate.getOrNull())

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
         * Returns an immutable instance of [ScheduledEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScheduledEventListParams =
            ScheduledEventListParams(
                assistantId,
                conversationChannel,
                fromDate,
                pageNumber,
                pageSize,
                toDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> assistantId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                conversationChannel?.let { put("conversation_channel", it.toString()) }
                fromDate?.let {
                    put("from_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                toDate?.let { put("to_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScheduledEventListParams &&
            assistantId == other.assistantId &&
            conversationChannel == other.conversationChannel &&
            fromDate == other.fromDate &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            toDate == other.toDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            assistantId,
            conversationChannel,
            fromDate,
            pageNumber,
            pageSize,
            toDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ScheduledEventListParams{assistantId=$assistantId, conversationChannel=$conversationChannel, fromDate=$fromDate, pageNumber=$pageNumber, pageSize=$pageSize, toDate=$toDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
