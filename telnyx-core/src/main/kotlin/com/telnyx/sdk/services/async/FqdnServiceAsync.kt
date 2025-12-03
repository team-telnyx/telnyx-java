// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.fqdns.FqdnCreateParams
import com.telnyx.sdk.models.fqdns.FqdnCreateResponse
import com.telnyx.sdk.models.fqdns.FqdnDeleteParams
import com.telnyx.sdk.models.fqdns.FqdnDeleteResponse
import com.telnyx.sdk.models.fqdns.FqdnListParams
import com.telnyx.sdk.models.fqdns.FqdnListResponse
import com.telnyx.sdk.models.fqdns.FqdnRetrieveParams
import com.telnyx.sdk.models.fqdns.FqdnRetrieveResponse
import com.telnyx.sdk.models.fqdns.FqdnUpdateParams
import com.telnyx.sdk.models.fqdns.FqdnUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FqdnServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnServiceAsync

    /** Create a new FQDN object. */
    fun create(params: FqdnCreateParams): CompletableFuture<FqdnCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FqdnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnCreateResponse>

    /** Return the details regarding a specific FQDN. */
    fun retrieve(id: String): CompletableFuture<FqdnRetrieveResponse> =
        retrieve(id, FqdnRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
    ): CompletableFuture<FqdnRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FqdnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: FqdnRetrieveParams): CompletableFuture<FqdnRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnRetrieveResponse> =
        retrieve(id, FqdnRetrieveParams.none(), requestOptions)

    /** Update the details of a specific FQDN. */
    fun update(id: String): CompletableFuture<FqdnUpdateResponse> =
        update(id, FqdnUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: FqdnUpdateParams = FqdnUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: FqdnUpdateParams = FqdnUpdateParams.none(),
    ): CompletableFuture<FqdnUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FqdnUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnUpdateResponse>

    /** @see update */
    fun update(params: FqdnUpdateParams): CompletableFuture<FqdnUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<FqdnUpdateResponse> =
        update(id, FqdnUpdateParams.none(), requestOptions)

    /** Get all FQDNs belonging to the user that match the given filters. */
    fun list(): CompletableFuture<FqdnListResponse> = list(FqdnListParams.none())

    /** @see list */
    fun list(
        params: FqdnListParams = FqdnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnListResponse>

    /** @see list */
    fun list(params: FqdnListParams = FqdnListParams.none()): CompletableFuture<FqdnListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FqdnListResponse> =
        list(FqdnListParams.none(), requestOptions)

    /** Delete an FQDN. */
    fun delete(id: String): CompletableFuture<FqdnDeleteResponse> =
        delete(id, FqdnDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnDeleteParams = FqdnDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnDeleteParams = FqdnDeleteParams.none(),
    ): CompletableFuture<FqdnDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FqdnDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FqdnDeleteResponse>

    /** @see delete */
    fun delete(params: FqdnDeleteParams): CompletableFuture<FqdnDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<FqdnDeleteResponse> =
        delete(id, FqdnDeleteParams.none(), requestOptions)

    /** A view of [FqdnServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fqdns`, but is otherwise the same as
         * [FqdnServiceAsync.create].
         */
        fun create(
            params: FqdnCreateParams
        ): CompletableFuture<HttpResponseFor<FqdnCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FqdnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /fqdns/{id}`, but is otherwise the same as
         * [FqdnServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>> =
            retrieve(id, FqdnRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FqdnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FqdnRetrieveParams
        ): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>> =
            retrieve(id, FqdnRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /fqdns/{id}`, but is otherwise the same as
         * [FqdnServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>> =
            update(id, FqdnUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: FqdnUpdateParams = FqdnUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: FqdnUpdateParams = FqdnUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FqdnUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>>

        /** @see update */
        fun update(
            params: FqdnUpdateParams
        ): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>> =
            update(id, FqdnUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fqdns`, but is otherwise the same as
         * [FqdnServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FqdnListResponse>> =
            list(FqdnListParams.none())

        /** @see list */
        fun list(
            params: FqdnListParams = FqdnListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnListResponse>>

        /** @see list */
        fun list(
            params: FqdnListParams = FqdnListParams.none()
        ): CompletableFuture<HttpResponseFor<FqdnListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FqdnListResponse>> =
            list(FqdnListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /fqdns/{id}`, but is otherwise the same as
         * [FqdnServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>> =
            delete(id, FqdnDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: FqdnDeleteParams = FqdnDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: FqdnDeleteParams = FqdnDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FqdnDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FqdnDeleteParams
        ): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>> =
            delete(id, FqdnDeleteParams.none(), requestOptions)
    }
}
