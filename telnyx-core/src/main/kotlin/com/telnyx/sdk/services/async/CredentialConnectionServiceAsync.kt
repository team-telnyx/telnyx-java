// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionCreateParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionCreateResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionDeleteParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionDeleteResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionListPageAsync
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionListParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionRetrieveParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionRetrieveResponse
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionUpdateParams
import com.telnyx.sdk.models.credentialconnections.CredentialConnectionUpdateResponse
import com.telnyx.sdk.services.async.credentialconnections.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Credential connection operations */
interface CredentialConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CredentialConnectionServiceAsync

    /** Credential connection operations */
    fun actions(): ActionServiceAsync

    /** Creates a credential connection. */
    fun create(
        params: CredentialConnectionCreateParams
    ): CompletableFuture<CredentialConnectionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CredentialConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionCreateResponse>

    /** Retrieves the details of an existing credential connection. */
    fun retrieve(id: String): CompletableFuture<CredentialConnectionRetrieveResponse> =
        retrieve(id, CredentialConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
    ): CompletableFuture<CredentialConnectionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CredentialConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CredentialConnectionRetrieveParams
    ): CompletableFuture<CredentialConnectionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CredentialConnectionRetrieveResponse> =
        retrieve(id, CredentialConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing credential connection. */
    fun update(id: String): CompletableFuture<CredentialConnectionUpdateResponse> =
        update(id, CredentialConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
    ): CompletableFuture<CredentialConnectionUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CredentialConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionUpdateResponse>

    /** @see update */
    fun update(
        params: CredentialConnectionUpdateParams
    ): CompletableFuture<CredentialConnectionUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CredentialConnectionUpdateResponse> =
        update(id, CredentialConnectionUpdateParams.none(), requestOptions)

    /** Returns a list of your credential connections. */
    fun list(): CompletableFuture<CredentialConnectionListPageAsync> =
        list(CredentialConnectionListParams.none())

    /** @see list */
    fun list(
        params: CredentialConnectionListParams = CredentialConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionListPageAsync>

    /** @see list */
    fun list(
        params: CredentialConnectionListParams = CredentialConnectionListParams.none()
    ): CompletableFuture<CredentialConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CredentialConnectionListPageAsync> =
        list(CredentialConnectionListParams.none(), requestOptions)

    /** Deletes an existing credential connection. */
    fun delete(id: String): CompletableFuture<CredentialConnectionDeleteResponse> =
        delete(id, CredentialConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
    ): CompletableFuture<CredentialConnectionDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CredentialConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialConnectionDeleteResponse>

    /** @see delete */
    fun delete(
        params: CredentialConnectionDeleteParams
    ): CompletableFuture<CredentialConnectionDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CredentialConnectionDeleteResponse> =
        delete(id, CredentialConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [CredentialConnectionServiceAsync] that provides access to raw HTTP responses for
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
        ): CredentialConnectionServiceAsync.WithRawResponse

        /** Credential connection operations */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /credential_connections`, but is otherwise the same
         * as [CredentialConnectionServiceAsync.create].
         */
        fun create(
            params: CredentialConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<CredentialConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CredentialConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /credential_connections/{id}`, but is otherwise the
         * same as [CredentialConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<CredentialConnectionRetrieveResponse>> =
            retrieve(id, CredentialConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CredentialConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CredentialConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CredentialConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CredentialConnectionRetrieveResponse>> =
            retrieve(id, CredentialConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /credential_connections/{id}`, but is otherwise
         * the same as [CredentialConnectionServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<CredentialConnectionUpdateResponse>> =
            update(id, CredentialConnectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CredentialConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionUpdateResponse>>

        /** @see update */
        fun update(
            params: CredentialConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<CredentialConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CredentialConnectionUpdateResponse>> =
            update(id, CredentialConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credential_connections`, but is otherwise the same
         * as [CredentialConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CredentialConnectionListPageAsync>> =
            list(CredentialConnectionListParams.none())

        /** @see list */
        fun list(
            params: CredentialConnectionListParams = CredentialConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: CredentialConnectionListParams = CredentialConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<CredentialConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CredentialConnectionListPageAsync>> =
            list(CredentialConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credential_connections/{id}`, but is otherwise
         * the same as [CredentialConnectionServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<CredentialConnectionDeleteResponse>> =
            delete(id, CredentialConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CredentialConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialConnectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CredentialConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<CredentialConnectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CredentialConnectionDeleteResponse>> =
            delete(id, CredentialConnectionDeleteParams.none(), requestOptions)
    }
}
