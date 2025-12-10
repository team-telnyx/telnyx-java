// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.requirements.RequirementListParams
import com.telnyx.sdk.models.requirements.RequirementListResponse
import com.telnyx.sdk.models.requirements.RequirementRetrieveParams
import com.telnyx.sdk.models.requirements.RequirementRetrieveResponse
import java.util.function.Consumer

interface RequirementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementService

    /** Retrieve a document requirement record */
    fun retrieve(id: String): RequirementRetrieveResponse =
        retrieve(id, RequirementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
    ): RequirementRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequirementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RequirementRetrieveParams): RequirementRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RequirementRetrieveResponse =
        retrieve(id, RequirementRetrieveParams.none(), requestOptions)

    /** List all requirements with filtering, sorting, and pagination */
    fun list(): RequirementListResponse = list(RequirementListParams.none())

    /** @see list */
    fun list(
        params: RequirementListParams = RequirementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementListResponse

    /** @see list */
    fun list(
        params: RequirementListParams = RequirementListParams.none()
    ): RequirementListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RequirementListResponse =
        list(RequirementListParams.none(), requestOptions)

    /**
     * A view of [RequirementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequirementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /requirements/{id}`, but is otherwise the same as
         * [RequirementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RequirementRetrieveResponse> =
            retrieve(id, RequirementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequirementRetrieveParams = RequirementRetrieveParams.none(),
        ): HttpResponseFor<RequirementRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RequirementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RequirementRetrieveParams
        ): HttpResponseFor<RequirementRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementRetrieveResponse> =
            retrieve(id, RequirementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /requirements`, but is otherwise the same as
         * [RequirementService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RequirementListResponse> = list(RequirementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequirementListParams = RequirementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequirementListParams = RequirementListParams.none()
        ): HttpResponseFor<RequirementListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RequirementListResponse> =
            list(RequirementListParams.none(), requestOptions)
    }
}
