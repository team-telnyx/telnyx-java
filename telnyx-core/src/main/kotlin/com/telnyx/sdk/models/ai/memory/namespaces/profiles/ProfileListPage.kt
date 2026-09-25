// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.ProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ProfileService.list */
class ProfileListPage
private constructor(
    private val service: ProfileService,
    private val params: ProfileListParams,
    private val response: ProfileListPageResponse,
) : Page<ProfileListResponse> {

    /**
     * Delegates to [ProfileListPageResponse], but gracefully handles missing data.
     *
     * @see ProfileListPageResponse.data
     */
    fun data(): List<ProfileListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProfileListPageResponse], but gracefully handles missing data.
     *
     * @see ProfileListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<ProfileListResponse> = data()

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

    fun nextPageParams(): ProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ProfileListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProfileListPage].
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

    /** A builder for [ProfileListPage]. */
    class Builder internal constructor() {

        private var service: ProfileService? = null
        private var params: ProfileListParams? = null
        private var response: ProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(profileListPage: ProfileListPage) = apply {
            service = profileListPage.service
            params = profileListPage.params
            response = profileListPage.response
        }

        fun service(service: ProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProfileListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProfileListPage].
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
        fun build(): ProfileListPage =
            ProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProfileListPage{service=$service, params=$params, response=$response}"
}
