// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyGuardrails
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyPipeline
import com.telnyx.sdk.models.agentgateways.policies.PolicyCreateParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyDeleteParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyRetrieveParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyServiceAsync = client.agentGateways().policies()

        val agentGatewayPolicyResponseFuture =
            policyServiceAsync.create(
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
                    .build()
            )

        val agentGatewayPolicyResponse = agentGatewayPolicyResponseFuture.get()
        agentGatewayPolicyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyServiceAsync = client.agentGateways().policies()

        val agentGatewayPolicyResponseFuture =
            policyServiceAsync.retrieve(
                PolicyRetrieveParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .name("strict")
                    .build()
            )

        val agentGatewayPolicyResponse = agentGatewayPolicyResponseFuture.get()
        agentGatewayPolicyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyServiceAsync = client.agentGateways().policies()

        val agentGatewayPolicyResponseFuture =
            policyServiceAsync.update(
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
                    .build()
            )

        val agentGatewayPolicyResponse = agentGatewayPolicyResponseFuture.get()
        agentGatewayPolicyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyServiceAsync = client.agentGateways().policies()

        val policiesFuture = policyServiceAsync.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        val policies = policiesFuture.get()
        policies.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyServiceAsync = client.agentGateways().policies()

        val agentGatewayPolicyResponseFuture =
            policyServiceAsync.delete(
                PolicyDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .name("strict")
                    .build()
            )

        val agentGatewayPolicyResponse = agentGatewayPolicyResponseFuture.get()
        agentGatewayPolicyResponse.validate()
    }
}
