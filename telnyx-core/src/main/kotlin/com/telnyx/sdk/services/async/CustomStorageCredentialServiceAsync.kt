// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.customstoragecredentials.CredentialsResponse
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialDeleteParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialRetrieveParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Call Recordings operations. */
interface CustomStorageCredentialServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomStorageCredentialServiceAsync

    /** Creates a custom storage credentials configuration. */
    fun create(
        connectionId: String,
        params: CustomStorageCredentialCreateParams,
    ): CompletableFuture<CredentialsResponse> = create(connectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        connectionId: String,
        params: CustomStorageCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialsResponse> =
        create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see create */
    fun create(
        params: CustomStorageCredentialCreateParams
    ): CompletableFuture<CredentialsResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomStorageCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialsResponse>

    /** Returns the information about custom storage credentials. */
    fun retrieve(connectionId: String): CompletableFuture<CredentialsResponse> =
        retrieve(connectionId, CustomStorageCredentialRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: CustomStorageCredentialRetrieveParams =
            CustomStorageCredentialRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialsResponse> =
        retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: CustomStorageCredentialRetrieveParams = CustomStorageCredentialRetrieveParams.none(),
    ): CompletableFuture<CredentialsResponse> =
        retrieve(connectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomStorageCredentialRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialsResponse>

    /** @see retrieve */
    fun retrieve(
        params: CustomStorageCredentialRetrieveParams
    ): CompletableFuture<CredentialsResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CredentialsResponse> =
        retrieve(connectionId, CustomStorageCredentialRetrieveParams.none(), requestOptions)

    /** Updates a stored custom credentials configuration. */
    fun update(
        connectionId: String,
        params: CustomStorageCredentialUpdateParams,
    ): CompletableFuture<CredentialsResponse> = update(connectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectionId: String,
        params: CustomStorageCredentialUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialsResponse> =
        update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see update */
    fun update(
        params: CustomStorageCredentialUpdateParams
    ): CompletableFuture<CredentialsResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomStorageCredentialUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CredentialsResponse>

    /** Deletes a stored custom credentials configuration. */
    fun delete(connectionId: String): CompletableFuture<Void?> =
        delete(connectionId, CustomStorageCredentialDeleteParams.none())

    /** @see delete */
    fun delete(
        connectionId: String,
        params: CustomStorageCredentialDeleteParams = CustomStorageCredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        connectionId: String,
        params: CustomStorageCredentialDeleteParams = CustomStorageCredentialDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(connectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomStorageCredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CustomStorageCredentialDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(connectionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(connectionId, CustomStorageCredentialDeleteParams.none(), requestOptions)

    /**
     * A view of [CustomStorageCredentialServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomStorageCredentialServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /custom_storage_credentials/{connection_id}`, but
         * is otherwise the same as [CustomStorageCredentialServiceAsync.create].
         */
        fun create(
            connectionId: String,
            params: CustomStorageCredentialCreateParams,
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            create(connectionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            connectionId: String,
            params: CustomStorageCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CustomStorageCredentialCreateParams
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomStorageCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>>

        /**
         * Returns a raw HTTP response for `get /custom_storage_credentials/{connection_id}`, but is
         * otherwise the same as [CustomStorageCredentialServiceAsync.retrieve].
         */
        fun retrieve(
            connectionId: String
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            retrieve(connectionId, CustomStorageCredentialRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            connectionId: String,
            params: CustomStorageCredentialRetrieveParams =
                CustomStorageCredentialRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            connectionId: String,
            params: CustomStorageCredentialRetrieveParams =
                CustomStorageCredentialRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            retrieve(connectionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CustomStorageCredentialRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CustomStorageCredentialRetrieveParams
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            connectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            retrieve(connectionId, CustomStorageCredentialRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /custom_storage_credentials/{connection_id}`, but is
         * otherwise the same as [CustomStorageCredentialServiceAsync.update].
         */
        fun update(
            connectionId: String,
            params: CustomStorageCredentialUpdateParams,
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            update(connectionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            connectionId: String,
            params: CustomStorageCredentialUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CustomStorageCredentialUpdateParams
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomStorageCredentialUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CredentialsResponse>>

        /**
         * Returns a raw HTTP response for `delete /custom_storage_credentials/{connection_id}`, but
         * is otherwise the same as [CustomStorageCredentialServiceAsync.delete].
         */
        fun delete(connectionId: String): CompletableFuture<HttpResponse> =
            delete(connectionId, CustomStorageCredentialDeleteParams.none())

        /** @see delete */
        fun delete(
            connectionId: String,
            params: CustomStorageCredentialDeleteParams =
                CustomStorageCredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            connectionId: String,
            params: CustomStorageCredentialDeleteParams = CustomStorageCredentialDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(connectionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CustomStorageCredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CustomStorageCredentialDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            connectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(connectionId, CustomStorageCredentialDeleteParams.none(), requestOptions)
    }
}
