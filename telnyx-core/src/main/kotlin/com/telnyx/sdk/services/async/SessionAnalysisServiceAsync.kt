// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveResponse
import com.telnyx.sdk.services.async.sessionanalysis.MetadataServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
interface SessionAnalysisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionAnalysisServiceAsync

    /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
    fun metadata(): MetadataServiceAsync

    /**
     * Retrieves a full session analysis tree for a given event, including costs, child events, and
     * product linkages.
     */
    fun retrieve(
        eventId: String,
        params: SessionAnalysisRetrieveParams,
    ): CompletableFuture<SessionAnalysisRetrieveResponse> =
        retrieve(eventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: SessionAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionAnalysisRetrieveResponse> =
        retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: SessionAnalysisRetrieveParams
    ): CompletableFuture<SessionAnalysisRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SessionAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionAnalysisRetrieveResponse>

    /**
     * A view of [SessionAnalysisServiceAsync] that provides access to raw HTTP responses for each
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
        ): SessionAnalysisServiceAsync.WithRawResponse

        /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
        fun metadata(): MetadataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /session_analysis/{record_type}/{event_id}`, but is
         * otherwise the same as [SessionAnalysisServiceAsync.retrieve].
         */
        fun retrieve(
            eventId: String,
            params: SessionAnalysisRetrieveParams,
        ): CompletableFuture<HttpResponseFor<SessionAnalysisRetrieveResponse>> =
            retrieve(eventId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            eventId: String,
            params: SessionAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionAnalysisRetrieveResponse>> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: SessionAnalysisRetrieveParams
        ): CompletableFuture<HttpResponseFor<SessionAnalysisRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SessionAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionAnalysisRetrieveResponse>>
    }
}
