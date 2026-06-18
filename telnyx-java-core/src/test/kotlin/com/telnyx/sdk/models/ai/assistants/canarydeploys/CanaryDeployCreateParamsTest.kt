// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployCreateParamsTest {

    @Test
    fun create() {
        CanaryDeployCreateParams.builder()
            .assistantId("assistant_id")
            .canaryDeploy(
                CanaryDeploy.builder()
                    .addRule(
                        CanaryDeploy.Rule.builder()
                            .serve(
                                CanaryDeploy.Rule.Serve.builder()
                                    .addRollout(
                                        CanaryDeploy.Rule.Serve.Rollout.builder()
                                            .versionId("version_id")
                                            .weight(0.0)
                                            .build()
                                    )
                                    .versionId("version_id")
                                    .build()
                            )
                            .addMatch(
                                CanaryDeploy.Rule.Match.builder()
                                    .attribute("attribute")
                                    .operator(CanaryDeploy.Rule.Match.Operator.IN)
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
            CanaryDeployCreateParams.builder()
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
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(
                    CanaryDeploy.builder()
                        .addRule(
                            CanaryDeploy.Rule.builder()
                                .serve(
                                    CanaryDeploy.Rule.Serve.builder()
                                        .addRollout(
                                            CanaryDeploy.Rule.Serve.Rollout.builder()
                                                .versionId("version_id")
                                                .weight(0.0)
                                                .build()
                                        )
                                        .versionId("version_id")
                                        .build()
                                )
                                .addMatch(
                                    CanaryDeploy.Rule.Match.builder()
                                        .attribute("attribute")
                                        .operator(CanaryDeploy.Rule.Match.Operator.IN)
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
                        CanaryDeploy.Rule.builder()
                            .serve(
                                CanaryDeploy.Rule.Serve.builder()
                                    .addRollout(
                                        CanaryDeploy.Rule.Serve.Rollout.builder()
                                            .versionId("version_id")
                                            .weight(0.0)
                                            .build()
                                    )
                                    .versionId("version_id")
                                    .build()
                            )
                            .addMatch(
                                CanaryDeploy.Rule.Match.builder()
                                    .attribute("attribute")
                                    .operator(CanaryDeploy.Rule.Match.Operator.IN)
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
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(CanaryDeploy.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CanaryDeploy.builder().build())
    }
}
