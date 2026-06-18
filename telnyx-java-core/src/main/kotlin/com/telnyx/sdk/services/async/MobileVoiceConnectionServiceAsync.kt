// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListPageAsync
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Mobile voice connection operations */
interface MobileVoiceConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobileVoiceConnectionServiceAsync

    /** Create a Mobile Voice Connection */
    fun create(): CompletableFuture<MobileVoiceConnectionCreateResponse> =
        create(MobileVoiceConnectionCreateParams.none())

    /** @see create */
    fun create(
        params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionCreateResponse>

    /** @see create */
    fun create(
        params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none()
    ): CompletableFuture<MobileVoiceConnectionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<MobileVoiceConnectionCreateResponse> =
        create(MobileVoiceConnectionCreateParams.none(), requestOptions)

    /** Retrieve a Mobile Voice Connection */
    fun retrieve(id: String): CompletableFuture<MobileVoiceConnectionRetrieveResponse> =
        retrieve(id, MobileVoiceConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobileVoiceConnectionRetrieveParams = MobileVoiceConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobileVoiceConnectionRetrieveParams = MobileVoiceConnectionRetrieveParams.none(),
    ): CompletableFuture<MobileVoiceConnectionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MobileVoiceConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MobileVoiceConnectionRetrieveParams
    ): CompletableFuture<MobileVoiceConnectionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionRetrieveResponse> =
        retrieve(id, MobileVoiceConnectionRetrieveParams.none(), requestOptions)

    /** Update a Mobile Voice Connection */
    fun update(id: String): CompletableFuture<MobileVoiceConnectionUpdateResponse> =
        update(id, MobileVoiceConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
    ): CompletableFuture<MobileVoiceConnectionUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MobileVoiceConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionUpdateResponse>

    /** @see update */
    fun update(
        params: MobileVoiceConnectionUpdateParams
    ): CompletableFuture<MobileVoiceConnectionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionUpdateResponse> =
        update(id, MobileVoiceConnectionUpdateParams.none(), requestOptions)

    /** List Mobile Voice Connections */
    fun list(): CompletableFuture<MobileVoiceConnectionListPageAsync> =
        list(MobileVoiceConnectionListParams.none())

    /** @see list */
    fun list(
        params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionListPageAsync>

    /** @see list */
    fun list(
        params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none()
    ): CompletableFuture<MobileVoiceConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<MobileVoiceConnectionListPageAsync> =
        list(MobileVoiceConnectionListParams.none(), requestOptions)

    /** Delete a Mobile Voice Connection */
    fun delete(id: String): CompletableFuture<MobileVoiceConnectionDeleteResponse> =
        delete(id, MobileVoiceConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
    ): CompletableFuture<MobileVoiceConnectionDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MobileVoiceConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobileVoiceConnectionDeleteResponse>

    /** @see delete */
    fun delete(
        params: MobileVoiceConnectionDeleteParams
    ): CompletableFuture<MobileVoiceConnectionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionDeleteResponse> =
        delete(id, MobileVoiceConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [MobileVoiceConnectionServiceAsync] that provides access to raw HTTP responses for
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
        ): MobileVoiceConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/mobile_voice_connections`, but is otherwise the
         * same as [MobileVoiceConnectionServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<MobileVoiceConnectionCreateResponse>> =
            create(MobileVoiceConnectionCreateParams.none())

        /** @see create */
        fun create(
            params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionCreateResponse>>

        /** @see create */
        fun create(
            params: MobileVoiceConnectionCreateParams = MobileVoiceConnectionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionCreateResponse>> =
            create(MobileVoiceConnectionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/mobile_voice_connections/{id}`, but is otherwise
         * the same as [MobileVoiceConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>> =
            retrieve(id, MobileVoiceConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MobileVoiceConnectionRetrieveParams =
                MobileVoiceConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MobileVoiceConnectionRetrieveParams = MobileVoiceConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MobileVoiceConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MobileVoiceConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>> =
            retrieve(id, MobileVoiceConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/mobile_voice_connections/{id}`, but is
         * otherwise the same as [MobileVoiceConnectionServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>> =
            update(id, MobileVoiceConnectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: MobileVoiceConnectionUpdateParams = MobileVoiceConnectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MobileVoiceConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>>

        /** @see update */
        fun update(
            params: MobileVoiceConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>> =
            update(id, MobileVoiceConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/mobile_voice_connections`, but is otherwise the
         * same as [MobileVoiceConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MobileVoiceConnectionListPageAsync>> =
            list(MobileVoiceConnectionListParams.none())

        /** @see list */
        fun list(
            params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: MobileVoiceConnectionListParams = MobileVoiceConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionListPageAsync>> =
            list(MobileVoiceConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/mobile_voice_connections/{id}`, but is
         * otherwise the same as [MobileVoiceConnectionServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>> =
            delete(id, MobileVoiceConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MobileVoiceConnectionDeleteParams = MobileVoiceConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MobileVoiceConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MobileVoiceConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>> =
            delete(id, MobileVoiceConnectionDeleteParams.none(), requestOptions)
    }
}
