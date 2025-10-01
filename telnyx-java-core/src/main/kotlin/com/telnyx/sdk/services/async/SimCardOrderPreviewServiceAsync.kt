// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcardorderpreview.SimCardOrderPreviewPreviewParams
import com.telnyx.sdk.models.simcardorderpreview.SimCardOrderPreviewPreviewResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SimCardOrderPreviewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardOrderPreviewServiceAsync

    /** Preview SIM card order purchases. */
    fun preview(
        params: SimCardOrderPreviewPreviewParams
    ): CompletableFuture<SimCardOrderPreviewPreviewResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: SimCardOrderPreviewPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardOrderPreviewPreviewResponse>

    /**
     * A view of [SimCardOrderPreviewServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardOrderPreviewServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_order_preview`, but is otherwise the same
         * as [SimCardOrderPreviewServiceAsync.preview].
         */
        fun preview(
            params: SimCardOrderPreviewPreviewParams
        ): CompletableFuture<HttpResponseFor<SimCardOrderPreviewPreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: SimCardOrderPreviewPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderPreviewPreviewResponse>>
    }
}
