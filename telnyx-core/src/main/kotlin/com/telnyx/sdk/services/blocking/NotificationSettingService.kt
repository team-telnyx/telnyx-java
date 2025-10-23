// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationsettings.NotificationSetting
import com.telnyx.sdk.models.notificationsettings.NotificationSettingCreateParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingCreateResponse
import com.telnyx.sdk.models.notificationsettings.NotificationSettingDeleteParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingDeleteResponse
import com.telnyx.sdk.models.notificationsettings.NotificationSettingListParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingListResponse
import com.telnyx.sdk.models.notificationsettings.NotificationSettingRetrieveParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingRetrieveResponse
import java.util.function.Consumer

interface NotificationSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationSettingService

    /** Add a notification setting. */
    fun create(): NotificationSettingCreateResponse = create(NotificationSettingCreateParams.none())

    /** @see create */
    fun create(
        params: NotificationSettingCreateParams = NotificationSettingCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingCreateResponse

    /** @see create */
    fun create(
        params: NotificationSettingCreateParams = NotificationSettingCreateParams.none()
    ): NotificationSettingCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        notificationSetting: NotificationSetting,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingCreateResponse =
        create(
            NotificationSettingCreateParams.builder()
                .notificationSetting(notificationSetting)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(notificationSetting: NotificationSetting): NotificationSettingCreateResponse =
        create(notificationSetting, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): NotificationSettingCreateResponse =
        create(NotificationSettingCreateParams.none(), requestOptions)

    /** Get a notification setting. */
    fun retrieve(id: String): NotificationSettingRetrieveResponse =
        retrieve(id, NotificationSettingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
    ): NotificationSettingRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationSettingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NotificationSettingRetrieveParams): NotificationSettingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NotificationSettingRetrieveResponse =
        retrieve(id, NotificationSettingRetrieveParams.none(), requestOptions)

    /** List notification settings. */
    fun list(): NotificationSettingListResponse = list(NotificationSettingListParams.none())

    /** @see list */
    fun list(
        params: NotificationSettingListParams = NotificationSettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingListResponse

    /** @see list */
    fun list(
        params: NotificationSettingListParams = NotificationSettingListParams.none()
    ): NotificationSettingListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationSettingListResponse =
        list(NotificationSettingListParams.none(), requestOptions)

    /** Delete a notification setting. */
    fun delete(id: String): NotificationSettingDeleteResponse =
        delete(id, NotificationSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
    ): NotificationSettingDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationSettingDeleteResponse

    /** @see delete */
    fun delete(params: NotificationSettingDeleteParams): NotificationSettingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): NotificationSettingDeleteResponse =
        delete(id, NotificationSettingDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationSettingService] that provides access to raw HTTP responses for each
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
        ): NotificationSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notification_settings`, but is otherwise the same
         * as [NotificationSettingService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<NotificationSettingCreateResponse> =
            create(NotificationSettingCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationSettingCreateParams = NotificationSettingCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationSettingCreateParams = NotificationSettingCreateParams.none()
        ): HttpResponseFor<NotificationSettingCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            notificationSetting: NotificationSetting,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingCreateResponse> =
            create(
                NotificationSettingCreateParams.builder()
                    .notificationSetting(notificationSetting)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            notificationSetting: NotificationSetting
        ): HttpResponseFor<NotificationSettingCreateResponse> =
            create(notificationSetting, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotificationSettingCreateResponse> =
            create(NotificationSettingCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_settings/{id}`, but is otherwise the
         * same as [NotificationSettingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NotificationSettingRetrieveResponse> =
            retrieve(id, NotificationSettingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationSettingRetrieveParams = NotificationSettingRetrieveParams.none(),
        ): HttpResponseFor<NotificationSettingRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationSettingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationSettingRetrieveParams
        ): HttpResponseFor<NotificationSettingRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationSettingRetrieveResponse> =
            retrieve(id, NotificationSettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_settings`, but is otherwise the same
         * as [NotificationSettingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationSettingListResponse> =
            list(NotificationSettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationSettingListParams = NotificationSettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationSettingListParams = NotificationSettingListParams.none()
        ): HttpResponseFor<NotificationSettingListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NotificationSettingListResponse> =
            list(NotificationSettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /notification_settings/{id}`, but is otherwise
         * the same as [NotificationSettingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<NotificationSettingDeleteResponse> =
            delete(id, NotificationSettingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationSettingDeleteParams = NotificationSettingDeleteParams.none(),
        ): HttpResponseFor<NotificationSettingDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationSettingDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationSettingDeleteParams
        ): HttpResponseFor<NotificationSettingDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationSettingDeleteResponse> =
            delete(id, NotificationSettingDeleteParams.none(), requestOptions)
    }
}
