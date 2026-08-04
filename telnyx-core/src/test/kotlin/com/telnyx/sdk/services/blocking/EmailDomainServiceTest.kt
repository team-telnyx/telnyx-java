// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emaildomains.DomainsTrackingSettings
import com.telnyx.sdk.models.emaildomains.EmailDmarcPolicy
import com.telnyx.sdk.models.emaildomains.EmailDomainCreateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainDeleteParams
import com.telnyx.sdk.models.emaildomains.EmailDomainUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailDomainServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomainResponse =
            emailDomainService.create(
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

        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomainResponse =
            emailDomainService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomainResponse =
            emailDomainService.update(
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

        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val page = emailDomainService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomainResponse =
            emailDomainService.delete(
                EmailDomainDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .force(true)
                    .build()
            )

        emailDomainResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDnsRecords() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val response = emailDomainService.retrieveDnsRecords("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveHealth() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val response = emailDomainService.retrieveHealth("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailDomainService = client.emailDomains()

        val emailDomainResponse = emailDomainService.verify("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailDomainResponse.validate()
    }
}
