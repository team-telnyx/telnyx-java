// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.EmailBlockService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EmailBlockService.list */
class EmailBlockListPage
private constructor(
    private val service: EmailBlockService,
    private val params: EmailBlockListParams,
    private val response: EmailBlockListPageResponse,
) : Page<EmailBlock> {

    /**
     * Delegates to [EmailBlockListPageResponse], but gracefully handles missing data.
     *
     * @see EmailBlockListPageResponse.EmailBlockListOffsetResponse.data
     * @see EmailBlockListPageResponse.EmailBlockListCursorResponse.data
     */
    fun data(): List<EmailBlock> =
        response
            .accept(
                object : EmailBlockListPageResponse.Visitor<Optional<List<EmailBlock>>> {
                    override fun visitOffset(
                        offset: EmailBlockListPageResponse.EmailBlockListOffsetResponse
                    ): Optional<List<EmailBlock>> = offset._data().getOptional("data")

                    override fun visitCursor(
                        cursor: EmailBlockListPageResponse.EmailBlockListCursorResponse
                    ): Optional<List<EmailBlock>> = cursor._data().getOptional("data")
                }
            )
            .getOrNull() ?: emptyList()

    override fun items(): List<EmailBlock> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                .accept(
                    object : EmailBlockListPageResponse.Visitor<Optional<Long>> {
                        override fun visitOffset(
                            offset: EmailBlockListPageResponse.EmailBlockListOffsetResponse
                        ): Optional<Long> =
                            offset._meta().getOptional("meta").flatMap {
                                it._pageNumber().getOptional("page_number")
                            }

                        override fun visitCursor(
                            cursor: EmailBlockListPageResponse.EmailBlockListCursorResponse
                        ): Optional<Long> = Optional.empty()
                    }
                )
                .getOrDefault(1)
        val pageCount =
            response
                .accept(
                    object : EmailBlockListPageResponse.Visitor<Optional<Long>> {
                        override fun visitOffset(
                            offset: EmailBlockListPageResponse.EmailBlockListOffsetResponse
                        ): Optional<Long> =
                            offset._meta().getOptional("meta").flatMap {
                                it._totalPages().getOptional("total_pages")
                            }

                        override fun visitCursor(
                            cursor: EmailBlockListPageResponse.EmailBlockListCursorResponse
                        ): Optional<Long> = Optional.empty()
                    }
                )
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): EmailBlockListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): EmailBlockListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailBlock> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailBlockListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailBlockListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailBlockListPage].
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

    /** A builder for [EmailBlockListPage]. */
    class Builder internal constructor() {

        private var service: EmailBlockService? = null
        private var params: EmailBlockListParams? = null
        private var response: EmailBlockListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailBlockListPage: EmailBlockListPage) = apply {
            service = emailBlockListPage.service
            params = emailBlockListPage.params
            response = emailBlockListPage.response
        }

        fun service(service: EmailBlockService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailBlockListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailBlockListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailBlockListPage].
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
        fun build(): EmailBlockListPage =
            EmailBlockListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailBlockListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailBlockListPage{service=$service, params=$params, response=$response}"
}
