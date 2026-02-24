// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingFeatureSet
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingRetrieveResponseTest {

    @Test
    fun create() {
        val messagingRetrieveResponse =
            MessagingRetrieveResponse.builder()
                .data(
                    MessagingRetrieveResponse.Data.builder()
                        .id("2126210528794641864")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .features(
                            MessagingRetrieveResponse.Data.Features.builder()
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
                        .organizationId("organization_id")
                        .phoneNumber("++13127367407")
                        .recordType(MessagingRetrieveResponse.Data.RecordType.MESSAGING_SETTINGS)
                        .addTag("string")
                        .trafficType("P2P")
                        .type(MessagingRetrieveResponse.Data.Type.LONGCODE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .build()

        assertThat(messagingRetrieveResponse.data())
            .contains(
                MessagingRetrieveResponse.Data.builder()
                    .id("2126210528794641864")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .features(
                        MessagingRetrieveResponse.Data.Features.builder()
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
                    .organizationId("organization_id")
                    .phoneNumber("++13127367407")
                    .recordType(MessagingRetrieveResponse.Data.RecordType.MESSAGING_SETTINGS)
                    .addTag("string")
                    .trafficType("P2P")
                    .type(MessagingRetrieveResponse.Data.Type.LONGCODE)
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingRetrieveResponse =
            MessagingRetrieveResponse.builder()
                .data(
                    MessagingRetrieveResponse.Data.builder()
                        .id("2126210528794641864")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .features(
                            MessagingRetrieveResponse.Data.Features.builder()
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
                        .organizationId("organization_id")
                        .phoneNumber("++13127367407")
                        .recordType(MessagingRetrieveResponse.Data.RecordType.MESSAGING_SETTINGS)
                        .addTag("string")
                        .trafficType("P2P")
                        .type(MessagingRetrieveResponse.Data.Type.LONGCODE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .build()

        val roundtrippedMessagingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingRetrieveResponse),
                jacksonTypeRef<MessagingRetrieveResponse>(),
            )

        assertThat(roundtrippedMessagingRetrieveResponse).isEqualTo(messagingRetrieveResponse)
    }
}
