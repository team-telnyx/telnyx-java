// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.email.ippools.IpPoolCreateParams
import com.telnyx.sdk.models.email.ippools.IpPoolDeleteParams
import com.telnyx.sdk.models.email.ippools.IpPoolListParams
import com.telnyx.sdk.models.email.ippools.IpPoolListResponse
import com.telnyx.sdk.models.email.ippools.IpPoolRetrieveParams
import com.telnyx.sdk.models.email.ippools.IpPoolShowResponse
import com.telnyx.sdk.models.email.ippools.IpPoolUpdateParams
import com.telnyx.sdk.services.async.email.ippools.IpServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Group dedicated IPs into pools for sending. */
interface IpPoolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpPoolServiceAsync

    /** Group dedicated IPs into pools for sending. */
    fun ips(): IpServiceAsync

    /**
     * Create an account-scoped pool of dedicated IPs. Set `is_default` or `domain_id` for the pool
     * to carry mail; a pool with neither carries none.
     */
    fun create(params: IpPoolCreateParams): CompletableFuture<IpPoolShowResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IpPoolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpPoolShowResponse>

    /**
     * Retrieve a single IP pool by its identifier, including its dedicated-IP members with billing
     * state.
     */
    fun retrieve(id: String): CompletableFuture<IpPoolShowResponse> =
        retrieve(id, IpPoolRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpPoolShowResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
    ): CompletableFuture<IpPoolShowResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IpPoolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpPoolShowResponse>

    /** @see retrieve */
    fun retrieve(params: IpPoolRetrieveParams): CompletableFuture<IpPoolShowResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IpPoolShowResponse> =
        retrieve(id, IpPoolRetrieveParams.none(), requestOptions)

    /**
     * Rename the pool, set or clear the default flag, or change its domain scope. Routing follows
     * the new settings for subsequent mail.
     */
    fun update(id: String): CompletableFuture<IpPoolShowResponse> =
        update(id, IpPoolUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpPoolShowResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
    ): CompletableFuture<IpPoolShowResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IpPoolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpPoolShowResponse>

    /** @see update */
    fun update(params: IpPoolUpdateParams): CompletableFuture<IpPoolShowResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<IpPoolShowResponse> =
        update(id, IpPoolUpdateParams.none(), requestOptions)

    /**
     * List the account's dedicated-IP pools. Member IPs are not included (`ips` is empty); retrieve
     * a pool to see its members.
     */
    fun list(): CompletableFuture<IpPoolListResponse> = list(IpPoolListParams.none())

    /** @see list */
    fun list(
        params: IpPoolListParams = IpPoolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IpPoolListResponse>

    /** @see list */
    fun list(
        params: IpPoolListParams = IpPoolListParams.none()
    ): CompletableFuture<IpPoolListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IpPoolListResponse> =
        list(IpPoolListParams.none(), requestOptions)

    /**
     * Delete the pool. Member IPs are kept but leave the pool, so they carry no mail until added to
     * another pool. Deleting a pool changes routing for subsequently resolved messages. It does not
     * reroute messages already assigned to the deleted pool. Deleting a pool that still has IPs
     * requires `force=true` and `drain=true`.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, IpPoolDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IpPoolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: IpPoolDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, IpPoolDeleteParams.none(), requestOptions)

    /**
     * A view of [IpPoolServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpPoolServiceAsync.WithRawResponse

        /** Group dedicated IPs into pools for sending. */
        fun ips(): IpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/ip_pools`, but is otherwise the same as
         * [IpPoolServiceAsync.create].
         */
        fun create(
            params: IpPoolCreateParams
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IpPoolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>>

        /**
         * Returns a raw HTTP response for `get /email/ip_pools/{id}`, but is otherwise the same as
         * [IpPoolServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            retrieve(id, IpPoolRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IpPoolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>>

        /** @see retrieve */
        fun retrieve(
            params: IpPoolRetrieveParams
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            retrieve(id, IpPoolRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email/ip_pools/{id}`, but is otherwise the same
         * as [IpPoolServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            update(id, IpPoolUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IpPoolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>>

        /** @see update */
        fun update(
            params: IpPoolUpdateParams
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IpPoolShowResponse>> =
            update(id, IpPoolUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email/ip_pools`, but is otherwise the same as
         * [IpPoolServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IpPoolListResponse>> =
            list(IpPoolListParams.none())

        /** @see list */
        fun list(
            params: IpPoolListParams = IpPoolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IpPoolListResponse>>

        /** @see list */
        fun list(
            params: IpPoolListParams = IpPoolListParams.none()
        ): CompletableFuture<HttpResponseFor<IpPoolListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IpPoolListResponse>> =
            list(IpPoolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email/ip_pools/{id}`, but is otherwise the same
         * as [IpPoolServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, IpPoolDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IpPoolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: IpPoolDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, IpPoolDeleteParams.none(), requestOptions)
    }
}
