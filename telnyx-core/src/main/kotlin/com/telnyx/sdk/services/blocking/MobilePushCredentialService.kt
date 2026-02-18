// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialDeleteParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListPage
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialRetrieveParams
import com.telnyx.sdk.models.mobilepushcredentials.PushCredentialResponse
import java.util.function.Consumer

interface MobilePushCredentialService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobilePushCredentialService

    /** Creates a new mobile push credential */
    fun create(params: MobilePushCredentialCreateParams): PushCredentialResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MobilePushCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PushCredentialResponse

    /** @see create */
    fun create(
        createMobilePushCredentialRequest:
            MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PushCredentialResponse =
        create(
            MobilePushCredentialCreateParams.builder()
                .createMobilePushCredentialRequest(createMobilePushCredentialRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        createMobilePushCredentialRequest:
            MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest
    ): PushCredentialResponse = create(createMobilePushCredentialRequest, RequestOptions.none())

    /** @see create */
    fun create(
        ios: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PushCredentialResponse =
        create(
            MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.ofIos(ios),
            requestOptions,
        )

    /** @see create */
    fun create(
        ios: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios
    ): PushCredentialResponse = create(ios, RequestOptions.none())

    /** @see create */
    fun create(
        android: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Android,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PushCredentialResponse =
        create(
            MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.ofAndroid(android),
            requestOptions,
        )

    /** @see create */
    fun create(
        android: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Android
    ): PushCredentialResponse = create(android, RequestOptions.none())

    /** Retrieves mobile push credential based on the given `push_credential_id` */
    fun retrieve(pushCredentialId: String): PushCredentialResponse =
        retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        pushCredentialId: String,
        params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PushCredentialResponse =
        retrieve(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        pushCredentialId: String,
        params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
    ): PushCredentialResponse = retrieve(pushCredentialId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MobilePushCredentialRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PushCredentialResponse

    /** @see retrieve */
    fun retrieve(params: MobilePushCredentialRetrieveParams): PushCredentialResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(pushCredentialId: String, requestOptions: RequestOptions): PushCredentialResponse =
        retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none(), requestOptions)

    /** List mobile push credentials */
    fun list(): MobilePushCredentialListPage = list(MobilePushCredentialListParams.none())

    /** @see list */
    fun list(
        params: MobilePushCredentialListParams = MobilePushCredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobilePushCredentialListPage

    /** @see list */
    fun list(
        params: MobilePushCredentialListParams = MobilePushCredentialListParams.none()
    ): MobilePushCredentialListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MobilePushCredentialListPage =
        list(MobilePushCredentialListParams.none(), requestOptions)

    /** Deletes a mobile push credential based on the given `push_credential_id` */
    fun delete(pushCredentialId: String) =
        delete(pushCredentialId, MobilePushCredentialDeleteParams.none())

    /** @see delete */
    fun delete(
        pushCredentialId: String,
        params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

    /** @see delete */
    fun delete(
        pushCredentialId: String,
        params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
    ) = delete(pushCredentialId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MobilePushCredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: MobilePushCredentialDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(pushCredentialId: String, requestOptions: RequestOptions) =
        delete(pushCredentialId, MobilePushCredentialDeleteParams.none(), requestOptions)

    /**
     * A view of [MobilePushCredentialService] that provides access to raw HTTP responses for each
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
        ): MobilePushCredentialService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /mobile_push_credentials`, but is otherwise the
         * same as [MobilePushCredentialService.create].
         */
        @MustBeClosed
        fun create(
            params: MobilePushCredentialCreateParams
        ): HttpResponseFor<PushCredentialResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MobilePushCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PushCredentialResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            createMobilePushCredentialRequest:
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PushCredentialResponse> =
            create(
                MobilePushCredentialCreateParams.builder()
                    .createMobilePushCredentialRequest(createMobilePushCredentialRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            createMobilePushCredentialRequest:
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest
        ): HttpResponseFor<PushCredentialResponse> =
            create(createMobilePushCredentialRequest, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            ios: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PushCredentialResponse> =
            create(
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.ofIos(ios),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            ios: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios
        ): HttpResponseFor<PushCredentialResponse> = create(ios, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            android: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Android,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PushCredentialResponse> =
            create(
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.ofAndroid(
                    android
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            android: MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Android
        ): HttpResponseFor<PushCredentialResponse> = create(android, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /mobile_push_credentials/{push_credential_id}`, but
         * is otherwise the same as [MobilePushCredentialService.retrieve].
         */
        @MustBeClosed
        fun retrieve(pushCredentialId: String): HttpResponseFor<PushCredentialResponse> =
            retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pushCredentialId: String,
            params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PushCredentialResponse> =
            retrieve(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pushCredentialId: String,
            params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
        ): HttpResponseFor<PushCredentialResponse> =
            retrieve(pushCredentialId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MobilePushCredentialRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PushCredentialResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MobilePushCredentialRetrieveParams
        ): HttpResponseFor<PushCredentialResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pushCredentialId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PushCredentialResponse> =
            retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mobile_push_credentials`, but is otherwise the same
         * as [MobilePushCredentialService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MobilePushCredentialListPage> =
            list(MobilePushCredentialListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobilePushCredentialListParams = MobilePushCredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobilePushCredentialListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobilePushCredentialListParams = MobilePushCredentialListParams.none()
        ): HttpResponseFor<MobilePushCredentialListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MobilePushCredentialListPage> =
            list(MobilePushCredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /mobile_push_credentials/{push_credential_id}`,
         * but is otherwise the same as [MobilePushCredentialService.delete].
         */
        @MustBeClosed
        fun delete(pushCredentialId: String): HttpResponse =
            delete(pushCredentialId, MobilePushCredentialDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            pushCredentialId: String,
            params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            pushCredentialId: String,
            params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
        ): HttpResponse = delete(pushCredentialId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MobilePushCredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MobilePushCredentialDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(pushCredentialId: String, requestOptions: RequestOptions): HttpResponse =
            delete(pushCredentialId, MobilePushCredentialDeleteParams.none(), requestOptions)
    }
}
