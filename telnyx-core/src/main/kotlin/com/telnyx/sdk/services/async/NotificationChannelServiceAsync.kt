// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationchannels.NotificationChannel
import com.telnyx.sdk.models.notificationchannels.NotificationChannelCreateParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelCreateResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelDeleteParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelDeleteResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelListPageAsync
import com.telnyx.sdk.models.notificationchannels.NotificationChannelListParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelRetrieveParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelRetrieveResponse
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateParams
import com.telnyx.sdk.models.notificationchannels.NotificationChannelUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationChannelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationChannelServiceAsync

    /** Create a notification channel. */
    fun create(): CompletableFuture<NotificationChannelCreateResponse> =
        create(NotificationChannelCreateParams.none())

    /** @see create */
    fun create(
        params: NotificationChannelCreateParams = NotificationChannelCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelCreateResponse>

    /** @see create */
    fun create(
        params: NotificationChannelCreateParams = NotificationChannelCreateParams.none()
    ): CompletableFuture<NotificationChannelCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        notificationChannel: NotificationChannel,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelCreateResponse> =
        create(
            NotificationChannelCreateParams.builder()
                .notificationChannel(notificationChannel)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        notificationChannel: NotificationChannel
    ): CompletableFuture<NotificationChannelCreateResponse> =
        create(notificationChannel, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<NotificationChannelCreateResponse> =
        create(NotificationChannelCreateParams.none(), requestOptions)

    /** Get a notification channel. */
    fun retrieve(id: String): CompletableFuture<NotificationChannelRetrieveResponse> =
        retrieve(id, NotificationChannelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
    ): CompletableFuture<NotificationChannelRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationChannelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NotificationChannelRetrieveParams
    ): CompletableFuture<NotificationChannelRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelRetrieveResponse> =
        retrieve(id, NotificationChannelRetrieveParams.none(), requestOptions)

    /** Update a notification channel. */
    fun update(
        notificationChannelId: String,
        params: NotificationChannelUpdateParams,
    ): CompletableFuture<NotificationChannelUpdateResponse> =
        update(notificationChannelId, params, RequestOptions.none())

    /** @see update */
    fun update(
        notificationChannelId: String,
        params: NotificationChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelUpdateResponse> =
        update(
            params.toBuilder().notificationChannelId(notificationChannelId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: NotificationChannelUpdateParams
    ): CompletableFuture<NotificationChannelUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NotificationChannelUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelUpdateResponse>

    /** List notification channels. */
    fun list(): CompletableFuture<NotificationChannelListPageAsync> =
        list(NotificationChannelListParams.none())

    /** @see list */
    fun list(
        params: NotificationChannelListParams = NotificationChannelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelListPageAsync>

    /** @see list */
    fun list(
        params: NotificationChannelListParams = NotificationChannelListParams.none()
    ): CompletableFuture<NotificationChannelListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NotificationChannelListPageAsync> =
        list(NotificationChannelListParams.none(), requestOptions)

    /** Delete a notification channel. */
    fun delete(id: String): CompletableFuture<NotificationChannelDeleteResponse> =
        delete(id, NotificationChannelDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
    ): CompletableFuture<NotificationChannelDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationChannelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationChannelDeleteResponse>

    /** @see delete */
    fun delete(
        params: NotificationChannelDeleteParams
    ): CompletableFuture<NotificationChannelDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationChannelDeleteResponse> =
        delete(id, NotificationChannelDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationChannelServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationChannelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notification_channels`, but is otherwise the same
         * as [NotificationChannelServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>> =
            create(NotificationChannelCreateParams.none())

        /** @see create */
        fun create(
            params: NotificationChannelCreateParams = NotificationChannelCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>>

        /** @see create */
        fun create(
            params: NotificationChannelCreateParams = NotificationChannelCreateParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            notificationChannel: NotificationChannel,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>> =
            create(
                NotificationChannelCreateParams.builder()
                    .notificationChannel(notificationChannel)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            notificationChannel: NotificationChannel
        ): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>> =
            create(notificationChannel, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationChannelCreateResponse>> =
            create(NotificationChannelCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_channels/{id}`, but is otherwise the
         * same as [NotificationChannelServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>> =
            retrieve(id, NotificationChannelRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationChannelRetrieveParams = NotificationChannelRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NotificationChannelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NotificationChannelRetrieveParams
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelRetrieveResponse>> =
            retrieve(id, NotificationChannelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /notification_channels/{id}`, but is otherwise the
         * same as [NotificationChannelServiceAsync.update].
         */
        fun update(
            notificationChannelId: String,
            params: NotificationChannelUpdateParams,
        ): CompletableFuture<HttpResponseFor<NotificationChannelUpdateResponse>> =
            update(notificationChannelId, params, RequestOptions.none())

        /** @see update */
        fun update(
            notificationChannelId: String,
            params: NotificationChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelUpdateResponse>> =
            update(
                params.toBuilder().notificationChannelId(notificationChannelId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: NotificationChannelUpdateParams
        ): CompletableFuture<HttpResponseFor<NotificationChannelUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NotificationChannelUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /notification_channels`, but is otherwise the same
         * as [NotificationChannelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationChannelListPageAsync>> =
            list(NotificationChannelListParams.none())

        /** @see list */
        fun list(
            params: NotificationChannelListParams = NotificationChannelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelListPageAsync>>

        /** @see list */
        fun list(
            params: NotificationChannelListParams = NotificationChannelListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationChannelListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationChannelListPageAsync>> =
            list(NotificationChannelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /notification_channels/{id}`, but is otherwise
         * the same as [NotificationChannelServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>> =
            delete(id, NotificationChannelDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NotificationChannelDeleteParams = NotificationChannelDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NotificationChannelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>>

        /** @see delete */
        fun delete(
            params: NotificationChannelDeleteParams
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationChannelDeleteResponse>> =
            delete(id, NotificationChannelDeleteParams.none(), requestOptions)
    }
}
