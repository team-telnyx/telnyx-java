// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberGetConversationWindowResponseTest {

    @Test
    fun create() {
        val phoneNumberGetConversationWindowResponse =
            PhoneNumberGetConversationWindowResponse.builder()
                .data(
                    PhoneNumberGetConversationWindowResponse.Data.builder()
                        .lastUserMessageAt(OffsetDateTime.parse("2026-06-29T15:53:00Z"))
                        .windowActive(true)
                        .windowExpiresAt(OffsetDateTime.parse("2026-06-30T16:00:00Z"))
                        .windowType("24h")
                        .build()
                )
                .build()

        assertThat(phoneNumberGetConversationWindowResponse.data())
            .contains(
                PhoneNumberGetConversationWindowResponse.Data.builder()
                    .lastUserMessageAt(OffsetDateTime.parse("2026-06-29T15:53:00Z"))
                    .windowActive(true)
                    .windowExpiresAt(OffsetDateTime.parse("2026-06-30T16:00:00Z"))
                    .windowType("24h")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberGetConversationWindowResponse =
            PhoneNumberGetConversationWindowResponse.builder()
                .data(
                    PhoneNumberGetConversationWindowResponse.Data.builder()
                        .lastUserMessageAt(OffsetDateTime.parse("2026-06-29T15:53:00Z"))
                        .windowActive(true)
                        .windowExpiresAt(OffsetDateTime.parse("2026-06-30T16:00:00Z"))
                        .windowType("24h")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberGetConversationWindowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberGetConversationWindowResponse),
                jacksonTypeRef<PhoneNumberGetConversationWindowResponse>(),
            )

        assertThat(roundtrippedPhoneNumberGetConversationWindowResponse)
            .isEqualTo(phoneNumberGetConversationWindowResponse)
    }
}
