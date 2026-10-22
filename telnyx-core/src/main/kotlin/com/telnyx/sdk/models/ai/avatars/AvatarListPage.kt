// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ai.AvatarService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AvatarService.list */
class AvatarListPage
private constructor(
    private val service: AvatarService,
    private val params: AvatarListParams,
    private val response: AvatarListPageResponse,
) : Page<Avatar> {

    /**
     * Delegates to [AvatarListPageResponse], but gracefully handles missing data.
     *
     * @see AvatarListPageResponse.data
     */
    fun data(): List<Avatar> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AvatarListPageResponse], but gracefully handles missing data.
     *
     * @see AvatarListPageResponse.meta
     */
    fun meta(): Optional<AvatarListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<Avatar> = data()

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

    fun nextPageParams(): AvatarListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): AvatarListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Avatar> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AvatarListParams = params

    /** The response that this page was parsed from. */
    fun response(): AvatarListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AvatarListPage].
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

    /** A builder for [AvatarListPage]. */
    class Builder internal constructor() {

        private var service: AvatarService? = null
        private var params: AvatarListParams? = null
        private var response: AvatarListPageResponse? = null

        @JvmSynthetic
        internal fun from(avatarListPage: AvatarListPage) = apply {
            service = avatarListPage.service
            params = avatarListPage.params
            response = avatarListPage.response
        }

        fun service(service: AvatarService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AvatarListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AvatarListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AvatarListPage].
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
        fun build(): AvatarListPage =
            AvatarListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvatarListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "AvatarListPage{service=$service, params=$params, response=$response}"
}
