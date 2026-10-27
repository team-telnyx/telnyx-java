// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.ScenarioGenerationResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.EvaluatorScenarioDetail
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioDeleteParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioDeleteResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioGenerateBgParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioListResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveExportScenariosParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveGenerateProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveGenerateProgressResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveScenarioAgentProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveScenarioAgentProgressResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRunScenariosParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRunScenariosResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioScenarioAgentParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioScenarioAgentResponse
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface ScenarioServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScenarioServiceAsync

    /** Creates an evaluator scenario in your organization. */
    fun create(params: ScenarioCreateParams): CompletableFuture<EvaluatorScenarioDetail> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScenarioCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EvaluatorScenarioDetail>

    /** Returns the specified evaluator scenario with full detail. */
    fun retrieve(id: Long): CompletableFuture<EvaluatorScenarioDetail> =
        retrieve(id, ScenarioRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EvaluatorScenarioDetail> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
    ): CompletableFuture<EvaluatorScenarioDetail> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ScenarioRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EvaluatorScenarioDetail>

    /** @see retrieve */
    fun retrieve(params: ScenarioRetrieveParams): CompletableFuture<EvaluatorScenarioDetail> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvaluatorScenarioDetail> =
        retrieve(id, ScenarioRetrieveParams.none(), requestOptions)

    /** Updates the specified evaluator scenario. */
    fun update(id: Long): CompletableFuture<EvaluatorScenarioDetail> =
        update(id, ScenarioUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EvaluatorScenarioDetail> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: Long,
        params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
    ): CompletableFuture<EvaluatorScenarioDetail> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ScenarioUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EvaluatorScenarioDetail>

    /** @see update */
    fun update(params: ScenarioUpdateParams): CompletableFuture<EvaluatorScenarioDetail> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<EvaluatorScenarioDetail> =
        update(id, ScenarioUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of evaluator scenarios in your organization, optionally filtered by
     * test agent or tags.
     */
    fun list(): CompletableFuture<ScenarioListResponse> = list(ScenarioListParams.none())

    /** @see list */
    fun list(
        params: ScenarioListParams = ScenarioListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioListResponse>

    /** @see list */
    fun list(
        params: ScenarioListParams = ScenarioListParams.none()
    ): CompletableFuture<ScenarioListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ScenarioListResponse> =
        list(ScenarioListParams.none(), requestOptions)

    /** Deletes the specified evaluator scenario. */
    fun delete(id: Long): CompletableFuture<ScenarioDeleteResponse> =
        delete(id, ScenarioDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
    ): CompletableFuture<ScenarioDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ScenarioDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioDeleteResponse>

    /** @see delete */
    fun delete(params: ScenarioDeleteParams): CompletableFuture<ScenarioDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScenarioDeleteResponse> =
        delete(id, ScenarioDeleteParams.none(), requestOptions)

    /**
     * Starts background generation of evaluator scenarios for a test agent. Returns a progress ID
     * to poll with the generate-scenarios-progress endpoint.
     */
    fun generateBg(
        params: ScenarioGenerateBgParams
    ): CompletableFuture<ScenarioGenerationResponse> = generateBg(params, RequestOptions.none())

    /** @see generateBg */
    fun generateBg(
        params: ScenarioGenerateBgParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioGenerationResponse>

    /** Exports the selected evaluator scenarios as a CSV or XLSX file download. */
    fun retrieveExportScenarios(
        params: ScenarioRetrieveExportScenariosParams
    ): CompletableFuture<HttpResponse> = retrieveExportScenarios(params, RequestOptions.none())

    /** @see retrieveExportScenarios */
    fun retrieveExportScenarios(
        params: ScenarioRetrieveExportScenariosParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Returns the status of a background scenario-generation job started with the
     * generate-evaluator-scenarios endpoint.
     */
    fun retrieveGenerateProgress(
        params: ScenarioRetrieveGenerateProgressParams
    ): CompletableFuture<ScenarioRetrieveGenerateProgressResponse> =
        retrieveGenerateProgress(params, RequestOptions.none())

    /** @see retrieveGenerateProgress */
    fun retrieveGenerateProgress(
        params: ScenarioRetrieveGenerateProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioRetrieveGenerateProgressResponse>

    /**
     * Returns the status of an improve-scenarios session started with the
     * improve-evaluator-scenarios endpoint.
     */
    fun retrieveScenarioAgentProgress(
        params: ScenarioRetrieveScenarioAgentProgressParams
    ): CompletableFuture<ScenarioRetrieveScenarioAgentProgressResponse> =
        retrieveScenarioAgentProgress(params, RequestOptions.none())

    /** @see retrieveScenarioAgentProgress */
    fun retrieveScenarioAgentProgress(
        params: ScenarioRetrieveScenarioAgentProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioRetrieveScenarioAgentProgressResponse>

    /**
     * Runs the selected evaluator scenarios against their test agents and creates a run batch.
     * Returns the ID of the created batch, whose results can be listed with the test-run-results
     * endpoints.
     */
    fun runScenarios(): CompletableFuture<ScenarioRunScenariosResponse> =
        runScenarios(ScenarioRunScenariosParams.none())

    /** @see runScenarios */
    fun runScenarios(
        params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioRunScenariosResponse>

    /** @see runScenarios */
    fun runScenarios(
        params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none()
    ): CompletableFuture<ScenarioRunScenariosResponse> = runScenarios(params, RequestOptions.none())

    /** @see runScenarios */
    fun runScenarios(
        requestOptions: RequestOptions
    ): CompletableFuture<ScenarioRunScenariosResponse> =
        runScenarios(ScenarioRunScenariosParams.none(), requestOptions)

    /**
     * Starts an interactive session that improves selected evaluator scenarios from a
     * natural-language instruction. Returns a progress ID to poll with the
     * improve-scenarios-progress endpoint.
     */
    fun scenarioAgent(
        params: ScenarioScenarioAgentParams
    ): CompletableFuture<ScenarioScenarioAgentResponse> =
        scenarioAgent(params, RequestOptions.none())

    /** @see scenarioAgent */
    fun scenarioAgent(
        params: ScenarioScenarioAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScenarioScenarioAgentResponse>

    /**
     * A view of [ScenarioServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScenarioServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/scenarios`, but is
         * otherwise the same as [ScenarioServiceAsync.create].
         */
        fun create(
            params: ScenarioCreateParams
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ScenarioCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>>

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/scenarios/{id}`, but is
         * otherwise the same as [ScenarioServiceAsync.retrieve].
         */
        fun retrieve(id: Long): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            retrieve(id, ScenarioRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ScenarioRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>>

        /** @see retrieve */
        fun retrieve(
            params: ScenarioRetrieveParams
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            retrieve(id, ScenarioRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tests/test_framework/v1/scenarios/{id}`, but
         * is otherwise the same as [ScenarioServiceAsync.update].
         */
        fun update(id: Long): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            update(id, ScenarioUpdateParams.none())

        /** @see update */
        fun update(
            id: Long,
            params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: Long,
            params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ScenarioUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>>

        /** @see update */
        fun update(
            params: ScenarioUpdateParams
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EvaluatorScenarioDetail>> =
            update(id, ScenarioUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/scenarios`, but is
         * otherwise the same as [ScenarioServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ScenarioListResponse>> =
            list(ScenarioListParams.none())

        /** @see list */
        fun list(
            params: ScenarioListParams = ScenarioListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioListResponse>>

        /** @see list */
        fun list(
            params: ScenarioListParams = ScenarioListParams.none()
        ): CompletableFuture<HttpResponseFor<ScenarioListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScenarioListResponse>> =
            list(ScenarioListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/scenarios/{id}`, but
         * is otherwise the same as [ScenarioServiceAsync.delete].
         */
        fun delete(id: Long): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>> =
            delete(id, ScenarioDeleteParams.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: Long,
            params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ScenarioDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ScenarioDeleteParams
        ): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScenarioDeleteResponse>> =
            delete(id, ScenarioDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/scenarios/generate-bg`,
         * but is otherwise the same as [ScenarioServiceAsync.generateBg].
         */
        fun generateBg(
            params: ScenarioGenerateBgParams
        ): CompletableFuture<HttpResponseFor<ScenarioGenerationResponse>> =
            generateBg(params, RequestOptions.none())

        /** @see generateBg */
        fun generateBg(
            params: ScenarioGenerateBgParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioGenerationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/scenarios/export_scenarios`, but is otherwise the same as
         * [ScenarioServiceAsync.retrieveExportScenarios].
         */
        fun retrieveExportScenarios(
            params: ScenarioRetrieveExportScenariosParams
        ): CompletableFuture<HttpResponse> = retrieveExportScenarios(params, RequestOptions.none())

        /** @see retrieveExportScenarios */
        fun retrieveExportScenarios(
            params: ScenarioRetrieveExportScenariosParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/scenarios/generate-progress`, but is otherwise the same as
         * [ScenarioServiceAsync.retrieveGenerateProgress].
         */
        fun retrieveGenerateProgress(
            params: ScenarioRetrieveGenerateProgressParams
        ): CompletableFuture<HttpResponseFor<ScenarioRetrieveGenerateProgressResponse>> =
            retrieveGenerateProgress(params, RequestOptions.none())

        /** @see retrieveGenerateProgress */
        fun retrieveGenerateProgress(
            params: ScenarioRetrieveGenerateProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioRetrieveGenerateProgressResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/scenarios/scenario-agent-progress`, but is otherwise the same
         * as [ScenarioServiceAsync.retrieveScenarioAgentProgress].
         */
        fun retrieveScenarioAgentProgress(
            params: ScenarioRetrieveScenarioAgentProgressParams
        ): CompletableFuture<HttpResponseFor<ScenarioRetrieveScenarioAgentProgressResponse>> =
            retrieveScenarioAgentProgress(params, RequestOptions.none())

        /** @see retrieveScenarioAgentProgress */
        fun retrieveScenarioAgentProgress(
            params: ScenarioRetrieveScenarioAgentProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioRetrieveScenarioAgentProgressResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /ai/tests/test_framework/v1/scenarios/run_scenarios`, but is otherwise the same as
         * [ScenarioServiceAsync.runScenarios].
         */
        fun runScenarios(): CompletableFuture<HttpResponseFor<ScenarioRunScenariosResponse>> =
            runScenarios(ScenarioRunScenariosParams.none())

        /** @see runScenarios */
        fun runScenarios(
            params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioRunScenariosResponse>>

        /** @see runScenarios */
        fun runScenarios(
            params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none()
        ): CompletableFuture<HttpResponseFor<ScenarioRunScenariosResponse>> =
            runScenarios(params, RequestOptions.none())

        /** @see runScenarios */
        fun runScenarios(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScenarioRunScenariosResponse>> =
            runScenarios(ScenarioRunScenariosParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /ai/tests/test_framework/v1/scenarios/scenario-agent`, but is otherwise the same as
         * [ScenarioServiceAsync.scenarioAgent].
         */
        fun scenarioAgent(
            params: ScenarioScenarioAgentParams
        ): CompletableFuture<HttpResponseFor<ScenarioScenarioAgentResponse>> =
            scenarioAgent(params, RequestOptions.none())

        /** @see scenarioAgent */
        fun scenarioAgent(
            params: ScenarioScenarioAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScenarioScenarioAgentResponse>>
    }
}
