// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.notificationprofiles.NotificationProfile
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileCreateParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileCreateResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileDeleteParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileDeleteResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileListParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileListResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileRetrieveParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileRetrieveResponse
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileUpdateParams
import com.telnyx.sdk.models.notificationprofiles.NotificationProfileUpdateResponse
import java.util.function.Consumer

interface NotificationProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationProfileService

    /** Create a notification profile. */
    fun create(): NotificationProfileCreateResponse = create(NotificationProfileCreateParams.none())

    /** @see create */
    fun create(
        params: NotificationProfileCreateParams = NotificationProfileCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileCreateResponse

    /** @see create */
    fun create(
        params: NotificationProfileCreateParams = NotificationProfileCreateParams.none()
    ): NotificationProfileCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        notificationProfile: NotificationProfile,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileCreateResponse =
        create(
            NotificationProfileCreateParams.builder()
                .notificationProfile(notificationProfile)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(notificationProfile: NotificationProfile): NotificationProfileCreateResponse =
        create(notificationProfile, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): NotificationProfileCreateResponse =
        create(NotificationProfileCreateParams.none(), requestOptions)

    /** Get a notification profile. */
    fun retrieve(id: String): NotificationProfileRetrieveResponse =
        retrieve(id, NotificationProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
    ): NotificationProfileRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NotificationProfileRetrieveParams): NotificationProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NotificationProfileRetrieveResponse =
        retrieve(id, NotificationProfileRetrieveParams.none(), requestOptions)

    /** Update a notification profile. */
    fun update(
        pathId: String,
        params: NotificationProfileUpdateParams,
    ): NotificationProfileUpdateResponse = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NotificationProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileUpdateResponse =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: NotificationProfileUpdateParams): NotificationProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NotificationProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileUpdateResponse

    /** Returns a list of your notifications profiles. */
    fun list(): NotificationProfileListResponse = list(NotificationProfileListParams.none())

    /** @see list */
    fun list(
        params: NotificationProfileListParams = NotificationProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileListResponse

    /** @see list */
    fun list(
        params: NotificationProfileListParams = NotificationProfileListParams.none()
    ): NotificationProfileListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationProfileListResponse =
        list(NotificationProfileListParams.none(), requestOptions)

    /** Delete a notification profile. */
    fun delete(id: String): NotificationProfileDeleteResponse =
        delete(id, NotificationProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
    ): NotificationProfileDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationProfileDeleteResponse

    /** @see delete */
    fun delete(params: NotificationProfileDeleteParams): NotificationProfileDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): NotificationProfileDeleteResponse =
        delete(id, NotificationProfileDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationProfileService] that provides access to raw HTTP responses for each
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
        ): NotificationProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notification_profiles`, but is otherwise the same
         * as [NotificationProfileService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<NotificationProfileCreateResponse> =
            create(NotificationProfileCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationProfileCreateParams = NotificationProfileCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationProfileCreateParams = NotificationProfileCreateParams.none()
        ): HttpResponseFor<NotificationProfileCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            notificationProfile: NotificationProfile,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileCreateResponse> =
            create(
                NotificationProfileCreateParams.builder()
                    .notificationProfile(notificationProfile)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            notificationProfile: NotificationProfile
        ): HttpResponseFor<NotificationProfileCreateResponse> =
            create(notificationProfile, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<NotificationProfileCreateResponse> =
            create(NotificationProfileCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_profiles/{id}`, but is otherwise the
         * same as [NotificationProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NotificationProfileRetrieveResponse> =
            retrieve(id, NotificationProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
        ): HttpResponseFor<NotificationProfileRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationProfileRetrieveParams
        ): HttpResponseFor<NotificationProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileRetrieveResponse> =
            retrieve(id, NotificationProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /notification_profiles/{id}`, but is otherwise the
         * same as [NotificationProfileService.update].
         */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NotificationProfileUpdateParams,
        ): HttpResponseFor<NotificationProfileUpdateResponse> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NotificationProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: NotificationProfileUpdateParams
        ): HttpResponseFor<NotificationProfileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NotificationProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /notification_profiles`, but is otherwise the same
         * as [NotificationProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationProfileListResponse> =
            list(NotificationProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationProfileListParams = NotificationProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationProfileListParams = NotificationProfileListParams.none()
        ): HttpResponseFor<NotificationProfileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NotificationProfileListResponse> =
            list(NotificationProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /notification_profiles/{id}`, but is otherwise
         * the same as [NotificationProfileService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<NotificationProfileDeleteResponse> =
            delete(id, NotificationProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
        ): HttpResponseFor<NotificationProfileDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationProfileDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NotificationProfileDeleteParams
        ): HttpResponseFor<NotificationProfileDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileDeleteResponse> =
            delete(id, NotificationProfileDeleteParams.none(), requestOptions)
    }
}
