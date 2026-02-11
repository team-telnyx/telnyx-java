// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            RunUpdateParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.error()).contains("error")
        assertThat(body.metadata())
            .contains(
                RunUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.resultPayload())
            .contains(
                RunUpdateParams.ResultPayload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.resultSummary()).contains("result_summary")
        assertThat(body.status()).contains(RunUpdateParams.Status.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunUpdateParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
