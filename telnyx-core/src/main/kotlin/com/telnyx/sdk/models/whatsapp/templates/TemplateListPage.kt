// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.models.WhatsappTemplateData
import com.telnyx.sdk.services.blocking.whatsapp.TemplateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TemplateService.list */
class TemplateListPage
private constructor(
    private val service: TemplateService,
    private val params: TemplateListParams,
    private val response: TemplateListPageResponse,
) : Page<WhatsappTemplateData> {

    /**
     * Delegates to [TemplateListPageResponse], but gracefully handles missing data.
     *
     * @see TemplateListPageResponse.data
     */
    fun data(): List<WhatsappTemplateData> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TemplateListPageResponse], but gracefully handles missing data.
     *
     * @see TemplateListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WhatsappTemplateData> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TemplateListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TemplateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WhatsappTemplateData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): TemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplateListPage].
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

    /** A builder for [TemplateListPage]. */
    class Builder internal constructor() {

        private var service: TemplateService? = null
        private var params: TemplateListParams? = null
        private var response: TemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(templateListPage: TemplateListPage) = apply {
            service = templateListPage.service
            params = templateListPage.params
            response = templateListPage.response
        }

        fun service(service: TemplateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TemplateListPage].
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
        fun build(): TemplateListPage =
            TemplateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TemplateListPage{service=$service, params=$params, response=$response}"
}
