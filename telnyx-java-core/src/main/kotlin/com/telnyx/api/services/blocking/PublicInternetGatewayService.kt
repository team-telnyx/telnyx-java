// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayCreateParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayCreateResponse
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayDeleteParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayDeleteResponse
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayListParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayListResponse
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayRetrieveParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayRetrieveResponse
import java.util.function.Consumer

interface PublicInternetGatewayService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PublicInternetGatewayService

    /** Create a new Public Internet Gateway. */
    fun create(): PublicInternetGatewayCreateResponse =
        create(PublicInternetGatewayCreateParams.none())

    /** @see create */
    fun create(
        params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInternetGatewayCreateResponse

    /** @see create */
    fun create(
        params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none()
    ): PublicInternetGatewayCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): PublicInternetGatewayCreateResponse =
        create(PublicInternetGatewayCreateParams.none(), requestOptions)

    /** Retrieve a Public Internet Gateway. */
    fun retrieve(id: String): PublicInternetGatewayRetrieveResponse =
        retrieve(id, PublicInternetGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PublicInternetGatewayRetrieveParams = PublicInternetGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInternetGatewayRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PublicInternetGatewayRetrieveParams = PublicInternetGatewayRetrieveParams.none(),
    ): PublicInternetGatewayRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PublicInternetGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInternetGatewayRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: PublicInternetGatewayRetrieveParams
    ): PublicInternetGatewayRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): PublicInternetGatewayRetrieveResponse =
        retrieve(id, PublicInternetGatewayRetrieveParams.none(), requestOptions)

    /** List all Public Internet Gateways. */
    fun list(): PublicInternetGatewayListResponse = list(PublicInternetGatewayListParams.none())

    /** @see list */
    fun list(
        params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInternetGatewayListResponse

    /** @see list */
    fun list(
        params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none()
    ): PublicInternetGatewayListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PublicInternetGatewayListResponse =
        list(PublicInternetGatewayListParams.none(), requestOptions)

    /** Delete a Public Internet Gateway. */
    fun delete(id: String): PublicInternetGatewayDeleteResponse =
        delete(id, PublicInternetGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInternetGatewayDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
    ): PublicInternetGatewayDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PublicInternetGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicInternetGatewayDeleteResponse

    /** @see delete */
    fun delete(params: PublicInternetGatewayDeleteParams): PublicInternetGatewayDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): PublicInternetGatewayDeleteResponse =
        delete(id, PublicInternetGatewayDeleteParams.none(), requestOptions)

    /**
     * A view of [PublicInternetGatewayService] that provides access to raw HTTP responses for each
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
        ): PublicInternetGatewayService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /public_internet_gateways`, but is otherwise the
         * same as [PublicInternetGatewayService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<PublicInternetGatewayCreateResponse> =
            create(PublicInternetGatewayCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInternetGatewayCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: PublicInternetGatewayCreateParams = PublicInternetGatewayCreateParams.none()
        ): HttpResponseFor<PublicInternetGatewayCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<PublicInternetGatewayCreateResponse> =
            create(PublicInternetGatewayCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /public_internet_gateways/{id}`, but is otherwise
         * the same as [PublicInternetGatewayService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PublicInternetGatewayRetrieveResponse> =
            retrieve(id, PublicInternetGatewayRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PublicInternetGatewayRetrieveParams =
                PublicInternetGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInternetGatewayRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PublicInternetGatewayRetrieveParams = PublicInternetGatewayRetrieveParams.none(),
        ): HttpResponseFor<PublicInternetGatewayRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PublicInternetGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInternetGatewayRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PublicInternetGatewayRetrieveParams
        ): HttpResponseFor<PublicInternetGatewayRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInternetGatewayRetrieveResponse> =
            retrieve(id, PublicInternetGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /public_internet_gateways`, but is otherwise the
         * same as [PublicInternetGatewayService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PublicInternetGatewayListResponse> =
            list(PublicInternetGatewayListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInternetGatewayListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PublicInternetGatewayListParams = PublicInternetGatewayListParams.none()
        ): HttpResponseFor<PublicInternetGatewayListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PublicInternetGatewayListResponse> =
            list(PublicInternetGatewayListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /public_internet_gateways/{id}`, but is otherwise
         * the same as [PublicInternetGatewayService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PublicInternetGatewayDeleteResponse> =
            delete(id, PublicInternetGatewayDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInternetGatewayDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PublicInternetGatewayDeleteParams = PublicInternetGatewayDeleteParams.none(),
        ): HttpResponseFor<PublicInternetGatewayDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PublicInternetGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicInternetGatewayDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PublicInternetGatewayDeleteParams
        ): HttpResponseFor<PublicInternetGatewayDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicInternetGatewayDeleteResponse> =
            delete(id, PublicInternetGatewayDeleteParams.none(), requestOptions)
    }
}
