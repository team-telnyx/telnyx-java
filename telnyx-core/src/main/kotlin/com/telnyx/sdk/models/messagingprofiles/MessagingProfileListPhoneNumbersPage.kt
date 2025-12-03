// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.MessagingProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingProfileService.listPhoneNumbers */
class MessagingProfileListPhoneNumbersPage
private constructor(
    private val service: MessagingProfileService,
    private val params: MessagingProfileListPhoneNumbersParams,
    private val response: MessagingProfileListPhoneNumbersPageResponse,
) : Page<PhoneNumberWithMessagingSettings> {

    /**
     * Delegates to [MessagingProfileListPhoneNumbersPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListPhoneNumbersPageResponse.data
     */
    fun data(): List<PhoneNumberWithMessagingSettings> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingProfileListPhoneNumbersPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingProfileListPhoneNumbersPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PhoneNumberWithMessagingSettings> = data()

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

    fun nextPageParams(): MessagingProfileListPhoneNumbersParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingProfileListPhoneNumbersPage =
        service.listPhoneNumbers(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberWithMessagingSettings> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingProfileListPhoneNumbersParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingProfileListPhoneNumbersPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingProfileListPhoneNumbersPage].
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

    /** A builder for [MessagingProfileListPhoneNumbersPage]. */
    class Builder internal constructor() {

        private var service: MessagingProfileService? = null
        private var params: MessagingProfileListPhoneNumbersParams? = null
        private var response: MessagingProfileListPhoneNumbersPageResponse? = null

        @JvmSynthetic
        internal fun from(
            messagingProfileListPhoneNumbersPage: MessagingProfileListPhoneNumbersPage
        ) = apply {
            service = messagingProfileListPhoneNumbersPage.service
            params = messagingProfileListPhoneNumbersPage.params
            response = messagingProfileListPhoneNumbersPage.response
        }

        fun service(service: MessagingProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingProfileListPhoneNumbersParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingProfileListPhoneNumbersPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingProfileListPhoneNumbersPage].
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
        fun build(): MessagingProfileListPhoneNumbersPage =
            MessagingProfileListPhoneNumbersPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfileListPhoneNumbersPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingProfileListPhoneNumbersPage{service=$service, params=$params, response=$response}"
}
