// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.signup.SignupListPageAsync
import com.telnyx.sdk.models.whatsapp.signup.SignupListParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SignupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignupServiceAsync

    /**
     * List finished WhatsApp Embedded Signup sessions, with status `SUCCESS` or `FAILURE`, newest
     * first. Use the `errors` of a failed session to see why provisioning stopped.
     */
    fun list(): CompletableFuture<SignupListPageAsync> = list(SignupListParams.none())

    /** @see list */
    fun list(
        params: SignupListParams = SignupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignupListPageAsync>

    /** @see list */
    fun list(
        params: SignupListParams = SignupListParams.none()
    ): CompletableFuture<SignupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SignupListPageAsync> =
        list(SignupListParams.none(), requestOptions)

    /** Retrieve the current state and status of a WhatsApp Embedded Signup session. */
    fun retrieveStatus(id: String): CompletableFuture<SignupRetrieveStatusResponse> =
        retrieveStatus(id, SignupRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignupRetrieveStatusResponse> =
        retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
    ): CompletableFuture<SignupRetrieveStatusResponse> =
        retrieveStatus(id, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: SignupRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignupRetrieveStatusResponse>

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: SignupRetrieveStatusParams
    ): CompletableFuture<SignupRetrieveStatusResponse> =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SignupRetrieveStatusResponse> =
        retrieveStatus(id, SignupRetrieveStatusParams.none(), requestOptions)

    /**
     * A view of [SignupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SignupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /whatsapp/signup`, but is otherwise the same as
         * [SignupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SignupListPageAsync>> =
            list(SignupListParams.none())

        /** @see list */
        fun list(
            params: SignupListParams = SignupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignupListPageAsync>>

        /** @see list */
        fun list(
            params: SignupListParams = SignupListParams.none()
        ): CompletableFuture<HttpResponseFor<SignupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SignupListPageAsync>> =
            list(SignupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /whatsapp/signup/{id}/status`, but is otherwise the
         * same as [SignupServiceAsync.retrieveStatus].
         */
        fun retrieveStatus(
            id: String
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>> =
            retrieveStatus(id, SignupRetrieveStatusParams.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            id: String,
            params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>> =
            retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveStatus */
        fun retrieveStatus(
            id: String,
            params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>> =
            retrieveStatus(id, params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: SignupRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>>

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: SignupRetrieveStatusParams
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignupRetrieveStatusResponse>> =
            retrieveStatus(id, SignupRetrieveStatusParams.none(), requestOptions)
    }
}
