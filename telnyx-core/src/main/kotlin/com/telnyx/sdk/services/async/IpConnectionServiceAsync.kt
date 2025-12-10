// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ipconnections.IpConnectionCreateParams
import com.telnyx.sdk.models.ipconnections.IpConnectionCreateResponse
import com.telnyx.sdk.models.ipconnections.IpConnectionDeleteParams
import com.telnyx.sdk.models.ipconnections.IpConnectionDeleteResponse
import com.telnyx.sdk.models.ipconnections.IpConnectionListPageAsync
import com.telnyx.sdk.models.ipconnections.IpConnectionListParams
import com.telnyx.sdk.models.ipconnections.IpConnectionRetrieveParams
import com.telnyx.sdk.models.ipconnections.IpConnectionRetrieveResponse
import com.telnyx.sdk.models.ipconnections.IpConnectionUpdateParams
import com.telnyx.sdk.models.ipconnections.IpConnectionUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IpConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpConnectionServiceAsync

    /** Creates an IP connection. */
    fun create(): CompletableFuture<IpConnectionCreateResponse> =
        create(IpConnectionCreateParams.none())

    /** @see create */
    fun create(
        params: IpConnectionCreateParams = IpConnectionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionCreateResponse>

    /** @see create */
    fun create(
        params: IpConnectionCreateParams = IpConnectionCreateParams.none()
    ): CompletableFuture<IpConnectionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<IpConnectionCreateResponse> =
        create(IpConnectionCreateParams.none(), requestOptions)

    /** Retrieves the details of an existing ip connection. */
    fun retrieve(id: String): CompletableFuture<IpConnectionRetrieveResponse> =
        retrieve(id, IpConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
    ): CompletableFuture<IpConnectionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IpConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: IpConnectionRetrieveParams
    ): CompletableFuture<IpConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpConnectionRetrieveResponse> =
        retrieve(id, IpConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing IP connection. */
    fun update(id: String): CompletableFuture<IpConnectionUpdateResponse> =
        update(id, IpConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
    ): CompletableFuture<IpConnectionUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IpConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionUpdateResponse>

    /** @see update */
    fun update(params: IpConnectionUpdateParams): CompletableFuture<IpConnectionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpConnectionUpdateResponse> =
        update(id, IpConnectionUpdateParams.none(), requestOptions)

    /** Returns a list of your IP connections. */
    fun list(): CompletableFuture<IpConnectionListPageAsync> = list(IpConnectionListParams.none())

    /** @see list */
    fun list(
        params: IpConnectionListParams = IpConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionListPageAsync>

    /** @see list */
    fun list(
        params: IpConnectionListParams = IpConnectionListParams.none()
    ): CompletableFuture<IpConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IpConnectionListPageAsync> =
        list(IpConnectionListParams.none(), requestOptions)

    /** Deletes an existing IP connection. */
    fun delete(id: String): CompletableFuture<IpConnectionDeleteResponse> =
        delete(id, IpConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
    ): CompletableFuture<IpConnectionDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IpConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpConnectionDeleteResponse>

    /** @see delete */
    fun delete(params: IpConnectionDeleteParams): CompletableFuture<IpConnectionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpConnectionDeleteResponse> =
        delete(id, IpConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [IpConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): IpConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ip_connections`, but is otherwise the same as
         * [IpConnectionServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<IpConnectionCreateResponse>> =
            create(IpConnectionCreateParams.none())

        /** @see create */
        fun create(
            params: IpConnectionCreateParams = IpConnectionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionCreateResponse>>

        /** @see create */
        fun create(
            params: IpConnectionCreateParams = IpConnectionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<IpConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IpConnectionCreateResponse>> =
            create(IpConnectionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ip_connections/{id}`, but is otherwise the same as
         * [IpConnectionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<IpConnectionRetrieveResponse>> =
            retrieve(id, IpConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IpConnectionRetrieveParams = IpConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IpConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: IpConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<IpConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpConnectionRetrieveResponse>> =
            retrieve(id, IpConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ip_connections/{id}`, but is otherwise the same
         * as [IpConnectionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<IpConnectionUpdateResponse>> =
            update(id, IpConnectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: IpConnectionUpdateParams = IpConnectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IpConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionUpdateResponse>>

        /** @see update */
        fun update(
            params: IpConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<IpConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpConnectionUpdateResponse>> =
            update(id, IpConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ip_connections`, but is otherwise the same as
         * [IpConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IpConnectionListPageAsync>> =
            list(IpConnectionListParams.none())

        /** @see list */
        fun list(
            params: IpConnectionListParams = IpConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: IpConnectionListParams = IpConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<IpConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IpConnectionListPageAsync>> =
            list(IpConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ip_connections/{id}`, but is otherwise the same
         * as [IpConnectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<IpConnectionDeleteResponse>> =
            delete(id, IpConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: IpConnectionDeleteParams = IpConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IpConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpConnectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: IpConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<IpConnectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpConnectionDeleteResponse>> =
            delete(id, IpConnectionDeleteParams.none(), requestOptions)
    }
}
