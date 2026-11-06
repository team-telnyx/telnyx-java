// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.hostedsignups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HostedSignupRetrieveResponseTest {

    @Test
    fun create() {
        val hostedSignupRetrieveResponse =
            HostedSignupRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(hostedSignupRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hostedSignupRetrieveResponse =
            HostedSignupRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedHostedSignupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hostedSignupRetrieveResponse),
                jacksonTypeRef<HostedSignupRetrieveResponse>(),
            )

        assertThat(roundtrippedHostedSignupRetrieveResponse).isEqualTo(hostedSignupRetrieveResponse)
    }
}
