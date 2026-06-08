// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RemediationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val remediationService = client.enterprises().reputation().remediation()

        val remediation =
            remediationService.create(
                RemediationCreateParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .callPurpose("Appointment reminders for our dental clinic.")
                    .contactEmail("ops@example.com")
                    .addPhoneNumber("+19493253498")
                    .addPhoneNumber("+12134445566")
                    .webhookUrl("https://example.com/webhooks/remediation")
                    .build()
            )

        remediation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val remediationService = client.enterprises().reputation().remediation()

        val remediation =
            remediationService.retrieve(
                RemediationRetrieveParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .remediationId("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                    .build()
            )

        remediation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val remediationService = client.enterprises().reputation().remediation()

        val page = remediationService.list("4a6192a4-573d-446d-b3ce-aff9117272a6")

        page.response().validate()
    }
}
