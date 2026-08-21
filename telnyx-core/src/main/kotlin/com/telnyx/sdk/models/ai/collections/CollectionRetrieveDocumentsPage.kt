// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ai.CollectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CollectionService.retrieveDocuments */
class CollectionRetrieveDocumentsPage
private constructor(
    private val service: CollectionService,
    private val params: CollectionRetrieveDocumentsParams,
    private val response: CollectionRetrieveDocumentsPageResponse,
) : Page<CollectionRetrieveDocumentsResponse> {

    /**
     * Delegates to [CollectionRetrieveDocumentsPageResponse], but gracefully handles missing data.
     *
     * @see CollectionRetrieveDocumentsPageResponse.data
     */
    fun data(): List<CollectionRetrieveDocumentsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionRetrieveDocumentsPageResponse], but gracefully handles missing data.
     *
     * @see CollectionRetrieveDocumentsPageResponse.meta
     */
    fun meta(): Optional<CollectionRetrieveDocumentsPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<CollectionRetrieveDocumentsResponse> = data()

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

    fun nextPageParams(): CollectionRetrieveDocumentsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CollectionRetrieveDocumentsPage =
        service.retrieveDocuments(nextPageParams())

    fun autoPager(): AutoPager<CollectionRetrieveDocumentsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CollectionRetrieveDocumentsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionRetrieveDocumentsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CollectionRetrieveDocumentsPage].
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

    /** A builder for [CollectionRetrieveDocumentsPage]. */
    class Builder internal constructor() {

        private var service: CollectionService? = null
        private var params: CollectionRetrieveDocumentsParams? = null
        private var response: CollectionRetrieveDocumentsPageResponse? = null

        @JvmSynthetic
        internal fun from(collectionRetrieveDocumentsPage: CollectionRetrieveDocumentsPage) =
            apply {
                service = collectionRetrieveDocumentsPage.service
                params = collectionRetrieveDocumentsPage.params
                response = collectionRetrieveDocumentsPage.response
            }

        fun service(service: CollectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CollectionRetrieveDocumentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionRetrieveDocumentsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CollectionRetrieveDocumentsPage].
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
        fun build(): CollectionRetrieveDocumentsPage =
            CollectionRetrieveDocumentsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectionRetrieveDocumentsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CollectionRetrieveDocumentsPage{service=$service, params=$params, response=$response}"
}
