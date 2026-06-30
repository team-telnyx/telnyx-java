// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayCreateParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayCreateResponse
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayDeleteParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayDeleteResponse
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayListPageAsync
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayListParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayRetrieveParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Public Internet Gateway operations */
interface PublicInternetGatewayServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicInternetGatewayServiceAsync

    /** Create a new Public Internet Gateway. */
    fun create(): CompletableFuture<PublicInternetGatewayCreateResponse> =
        create(PublicInternetGatewayCreateParams.none())

    /** @see create */
    fun create(
        params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInternetGatewayCreateResponse>

    /** @see create */
    fun create(
        params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none()
    ): CompletableFuture<PublicInternetGatewayCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<PublicInternetGatewayCreateResponse> =
        create(PublicInternetGatewayCreateParams.none(), requestOptions)

    /** Retrieve a Public Internet Gateway. */
    fun retrieve(id: String): CompletableFuture<PublicInternetGatewayRetrieveResponse> =
        retrieve(id, PublicInternetGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PublicInternetGatewayRetrieveParams = PublicInternetGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInternetGatewayRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PublicInternetGatewayRetrieveParams = PublicInternetGatewayRetrieveParams.none(),
    ): CompletableFuture<PublicInternetGatewayRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PublicInternetGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInternetGatewayRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PublicInternetGatewayRetrieveParams
    ): CompletableFuture<PublicInternetGatewayRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicInternetGatewayRetrieveResponse> =
        retrieve(id, PublicInternetGatewayRetrieveParams.none(), requestOptions)

    /** List all Public Internet Gateways. */
    fun list(): CompletableFuture<PublicInternetGatewayListPageAsync> =
        list(PublicInternetGatewayListParams.none())

    /** @see list */
    fun list(
        params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInternetGatewayListPageAsync>

    /** @see list */
    fun list(
        params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none()
    ): CompletableFuture<PublicInternetGatewayListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<PublicInternetGatewayListPageAsync> =
        list(PublicInternetGatewayListParams.none(), requestOptions)

    /** Delete a Public Internet Gateway. */
    fun delete(id: String): CompletableFuture<PublicInternetGatewayDeleteResponse> =
        delete(id, PublicInternetGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInternetGatewayDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
    ): CompletableFuture<PublicInternetGatewayDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PublicInternetGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicInternetGatewayDeleteResponse>

    /** @see delete */
    fun delete(
        params: PublicInternetGatewayDeleteParams
    ): CompletableFuture<PublicInternetGatewayDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicInternetGatewayDeleteResponse> =
        delete(id, PublicInternetGatewayDeleteParams.none(), requestOptions)

    /**
     * A view of [PublicInternetGatewayServiceAsync] that provides access to raw HTTP responses for
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
        ): PublicInternetGatewayServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /public_internet_gateways`, but is otherwise the
         * same as [PublicInternetGatewayServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<PublicInternetGatewayCreateResponse>> =
            create(PublicInternetGatewayCreateParams.none())

        /** @see create */
        fun create(
            params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayCreateResponse>>

        /** @see create */
        fun create(
            params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none()
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayCreateResponse>> =
            create(PublicInternetGatewayCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /public_internet_gateways/{id}`, but is otherwise
         * the same as [PublicInternetGatewayServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>> =
            retrieve(id, PublicInternetGatewayRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PublicInternetGatewayRetrieveParams =
                PublicInternetGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PublicInternetGatewayRetrieveParams = PublicInternetGatewayRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PublicInternetGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PublicInternetGatewayRetrieveParams
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayRetrieveResponse>> =
            retrieve(id, PublicInternetGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /public_internet_gateways`, but is otherwise the
         * same as [PublicInternetGatewayServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PublicInternetGatewayListPageAsync>> =
            list(PublicInternetGatewayListParams.none())

        /** @see list */
        fun list(
            params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayListPageAsync>>

        /** @see list */
        fun list(
            params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none()
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayListPageAsync>> =
            list(PublicInternetGatewayListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /public_internet_gateways/{id}`, but is otherwise
         * the same as [PublicInternetGatewayServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>> =
            delete(id, PublicInternetGatewayDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PublicInternetGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>>

        /** @see delete */
        fun delete(
            params: PublicInternetGatewayDeleteParams
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicInternetGatewayDeleteResponse>> =
            delete(id, PublicInternetGatewayDeleteParams.none(), requestOptions)
    }
}
