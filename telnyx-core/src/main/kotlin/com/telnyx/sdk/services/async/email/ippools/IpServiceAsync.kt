// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email.ippools

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.email.ippools.ips.IpCreateParams
import com.telnyx.sdk.models.email.ippools.ips.IpCreateResponse
import com.telnyx.sdk.models.email.ippools.ips.IpDeleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Group dedicated IPs into pools for sending. */
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

    /**
     * Add a dedicated IP to the pool with an optional routing weight. An IP can belong to one pool;
     * to move an IP that is already in a pool, use `PATCH /email/dedicated_ips/{id}` with
     * `pool_id`.
     */
    fun create(id: String, params: IpCreateParams): CompletableFuture<IpCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: IpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: IpCreateParams): CompletableFuture<IpCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpCreateResponse>

    /**
     * Remove the dedicated IP from the pool. The IP is kept but carries no mail until added to a
     * pool again. Removing the last IP requires `force=true` and `drain=true`.
     */
    fun delete(ipId: String, params: IpDeleteParams): CompletableFuture<Void?> =
        delete(ipId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        ipId: String,
        params: IpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().ipId(ipId).build(), requestOptions)

    /** @see delete */
    fun delete(params: IpDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [IpServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/ip_pools/{id}/ips`, but is otherwise the
         * same as [IpServiceAsync.create].
         */
        fun create(
            id: String,
            params: IpCreateParams,
        ): CompletableFuture<HttpResponseFor<IpCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: IpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(params: IpCreateParams): CompletableFuture<HttpResponseFor<IpCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /email/ip_pools/{id}/ips/{ip_id}`, but is
         * otherwise the same as [IpServiceAsync.delete].
         */
        fun delete(ipId: String, params: IpDeleteParams): CompletableFuture<HttpResponse> =
            delete(ipId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ipId: String,
            params: IpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().ipId(ipId).build(), requestOptions)

        /** @see delete */
        fun delete(params: IpDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
