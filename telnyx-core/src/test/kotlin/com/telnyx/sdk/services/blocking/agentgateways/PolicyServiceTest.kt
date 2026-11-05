// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyGuardrails
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyPipeline
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyStep
import com.telnyx.sdk.models.agentgateways.policies.PolicyCreateParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyDeleteParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyRetrieveParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.agentGateways().policies()

        val agentGatewayPolicyResponse =
            policyService.create(
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
            )

        agentGatewayPolicyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.agentGateways().policies()

        val agentGatewayPolicyResponse =
            policyService.retrieve(
                PolicyRetrieveParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .name("strict")
                    .build()
            )

        agentGatewayPolicyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.agentGateways().policies()

        val agentGatewayPolicyResponse =
            policyService.update(
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
            )

        agentGatewayPolicyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.agentGateways().policies()

        val policies = policyService.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        policies.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyService = client.agentGateways().policies()

        val agentGatewayPolicyResponse =
            policyService.delete(
                PolicyDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .name("strict")
                    .build()
            )

        agentGatewayPolicyResponse.validate()
    }
}
