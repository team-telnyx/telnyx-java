// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.oauthclients.OAuthClientCreateParams
import com.telnyx.sdk.models.oauthclients.OAuthClientCreateResponse
import com.telnyx.sdk.models.oauthclients.OAuthClientDeleteParams
import com.telnyx.sdk.models.oauthclients.OAuthClientListParams
import com.telnyx.sdk.models.oauthclients.OAuthClientListResponse
import com.telnyx.sdk.models.oauthclients.OAuthClientRetrieveParams
import com.telnyx.sdk.models.oauthclients.OAuthClientRetrieveResponse
import com.telnyx.sdk.models.oauthclients.OAuthClientUpdateParams
import com.telnyx.sdk.models.oauthclients.OAuthClientUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthClientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthClientServiceAsync

    /** Create a new OAuth client */
    fun create(params: OAuthClientCreateParams): CompletableFuture<OAuthClientCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OAuthClientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthClientCreateResponse>

    /** Retrieve a single OAuth client by ID */
    fun retrieve(id: String): CompletableFuture<OAuthClientRetrieveResponse> =
        retrieve(id, OAuthClientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthClientRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
    ): CompletableFuture<OAuthClientRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthClientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthClientRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: OAuthClientRetrieveParams
    ): CompletableFuture<OAuthClientRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthClientRetrieveResponse> =
        retrieve(id, OAuthClientRetrieveParams.none(), requestOptions)

    /** Update an existing OAuth client */
    fun update(id: String): CompletableFuture<OAuthClientUpdateResponse> =
        update(id, OAuthClientUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthClientUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
    ): CompletableFuture<OAuthClientUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OAuthClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthClientUpdateResponse>

    /** @see update */
    fun update(params: OAuthClientUpdateParams): CompletableFuture<OAuthClientUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthClientUpdateResponse> =
        update(id, OAuthClientUpdateParams.none(), requestOptions)

    /** Retrieve a paginated list of OAuth clients for the authenticated user */
    fun list(): CompletableFuture<OAuthClientListResponse> = list(OAuthClientListParams.none())

    /** @see list */
    fun list(
        params: OAuthClientListParams = OAuthClientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthClientListResponse>

    /** @see list */
    fun list(
        params: OAuthClientListParams = OAuthClientListParams.none()
    ): CompletableFuture<OAuthClientListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthClientListResponse> =
        list(OAuthClientListParams.none(), requestOptions)

    /** Delete an OAuth client */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, OAuthClientDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OAuthClientDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OAuthClientDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, OAuthClientDeleteParams.none(), requestOptions)

    /**
     * A view of [OAuthClientServiceAsync] that provides access to raw HTTP responses for each
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
        ): OAuthClientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth_clients`, but is otherwise the same as
         * [OAuthClientServiceAsync.create].
         */
        fun create(
            params: OAuthClientCreateParams
        ): CompletableFuture<HttpResponseFor<OAuthClientCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OAuthClientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /oauth_clients/{id}`, but is otherwise the same as
         * [OAuthClientServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<OAuthClientRetrieveResponse>> =
            retrieve(id, OAuthClientRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OAuthClientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OAuthClientRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthClientRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthClientRetrieveResponse>> =
            retrieve(id, OAuthClientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /oauth_clients/{id}`, but is otherwise the same as
         * [OAuthClientServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<OAuthClientUpdateResponse>> =
            update(id, OAuthClientUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OAuthClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientUpdateResponse>>

        /** @see update */
        fun update(
            params: OAuthClientUpdateParams
        ): CompletableFuture<HttpResponseFor<OAuthClientUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthClientUpdateResponse>> =
            update(id, OAuthClientUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_clients`, but is otherwise the same as
         * [OAuthClientServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OAuthClientListResponse>> =
            list(OAuthClientListParams.none())

        /** @see list */
        fun list(
            params: OAuthClientListParams = OAuthClientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthClientListResponse>>

        /** @see list */
        fun list(
            params: OAuthClientListParams = OAuthClientListParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthClientListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthClientListResponse>> =
            list(OAuthClientListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /oauth_clients/{id}`, but is otherwise the same
         * as [OAuthClientServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, OAuthClientDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OAuthClientDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OAuthClientDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, OAuthClientDeleteParams.none(), requestOptions)
    }
}
