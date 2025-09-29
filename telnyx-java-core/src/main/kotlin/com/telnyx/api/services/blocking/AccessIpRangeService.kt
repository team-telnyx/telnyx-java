// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.accessipranges.AccessIpRange
import com.telnyx.api.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.api.models.accessipranges.AccessIpRangeDeleteParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListResponse
import java.util.function.Consumer

interface AccessIpRangeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpRangeService

    /** Create new Access IP Range */
    fun create(params: AccessIpRangeCreateParams): AccessIpRange =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccessIpRangeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpRange

    /** List all Access IP Ranges */
    fun list(): AccessIpRangeListResponse = list(AccessIpRangeListParams.none())

    /** @see list */
    fun list(
        params: AccessIpRangeListParams = AccessIpRangeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpRangeListResponse

    /** @see list */
    fun list(
        params: AccessIpRangeListParams = AccessIpRangeListParams.none()
    ): AccessIpRangeListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccessIpRangeListResponse =
        list(AccessIpRangeListParams.none(), requestOptions)

    /** Delete access IP ranges */
    fun delete(accessIpRangeId: String): AccessIpRange =
        delete(accessIpRangeId, AccessIpRangeDeleteParams.none())

    /** @see delete */
    fun delete(
        accessIpRangeId: String,
        params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpRange =
        delete(params.toBuilder().accessIpRangeId(accessIpRangeId).build(), requestOptions)

    /** @see delete */
    fun delete(
        accessIpRangeId: String,
        params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
    ): AccessIpRange = delete(accessIpRangeId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccessIpRangeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpRange

    /** @see delete */
    fun delete(params: AccessIpRangeDeleteParams): AccessIpRange =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(accessIpRangeId: String, requestOptions: RequestOptions): AccessIpRange =
        delete(accessIpRangeId, AccessIpRangeDeleteParams.none(), requestOptions)

    /**
     * A view of [AccessIpRangeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessIpRangeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /access_ip_ranges`, but is otherwise the same as
         * [AccessIpRangeService.create].
         */
        @MustBeClosed
        fun create(params: AccessIpRangeCreateParams): HttpResponseFor<AccessIpRange> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccessIpRangeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpRange>

        /**
         * Returns a raw HTTP response for `get /access_ip_ranges`, but is otherwise the same as
         * [AccessIpRangeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccessIpRangeListResponse> =
            list(AccessIpRangeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessIpRangeListParams = AccessIpRangeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpRangeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessIpRangeListParams = AccessIpRangeListParams.none()
        ): HttpResponseFor<AccessIpRangeListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccessIpRangeListResponse> =
            list(AccessIpRangeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /access_ip_ranges/{access_ip_range_id}`, but is
         * otherwise the same as [AccessIpRangeService.delete].
         */
        @MustBeClosed
        fun delete(accessIpRangeId: String): HttpResponseFor<AccessIpRange> =
            delete(accessIpRangeId, AccessIpRangeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessIpRangeId: String,
            params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpRange> =
            delete(params.toBuilder().accessIpRangeId(accessIpRangeId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessIpRangeId: String,
            params: AccessIpRangeDeleteParams = AccessIpRangeDeleteParams.none(),
        ): HttpResponseFor<AccessIpRange> = delete(accessIpRangeId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccessIpRangeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpRange>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccessIpRangeDeleteParams): HttpResponseFor<AccessIpRange> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessIpRangeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpRange> =
            delete(accessIpRangeId, AccessIpRangeDeleteParams.none(), requestOptions)
    }
}
