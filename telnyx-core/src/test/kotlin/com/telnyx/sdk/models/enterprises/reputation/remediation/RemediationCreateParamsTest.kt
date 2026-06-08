// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RemediationCreateParamsTest {

    @Test
    fun create() {
        RemediationCreateParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .callPurpose("Appointment reminders for our dental clinic.")
            .contactEmail("ops@example.com")
            .addPhoneNumber("+19493253498")
            .addPhoneNumber("+12134445566")
            .webhookUrl("https://example.com/webhooks/remediation")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RemediationCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .callPurpose("Appointment reminders for our dental clinic.")
                .contactEmail("ops@example.com")
                .addPhoneNumber("+19493253498")
                .addPhoneNumber("+12134445566")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RemediationCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .callPurpose("Appointment reminders for our dental clinic.")
                .contactEmail("ops@example.com")
                .addPhoneNumber("+19493253498")
                .addPhoneNumber("+12134445566")
                .webhookUrl("https://example.com/webhooks/remediation")
                .build()

        val body = params._body()

        assertThat(body.callPurpose()).isEqualTo("Appointment reminders for our dental clinic.")
        assertThat(body.contactEmail()).isEqualTo("ops@example.com")
        assertThat(body.phoneNumbers()).containsExactly("+19493253498", "+12134445566")
        assertThat(body.webhookUrl()).contains("https://example.com/webhooks/remediation")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RemediationCreateParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .callPurpose("Appointment reminders for our dental clinic.")
                .contactEmail("ops@example.com")
                .addPhoneNumber("+19493253498")
                .addPhoneNumber("+12134445566")
                .build()

        val body = params._body()

        assertThat(body.callPurpose()).isEqualTo("Appointment reminders for our dental clinic.")
        assertThat(body.contactEmail()).isEqualTo("ops@example.com")
        assertThat(body.phoneNumbers()).containsExactly("+19493253498", "+12134445566")
    }
}
