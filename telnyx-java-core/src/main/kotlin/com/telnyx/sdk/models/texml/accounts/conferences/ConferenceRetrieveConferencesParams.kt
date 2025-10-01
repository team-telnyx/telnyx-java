// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences

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

/** Lists conference resources. */
class ConferenceRetrieveConferencesParams
private constructor(
    private val accountSid: String?,
    private val dateCreated: String?,
    private val dateUpdated: String?,
    private val friendlyName: String?,
    private val page: Long?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid)

    /**
     * Filters conferences by the creation date. Expected format is YYYY-MM-DD. Also accepts
     * inequality operators, e.g. DateCreated>=2023-05-22.
     */
    fun dateCreated(): Optional<String> = Optional.ofNullable(dateCreated)

    /**
     * Filters conferences by the time they were last updated. Expected format is YYYY-MM-DD. Also
     * accepts inequality operators, e.g. DateUpdated>=2023-05-22.
     */
    fun dateUpdated(): Optional<String> = Optional.ofNullable(dateUpdated)

    /** Filters conferences by their friendly name. */
    fun friendlyName(): Optional<String> = Optional.ofNullable(friendlyName)

    /**
     * The number of the page to be displayed, zero-indexed, should be used in conjuction with
     * PageToken.
     */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** The number of records to be displayed on a page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Used to request the next page of results. */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Filters conferences by status. */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ConferenceRetrieveConferencesParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConferenceRetrieveConferencesParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConferenceRetrieveConferencesParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var dateCreated: String? = null
        private var dateUpdated: String? = null
        private var friendlyName: String? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            conferenceRetrieveConferencesParams: ConferenceRetrieveConferencesParams
        ) = apply {
            accountSid = conferenceRetrieveConferencesParams.accountSid
            dateCreated = conferenceRetrieveConferencesParams.dateCreated
            dateUpdated = conferenceRetrieveConferencesParams.dateUpdated
            friendlyName = conferenceRetrieveConferencesParams.friendlyName
            page = conferenceRetrieveConferencesParams.page
            pageSize = conferenceRetrieveConferencesParams.pageSize
            pageToken = conferenceRetrieveConferencesParams.pageToken
            status = conferenceRetrieveConferencesParams.status
            additionalHeaders = conferenceRetrieveConferencesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                conferenceRetrieveConferencesParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String?) = apply { this.accountSid = accountSid }

        /** Alias for calling [Builder.accountSid] with `accountSid.orElse(null)`. */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * Filters conferences by the creation date. Expected format is YYYY-MM-DD. Also accepts
         * inequality operators, e.g. DateCreated>=2023-05-22.
         */
        fun dateCreated(dateCreated: String?) = apply { this.dateCreated = dateCreated }

        /** Alias for calling [Builder.dateCreated] with `dateCreated.orElse(null)`. */
        fun dateCreated(dateCreated: Optional<String>) = dateCreated(dateCreated.getOrNull())

        /**
         * Filters conferences by the time they were last updated. Expected format is YYYY-MM-DD.
         * Also accepts inequality operators, e.g. DateUpdated>=2023-05-22.
         */
        fun dateUpdated(dateUpdated: String?) = apply { this.dateUpdated = dateUpdated }

        /** Alias for calling [Builder.dateUpdated] with `dateUpdated.orElse(null)`. */
        fun dateUpdated(dateUpdated: Optional<String>) = dateUpdated(dateUpdated.getOrNull())

        /** Filters conferences by their friendly name. */
        fun friendlyName(friendlyName: String?) = apply { this.friendlyName = friendlyName }

        /** Alias for calling [Builder.friendlyName] with `friendlyName.orElse(null)`. */
        fun friendlyName(friendlyName: Optional<String>) = friendlyName(friendlyName.getOrNull())

        /**
         * The number of the page to be displayed, zero-indexed, should be used in conjuction with
         * PageToken.
         */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** The number of records to be displayed on a page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Used to request the next page of results. */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /** Filters conferences by status. */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [ConferenceRetrieveConferencesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConferenceRetrieveConferencesParams =
            ConferenceRetrieveConferencesParams(
                accountSid,
                dateCreated,
                dateUpdated,
                friendlyName,
                page,
                pageSize,
                pageToken,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                dateCreated?.let { put("DateCreated", it) }
                dateUpdated?.let { put("DateUpdated", it) }
                friendlyName?.let { put("FriendlyName", it) }
                page?.let { put("Page", it.toString()) }
                pageSize?.let { put("PageSize", it.toString()) }
                pageToken?.let { put("PageToken", it) }
                status?.let { put("Status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filters conferences by status. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INIT = of("init")

            @JvmField val IN_PROGRESS = of("in-progress")

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            INIT,
            IN_PROGRESS,
            COMPLETED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INIT,
            IN_PROGRESS,
            COMPLETED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                INIT -> Value.INIT
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
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
                INIT -> Known.INIT
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConferenceRetrieveConferencesParams &&
            accountSid == other.accountSid &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            friendlyName == other.friendlyName &&
            page == other.page &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountSid,
            dateCreated,
            dateUpdated,
            friendlyName,
            page,
            pageSize,
            pageToken,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ConferenceRetrieveConferencesParams{accountSid=$accountSid, dateCreated=$dateCreated, dateUpdated=$dateUpdated, friendlyName=$friendlyName, page=$page, pageSize=$pageSize, pageToken=$pageToken, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
