// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.credentialconnections.CredentialConnectionCreateParams
import com.telnyx.api.models.credentialconnections.CredentialConnectionCreateResponse
import com.telnyx.api.models.credentialconnections.CredentialConnectionDeleteParams
import com.telnyx.api.models.credentialconnections.CredentialConnectionDeleteResponse
import com.telnyx.api.models.credentialconnections.CredentialConnectionListParams
import com.telnyx.api.models.credentialconnections.CredentialConnectionListResponse
import com.telnyx.api.models.credentialconnections.CredentialConnectionRetrieveParams
import com.telnyx.api.models.credentialconnections.CredentialConnectionRetrieveResponse
import com.telnyx.api.models.credentialconnections.CredentialConnectionUpdateParams
import com.telnyx.api.models.credentialconnections.CredentialConnectionUpdateResponse
import com.telnyx.api.services.blocking.credentialconnections.ActionService
import java.util.function.Consumer

interface CredentialConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CredentialConnectionService

    fun actions(): ActionService

    /** Creates a credential connection. */
    fun create(params: CredentialConnectionCreateParams): CredentialConnectionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CredentialConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionCreateResponse

    /** Retrieves the details of an existing credential connection. */
    fun retrieve(id: String): CredentialConnectionRetrieveResponse =
        retrieve(id, CredentialConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
    ): CredentialConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CredentialConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CredentialConnectionRetrieveParams): CredentialConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CredentialConnectionRetrieveResponse =
        retrieve(id, CredentialConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing credential connection. */
    fun update(id: String): CredentialConnectionUpdateResponse =
        update(id, CredentialConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
    ): CredentialConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CredentialConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionUpdateResponse

    /** @see update */
    fun update(params: CredentialConnectionUpdateParams): CredentialConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CredentialConnectionUpdateResponse =
        update(id, CredentialConnectionUpdateParams.none(), requestOptions)

    /** Returns a list of your credential connections. */
    fun list(): CredentialConnectionListResponse = list(CredentialConnectionListParams.none())

    /** @see list */
    fun list(
        params: CredentialConnectionListParams = CredentialConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionListResponse

    /** @see list */
    fun list(
        params: CredentialConnectionListParams = CredentialConnectionListParams.none()
    ): CredentialConnectionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CredentialConnectionListResponse =
        list(CredentialConnectionListParams.none(), requestOptions)

    /** Deletes an existing credential connection. */
    fun delete(id: String): CredentialConnectionDeleteResponse =
        delete(id, CredentialConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
    ): CredentialConnectionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CredentialConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CredentialConnectionDeleteResponse

    /** @see delete */
    fun delete(params: CredentialConnectionDeleteParams): CredentialConnectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CredentialConnectionDeleteResponse =
        delete(id, CredentialConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [CredentialConnectionService] that provides access to raw HTTP responses for each
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
        ): CredentialConnectionService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /credential_connections`, but is otherwise the same
         * as [CredentialConnectionService.create].
         */
        @MustBeClosed
        fun create(
            params: CredentialConnectionCreateParams
        ): HttpResponseFor<CredentialConnectionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CredentialConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /credential_connections/{id}`, but is otherwise the
         * same as [CredentialConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CredentialConnectionRetrieveResponse> =
            retrieve(id, CredentialConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CredentialConnectionRetrieveParams = CredentialConnectionRetrieveParams.none(),
        ): HttpResponseFor<CredentialConnectionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CredentialConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CredentialConnectionRetrieveParams
        ): HttpResponseFor<CredentialConnectionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionRetrieveResponse> =
            retrieve(id, CredentialConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /credential_connections/{id}`, but is otherwise
         * the same as [CredentialConnectionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CredentialConnectionUpdateResponse> =
            update(id, CredentialConnectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CredentialConnectionUpdateParams = CredentialConnectionUpdateParams.none(),
        ): HttpResponseFor<CredentialConnectionUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CredentialConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: CredentialConnectionUpdateParams
        ): HttpResponseFor<CredentialConnectionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionUpdateResponse> =
            update(id, CredentialConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credential_connections`, but is otherwise the same
         * as [CredentialConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CredentialConnectionListResponse> =
            list(CredentialConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CredentialConnectionListParams = CredentialConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CredentialConnectionListParams = CredentialConnectionListParams.none()
        ): HttpResponseFor<CredentialConnectionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CredentialConnectionListResponse> =
            list(CredentialConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credential_connections/{id}`, but is otherwise
         * the same as [CredentialConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CredentialConnectionDeleteResponse> =
            delete(id, CredentialConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CredentialConnectionDeleteParams = CredentialConnectionDeleteParams.none(),
        ): HttpResponseFor<CredentialConnectionDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CredentialConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CredentialConnectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CredentialConnectionDeleteParams
        ): HttpResponseFor<CredentialConnectionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CredentialConnectionDeleteResponse> =
            delete(id, CredentialConnectionDeleteParams.none(), requestOptions)
    }
}
