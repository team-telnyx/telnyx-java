// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.networks

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayCreateParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayCreateResponse
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayDeleteParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayDeleteResponse
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayRetrieveParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayRetrieveResponse
import java.util.function.Consumer

interface DefaultGatewayService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefaultGatewayService

    /** Create Default Gateway. */
    fun create(pathId: String): DefaultGatewayCreateResponse =
        create(pathId, DefaultGatewayCreateParams.none())

    /** @see create */
    fun create(
        pathId: String,
        params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefaultGatewayCreateResponse =
        create(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see create */
    fun create(
        pathId: String,
        params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
    ): DefaultGatewayCreateResponse = create(pathId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DefaultGatewayCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefaultGatewayCreateResponse

    /** @see create */
    fun create(params: DefaultGatewayCreateParams): DefaultGatewayCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(pathId: String, requestOptions: RequestOptions): DefaultGatewayCreateResponse =
        create(pathId, DefaultGatewayCreateParams.none(), requestOptions)

    /** Get Default Gateway status. */
    fun retrieve(id: String): DefaultGatewayRetrieveResponse =
        retrieve(id, DefaultGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefaultGatewayRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
    ): DefaultGatewayRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DefaultGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefaultGatewayRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DefaultGatewayRetrieveParams): DefaultGatewayRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DefaultGatewayRetrieveResponse =
        retrieve(id, DefaultGatewayRetrieveParams.none(), requestOptions)

    /** Delete Default Gateway. */
    fun delete(id: String): DefaultGatewayDeleteResponse =
        delete(id, DefaultGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefaultGatewayDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
    ): DefaultGatewayDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DefaultGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DefaultGatewayDeleteResponse

    /** @see delete */
    fun delete(params: DefaultGatewayDeleteParams): DefaultGatewayDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DefaultGatewayDeleteResponse =
        delete(id, DefaultGatewayDeleteParams.none(), requestOptions)

    /**
     * A view of [DefaultGatewayService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefaultGatewayService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /networks/{id}/default_gateway`, but is otherwise
         * the same as [DefaultGatewayService.create].
         */
        @MustBeClosed
        fun create(pathId: String): HttpResponseFor<DefaultGatewayCreateResponse> =
            create(pathId, DefaultGatewayCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            pathId: String,
            params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefaultGatewayCreateResponse> =
            create(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            pathId: String,
            params: DefaultGatewayCreateParams = DefaultGatewayCreateParams.none(),
        ): HttpResponseFor<DefaultGatewayCreateResponse> =
            create(pathId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DefaultGatewayCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefaultGatewayCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: DefaultGatewayCreateParams
        ): HttpResponseFor<DefaultGatewayCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            pathId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefaultGatewayCreateResponse> =
            create(pathId, DefaultGatewayCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /networks/{id}/default_gateway`, but is otherwise
         * the same as [DefaultGatewayService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DefaultGatewayRetrieveResponse> =
            retrieve(id, DefaultGatewayRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefaultGatewayRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DefaultGatewayRetrieveParams = DefaultGatewayRetrieveParams.none(),
        ): HttpResponseFor<DefaultGatewayRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DefaultGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefaultGatewayRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DefaultGatewayRetrieveParams
        ): HttpResponseFor<DefaultGatewayRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefaultGatewayRetrieveResponse> =
            retrieve(id, DefaultGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /networks/{id}/default_gateway`, but is otherwise
         * the same as [DefaultGatewayService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DefaultGatewayDeleteResponse> =
            delete(id, DefaultGatewayDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefaultGatewayDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DefaultGatewayDeleteParams = DefaultGatewayDeleteParams.none(),
        ): HttpResponseFor<DefaultGatewayDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DefaultGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DefaultGatewayDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DefaultGatewayDeleteParams
        ): HttpResponseFor<DefaultGatewayDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DefaultGatewayDeleteResponse> =
            delete(id, DefaultGatewayDeleteParams.none(), requestOptions)
    }
}
