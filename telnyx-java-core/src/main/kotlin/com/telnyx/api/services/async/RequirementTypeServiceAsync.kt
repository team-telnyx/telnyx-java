// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.requirementtypes.RequirementTypeListParams
import com.telnyx.api.models.requirementtypes.RequirementTypeListResponse
import com.telnyx.api.models.requirementtypes.RequirementTypeRetrieveParams
import com.telnyx.api.models.requirementtypes.RequirementTypeRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RequirementTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementTypeServiceAsync

    /** Retrieve a requirement type by id */
    fun retrieve(id: String): CompletableFuture<RequirementTypeRetrieveResponse> =
        retrieve(id, RequirementTypeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementTypeRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
    ): CompletableFuture<RequirementTypeRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequirementTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementTypeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RequirementTypeRetrieveParams
    ): CompletableFuture<RequirementTypeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementTypeRetrieveResponse> =
        retrieve(id, RequirementTypeRetrieveParams.none(), requestOptions)

    /** List all requirement types ordered by created_at descending */
    fun list(): CompletableFuture<RequirementTypeListResponse> =
        list(RequirementTypeListParams.none())

    /** @see list */
    fun list(
        params: RequirementTypeListParams = RequirementTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementTypeListResponse>

    /** @see list */
    fun list(
        params: RequirementTypeListParams = RequirementTypeListParams.none()
    ): CompletableFuture<RequirementTypeListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RequirementTypeListResponse> =
        list(RequirementTypeListParams.none(), requestOptions)

    /**
     * A view of [RequirementTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): RequirementTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /requirement_types/{id}`, but is otherwise the same
         * as [RequirementTypeServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<RequirementTypeRetrieveResponse>> =
            retrieve(id, RequirementTypeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementTypeRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RequirementTypeRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RequirementTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementTypeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RequirementTypeRetrieveParams
        ): CompletableFuture<HttpResponseFor<RequirementTypeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementTypeRetrieveResponse>> =
            retrieve(id, RequirementTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /requirement_types`, but is otherwise the same as
         * [RequirementTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RequirementTypeListResponse>> =
            list(RequirementTypeListParams.none())

        /** @see list */
        fun list(
            params: RequirementTypeListParams = RequirementTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementTypeListResponse>>

        /** @see list */
        fun list(
            params: RequirementTypeListParams = RequirementTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<RequirementTypeListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RequirementTypeListResponse>> =
            list(RequirementTypeListParams.none(), requestOptions)
    }
}
