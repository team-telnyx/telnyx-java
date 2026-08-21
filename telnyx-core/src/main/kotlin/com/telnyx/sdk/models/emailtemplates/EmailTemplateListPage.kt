// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import com.telnyx.sdk.services.blocking.EmailTemplateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EmailTemplateService.list */
class EmailTemplateListPage
private constructor(
    private val service: EmailTemplateService,
    private val params: EmailTemplateListParams,
    private val response: EmailTemplateListPageResponse,
) : Page<EmailTemplate> {

    /**
     * Delegates to [EmailTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see EmailTemplateListPageResponse.data
     */
    fun data(): List<EmailTemplate> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EmailTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see EmailTemplateListPageResponse.meta
     */
    fun meta(): Optional<EmailPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<EmailTemplate> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .isPresent

    fun nextPageParams(): EmailTemplateListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageCursor().getOptional("page_cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageCursor(nextCursor).build()
    }

    override fun nextPage(): EmailTemplateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EmailTemplate> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EmailTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): EmailTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmailTemplateListPage].
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

    /** A builder for [EmailTemplateListPage]. */
    class Builder internal constructor() {

        private var service: EmailTemplateService? = null
        private var params: EmailTemplateListParams? = null
        private var response: EmailTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(emailTemplateListPage: EmailTemplateListPage) = apply {
            service = emailTemplateListPage.service
            params = emailTemplateListPage.params
            response = emailTemplateListPage.response
        }

        fun service(service: EmailTemplateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EmailTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EmailTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EmailTemplateListPage].
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
        fun build(): EmailTemplateListPage =
            EmailTemplateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailTemplateListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EmailTemplateListPage{service=$service, params=$params, response=$response}"
}
