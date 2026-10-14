// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.whatsapp.SignupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SignupService.list */
class SignupListPage
private constructor(
    private val service: SignupService,
    private val params: SignupListParams,
    private val response: SignupListPageResponse,
) : Page<SignupListResponse> {

    /**
     * Delegates to [SignupListPageResponse], but gracefully handles missing data.
     *
     * @see SignupListPageResponse.data
     */
    fun data(): List<SignupListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SignupListPageResponse], but gracefully handles missing data.
     *
     * @see SignupListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SignupListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SignupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SignupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SignupListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SignupListParams = params

    /** The response that this page was parsed from. */
    fun response(): SignupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SignupListPage].
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

    /** A builder for [SignupListPage]. */
    class Builder internal constructor() {

        private var service: SignupService? = null
        private var params: SignupListParams? = null
        private var response: SignupListPageResponse? = null

        @JvmSynthetic
        internal fun from(signupListPage: SignupListPage) = apply {
            service = signupListPage.service
            params = signupListPage.params
            response = signupListPage.response
        }

        fun service(service: SignupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SignupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SignupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SignupListPage].
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
        fun build(): SignupListPage =
            SignupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "SignupListPage{service=$service, params=$params, response=$response}"
}
