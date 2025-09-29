// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateTokenParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialDeleteParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialDeleteResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialListParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialListResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialRetrieveParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialRetrieveResponse
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialUpdateParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TelephonyCredentialServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelephonyCredentialServiceAsync

    /** Create a credential. */
    fun create(
        params: TelephonyCredentialCreateParams
    ): CompletableFuture<TelephonyCredentialCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TelephonyCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialCreateResponse>

    /** Get the details of an existing On-demand Credential. */
    fun retrieve(id: String): CompletableFuture<TelephonyCredentialRetrieveResponse> =
        retrieve(id, TelephonyCredentialRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
    ): CompletableFuture<TelephonyCredentialRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TelephonyCredentialRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TelephonyCredentialRetrieveParams
    ): CompletableFuture<TelephonyCredentialRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialRetrieveResponse> =
        retrieve(id, TelephonyCredentialRetrieveParams.none(), requestOptions)

    /** Update an existing credential. */
    fun update(id: String): CompletableFuture<TelephonyCredentialUpdateResponse> =
        update(id, TelephonyCredentialUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
    ): CompletableFuture<TelephonyCredentialUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TelephonyCredentialUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialUpdateResponse>

    /** @see update */
    fun update(
        params: TelephonyCredentialUpdateParams
    ): CompletableFuture<TelephonyCredentialUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialUpdateResponse> =
        update(id, TelephonyCredentialUpdateParams.none(), requestOptions)

    /** List all On-demand Credentials. */
    fun list(): CompletableFuture<TelephonyCredentialListResponse> =
        list(TelephonyCredentialListParams.none())

    /** @see list */
    fun list(
        params: TelephonyCredentialListParams = TelephonyCredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialListResponse>

    /** @see list */
    fun list(
        params: TelephonyCredentialListParams = TelephonyCredentialListParams.none()
    ): CompletableFuture<TelephonyCredentialListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TelephonyCredentialListResponse> =
        list(TelephonyCredentialListParams.none(), requestOptions)

    /** Delete an existing credential. */
    fun delete(id: String): CompletableFuture<TelephonyCredentialDeleteResponse> =
        delete(id, TelephonyCredentialDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
    ): CompletableFuture<TelephonyCredentialDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TelephonyCredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelephonyCredentialDeleteResponse>

    /** @see delete */
    fun delete(
        params: TelephonyCredentialDeleteParams
    ): CompletableFuture<TelephonyCredentialDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelephonyCredentialDeleteResponse> =
        delete(id, TelephonyCredentialDeleteParams.none(), requestOptions)

    /** Create an Access Token (JWT) for the credential. */
    fun createToken(id: String): CompletableFuture<String> =
        createToken(id, TelephonyCredentialCreateTokenParams.none())

    /** @see createToken */
    fun createToken(
        id: String,
        params: TelephonyCredentialCreateTokenParams = TelephonyCredentialCreateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> = createToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see createToken */
    fun createToken(
        id: String,
        params: TelephonyCredentialCreateTokenParams = TelephonyCredentialCreateTokenParams.none(),
    ): CompletableFuture<String> = createToken(id, params, RequestOptions.none())

    /** @see createToken */
    fun createToken(
        params: TelephonyCredentialCreateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see createToken */
    fun createToken(params: TelephonyCredentialCreateTokenParams): CompletableFuture<String> =
        createToken(params, RequestOptions.none())

    /** @see createToken */
    fun createToken(id: String, requestOptions: RequestOptions): CompletableFuture<String> =
        createToken(id, TelephonyCredentialCreateTokenParams.none(), requestOptions)

    /**
     * A view of [TelephonyCredentialServiceAsync] that provides access to raw HTTP responses for
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
        ): TelephonyCredentialServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /telephony_credentials`, but is otherwise the same
         * as [TelephonyCredentialServiceAsync.create].
         */
        fun create(
            params: TelephonyCredentialCreateParams
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TelephonyCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /telephony_credentials/{id}`, but is otherwise the
         * same as [TelephonyCredentialServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>> =
            retrieve(id, TelephonyCredentialRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TelephonyCredentialRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TelephonyCredentialRetrieveParams
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialRetrieveResponse>> =
            retrieve(id, TelephonyCredentialRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /telephony_credentials/{id}`, but is otherwise the
         * same as [TelephonyCredentialServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>> =
            update(id, TelephonyCredentialUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TelephonyCredentialUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>>

        /** @see update */
        fun update(
            params: TelephonyCredentialUpdateParams
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialUpdateResponse>> =
            update(id, TelephonyCredentialUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /telephony_credentials`, but is otherwise the same
         * as [TelephonyCredentialServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TelephonyCredentialListResponse>> =
            list(TelephonyCredentialListParams.none())

        /** @see list */
        fun list(
            params: TelephonyCredentialListParams = TelephonyCredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialListResponse>>

        /** @see list */
        fun list(
            params: TelephonyCredentialListParams = TelephonyCredentialListParams.none()
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialListResponse>> =
            list(TelephonyCredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /telephony_credentials/{id}`, but is otherwise
         * the same as [TelephonyCredentialServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>> =
            delete(id, TelephonyCredentialDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TelephonyCredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>>

        /** @see delete */
        fun delete(
            params: TelephonyCredentialDeleteParams
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelephonyCredentialDeleteResponse>> =
            delete(id, TelephonyCredentialDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /telephony_credentials/{id}/token`, but is
         * otherwise the same as [TelephonyCredentialServiceAsync.createToken].
         */
        fun createToken(id: String): CompletableFuture<HttpResponseFor<String>> =
            createToken(id, TelephonyCredentialCreateTokenParams.none())

        /** @see createToken */
        fun createToken(
            id: String,
            params: TelephonyCredentialCreateTokenParams =
                TelephonyCredentialCreateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            createToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see createToken */
        fun createToken(
            id: String,
            params: TelephonyCredentialCreateTokenParams =
                TelephonyCredentialCreateTokenParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            createToken(id, params, RequestOptions.none())

        /** @see createToken */
        fun createToken(
            params: TelephonyCredentialCreateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see createToken */
        fun createToken(
            params: TelephonyCredentialCreateTokenParams
        ): CompletableFuture<HttpResponseFor<String>> = createToken(params, RequestOptions.none())

        /** @see createToken */
        fun createToken(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            createToken(id, TelephonyCredentialCreateTokenParams.none(), requestOptions)
    }
}
