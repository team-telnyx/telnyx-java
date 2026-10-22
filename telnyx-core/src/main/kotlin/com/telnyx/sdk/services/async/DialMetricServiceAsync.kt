// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dialmetrics.DialMetricListPageAsync
import com.telnyx.sdk.models.dialmetrics.DialMetricListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Call information */
interface DialMetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DialMetricServiceAsync

    /**
     * Returns dials-per-second (DPS) metrics for your account's outbound dials made with the Call
     * Control `Dial` command and TeXML, as time buckets with dial counts, accepted and rejected
     * dials, average and peak DPS, and the DPS limit in force.
     *
     * The result has one record per region per bucket, ordered by `start_time` and then `region`,
     * newest first unless `sort=start_time`. Regions are never summed: the DPS limit is enforced
     * per region, so a cross-region total cannot be compared with it.
     *
     * Only buckets that saw dials are returned. Treat a missing bucket as zero dials.
     *
     * Only complete 5-second windows are counted, and a window is counted about 15 seconds after it
     * closes. The newest `granularity=second` record is therefore your live DPS, about 20 seconds
     * old. Request the last minute or two with `sort=-start_time`; the first record of each
     * `region` is that region's live rate (`page[limit]=1` would hide every region but one). If no
     * recent record exists, the live rate is zero.
     *
     * Results are cursor paginated. Follow `meta.next`, or pass `meta.cursors.after` as
     * `page[after]`, until `meta.next` is absent. No total count is returned.
     *
     * This endpoint is in development and can change before general availability.
     */
    fun list(params: DialMetricListParams): CompletableFuture<DialMetricListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DialMetricListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialMetricListPageAsync>

    /**
     * A view of [DialMetricServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DialMetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dial_metrics`, but is otherwise the same as
         * [DialMetricServiceAsync.list].
         */
        fun list(
            params: DialMetricListParams
        ): CompletableFuture<HttpResponseFor<DialMetricListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DialMetricListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialMetricListPageAsync>>
    }
}
