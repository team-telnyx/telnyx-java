// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.OutboundVoiceProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OutboundVoiceProfileService.list */
class OutboundVoiceProfileListPage
private constructor(
    private val service: OutboundVoiceProfileService,
    private val params: OutboundVoiceProfileListParams,
    private val response: OutboundVoiceProfileListPageResponse,
) : Page<OutboundVoiceProfile> {

    /**
     * Delegates to [OutboundVoiceProfileListPageResponse], but gracefully handles missing data.
     *
     * @see OutboundVoiceProfileListPageResponse.data
     */
    fun data(): List<OutboundVoiceProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OutboundVoiceProfileListPageResponse], but gracefully handles missing data.
     *
     * @see OutboundVoiceProfileListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<OutboundVoiceProfile> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): OutboundVoiceProfileListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): OutboundVoiceProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OutboundVoiceProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OutboundVoiceProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): OutboundVoiceProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OutboundVoiceProfileListPage].
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

    /** A builder for [OutboundVoiceProfileListPage]. */
    class Builder internal constructor() {

        private var service: OutboundVoiceProfileService? = null
        private var params: OutboundVoiceProfileListParams? = null
        private var response: OutboundVoiceProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(outboundVoiceProfileListPage: OutboundVoiceProfileListPage) = apply {
            service = outboundVoiceProfileListPage.service
            params = outboundVoiceProfileListPage.params
            response = outboundVoiceProfileListPage.response
        }

        fun service(service: OutboundVoiceProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OutboundVoiceProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OutboundVoiceProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OutboundVoiceProfileListPage].
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
        fun build(): OutboundVoiceProfileListPage =
            OutboundVoiceProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutboundVoiceProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OutboundVoiceProfileListPage{service=$service, params=$params, response=$response}"
}
