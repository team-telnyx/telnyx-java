// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.VoiceCloneService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VoiceCloneService.list */
class VoiceCloneListPage
private constructor(
    private val service: VoiceCloneService,
    private val params: VoiceCloneListParams,
    private val response: VoiceCloneListPageResponse,
) : Page<VoiceCloneListResponse> {

    /**
     * Delegates to [VoiceCloneListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceCloneListPageResponse.data
     */
    fun data(): List<VoiceCloneListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VoiceCloneListPageResponse], but gracefully handles missing data.
     *
     * @see VoiceCloneListPageResponse.meta
     */
    fun meta(): Optional<VoiceCloneListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<VoiceCloneListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VoiceCloneListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VoiceCloneListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VoiceCloneListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VoiceCloneListParams = params

    /** The response that this page was parsed from. */
    fun response(): VoiceCloneListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VoiceCloneListPage].
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

    /** A builder for [VoiceCloneListPage]. */
    class Builder internal constructor() {

        private var service: VoiceCloneService? = null
        private var params: VoiceCloneListParams? = null
        private var response: VoiceCloneListPageResponse? = null

        @JvmSynthetic
        internal fun from(voiceCloneListPage: VoiceCloneListPage) = apply {
            service = voiceCloneListPage.service
            params = voiceCloneListPage.params
            response = voiceCloneListPage.response
        }

        fun service(service: VoiceCloneService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VoiceCloneListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VoiceCloneListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VoiceCloneListPage].
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
        fun build(): VoiceCloneListPage =
            VoiceCloneListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VoiceCloneListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VoiceCloneListPage{service=$service, params=$params, response=$response}"
}
