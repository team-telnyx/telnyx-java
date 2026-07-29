// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emaildomains.webhooks.OffsetPaginationMeta
import com.telnyx.sdk.services.blocking.EmailDomainService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailDomainService.list */
class EmailDomainListPage
private constructor(
    private val service: EmailDomainService,
    private val params: EmailDomainListParams,
    private val response: EmailDomainListPageResponse,
) : Page<EmailDomain> {

    /**
     * Delegates to [EmailDomainListPageResponse], but gracefully handles missing data.
     *
     * @see EmailDomainListPageResponse.data
     */
    fun data(): List<EmailDomain> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailDomainListPageResponse], but gracefully handles missing data.
     *
     * @see EmailDomainListPageResponse.meta
     */
    fun meta(): Optional<EmailDomainListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<EmailDomain> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap {
                    it.accept(
                        object : EmailDomainListPageResponse.Meta.Visitor<Optional<Long>> {
                            override fun visitOffsetPagination(
                                offsetPagination: OffsetPaginationMeta
                            ): Optional<Long> =
                                offsetPagination._pageNumber().getOptional("page_number")

                            override fun visitEmailCursorPagination(
                                emailCursorPagination:
                                    EmailDomainListPageResponse.Meta.EmailCursorPaginationMeta
                            ): Optional<Long> = Optional.empty()
                        }
                    )
                }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap {
                    it.accept(
                        object : EmailDomainListPageResponse.Meta.Visitor<Optional<Long>> {
                            override fun visitOffsetPagination(
                                offsetPagination: OffsetPaginationMeta
                            ): Optional<Long> =
                                offsetPagination._totalPages().getOptional("total_pages")

                            override fun visitEmailCursorPagination(
                                emailCursorPagination:
                                    EmailDomainListPageResponse.Meta.EmailCursorPaginationMeta
                            ): Optional<Long> = Optional.empty()
                        }
                    )
                }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EmailDomainListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): EmailDomainListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailDomain> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailDomainListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailDomainListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailDomainListPage].
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

    /** A builder for [EmailDomainListPage]. */
    class Builder internal constructor() {

        private var service: EmailDomainService? = null
        private var params: EmailDomainListParams? = null
        private var response: EmailDomainListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailDomainListPage: EmailDomainListPage) = apply {
            service = emailDomainListPage.service
            params = emailDomainListPage.params
            response = emailDomainListPage.response
        }

        fun service(service: EmailDomainService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailDomainListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailDomainListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailDomainListPage].
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
        fun build(): EmailDomainListPage =
            EmailDomainListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDomainListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailDomainListPage{service=$service, params=$params, response=$response}"
}
