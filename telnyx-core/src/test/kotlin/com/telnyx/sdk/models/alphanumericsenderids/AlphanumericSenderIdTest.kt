// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdTest {

    @Test
    fun create() {
        val alphanumericSenderId =
            AlphanumericSenderId.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("organization_id")
                .recordType(AlphanumericSenderId.RecordType.ALPHANUMERIC_SENDER_ID)
                .usLongCodeFallback("+15551234567")
                .build()

        assertThat(alphanumericSenderId.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(alphanumericSenderId.alphanumericSenderId()).contains("MyCompany")
        assertThat(alphanumericSenderId.messagingProfileId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(alphanumericSenderId.organizationId()).contains("organization_id")
        assertThat(alphanumericSenderId.recordType())
            .contains(AlphanumericSenderId.RecordType.ALPHANUMERIC_SENDER_ID)
        assertThat(alphanumericSenderId.usLongCodeFallback()).contains("+15551234567")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val alphanumericSenderId =
            AlphanumericSenderId.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("organization_id")
                .recordType(AlphanumericSenderId.RecordType.ALPHANUMERIC_SENDER_ID)
                .usLongCodeFallback("+15551234567")
                .build()

        val roundtrippedAlphanumericSenderId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(alphanumericSenderId),
                jacksonTypeRef<AlphanumericSenderId>(),
            )

        assertThat(roundtrippedAlphanumericSenderId).isEqualTo(alphanumericSenderId)
    }
}
