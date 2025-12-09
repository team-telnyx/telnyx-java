// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListPageAsync
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PortingPhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingPhoneNumberServiceAsync

    /** Returns a list of your porting phone numbers. */
    fun list(): CompletableFuture<PortingPhoneNumberListPageAsync> =
        list(PortingPhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingPhoneNumberListPageAsync>

    /** @see list */
    fun list(
        params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none()
    ): CompletableFuture<PortingPhoneNumberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PortingPhoneNumberListPageAsync> =
        list(PortingPhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [PortingPhoneNumberServiceAsync] that provides access to raw HTTP responses for
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
        ): PortingPhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting_phone_numbers`, but is otherwise the same
         * as [PortingPhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PortingPhoneNumberListPageAsync>> =
            list(PortingPhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingPhoneNumberListPageAsync>>

        /** @see list */
        fun list(
            params: PortingPhoneNumberListParams = PortingPhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<PortingPhoneNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortingPhoneNumberListPageAsync>> =
            list(PortingPhoneNumberListParams.none(), requestOptions)
    }
}
