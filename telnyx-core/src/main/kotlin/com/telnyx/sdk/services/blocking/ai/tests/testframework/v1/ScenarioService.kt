// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
interface ScenarioService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScenarioService

    /** Creates an evaluator scenario in your organization. */
    fun create(params: ScenarioCreateParams): EvaluatorScenarioDetail =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ScenarioCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluatorScenarioDetail

    /** Returns the specified evaluator scenario with full detail. */
    fun retrieve(id: Long): EvaluatorScenarioDetail = retrieve(id, ScenarioRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluatorScenarioDetail = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
    ): EvaluatorScenarioDetail = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ScenarioRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluatorScenarioDetail

    /** @see retrieve */
    fun retrieve(params: ScenarioRetrieveParams): EvaluatorScenarioDetail =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): EvaluatorScenarioDetail =
        retrieve(id, ScenarioRetrieveParams.none(), requestOptions)

    /** Updates the specified evaluator scenario. */
    fun update(id: Long): EvaluatorScenarioDetail = update(id, ScenarioUpdateParams.none())

    /** @see update */
    fun update(
        id: Long,
        params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluatorScenarioDetail = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: Long,
        params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
    ): EvaluatorScenarioDetail = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ScenarioUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluatorScenarioDetail

    /** @see update */
    fun update(params: ScenarioUpdateParams): EvaluatorScenarioDetail =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): EvaluatorScenarioDetail =
        update(id, ScenarioUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of evaluator scenarios in your organization, optionally filtered by
     * test agent or tags.
     */
    fun list(): ScenarioListResponse = list(ScenarioListParams.none())

    /** @see list */
    fun list(
        params: ScenarioListParams = ScenarioListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioListResponse

    /** @see list */
    fun list(params: ScenarioListParams = ScenarioListParams.none()): ScenarioListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ScenarioListResponse =
        list(ScenarioListParams.none(), requestOptions)

    /** Deletes the specified evaluator scenario. */
    fun delete(id: Long): ScenarioDeleteResponse = delete(id, ScenarioDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
    ): ScenarioDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ScenarioDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioDeleteResponse

    /** @see delete */
    fun delete(params: ScenarioDeleteParams): ScenarioDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): ScenarioDeleteResponse =
        delete(id, ScenarioDeleteParams.none(), requestOptions)

    /**
     * Starts background generation of evaluator scenarios for a test agent. Returns a progress ID
     * to poll with the generate-scenarios-progress endpoint.
     */
    fun generateBg(params: ScenarioGenerateBgParams): ScenarioGenerationResponse =
        generateBg(params, RequestOptions.none())

    /** @see generateBg */
    fun generateBg(
        params: ScenarioGenerateBgParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioGenerationResponse

    /** Exports the selected evaluator scenarios as a CSV or XLSX file download. */
    @MustBeClosed
    fun retrieveExportScenarios(params: ScenarioRetrieveExportScenariosParams): HttpResponse =
        retrieveExportScenarios(params, RequestOptions.none())

    /** @see retrieveExportScenarios */
    @MustBeClosed
    fun retrieveExportScenarios(
        params: ScenarioRetrieveExportScenariosParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Returns the status of a background scenario-generation job started with the
     * generate-evaluator-scenarios endpoint.
     */
    fun retrieveGenerateProgress(
        params: ScenarioRetrieveGenerateProgressParams
    ): ScenarioRetrieveGenerateProgressResponse =
        retrieveGenerateProgress(params, RequestOptions.none())

    /** @see retrieveGenerateProgress */
    fun retrieveGenerateProgress(
        params: ScenarioRetrieveGenerateProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioRetrieveGenerateProgressResponse

    /**
     * Returns the status of an improve-scenarios session started with the
     * improve-evaluator-scenarios endpoint.
     */
    fun retrieveScenarioAgentProgress(
        params: ScenarioRetrieveScenarioAgentProgressParams
    ): ScenarioRetrieveScenarioAgentProgressResponse =
        retrieveScenarioAgentProgress(params, RequestOptions.none())

    /** @see retrieveScenarioAgentProgress */
    fun retrieveScenarioAgentProgress(
        params: ScenarioRetrieveScenarioAgentProgressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioRetrieveScenarioAgentProgressResponse

    /**
     * Runs the selected evaluator scenarios against their test agents and creates a run batch.
     * Returns the ID of the created batch, whose results can be listed with the test-run-results
     * endpoints.
     */
    fun runScenarios(): ScenarioRunScenariosResponse =
        runScenarios(ScenarioRunScenariosParams.none())

    /** @see runScenarios */
    fun runScenarios(
        params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioRunScenariosResponse

    /** @see runScenarios */
    fun runScenarios(
        params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none()
    ): ScenarioRunScenariosResponse = runScenarios(params, RequestOptions.none())

    /** @see runScenarios */
    fun runScenarios(requestOptions: RequestOptions): ScenarioRunScenariosResponse =
        runScenarios(ScenarioRunScenariosParams.none(), requestOptions)

    /**
     * Starts an interactive session that improves selected evaluator scenarios from a
     * natural-language instruction. Returns a progress ID to poll with the
     * improve-scenarios-progress endpoint.
     */
    fun scenarioAgent(params: ScenarioScenarioAgentParams): ScenarioScenarioAgentResponse =
        scenarioAgent(params, RequestOptions.none())

    /** @see scenarioAgent */
    fun scenarioAgent(
        params: ScenarioScenarioAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScenarioScenarioAgentResponse

    /** A view of [ScenarioService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScenarioService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/scenarios`, but is
         * otherwise the same as [ScenarioService.create].
         */
        @MustBeClosed
        fun create(params: ScenarioCreateParams): HttpResponseFor<EvaluatorScenarioDetail> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ScenarioCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail>

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/scenarios/{id}`, but is
         * otherwise the same as [ScenarioService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: Long): HttpResponseFor<EvaluatorScenarioDetail> =
            retrieve(id, ScenarioRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: ScenarioRetrieveParams = ScenarioRetrieveParams.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ScenarioRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ScenarioRetrieveParams): HttpResponseFor<EvaluatorScenarioDetail> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluatorScenarioDetail> =
            retrieve(id, ScenarioRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tests/test_framework/v1/scenarios/{id}`, but
         * is otherwise the same as [ScenarioService.update].
         */
        @MustBeClosed
        fun update(id: Long): HttpResponseFor<EvaluatorScenarioDetail> =
            update(id, ScenarioUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: ScenarioUpdateParams = ScenarioUpdateParams.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ScenarioUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluatorScenarioDetail>

        /** @see update */
        @MustBeClosed
        fun update(params: ScenarioUpdateParams): HttpResponseFor<EvaluatorScenarioDetail> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluatorScenarioDetail> =
            update(id, ScenarioUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tests/test_framework/v1/scenarios`, but is
         * otherwise the same as [ScenarioService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ScenarioListResponse> = list(ScenarioListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ScenarioListParams = ScenarioListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ScenarioListParams = ScenarioListParams.none()
        ): HttpResponseFor<ScenarioListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ScenarioListResponse> =
            list(ScenarioListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tests/test_framework/v1/scenarios/{id}`, but
         * is otherwise the same as [ScenarioService.delete].
         */
        @MustBeClosed
        fun delete(id: Long): HttpResponseFor<ScenarioDeleteResponse> =
            delete(id, ScenarioDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: ScenarioDeleteParams = ScenarioDeleteParams.none(),
        ): HttpResponseFor<ScenarioDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ScenarioDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ScenarioDeleteParams): HttpResponseFor<ScenarioDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScenarioDeleteResponse> =
            delete(id, ScenarioDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/tests/test_framework/v1/scenarios/generate-bg`,
         * but is otherwise the same as [ScenarioService.generateBg].
         */
        @MustBeClosed
        fun generateBg(
            params: ScenarioGenerateBgParams
        ): HttpResponseFor<ScenarioGenerationResponse> = generateBg(params, RequestOptions.none())

        /** @see generateBg */
        @MustBeClosed
        fun generateBg(
            params: ScenarioGenerateBgParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioGenerationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/scenarios/export_scenarios`, but is otherwise the same as
         * [ScenarioService.retrieveExportScenarios].
         */
        @MustBeClosed
        fun retrieveExportScenarios(params: ScenarioRetrieveExportScenariosParams): HttpResponse =
            retrieveExportScenarios(params, RequestOptions.none())

        /** @see retrieveExportScenarios */
        @MustBeClosed
        fun retrieveExportScenarios(
            params: ScenarioRetrieveExportScenariosParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/scenarios/generate-progress`, but is otherwise the same as
         * [ScenarioService.retrieveGenerateProgress].
         */
        @MustBeClosed
        fun retrieveGenerateProgress(
            params: ScenarioRetrieveGenerateProgressParams
        ): HttpResponseFor<ScenarioRetrieveGenerateProgressResponse> =
            retrieveGenerateProgress(params, RequestOptions.none())

        /** @see retrieveGenerateProgress */
        @MustBeClosed
        fun retrieveGenerateProgress(
            params: ScenarioRetrieveGenerateProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioRetrieveGenerateProgressResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/tests/test_framework/v1/scenarios/scenario-agent-progress`, but is otherwise the same
         * as [ScenarioService.retrieveScenarioAgentProgress].
         */
        @MustBeClosed
        fun retrieveScenarioAgentProgress(
            params: ScenarioRetrieveScenarioAgentProgressParams
        ): HttpResponseFor<ScenarioRetrieveScenarioAgentProgressResponse> =
            retrieveScenarioAgentProgress(params, RequestOptions.none())

        /** @see retrieveScenarioAgentProgress */
        @MustBeClosed
        fun retrieveScenarioAgentProgress(
            params: ScenarioRetrieveScenarioAgentProgressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioRetrieveScenarioAgentProgressResponse>

        /**
         * Returns a raw HTTP response for `post
         * /ai/tests/test_framework/v1/scenarios/run_scenarios`, but is otherwise the same as
         * [ScenarioService.runScenarios].
         */
        @MustBeClosed
        fun runScenarios(): HttpResponseFor<ScenarioRunScenariosResponse> =
            runScenarios(ScenarioRunScenariosParams.none())

        /** @see runScenarios */
        @MustBeClosed
        fun runScenarios(
            params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioRunScenariosResponse>

        /** @see runScenarios */
        @MustBeClosed
        fun runScenarios(
            params: ScenarioRunScenariosParams = ScenarioRunScenariosParams.none()
        ): HttpResponseFor<ScenarioRunScenariosResponse> =
            runScenarios(params, RequestOptions.none())

        /** @see runScenarios */
        @MustBeClosed
        fun runScenarios(
            requestOptions: RequestOptions
        ): HttpResponseFor<ScenarioRunScenariosResponse> =
            runScenarios(ScenarioRunScenariosParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /ai/tests/test_framework/v1/scenarios/scenario-agent`, but is otherwise the same as
         * [ScenarioService.scenarioAgent].
         */
        @MustBeClosed
        fun scenarioAgent(
            params: ScenarioScenarioAgentParams
        ): HttpResponseFor<ScenarioScenarioAgentResponse> =
            scenarioAgent(params, RequestOptions.none())

        /** @see scenarioAgent */
        @MustBeClosed
        fun scenarioAgent(
            params: ScenarioScenarioAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScenarioScenarioAgentResponse>
    }
}
