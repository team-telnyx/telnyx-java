// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployCreateParamsTest {

    @Test
    fun create() {
        CanaryDeployCreateParams.builder()
            .assistantId("assistant_id")
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .canaryDeploy(
                CanaryDeploy.builder()
                    .addRule(
                        RuleInput.builder()
                            .serve(
                                Serve.builder()
                                    .addRollout(
                                        RolloutSlot.builder()
                                            .versionId("Version Id")
                                            .weight(0.0)
                                            .build()
                                    )
                                    .versionId("Version Id")
                                    .build()
                            )
                            .addMatch(
                                Clause.builder()
                                    .attribute("Attribute")
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
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(CanaryDeploy.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .canaryDeploy(
                    CanaryDeploy.builder()
                        .addRule(
                            RuleInput.builder()
                                .serve(
                                    Serve.builder()
                                        .addRollout(
                                            RolloutSlot.builder()
                                                .versionId("Version Id")
                                                .weight(0.0)
                                                .build()
                                        )
                                        .versionId("Version Id")
                                        .build()
                                )
                                .addMatch(
                                    Clause.builder()
                                        .attribute("Attribute")
                                        .operator(Clause.Operator.IN)
                                        .addValue("string")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(CanaryDeploy.builder().build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .canaryDeploy(
                    CanaryDeploy.builder()
                        .addRule(
                            RuleInput.builder()
                                .serve(
                                    Serve.builder()
                                        .addRollout(
                                            RolloutSlot.builder()
                                                .versionId("Version Id")
                                                .weight(0.0)
                                                .build()
                                        )
                                        .versionId("Version Id")
                                        .build()
                                )
                                .addMatch(
                                    Clause.builder()
                                        .attribute("Attribute")
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
                                            .versionId("Version Id")
                                            .weight(0.0)
                                            .build()
                                    )
                                    .versionId("Version Id")
                                    .build()
                            )
                            .addMatch(
                                Clause.builder()
                                    .attribute("Attribute")
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
            CanaryDeployCreateParams.builder()
                .assistantId("assistant_id")
                .canaryDeploy(CanaryDeploy.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CanaryDeploy.builder().build())
    }
}
