// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirListResponseTest {

    @Test
    fun create() {
        val dirListResponse =
            DirListResponse.builder()
                .id("16635d38-75a6-4481-82e8-69af60e05011")
                .authorizerEmail("sam@acmeplumbing.example.com")
                .authorizerName("Sam Owner")
                .addCallReason(
                    DirListResponse.CallReason.builder()
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .reason("Appointment reminders")
                        .build()
                )
                .certifyBrandIsAccurate(true)
                .certifyIpOwnership(true)
                .certifyNoShaftContent(true)
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .displayName("Acme Plumbing")
                .addDocument(
                    DirListResponse.Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(DirListResponse.Document.DocumentType.BUSINESS_REGISTRATION)
                        .description("Certificate of incorporation.")
                        .build()
                )
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRejectionReason(
                    DirListResponse.RejectionReason.builder()
                        .code("documentation_incomplete")
                        .detail("Provided documents do not establish business identity.")
                        .message("Please re-upload a clearer scan of the certificate.")
                        .title("Documentation incomplete")
                        .build()
                )
                .reselling(false)
                .status(DirListResponse.Status.DRAFT)
                .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                .build()

        assertThat(dirListResponse.id()).contains("16635d38-75a6-4481-82e8-69af60e05011")
        assertThat(dirListResponse.authorizerEmail()).contains("sam@acmeplumbing.example.com")
        assertThat(dirListResponse.authorizerName()).contains("Sam Owner")
        assertThat(dirListResponse.callReasons().getOrNull())
            .containsExactly(
                DirListResponse.CallReason.builder()
                    .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                    .reason("Appointment reminders")
                    .build()
            )
        assertThat(dirListResponse.certifyBrandIsAccurate()).contains(true)
        assertThat(dirListResponse.certifyIpOwnership()).contains(true)
        assertThat(dirListResponse.certifyNoShaftContent()).contains(true)
        assertThat(dirListResponse.createdAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
        assertThat(dirListResponse.displayName()).contains("Acme Plumbing")
        assertThat(dirListResponse.documents().getOrNull())
            .containsExactly(
                DirListResponse.Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(DirListResponse.Document.DocumentType.BUSINESS_REGISTRATION)
                    .description("Certificate of incorporation.")
                    .build()
            )
        assertThat(dirListResponse.enterpriseId()).contains("4a6192a4-573d-446d-b3ce-aff9117272a6")
        assertThat(dirListResponse.expiringAt())
            .contains(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
        assertThat(dirListResponse.logoUrl())
            .contains("https://acmeplumbing.example.com/logo-256.bmp")
        assertThat(dirListResponse.rejectedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dirListResponse.rejectionReasons().getOrNull())
            .containsExactly(
                DirListResponse.RejectionReason.builder()
                    .code("documentation_incomplete")
                    .detail("Provided documents do not establish business identity.")
                    .message("Please re-upload a clearer scan of the certificate.")
                    .title("Documentation incomplete")
                    .build()
            )
        assertThat(dirListResponse.reselling()).contains(false)
        assertThat(dirListResponse.status()).contains(DirListResponse.Status.DRAFT)
        assertThat(dirListResponse.submittedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
        assertThat(dirListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
        assertThat(dirListResponse.verifiedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dirListResponse =
            DirListResponse.builder()
                .id("16635d38-75a6-4481-82e8-69af60e05011")
                .authorizerEmail("sam@acmeplumbing.example.com")
                .authorizerName("Sam Owner")
                .addCallReason(
                    DirListResponse.CallReason.builder()
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                        .reason("Appointment reminders")
                        .build()
                )
                .certifyBrandIsAccurate(true)
                .certifyIpOwnership(true)
                .certifyNoShaftContent(true)
                .createdAt(OffsetDateTime.parse("2026-04-26T18:06:51.940749Z"))
                .displayName("Acme Plumbing")
                .addDocument(
                    DirListResponse.Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(DirListResponse.Document.DocumentType.BUSINESS_REGISTRATION)
                        .description("Certificate of incorporation.")
                        .build()
                )
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .expiringAt(OffsetDateTime.parse("2027-04-26T18:07:29.537981Z"))
                .logoUrl("https://acmeplumbing.example.com/logo-256.bmp")
                .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRejectionReason(
                    DirListResponse.RejectionReason.builder()
                        .code("documentation_incomplete")
                        .detail("Provided documents do not establish business identity.")
                        .message("Please re-upload a clearer scan of the certificate.")
                        .title("Documentation incomplete")
                        .build()
                )
                .reselling(false)
                .status(DirListResponse.Status.DRAFT)
                .submittedAt(OffsetDateTime.parse("2026-04-26T18:07:03.716411Z"))
                .updatedAt(OffsetDateTime.parse("2026-04-26T18:09:24.785211Z"))
                .verifiedAt(OffsetDateTime.parse("2026-04-26T18:07:29.537926Z"))
                .build()

        val roundtrippedDirListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirListResponse),
                jacksonTypeRef<DirListResponse>(),
            )

        assertThat(roundtrippedDirListResponse).isEqualTo(dirListResponse)
    }
}
