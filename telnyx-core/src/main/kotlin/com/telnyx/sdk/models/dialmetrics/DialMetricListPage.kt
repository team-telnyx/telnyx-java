// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.DialMetricService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DialMetricService.list */
class DialMetricListPage
private constructor(
    private val service: DialMetricService,
    private val params: DialMetricListParams,
    private val response: DialMetricListPageResponse,
) : Page<DialMetricListResponse> {

    /**
     * Delegates to [DialMetricListPageResponse], but gracefully handles missing data.
     *
     * @see DialMetricListPageResponse.data
     */
    fun data(): List<DialMetricListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DialMetricListPageResponse], but gracefully handles missing data.
     *
     * @see DialMetricListPageResponse.meta
     */
    fun meta(): Optional<DialMetricListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<DialMetricListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): DialMetricListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): DialMetricListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DialMetricListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DialMetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): DialMetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DialMetricListPage].
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

    /** A builder for [DialMetricListPage]. */
    class Builder internal constructor() {

        private var service: DialMetricService? = null
        private var params: DialMetricListParams? = null
        private var response: DialMetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(dialMetricListPage: DialMetricListPage) = apply {
            service = dialMetricListPage.service
            params = dialMetricListPage.params
            response = dialMetricListPage.response
        }

        fun service(service: DialMetricService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DialMetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DialMetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DialMetricListPage].
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
        fun build(): DialMetricListPage =
            DialMetricListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DialMetricListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DialMetricListPage{service=$service, params=$params, response=$response}"
}
