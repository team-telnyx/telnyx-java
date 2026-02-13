// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunUpdateResponseTest {

    @Test
    fun create() {
        val runUpdateResponse =
            RunUpdateResponse.builder()
                .data(
                    RunUpdateResponse.Data.builder()
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(RunUpdateResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .input(
                            RunUpdateResponse.Data.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            RunUpdateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultPayload(
                            RunUpdateResponse.Data.ResultPayload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultSummary("result_summary")
                        .build()
                )
                .build()

        assertThat(runUpdateResponse.data())
            .isEqualTo(
                RunUpdateResponse.Data.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(RunUpdateResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error("error")
                    .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .input(
                        RunUpdateResponse.Data.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        RunUpdateResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultPayload(
                        RunUpdateResponse.Data.ResultPayload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .resultSummary("result_summary")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runUpdateResponse =
            RunUpdateResponse.builder()
                .data(
                    RunUpdateResponse.Data.builder()
                        .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(RunUpdateResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error("error")
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .input(
                            RunUpdateResponse.Data.Input.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            RunUpdateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultPayload(
                            RunUpdateResponse.Data.ResultPayload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .resultSummary("result_summary")
                        .build()
                )
                .build()

        val roundtrippedRunUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runUpdateResponse),
                jacksonTypeRef<RunUpdateResponse>(),
            )

        assertThat(roundtrippedRunUpdateResponse).isEqualTo(runUpdateResponse)
    }
}
