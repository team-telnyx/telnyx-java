// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.userdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserDataRetrieveResponseTest {

    @Test
    fun create() {
        val userDataRetrieveResponse =
            UserDataRetrieveResponse.builder()
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

        assertThat(userDataRetrieveResponse.data())
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
        val userDataRetrieveResponse =
            UserDataRetrieveResponse.builder()
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

        val roundtrippedUserDataRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userDataRetrieveResponse),
                jacksonTypeRef<UserDataRetrieveResponse>(),
            )

        assertThat(roundtrippedUserDataRetrieveResponse).isEqualTo(userDataRetrieveResponse)
    }
}
