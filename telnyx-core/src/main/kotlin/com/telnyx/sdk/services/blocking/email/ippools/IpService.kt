// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email.ippools

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.email.ippools.ips.IpCreateParams
import com.telnyx.sdk.models.email.ippools.ips.IpCreateResponse
import com.telnyx.sdk.models.email.ippools.ips.IpDeleteParams
import java.util.function.Consumer

/** Group dedicated IPs into pools for sending. */
interface IpService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpService

    /**
     * Add a dedicated IP to the pool with an optional routing weight. An IP can belong to one pool;
     * to move an IP that is already in a pool, use `PATCH /email/dedicated_ips/{id}` with
     * `pool_id`.
     */
    fun create(id: String, params: IpCreateParams): IpCreateResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: IpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: IpCreateParams): IpCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpCreateResponse

    /**
     * Remove the dedicated IP from the pool. The IP is kept but carries no mail until added to a
     * pool again. Removing the last IP requires `force=true` and `drain=true`.
     */
    fun delete(ipId: String, params: IpDeleteParams) = delete(ipId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        ipId: String,
        params: IpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().ipId(ipId).build(), requestOptions)

    /** @see delete */
    fun delete(params: IpDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: IpDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [IpService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/ip_pools/{id}/ips`, but is otherwise the
         * same as [IpService.create].
         */
        @MustBeClosed
        fun create(id: String, params: IpCreateParams): HttpResponseFor<IpCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: IpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: IpCreateParams): HttpResponseFor<IpCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /email/ip_pools/{id}/ips/{ip_id}`, but is
         * otherwise the same as [IpService.delete].
         */
        @MustBeClosed
        fun delete(ipId: String, params: IpDeleteParams): HttpResponse =
            delete(ipId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ipId: String,
            params: IpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().ipId(ipId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: IpDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
