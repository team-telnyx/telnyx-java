// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileRetrieveMetricsResponseTest {

    @Test
    fun create() {
        val messagingProfileRetrieveMetricsResponse =
            MessagingProfileRetrieveMetricsResponse.builder()
                .data(
                    MessagingProfileRetrieveMetricsResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(messagingProfileRetrieveMetricsResponse.data())
            .contains(
                MessagingProfileRetrieveMetricsResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileRetrieveMetricsResponse =
            MessagingProfileRetrieveMetricsResponse.builder()
                .data(
                    MessagingProfileRetrieveMetricsResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedMessagingProfileRetrieveMetricsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileRetrieveMetricsResponse),
                jacksonTypeRef<MessagingProfileRetrieveMetricsResponse>(),
            )

        assertThat(roundtrippedMessagingProfileRetrieveMetricsResponse)
            .isEqualTo(messagingProfileRetrieveMetricsResponse)
    }
}
