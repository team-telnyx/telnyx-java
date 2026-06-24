// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.userdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDataUpdateResponseTest {

    @Test
    fun create() {
        val userDataUpdateResponse =
            UserDataUpdateResponse.builder()
                .data(
                    WhatsappUserData.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType("whatsapp_user_data")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookFailoverUrl("webhook_failover_url")
                        .webhookUrl("webhook_url")
                        .build()
                )
                .build()

        assertThat(userDataUpdateResponse.data())
            .contains(
                WhatsappUserData.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType("whatsapp_user_data")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .webhookFailoverUrl("webhook_failover_url")
                    .webhookUrl("webhook_url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userDataUpdateResponse =
            UserDataUpdateResponse.builder()
                .data(
                    WhatsappUserData.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType("whatsapp_user_data")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .webhookFailoverUrl("webhook_failover_url")
                        .webhookUrl("webhook_url")
                        .build()
                )
                .build()

        val roundtrippedUserDataUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userDataUpdateResponse),
                jacksonTypeRef<UserDataUpdateResponse>(),
            )

        assertThat(roundtrippedUserDataUpdateResponse).isEqualTo(userDataUpdateResponse)
    }
}
