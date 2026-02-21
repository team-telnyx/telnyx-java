// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdListResponseTest {

    @Test
    fun create() {
        val alphanumericSenderIdListResponse =
            AlphanumericSenderIdListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("organization_id")
                .recordType(AlphanumericSenderIdListResponse.RecordType.ALPHANUMERIC_SENDER_ID)
                .usLongCodeFallback("+15551234567")
                .build()

        assertThat(alphanumericSenderIdListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(alphanumericSenderIdListResponse.alphanumericSenderId()).contains("MyCompany")
        assertThat(alphanumericSenderIdListResponse.messagingProfileId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(alphanumericSenderIdListResponse.organizationId()).contains("organization_id")
        assertThat(alphanumericSenderIdListResponse.recordType())
            .contains(AlphanumericSenderIdListResponse.RecordType.ALPHANUMERIC_SENDER_ID)
        assertThat(alphanumericSenderIdListResponse.usLongCodeFallback()).contains("+15551234567")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alphanumericSenderIdListResponse =
            AlphanumericSenderIdListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("organization_id")
                .recordType(AlphanumericSenderIdListResponse.RecordType.ALPHANUMERIC_SENDER_ID)
                .usLongCodeFallback("+15551234567")
                .build()

        val roundtrippedAlphanumericSenderIdListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alphanumericSenderIdListResponse),
                jacksonTypeRef<AlphanumericSenderIdListResponse>(),
            )

        assertThat(roundtrippedAlphanumericSenderIdListResponse)
            .isEqualTo(alphanumericSenderIdListResponse)
    }
}
