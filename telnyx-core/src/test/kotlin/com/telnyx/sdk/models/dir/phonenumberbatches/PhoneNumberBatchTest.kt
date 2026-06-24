// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumberbatches

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.dir.Document
import com.telnyx.sdk.models.dir.phonenumbers.DirPhoneNumber
import com.telnyx.sdk.models.dir.phonenumbers.RejectionReason
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberBatchTest {

    @Test
    fun create() {
        val phoneNumberBatch =
            PhoneNumberBatch.builder()
                .batchId("ba74cfc6-d32b-467a-9b08-86fd154c23f7")
                .dirDisplayName("Acme Plumbing")
                .dirId("74e1d8ed-fbdb-45a7-bbb0-a09c1184eb3d")
                .addDocument(
                    Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                        .description("Certificate of incorporation.")
                        .build()
                )
                .enterpriseId("5c987b82-2e3b-442a-afbc-0ba3c515f561")
                .addPhoneNumber(
                    DirPhoneNumber.builder()
                        .id("1f56eb76-4078-4af7-ad4d-564b027256ee")
                        .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:11:42.850928Z"))
                        .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId(null)
                        .phoneNumber("+19493253498")
                        .rejectionReason(
                            RejectionReason.builder()
                                .code("documentation_incomplete")
                                .detail("Provided documents do not establish business identity.")
                                .message("Please re-upload a clearer scan of the certificate.")
                                .title("Documentation incomplete")
                                .build()
                        )
                        .status(DirPhoneNumberStatus.SUBMITTED)
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:12:11.123456Z"))
                        .verifiedAt(OffsetDateTime.parse("2026-04-26T18:12:11.123456Z"))
                        .build()
                )
                .status(DirPhoneNumberStatus.SUBMITTED)
                .submittedAt(OffsetDateTime.parse("2026-04-26T18:14:37.065870Z"))
                .totalCount(1L)
                .build()

        assertThat(phoneNumberBatch.batchId()).contains("ba74cfc6-d32b-467a-9b08-86fd154c23f7")
        assertThat(phoneNumberBatch.dirDisplayName()).contains("Acme Plumbing")
        assertThat(phoneNumberBatch.dirId()).contains("74e1d8ed-fbdb-45a7-bbb0-a09c1184eb3d")
        assertThat(phoneNumberBatch.documents().getOrNull())
            .containsExactly(
                Document.builder()
                    .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                    .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                    .description("Certificate of incorporation.")
                    .build()
            )
        assertThat(phoneNumberBatch.enterpriseId()).contains("5c987b82-2e3b-442a-afbc-0ba3c515f561")
        assertThat(phoneNumberBatch.phoneNumbers().getOrNull())
            .containsExactly(
                DirPhoneNumber.builder()
                    .id("1f56eb76-4078-4af7-ad4d-564b027256ee")
                    .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                    .createdAt(OffsetDateTime.parse("2026-04-26T18:11:42.850928Z"))
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .loaDocumentId(null)
                    .phoneNumber("+19493253498")
                    .rejectionReason(
                        RejectionReason.builder()
                            .code("documentation_incomplete")
                            .detail("Provided documents do not establish business identity.")
                            .message("Please re-upload a clearer scan of the certificate.")
                            .title("Documentation incomplete")
                            .build()
                    )
                    .status(DirPhoneNumberStatus.SUBMITTED)
                    .updatedAt(OffsetDateTime.parse("2026-04-26T18:12:11.123456Z"))
                    .verifiedAt(OffsetDateTime.parse("2026-04-26T18:12:11.123456Z"))
                    .build()
            )
        assertThat(phoneNumberBatch.status()).contains(DirPhoneNumberStatus.SUBMITTED)
        assertThat(phoneNumberBatch.submittedAt())
            .contains(OffsetDateTime.parse("2026-04-26T18:14:37.065870Z"))
        assertThat(phoneNumberBatch.totalCount()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberBatch =
            PhoneNumberBatch.builder()
                .batchId("ba74cfc6-d32b-467a-9b08-86fd154c23f7")
                .dirDisplayName("Acme Plumbing")
                .dirId("74e1d8ed-fbdb-45a7-bbb0-a09c1184eb3d")
                .addDocument(
                    Document.builder()
                        .documentId("2a7e8337-e803-4057-a4ae-26c40eb0bc6c")
                        .documentType(Document.DocumentType.BUSINESS_REGISTRATION)
                        .description("Certificate of incorporation.")
                        .build()
                )
                .enterpriseId("5c987b82-2e3b-442a-afbc-0ba3c515f561")
                .addPhoneNumber(
                    DirPhoneNumber.builder()
                        .id("1f56eb76-4078-4af7-ad4d-564b027256ee")
                        .batchId("0a4b1f5e-2f12-4c0c-9a98-9b3a7d8b8e62")
                        .createdAt(OffsetDateTime.parse("2026-04-26T18:11:42.850928Z"))
                        .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                        .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                        .loaDocumentId(null)
                        .phoneNumber("+19493253498")
                        .rejectionReason(
                            RejectionReason.builder()
                                .code("documentation_incomplete")
                                .detail("Provided documents do not establish business identity.")
                                .message("Please re-upload a clearer scan of the certificate.")
                                .title("Documentation incomplete")
                                .build()
                        )
                        .status(DirPhoneNumberStatus.SUBMITTED)
                        .updatedAt(OffsetDateTime.parse("2026-04-26T18:12:11.123456Z"))
                        .verifiedAt(OffsetDateTime.parse("2026-04-26T18:12:11.123456Z"))
                        .build()
                )
                .status(DirPhoneNumberStatus.SUBMITTED)
                .submittedAt(OffsetDateTime.parse("2026-04-26T18:14:37.065870Z"))
                .totalCount(1L)
                .build()

        val roundtrippedPhoneNumberBatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberBatch),
                jacksonTypeRef<PhoneNumberBatch>(),
            )

        assertThat(roundtrippedPhoneNumberBatch).isEqualTo(phoneNumberBatch)
    }
}
