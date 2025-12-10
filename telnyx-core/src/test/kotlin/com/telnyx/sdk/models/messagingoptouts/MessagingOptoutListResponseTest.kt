// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingoptouts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingOptoutListResponseTest {

    @Test
    fun create() {
        val messagingOptoutListResponse =
            MessagingOptoutListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .keyword("STOP")
                .messagingProfileId("messaging_profile_id")
                .to("+E.164")
                .build()

        assertThat(messagingOptoutListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(messagingOptoutListResponse.from()).contains("from")
        assertThat(messagingOptoutListResponse.keyword()).contains("STOP")
        assertThat(messagingOptoutListResponse.messagingProfileId())
            .contains("messaging_profile_id")
        assertThat(messagingOptoutListResponse.to()).contains("+E.164")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingOptoutListResponse =
            MessagingOptoutListResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .keyword("STOP")
                .messagingProfileId("messaging_profile_id")
                .to("+E.164")
                .build()

        val roundtrippedMessagingOptoutListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingOptoutListResponse),
                jacksonTypeRef<MessagingOptoutListResponse>(),
            )

        assertThat(roundtrippedMessagingOptoutListResponse).isEqualTo(messagingOptoutListResponse)
    }
}
