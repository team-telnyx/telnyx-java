// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.uploads

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import com.telnyx.sdk.services.blocking.externalconnections.UploadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UploadService.list */
class UploadListPage
private constructor(
    private val service: UploadService,
    private val params: UploadListParams,
    private val response: UploadListPageResponse,
) : Page<Upload> {

    /**
     * Delegates to [UploadListPageResponse], but gracefully handles missing data.
     *
     * @see UploadListPageResponse.data
     */
    fun data(): List<Upload> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UploadListPageResponse], but gracefully handles missing data.
     *
     * @see UploadListPageResponse.meta
     */
    fun meta(): Optional<ExternalVoiceIntegrationsPaginationMeta> =
        response._meta().getOptional("meta")

    override fun items(): List<Upload> = data()

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

    fun nextPageParams(): UploadListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): UploadListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Upload> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UploadListParams = params

    /** The response that this page was parsed from. */
    fun response(): UploadListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadListPage].
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

    /** A builder for [UploadListPage]. */
    class Builder internal constructor() {

        private var service: UploadService? = null
        private var params: UploadListParams? = null
        private var response: UploadListPageResponse? = null

        @JvmSynthetic
        internal fun from(uploadListPage: UploadListPage) = apply {
            service = uploadListPage.service
            params = uploadListPage.params
            response = uploadListPage.response
        }

        fun service(service: UploadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UploadListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UploadListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UploadListPage].
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
        fun build(): UploadListPage =
            UploadListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "UploadListPage{service=$service, params=$params, response=$response}"
}
