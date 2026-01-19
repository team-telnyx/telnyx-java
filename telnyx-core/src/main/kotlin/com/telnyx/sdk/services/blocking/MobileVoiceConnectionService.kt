// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListPage
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateResponse
import java.util.function.Consumer

interface MobileVoiceConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobileVoiceConnectionService

    /** Create a Mobile Voice Connection */
    fun create(): MobileVoiceConnectionCreateResponse =
        create(MobileVoiceConnectionCreateParams.none())

    /** @see create */
    fun create(
        params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionCreateResponse

    /** @see create */
    fun create(
        params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none()
    ): MobileVoiceConnectionCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): MobileVoiceConnectionCreateResponse =
        create(MobileVoiceConnectionCreateParams.none(), requestOptions)

    /** Retrieve a Mobile Voice Connection */
    fun retrieve(id: String): MobileVoiceConnectionRetrieveResponse =
        retrieve(id, MobileVoiceConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobileVoiceConnectionRetrieveParams = MobileVoiceConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobileVoiceConnectionRetrieveParams = MobileVoiceConnectionRetrieveParams.none(),
    ): MobileVoiceConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MobileVoiceConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: MobileVoiceConnectionRetrieveParams
    ): MobileVoiceConnectionRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): MobileVoiceConnectionRetrieveResponse =
        retrieve(id, MobileVoiceConnectionRetrieveParams.none(), requestOptions)

    /** Update a Mobile Voice Connection */
    fun update(id: String): MobileVoiceConnectionUpdateResponse =
        update(id, MobileVoiceConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
    ): MobileVoiceConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MobileVoiceConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionUpdateResponse

    /** @see update */
    fun update(params: MobileVoiceConnectionUpdateParams): MobileVoiceConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): MobileVoiceConnectionUpdateResponse =
        update(id, MobileVoiceConnectionUpdateParams.none(), requestOptions)

    /** List Mobile Voice Connections */
    fun list(): MobileVoiceConnectionListPage = list(MobileVoiceConnectionListParams.none())

    /** @see list */
    fun list(
        params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionListPage

    /** @see list */
    fun list(
        params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none()
    ): MobileVoiceConnectionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MobileVoiceConnectionListPage =
        list(MobileVoiceConnectionListParams.none(), requestOptions)

    /** Delete a Mobile Voice Connection */
    fun delete(id: String): MobileVoiceConnectionDeleteResponse =
        delete(id, MobileVoiceConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
    ): MobileVoiceConnectionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MobileVoiceConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobileVoiceConnectionDeleteResponse

    /** @see delete */
    fun delete(params: MobileVoiceConnectionDeleteParams): MobileVoiceConnectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MobileVoiceConnectionDeleteResponse =
        delete(id, MobileVoiceConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [MobileVoiceConnectionService] that provides access to raw HTTP responses for each
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
        ): MobileVoiceConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/mobile_voice_connections`, but is otherwise the
         * same as [MobileVoiceConnectionService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<MobileVoiceConnectionCreateResponse> =
            create(MobileVoiceConnectionCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none()
        ): HttpResponseFor<MobileVoiceConnectionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<MobileVoiceConnectionCreateResponse> =
            create(MobileVoiceConnectionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/mobile_voice_connections/{id}`, but is otherwise
         * the same as [MobileVoiceConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MobileVoiceConnectionRetrieveResponse> =
            retrieve(id, MobileVoiceConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MobileVoiceConnectionRetrieveParams =
                MobileVoiceConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MobileVoiceConnectionRetrieveParams = MobileVoiceConnectionRetrieveParams.none(),
        ): HttpResponseFor<MobileVoiceConnectionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MobileVoiceConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MobileVoiceConnectionRetrieveParams
        ): HttpResponseFor<MobileVoiceConnectionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionRetrieveResponse> =
            retrieve(id, MobileVoiceConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/mobile_voice_connections/{id}`, but is
         * otherwise the same as [MobileVoiceConnectionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<MobileVoiceConnectionUpdateResponse> =
            update(id, MobileVoiceConnectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
        ): HttpResponseFor<MobileVoiceConnectionUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MobileVoiceConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: MobileVoiceConnectionUpdateParams
        ): HttpResponseFor<MobileVoiceConnectionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionUpdateResponse> =
            update(id, MobileVoiceConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/mobile_voice_connections`, but is otherwise the
         * same as [MobileVoiceConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MobileVoiceConnectionListPage> =
            list(MobileVoiceConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none()
        ): HttpResponseFor<MobileVoiceConnectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MobileVoiceConnectionListPage> =
            list(MobileVoiceConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/mobile_voice_connections/{id}`, but is
         * otherwise the same as [MobileVoiceConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MobileVoiceConnectionDeleteResponse> =
            delete(id, MobileVoiceConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
        ): HttpResponseFor<MobileVoiceConnectionDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MobileVoiceConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobileVoiceConnectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MobileVoiceConnectionDeleteParams
        ): HttpResponseFor<MobileVoiceConnectionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionDeleteResponse> =
            delete(id, MobileVoiceConnectionDeleteParams.none(), requestOptions)
    }
}
