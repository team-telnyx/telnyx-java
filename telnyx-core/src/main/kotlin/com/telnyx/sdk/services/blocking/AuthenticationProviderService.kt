// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderCreateParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderCreateResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderDeleteParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderDeleteResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderListPage
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderListParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderRetrieveParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderRetrieveResponse
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderUpdateParams
import com.telnyx.sdk.models.authenticationproviders.AuthenticationProviderUpdateResponse
import java.util.function.Consumer

interface AuthenticationProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthenticationProviderService

    /** Creates an authentication provider. */
    fun create(params: AuthenticationProviderCreateParams): AuthenticationProviderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthenticationProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderCreateResponse

    /** Retrieves the details of an existing authentication provider. */
    fun retrieve(id: String): AuthenticationProviderRetrieveResponse =
        retrieve(id, AuthenticationProviderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AuthenticationProviderRetrieveParams = AuthenticationProviderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AuthenticationProviderRetrieveParams = AuthenticationProviderRetrieveParams.none(),
    ): AuthenticationProviderRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuthenticationProviderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: AuthenticationProviderRetrieveParams
    ): AuthenticationProviderRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): AuthenticationProviderRetrieveResponse =
        retrieve(id, AuthenticationProviderRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing authentication provider. */
    fun update(id: String): AuthenticationProviderUpdateResponse =
        update(id, AuthenticationProviderUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
    ): AuthenticationProviderUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthenticationProviderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderUpdateResponse

    /** @see update */
    fun update(params: AuthenticationProviderUpdateParams): AuthenticationProviderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AuthenticationProviderUpdateResponse =
        update(id, AuthenticationProviderUpdateParams.none(), requestOptions)

    /** Returns a list of your SSO authentication providers. */
    fun list(): AuthenticationProviderListPage = list(AuthenticationProviderListParams.none())

    /** @see list */
    fun list(
        params: AuthenticationProviderListParams = AuthenticationProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderListPage

    /** @see list */
    fun list(
        params: AuthenticationProviderListParams = AuthenticationProviderListParams.none()
    ): AuthenticationProviderListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuthenticationProviderListPage =
        list(AuthenticationProviderListParams.none(), requestOptions)

    /** Deletes an existing authentication provider. */
    fun delete(id: String): AuthenticationProviderDeleteResponse =
        delete(id, AuthenticationProviderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
    ): AuthenticationProviderDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthenticationProviderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthenticationProviderDeleteResponse

    /** @see delete */
    fun delete(params: AuthenticationProviderDeleteParams): AuthenticationProviderDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AuthenticationProviderDeleteResponse =
        delete(id, AuthenticationProviderDeleteParams.none(), requestOptions)

    /**
     * A view of [AuthenticationProviderService] that provides access to raw HTTP responses for each
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
        ): AuthenticationProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /authentication_providers`, but is otherwise the
         * same as [AuthenticationProviderService.create].
         */
        @MustBeClosed
        fun create(
            params: AuthenticationProviderCreateParams
        ): HttpResponseFor<AuthenticationProviderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AuthenticationProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /authentication_providers/{id}`, but is otherwise
         * the same as [AuthenticationProviderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AuthenticationProviderRetrieveResponse> =
            retrieve(id, AuthenticationProviderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AuthenticationProviderRetrieveParams =
                AuthenticationProviderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AuthenticationProviderRetrieveParams =
                AuthenticationProviderRetrieveParams.none(),
        ): HttpResponseFor<AuthenticationProviderRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AuthenticationProviderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AuthenticationProviderRetrieveParams
        ): HttpResponseFor<AuthenticationProviderRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderRetrieveResponse> =
            retrieve(id, AuthenticationProviderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /authentication_providers/{id}`, but is otherwise
         * the same as [AuthenticationProviderService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<AuthenticationProviderUpdateResponse> =
            update(id, AuthenticationProviderUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AuthenticationProviderUpdateParams = AuthenticationProviderUpdateParams.none(),
        ): HttpResponseFor<AuthenticationProviderUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AuthenticationProviderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: AuthenticationProviderUpdateParams
        ): HttpResponseFor<AuthenticationProviderUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderUpdateResponse> =
            update(id, AuthenticationProviderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /authentication_providers`, but is otherwise the
         * same as [AuthenticationProviderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuthenticationProviderListPage> =
            list(AuthenticationProviderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthenticationProviderListParams = AuthenticationProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthenticationProviderListParams = AuthenticationProviderListParams.none()
        ): HttpResponseFor<AuthenticationProviderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuthenticationProviderListPage> =
            list(AuthenticationProviderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /authentication_providers/{id}`, but is otherwise
         * the same as [AuthenticationProviderService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AuthenticationProviderDeleteResponse> =
            delete(id, AuthenticationProviderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AuthenticationProviderDeleteParams = AuthenticationProviderDeleteParams.none(),
        ): HttpResponseFor<AuthenticationProviderDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AuthenticationProviderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthenticationProviderDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AuthenticationProviderDeleteParams
        ): HttpResponseFor<AuthenticationProviderDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationProviderDeleteResponse> =
            delete(id, AuthenticationProviderDeleteParams.none(), requestOptions)
    }
}
