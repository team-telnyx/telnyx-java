// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DedicatedIpCreateParamsTest {

    @Test
    fun create() {
        DedicatedIpCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .ipVersion(DedicatedIpCreateParams.IpVersion.IPV4)
            .region(DedicatedIpCreateParams.Region.EWR_NJ1)
            .build()
    }

    @Test
    fun headers() {
        val params =
            DedicatedIpCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .ipVersion(DedicatedIpCreateParams.IpVersion.IPV4)
                .region(DedicatedIpCreateParams.Region.EWR_NJ1)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            DedicatedIpCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            DedicatedIpCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .ipVersion(DedicatedIpCreateParams.IpVersion.IPV4)
                .region(DedicatedIpCreateParams.Region.EWR_NJ1)
                .build()

        val body = params._body()

        assertThat(body.ipVersion()).contains(DedicatedIpCreateParams.IpVersion.IPV4)
        assertThat(body.region()).contains(DedicatedIpCreateParams.Region.EWR_NJ1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DedicatedIpCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .build()

        val body = params._body()
    }
}
