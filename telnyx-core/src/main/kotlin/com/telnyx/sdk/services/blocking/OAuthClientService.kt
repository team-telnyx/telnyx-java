// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface OAuthClientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthClientService

    /** Create a new OAuth client */
    fun create(params: OAuthClientCreateParams): OAuthClientCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OAuthClientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthClientCreateResponse

    /** Retrieve a single OAuth client by ID */
    fun retrieve(id: String): OAuthClientRetrieveResponse =
        retrieve(id, OAuthClientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthClientRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
    ): OAuthClientRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OAuthClientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthClientRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OAuthClientRetrieveParams): OAuthClientRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): OAuthClientRetrieveResponse =
        retrieve(id, OAuthClientRetrieveParams.none(), requestOptions)

    /** Update an existing OAuth client */
    fun update(id: String): OAuthClientUpdateResponse = update(id, OAuthClientUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthClientUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
    ): OAuthClientUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OAuthClientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthClientUpdateResponse

    /** @see update */
    fun update(params: OAuthClientUpdateParams): OAuthClientUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): OAuthClientUpdateResponse =
        update(id, OAuthClientUpdateParams.none(), requestOptions)

    /** Retrieve a paginated list of OAuth clients for the authenticated user */
    fun list(): OAuthClientListResponse = list(OAuthClientListParams.none())

    /** @see list */
    fun list(
        params: OAuthClientListParams = OAuthClientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthClientListResponse

    /** @see list */
    fun list(
        params: OAuthClientListParams = OAuthClientListParams.none()
    ): OAuthClientListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OAuthClientListResponse =
        list(OAuthClientListParams.none(), requestOptions)

    /** Delete an OAuth client */
    fun delete(id: String) = delete(id, OAuthClientDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: OAuthClientDeleteParams = OAuthClientDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OAuthClientDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OAuthClientDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, OAuthClientDeleteParams.none(), requestOptions)

    /**
     * A view of [OAuthClientService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthClientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth_clients`, but is otherwise the same as
         * [OAuthClientService.create].
         */
        @MustBeClosed
        fun create(params: OAuthClientCreateParams): HttpResponseFor<OAuthClientCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OAuthClientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthClientCreateResponse>

        /**
         * Returns a raw HTTP response for `get /oauth_clients/{id}`, but is otherwise the same as
         * [OAuthClientService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<OAuthClientRetrieveResponse> =
            retrieve(id, OAuthClientRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthClientRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OAuthClientRetrieveParams = OAuthClientRetrieveParams.none(),
        ): HttpResponseFor<OAuthClientRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthClientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthClientRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthClientRetrieveParams
        ): HttpResponseFor<OAuthClientRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthClientRetrieveResponse> =
            retrieve(id, OAuthClientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /oauth_clients/{id}`, but is otherwise the same as
         * [OAuthClientService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<OAuthClientUpdateResponse> =
            update(id, OAuthClientUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthClientUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: OAuthClientUpdateParams = OAuthClientUpdateParams.none(),
        ): HttpResponseFor<OAuthClientUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OAuthClientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthClientUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: OAuthClientUpdateParams): HttpResponseFor<OAuthClientUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthClientUpdateResponse> =
            update(id, OAuthClientUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_clients`, but is otherwise the same as
         * [OAuthClientService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OAuthClientListResponse> = list(OAuthClientListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OAuthClientListParams = OAuthClientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthClientListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OAuthClientListParams = OAuthClientListParams.none()
        ): HttpResponseFor<OAuthClientListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OAuthClientListResponse> =
            list(OAuthClientListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /oauth_clients/{id}`, but is otherwise the same
         * as [OAuthClientService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, OAuthClientDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OAuthClientDeleteParams = OAuthClientDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OAuthClientDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OAuthClientDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, OAuthClientDeleteParams.none(), requestOptions)
    }
}
