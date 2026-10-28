// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioRetrieveExportScenariosParamsTest {

    @Test
    fun create() {
        ScenarioRetrieveExportScenariosParams.builder()
            .exportType(ScenarioRetrieveExportScenariosParams.ExportType.CSV)
            .scenarioIds("scenario_ids")
            .agentId(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ScenarioRetrieveExportScenariosParams.builder()
                .exportType(ScenarioRetrieveExportScenariosParams.ExportType.CSV)
                .scenarioIds("scenario_ids")
                .agentId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("export_type", "csv")
                    .put("scenario_ids", "scenario_ids")
                    .put("agent_id", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ScenarioRetrieveExportScenariosParams.builder()
                .exportType(ScenarioRetrieveExportScenariosParams.ExportType.CSV)
                .scenarioIds("scenario_ids")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("export_type", "csv")
                    .put("scenario_ids", "scenario_ids")
                    .build()
            )
    }
}
