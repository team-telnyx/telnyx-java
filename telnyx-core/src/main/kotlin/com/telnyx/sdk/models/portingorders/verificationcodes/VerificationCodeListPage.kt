// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.verificationcodes

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.portingorders.VerificationCodeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VerificationCodeService.list */
class VerificationCodeListPage
private constructor(
    private val service: VerificationCodeService,
    private val params: VerificationCodeListParams,
    private val response: VerificationCodeListPageResponse,
) : Page<VerificationCodeListResponse> {

    /**
     * Delegates to [VerificationCodeListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationCodeListPageResponse.data
     */
    fun data(): List<VerificationCodeListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerificationCodeListPageResponse], but gracefully handles missing data.
     *
     * @see VerificationCodeListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<VerificationCodeListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VerificationCodeListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VerificationCodeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VerificationCodeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VerificationCodeListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerificationCodeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerificationCodeListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationCodeListPage]. */
    class Builder internal constructor() {

        private var service: VerificationCodeService? = null
        private var params: VerificationCodeListParams? = null
        private var response: VerificationCodeListPageResponse? = null

        @JvmSynthetic
        internal fun from(verificationCodeListPage: VerificationCodeListPage) = apply {
            service = verificationCodeListPage.service
            params = verificationCodeListPage.params
            response = verificationCodeListPage.response
        }

        fun service(service: VerificationCodeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VerificationCodeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerificationCodeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VerificationCodeListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationCodeListPage =
            VerificationCodeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationCodeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VerificationCodeListPage{service=$service, params=$params, response=$response}"
}
