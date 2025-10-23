// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateParams
import com.telnyx.sdk.models.numbersfeatures.NumbersFeatureCreateResponse
import java.util.function.Consumer

interface NumbersFeatureService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumbersFeatureService

    /** Retrieve the features for a list of numbers */
    fun create(params: NumbersFeatureCreateParams): NumbersFeatureCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NumbersFeatureCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumbersFeatureCreateResponse

    /**
     * A view of [NumbersFeatureService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumbersFeatureService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /numbers_features`, but is otherwise the same as
         * [NumbersFeatureService.create].
         */
        @MustBeClosed
        fun create(
            params: NumbersFeatureCreateParams
        ): HttpResponseFor<NumbersFeatureCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumbersFeatureCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumbersFeatureCreateResponse>
    }
}
