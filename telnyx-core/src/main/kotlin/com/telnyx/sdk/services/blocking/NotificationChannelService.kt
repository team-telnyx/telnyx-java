// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationchannels.NotificationChannel
import com.telnyx.sdk.models.notificationchannels.NotificationChannelCreateParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelCreateResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelDeleteParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelDeleteResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelListParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelListResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelRetrieveParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelRetrieveResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateResponse
import java.util.function.Consumer

interface NotificationChannelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationChannelService

    /** Create a notification channel. */
    fun create(): NotificationChannelCreateResponse = create(NotificationChannelCreateParams.none())

    /** @see create */
    fun create(
        params: NotificationChannelCreateParams = NotificationChannelCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelCreateResponse

    /** @see create */
    fun create(
        params: NotificationChannelCreateParams = NotificationChannelCreateParams.none()
    ): NotificationChannelCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        notificationChannel: NotificationChannel,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelCreateResponse =
        create(
            NotificationChannelCreateParams.builder()
                .notificationChannel(notificationChannel)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(notificationChannel: NotificationChannel): NotificationChannelCreateResponse =
        create(notificationChannel, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): NotificationChannelCreateResponse =
        create(NotificationChannelCreateParams.none(), requestOptions)

    /** Get a notification channel. */
    fun retrieve(id: String): NotificationChannelRetrieveResponse =
        retrieve(id, NotificationChannelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
    ): NotificationChannelRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationChannelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NotificationChannelRetrieveParams): NotificationChannelRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NotificationChannelRetrieveResponse =
        retrieve(id, NotificationChannelRetrieveParams.none(), requestOptions)

    /** Update a notification channel. */
    fun update(
        pathId: String,
        params: NotificationChannelUpdateParams,
    ): NotificationChannelUpdateResponse = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NotificationChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelUpdateResponse =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: NotificationChannelUpdateParams): NotificationChannelUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NotificationChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelUpdateResponse

    /** List notification channels. */
    fun list(): NotificationChannelListResponse = list(NotificationChannelListParams.none())

    /** @see list */
    fun list(
        params: NotificationChannelListParams = NotificationChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelListResponse

    /** @see list */
    fun list(
        params: NotificationChannelListParams = NotificationChannelListParams.none()
    ): NotificationChannelListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationChannelListResponse =
        list(NotificationChannelListParams.none(), requestOptions)

    /** Delete a notification channel. */
    fun delete(id: String): NotificationChannelDeleteResponse =
        delete(id, NotificationChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
    ): NotificationChannelDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationChannelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationChannelDeleteResponse

    /** @see delete */
    fun delete(params: NotificationChannelDeleteParams): NotificationChannelDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): NotificationChannelDeleteResponse =
        delete(id, NotificationChannelDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationChannelService] that provides access to raw HTTP responses for each
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
        ): NotificationChannelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notification_channels`, but is otherwise the same
         * as [NotificationChannelService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<NotificationChannelCreateResponse> =
            create(NotificationChannelCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationChannelCreateParams = NotificationChannelCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationChannelCreateParams = NotificationChannelCreateParams.none()
        ): HttpResponseFor<NotificationChannelCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            notificationChannel: NotificationChannel,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelCreateResponse> =
            create(
                NotificationChannelCreateParams.builder()
                    .notificationChannel(notificationChannel)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            notificationChannel: NotificationChannel
        ): HttpResponseFor<NotificationChannelCreateResponse> =
            create(notificationChannel, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotificationChannelCreateResponse> =
            create(NotificationChannelCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_channels/{id}`, but is otherwise the
         * same as [NotificationChannelService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NotificationChannelRetrieveResponse> =
            retrieve(id, NotificationChannelRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
        ): HttpResponseFor<NotificationChannelRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationChannelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationChannelRetrieveParams
        ): HttpResponseFor<NotificationChannelRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelRetrieveResponse> =
            retrieve(id, NotificationChannelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /notification_channels/{id}`, but is otherwise the
         * same as [NotificationChannelService.update].
         */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NotificationChannelUpdateParams,
        ): HttpResponseFor<NotificationChannelUpdateResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NotificationChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: NotificationChannelUpdateParams
        ): HttpResponseFor<NotificationChannelUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NotificationChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /notification_channels`, but is otherwise the same
         * as [NotificationChannelService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationChannelListResponse> =
            list(NotificationChannelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationChannelListParams = NotificationChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationChannelListParams = NotificationChannelListParams.none()
        ): HttpResponseFor<NotificationChannelListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NotificationChannelListResponse> =
            list(NotificationChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /notification_channels/{id}`, but is otherwise
         * the same as [NotificationChannelService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<NotificationChannelDeleteResponse> =
            delete(id, NotificationChannelDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
        ): HttpResponseFor<NotificationChannelDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationChannelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationChannelDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationChannelDeleteParams
        ): HttpResponseFor<NotificationChannelDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelDeleteResponse> =
            delete(id, NotificationChannelDeleteParams.none(), requestOptions)
    }
}
