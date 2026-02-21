// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdCreateResponseTest {

    @Test
    fun create() {
        val alphanumericSenderIdCreateResponse =
            AlphanumericSenderIdCreateResponse.builder()
                .data(
                    AlphanumericSenderIdCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .alphanumericSenderId("MyCompany")
                        .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("organization_id")
                        .recordType(
                            AlphanumericSenderIdCreateResponse.Data.RecordType
                                .ALPHANUMERIC_SENDER_ID
                        )
                        .usLongCodeFallback("+15551234567")
                        .build()
                )
                .build()

        assertThat(alphanumericSenderIdCreateResponse.data())
            .contains(
                AlphanumericSenderIdCreateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .alphanumericSenderId("MyCompany")
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("organization_id")
                    .recordType(
                        AlphanumericSenderIdCreateResponse.Data.RecordType.ALPHANUMERIC_SENDER_ID
                    )
                    .usLongCodeFallback("+15551234567")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alphanumericSenderIdCreateResponse =
            AlphanumericSenderIdCreateResponse.builder()
                .data(
                    AlphanumericSenderIdCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .alphanumericSenderId("MyCompany")
                        .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("organization_id")
                        .recordType(
                            AlphanumericSenderIdCreateResponse.Data.RecordType
                                .ALPHANUMERIC_SENDER_ID
                        )
                        .usLongCodeFallback("+15551234567")
                        .build()
                )
                .build()

        val roundtrippedAlphanumericSenderIdCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alphanumericSenderIdCreateResponse),
                jacksonTypeRef<AlphanumericSenderIdCreateResponse>(),
            )

        assertThat(roundtrippedAlphanumericSenderIdCreateResponse)
            .isEqualTo(alphanumericSenderIdCreateResponse)
    }
}
