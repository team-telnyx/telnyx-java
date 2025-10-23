// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalips.GlobalIpCreateParams
import com.telnyx.sdk.models.globalips.GlobalIpCreateResponse
import com.telnyx.sdk.models.globalips.GlobalIpDeleteParams
import com.telnyx.sdk.models.globalips.GlobalIpDeleteResponse
import com.telnyx.sdk.models.globalips.GlobalIpListParams
import com.telnyx.sdk.models.globalips.GlobalIpListResponse
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveParams
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpServiceAsync

    /** Create a Global IP. */
    fun create(): CompletableFuture<GlobalIpCreateResponse> = create(GlobalIpCreateParams.none())

    /** @see create */
    fun create(
        params: GlobalIpCreateParams = GlobalIpCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpCreateResponse>

    /** @see create */
    fun create(
        params: GlobalIpCreateParams = GlobalIpCreateParams.none()
    ): CompletableFuture<GlobalIpCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<GlobalIpCreateResponse> =
        create(GlobalIpCreateParams.none(), requestOptions)

    /** Retrieve a Global IP. */
    fun retrieve(id: String): CompletableFuture<GlobalIpRetrieveResponse> =
        retrieve(id, GlobalIpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
    ): CompletableFuture<GlobalIpRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: GlobalIpRetrieveParams): CompletableFuture<GlobalIpRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpRetrieveResponse> =
        retrieve(id, GlobalIpRetrieveParams.none(), requestOptions)

    /** List all Global IPs. */
    fun list(): CompletableFuture<GlobalIpListResponse> = list(GlobalIpListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpListParams = GlobalIpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpListResponse>

    /** @see list */
    fun list(
        params: GlobalIpListParams = GlobalIpListParams.none()
    ): CompletableFuture<GlobalIpListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GlobalIpListResponse> =
        list(GlobalIpListParams.none(), requestOptions)

    /** Delete a Global IP. */
    fun delete(id: String): CompletableFuture<GlobalIpDeleteResponse> =
        delete(id, GlobalIpDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
    ): CompletableFuture<GlobalIpDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GlobalIpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpDeleteResponse>

    /** @see delete */
    fun delete(params: GlobalIpDeleteParams): CompletableFuture<GlobalIpDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpDeleteResponse> =
        delete(id, GlobalIpDeleteParams.none(), requestOptions)

    /**
     * A view of [GlobalIpServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /global_ips`, but is otherwise the same as
         * [GlobalIpServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<GlobalIpCreateResponse>> =
            create(GlobalIpCreateParams.none())

        /** @see create */
        fun create(
            params: GlobalIpCreateParams = GlobalIpCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpCreateResponse>>

        /** @see create */
        fun create(
            params: GlobalIpCreateParams = GlobalIpCreateParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpCreateResponse>> =
            create(GlobalIpCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ips/{id}`, but is otherwise the same as
         * [GlobalIpServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>> =
            retrieve(id, GlobalIpRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpRetrieveParams
        ): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpRetrieveResponse>> =
            retrieve(id, GlobalIpRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ips`, but is otherwise the same as
         * [GlobalIpServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GlobalIpListResponse>> =
            list(GlobalIpListParams.none())

        /** @see list */
        fun list(
            params: GlobalIpListParams = GlobalIpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpListResponse>>

        /** @see list */
        fun list(
            params: GlobalIpListParams = GlobalIpListParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpListResponse>> =
            list(GlobalIpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /global_ips/{id}`, but is otherwise the same as
         * [GlobalIpServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>> =
            delete(id, GlobalIpDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GlobalIpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>>

        /** @see delete */
        fun delete(
            params: GlobalIpDeleteParams
        ): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpDeleteResponse>> =
            delete(id, GlobalIpDeleteParams.none(), requestOptions)
    }
}
