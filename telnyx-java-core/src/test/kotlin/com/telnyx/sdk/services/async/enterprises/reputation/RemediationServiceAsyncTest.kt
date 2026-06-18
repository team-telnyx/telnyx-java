// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationRetrieveParams
import com.telnyx.sdk.models.enterprises.reputation.remediation.RemediationSubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RemediationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val remediationServiceAsync = client.enterprises().reputation().remediation()

        val remediationFuture =
            remediationServiceAsync.retrieve(
                RemediationRetrieveParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .remediationId("b7c1f1c0-7a9d-4f0a-9d3e-2f6a1c4b8e21")
                    .build()
            )

        val remediation = remediationFuture.get()
        remediation.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val remediationServiceAsync = client.enterprises().reputation().remediation()

        val pageFuture = remediationServiceAsync.list("4a6192a4-573d-446d-b3ce-aff9117272a6")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val remediationServiceAsync = client.enterprises().reputation().remediation()

        val responseFuture =
            remediationServiceAsync.submit(
                RemediationSubmitParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .callPurpose("Appointment reminders for our dental clinic.")
                    .addPhoneNumber("+19493253498")
                    .addPhoneNumber("+12134445566")
                    .contactEmail("ops@example.com")
                    .webhookUrl("https://example.com/webhooks/remediation")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
