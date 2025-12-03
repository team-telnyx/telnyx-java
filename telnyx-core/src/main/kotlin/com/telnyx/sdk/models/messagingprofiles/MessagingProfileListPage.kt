// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.MessagingProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileService.list */
class MessagingProfileListPage
private constructor(
    private val service: MessagingProfileService,
    private val params: MessagingProfileListParams,
    private val response: MessagingProfileListPageResponse,
) : Page<MessagingProfile> {

    /**
     * Delegates to [MessagingProfileListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingProfileListPageResponse.data
     */
    fun data(): List<MessagingProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingProfileListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingProfile> = data()

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

    fun nextPageParams(): MessagingProfileListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MessagingProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessagingProfileListPage].
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

    /** A builder for [MessagingProfileListPage]. */
    class Builder internal constructor() {

        private var service: MessagingProfileService? = null
        private var params: MessagingProfileListParams? = null
        private var response: MessagingProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingProfileListPage: MessagingProfileListPage) = apply {
            service = messagingProfileListPage.service
            params = messagingProfileListPage.params
            response = messagingProfileListPage.response
        }

        fun service(service: MessagingProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListPage].
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
        fun build(): MessagingProfileListPage =
            MessagingProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingProfileListPage{service=$service, params=$params, response=$response}"
}
