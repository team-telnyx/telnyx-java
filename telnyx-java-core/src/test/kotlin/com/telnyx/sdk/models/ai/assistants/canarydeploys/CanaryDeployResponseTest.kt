// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployResponseTest {

    @Test
    fun create() {
        val canaryDeployResponse =
            CanaryDeployResponse.builder()
                .assistantId("assistant_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRule(
                    CanaryDeployResponse.Rule.builder()
                        .serve(
                            CanaryDeployResponse.Rule.Serve.builder()
                                .addRollout(
                                    CanaryDeployResponse.Rule.Serve.Rollout.builder()
                                        .versionId("version_id")
                                        .weight(0.0)
                                        .build()
                                )
                                .versionId("version_id")
                                .build()
                        )
                        .addMatch(
                            CanaryDeployResponse.Rule.Match.builder()
                                .attribute("attribute")
                                .operator(CanaryDeployResponse.Rule.Match.Operator.IN)
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(canaryDeployResponse.assistantId()).isEqualTo("assistant_id")
        assertThat(canaryDeployResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(canaryDeployResponse.rules())
            .containsExactly(
                CanaryDeployResponse.Rule.builder()
                    .serve(
                        CanaryDeployResponse.Rule.Serve.builder()
                            .addRollout(
                                CanaryDeployResponse.Rule.Serve.Rollout.builder()
                                    .versionId("version_id")
                                    .weight(0.0)
                                    .build()
                            )
                            .versionId("version_id")
                            .build()
                    )
                    .addMatch(
                        CanaryDeployResponse.Rule.Match.builder()
                            .attribute("attribute")
                            .operator(CanaryDeployResponse.Rule.Match.Operator.IN)
                            .addValue("string")
                            .build()
                    )
                    .build()
            )
        assertThat(canaryDeployResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val canaryDeployResponse =
            CanaryDeployResponse.builder()
                .assistantId("assistant_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRule(
                    CanaryDeployResponse.Rule.builder()
                        .serve(
                            CanaryDeployResponse.Rule.Serve.builder()
                                .addRollout(
                                    CanaryDeployResponse.Rule.Serve.Rollout.builder()
                                        .versionId("version_id")
                                        .weight(0.0)
                                        .build()
                                )
                                .versionId("version_id")
                                .build()
                        )
                        .addMatch(
                            CanaryDeployResponse.Rule.Match.builder()
                                .attribute("attribute")
                                .operator(CanaryDeployResponse.Rule.Match.Operator.IN)
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCanaryDeployResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(canaryDeployResponse),
                jacksonTypeRef<CanaryDeployResponse>(),
            )

        assertThat(roundtrippedCanaryDeployResponse).isEqualTo(canaryDeployResponse)
    }
}
