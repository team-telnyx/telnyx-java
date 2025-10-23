// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns multiple recording resources for an account. */
class AccountRetrieveRecordingsJsonParams
private constructor(
    private val accountSid: String?,
    private val dateCreated: OffsetDateTime?,
    private val page: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): Optional<String> = Optional.ofNullable(accountSid)

    /**
     * Filters recording by the creation date. Expected format is ISO8601 date or date-time, ie.
     * {YYYY}-{MM}-{DD} or {YYYY}-{MM}-{DD}T{hh}:{mm}:{ss}Z. Also accepts inequality operators, e.g.
     * DateCreated>=2023-05-22.
     */
    fun dateCreated(): Optional<OffsetDateTime> = Optional.ofNullable(dateCreated)

    /**
     * The number of the page to be displayed, zero-indexed, should be used in conjuction with
     * PageToken.
     */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** The number of records to be displayed on a page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountRetrieveRecordingsJsonParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountRetrieveRecordingsJsonParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountRetrieveRecordingsJsonParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var dateCreated: OffsetDateTime? = null
        private var page: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            accountRetrieveRecordingsJsonParams: AccountRetrieveRecordingsJsonParams
        ) = apply {
            accountSid = accountRetrieveRecordingsJsonParams.accountSid
            dateCreated = accountRetrieveRecordingsJsonParams.dateCreated
            page = accountRetrieveRecordingsJsonParams.page
            pageSize = accountRetrieveRecordingsJsonParams.pageSize
            additionalHeaders = accountRetrieveRecordingsJsonParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                accountRetrieveRecordingsJsonParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String?) = apply { this.accountSid = accountSid }

        /** Alias for calling [Builder.accountSid] with `accountSid.orElse(null)`. */
        fun accountSid(accountSid: Optional<String>) = accountSid(accountSid.getOrNull())

        /**
         * Filters recording by the creation date. Expected format is ISO8601 date or date-time, ie.
         * {YYYY}-{MM}-{DD} or {YYYY}-{MM}-{DD}T{hh}:{mm}:{ss}Z. Also accepts inequality operators,
         * e.g. DateCreated>=2023-05-22.
         */
        fun dateCreated(dateCreated: OffsetDateTime?) = apply { this.dateCreated = dateCreated }

        /** Alias for calling [Builder.dateCreated] with `dateCreated.orElse(null)`. */
        fun dateCreated(dateCreated: Optional<OffsetDateTime>) =
            dateCreated(dateCreated.getOrNull())

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
         * Returns an immutable instance of [AccountRetrieveRecordingsJsonParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountRetrieveRecordingsJsonParams =
            AccountRetrieveRecordingsJsonParams(
                accountSid,
                dateCreated,
                page,
                pageSize,
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
                dateCreated?.let {
                    put("DateCreated", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                page?.let { put("Page", it.toString()) }
                pageSize?.let { put("PageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountRetrieveRecordingsJsonParams &&
            accountSid == other.accountSid &&
            dateCreated == other.dateCreated &&
            page == other.page &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountSid,
            dateCreated,
            page,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AccountRetrieveRecordingsJsonParams{accountSid=$accountSid, dateCreated=$dateCreated, page=$page, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
