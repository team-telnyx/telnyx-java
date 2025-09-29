// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.accessipranges.AccessIpRange
import com.telnyx.api.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.api.models.accessipranges.AccessIpRangeDeleteParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccessIpRangeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpRangeServiceAsync

    /** Create new Access IP Range */
    fun create(params: AccessIpRangeCreateParams): CompletableFuture<AccessIpRange> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccessIpRangeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpRange>

    /** List all Access IP Ranges */
    fun list(): CompletableFuture<AccessIpRangeListResponse> = list(AccessIpRangeListParams.none())

    /** @see list */
    fun list(
        params: AccessIpRangeListParams = AccessIpRangeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpRangeListResponse>

    /** @see list */
    fun list(
        params: AccessIpRangeListParams = AccessIpRangeListParams.none()
    ): CompletableFuture<AccessIpRangeListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccessIpRangeListResponse> =
        list(AccessIpRangeListParams.none(), requestOptions)

    /** Delete access IP ranges */
    fun delete(accessIpRangeId: String): CompletableFuture<AccessIpRange> =
        delete(accessIpRangeId, AccessIpRangeDeleteParams.none())

    /** @see delete */
    fun delete(
        accessIpRangeId: String,
        params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpRange> =
        delete(params.toBuilder().accessIpRangeId(accessIpRangeId).build(), requestOptions)

    /** @see delete */
    fun delete(
        accessIpRangeId: String,
        params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
    ): CompletableFuture<AccessIpRange> = delete(accessIpRangeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccessIpRangeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessIpRange>

    /** @see delete */
    fun delete(params: AccessIpRangeDeleteParams): CompletableFuture<AccessIpRange> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        accessIpRangeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessIpRange> =
        delete(accessIpRangeId, AccessIpRangeDeleteParams.none(), requestOptions)

    /**
     * A view of [AccessIpRangeServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccessIpRangeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /access_ip_ranges`, but is otherwise the same as
         * [AccessIpRangeServiceAsync.create].
         */
        fun create(
            params: AccessIpRangeCreateParams
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccessIpRangeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpRange>>

        /**
         * Returns a raw HTTP response for `get /access_ip_ranges`, but is otherwise the same as
         * [AccessIpRangeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccessIpRangeListResponse>> =
            list(AccessIpRangeListParams.none())

        /** @see list */
        fun list(
            params: AccessIpRangeListParams = AccessIpRangeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpRangeListResponse>>

        /** @see list */
        fun list(
            params: AccessIpRangeListParams = AccessIpRangeListParams.none()
        ): CompletableFuture<HttpResponseFor<AccessIpRangeListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccessIpRangeListResponse>> =
            list(AccessIpRangeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /access_ip_ranges/{access_ip_range_id}`, but is
         * otherwise the same as [AccessIpRangeServiceAsync.delete].
         */
        fun delete(accessIpRangeId: String): CompletableFuture<HttpResponseFor<AccessIpRange>> =
            delete(accessIpRangeId, AccessIpRangeDeleteParams.none())

        /** @see delete */
        fun delete(
            accessIpRangeId: String,
            params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> =
            delete(params.toBuilder().accessIpRangeId(accessIpRangeId).build(), requestOptions)

        /** @see delete */
        fun delete(
            accessIpRangeId: String,
            params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> =
            delete(accessIpRangeId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AccessIpRangeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessIpRange>>

        /** @see delete */
        fun delete(
            params: AccessIpRangeDeleteParams
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            accessIpRangeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> =
            delete(accessIpRangeId, AccessIpRangeDeleteParams.none(), requestOptions)
    }
}
