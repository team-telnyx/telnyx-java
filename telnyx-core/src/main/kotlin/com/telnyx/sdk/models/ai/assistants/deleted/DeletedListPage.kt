// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.deleted

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.assistants.DeletedService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DeletedService.list */
class DeletedListPage
private constructor(
    private val service: DeletedService,
    private val params: DeletedListParams,
    private val response: DeletedListPageResponse,
) : Page<DeletedAssistant> {

    /**
     * Delegates to [DeletedListPageResponse], but gracefully handles missing data.
     *
     * @see DeletedListPageResponse.data
     */
    fun data(): List<DeletedAssistant> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DeletedListPageResponse], but gracefully handles missing data.
     *
     * @see DeletedListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<DeletedAssistant> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DeletedListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): DeletedListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DeletedAssistant> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DeletedListParams = params

    /** The response that this page was parsed from. */
    fun response(): DeletedListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeletedListPage].
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

    /** A builder for [DeletedListPage]. */
    class Builder internal constructor() {

        private var service: DeletedService? = null
        private var params: DeletedListParams? = null
        private var response: DeletedListPageResponse? = null

        @JvmSynthetic
        internal fun from(deletedListPage: DeletedListPage) = apply {
            service = deletedListPage.service
            params = deletedListPage.params
            response = deletedListPage.response
        }

        fun service(service: DeletedService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DeletedListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DeletedListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DeletedListPage].
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
        fun build(): DeletedListPage =
            DeletedListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeletedListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DeletedListPage{service=$service, params=$params, response=$response}"
}
