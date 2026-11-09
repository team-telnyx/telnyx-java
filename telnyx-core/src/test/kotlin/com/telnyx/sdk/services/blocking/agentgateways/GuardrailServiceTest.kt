// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailCreateParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailDeleteParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GuardrailServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val guardrailService = client.agentGateways().guardrails()

        val agentGatewayGuardrailResponse =
            guardrailService.create(
                GuardrailCreateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .addMode(GuardrailCreateParams.Mode.BEFORE_REQUEST)
                    .name("mask-pii")
                    .type(GuardrailCreateParams.Type.CONTENT_FILTER)
                    .alwaysOn(true)
                    .settings(
                        GuardrailCreateParams.Settings.builder()
                            .putAdditionalProperty("patterns", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        agentGatewayGuardrailResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val guardrailService = client.agentGateways().guardrails()

        val agentGatewayGuardrailResponse =
            guardrailService.update(
                GuardrailUpdateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                    .alwaysOn(true)
                    .addMode(GuardrailUpdateParams.Mode.BEFORE_REQUEST)
                    .name("name")
                    .settings(
                        GuardrailUpdateParams.Settings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        agentGatewayGuardrailResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val guardrailService = client.agentGateways().guardrails()

        val guardrails = guardrailService.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        guardrails.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val guardrailService = client.agentGateways().guardrails()

        val agentGatewayGuardrailResponse =
            guardrailService.delete(
                GuardrailDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                    .build()
            )

        agentGatewayGuardrailResponse.validate()
    }
}
