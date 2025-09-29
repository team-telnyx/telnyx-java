// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.fqdnconnections.FqdnConnectionCreateParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionCreateResponse
import com.telnyx.api.models.fqdnconnections.FqdnConnectionDeleteParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionDeleteResponse
import com.telnyx.api.models.fqdnconnections.FqdnConnectionListParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionListResponse
import com.telnyx.api.models.fqdnconnections.FqdnConnectionRetrieveParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionRetrieveResponse
import com.telnyx.api.models.fqdnconnections.FqdnConnectionUpdateParams
import com.telnyx.api.models.fqdnconnections.FqdnConnectionUpdateResponse
import java.util.function.Consumer

interface FqdnConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnConnectionService

    /** Creates a FQDN connection. */
    fun create(params: FqdnConnectionCreateParams): FqdnConnectionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FqdnConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionCreateResponse

    /** Retrieves the details of an existing FQDN connection. */
    fun retrieve(id: String): FqdnConnectionRetrieveResponse =
        retrieve(id, FqdnConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
    ): FqdnConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FqdnConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FqdnConnectionRetrieveParams): FqdnConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FqdnConnectionRetrieveResponse =
        retrieve(id, FqdnConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing FQDN connection. */
    fun update(id: String): FqdnConnectionUpdateResponse =
        update(id, FqdnConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
    ): FqdnConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FqdnConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionUpdateResponse

    /** @see update */
    fun update(params: FqdnConnectionUpdateParams): FqdnConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): FqdnConnectionUpdateResponse =
        update(id, FqdnConnectionUpdateParams.none(), requestOptions)

    /** Returns a list of your FQDN connections. */
    fun list(): FqdnConnectionListResponse = list(FqdnConnectionListParams.none())

    /** @see list */
    fun list(
        params: FqdnConnectionListParams = FqdnConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionListResponse

    /** @see list */
    fun list(
        params: FqdnConnectionListParams = FqdnConnectionListParams.none()
    ): FqdnConnectionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FqdnConnectionListResponse =
        list(FqdnConnectionListParams.none(), requestOptions)

    /** Deletes an FQDN connection. */
    fun delete(id: String): FqdnConnectionDeleteResponse =
        delete(id, FqdnConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
    ): FqdnConnectionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FqdnConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnConnectionDeleteResponse

    /** @see delete */
    fun delete(params: FqdnConnectionDeleteParams): FqdnConnectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): FqdnConnectionDeleteResponse =
        delete(id, FqdnConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [FqdnConnectionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FqdnConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fqdn_connections`, but is otherwise the same as
         * [FqdnConnectionService.create].
         */
        @MustBeClosed
        fun create(
            params: FqdnConnectionCreateParams
        ): HttpResponseFor<FqdnConnectionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FqdnConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /fqdn_connections/{id}`, but is otherwise the same
         * as [FqdnConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FqdnConnectionRetrieveResponse> =
            retrieve(id, FqdnConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FqdnConnectionRetrieveParams = FqdnConnectionRetrieveParams.none(),
        ): HttpResponseFor<FqdnConnectionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FqdnConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FqdnConnectionRetrieveParams
        ): HttpResponseFor<FqdnConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionRetrieveResponse> =
            retrieve(id, FqdnConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /fqdn_connections/{id}`, but is otherwise the same
         * as [FqdnConnectionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<FqdnConnectionUpdateResponse> =
            update(id, FqdnConnectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: FqdnConnectionUpdateParams = FqdnConnectionUpdateParams.none(),
        ): HttpResponseFor<FqdnConnectionUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FqdnConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: FqdnConnectionUpdateParams
        ): HttpResponseFor<FqdnConnectionUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionUpdateResponse> =
            update(id, FqdnConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fqdn_connections`, but is otherwise the same as
         * [FqdnConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FqdnConnectionListResponse> =
            list(FqdnConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FqdnConnectionListParams = FqdnConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FqdnConnectionListParams = FqdnConnectionListParams.none()
        ): HttpResponseFor<FqdnConnectionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FqdnConnectionListResponse> =
            list(FqdnConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /fqdn_connections/{id}`, but is otherwise the
         * same as [FqdnConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<FqdnConnectionDeleteResponse> =
            delete(id, FqdnConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FqdnConnectionDeleteParams = FqdnConnectionDeleteParams.none(),
        ): HttpResponseFor<FqdnConnectionDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FqdnConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnConnectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FqdnConnectionDeleteParams
        ): HttpResponseFor<FqdnConnectionDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionDeleteResponse> =
            delete(id, FqdnConnectionDeleteParams.none(), requestOptions)
    }
}
