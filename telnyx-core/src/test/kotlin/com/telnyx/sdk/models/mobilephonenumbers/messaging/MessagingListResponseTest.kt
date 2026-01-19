// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingFeatureSet
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingListResponseTest {

    @Test
    fun create() {
        val messagingListResponse =
            MessagingListResponse.builder()
                .id("2126210528794641864")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .features(
                    MessagingListResponse.Features.builder()
                        .sms(
                            MessagingFeatureSet.builder()
                                .domesticTwoWay(true)
                                .internationalInbound(true)
                                .internationalOutbound(true)
                                .build()
                        )
                        .build()
                )
                .messagingProduct("P2P")
                .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .phoneNumber("++13127367407")
                .recordType(MessagingListResponse.RecordType.MESSAGING_SETTINGS)
                .trafficType("P2P")
                .type(MessagingListResponse.Type.LONGCODE)
                .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .build()

        assertThat(messagingListResponse.id()).contains("2126210528794641864")
        assertThat(messagingListResponse.countryCode()).contains("US")
        assertThat(messagingListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingListResponse.features())
            .contains(
                MessagingListResponse.Features.builder()
                    .sms(
                        MessagingFeatureSet.builder()
                            .domesticTwoWay(true)
                            .internationalInbound(true)
                            .internationalOutbound(true)
                            .build()
                    )
                    .build()
            )
        assertThat(messagingListResponse.messagingProduct()).contains("P2P")
        assertThat(messagingListResponse.messagingProfileId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(messagingListResponse.phoneNumber()).contains("++13127367407")
        assertThat(messagingListResponse.recordType())
            .contains(MessagingListResponse.RecordType.MESSAGING_SETTINGS)
        assertThat(messagingListResponse.trafficType()).contains("P2P")
        assertThat(messagingListResponse.type()).contains(MessagingListResponse.Type.LONGCODE)
        assertThat(messagingListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingListResponse =
            MessagingListResponse.builder()
                .id("2126210528794641864")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .features(
                    MessagingListResponse.Features.builder()
                        .sms(
                            MessagingFeatureSet.builder()
                                .domesticTwoWay(true)
                                .internationalInbound(true)
                                .internationalOutbound(true)
                                .build()
                        )
                        .build()
                )
                .messagingProduct("P2P")
                .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .phoneNumber("++13127367407")
                .recordType(MessagingListResponse.RecordType.MESSAGING_SETTINGS)
                .trafficType("P2P")
                .type(MessagingListResponse.Type.LONGCODE)
                .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .build()

        val roundtrippedMessagingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingListResponse),
                jacksonTypeRef<MessagingListResponse>(),
            )

        assertThat(roundtrippedMessagingListResponse).isEqualTo(messagingListResponse)
    }
}
