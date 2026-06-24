// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployUpdateParamsTest {

    @Test
    fun create() {
        CanaryDeployUpdateParams.builder()
            .assistantId("assistant_id")
            .canaryDeploy(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CanaryDeployUpdateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(CanaryDeploy.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CanaryDeployUpdateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CanaryDeployUpdateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(CanaryDeploy.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CanaryDeploy.builder().build())
    }
}
