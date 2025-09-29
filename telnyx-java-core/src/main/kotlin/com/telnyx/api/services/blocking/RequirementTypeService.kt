// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.requirementtypes.RequirementTypeListParams
import com.telnyx.api.models.requirementtypes.RequirementTypeListResponse
import com.telnyx.api.models.requirementtypes.RequirementTypeRetrieveParams
import com.telnyx.api.models.requirementtypes.RequirementTypeRetrieveResponse
import java.util.function.Consumer

interface RequirementTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementTypeService

    /** Retrieve a requirement type by id */
    fun retrieve(id: String): RequirementTypeRetrieveResponse =
        retrieve(id, RequirementTypeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementTypeRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
    ): RequirementTypeRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequirementTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementTypeRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RequirementTypeRetrieveParams): RequirementTypeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RequirementTypeRetrieveResponse =
        retrieve(id, RequirementTypeRetrieveParams.none(), requestOptions)

    /** List all requirement types ordered by created_at descending */
    fun list(): RequirementTypeListResponse = list(RequirementTypeListParams.none())

    /** @see list */
    fun list(
        params: RequirementTypeListParams = RequirementTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementTypeListResponse

    /** @see list */
    fun list(
        params: RequirementTypeListParams = RequirementTypeListParams.none()
    ): RequirementTypeListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RequirementTypeListResponse =
        list(RequirementTypeListParams.none(), requestOptions)

    /**
     * A view of [RequirementTypeService] that provides access to raw HTTP responses for each
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
        ): RequirementTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /requirement_types/{id}`, but is otherwise the same
         * as [RequirementTypeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RequirementTypeRetrieveResponse> =
            retrieve(id, RequirementTypeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementTypeRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequirementTypeRetrieveParams = RequirementTypeRetrieveParams.none(),
        ): HttpResponseFor<RequirementTypeRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RequirementTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementTypeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RequirementTypeRetrieveParams
        ): HttpResponseFor<RequirementTypeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementTypeRetrieveResponse> =
            retrieve(id, RequirementTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /requirement_types`, but is otherwise the same as
         * [RequirementTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RequirementTypeListResponse> =
            list(RequirementTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequirementTypeListParams = RequirementTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementTypeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequirementTypeListParams = RequirementTypeListParams.none()
        ): HttpResponseFor<RequirementTypeListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RequirementTypeListResponse> =
            list(RequirementTypeListParams.none(), requestOptions)
    }
}
