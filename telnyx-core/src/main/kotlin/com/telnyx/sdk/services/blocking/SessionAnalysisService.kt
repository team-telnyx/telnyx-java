// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.SessionAnalysisRetrieveResponse
import com.telnyx.sdk.services.blocking.sessionanalysis.MetadataService
import java.util.function.Consumer

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
interface SessionAnalysisService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionAnalysisService

    /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
    fun metadata(): MetadataService

    /**
     * Retrieves a full session analysis tree for a given event, including costs, child events, and
     * product linkages.
     */
    fun retrieve(
        eventId: String,
        params: SessionAnalysisRetrieveParams,
    ): SessionAnalysisRetrieveResponse = retrieve(eventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: SessionAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionAnalysisRetrieveResponse =
        retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SessionAnalysisRetrieveParams): SessionAnalysisRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SessionAnalysisRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionAnalysisRetrieveResponse

    /**
     * A view of [SessionAnalysisService] that provides access to raw HTTP responses for each
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
        ): SessionAnalysisService.WithRawResponse

        /** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
        fun metadata(): MetadataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /session_analysis/{record_type}/{event_id}`, but is
         * otherwise the same as [SessionAnalysisService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            eventId: String,
            params: SessionAnalysisRetrieveParams,
        ): HttpResponseFor<SessionAnalysisRetrieveResponse> =
            retrieve(eventId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            eventId: String,
            params: SessionAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionAnalysisRetrieveResponse> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SessionAnalysisRetrieveParams
        ): HttpResponseFor<SessionAnalysisRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SessionAnalysisRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionAnalysisRetrieveResponse>
    }
}
