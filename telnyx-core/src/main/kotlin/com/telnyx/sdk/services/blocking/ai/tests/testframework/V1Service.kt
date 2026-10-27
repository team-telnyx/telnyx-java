// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesResponse
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.AiagentService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.MetricService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.ResultService
import com.telnyx.sdk.services.blocking.ai.tests.testframework.v1.ScenarioService
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun aiagents(): AiagentService

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun metrics(): MetricService

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun results(): ResultService

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun scenarios(): ScenarioService

    /**
     * Returns the catalogue of test personalities available to your organization. A personality
     * describes how a simulated caller speaks: prompt, language, accent, voice, interruption level,
     * and call-behaviour settings.
     */
    fun retrievePersonalities(): List<V1RetrievePersonalitiesResponse> =
        retrievePersonalities(V1RetrievePersonalitiesParams.none())

    /** @see retrievePersonalities */
    fun retrievePersonalities(
        params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<V1RetrievePersonalitiesResponse>

    /** @see retrievePersonalities */
    fun retrievePersonalities(
        params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none()
    ): List<V1RetrievePersonalitiesResponse> = retrievePersonalities(params, RequestOptions.none())

    /** @see retrievePersonalities */
    fun retrievePersonalities(
        requestOptions: RequestOptions
    ): List<V1RetrievePersonalitiesResponse> =
        retrievePersonalities(V1RetrievePersonalitiesParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun aiagents(): AiagentService.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun metrics(): MetricService.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun results(): ResultService.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun scenarios(): ScenarioService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/personalities`, but is
         * otherwise the same as [V1Service.retrievePersonalities].
         */
        @MustBeClosed
        fun retrievePersonalities(): HttpResponseFor<List<V1RetrievePersonalitiesResponse>> =
            retrievePersonalities(V1RetrievePersonalitiesParams.none())

        /** @see retrievePersonalities */
        @MustBeClosed
        fun retrievePersonalities(
            params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<V1RetrievePersonalitiesResponse>>

        /** @see retrievePersonalities */
        @MustBeClosed
        fun retrievePersonalities(
            params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none()
        ): HttpResponseFor<List<V1RetrievePersonalitiesResponse>> =
            retrievePersonalities(params, RequestOptions.none())

        /** @see retrievePersonalities */
        @MustBeClosed
        fun retrievePersonalities(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<V1RetrievePersonalitiesResponse>> =
            retrievePersonalities(V1RetrievePersonalitiesParams.none(), requestOptions)
    }
}
