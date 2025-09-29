// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobListParams
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobListResponse
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobRetrieveParams
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobRetrieveResponse
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobUpdateParams
import com.telnyx.api.models.portingorders.activationjobs.ActivationJobUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActivationJobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivationJobServiceAsync

    /** Returns a porting activation job. */
    fun retrieve(
        activationJobId: String,
        params: ActivationJobRetrieveParams,
    ): CompletableFuture<ActivationJobRetrieveResponse> =
        retrieve(activationJobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        activationJobId: String,
        params: ActivationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivationJobRetrieveResponse> =
        retrieve(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ActivationJobRetrieveParams
    ): CompletableFuture<ActivationJobRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ActivationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivationJobRetrieveResponse>

    /** Updates the activation time of a porting activation job. */
    fun update(
        activationJobId: String,
        params: ActivationJobUpdateParams,
    ): CompletableFuture<ActivationJobUpdateResponse> =
        update(activationJobId, params, RequestOptions.none())

    /** @see update */
    fun update(
        activationJobId: String,
        params: ActivationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivationJobUpdateResponse> =
        update(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

    /** @see update */
    fun update(params: ActivationJobUpdateParams): CompletableFuture<ActivationJobUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ActivationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivationJobUpdateResponse>

    /** Returns a list of your porting activation jobs. */
    fun list(id: String): CompletableFuture<ActivationJobListResponse> =
        list(id, ActivationJobListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ActivationJobListParams = ActivationJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivationJobListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ActivationJobListParams = ActivationJobListParams.none(),
    ): CompletableFuture<ActivationJobListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ActivationJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivationJobListResponse>

    /** @see list */
    fun list(params: ActivationJobListParams): CompletableFuture<ActivationJobListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActivationJobListResponse> =
        list(id, ActivationJobListParams.none(), requestOptions)

    /**
     * A view of [ActivationJobServiceAsync] that provides access to raw HTTP responses for each
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
        ): ActivationJobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{id}/activation_jobs/{activationJobId}`, but is otherwise the same as
         * [ActivationJobServiceAsync.retrieve].
         */
        fun retrieve(
            activationJobId: String,
            params: ActivationJobRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ActivationJobRetrieveResponse>> =
            retrieve(activationJobId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            activationJobId: String,
            params: ActivationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobRetrieveResponse>> =
            retrieve(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ActivationJobRetrieveParams
        ): CompletableFuture<HttpResponseFor<ActivationJobRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ActivationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /porting_orders/{id}/activation_jobs/{activationJobId}`, but is otherwise the same as
         * [ActivationJobServiceAsync.update].
         */
        fun update(
            activationJobId: String,
            params: ActivationJobUpdateParams,
        ): CompletableFuture<HttpResponseFor<ActivationJobUpdateResponse>> =
            update(activationJobId, params, RequestOptions.none())

        /** @see update */
        fun update(
            activationJobId: String,
            params: ActivationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobUpdateResponse>> =
            update(params.toBuilder().activationJobId(activationJobId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ActivationJobUpdateParams
        ): CompletableFuture<HttpResponseFor<ActivationJobUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ActivationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/activation_jobs`, but is
         * otherwise the same as [ActivationJobServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<ActivationJobListResponse>> =
            list(id, ActivationJobListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ActivationJobListParams = ActivationJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ActivationJobListParams = ActivationJobListParams.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ActivationJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivationJobListResponse>>

        /** @see list */
        fun list(
            params: ActivationJobListParams
        ): CompletableFuture<HttpResponseFor<ActivationJobListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActivationJobListResponse>> =
            list(id, ActivationJobListParams.none(), requestOptions)
    }
}
