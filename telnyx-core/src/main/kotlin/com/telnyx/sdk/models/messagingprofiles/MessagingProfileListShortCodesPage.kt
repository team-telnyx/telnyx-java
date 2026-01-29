// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.ShortCode
import com.telnyx.sdk.services.blocking.MessagingProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileService.listShortCodes */
class MessagingProfileListShortCodesPage
private constructor(
    private val service: MessagingProfileService,
    private val params: MessagingProfileListShortCodesParams,
    private val response: MessagingProfileListShortCodesPageResponse,
) : Page<ShortCode> {

    /**
     * Delegates to [MessagingProfileListShortCodesPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListShortCodesPageResponse.data
     */
    fun data(): List<ShortCode> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListShortCodesPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListShortCodesPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ShortCode> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingProfileListShortCodesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingProfileListShortCodesPage =
        service.listShortCodes(nextPageParams())

    fun autoPager(): AutoPager<ShortCode> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListShortCodesParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListShortCodesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListShortCodesPage].
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

    /** A builder for [MessagingProfileListShortCodesPage]. */
    class Builder internal constructor() {

        private var service: MessagingProfileService? = null
        private var params: MessagingProfileListShortCodesParams? = null
        private var response: MessagingProfileListShortCodesPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingProfileListShortCodesPage: MessagingProfileListShortCodesPage) =
            apply {
                service = messagingProfileListShortCodesPage.service
                params = messagingProfileListShortCodesPage.params
                response = messagingProfileListShortCodesPage.response
            }

        fun service(service: MessagingProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListShortCodesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListShortCodesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListShortCodesPage].
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
        fun build(): MessagingProfileListShortCodesPage =
            MessagingProfileListShortCodesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfileListShortCodesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingProfileListShortCodesPage{service=$service, params=$params, response=$response}"
}
