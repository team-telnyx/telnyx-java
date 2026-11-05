// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyListResponseTest {

    @Test
    fun create() {
        val policyListResponse =
            PolicyListResponse.builder()
                .addData(
                    AgentGatewayPolicy.builder()
                        .base("base")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .guardrails(
                            AgentGatewayPolicyGuardrails.builder()
                                .addAdd("string")
                                .addRemove("string")
                                .build()
                        )
                        .model("model")
                        .name("name")
                        .pipeline(
                            AgentGatewayPolicyPipeline.builder()
                                .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                                .addStep(
                                    AgentGatewayPolicyPipeline.Step.builder()
                                        .guardrail("guardrail")
                                        .message("message")
                                        .onError(AgentGatewayPolicyPipeline.Step.OnError.NEXT)
                                        .onFail(AgentGatewayPolicyPipeline.Step.OnFail.NEXT)
                                        .onPass(AgentGatewayPolicyPipeline.Step.OnPass.NEXT)
                                        .passData(true)
                                        .build()
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(policyListResponse.data())
            .containsExactly(
                AgentGatewayPolicy.builder()
                    .base("base")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .guardrails(
                        AgentGatewayPolicyGuardrails.builder()
                            .addAdd("string")
                            .addRemove("string")
                            .build()
                    )
                    .model("model")
                    .name("name")
                    .pipeline(
                        AgentGatewayPolicyPipeline.builder()
                            .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                            .addStep(
                                AgentGatewayPolicyPipeline.Step.builder()
                                    .guardrail("guardrail")
                                    .message("message")
                                    .onError(AgentGatewayPolicyPipeline.Step.OnError.NEXT)
                                    .onFail(AgentGatewayPolicyPipeline.Step.OnFail.NEXT)
                                    .onPass(AgentGatewayPolicyPipeline.Step.OnPass.NEXT)
                                    .passData(true)
                                    .build()
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val policyListResponse =
            PolicyListResponse.builder()
                .addData(
                    AgentGatewayPolicy.builder()
                        .base("base")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .guardrails(
                            AgentGatewayPolicyGuardrails.builder()
                                .addAdd("string")
                                .addRemove("string")
                                .build()
                        )
                        .model("model")
                        .name("name")
                        .pipeline(
                            AgentGatewayPolicyPipeline.builder()
                                .hook(AgentGatewayPolicyPipeline.Hook.BEFORE_REQUEST)
                                .addStep(
                                    AgentGatewayPolicyPipeline.Step.builder()
                                        .guardrail("guardrail")
                                        .message("message")
                                        .onError(AgentGatewayPolicyPipeline.Step.OnError.NEXT)
                                        .onFail(AgentGatewayPolicyPipeline.Step.OnFail.NEXT)
                                        .onPass(AgentGatewayPolicyPipeline.Step.OnPass.NEXT)
                                        .passData(true)
                                        .build()
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPolicyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(policyListResponse),
                jacksonTypeRef<PolicyListResponse>(),
            )

        assertThat(roundtrippedPolicyListResponse).isEqualTo(policyListResponse)
    }
}
