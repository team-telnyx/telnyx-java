// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.fqdns.FqdnCreateParams
import com.telnyx.sdk.models.fqdns.FqdnCreateResponse
import com.telnyx.sdk.models.fqdns.FqdnDeleteParams
import com.telnyx.sdk.models.fqdns.FqdnDeleteResponse
import com.telnyx.sdk.models.fqdns.FqdnListPage
import com.telnyx.sdk.models.fqdns.FqdnListParams
import com.telnyx.sdk.models.fqdns.FqdnRetrieveParams
import com.telnyx.sdk.models.fqdns.FqdnRetrieveResponse
import com.telnyx.sdk.models.fqdns.FqdnUpdateParams
import com.telnyx.sdk.models.fqdns.FqdnUpdateResponse
import java.util.function.Consumer

interface FqdnService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnService

    /** Create a new FQDN object. */
    fun create(params: FqdnCreateParams): FqdnCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FqdnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnCreateResponse

    /** Return the details regarding a specific FQDN. */
    fun retrieve(id: String): FqdnRetrieveResponse = retrieve(id, FqdnRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
    ): FqdnRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FqdnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FqdnRetrieveParams): FqdnRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FqdnRetrieveResponse =
        retrieve(id, FqdnRetrieveParams.none(), requestOptions)

    /** Update the details of a specific FQDN. */
    fun update(id: String): FqdnUpdateResponse = update(id, FqdnUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: FqdnUpdateParams = FqdnUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: FqdnUpdateParams = FqdnUpdateParams.none()): FqdnUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FqdnUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnUpdateResponse

    /** @see update */
    fun update(params: FqdnUpdateParams): FqdnUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): FqdnUpdateResponse =
        update(id, FqdnUpdateParams.none(), requestOptions)

    /** Get all FQDNs belonging to the user that match the given filters. */
    fun list(): FqdnListPage = list(FqdnListParams.none())

    /** @see list */
    fun list(
        params: FqdnListParams = FqdnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnListPage

    /** @see list */
    fun list(params: FqdnListParams = FqdnListParams.none()): FqdnListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FqdnListPage =
        list(FqdnListParams.none(), requestOptions)

    /** Delete an FQDN. */
    fun delete(id: String): FqdnDeleteResponse = delete(id, FqdnDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FqdnDeleteParams = FqdnDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: FqdnDeleteParams = FqdnDeleteParams.none()): FqdnDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FqdnDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FqdnDeleteResponse

    /** @see delete */
    fun delete(params: FqdnDeleteParams): FqdnDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): FqdnDeleteResponse =
        delete(id, FqdnDeleteParams.none(), requestOptions)

    /** A view of [FqdnService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fqdns`, but is otherwise the same as
         * [FqdnService.create].
         */
        @MustBeClosed
        fun create(params: FqdnCreateParams): HttpResponseFor<FqdnCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FqdnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnCreateResponse>

        /**
         * Returns a raw HTTP response for `get /fqdns/{id}`, but is otherwise the same as
         * [FqdnService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FqdnRetrieveResponse> =
            retrieve(id, FqdnRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FqdnRetrieveParams = FqdnRetrieveParams.none(),
        ): HttpResponseFor<FqdnRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FqdnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FqdnRetrieveParams): HttpResponseFor<FqdnRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnRetrieveResponse> =
            retrieve(id, FqdnRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /fqdns/{id}`, but is otherwise the same as
         * [FqdnService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<FqdnUpdateResponse> =
            update(id, FqdnUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: FqdnUpdateParams = FqdnUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: FqdnUpdateParams = FqdnUpdateParams.none(),
        ): HttpResponseFor<FqdnUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FqdnUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: FqdnUpdateParams): HttpResponseFor<FqdnUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnUpdateResponse> = update(id, FqdnUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fqdns`, but is otherwise the same as
         * [FqdnService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FqdnListPage> = list(FqdnListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FqdnListParams = FqdnListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: FqdnListParams = FqdnListParams.none()): HttpResponseFor<FqdnListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FqdnListPage> =
            list(FqdnListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /fqdns/{id}`, but is otherwise the same as
         * [FqdnService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<FqdnDeleteResponse> =
            delete(id, FqdnDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FqdnDeleteParams = FqdnDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FqdnDeleteParams = FqdnDeleteParams.none(),
        ): HttpResponseFor<FqdnDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FqdnDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FqdnDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: FqdnDeleteParams): HttpResponseFor<FqdnDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnDeleteResponse> = delete(id, FqdnDeleteParams.none(), requestOptions)
    }
}
