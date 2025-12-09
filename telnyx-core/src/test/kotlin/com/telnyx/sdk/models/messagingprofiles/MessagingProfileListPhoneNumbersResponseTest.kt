// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingFeatureSet
import com.telnyx.sdk.models.NumberHealthMetrics
import com.telnyx.sdk.models.PhoneNumberWithMessagingSettings
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileListPhoneNumbersResponseTest {

    @Test
    fun create() {
        val messagingProfileListPhoneNumbersResponse =
            MessagingProfileListPhoneNumbersResponse.builder()
                .addData(
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
                        .type(PhoneNumberWithMessagingSettings.Type.TOLLFREE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .meta(
                    MessagingProfileListPhoneNumbersResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingProfileListPhoneNumbersResponse.data().getOrNull())
            .containsExactly(
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
                    .type(PhoneNumberWithMessagingSettings.Type.TOLLFREE)
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .build()
            )
        assertThat(messagingProfileListPhoneNumbersResponse.meta())
            .contains(
                MessagingProfileListPhoneNumbersResponse.Meta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileListPhoneNumbersResponse =
            MessagingProfileListPhoneNumbersResponse.builder()
                .addData(
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
                        .type(PhoneNumberWithMessagingSettings.Type.TOLLFREE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .meta(
                    MessagingProfileListPhoneNumbersResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingProfileListPhoneNumbersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileListPhoneNumbersResponse),
                jacksonTypeRef<MessagingProfileListPhoneNumbersResponse>(),
            )

        assertThat(roundtrippedMessagingProfileListPhoneNumbersResponse)
            .isEqualTo(messagingProfileListPhoneNumbersResponse)
    }
}
