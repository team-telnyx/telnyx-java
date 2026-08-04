// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.domain()).isEqualTo("example.com")
        assertThat(body.dmarcPolicy())
            .contains(
                EmailDmarcPolicy.builder()
                    .p(EmailDmarcPolicy.P.NONE)
                    .pct(0L)
                    .rua("rua")
                    .sp(EmailDmarcPolicy.Sp.NONE)
                    .build()
            )
        assertThat(body.inboundEnabled()).contains(true)
        assertThat(body.tracking())
            .contains(
                DomainsTrackingSettings.builder()
                    .clickTracking(true)
                    .openTracking(true)
                    .unsubscribeTracking(false)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailDomainCreateParams.builder().domain("example.com").build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("example.com")
    }
}
