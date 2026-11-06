// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyCreateParamsTest {

    @Test
    fun create() {
        PolicyCreateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .name("baseline")
            .base("base")
            .description("Mask personal data")
            .guardrails(
                AgentGatewayPolicyGuardrails.builder()
                    .addAdd("mask-pii")
                    .addRemove("string")
                    .build()
            )
            .model("model")
            .pipeline(
                AgentGatewayPolicyPipeline.builder()
                    .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                    .addStep(
                        AgentGatewayPolicyStep.builder()
                            .guardrail("guardrail")
                            .message("message")
                            .onError(AgentGatewayPolicyStep.OnError.NEXT)
                            .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                            .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                            .passData(true)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PolicyCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("baseline")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PolicyCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("baseline")
                .base("base")
                .description("Mask personal data")
                .guardrails(
                    AgentGatewayPolicyGuardrails.builder()
                        .addAdd("mask-pii")
                        .addRemove("string")
                        .build()
                )
                .model("model")
                .pipeline(
                    AgentGatewayPolicyPipeline.builder()
                        .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                        .addStep(
                            AgentGatewayPolicyStep.builder()
                                .guardrail("guardrail")
                                .message("message")
                                .onError(AgentGatewayPolicyStep.OnError.NEXT)
                                .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                                .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                                .passData(true)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("baseline")
        assertThat(body.base()).contains("base")
        assertThat(body.description()).contains("Mask personal data")
        assertThat(body.guardrails())
            .contains(
                AgentGatewayPolicyGuardrails.builder()
                    .addAdd("mask-pii")
                    .addRemove("string")
                    .build()
            )
        assertThat(body.model()).contains("model")
        assertThat(body.pipeline())
            .contains(
                AgentGatewayPolicyPipeline.builder()
                    .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                    .addStep(
                        AgentGatewayPolicyStep.builder()
                            .guardrail("guardrail")
                            .message("message")
                            .onError(AgentGatewayPolicyStep.OnError.NEXT)
                            .onFail(AgentGatewayPolicyStep.OnFail.NEXT)
                            .onPass(AgentGatewayPolicyStep.OnPass.NEXT)
                            .passData(true)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PolicyCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("baseline")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("baseline")
    }
}
