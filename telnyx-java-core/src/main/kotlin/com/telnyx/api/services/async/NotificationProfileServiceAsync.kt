// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.notificationprofiles.NotificationProfile
import com.telnyx.api.models.notificationprofiles.NotificationProfileCreateParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileCreateResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileDeleteParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileDeleteResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileListParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileListResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileRetrieveParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileRetrieveResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileUpdateParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationProfileServiceAsync

    /** Create a notification profile. */
    fun create(): CompletableFuture<NotificationProfileCreateResponse> =
        create(NotificationProfileCreateParams.none())

    /** @see create */
    fun create(
        params: NotificationProfileCreateParams = NotificationProfileCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileCreateResponse>

    /** @see create */
    fun create(
        params: NotificationProfileCreateParams = NotificationProfileCreateParams.none()
    ): CompletableFuture<NotificationProfileCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        notificationProfile: NotificationProfile,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileCreateResponse> =
        create(
            NotificationProfileCreateParams.builder()
                .notificationProfile(notificationProfile)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        notificationProfile: NotificationProfile
    ): CompletableFuture<NotificationProfileCreateResponse> =
        create(notificationProfile, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<NotificationProfileCreateResponse> =
        create(NotificationProfileCreateParams.none(), requestOptions)

    /** Get a notification profile. */
    fun retrieve(id: String): CompletableFuture<NotificationProfileRetrieveResponse> =
        retrieve(id, NotificationProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
    ): CompletableFuture<NotificationProfileRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NotificationProfileRetrieveParams
    ): CompletableFuture<NotificationProfileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileRetrieveResponse> =
        retrieve(id, NotificationProfileRetrieveParams.none(), requestOptions)

    /** Update a notification profile. */
    fun update(
        pathId: String,
        params: NotificationProfileUpdateParams,
    ): CompletableFuture<NotificationProfileUpdateResponse> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NotificationProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileUpdateResponse> =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(
        params: NotificationProfileUpdateParams
    ): CompletableFuture<NotificationProfileUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NotificationProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileUpdateResponse>

    /** Returns a list of your notifications profiles. */
    fun list(): CompletableFuture<NotificationProfileListResponse> =
        list(NotificationProfileListParams.none())

    /** @see list */
    fun list(
        params: NotificationProfileListParams = NotificationProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileListResponse>

    /** @see list */
    fun list(
        params: NotificationProfileListParams = NotificationProfileListParams.none()
    ): CompletableFuture<NotificationProfileListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NotificationProfileListResponse> =
        list(NotificationProfileListParams.none(), requestOptions)

    /** Delete a notification profile. */
    fun delete(id: String): CompletableFuture<NotificationProfileDeleteResponse> =
        delete(id, NotificationProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
    ): CompletableFuture<NotificationProfileDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NotificationProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationProfileDeleteResponse>

    /** @see delete */
    fun delete(
        params: NotificationProfileDeleteParams
    ): CompletableFuture<NotificationProfileDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationProfileDeleteResponse> =
        delete(id, NotificationProfileDeleteParams.none(), requestOptions)

    /**
     * A view of [NotificationProfileServiceAsync] that provides access to raw HTTP responses for
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
        ): NotificationProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notification_profiles`, but is otherwise the same
         * as [NotificationProfileServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>> =
            create(NotificationProfileCreateParams.none())

        /** @see create */
        fun create(
            params: NotificationProfileCreateParams = NotificationProfileCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>>

        /** @see create */
        fun create(
            params: NotificationProfileCreateParams = NotificationProfileCreateParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            notificationProfile: NotificationProfile,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>> =
            create(
                NotificationProfileCreateParams.builder()
                    .notificationProfile(notificationProfile)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            notificationProfile: NotificationProfile
        ): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>> =
            create(notificationProfile, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationProfileCreateResponse>> =
            create(NotificationProfileCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notification_profiles/{id}`, but is otherwise the
         * same as [NotificationProfileServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>> =
            retrieve(id, NotificationProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationProfileRetrieveParams = NotificationProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NotificationProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NotificationProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileRetrieveResponse>> =
            retrieve(id, NotificationProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /notification_profiles/{id}`, but is otherwise the
         * same as [NotificationProfileServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: NotificationProfileUpdateParams,
        ): CompletableFuture<HttpResponseFor<NotificationProfileUpdateResponse>> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: NotificationProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileUpdateResponse>> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(
            params: NotificationProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<NotificationProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NotificationProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /notification_profiles`, but is otherwise the same
         * as [NotificationProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationProfileListResponse>> =
            list(NotificationProfileListParams.none())

        /** @see list */
        fun list(
            params: NotificationProfileListParams = NotificationProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileListResponse>>

        /** @see list */
        fun list(
            params: NotificationProfileListParams = NotificationProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationProfileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationProfileListResponse>> =
            list(NotificationProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /notification_profiles/{id}`, but is otherwise
         * the same as [NotificationProfileServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>> =
            delete(id, NotificationProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NotificationProfileDeleteParams = NotificationProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NotificationProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>>

        /** @see delete */
        fun delete(
            params: NotificationProfileDeleteParams
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationProfileDeleteResponse>> =
            delete(id, NotificationProfileDeleteParams.none(), requestOptions)
    }
}
