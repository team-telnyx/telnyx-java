// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialDeleteParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialListParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialListResponse
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialRetrieveParams
import com.telnyx.api.models.mobilepushcredentials.PushCredentialResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MobilePushCredentialServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobilePushCredentialServiceAsync

    /** Creates a new mobile push credential */
    fun create(
        params: MobilePushCredentialCreateParams
    ): CompletableFuture<PushCredentialResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MobilePushCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PushCredentialResponse>

    /** Retrieves mobile push credential based on the given `push_credential_id` */
    fun retrieve(pushCredentialId: String): CompletableFuture<PushCredentialResponse> =
        retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        pushCredentialId: String,
        params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PushCredentialResponse> =
        retrieve(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        pushCredentialId: String,
        params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
    ): CompletableFuture<PushCredentialResponse> =
        retrieve(pushCredentialId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MobilePushCredentialRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PushCredentialResponse>

    /** @see retrieve */
    fun retrieve(
        params: MobilePushCredentialRetrieveParams
    ): CompletableFuture<PushCredentialResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        pushCredentialId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PushCredentialResponse> =
        retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none(), requestOptions)

    /** List mobile push credentials */
    fun list(): CompletableFuture<MobilePushCredentialListResponse> =
        list(MobilePushCredentialListParams.none())

    /** @see list */
    fun list(
        params: MobilePushCredentialListParams = MobilePushCredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobilePushCredentialListResponse>

    /** @see list */
    fun list(
        params: MobilePushCredentialListParams = MobilePushCredentialListParams.none()
    ): CompletableFuture<MobilePushCredentialListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MobilePushCredentialListResponse> =
        list(MobilePushCredentialListParams.none(), requestOptions)

    /** Deletes a mobile push credential based on the given `push_credential_id` */
    fun delete(pushCredentialId: String): CompletableFuture<Void?> =
        delete(pushCredentialId, MobilePushCredentialDeleteParams.none())

    /** @see delete */
    fun delete(
        pushCredentialId: String,
        params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

    /** @see delete */
    fun delete(
        pushCredentialId: String,
        params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(pushCredentialId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MobilePushCredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MobilePushCredentialDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(pushCredentialId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(pushCredentialId, MobilePushCredentialDeleteParams.none(), requestOptions)

    /**
     * A view of [MobilePushCredentialServiceAsync] that provides access to raw HTTP responses for
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
        ): MobilePushCredentialServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /mobile_push_credentials`, but is otherwise the
         * same as [MobilePushCredentialServiceAsync.create].
         */
        fun create(
            params: MobilePushCredentialCreateParams
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MobilePushCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>>

        /**
         * Returns a raw HTTP response for `get /mobile_push_credentials/{push_credential_id}`, but
         * is otherwise the same as [MobilePushCredentialServiceAsync.retrieve].
         */
        fun retrieve(
            pushCredentialId: String
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> =
            retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            pushCredentialId: String,
            params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> =
            retrieve(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            pushCredentialId: String,
            params: MobilePushCredentialRetrieveParams = MobilePushCredentialRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> =
            retrieve(pushCredentialId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MobilePushCredentialRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MobilePushCredentialRetrieveParams
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            pushCredentialId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PushCredentialResponse>> =
            retrieve(pushCredentialId, MobilePushCredentialRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mobile_push_credentials`, but is otherwise the same
         * as [MobilePushCredentialServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MobilePushCredentialListResponse>> =
            list(MobilePushCredentialListParams.none())

        /** @see list */
        fun list(
            params: MobilePushCredentialListParams = MobilePushCredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobilePushCredentialListResponse>>

        /** @see list */
        fun list(
            params: MobilePushCredentialListParams = MobilePushCredentialListParams.none()
        ): CompletableFuture<HttpResponseFor<MobilePushCredentialListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MobilePushCredentialListResponse>> =
            list(MobilePushCredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /mobile_push_credentials/{push_credential_id}`,
         * but is otherwise the same as [MobilePushCredentialServiceAsync.delete].
         */
        fun delete(pushCredentialId: String): CompletableFuture<HttpResponse> =
            delete(pushCredentialId, MobilePushCredentialDeleteParams.none())

        /** @see delete */
        fun delete(
            pushCredentialId: String,
            params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().pushCredentialId(pushCredentialId).build(), requestOptions)

        /** @see delete */
        fun delete(
            pushCredentialId: String,
            params: MobilePushCredentialDeleteParams = MobilePushCredentialDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(pushCredentialId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MobilePushCredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MobilePushCredentialDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            pushCredentialId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(pushCredentialId, MobilePushCredentialDeleteParams.none(), requestOptions)
    }
}
