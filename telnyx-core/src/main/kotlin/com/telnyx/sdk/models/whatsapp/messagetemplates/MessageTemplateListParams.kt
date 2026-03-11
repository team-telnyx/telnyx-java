// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.messagetemplates

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Whatsapp message templates */
class MessageTemplateListParams
private constructor(
    private val filterCategory: FilterCategory?,
    private val filterSearch: String?,
    private val filterStatus: String?,
    private val filterWabaId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by category */
    fun filterCategory(): Optional<FilterCategory> = Optional.ofNullable(filterCategory)

    /** Search templates by name */
    fun filterSearch(): Optional<String> = Optional.ofNullable(filterSearch)

    /** Filter by template status */
    fun filterStatus(): Optional<String> = Optional.ofNullable(filterStatus)

    /** Filter by WABA ID */
    fun filterWabaId(): Optional<String> = Optional.ofNullable(filterWabaId)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MessageTemplateListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [MessageTemplateListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageTemplateListParams]. */
    class Builder internal constructor() {

        private var filterCategory: FilterCategory? = null
        private var filterSearch: String? = null
        private var filterStatus: String? = null
        private var filterWabaId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageTemplateListParams: MessageTemplateListParams) = apply {
            filterCategory = messageTemplateListParams.filterCategory
            filterSearch = messageTemplateListParams.filterSearch
            filterStatus = messageTemplateListParams.filterStatus
            filterWabaId = messageTemplateListParams.filterWabaId
            pageNumber = messageTemplateListParams.pageNumber
            pageSize = messageTemplateListParams.pageSize
            additionalHeaders = messageTemplateListParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageTemplateListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by category */
        fun filterCategory(filterCategory: FilterCategory?) = apply {
            this.filterCategory = filterCategory
        }

        /** Alias for calling [Builder.filterCategory] with `filterCategory.orElse(null)`. */
        fun filterCategory(filterCategory: Optional<FilterCategory>) =
            filterCategory(filterCategory.getOrNull())

        /** Search templates by name */
        fun filterSearch(filterSearch: String?) = apply { this.filterSearch = filterSearch }

        /** Alias for calling [Builder.filterSearch] with `filterSearch.orElse(null)`. */
        fun filterSearch(filterSearch: Optional<String>) = filterSearch(filterSearch.getOrNull())

        /** Filter by template status */
        fun filterStatus(filterStatus: String?) = apply { this.filterStatus = filterStatus }

        /** Alias for calling [Builder.filterStatus] with `filterStatus.orElse(null)`. */
        fun filterStatus(filterStatus: Optional<String>) = filterStatus(filterStatus.getOrNull())

        /** Filter by WABA ID */
        fun filterWabaId(filterWabaId: String?) = apply { this.filterWabaId = filterWabaId }

        /** Alias for calling [Builder.filterWabaId] with `filterWabaId.orElse(null)`. */
        fun filterWabaId(filterWabaId: Optional<String>) = filterWabaId(filterWabaId.getOrNull())

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
         * Returns an immutable instance of [MessageTemplateListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageTemplateListParams =
            MessageTemplateListParams(
                filterCategory,
                filterSearch,
                filterStatus,
                filterWabaId,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterCategory?.let { put("filter[category]", it.toString()) }
                filterSearch?.let { put("filter[search]", it) }
                filterStatus?.let { put("filter[status]", it) }
                filterWabaId?.let { put("filter[waba_id]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by category */
    class FilterCategory @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MARKETING = of("MARKETING")

            @JvmField val UTILITY = of("UTILITY")

            @JvmField val AUTHENTICATION = of("AUTHENTICATION")

            @JvmStatic fun of(value: String) = FilterCategory(JsonField.of(value))
        }

        /** An enum containing [FilterCategory]'s known values. */
        enum class Known {
            MARKETING,
            UTILITY,
            AUTHENTICATION,
        }

        /**
         * An enum containing [FilterCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FilterCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MARKETING,
            UTILITY,
            AUTHENTICATION,
            /**
             * An enum member indicating that [FilterCategory] was instantiated with an unknown
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
                MARKETING -> Value.MARKETING
                UTILITY -> Value.UTILITY
                AUTHENTICATION -> Value.AUTHENTICATION
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
                MARKETING -> Known.MARKETING
                UTILITY -> Known.UTILITY
                AUTHENTICATION -> Known.AUTHENTICATION
                else -> throw TelnyxInvalidDataException("Unknown FilterCategory: $value")
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

        fun validate(): FilterCategory = apply {
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

            return other is FilterCategory && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageTemplateListParams &&
            filterCategory == other.filterCategory &&
            filterSearch == other.filterSearch &&
            filterStatus == other.filterStatus &&
            filterWabaId == other.filterWabaId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterCategory,
            filterSearch,
            filterStatus,
            filterWabaId,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MessageTemplateListParams{filterCategory=$filterCategory, filterSearch=$filterSearch, filterStatus=$filterStatus, filterWabaId=$filterWabaId, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
