// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdRetrieveResponseTest {

    @Test
    fun create() {
        val alphanumericSenderIdRetrieveResponse =
            AlphanumericSenderIdRetrieveResponse.builder()
                .data(
                    AlphanumericSenderId.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .alphanumericSenderId("MyCompany")
                        .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("organization_id")
                        .recordType(AlphanumericSenderId.RecordType.ALPHANUMERIC_SENDER_ID)
                        .usLongCodeFallback("+15551234567")
                        .build()
                )
                .build()

        assertThat(alphanumericSenderIdRetrieveResponse.data())
            .contains(
                AlphanumericSenderId.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .alphanumericSenderId("MyCompany")
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("organization_id")
                    .recordType(AlphanumericSenderId.RecordType.ALPHANUMERIC_SENDER_ID)
                    .usLongCodeFallback("+15551234567")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alphanumericSenderIdRetrieveResponse =
            AlphanumericSenderIdRetrieveResponse.builder()
                .data(
                    AlphanumericSenderId.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .alphanumericSenderId("MyCompany")
                        .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .organizationId("organization_id")
                        .recordType(AlphanumericSenderId.RecordType.ALPHANUMERIC_SENDER_ID)
                        .usLongCodeFallback("+15551234567")
                        .build()
                )
                .build()

        val roundtrippedAlphanumericSenderIdRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alphanumericSenderIdRetrieveResponse),
                jacksonTypeRef<AlphanumericSenderIdRetrieveResponse>(),
            )

        assertThat(roundtrippedAlphanumericSenderIdRetrieveResponse)
            .isEqualTo(alphanumericSenderIdRetrieveResponse)
    }
}
