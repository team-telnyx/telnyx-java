// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.services.blocking.email.ippools.IpService
import java.util.function.Consumer

/** Group dedicated IPs into pools for sending. */
interface IpPoolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpPoolService

    /** Group dedicated IPs into pools for sending. */
    fun ips(): IpService

    /**
     * Create an account-scoped pool of dedicated IPs. Set `is_default` or `domain_id` for the pool
     * to carry mail; a pool with neither carries none.
     */
    fun create(params: IpPoolCreateParams): IpPoolShowResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: IpPoolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpPoolShowResponse

    /**
     * Retrieve a single IP pool by its identifier, including its dedicated-IP members with billing
     * state.
     */
    fun retrieve(id: String): IpPoolShowResponse = retrieve(id, IpPoolRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpPoolShowResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
    ): IpPoolShowResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IpPoolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpPoolShowResponse

    /** @see retrieve */
    fun retrieve(params: IpPoolRetrieveParams): IpPoolShowResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): IpPoolShowResponse =
        retrieve(id, IpPoolRetrieveParams.none(), requestOptions)

    /**
     * Rename the pool, set or clear the default flag, or change its domain scope. Routing follows
     * the new settings for subsequent mail.
     */
    fun update(id: String): IpPoolShowResponse = update(id, IpPoolUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpPoolShowResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
    ): IpPoolShowResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: IpPoolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpPoolShowResponse

    /** @see update */
    fun update(params: IpPoolUpdateParams): IpPoolShowResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): IpPoolShowResponse =
        update(id, IpPoolUpdateParams.none(), requestOptions)

    /**
     * List the account's dedicated-IP pools. Member IPs are not included (`ips` is empty); retrieve
     * a pool to see its members.
     */
    fun list(): IpPoolListResponse = list(IpPoolListParams.none())

    /** @see list */
    fun list(
        params: IpPoolListParams = IpPoolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IpPoolListResponse

    /** @see list */
    fun list(params: IpPoolListParams = IpPoolListParams.none()): IpPoolListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IpPoolListResponse =
        list(IpPoolListParams.none(), requestOptions)

    /**
     * Delete the pool. Member IPs are kept but leave the pool, so they carry no mail until added to
     * another pool. Deleting a pool changes routing for subsequently resolved messages. It does not
     * reroute messages already assigned to the deleted pool. Deleting a pool that still has IPs
     * requires `force=true` and `drain=true`.
     */
    fun delete(id: String) = delete(id, IpPoolDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: IpPoolDeleteParams = IpPoolDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: IpPoolDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: IpPoolDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, IpPoolDeleteParams.none(), requestOptions)

    /** A view of [IpPoolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpPoolService.WithRawResponse

        /** Group dedicated IPs into pools for sending. */
        fun ips(): IpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/ip_pools`, but is otherwise the same as
         * [IpPoolService.create].
         */
        @MustBeClosed
        fun create(params: IpPoolCreateParams): HttpResponseFor<IpPoolShowResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: IpPoolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpPoolShowResponse>

        /**
         * Returns a raw HTTP response for `get /email/ip_pools/{id}`, but is otherwise the same as
         * [IpPoolService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<IpPoolShowResponse> =
            retrieve(id, IpPoolRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpPoolShowResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IpPoolRetrieveParams = IpPoolRetrieveParams.none(),
        ): HttpResponseFor<IpPoolShowResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IpPoolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpPoolShowResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: IpPoolRetrieveParams): HttpResponseFor<IpPoolShowResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpPoolShowResponse> =
            retrieve(id, IpPoolRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email/ip_pools/{id}`, but is otherwise the same
         * as [IpPoolService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<IpPoolShowResponse> =
            update(id, IpPoolUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpPoolShowResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: IpPoolUpdateParams = IpPoolUpdateParams.none(),
        ): HttpResponseFor<IpPoolShowResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: IpPoolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpPoolShowResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: IpPoolUpdateParams): HttpResponseFor<IpPoolShowResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpPoolShowResponse> =
            update(id, IpPoolUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email/ip_pools`, but is otherwise the same as
         * [IpPoolService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IpPoolListResponse> = list(IpPoolListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpPoolListParams = IpPoolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IpPoolListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: IpPoolListParams = IpPoolListParams.none()
        ): HttpResponseFor<IpPoolListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IpPoolListResponse> =
            list(IpPoolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email/ip_pools/{id}`, but is otherwise the same
         * as [IpPoolService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, IpPoolDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: IpPoolDeleteParams = IpPoolDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: IpPoolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: IpPoolDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, IpPoolDeleteParams.none(), requestOptions)
    }
}
