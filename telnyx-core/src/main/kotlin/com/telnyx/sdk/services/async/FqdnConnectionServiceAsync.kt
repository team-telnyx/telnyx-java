// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionCreateParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionCreateResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionDeleteParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionDeleteResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionListParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionListResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionRetrieveParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionRetrieveResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionUpdateParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FqdnConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnConnectionServiceAsync

    /** Creates a FQDN connection. */
    fun create(
        params: FqdnConnectionCreateParams
    ): CompletableFuture<FqdnConnectionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FqdnConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionCreateResponse>

    /** Retrieves the details of an existing FQDN connection. */
    fun retrieve(id: String): CompletableFuture<FqdnConnectionRetrieveResponse> =
        retrieve(id, FqdnConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
    ): CompletableFuture<FqdnConnectionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FqdnConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: FqdnConnectionRetrieveParams
    ): CompletableFuture<FqdnConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnConnectionRetrieveResponse> =
        retrieve(id, FqdnConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing FQDN connection. */
    fun update(id: String): CompletableFuture<FqdnConnectionUpdateResponse> =
        update(id, FqdnConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
    ): CompletableFuture<FqdnConnectionUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FqdnConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionUpdateResponse>

    /** @see update */
    fun update(
        params: FqdnConnectionUpdateParams
    ): CompletableFuture<FqdnConnectionUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnConnectionUpdateResponse> =
        update(id, FqdnConnectionUpdateParams.none(), requestOptions)

    /** Returns a list of your FQDN connections. */
    fun list(): CompletableFuture<FqdnConnectionListResponse> =
        list(FqdnConnectionListParams.none())

    /** @see list */
    fun list(
        params: FqdnConnectionListParams = FqdnConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionListResponse>

    /** @see list */
    fun list(
        params: FqdnConnectionListParams = FqdnConnectionListParams.none()
    ): CompletableFuture<FqdnConnectionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FqdnConnectionListResponse> =
        list(FqdnConnectionListParams.none(), requestOptions)

    /** Deletes an FQDN connection. */
    fun delete(id: String): CompletableFuture<FqdnConnectionDeleteResponse> =
        delete(id, FqdnConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
    ): CompletableFuture<FqdnConnectionDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FqdnConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnConnectionDeleteResponse>

    /** @see delete */
    fun delete(
        params: FqdnConnectionDeleteParams
    ): CompletableFuture<FqdnConnectionDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnConnectionDeleteResponse> =
        delete(id, FqdnConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [FqdnConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): FqdnConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fqdn_connections`, but is otherwise the same as
         * [FqdnConnectionServiceAsync.create].
         */
        fun create(
            params: FqdnConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<FqdnConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FqdnConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /fqdn_connections/{id}`, but is otherwise the same
         * as [FqdnConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<FqdnConnectionRetrieveResponse>> =
            retrieve(id, FqdnConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FqdnConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FqdnConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<FqdnConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnConnectionRetrieveResponse>> =
            retrieve(id, FqdnConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /fqdn_connections/{id}`, but is otherwise the same
         * as [FqdnConnectionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<FqdnConnectionUpdateResponse>> =
            update(id, FqdnConnectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FqdnConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionUpdateResponse>>

        /** @see update */
        fun update(
            params: FqdnConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<FqdnConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnConnectionUpdateResponse>> =
            update(id, FqdnConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fqdn_connections`, but is otherwise the same as
         * [FqdnConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FqdnConnectionListResponse>> =
            list(FqdnConnectionListParams.none())

        /** @see list */
        fun list(
            params: FqdnConnectionListParams = FqdnConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionListResponse>>

        /** @see list */
        fun list(
            params: FqdnConnectionListParams = FqdnConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<FqdnConnectionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FqdnConnectionListResponse>> =
            list(FqdnConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /fqdn_connections/{id}`, but is otherwise the
         * same as [FqdnConnectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<FqdnConnectionDeleteResponse>> =
            delete(id, FqdnConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FqdnConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnConnectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FqdnConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<FqdnConnectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnConnectionDeleteResponse>> =
            delete(id, FqdnConnectionDeleteParams.none(), requestOptions)
    }
}
