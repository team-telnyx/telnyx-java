// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.MessagingFeatureSet
import com.telnyx.api.models.NumberHealthMetrics
import com.telnyx.api.models.PhoneNumberWithMessagingSettings
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingUpdateResponseTest {

    @Test
    fun create() {
        val messagingUpdateResponse =
            MessagingUpdateResponse.builder()
                .data(
                    PhoneNumberWithMessagingSettings.builder()
                        .id("1293384261075731499")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .addEligibleMessagingProduct("A2P")
                        .features(
                            PhoneNumberWithMessagingSettings.Features.builder()
                                .mms(
                                    MessagingFeatureSet.builder()
                                        .domesticTwoWay(true)
                                        .internationalInbound(false)
                                        .internationalOutbound(true)
                                        .build()
                                )
                                .sms(
                                    MessagingFeatureSet.builder()
                                        .domesticTwoWay(true)
                                        .internationalInbound(true)
                                        .internationalOutbound(true)
                                        .build()
                                )
                                .build()
                        )
                        .health(
                            NumberHealthMetrics.builder()
                                .inboundOutboundRatio(0.43f)
                                .messageCount(122L)
                                .spamRatio(0.06f)
                                .successRatio(0.94f)
                                .build()
                        )
                        .messagingProduct("A2P")
                        .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .phoneNumber("+18005550001")
                        .recordType(PhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
                        .trafficType("A2P")
                        .type(PhoneNumberWithMessagingSettings.Type.TOLL_FREE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .build()

        assertThat(messagingUpdateResponse.data())
            .contains(
                PhoneNumberWithMessagingSettings.builder()
                    .id("1293384261075731499")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .addEligibleMessagingProduct("A2P")
                    .features(
                        PhoneNumberWithMessagingSettings.Features.builder()
                            .mms(
                                MessagingFeatureSet.builder()
                                    .domesticTwoWay(true)
                                    .internationalInbound(false)
                                    .internationalOutbound(true)
                                    .build()
                            )
                            .sms(
                                MessagingFeatureSet.builder()
                                    .domesticTwoWay(true)
                                    .internationalInbound(true)
                                    .internationalOutbound(true)
                                    .build()
                            )
                            .build()
                    )
                    .health(
                        NumberHealthMetrics.builder()
                            .inboundOutboundRatio(0.43f)
                            .messageCount(122L)
                            .spamRatio(0.06f)
                            .successRatio(0.94f)
                            .build()
                    )
                    .messagingProduct("A2P")
                    .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .phoneNumber("+18005550001")
                    .recordType(PhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
                    .trafficType("A2P")
                    .type(PhoneNumberWithMessagingSettings.Type.TOLL_FREE)
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingUpdateResponse =
            MessagingUpdateResponse.builder()
                .data(
                    PhoneNumberWithMessagingSettings.builder()
                        .id("1293384261075731499")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .addEligibleMessagingProduct("A2P")
                        .features(
                            PhoneNumberWithMessagingSettings.Features.builder()
                                .mms(
                                    MessagingFeatureSet.builder()
                                        .domesticTwoWay(true)
                                        .internationalInbound(false)
                                        .internationalOutbound(true)
                                        .build()
                                )
                                .sms(
                                    MessagingFeatureSet.builder()
                                        .domesticTwoWay(true)
                                        .internationalInbound(true)
                                        .internationalOutbound(true)
                                        .build()
                                )
                                .build()
                        )
                        .health(
                            NumberHealthMetrics.builder()
                                .inboundOutboundRatio(0.43f)
                                .messageCount(122L)
                                .spamRatio(0.06f)
                                .successRatio(0.94f)
                                .build()
                        )
                        .messagingProduct("A2P")
                        .messagingProfileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .phoneNumber("+18005550001")
                        .recordType(PhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
                        .trafficType("A2P")
                        .type(PhoneNumberWithMessagingSettings.Type.TOLL_FREE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .build()

        val roundtrippedMessagingUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingUpdateResponse),
                jacksonTypeRef<MessagingUpdateResponse>(),
            )

        assertThat(roundtrippedMessagingUpdateResponse).isEqualTo(messagingUpdateResponse)
    }
}
