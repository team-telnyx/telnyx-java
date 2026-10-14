// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List finished WhatsApp Embedded Signup sessions, with status `SUCCESS` or `FAILURE`, newest
 * first. Use the `errors` of a failed session to see why provisioning stopped.
 */
class SignupListParams
private constructor(
    private val filterCreatedAtGte: OffsetDateTime?,
    private val filterCreatedAtLte: OffsetDateTime?,
    private val filterCustomerId: String?,
    private val filterWabaId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Return sessions created at or after this time (RFC 3339) */
    fun filterCreatedAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(filterCreatedAtGte)

    /** Return sessions created at or before this time (RFC 3339) */
    fun filterCreatedAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(filterCreatedAtLte)

    /** Filter by the tech provider customer reference */
    fun filterCustomerId(): Optional<String> = Optional.ofNullable(filterCustomerId)

    /** Filter by Meta WABA ID */
    fun filterWabaId(): Optional<String> = Optional.ofNullable(filterWabaId)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SignupListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SignupListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SignupListParams]. */
    class Builder internal constructor() {

        private var filterCreatedAtGte: OffsetDateTime? = null
        private var filterCreatedAtLte: OffsetDateTime? = null
        private var filterCustomerId: String? = null
        private var filterWabaId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(signupListParams: SignupListParams) = apply {
            filterCreatedAtGte = signupListParams.filterCreatedAtGte
            filterCreatedAtLte = signupListParams.filterCreatedAtLte
            filterCustomerId = signupListParams.filterCustomerId
            filterWabaId = signupListParams.filterWabaId
            pageNumber = signupListParams.pageNumber
            pageSize = signupListParams.pageSize
            additionalHeaders = signupListParams.additionalHeaders.toBuilder()
            additionalQueryParams = signupListParams.additionalQueryParams.toBuilder()
        }

        /** Return sessions created at or after this time (RFC 3339) */
        fun filterCreatedAtGte(filterCreatedAtGte: OffsetDateTime?) = apply {
            this.filterCreatedAtGte = filterCreatedAtGte
        }

        /**
         * Alias for calling [Builder.filterCreatedAtGte] with `filterCreatedAtGte.orElse(null)`.
         */
        fun filterCreatedAtGte(filterCreatedAtGte: Optional<OffsetDateTime>) =
            filterCreatedAtGte(filterCreatedAtGte.getOrNull())

        /** Return sessions created at or before this time (RFC 3339) */
        fun filterCreatedAtLte(filterCreatedAtLte: OffsetDateTime?) = apply {
            this.filterCreatedAtLte = filterCreatedAtLte
        }

        /**
         * Alias for calling [Builder.filterCreatedAtLte] with `filterCreatedAtLte.orElse(null)`.
         */
        fun filterCreatedAtLte(filterCreatedAtLte: Optional<OffsetDateTime>) =
            filterCreatedAtLte(filterCreatedAtLte.getOrNull())

        /** Filter by the tech provider customer reference */
        fun filterCustomerId(filterCustomerId: String?) = apply {
            this.filterCustomerId = filterCustomerId
        }

        /** Alias for calling [Builder.filterCustomerId] with `filterCustomerId.orElse(null)`. */
        fun filterCustomerId(filterCustomerId: Optional<String>) =
            filterCustomerId(filterCustomerId.getOrNull())

        /** Filter by Meta WABA ID */
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
         * Returns an immutable instance of [SignupListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SignupListParams =
            SignupListParams(
                filterCreatedAtGte,
                filterCreatedAtLte,
                filterCustomerId,
                filterWabaId,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterCreatedAtGte?.let {
                    put(
                        "filter[created_at][gte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterCreatedAtLte?.let {
                    put(
                        "filter[created_at][lte]",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                    )
                }
                filterCustomerId?.let { put("filter[customer_id]", it) }
                filterWabaId?.let { put("filter[waba_id]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignupListParams &&
            filterCreatedAtGte == other.filterCreatedAtGte &&
            filterCreatedAtLte == other.filterCreatedAtLte &&
            filterCustomerId == other.filterCustomerId &&
            filterWabaId == other.filterWabaId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterCreatedAtGte,
            filterCreatedAtLte,
            filterCustomerId,
            filterWabaId,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SignupListParams{filterCreatedAtGte=$filterCreatedAtGte, filterCreatedAtLte=$filterCreatedAtLte, filterCustomerId=$filterCustomerId, filterWabaId=$filterWabaId, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
