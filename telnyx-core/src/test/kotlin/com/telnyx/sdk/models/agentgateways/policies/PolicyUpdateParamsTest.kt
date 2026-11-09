// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyUpdateParamsTest {

    @Test
    fun create() {
        PolicyUpdateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .name("strict")
            .base("base")
            .description("Baseline plus a word check")
            .guardrails(
                AgentGatewayPolicyGuardrails.builder().addAdd("string").addRemove("string").build()
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
            PolicyUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("strict")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("strict")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PolicyUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("strict")
                .base("base")
                .description("Baseline plus a word check")
                .guardrails(
                    AgentGatewayPolicyGuardrails.builder()
                        .addAdd("string")
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

        assertThat(body.base()).contains("base")
        assertThat(body.description()).contains("Baseline plus a word check")
        assertThat(body.guardrails())
            .contains(
                AgentGatewayPolicyGuardrails.builder().addAdd("string").addRemove("string").build()
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
            PolicyUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("strict")
                .build()

        val body = params._body()
    }
}
