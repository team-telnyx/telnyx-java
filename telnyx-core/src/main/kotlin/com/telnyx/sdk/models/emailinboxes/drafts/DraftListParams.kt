// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

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
 * Lists drafts newest first using stable cursor pagination. All access is scoped to the
 * authenticated account and the given inbox.
 */
class DraftListParams
private constructor(
    private val inboxId: String?,
    private val filterStatus: FilterStatus?,
    private val pageAfter: String?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): Optional<String> = Optional.ofNullable(inboxId)

    /** Restrict results to drafts in this state. */
    fun filterStatus(): Optional<FilterStatus> = Optional.ofNullable(filterStatus)

    /** Opaque cursor returned by the previous page. */
    fun pageAfter(): Optional<String> = Optional.ofNullable(pageAfter)

    /** Number of results to return. Defaults to 25; maximum is 100. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DraftListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DraftListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DraftListParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var filterStatus: FilterStatus? = null
        private var pageAfter: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(draftListParams: DraftListParams) = apply {
            inboxId = draftListParams.inboxId
            filterStatus = draftListParams.filterStatus
            pageAfter = draftListParams.pageAfter
            pageSize = draftListParams.pageSize
            additionalHeaders = draftListParams.additionalHeaders.toBuilder()
            additionalQueryParams = draftListParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String?) = apply { this.inboxId = inboxId }

        /** Alias for calling [Builder.inboxId] with `inboxId.orElse(null)`. */
        fun inboxId(inboxId: Optional<String>) = inboxId(inboxId.getOrNull())

        /** Restrict results to drafts in this state. */
        fun filterStatus(filterStatus: FilterStatus?) = apply { this.filterStatus = filterStatus }

        /** Alias for calling [Builder.filterStatus] with `filterStatus.orElse(null)`. */
        fun filterStatus(filterStatus: Optional<FilterStatus>) =
            filterStatus(filterStatus.getOrNull())

        /** Opaque cursor returned by the previous page. */
        fun pageAfter(pageAfter: String?) = apply { this.pageAfter = pageAfter }

        /** Alias for calling [Builder.pageAfter] with `pageAfter.orElse(null)`. */
        fun pageAfter(pageAfter: Optional<String>) = pageAfter(pageAfter.getOrNull())

        /** Number of results to return. Defaults to 25; maximum is 100. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [DraftListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DraftListParams =
            DraftListParams(
                inboxId,
                filterStatus,
                pageAfter,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterStatus?.let { put("filter[status]", it.toString()) }
                pageAfter?.let { put("page[after]", it) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Restrict results to drafts in this state. */
    class FilterStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val DRAFT = of("draft")

            @JvmField val SENDING = of("sending")

            @JvmField val SENT = of("sent")

            @JvmStatic fun of(value: String) = FilterStatus(JsonField.of(value))
        }

        /** An enum containing [FilterStatus]'s known values. */
        enum class Known {
            DRAFT,
            SENDING,
            SENT,
        }

        /**
         * An enum containing [FilterStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            SENDING,
            SENT,
            /**
             * An enum member indicating that [FilterStatus] was instantiated with an unknown value.
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
                DRAFT -> Value.DRAFT
                SENDING -> Value.SENDING
                SENT -> Value.SENT
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
                DRAFT -> Known.DRAFT
                SENDING -> Known.SENDING
                SENT -> Known.SENT
                else -> throw TelnyxInvalidDataException("Unknown FilterStatus: $value")
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
        fun validate(): FilterStatus = apply {
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

            return other is FilterStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DraftListParams &&
            inboxId == other.inboxId &&
            filterStatus == other.filterStatus &&
            pageAfter == other.pageAfter &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inboxId,
            filterStatus,
            pageAfter,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DraftListParams{inboxId=$inboxId, filterStatus=$filterStatus, pageAfter=$pageAfter, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
