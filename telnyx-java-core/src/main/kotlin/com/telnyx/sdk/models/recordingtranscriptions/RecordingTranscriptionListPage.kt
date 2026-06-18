// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordingtranscriptions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.RecordingTranscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RecordingTranscriptionService.list */
class RecordingTranscriptionListPage
private constructor(
    private val service: RecordingTranscriptionService,
    private val params: RecordingTranscriptionListParams,
    private val response: RecordingTranscriptionListPageResponse,
) : Page<RecordingTranscription> {

    /**
     * Delegates to [RecordingTranscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingTranscriptionListPageResponse.data
     */
    fun data(): List<RecordingTranscription> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RecordingTranscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see RecordingTranscriptionListPageResponse.meta
     */
    fun meta(): Optional<RecordingTranscriptionListPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<RecordingTranscription> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RecordingTranscriptionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): RecordingTranscriptionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RecordingTranscription> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RecordingTranscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): RecordingTranscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RecordingTranscriptionListPage].
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

    /** A builder for [RecordingTranscriptionListPage]. */
    class Builder internal constructor() {

        private var service: RecordingTranscriptionService? = null
        private var params: RecordingTranscriptionListParams? = null
        private var response: RecordingTranscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(recordingTranscriptionListPage: RecordingTranscriptionListPage) = apply {
            service = recordingTranscriptionListPage.service
            params = recordingTranscriptionListPage.params
            response = recordingTranscriptionListPage.response
        }

        fun service(service: RecordingTranscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RecordingTranscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RecordingTranscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RecordingTranscriptionListPage].
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
        fun build(): RecordingTranscriptionListPage =
            RecordingTranscriptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingTranscriptionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RecordingTranscriptionListPage{service=$service, params=$params, response=$response}"
}
