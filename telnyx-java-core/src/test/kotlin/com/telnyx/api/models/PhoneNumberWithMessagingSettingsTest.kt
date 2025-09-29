// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberWithMessagingSettingsTest {

    @Test
    fun create() {
        val phoneNumberWithMessagingSettings =
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

        assertThat(phoneNumberWithMessagingSettings.id()).contains("1293384261075731499")
        assertThat(phoneNumberWithMessagingSettings.countryCode()).contains("US")
        assertThat(phoneNumberWithMessagingSettings.createdAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(phoneNumberWithMessagingSettings.eligibleMessagingProducts().getOrNull())
            .containsExactly("A2P")
        assertThat(phoneNumberWithMessagingSettings.features())
            .contains(
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
        assertThat(phoneNumberWithMessagingSettings.health())
            .contains(
                NumberHealthMetrics.builder()
                    .inboundOutboundRatio(0.43f)
                    .messageCount(122L)
                    .spamRatio(0.06f)
                    .successRatio(0.94f)
                    .build()
            )
        assertThat(phoneNumberWithMessagingSettings.messagingProduct()).contains("A2P")
        assertThat(phoneNumberWithMessagingSettings.messagingProfileId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(phoneNumberWithMessagingSettings.phoneNumber()).contains("+18005550001")
        assertThat(phoneNumberWithMessagingSettings.recordType())
            .contains(PhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
        assertThat(phoneNumberWithMessagingSettings.trafficType()).contains("A2P")
        assertThat(phoneNumberWithMessagingSettings.type())
            .contains(PhoneNumberWithMessagingSettings.Type.TOLL_FREE)
        assertThat(phoneNumberWithMessagingSettings.updatedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberWithMessagingSettings =
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

        val roundtrippedPhoneNumberWithMessagingSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberWithMessagingSettings),
                jacksonTypeRef<PhoneNumberWithMessagingSettings>(),
            )

        assertThat(roundtrippedPhoneNumberWithMessagingSettings)
            .isEqualTo(phoneNumberWithMessagingSettings)
    }
}
