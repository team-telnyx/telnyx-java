// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.regulatoryrequirements.RegulatoryRequirementRetrieveParams
import com.telnyx.sdk.models.regulatoryrequirements.RegulatoryRequirementRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RegulatoryRequirementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegulatoryRequirementServiceAsync

    /** Retrieve regulatory requirements */
    fun retrieve(): CompletableFuture<RegulatoryRequirementRetrieveResponse> =
        retrieve(RegulatoryRequirementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryRequirementRetrieveParams = RegulatoryRequirementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegulatoryRequirementRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RegulatoryRequirementRetrieveParams = RegulatoryRequirementRetrieveParams.none()
    ): CompletableFuture<RegulatoryRequirementRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): CompletableFuture<RegulatoryRequirementRetrieveResponse> =
        retrieve(RegulatoryRequirementRetrieveParams.none(), requestOptions)

    /**
     * A view of [RegulatoryRequirementServiceAsync] that provides access to raw HTTP responses for
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
        ): RegulatoryRequirementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /regulatory_requirements`, but is otherwise the same
         * as [RegulatoryRequirementServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<RegulatoryRequirementRetrieveResponse>> =
            retrieve(RegulatoryRequirementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: RegulatoryRequirementRetrieveParams =
                RegulatoryRequirementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegulatoryRequirementRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RegulatoryRequirementRetrieveParams = RegulatoryRequirementRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<RegulatoryRequirementRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RegulatoryRequirementRetrieveResponse>> =
            retrieve(RegulatoryRequirementRetrieveParams.none(), requestOptions)
    }
}
