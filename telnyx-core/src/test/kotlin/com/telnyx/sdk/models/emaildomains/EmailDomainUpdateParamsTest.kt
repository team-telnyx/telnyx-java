// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDomainUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            EmailDomainUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

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
                    .openTracking(false)
                    .unsubscribeTracking(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailDomainUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
