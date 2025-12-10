// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.MobileVoiceConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobileVoiceConnectionService.list */
class MobileVoiceConnectionListPage
private constructor(
    private val service: MobileVoiceConnectionService,
    private val params: MobileVoiceConnectionListParams,
    private val response: MobileVoiceConnectionListPageResponse,
) : Page<MobileVoiceConnection> {

    /**
     * Delegates to [MobileVoiceConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see MobileVoiceConnectionListPageResponse.data
     */
    fun data(): List<MobileVoiceConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobileVoiceConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see MobileVoiceConnectionListPageResponse.meta
     */
    fun meta(): Optional<MobileVoiceConnectionListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<MobileVoiceConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): MobileVoiceConnectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MobileVoiceConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MobileVoiceConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MobileVoiceConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobileVoiceConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobileVoiceConnectionListPage].
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

    /** A builder for [MobileVoiceConnectionListPage]. */
    class Builder internal constructor() {

        private var service: MobileVoiceConnectionService? = null
        private var params: MobileVoiceConnectionListParams? = null
        private var response: MobileVoiceConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobileVoiceConnectionListPage: MobileVoiceConnectionListPage) = apply {
            service = mobileVoiceConnectionListPage.service
            params = mobileVoiceConnectionListPage.params
            response = mobileVoiceConnectionListPage.response
        }

        fun service(service: MobileVoiceConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MobileVoiceConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobileVoiceConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobileVoiceConnectionListPage].
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
        fun build(): MobileVoiceConnectionListPage =
            MobileVoiceConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobileVoiceConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MobileVoiceConnectionListPage{service=$service, params=$params, response=$response}"
}
