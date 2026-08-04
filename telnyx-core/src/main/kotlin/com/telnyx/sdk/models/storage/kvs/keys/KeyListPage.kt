// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.storage.kvs.KeyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see KeyService.list */
class KeyListPage
private constructor(
    private val service: KeyService,
    private val params: KeyListParams,
    private val response: KeyListPageResponse,
) : Page<KeyListResponse> {

    /**
     * Delegates to [KeyListPageResponse], but gracefully handles missing data.
     *
     * @see KeyListPageResponse.data
     */
    fun data(): List<KeyListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [KeyListPageResponse], but gracefully handles missing data.
     *
     * @see KeyListPageResponse.meta
     */
    fun meta(): Optional<KeyListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<KeyListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursor().getOptional("cursor") }
                .isPresent

    fun nextPageParams(): KeyListParams {
        val nextCursor =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._cursor().getOptional("cursor") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): KeyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<KeyListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): KeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): KeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [KeyListPage].
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

    /** A builder for [KeyListPage]. */
    class Builder internal constructor() {

        private var service: KeyService? = null
        private var params: KeyListParams? = null
        private var response: KeyListPageResponse? = null

        @JvmSynthetic
        internal fun from(keyListPage: KeyListPage) = apply {
            service = keyListPage.service
            params = keyListPage.params
            response = keyListPage.response
        }

        fun service(service: KeyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: KeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: KeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [KeyListPage].
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
        fun build(): KeyListPage =
            KeyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KeyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "KeyListPage{service=$service, params=$params, response=$response}"
}
