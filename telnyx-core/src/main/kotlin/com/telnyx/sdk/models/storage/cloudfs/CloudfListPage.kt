// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.storage.CloudfService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CloudfService.list */
class CloudfListPage
private constructor(
    private val service: CloudfService,
    private val params: CloudfListParams,
    private val response: CloudfListPageResponse,
) : Page<CloudfListResponse> {

    /**
     * Delegates to [CloudfListPageResponse], but gracefully handles missing data.
     *
     * @see CloudfListPageResponse.data
     */
    fun data(): List<CloudfListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CloudfListPageResponse], but gracefully handles missing data.
     *
     * @see CloudfListPageResponse.meta
     */
    fun meta(): Optional<CloudfListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<CloudfListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): CloudfListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursors().getOptional("cursors") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageAfter(nextCursor).build()
    }

    override fun nextPage(): CloudfListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CloudfListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CloudfListParams = params

    /** The response that this page was parsed from. */
    fun response(): CloudfListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CloudfListPage].
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

    /** A builder for [CloudfListPage]. */
    class Builder internal constructor() {

        private var service: CloudfService? = null
        private var params: CloudfListParams? = null
        private var response: CloudfListPageResponse? = null

        @JvmSynthetic
        internal fun from(cloudfListPage: CloudfListPage) = apply {
            service = cloudfListPage.service
            params = cloudfListPage.params
            response = cloudfListPage.response
        }

        fun service(service: CloudfService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CloudfListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CloudfListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CloudfListPage].
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
        fun build(): CloudfListPage =
            CloudfListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudfListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CloudfListPage{service=$service, params=$params, response=$response}"
}
