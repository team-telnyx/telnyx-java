// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunCreateParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.RunStatus
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val missionRunResponse =
            runService.create(
                RunCreateParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .input(
                        RunCreateParams.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        RunCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        missionRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val missionRunResponse =
            runService.retrieve(
                RunRetrieveParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        missionRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val missionRunResponse =
            runService.update(
                RunUpdateParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .error("error")
                    .metadata(
                        RunUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultPayload(
                        RunUpdateParams.ResultPayload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultSummary("result_summary")
                    .status(RunStatus.PENDING)
                    .build()
            )

        missionRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val page = runService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelRun() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val missionRunResponse =
            runService.cancelRun(
                RunCancelRunParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        missionRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRuns() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val page = runService.listRuns()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pauseRun() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val missionRunResponse =
            runService.pauseRun(
                RunPauseRunParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        missionRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resumeRun() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().missions().runs()

        val missionRunResponse =
            runService.resumeRun(
                RunResumeRunParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        missionRunResponse.validate()
    }
}
