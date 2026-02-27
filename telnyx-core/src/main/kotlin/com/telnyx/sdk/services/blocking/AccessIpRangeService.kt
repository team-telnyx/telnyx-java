// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.accessipranges.AccessIpRange
import com.telnyx.sdk.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeDeleteParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListPage
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListParams
import java.util.function.Consumer

/** IP Range Operations */
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
    fun list(): AccessIpRangeListPage = list(AccessIpRangeListParams.none())

    /** @see list */
    fun list(
        params: AccessIpRangeListParams = AccessIpRangeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessIpRangeListPage

    /** @see list */
    fun list(
        params: AccessIpRangeListParams = AccessIpRangeListParams.none()
    ): AccessIpRangeListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccessIpRangeListPage =
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
        fun list(): HttpResponseFor<AccessIpRangeListPage> = list(AccessIpRangeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessIpRangeListParams = AccessIpRangeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessIpRangeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessIpRangeListParams = AccessIpRangeListParams.none()
        ): HttpResponseFor<AccessIpRangeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccessIpRangeListPage> =
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
