// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployTest {

    @Test
    fun create() {
        val canaryDeploy =
            CanaryDeploy.builder()
                .addRule(
                    RuleInput.builder()
                        .serve(
                            Serve.builder()
                                .addRollout(
                                    RolloutSlot.builder()
                                        .versionId("version_id")
                                        .weight(0.0)
                                        .build()
                                )
                                .versionId("version_id")
                                .build()
                        )
                        .addMatch(
                            Clause.builder()
                                .attribute("attribute")
                                .operator(Clause.Operator.IN)
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(canaryDeploy.rules().getOrNull())
            .containsExactly(
                RuleInput.builder()
                    .serve(
                        Serve.builder()
                            .addRollout(
                                RolloutSlot.builder().versionId("version_id").weight(0.0).build()
                            )
                            .versionId("version_id")
                            .build()
                    )
                    .addMatch(
                        Clause.builder()
                            .attribute("attribute")
                            .operator(Clause.Operator.IN)
                            .addValue("string")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val canaryDeploy =
            CanaryDeploy.builder()
                .addRule(
                    RuleInput.builder()
                        .serve(
                            Serve.builder()
                                .addRollout(
                                    RolloutSlot.builder()
                                        .versionId("version_id")
                                        .weight(0.0)
                                        .build()
                                )
                                .versionId("version_id")
                                .build()
                        )
                        .addMatch(
                            Clause.builder()
                                .attribute("attribute")
                                .operator(Clause.Operator.IN)
                                .addValue("string")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCanaryDeploy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(canaryDeploy),
                jacksonTypeRef<CanaryDeploy>(),
            )

        assertThat(roundtrippedCanaryDeploy).isEqualTo(canaryDeploy)
    }
}
