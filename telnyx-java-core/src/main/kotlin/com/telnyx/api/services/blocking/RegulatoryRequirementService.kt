// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.regulatoryrequirements.RegulatoryRequirementRetrieveParams
import com.telnyx.api.models.regulatoryrequirements.RegulatoryRequirementRetrieveResponse
import java.util.function.Consumer

interface RegulatoryRequirementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegulatoryRequirementService

    /** Retrieve regulatory requirements */
    fun retrieve(): RegulatoryRequirementRetrieveResponse =
        retrieve(RegulatoryRequirementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryRequirementRetrieveParams = RegulatoryRequirementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegulatoryRequirementRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryRequirementRetrieveParams = RegulatoryRequirementRetrieveParams.none()
    ): RegulatoryRequirementRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): RegulatoryRequirementRetrieveResponse =
        retrieve(RegulatoryRequirementRetrieveParams.none(), requestOptions)

    /**
     * A view of [RegulatoryRequirementService] that provides access to raw HTTP responses for each
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
        ): RegulatoryRequirementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /regulatory_requirements`, but is otherwise the same
         * as [RegulatoryRequirementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<RegulatoryRequirementRetrieveResponse> =
            retrieve(RegulatoryRequirementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RegulatoryRequirementRetrieveParams =
                RegulatoryRequirementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegulatoryRequirementRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RegulatoryRequirementRetrieveParams = RegulatoryRequirementRetrieveParams.none()
        ): HttpResponseFor<RegulatoryRequirementRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<RegulatoryRequirementRetrieveResponse> =
            retrieve(RegulatoryRequirementRetrieveParams.none(), requestOptions)
    }
}
