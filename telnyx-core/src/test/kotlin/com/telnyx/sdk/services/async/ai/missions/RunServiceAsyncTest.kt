// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.runs.RunCancelRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunCreateParams
import com.telnyx.sdk.models.ai.missions.runs.RunPauseRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunResumeRunParams
import com.telnyx.sdk.models.ai.missions.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.RunUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val runFuture =
            runServiceAsync.create(
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

        val run = runFuture.get()
        run.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val runFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val runFuture =
            runServiceAsync.update(
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
                    .status(RunUpdateParams.Status.PENDING)
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val pageFuture = runServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelRun() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val responseFuture =
            runServiceAsync.cancelRun(
                RunCancelRunParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRuns() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val pageFuture = runServiceAsync.listRuns()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pauseRun() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val responseFuture =
            runServiceAsync.pauseRun(
                RunPauseRunParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resumeRun() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().missions().runs()

        val responseFuture =
            runServiceAsync.resumeRun(
                RunResumeRunParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
