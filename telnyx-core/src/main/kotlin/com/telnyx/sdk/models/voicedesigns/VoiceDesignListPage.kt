// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.VoiceDesignService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceDesignService.list */
class VoiceDesignListPage
private constructor(
    private val service: VoiceDesignService,
    private val params: VoiceDesignListParams,
    private val response: VoiceDesignListPageResponse,
) : Page<VoiceDesignListResponse> {

    /**
     * Delegates to [VoiceDesignListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceDesignListPageResponse.data
     */
    fun data(): List<VoiceDesignListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VoiceDesignListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceDesignListPageResponse.meta
     */
    fun meta(): Optional<VoiceDesignListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<VoiceDesignListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VoiceDesignListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VoiceDesignListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VoiceDesignListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VoiceDesignListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceDesignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceDesignListPage].
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

    /** A builder for [VoiceDesignListPage]. */
    class Builder internal constructor() {

        private var service: VoiceDesignService? = null
        private var params: VoiceDesignListParams? = null
        private var response: VoiceDesignListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceDesignListPage: VoiceDesignListPage) = apply {
            service = voiceDesignListPage.service
            params = voiceDesignListPage.params
            response = voiceDesignListPage.response
        }

        fun service(service: VoiceDesignService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceDesignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceDesignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VoiceDesignListPage].
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
        fun build(): VoiceDesignListPage =
            VoiceDesignListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceDesignListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VoiceDesignListPage{service=$service, params=$params, response=$response}"
}
