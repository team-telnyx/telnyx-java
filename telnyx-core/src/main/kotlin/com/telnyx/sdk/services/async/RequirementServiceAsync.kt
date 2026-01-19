// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.requirements.RequirementListPageAsync
import com.telnyx.sdk.models.requirements.RequirementListParams
import com.telnyx.sdk.models.requirements.RequirementRetrieveParams
import com.telnyx.sdk.models.requirements.RequirementRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RequirementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementServiceAsync

    /** Retrieve a document requirement record */
    fun retrieve(id: String): CompletableFuture<RequirementRetrieveResponse> =
        retrieve(id, RequirementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
    ): CompletableFuture<RequirementRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequirementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RequirementRetrieveParams
    ): CompletableFuture<RequirementRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementRetrieveResponse> =
        retrieve(id, RequirementRetrieveParams.none(), requestOptions)

    /** List all requirements with filtering, sorting, and pagination */
    fun list(): CompletableFuture<RequirementListPageAsync> = list(RequirementListParams.none())

    /** @see list */
    fun list(
        params: RequirementListParams = RequirementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementListPageAsync>

    /** @see list */
    fun list(
        params: RequirementListParams = RequirementListParams.none()
    ): CompletableFuture<RequirementListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RequirementListPageAsync> =
        list(RequirementListParams.none(), requestOptions)

    /**
     * A view of [RequirementServiceAsync] that provides access to raw HTTP responses for each
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
        ): RequirementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /requirements/{id}`, but is otherwise the same as
         * [RequirementServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<RequirementRetrieveResponse>> =
            retrieve(id, RequirementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RequirementRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RequirementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RequirementRetrieveParams
        ): CompletableFuture<HttpResponseFor<RequirementRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementRetrieveResponse>> =
            retrieve(id, RequirementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /requirements`, but is otherwise the same as
         * [RequirementServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RequirementListPageAsync>> =
            list(RequirementListParams.none())

        /** @see list */
        fun list(
            params: RequirementListParams = RequirementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementListPageAsync>>

        /** @see list */
        fun list(
            params: RequirementListParams = RequirementListParams.none()
        ): CompletableFuture<HttpResponseFor<RequirementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RequirementListPageAsync>> =
            list(RequirementListParams.none(), requestOptions)
    }
}
