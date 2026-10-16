// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.hostedsignups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HostedSignupListPageResponseTest {

    @Test
    fun create() {
        val hostedSignupListPageResponse =
            HostedSignupListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(hostedSignupListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(hostedSignupListPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hostedSignupListPageResponse =
            HostedSignupListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedHostedSignupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hostedSignupListPageResponse),
                jacksonTypeRef<HostedSignupListPageResponse>(),
            )

        assertThat(roundtrippedHostedSignupListPageResponse).isEqualTo(hostedSignupListPageResponse)
    }
}
