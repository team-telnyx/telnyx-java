// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingFeatureSet
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingListPageResponseTest {

    @Test
    fun create() {
        val messagingListPageResponse =
            MessagingListPageResponse.builder()
                .addData(
                    MobilePhoneNumberWithMessagingSettings.builder()
                        .id("2126210528794641864")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .features(
                            MobilePhoneNumberWithMessagingSettings.Features.builder()
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
                        .recordType(
                            MobilePhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS
                        )
                        .addTag("string")
                        .trafficType("P2P")
                        .type(MobilePhoneNumberWithMessagingSettings.Type.LONGCODE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingListPageResponse.data().getOrNull())
            .containsExactly(
                MobilePhoneNumberWithMessagingSettings.builder()
                    .id("2126210528794641864")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .features(
                        MobilePhoneNumberWithMessagingSettings.Features.builder()
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
                    .recordType(
                        MobilePhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS
                    )
                    .addTag("string")
                    .trafficType("P2P")
                    .type(MobilePhoneNumberWithMessagingSettings.Type.LONGCODE)
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .build()
            )
        assertThat(messagingListPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
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
        val messagingListPageResponse =
            MessagingListPageResponse.builder()
                .addData(
                    MobilePhoneNumberWithMessagingSettings.builder()
                        .id("2126210528794641864")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .features(
                            MobilePhoneNumberWithMessagingSettings.Features.builder()
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
                        .recordType(
                            MobilePhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS
                        )
                        .addTag("string")
                        .trafficType("P2P")
                        .type(MobilePhoneNumberWithMessagingSettings.Type.LONGCODE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingListPageResponse),
                jacksonTypeRef<MessagingListPageResponse>(),
            )

        assertThat(roundtrippedMessagingListPageResponse).isEqualTo(messagingListPageResponse)
    }
}
