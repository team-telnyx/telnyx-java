// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateParams
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumbersFeatureServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumbersFeatureServiceAsync

    /** Retrieve the features for a list of numbers */
    fun create(
        params: NumbersFeatureCreateParams
    ): CompletableFuture<NumbersFeatureCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NumbersFeatureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumbersFeatureCreateResponse>

    /**
     * A view of [NumbersFeatureServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumbersFeatureServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /numbers_features`, but is otherwise the same as
         * [NumbersFeatureServiceAsync.create].
         */
        fun create(
            params: NumbersFeatureCreateParams
        ): CompletableFuture<HttpResponseFor<NumbersFeatureCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NumbersFeatureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumbersFeatureCreateResponse>>
    }
}
