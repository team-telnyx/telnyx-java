// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumbers

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

/** List all hosted numbers associated with the authenticated user. */
class MessagingHostedNumberListParams
private constructor(
    private val filterMessagingProfileId: String?,
    private val filterPhoneNumber: String?,
    private val filterPhoneNumberContains: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sortPhoneNumber: SortPhoneNumber?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by messaging profile ID. */
    fun filterMessagingProfileId(): Optional<String> = Optional.ofNullable(filterMessagingProfileId)

    /** Filter by exact phone number. */
    fun filterPhoneNumber(): Optional<String> = Optional.ofNullable(filterPhoneNumber)

    /** Filter by phone number substring. */
    fun filterPhoneNumberContains(): Optional<String> =
        Optional.ofNullable(filterPhoneNumberContains)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Sort by phone number. */
    fun sortPhoneNumber(): Optional<SortPhoneNumber> = Optional.ofNullable(sortPhoneNumber)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MessagingHostedNumberListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingHostedNumberListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingHostedNumberListParams]. */
    class Builder internal constructor() {

        private var filterMessagingProfileId: String? = null
        private var filterPhoneNumber: String? = null
        private var filterPhoneNumberContains: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sortPhoneNumber: SortPhoneNumber? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messagingHostedNumberListParams: MessagingHostedNumberListParams) =
            apply {
                filterMessagingProfileId = messagingHostedNumberListParams.filterMessagingProfileId
                filterPhoneNumber = messagingHostedNumberListParams.filterPhoneNumber
                filterPhoneNumberContains =
                    messagingHostedNumberListParams.filterPhoneNumberContains
                pageNumber = messagingHostedNumberListParams.pageNumber
                pageSize = messagingHostedNumberListParams.pageSize
                sortPhoneNumber = messagingHostedNumberListParams.sortPhoneNumber
                additionalHeaders = messagingHostedNumberListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    messagingHostedNumberListParams.additionalQueryParams.toBuilder()
            }

        /** Filter by messaging profile ID. */
        fun filterMessagingProfileId(filterMessagingProfileId: String?) = apply {
            this.filterMessagingProfileId = filterMessagingProfileId
        }

        /**
         * Alias for calling [Builder.filterMessagingProfileId] with
         * `filterMessagingProfileId.orElse(null)`.
         */
        fun filterMessagingProfileId(filterMessagingProfileId: Optional<String>) =
            filterMessagingProfileId(filterMessagingProfileId.getOrNull())

        /** Filter by exact phone number. */
        fun filterPhoneNumber(filterPhoneNumber: String?) = apply {
            this.filterPhoneNumber = filterPhoneNumber
        }

        /** Alias for calling [Builder.filterPhoneNumber] with `filterPhoneNumber.orElse(null)`. */
        fun filterPhoneNumber(filterPhoneNumber: Optional<String>) =
            filterPhoneNumber(filterPhoneNumber.getOrNull())

        /** Filter by phone number substring. */
        fun filterPhoneNumberContains(filterPhoneNumberContains: String?) = apply {
            this.filterPhoneNumberContains = filterPhoneNumberContains
        }

        /**
         * Alias for calling [Builder.filterPhoneNumberContains] with
         * `filterPhoneNumberContains.orElse(null)`.
         */
        fun filterPhoneNumberContains(filterPhoneNumberContains: Optional<String>) =
            filterPhoneNumberContains(filterPhoneNumberContains.getOrNull())

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

        /** Sort by phone number. */
        fun sortPhoneNumber(sortPhoneNumber: SortPhoneNumber?) = apply {
            this.sortPhoneNumber = sortPhoneNumber
        }

        /** Alias for calling [Builder.sortPhoneNumber] with `sortPhoneNumber.orElse(null)`. */
        fun sortPhoneNumber(sortPhoneNumber: Optional<SortPhoneNumber>) =
            sortPhoneNumber(sortPhoneNumber.getOrNull())

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
         * Returns an immutable instance of [MessagingHostedNumberListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingHostedNumberListParams =
            MessagingHostedNumberListParams(
                filterMessagingProfileId,
                filterPhoneNumber,
                filterPhoneNumberContains,
                pageNumber,
                pageSize,
                sortPhoneNumber,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterMessagingProfileId?.let { put("filter[messaging_profile_id]", it) }
                filterPhoneNumber?.let { put("filter[phone_number]", it) }
                filterPhoneNumberContains?.let { put("filter[phone_number][contains]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sortPhoneNumber?.let { put("sort[phone_number]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Sort by phone number. */
    class SortPhoneNumber @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = SortPhoneNumber(JsonField.of(value))
        }

        /** An enum containing [SortPhoneNumber]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortPhoneNumber]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortPhoneNumber] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortPhoneNumber] was instantiated with an unknown
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw TelnyxInvalidDataException("Unknown SortPhoneNumber: $value")
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

        fun validate(): SortPhoneNumber = apply {
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

            return other is SortPhoneNumber && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingHostedNumberListParams &&
            filterMessagingProfileId == other.filterMessagingProfileId &&
            filterPhoneNumber == other.filterPhoneNumber &&
            filterPhoneNumberContains == other.filterPhoneNumberContains &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sortPhoneNumber == other.sortPhoneNumber &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterMessagingProfileId,
            filterPhoneNumber,
            filterPhoneNumberContains,
            pageNumber,
            pageSize,
            sortPhoneNumber,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MessagingHostedNumberListParams{filterMessagingProfileId=$filterMessagingProfileId, filterPhoneNumber=$filterPhoneNumber, filterPhoneNumberContains=$filterPhoneNumberContains, pageNumber=$pageNumber, pageSize=$pageSize, sortPhoneNumber=$sortPhoneNumber, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
