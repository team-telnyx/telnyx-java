// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.notificationsettings.NotificationSetting
import com.telnyx.api.models.notificationsettings.NotificationSettingCreateParams
import com.telnyx.api.models.notificationsettings.NotificationSettingCreateResponse
import com.telnyx.api.models.notificationsettings.NotificationSettingDeleteParams
import com.telnyx.api.models.notificationsettings.NotificationSettingDeleteResponse
import com.telnyx.api.models.notificationsettings.NotificationSettingListParams
import com.telnyx.api.models.notificationsettings.NotificationSettingListResponse
import com.telnyx.api.models.notificationsettings.NotificationSettingRetrieveParams
import com.telnyx.api.models.notificationsettings.NotificationSettingRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationSettingServiceAsync

    /** Add a notification setting. */
    fun create(): CompletableFuture<NotificationSettingCreateResponse> =
        create(NotificationSettingCreateParams.none())

    /** @see create */
    fun create(
        params: NotificationSettingCreateParams = NotificationSettingCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingCreateResponse>

    /** @see create */
    fun create(
        params: NotificationSettingCreateParams = NotificationSettingCreateParams.none()
    ): CompletableFuture<NotificationSettingCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        notificationSetting: NotificationSetting,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingCreateResponse> =
        create(
            NotificationSettingCreateParams.builder()
                .notificationSetting(notificationSetting)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        notificationSetting: NotificationSetting
    ): CompletableFuture<NotificationSettingCreateResponse> =
        create(notificationSetting, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<NotificationSettingCreateResponse> =
        create(NotificationSettingCreateParams.none(), requestOptions)

    /** Get a notification setting. */
    fun retrieve(id: String): CompletableFuture<NotificationSettingRetrieveResponse> =
        retrieve(id, NotificationSettingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
    ): CompletableFuture<NotificationSettingRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationSettingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NotificationSettingRetrieveParams
    ): CompletableFuture<NotificationSettingRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationSettingRetrieveResponse> =
        retrieve(id, NotificationSettingRetrieveParams.none(), requestOptions)

    /** List notification settings. */
    fun list(): CompletableFuture<NotificationSettingListResponse> =
        list(NotificationSettingListParams.none())

    /** @see list */
    fun list(
        params: NotificationSettingListParams = NotificationSettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingListResponse>

    /** @see list */
    fun list(
        params: NotificationSettingListParams = NotificationSettingListParams.none()
    ): CompletableFuture<NotificationSettingListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NotificationSettingListResponse> =
        list(NotificationSettingListParams.none(), requestOptions)

    /** Delete a notification setting. */
    fun delete(id: String): CompletableFuture<NotificationSettingDeleteResponse> =
        delete(id, NotificationSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
    ): CompletableFuture<NotificationSettingDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationSettingDeleteResponse>

    /** @see delete */
    fun delete(
        params: NotificationSettingDeleteParams
    ): CompletableFuture<NotificationSettingDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationSettingDeleteResponse> =
        delete(id, NotificationSettingDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationSettingServiceAsync] that provides access to raw HTTP responses for
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
        ): NotificationSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notification_settings`, but is otherwise the same
         * as [NotificationSettingServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<NotificationSettingCreateResponse>> =
            create(NotificationSettingCreateParams.none())

        /** @see create */
        fun create(
            params: NotificationSettingCreateParams = NotificationSettingCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingCreateResponse>>

        /** @see create */
        fun create(
            params: NotificationSettingCreateParams = NotificationSettingCreateParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationSettingCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            notificationSetting: NotificationSetting,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingCreateResponse>> =
            create(
                NotificationSettingCreateParams.builder()
                    .notificationSetting(notificationSetting)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            notificationSetting: NotificationSetting
        ): CompletableFuture<HttpResponseFor<NotificationSettingCreateResponse>> =
            create(notificationSetting, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationSettingCreateResponse>> =
            create(NotificationSettingCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_settings/{id}`, but is otherwise the
         * same as [NotificationSettingServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationSettingRetrieveResponse>> =
            retrieve(id, NotificationSettingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NotificationSettingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NotificationSettingRetrieveParams
        ): CompletableFuture<HttpResponseFor<NotificationSettingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationSettingRetrieveResponse>> =
            retrieve(id, NotificationSettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_settings`, but is otherwise the same
         * as [NotificationSettingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationSettingListResponse>> =
            list(NotificationSettingListParams.none())

        /** @see list */
        fun list(
            params: NotificationSettingListParams = NotificationSettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingListResponse>>

        /** @see list */
        fun list(
            params: NotificationSettingListParams = NotificationSettingListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationSettingListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationSettingListResponse>> =
            list(NotificationSettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /notification_settings/{id}`, but is otherwise
         * the same as [NotificationSettingServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationSettingDeleteResponse>> =
            delete(id, NotificationSettingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NotificationSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationSettingDeleteResponse>>

        /** @see delete */
        fun delete(
            params: NotificationSettingDeleteParams
        ): CompletableFuture<HttpResponseFor<NotificationSettingDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationSettingDeleteResponse>> =
            delete(id, NotificationSettingDeleteParams.none(), requestOptions)
    }
}
