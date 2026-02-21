// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileListAlphanumericSenderIdsResponseTest {

    @Test
    fun create() {
        val messagingProfileListAlphanumericSenderIdsResponse =
            MessagingProfileListAlphanumericSenderIdsResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("organization_id")
                .recordType(
                    MessagingProfileListAlphanumericSenderIdsResponse.RecordType
                        .ALPHANUMERIC_SENDER_ID
                )
                .usLongCodeFallback("+15551234567")
                .build()

        assertThat(messagingProfileListAlphanumericSenderIdsResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(messagingProfileListAlphanumericSenderIdsResponse.alphanumericSenderId())
            .contains("MyCompany")
        assertThat(messagingProfileListAlphanumericSenderIdsResponse.messagingProfileId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(messagingProfileListAlphanumericSenderIdsResponse.organizationId())
            .contains("organization_id")
        assertThat(messagingProfileListAlphanumericSenderIdsResponse.recordType())
            .contains(
                MessagingProfileListAlphanumericSenderIdsResponse.RecordType.ALPHANUMERIC_SENDER_ID
            )
        assertThat(messagingProfileListAlphanumericSenderIdsResponse.usLongCodeFallback())
            .contains("+15551234567")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileListAlphanumericSenderIdsResponse =
            MessagingProfileListAlphanumericSenderIdsResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("organization_id")
                .recordType(
                    MessagingProfileListAlphanumericSenderIdsResponse.RecordType
                        .ALPHANUMERIC_SENDER_ID
                )
                .usLongCodeFallback("+15551234567")
                .build()

        val roundtrippedMessagingProfileListAlphanumericSenderIdsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileListAlphanumericSenderIdsResponse),
                jacksonTypeRef<MessagingProfileListAlphanumericSenderIdsResponse>(),
            )

        assertThat(roundtrippedMessagingProfileListAlphanumericSenderIdsResponse)
            .isEqualTo(messagingProfileListAlphanumericSenderIdsResponse)
    }
}
