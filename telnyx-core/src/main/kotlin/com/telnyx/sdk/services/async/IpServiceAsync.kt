// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ips.IpCreateParams
import com.telnyx.sdk.models.ips.IpCreateResponse
import com.telnyx.sdk.models.ips.IpDeleteParams
import com.telnyx.sdk.models.ips.IpDeleteResponse
import com.telnyx.sdk.models.ips.IpListPageAsync
import com.telnyx.sdk.models.ips.IpListParams
import com.telnyx.sdk.models.ips.IpRetrieveParams
import com.telnyx.sdk.models.ips.IpRetrieveResponse
import com.telnyx.sdk.models.ips.IpUpdateParams
import com.telnyx.sdk.models.ips.IpUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** IP operations */
interface IpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpServiceAsync

    /** Create a new IP object. */
    fun create(params: IpCreateParams): CompletableFuture<IpCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpCreateResponse>

    /** Return the details regarding a specific IP. */
    fun retrieve(id: String): CompletableFuture<IpRetrieveResponse> =
        retrieve(id, IpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpRetrieveParams = IpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpRetrieveParams = IpRetrieveParams.none(),
    ): CompletableFuture<IpRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IpRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: IpRetrieveParams): CompletableFuture<IpRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpRetrieveResponse> = retrieve(id, IpRetrieveParams.none(), requestOptions)

    /** Update the details of a specific IP. */
    fun update(id: String, params: IpUpdateParams): CompletableFuture<IpUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: IpUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: IpUpdateParams): CompletableFuture<IpUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IpUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpUpdateResponse>

    /** Get all IPs belonging to the user that match the given filters. */
    fun list(): CompletableFuture<IpListPageAsync> = list(IpListParams.none())

    /** @see list */
    fun list(
        params: IpListParams = IpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpListPageAsync>

    /** @see list */
    fun list(params: IpListParams = IpListParams.none()): CompletableFuture<IpListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IpListPageAsync> =
        list(IpListParams.none(), requestOptions)

    /** Delete an IP. */
    fun delete(id: String): CompletableFuture<IpDeleteResponse> = delete(id, IpDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IpDeleteParams = IpDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IpDeleteParams = IpDeleteParams.none(),
    ): CompletableFuture<IpDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpDeleteResponse>

    /** @see delete */
    fun delete(params: IpDeleteParams): CompletableFuture<IpDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<IpDeleteResponse> =
        delete(id, IpDeleteParams.none(), requestOptions)

    /** A view of [IpServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ips`, but is otherwise the same as
         * [IpServiceAsync.create].
         */
        fun create(params: IpCreateParams): CompletableFuture<HttpResponseFor<IpCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ips/{id}`, but is otherwise the same as
         * [IpServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<IpRetrieveResponse>> =
            retrieve(id, IpRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IpRetrieveParams = IpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IpRetrieveParams = IpRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IpRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IpRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: IpRetrieveParams
        ): CompletableFuture<HttpResponseFor<IpRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpRetrieveResponse>> =
            retrieve(id, IpRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ips/{id}`, but is otherwise the same as
         * [IpServiceAsync.update].
         */
        fun update(
            id: String,
            params: IpUpdateParams,
        ): CompletableFuture<HttpResponseFor<IpUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: IpUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: IpUpdateParams): CompletableFuture<HttpResponseFor<IpUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IpUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /ips`, but is otherwise the same as
         * [IpServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IpListPageAsync>> = list(IpListParams.none())

        /** @see list */
        fun list(
            params: IpListParams = IpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpListPageAsync>>

        /** @see list */
        fun list(
            params: IpListParams = IpListParams.none()
        ): CompletableFuture<HttpResponseFor<IpListPageAsync>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IpListPageAsync>> =
            list(IpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ips/{id}`, but is otherwise the same as
         * [IpServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<IpDeleteResponse>> =
            delete(id, IpDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: IpDeleteParams = IpDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: IpDeleteParams = IpDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<IpDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpDeleteResponse>>

        /** @see delete */
        fun delete(params: IpDeleteParams): CompletableFuture<HttpResponseFor<IpDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpDeleteResponse>> =
            delete(id, IpDeleteParams.none(), requestOptions)
    }
}
