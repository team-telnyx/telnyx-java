// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderCreateParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderCreateResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderDeleteParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderDeleteResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderListParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderListResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderRetrieveParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderRetrieveResponse
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderUpdateParams
import com.telnyx.api.models.authenticationproviders.AuthenticationProviderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuthenticationProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthenticationProviderServiceAsync

    /** Creates an authentication provider. */
    fun create(
        params: AuthenticationProviderCreateParams
    ): CompletableFuture<AuthenticationProviderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthenticationProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderCreateResponse>

    /** Retrieves the details of an existing authentication provider. */
    fun retrieve(id: String): CompletableFuture<AuthenticationProviderRetrieveResponse> =
        retrieve(id, AuthenticationProviderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AuthenticationProviderRetrieveParams = AuthenticationProviderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AuthenticationProviderRetrieveParams = AuthenticationProviderRetrieveParams.none(),
    ): CompletableFuture<AuthenticationProviderRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuthenticationProviderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AuthenticationProviderRetrieveParams
    ): CompletableFuture<AuthenticationProviderRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderRetrieveResponse> =
        retrieve(id, AuthenticationProviderRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing authentication provider. */
    fun update(id: String): CompletableFuture<AuthenticationProviderUpdateResponse> =
        update(id, AuthenticationProviderUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
    ): CompletableFuture<AuthenticationProviderUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthenticationProviderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderUpdateResponse>

    /** @see update */
    fun update(
        params: AuthenticationProviderUpdateParams
    ): CompletableFuture<AuthenticationProviderUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderUpdateResponse> =
        update(id, AuthenticationProviderUpdateParams.none(), requestOptions)

    /** Returns a list of your SSO authentication providers. */
    fun list(): CompletableFuture<AuthenticationProviderListResponse> =
        list(AuthenticationProviderListParams.none())

    /** @see list */
    fun list(
        params: AuthenticationProviderListParams = AuthenticationProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderListResponse>

    /** @see list */
    fun list(
        params: AuthenticationProviderListParams = AuthenticationProviderListParams.none()
    ): CompletableFuture<AuthenticationProviderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<AuthenticationProviderListResponse> =
        list(AuthenticationProviderListParams.none(), requestOptions)

    /** Deletes an existing authentication provider. */
    fun delete(id: String): CompletableFuture<AuthenticationProviderDeleteResponse> =
        delete(id, AuthenticationProviderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
    ): CompletableFuture<AuthenticationProviderDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthenticationProviderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthenticationProviderDeleteResponse>

    /** @see delete */
    fun delete(
        params: AuthenticationProviderDeleteParams
    ): CompletableFuture<AuthenticationProviderDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthenticationProviderDeleteResponse> =
        delete(id, AuthenticationProviderDeleteParams.none(), requestOptions)

    /**
     * A view of [AuthenticationProviderServiceAsync] that provides access to raw HTTP responses for
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
        ): AuthenticationProviderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /authentication_providers`, but is otherwise the
         * same as [AuthenticationProviderServiceAsync.create].
         */
        fun create(
            params: AuthenticationProviderCreateParams
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AuthenticationProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /authentication_providers/{id}`, but is otherwise
         * the same as [AuthenticationProviderServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>> =
            retrieve(id, AuthenticationProviderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AuthenticationProviderRetrieveParams =
                AuthenticationProviderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AuthenticationProviderRetrieveParams =
                AuthenticationProviderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AuthenticationProviderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AuthenticationProviderRetrieveParams
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderRetrieveResponse>> =
            retrieve(id, AuthenticationProviderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /authentication_providers/{id}`, but is otherwise
         * the same as [AuthenticationProviderServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>> =
            update(id, AuthenticationProviderUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AuthenticationProviderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>>

        /** @see update */
        fun update(
            params: AuthenticationProviderUpdateParams
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderUpdateResponse>> =
            update(id, AuthenticationProviderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /authentication_providers`, but is otherwise the
         * same as [AuthenticationProviderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuthenticationProviderListResponse>> =
            list(AuthenticationProviderListParams.none())

        /** @see list */
        fun list(
            params: AuthenticationProviderListParams = AuthenticationProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderListResponse>>

        /** @see list */
        fun list(
            params: AuthenticationProviderListParams = AuthenticationProviderListParams.none()
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderListResponse>> =
            list(AuthenticationProviderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /authentication_providers/{id}`, but is otherwise
         * the same as [AuthenticationProviderServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>> =
            delete(id, AuthenticationProviderDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AuthenticationProviderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AuthenticationProviderDeleteParams
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthenticationProviderDeleteResponse>> =
            delete(id, AuthenticationProviderDeleteParams.none(), requestOptions)
    }
}
