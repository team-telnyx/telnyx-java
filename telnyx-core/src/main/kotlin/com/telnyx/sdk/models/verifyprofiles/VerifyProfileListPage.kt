// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.verifications.byphonenumber.VerifyMeta
import com.telnyx.sdk.services.blocking.VerifyProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VerifyProfileService.list */
class VerifyProfileListPage
private constructor(
    private val service: VerifyProfileService,
    private val params: VerifyProfileListParams,
    private val response: VerifyProfileListPageResponse,
) : Page<VerifyProfile> {

    /**
     * Delegates to [VerifyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyProfileListPageResponse.data
     */
    fun data(): List<VerifyProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerifyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyProfileListPageResponse.meta
     */
    fun meta(): Optional<VerifyMeta> = response._meta().getOptional("meta")

    override fun items(): List<VerifyProfile> = data()

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

    fun nextPageParams(): VerifyProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VerifyProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VerifyProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VerifyProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerifyProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifyProfileListPage].
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

    /** A builder for [VerifyProfileListPage]. */
    class Builder internal constructor() {

        private var service: VerifyProfileService? = null
        private var params: VerifyProfileListParams? = null
        private var response: VerifyProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(verifyProfileListPage: VerifyProfileListPage) = apply {
            service = verifyProfileListPage.service
            params = verifyProfileListPage.params
            response = verifyProfileListPage.response
        }

        fun service(service: VerifyProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VerifyProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerifyProfileListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerifyProfileListPage].
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
        fun build(): VerifyProfileListPage =
            VerifyProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerifyProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VerifyProfileListPage{service=$service, params=$params, response=$response}"
}
