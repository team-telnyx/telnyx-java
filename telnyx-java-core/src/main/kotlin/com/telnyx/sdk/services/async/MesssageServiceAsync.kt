// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messsages.MesssageRcsParams
import com.telnyx.sdk.models.messsages.MesssageRcsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MesssageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MesssageServiceAsync

    /** Send an RCS message */
    fun rcs(params: MesssageRcsParams): CompletableFuture<MesssageRcsResponse> =
        rcs(params, RequestOptions.none())

    /** @see rcs */
    fun rcs(
        params: MesssageRcsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MesssageRcsResponse>

    /**
     * A view of [MesssageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MesssageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messsages/rcs`, but is otherwise the same as
         * [MesssageServiceAsync.rcs].
         */
        fun rcs(
            params: MesssageRcsParams
        ): CompletableFuture<HttpResponseFor<MesssageRcsResponse>> =
            rcs(params, RequestOptions.none())

        /** @see rcs */
        fun rcs(
            params: MesssageRcsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MesssageRcsResponse>>
    }
}
