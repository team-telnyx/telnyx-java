// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.hostedsignups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappHostedSignupTest {

    @Test
    fun create() {
        val whatsappHostedSignup =
            WhatsappHostedSignup.builder()
                .id("0192345a-7b8c-7d9e-0f12-3456789abcde")
                .appId("123456789012345")
                .createdAt(OffsetDateTime.parse("2026-07-08T12:00:00Z"))
                .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                .jwt("eyJhbGciOiJSUzI1NiIs...")
                .recordType(WhatsappHostedSignup.RecordType.WHATSAPP_JWT)
                .solutionId("987654321098765")
                .url("https://acct.fyi?token=eyJhbGciOiJSUzI1NiIs...")
                .build()

        assertThat(whatsappHostedSignup.id()).contains("0192345a-7b8c-7d9e-0f12-3456789abcde")
        assertThat(whatsappHostedSignup.appId()).contains("123456789012345")
        assertThat(whatsappHostedSignup.createdAt())
            .contains(OffsetDateTime.parse("2026-07-08T12:00:00Z"))
        assertThat(whatsappHostedSignup.expiresAt())
            .contains(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
        assertThat(whatsappHostedSignup.jwt()).contains("eyJhbGciOiJSUzI1NiIs...")
        assertThat(whatsappHostedSignup.recordType())
            .contains(WhatsappHostedSignup.RecordType.WHATSAPP_JWT)
        assertThat(whatsappHostedSignup.solutionId()).contains("987654321098765")
        assertThat(whatsappHostedSignup.url())
            .contains("https://acct.fyi?token=eyJhbGciOiJSUzI1NiIs...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappHostedSignup =
            WhatsappHostedSignup.builder()
                .id("0192345a-7b8c-7d9e-0f12-3456789abcde")
                .appId("123456789012345")
                .createdAt(OffsetDateTime.parse("2026-07-08T12:00:00Z"))
                .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                .jwt("eyJhbGciOiJSUzI1NiIs...")
                .recordType(WhatsappHostedSignup.RecordType.WHATSAPP_JWT)
                .solutionId("987654321098765")
                .url("https://acct.fyi?token=eyJhbGciOiJSUzI1NiIs...")
                .build()

        val roundtrippedWhatsappHostedSignup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappHostedSignup),
                jacksonTypeRef<WhatsappHostedSignup>(),
            )

        assertThat(roundtrippedWhatsappHostedSignup).isEqualTo(whatsappHostedSignup)
    }
}
