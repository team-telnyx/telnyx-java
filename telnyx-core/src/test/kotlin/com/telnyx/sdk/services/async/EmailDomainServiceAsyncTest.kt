// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emaildomains.DomainsTrackingSettings
import com.telnyx.sdk.models.emaildomains.EmailDmarcPolicy
import com.telnyx.sdk.models.emaildomains.EmailDomainCreateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainDeleteParams
import com.telnyx.sdk.models.emaildomains.EmailDomainUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailDomainServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainResponseFuture =
            emailDomainServiceAsync.create(
                EmailDomainCreateParams.builder()
                    .domain("example.com")
                    .dmarcPolicy(
                        EmailDmarcPolicy.builder()
                            .p(EmailDmarcPolicy.P.NONE)
                            .pct(0L)
                            .rua("rua")
                            .sp(EmailDmarcPolicy.Sp.NONE)
                            .build()
                    )
                    .inboundEnabled(true)
                    .tracking(
                        DomainsTrackingSettings.builder()
                            .clickTracking(true)
                            .openTracking(true)
                            .unsubscribeTracking(false)
                            .build()
                    )
                    .build()
            )

        val emailDomainResponse = emailDomainResponseFuture.get()
        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainResponseFuture =
            emailDomainServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailDomainResponse = emailDomainResponseFuture.get()
        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainResponseFuture =
            emailDomainServiceAsync.update(
                EmailDomainUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dmarcPolicy(
                        EmailDmarcPolicy.builder()
                            .p(EmailDmarcPolicy.P.NONE)
                            .pct(0L)
                            .rua("rua")
                            .sp(EmailDmarcPolicy.Sp.NONE)
                            .build()
                    )
                    .inboundEnabled(true)
                    .tracking(
                        DomainsTrackingSettings.builder()
                            .clickTracking(true)
                            .openTracking(false)
                            .unsubscribeTracking(true)
                            .build()
                    )
                    .build()
            )

        val emailDomainResponse = emailDomainResponseFuture.get()
        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val pageFuture = emailDomainServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainResponseFuture =
            emailDomainServiceAsync.delete(
                EmailDomainDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .force(true)
                    .build()
            )

        val emailDomainResponse = emailDomainResponseFuture.get()
        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDnsRecords() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val responseFuture =
            emailDomainServiceAsync.retrieveDnsRecords("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveHealth() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val responseFuture =
            emailDomainServiceAsync.retrieveHealth("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailDomainServiceAsync = client.emailDomains()

        val emailDomainResponseFuture =
            emailDomainServiceAsync.verify("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailDomainResponse = emailDomainResponseFuture.get()
        emailDomainResponse.validate()
    }
}
