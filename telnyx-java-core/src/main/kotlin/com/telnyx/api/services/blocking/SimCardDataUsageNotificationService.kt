// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationListParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationListResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveResponse
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
import com.telnyx.api.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateResponse
import java.util.function.Consumer

interface SimCardDataUsageNotificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardDataUsageNotificationService

    /** Creates a new SIM card data usage notification. */
    fun create(
        params: SimCardDataUsageNotificationCreateParams
    ): SimCardDataUsageNotificationCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SimCardDataUsageNotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationCreateResponse

    /** Get a single SIM Card Data Usage Notification. */
    fun retrieve(id: String): SimCardDataUsageNotificationRetrieveResponse =
        retrieve(id, SimCardDataUsageNotificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardDataUsageNotificationRetrieveParams =
            SimCardDataUsageNotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardDataUsageNotificationRetrieveParams =
            SimCardDataUsageNotificationRetrieveParams.none(),
    ): SimCardDataUsageNotificationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardDataUsageNotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: SimCardDataUsageNotificationRetrieveParams
    ): SimCardDataUsageNotificationRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationRetrieveResponse =
        retrieve(id, SimCardDataUsageNotificationRetrieveParams.none(), requestOptions)

    /** Updates information for a SIM Card Data Usage Notification. */
    fun update(
        pathId: String,
        params: SimCardDataUsageNotificationUpdateParams,
    ): SimCardDataUsageNotificationUpdateResponse = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: SimCardDataUsageNotificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationUpdateResponse =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(
        params: SimCardDataUsageNotificationUpdateParams
    ): SimCardDataUsageNotificationUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SimCardDataUsageNotificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationUpdateResponse

    /**
     * Lists a paginated collection of SIM card data usage notifications. It enables exploring the
     * collection using specific filters.
     */
    fun list(): SimCardDataUsageNotificationListResponse =
        list(SimCardDataUsageNotificationListParams.none())

    /** @see list */
    fun list(
        params: SimCardDataUsageNotificationListParams =
            SimCardDataUsageNotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationListResponse

    /** @see list */
    fun list(
        params: SimCardDataUsageNotificationListParams =
            SimCardDataUsageNotificationListParams.none()
    ): SimCardDataUsageNotificationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SimCardDataUsageNotificationListResponse =
        list(SimCardDataUsageNotificationListParams.none(), requestOptions)

    /** Delete the SIM Card Data Usage Notification. */
    fun delete(id: String): SimCardDataUsageNotificationDeleteResponse =
        delete(id, SimCardDataUsageNotificationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDataUsageNotificationDeleteParams =
            SimCardDataUsageNotificationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDataUsageNotificationDeleteParams =
            SimCardDataUsageNotificationDeleteParams.none(),
    ): SimCardDataUsageNotificationDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SimCardDataUsageNotificationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardDataUsageNotificationDeleteResponse

    /** @see delete */
    fun delete(
        params: SimCardDataUsageNotificationDeleteParams
    ): SimCardDataUsageNotificationDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationDeleteResponse =
        delete(id, SimCardDataUsageNotificationDeleteParams.none(), requestOptions)

    /**
     * A view of [SimCardDataUsageNotificationService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardDataUsageNotificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_data_usage_notifications`, but is
         * otherwise the same as [SimCardDataUsageNotificationService.create].
         */
        @MustBeClosed
        fun create(
            params: SimCardDataUsageNotificationCreateParams
        ): HttpResponseFor<SimCardDataUsageNotificationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SimCardDataUsageNotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /sim_card_data_usage_notifications/{id}`, but is
         * otherwise the same as [SimCardDataUsageNotificationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse> =
            retrieve(id, SimCardDataUsageNotificationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardDataUsageNotificationRetrieveParams =
                SimCardDataUsageNotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardDataUsageNotificationRetrieveParams =
                SimCardDataUsageNotificationRetrieveParams.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardDataUsageNotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardDataUsageNotificationRetrieveParams
        ): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse> =
            retrieve(id, SimCardDataUsageNotificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sim_card_data_usage_notifications/{id}`, but is
         * otherwise the same as [SimCardDataUsageNotificationService.update].
         */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SimCardDataUsageNotificationUpdateParams,
        ): HttpResponseFor<SimCardDataUsageNotificationUpdateResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: SimCardDataUsageNotificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: SimCardDataUsageNotificationUpdateParams
        ): HttpResponseFor<SimCardDataUsageNotificationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SimCardDataUsageNotificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /sim_card_data_usage_notifications`, but is
         * otherwise the same as [SimCardDataUsageNotificationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SimCardDataUsageNotificationListResponse> =
            list(SimCardDataUsageNotificationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardDataUsageNotificationListParams =
                SimCardDataUsageNotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardDataUsageNotificationListParams =
                SimCardDataUsageNotificationListParams.none()
        ): HttpResponseFor<SimCardDataUsageNotificationListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SimCardDataUsageNotificationListResponse> =
            list(SimCardDataUsageNotificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /sim_card_data_usage_notifications/{id}`, but is
         * otherwise the same as [SimCardDataUsageNotificationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse> =
            delete(id, SimCardDataUsageNotificationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SimCardDataUsageNotificationDeleteParams =
                SimCardDataUsageNotificationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SimCardDataUsageNotificationDeleteParams =
                SimCardDataUsageNotificationDeleteParams.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SimCardDataUsageNotificationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SimCardDataUsageNotificationDeleteParams
        ): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse> =
            delete(id, SimCardDataUsageNotificationDeleteParams.none(), requestOptions)
    }
}
