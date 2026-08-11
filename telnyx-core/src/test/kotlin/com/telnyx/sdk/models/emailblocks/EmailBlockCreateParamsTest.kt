// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockCreateParamsTest {

    @Test
    fun create() {
        EmailBlockCreateParams.builder()
            .to("spammer@bad.tld")
            .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
            .from("from")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailBlockCreateParams.builder()
                .to("spammer@bad.tld")
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                .from("from")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("spammer@bad.tld")
        assertThat(body.domainId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
        assertThat(body.from()).contains("from")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailBlockCreateParams.builder().to("spammer@bad.tld").build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("spammer@bad.tld")
    }
}
