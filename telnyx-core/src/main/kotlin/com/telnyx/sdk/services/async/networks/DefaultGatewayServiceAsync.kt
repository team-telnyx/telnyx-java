// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.networks

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayCreateParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayCreateResponse
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayDeleteParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayDeleteResponse
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayRetrieveParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DefaultGatewayServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefaultGatewayServiceAsync

    /** Create Default Gateway. */
    fun create(pathId: String): CompletableFuture<DefaultGatewayCreateResponse> =
        create(pathId, DefaultGatewayCreateParams.none())

    /** @see create */
    fun create(
        pathId: String,
        params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefaultGatewayCreateResponse> =
        create(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see create */
    fun create(
        pathId: String,
        params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
    ): CompletableFuture<DefaultGatewayCreateResponse> =
        create(pathId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefaultGatewayCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefaultGatewayCreateResponse>

    /** @see create */
    fun create(
        params: DefaultGatewayCreateParams
    ): CompletableFuture<DefaultGatewayCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        pathId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefaultGatewayCreateResponse> =
        create(pathId, DefaultGatewayCreateParams.none(), requestOptions)

    /** Get Default Gateway status. */
    fun retrieve(id: String): CompletableFuture<DefaultGatewayRetrieveResponse> =
        retrieve(id, DefaultGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefaultGatewayRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
    ): CompletableFuture<DefaultGatewayRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DefaultGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefaultGatewayRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: DefaultGatewayRetrieveParams
    ): CompletableFuture<DefaultGatewayRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefaultGatewayRetrieveResponse> =
        retrieve(id, DefaultGatewayRetrieveParams.none(), requestOptions)

    /** Delete Default Gateway. */
    fun delete(id: String): CompletableFuture<DefaultGatewayDeleteResponse> =
        delete(id, DefaultGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefaultGatewayDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
    ): CompletableFuture<DefaultGatewayDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefaultGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DefaultGatewayDeleteResponse>

    /** @see delete */
    fun delete(
        params: DefaultGatewayDeleteParams
    ): CompletableFuture<DefaultGatewayDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefaultGatewayDeleteResponse> =
        delete(id, DefaultGatewayDeleteParams.none(), requestOptions)

    /**
     * A view of [DefaultGatewayServiceAsync] that provides access to raw HTTP responses for each
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
        ): DefaultGatewayServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /networks/{id}/default_gateway`, but is otherwise
         * the same as [DefaultGatewayServiceAsync.create].
         */
        fun create(
            pathId: String
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>> =
            create(pathId, DefaultGatewayCreateParams.none())

        /** @see create */
        fun create(
            pathId: String,
            params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>> =
            create(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see create */
        fun create(
            pathId: String,
            params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>> =
            create(pathId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DefaultGatewayCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>>

        /** @see create */
        fun create(
            params: DefaultGatewayCreateParams
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            pathId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>> =
            create(pathId, DefaultGatewayCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /networks/{id}/default_gateway`, but is otherwise
         * the same as [DefaultGatewayServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>> =
            retrieve(id, DefaultGatewayRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DefaultGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DefaultGatewayRetrieveParams
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>> =
            retrieve(id, DefaultGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /networks/{id}/default_gateway`, but is otherwise
         * the same as [DefaultGatewayServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>> =
            delete(id, DefaultGatewayDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DefaultGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DefaultGatewayDeleteParams
        ): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>> =
            delete(id, DefaultGatewayDeleteParams.none(), requestOptions)
    }
}
