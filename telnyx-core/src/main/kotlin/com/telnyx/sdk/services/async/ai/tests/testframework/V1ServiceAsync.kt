// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.V1RetrievePersonalitiesResponse
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.AiagentServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.MetricServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.ResultServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.v1.ScenarioServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun aiagents(): AiagentServiceAsync

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun metrics(): MetricServiceAsync

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun results(): ResultServiceAsync

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun scenarios(): ScenarioServiceAsync

    /**
     * Returns the catalogue of test personalities available to your organization. A personality
     * describes how a simulated caller speaks: prompt, language, accent, voice, interruption level,
     * and call-behaviour settings.
     */
    fun retrievePersonalities(): CompletableFuture<List<V1RetrievePersonalitiesResponse>> =
        retrievePersonalities(V1RetrievePersonalitiesParams.none())

    /** @see retrievePersonalities */
    fun retrievePersonalities(
        params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<V1RetrievePersonalitiesResponse>>

    /** @see retrievePersonalities */
    fun retrievePersonalities(
        params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none()
    ): CompletableFuture<List<V1RetrievePersonalitiesResponse>> =
        retrievePersonalities(params, RequestOptions.none())

    /** @see retrievePersonalities */
    fun retrievePersonalities(
        requestOptions: RequestOptions
    ): CompletableFuture<List<V1RetrievePersonalitiesResponse>> =
        retrievePersonalities(V1RetrievePersonalitiesParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun aiagents(): AiagentServiceAsync.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun metrics(): MetricServiceAsync.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun results(): ResultServiceAsync.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun scenarios(): ScenarioServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/personalities`, but is
         * otherwise the same as [V1ServiceAsync.retrievePersonalities].
         */
        fun retrievePersonalities():
            CompletableFuture<HttpResponseFor<List<V1RetrievePersonalitiesResponse>>> =
            retrievePersonalities(V1RetrievePersonalitiesParams.none())

        /** @see retrievePersonalities */
        fun retrievePersonalities(
            params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<V1RetrievePersonalitiesResponse>>>

        /** @see retrievePersonalities */
        fun retrievePersonalities(
            params: V1RetrievePersonalitiesParams = V1RetrievePersonalitiesParams.none()
        ): CompletableFuture<HttpResponseFor<List<V1RetrievePersonalitiesResponse>>> =
            retrievePersonalities(params, RequestOptions.none())

        /** @see retrievePersonalities */
        fun retrievePersonalities(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<V1RetrievePersonalitiesResponse>>> =
            retrievePersonalities(V1RetrievePersonalitiesParams.none(), requestOptions)
    }
}
