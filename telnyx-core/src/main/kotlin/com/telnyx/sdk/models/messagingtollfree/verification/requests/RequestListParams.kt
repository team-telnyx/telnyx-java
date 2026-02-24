// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of previously-submitted tollfree verification requests */
class RequestListParams
private constructor(
    private val page: Long,
    private val pageSize: Long,
    private val businessName: String?,
    private val dateEnd: OffsetDateTime?,
    private val dateStart: OffsetDateTime?,
    private val phoneNumber: String?,
    private val status: TfVerificationStatus?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun page(): Long = page

    /**
     *         Request this many records per page
     *         This value is automatically clamped if the provided value is too large.
     */
    fun pageSize(): Long = pageSize

    /** Filter verification requests by business name */
    fun businessName(): Optional<String> = Optional.ofNullable(businessName)

    fun dateEnd(): Optional<OffsetDateTime> = Optional.ofNullable(dateEnd)

    fun dateStart(): Optional<OffsetDateTime> = Optional.ofNullable(dateStart)

    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /** Tollfree verification status */
    fun status(): Optional<TfVerificationStatus> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RequestListParams].
         *
         * The following fields are required:
         * ```java
         * .page()
         * .pageSize()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequestListParams]. */
    class Builder internal constructor() {

        private var page: Long? = null
        private var pageSize: Long? = null
        private var businessName: String? = null
        private var dateEnd: OffsetDateTime? = null
        private var dateStart: OffsetDateTime? = null
        private var phoneNumber: String? = null
        private var status: TfVerificationStatus? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(requestListParams: RequestListParams) = apply {
            page = requestListParams.page
            pageSize = requestListParams.pageSize
            businessName = requestListParams.businessName
            dateEnd = requestListParams.dateEnd
            dateStart = requestListParams.dateStart
            phoneNumber = requestListParams.phoneNumber
            status = requestListParams.status
            additionalHeaders = requestListParams.additionalHeaders.toBuilder()
            additionalQueryParams = requestListParams.additionalQueryParams.toBuilder()
        }

        fun page(page: Long) = apply { this.page = page }

        /**
         *         Request this many records per page
         *         This value is automatically clamped if the provided value is too large.
         */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /** Filter verification requests by business name */
        fun businessName(businessName: String?) = apply { this.businessName = businessName }

        /** Alias for calling [Builder.businessName] with `businessName.orElse(null)`. */
        fun businessName(businessName: Optional<String>) = businessName(businessName.getOrNull())

        fun dateEnd(dateEnd: OffsetDateTime?) = apply { this.dateEnd = dateEnd }

        /** Alias for calling [Builder.dateEnd] with `dateEnd.orElse(null)`. */
        fun dateEnd(dateEnd: Optional<OffsetDateTime>) = dateEnd(dateEnd.getOrNull())

        fun dateStart(dateStart: OffsetDateTime?) = apply { this.dateStart = dateStart }

        /** Alias for calling [Builder.dateStart] with `dateStart.orElse(null)`. */
        fun dateStart(dateStart: Optional<OffsetDateTime>) = dateStart(dateStart.getOrNull())

        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /** Tollfree verification status */
        fun status(status: TfVerificationStatus?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<TfVerificationStatus>) = status(status.getOrNull())

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
         * Returns an immutable instance of [RequestListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .page()
         * .pageSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequestListParams =
            RequestListParams(
                checkRequired("page", page),
                checkRequired("pageSize", pageSize),
                businessName,
                dateEnd,
                dateStart,
                phoneNumber,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("page", page.toString())
                put("page_size", pageSize.toString())
                businessName?.let { put("business_name", it) }
                dateEnd?.let { put("date_end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                dateStart?.let {
                    put("date_start", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                phoneNumber?.let { put("phone_number", it) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequestListParams &&
            page == other.page &&
            pageSize == other.pageSize &&
            businessName == other.businessName &&
            dateEnd == other.dateEnd &&
            dateStart == other.dateStart &&
            phoneNumber == other.phoneNumber &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            page,
            pageSize,
            businessName,
            dateEnd,
            dateStart,
            phoneNumber,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RequestListParams{page=$page, pageSize=$pageSize, businessName=$businessName, dateEnd=$dateEnd, dateStart=$dateStart, phoneNumber=$phoneNumber, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
