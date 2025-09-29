// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import com.telnyx.sdk.models.availablephonenumberblocks.AvailablePhoneNumberBlockListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AvailablePhoneNumberBlockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AvailablePhoneNumberBlockServiceAsync

    /** List available phone number blocks */
    fun list(): CompletableFuture<AvailablePhoneNumberBlockListResponse> =
        list(AvailablePhoneNumberBlockListParams.none())

    /** @see list */
    fun list(
        params: AvailablePhoneNumberBlockListParams = AvailablePhoneNumberBlockListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvailablePhoneNumberBlockListResponse>

    /** @see list */
    fun list(
        params: AvailablePhoneNumberBlockListParams = AvailablePhoneNumberBlockListParams.none()
    ): CompletableFuture<AvailablePhoneNumberBlockListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<AvailablePhoneNumberBlockListResponse> =
        list(AvailablePhoneNumberBlockListParams.none(), requestOptions)

    /**
     * A view of [AvailablePhoneNumberBlockServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvailablePhoneNumberBlockServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /available_phone_number_blocks`, but is otherwise
         * the same as [AvailablePhoneNumberBlockServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AvailablePhoneNumberBlockListResponse>> =
            list(AvailablePhoneNumberBlockListParams.none())

        /** @see list */
        fun list(
            params: AvailablePhoneNumberBlockListParams =
                AvailablePhoneNumberBlockListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberBlockListResponse>>

        /** @see list */
        fun list(
            params: AvailablePhoneNumberBlockListParams = AvailablePhoneNumberBlockListParams.none()
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberBlockListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberBlockListResponse>> =
            list(AvailablePhoneNumberBlockListParams.none(), requestOptions)
    }
}
