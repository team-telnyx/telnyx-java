// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.hostedsignups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HostedSignupListResponseTest {

    @Test
    fun create() {
        val hostedSignupListResponse =
            HostedSignupListResponse.builder()
                .id("0192345a-7b8c-7d9e-0f12-3456789abcde")
                .appId("123456789012345")
                .createdAt(OffsetDateTime.parse("2026-07-08T12:00:00Z"))
                .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                .jwt("eyJhbGciOiJSUzI1NiIs...")
                .recordType(HostedSignupListResponse.RecordType.WHATSAPP_JWT)
                .solutionId("987654321098765")
                .url("https://acct.fyi?token=eyJhbGciOiJSUzI1NiIs...")
                .build()

        assertThat(hostedSignupListResponse.id()).contains("0192345a-7b8c-7d9e-0f12-3456789abcde")
        assertThat(hostedSignupListResponse.appId()).contains("123456789012345")
        assertThat(hostedSignupListResponse.createdAt())
            .contains(OffsetDateTime.parse("2026-07-08T12:00:00Z"))
        assertThat(hostedSignupListResponse.expiresAt())
            .contains(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
        assertThat(hostedSignupListResponse.jwt()).contains("eyJhbGciOiJSUzI1NiIs...")
        assertThat(hostedSignupListResponse.recordType())
            .contains(HostedSignupListResponse.RecordType.WHATSAPP_JWT)
        assertThat(hostedSignupListResponse.solutionId()).contains("987654321098765")
        assertThat(hostedSignupListResponse.url())
            .contains("https://acct.fyi?token=eyJhbGciOiJSUzI1NiIs...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hostedSignupListResponse =
            HostedSignupListResponse.builder()
                .id("0192345a-7b8c-7d9e-0f12-3456789abcde")
                .appId("123456789012345")
                .createdAt(OffsetDateTime.parse("2026-07-08T12:00:00Z"))
                .expiresAt(OffsetDateTime.parse("2026-07-09T12:00:00Z"))
                .jwt("eyJhbGciOiJSUzI1NiIs...")
                .recordType(HostedSignupListResponse.RecordType.WHATSAPP_JWT)
                .solutionId("987654321098765")
                .url("https://acct.fyi?token=eyJhbGciOiJSUzI1NiIs...")
                .build()

        val roundtrippedHostedSignupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hostedSignupListResponse),
                jacksonTypeRef<HostedSignupListResponse>(),
            )

        assertThat(roundtrippedHostedSignupListResponse).isEqualTo(hostedSignupListResponse)
    }
}
