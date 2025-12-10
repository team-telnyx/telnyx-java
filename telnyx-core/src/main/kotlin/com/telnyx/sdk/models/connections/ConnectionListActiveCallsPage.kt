// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ConnectionService.listActiveCalls */
class ConnectionListActiveCallsPage
private constructor(
    private val service: ConnectionService,
    private val params: ConnectionListActiveCallsParams,
    private val response: ConnectionListActiveCallsPageResponse,
) : Page<ConnectionListActiveCallsResponse> {

    /**
     * Delegates to [ConnectionListActiveCallsPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListActiveCallsPageResponse.data
     */
    fun data(): List<ConnectionListActiveCallsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ConnectionListActiveCallsPageResponse], but gracefully handles missing data.
     *
     * @see ConnectionListActiveCallsPageResponse.meta
     */
    fun meta(): Optional<ConnectionListActiveCallsPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<ConnectionListActiveCallsResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ConnectionListActiveCallsParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): ConnectionListActiveCallsPage =
        service.listActiveCalls(nextPageParams())

    fun autoPager(): AutoPager<ConnectionListActiveCallsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConnectionListActiveCallsParams = params

    /** The response that this page was parsed from. */
    fun response(): ConnectionListActiveCallsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ConnectionListActiveCallsPage].
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

    /** A builder for [ConnectionListActiveCallsPage]. */
    class Builder internal constructor() {

        private var service: ConnectionService? = null
        private var params: ConnectionListActiveCallsParams? = null
        private var response: ConnectionListActiveCallsPageResponse? = null

        @JvmSynthetic
        internal fun from(connectionListActiveCallsPage: ConnectionListActiveCallsPage) = apply {
            service = connectionListActiveCallsPage.service
            params = connectionListActiveCallsPage.params
            response = connectionListActiveCallsPage.response
        }

        fun service(service: ConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConnectionListActiveCallsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ConnectionListActiveCallsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ConnectionListActiveCallsPage].
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
        fun build(): ConnectionListActiveCallsPage =
            ConnectionListActiveCallsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConnectionListActiveCallsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ConnectionListActiveCallsPage{service=$service, params=$params, response=$response}"
}
