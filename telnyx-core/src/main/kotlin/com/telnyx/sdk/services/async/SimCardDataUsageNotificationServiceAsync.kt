// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationListPageAsync
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationListParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SimCardDataUsageNotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SimCardDataUsageNotificationServiceAsync

    /** Creates a new SIM card data usage notification. */
    fun create(
        params: SimCardDataUsageNotificationCreateParams
    ): CompletableFuture<SimCardDataUsageNotificationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SimCardDataUsageNotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationCreateResponse>

    /** Get a single SIM Card Data Usage Notification. */
    fun retrieve(id: String): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse> =
        retrieve(id, SimCardDataUsageNotificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardDataUsageNotificationRetrieveParams =
            SimCardDataUsageNotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardDataUsageNotificationRetrieveParams =
            SimCardDataUsageNotificationRetrieveParams.none(),
    ): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardDataUsageNotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SimCardDataUsageNotificationRetrieveParams
    ): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationRetrieveResponse> =
        retrieve(id, SimCardDataUsageNotificationRetrieveParams.none(), requestOptions)

    /** Updates information for a SIM Card Data Usage Notification. */
    fun update(
        simCardDataUsageNotificationId: String,
        params: SimCardDataUsageNotificationUpdateParams,
    ): CompletableFuture<SimCardDataUsageNotificationUpdateResponse> =
        update(simCardDataUsageNotificationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        simCardDataUsageNotificationId: String,
        params: SimCardDataUsageNotificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationUpdateResponse> =
        update(
            params
                .toBuilder()
                .simCardDataUsageNotificationId(simCardDataUsageNotificationId)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: SimCardDataUsageNotificationUpdateParams
    ): CompletableFuture<SimCardDataUsageNotificationUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SimCardDataUsageNotificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationUpdateResponse>

    /**
     * Lists a paginated collection of SIM card data usage notifications. It enables exploring the
     * collection using specific filters.
     */
    fun list(): CompletableFuture<SimCardDataUsageNotificationListPageAsync> =
        list(SimCardDataUsageNotificationListParams.none())

    /** @see list */
    fun list(
        params: SimCardDataUsageNotificationListParams =
            SimCardDataUsageNotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationListPageAsync>

    /** @see list */
    fun list(
        params: SimCardDataUsageNotificationListParams =
            SimCardDataUsageNotificationListParams.none()
    ): CompletableFuture<SimCardDataUsageNotificationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<SimCardDataUsageNotificationListPageAsync> =
        list(SimCardDataUsageNotificationListParams.none(), requestOptions)

    /** Delete the SIM Card Data Usage Notification. */
    fun delete(id: String): CompletableFuture<SimCardDataUsageNotificationDeleteResponse> =
        delete(id, SimCardDataUsageNotificationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDataUsageNotificationDeleteParams =
            SimCardDataUsageNotificationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardDataUsageNotificationDeleteParams =
            SimCardDataUsageNotificationDeleteParams.none(),
    ): CompletableFuture<SimCardDataUsageNotificationDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SimCardDataUsageNotificationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardDataUsageNotificationDeleteResponse>

    /** @see delete */
    fun delete(
        params: SimCardDataUsageNotificationDeleteParams
    ): CompletableFuture<SimCardDataUsageNotificationDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardDataUsageNotificationDeleteResponse> =
        delete(id, SimCardDataUsageNotificationDeleteParams.none(), requestOptions)

    /**
     * A view of [SimCardDataUsageNotificationServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardDataUsageNotificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_data_usage_notifications`, but is
         * otherwise the same as [SimCardDataUsageNotificationServiceAsync.create].
         */
        fun create(
            params: SimCardDataUsageNotificationCreateParams
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SimCardDataUsageNotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /sim_card_data_usage_notifications/{id}`, but is
         * otherwise the same as [SimCardDataUsageNotificationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>> =
            retrieve(id, SimCardDataUsageNotificationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardDataUsageNotificationRetrieveParams =
                SimCardDataUsageNotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardDataUsageNotificationRetrieveParams =
                SimCardDataUsageNotificationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SimCardDataUsageNotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SimCardDataUsageNotificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse>> =
            retrieve(id, SimCardDataUsageNotificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sim_card_data_usage_notifications/{id}`, but is
         * otherwise the same as [SimCardDataUsageNotificationServiceAsync.update].
         */
        fun update(
            simCardDataUsageNotificationId: String,
            params: SimCardDataUsageNotificationUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationUpdateResponse>> =
            update(simCardDataUsageNotificationId, params, RequestOptions.none())

        /** @see update */
        fun update(
            simCardDataUsageNotificationId: String,
            params: SimCardDataUsageNotificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationUpdateResponse>> =
            update(
                params
                    .toBuilder()
                    .simCardDataUsageNotificationId(simCardDataUsageNotificationId)
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: SimCardDataUsageNotificationUpdateParams
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SimCardDataUsageNotificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /sim_card_data_usage_notifications`, but is
         * otherwise the same as [SimCardDataUsageNotificationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationListPageAsync>> =
            list(SimCardDataUsageNotificationListParams.none())

        /** @see list */
        fun list(
            params: SimCardDataUsageNotificationListParams =
                SimCardDataUsageNotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationListPageAsync>>

        /** @see list */
        fun list(
            params: SimCardDataUsageNotificationListParams =
                SimCardDataUsageNotificationListParams.none()
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationListPageAsync>> =
            list(SimCardDataUsageNotificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /sim_card_data_usage_notifications/{id}`, but is
         * otherwise the same as [SimCardDataUsageNotificationServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>> =
            delete(id, SimCardDataUsageNotificationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SimCardDataUsageNotificationDeleteParams =
                SimCardDataUsageNotificationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SimCardDataUsageNotificationDeleteParams =
                SimCardDataUsageNotificationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SimCardDataUsageNotificationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SimCardDataUsageNotificationDeleteParams
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardDataUsageNotificationDeleteResponse>> =
            delete(id, SimCardDataUsageNotificationDeleteParams.none(), requestOptions)
    }
}
