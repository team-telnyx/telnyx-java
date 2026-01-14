// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.TexmlApplicationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TexmlApplicationService.list */
class TexmlApplicationListPage
private constructor(
    private val service: TexmlApplicationService,
    private val params: TexmlApplicationListParams,
    private val response: TexmlApplicationListPageResponse,
) : Page<TexmlApplication> {

    /**
     * Delegates to [TexmlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see TexmlApplicationListPageResponse.data
     */
    fun data(): List<TexmlApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TexmlApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see TexmlApplicationListPageResponse.meta
     */
    fun meta(): Optional<TexmlApplicationListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<TexmlApplication> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TexmlApplicationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): TexmlApplicationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TexmlApplication> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TexmlApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): TexmlApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TexmlApplicationListPage].
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

    /** A builder for [TexmlApplicationListPage]. */
    class Builder internal constructor() {

        private var service: TexmlApplicationService? = null
        private var params: TexmlApplicationListParams? = null
        private var response: TexmlApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(texmlApplicationListPage: TexmlApplicationListPage) = apply {
            service = texmlApplicationListPage.service
            params = texmlApplicationListPage.params
            response = texmlApplicationListPage.response
        }

        fun service(service: TexmlApplicationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TexmlApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TexmlApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TexmlApplicationListPage].
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
        fun build(): TexmlApplicationListPage =
            TexmlApplicationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TexmlApplicationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TexmlApplicationListPage{service=$service, params=$params, response=$response}"
}
