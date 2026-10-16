// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateResponse
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListPageAsync
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupRetrieveParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HostedSignupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HostedSignupServiceAsync

    /**
     * Create a time-limited onboarding URL on the Telnyx-hosted Embedded Signup page for a Tech
     * Provider's end customer. Set `signup_type` to `coexistence` to launch Meta's WhatsApp
     * Business app coexistence flow instead of standard Cloud API onboarding.
     */
    fun create(params: HostedSignupCreateParams): CompletableFuture<HostedSignupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HostedSignupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HostedSignupCreateResponse>

    /** Retrieve a hosted signup and its onboarding URL. */
    fun retrieve(id: String): CompletableFuture<HostedSignupRetrieveResponse> =
        retrieve(id, HostedSignupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HostedSignupRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
    ): CompletableFuture<HostedSignupRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HostedSignupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HostedSignupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: HostedSignupRetrieveParams
    ): CompletableFuture<HostedSignupRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HostedSignupRetrieveResponse> =
        retrieve(id, HostedSignupRetrieveParams.none(), requestOptions)

    /**
     * List hosted signups created by the account, newest first. Expired hosted signups are
     * included.
     */
    fun list(): CompletableFuture<HostedSignupListPageAsync> = list(HostedSignupListParams.none())

    /** @see list */
    fun list(
        params: HostedSignupListParams = HostedSignupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HostedSignupListPageAsync>

    /** @see list */
    fun list(
        params: HostedSignupListParams = HostedSignupListParams.none()
    ): CompletableFuture<HostedSignupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HostedSignupListPageAsync> =
        list(HostedSignupListParams.none(), requestOptions)

    /**
     * A view of [HostedSignupServiceAsync] that provides access to raw HTTP responses for each
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
        ): HostedSignupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /whatsapp/hosted_signups`, but is otherwise the
         * same as [HostedSignupServiceAsync.create].
         */
        fun create(
            params: HostedSignupCreateParams
        ): CompletableFuture<HttpResponseFor<HostedSignupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: HostedSignupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HostedSignupCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /whatsapp/hosted_signups/{id}`, but is otherwise the
         * same as [HostedSignupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<HostedSignupRetrieveResponse>> =
            retrieve(id, HostedSignupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HostedSignupRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HostedSignupRetrieveParams = HostedSignupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<HostedSignupRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HostedSignupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HostedSignupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: HostedSignupRetrieveParams
        ): CompletableFuture<HttpResponseFor<HostedSignupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HostedSignupRetrieveResponse>> =
            retrieve(id, HostedSignupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /whatsapp/hosted_signups`, but is otherwise the same
         * as [HostedSignupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<HostedSignupListPageAsync>> =
            list(HostedSignupListParams.none())

        /** @see list */
        fun list(
            params: HostedSignupListParams = HostedSignupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HostedSignupListPageAsync>>

        /** @see list */
        fun list(
            params: HostedSignupListParams = HostedSignupListParams.none()
        ): CompletableFuture<HttpResponseFor<HostedSignupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HostedSignupListPageAsync>> =
            list(HostedSignupListParams.none(), requestOptions)
    }
}
