// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.dir.phonenumberbatches.DirPhoneNumberStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAddResponseTest {

    @Test
    fun create() {
        val phoneNumberAddResponse =
            PhoneNumberAddResponse.builder()
                .addData(
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
                .build()

        assertThat(phoneNumberAddResponse.data())
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAddResponse =
            PhoneNumberAddResponse.builder()
                .addData(
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
                .build()

        val roundtrippedPhoneNumberAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAddResponse),
                jacksonTypeRef<PhoneNumberAddResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAddResponse).isEqualTo(phoneNumberAddResponse)
    }
}
