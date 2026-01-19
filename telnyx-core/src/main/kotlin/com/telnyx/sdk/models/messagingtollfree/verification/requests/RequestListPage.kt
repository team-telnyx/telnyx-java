// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.messagingtollfree.verification.RequestService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RequestService.list */
class RequestListPage
private constructor(
    private val service: RequestService,
    private val params: RequestListParams,
    private val response: RequestListPageResponse,
) : Page<VerificationRequestStatus> {

    /**
     * Delegates to [RequestListPageResponse], but gracefully handles missing data.
     *
     * @see RequestListPageResponse.records
     */
    fun records(): List<VerificationRequestStatus> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [RequestListPageResponse], but gracefully handles missing data.
     *
     * @see RequestListPageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("total_records")

    override fun items(): List<VerificationRequestStatus> = records()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RequestListParams {
        val pageNumber = params.page() // cc workaround for SDK-4053
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): RequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VerificationRequestStatus> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): RequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RequestListPage].
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

    /** A builder for [RequestListPage]. */
    class Builder internal constructor() {

        private var service: RequestService? = null
        private var params: RequestListParams? = null
        private var response: RequestListPageResponse? = null

        @JvmSynthetic
        internal fun from(requestListPage: RequestListPage) = apply {
            service = requestListPage.service
            params = requestListPage.params
            response = requestListPage.response
        }

        fun service(service: RequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RequestListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RequestListPage].
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
        fun build(): RequestListPage =
            RequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequestListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RequestListPage{service=$service, params=$params, response=$response}"
}
