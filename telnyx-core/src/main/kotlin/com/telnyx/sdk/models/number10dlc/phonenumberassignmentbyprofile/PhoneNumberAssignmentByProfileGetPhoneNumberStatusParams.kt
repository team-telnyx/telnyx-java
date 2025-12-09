// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Check the status of the individual phone number/campaign assignments associated with the supplied
 * `taskId`.
 */
class PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
private constructor(
    private val taskId: String?,
    private val page: Long?,
    private val recordsPerPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun taskId(): Optional<String> = Optional.ofNullable(taskId)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun recordsPerPage(): Optional<Long> = Optional.ofNullable(recordsPerPage)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams]. */
    class Builder internal constructor() {

        private var taskId: String? = null
        private var page: Long? = null
        private var recordsPerPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            phoneNumberAssignmentByProfileGetPhoneNumberStatusParams:
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
        ) = apply {
            taskId = phoneNumberAssignmentByProfileGetPhoneNumberStatusParams.taskId
            page = phoneNumberAssignmentByProfileGetPhoneNumberStatusParams.page
            recordsPerPage = phoneNumberAssignmentByProfileGetPhoneNumberStatusParams.recordsPerPage
            additionalHeaders =
                phoneNumberAssignmentByProfileGetPhoneNumberStatusParams.additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                phoneNumberAssignmentByProfileGetPhoneNumberStatusParams.additionalQueryParams
                    .toBuilder()
        }

        fun taskId(taskId: String?) = apply { this.taskId = taskId }

        /** Alias for calling [Builder.taskId] with `taskId.orElse(null)`. */
        fun taskId(taskId: Optional<String>) = taskId(taskId.getOrNull())

        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        fun recordsPerPage(recordsPerPage: Long?) = apply { this.recordsPerPage = recordsPerPage }

        /**
         * Alias for [Builder.recordsPerPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun recordsPerPage(recordsPerPage: Long) = recordsPerPage(recordsPerPage as Long?)

        /** Alias for calling [Builder.recordsPerPage] with `recordsPerPage.orElse(null)`. */
        fun recordsPerPage(recordsPerPage: Optional<Long>) =
            recordsPerPage(recordsPerPage.getOrNull())

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
         * Returns an immutable instance of
         * [PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams(
                taskId,
                page,
                recordsPerPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> taskId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                page?.let { put("page", it.toString()) }
                recordsPerPage?.let { put("recordsPerPage", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams &&
            taskId == other.taskId &&
            page == other.page &&
            recordsPerPage == other.recordsPerPage &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(taskId, page, recordsPerPage, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams{taskId=$taskId, page=$page, recordsPerPage=$recordsPerPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
