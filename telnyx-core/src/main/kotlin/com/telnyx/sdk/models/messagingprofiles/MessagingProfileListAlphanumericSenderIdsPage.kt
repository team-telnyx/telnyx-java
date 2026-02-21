// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.MessagingProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileService.listAlphanumericSenderIds */
class MessagingProfileListAlphanumericSenderIdsPage
private constructor(
    private val service: MessagingProfileService,
    private val params: MessagingProfileListAlphanumericSenderIdsParams,
    private val response: MessagingProfileListAlphanumericSenderIdsPageResponse,
) : Page<MessagingProfileListAlphanumericSenderIdsResponse> {

    /**
     * Delegates to [MessagingProfileListAlphanumericSenderIdsPageResponse], but gracefully handles
     * missing data.
     *
     * @see MessagingProfileListAlphanumericSenderIdsPageResponse.data
     */
    fun data(): List<MessagingProfileListAlphanumericSenderIdsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListAlphanumericSenderIdsPageResponse], but gracefully handles
     * missing data.
     *
     * @see MessagingProfileListAlphanumericSenderIdsPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingProfileListAlphanumericSenderIdsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingProfileListAlphanumericSenderIdsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingProfileListAlphanumericSenderIdsPage =
        service.listAlphanumericSenderIds(nextPageParams())

    fun autoPager(): AutoPager<MessagingProfileListAlphanumericSenderIdsResponse> =
        AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListAlphanumericSenderIdsParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListAlphanumericSenderIdsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListAlphanumericSenderIdsPage].
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

    /** A builder for [MessagingProfileListAlphanumericSenderIdsPage]. */
    class Builder internal constructor() {

        private var service: MessagingProfileService? = null
        private var params: MessagingProfileListAlphanumericSenderIdsParams? = null
        private var response: MessagingProfileListAlphanumericSenderIdsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            messagingProfileListAlphanumericSenderIdsPage:
                MessagingProfileListAlphanumericSenderIdsPage
        ) = apply {
            service = messagingProfileListAlphanumericSenderIdsPage.service
            params = messagingProfileListAlphanumericSenderIdsPage.params
            response = messagingProfileListAlphanumericSenderIdsPage.response
        }

        fun service(service: MessagingProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListAlphanumericSenderIdsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListAlphanumericSenderIdsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListAlphanumericSenderIdsPage].
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
        fun build(): MessagingProfileListAlphanumericSenderIdsPage =
            MessagingProfileListAlphanumericSenderIdsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfileListAlphanumericSenderIdsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingProfileListAlphanumericSenderIdsPage{service=$service, params=$params, response=$response}"
}
