// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.verificationcodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationCodeVerifyResponseTest {

    @Test
    fun create() {
        val verificationCodeVerifyResponse =
            VerificationCodeVerifyResponse.builder()
                .addData(
                    VerificationCodeVerifyResponse.Data.builder()
                        .id("52090326-6533-4421-bcf4-bd0117cf3954")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000001")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(true)
                        .build()
                )
                .addData(
                    VerificationCodeVerifyResponse.Data.builder()
                        .id("cf076b8e-645b-4040-8209-543c5909775f")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000002")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(false)
                        .build()
                )
                .build()

        assertThat(verificationCodeVerifyResponse.data().getOrNull())
            .containsExactly(
                VerificationCodeVerifyResponse.Data.builder()
                    .id("52090326-6533-4421-bcf4-bd0117cf3954")
                    .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .phoneNumber("+61424000001")
                    .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                    .recordType("porting_verification_code")
                    .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .verified(true)
                    .build(),
                VerificationCodeVerifyResponse.Data.builder()
                    .id("cf076b8e-645b-4040-8209-543c5909775f")
                    .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .phoneNumber("+61424000002")
                    .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                    .recordType("porting_verification_code")
                    .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .verified(false)
                    .build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationCodeVerifyResponse =
            VerificationCodeVerifyResponse.builder()
                .addData(
                    VerificationCodeVerifyResponse.Data.builder()
                        .id("52090326-6533-4421-bcf4-bd0117cf3954")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000001")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(true)
                        .build()
                )
                .addData(
                    VerificationCodeVerifyResponse.Data.builder()
                        .id("cf076b8e-645b-4040-8209-543c5909775f")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000002")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(false)
                        .build()
                )
                .build()

        val roundtrippedVerificationCodeVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationCodeVerifyResponse),
                jacksonTypeRef<VerificationCodeVerifyResponse>(),
            )

        assertThat(roundtrippedVerificationCodeVerifyResponse)
            .isEqualTo(verificationCodeVerifyResponse)
    }
}
