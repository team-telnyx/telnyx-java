// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.availablephonenumbers.AvailablePhoneNumberListParams
import com.telnyx.api.models.availablephonenumbers.AvailablePhoneNumberListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AvailablePhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvailablePhoneNumberServiceAsync

    /** List available phone numbers */
    fun list(): CompletableFuture<AvailablePhoneNumberListResponse> =
        list(AvailablePhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvailablePhoneNumberListResponse>

    /** @see list */
    fun list(
        params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none()
    ): CompletableFuture<AvailablePhoneNumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AvailablePhoneNumberListResponse> =
        list(AvailablePhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [AvailablePhoneNumberServiceAsync] that provides access to raw HTTP responses for
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
        ): AvailablePhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /available_phone_numbers`, but is otherwise the same
         * as [AvailablePhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AvailablePhoneNumberListResponse>> =
            list(AvailablePhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: AvailablePhoneNumberListParams = AvailablePhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberListResponse>> =
            list(AvailablePhoneNumberListParams.none(), requestOptions)
    }
}
