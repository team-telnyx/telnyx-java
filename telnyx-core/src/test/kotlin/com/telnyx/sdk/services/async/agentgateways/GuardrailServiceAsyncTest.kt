// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailCreateParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailDeleteParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GuardrailServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val guardrailServiceAsync = client.agentGateways().guardrails()

        val agentGatewayGuardrailResponseFuture =
            guardrailServiceAsync.create(
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

        val agentGatewayGuardrailResponse = agentGatewayGuardrailResponseFuture.get()
        agentGatewayGuardrailResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val guardrailServiceAsync = client.agentGateways().guardrails()

        val agentGatewayGuardrailResponseFuture =
            guardrailServiceAsync.update(
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

        val agentGatewayGuardrailResponse = agentGatewayGuardrailResponseFuture.get()
        agentGatewayGuardrailResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val guardrailServiceAsync = client.agentGateways().guardrails()

        val guardrailsFuture = guardrailServiceAsync.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        val guardrails = guardrailsFuture.get()
        guardrails.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val guardrailServiceAsync = client.agentGateways().guardrails()

        val agentGatewayGuardrailResponseFuture =
            guardrailServiceAsync.delete(
                GuardrailDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                    .build()
            )

        val agentGatewayGuardrailResponse = agentGatewayGuardrailResponseFuture.get()
        agentGatewayGuardrailResponse.validate()
    }
}
