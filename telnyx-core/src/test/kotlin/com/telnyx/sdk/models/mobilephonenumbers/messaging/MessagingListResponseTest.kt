// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingFeatureSet
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingListResponseTest {

    @Test
    fun create() {
        val messagingListResponse =
            MessagingListResponse.builder()
                .addData(
                    MessagingListResponse.Data.builder()
                        .id("2126210528794641864")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .features(
                            MessagingListResponse.Data.Features.builder()
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
                        .recordType(MessagingListResponse.Data.RecordType.MESSAGING_SETTINGS)
                        .trafficType("P2P")
                        .type(MessagingListResponse.Data.Type.LONGCODE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .meta(
                    MessagingListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingListResponse.data().getOrNull())
            .containsExactly(
                MessagingListResponse.Data.builder()
                    .id("2126210528794641864")
                    .countryCode("US")
                    .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .features(
                        MessagingListResponse.Data.Features.builder()
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
                    .recordType(MessagingListResponse.Data.RecordType.MESSAGING_SETTINGS)
                    .trafficType("P2P")
                    .type(MessagingListResponse.Data.Type.LONGCODE)
                    .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .build()
            )
        assertThat(messagingListResponse.meta())
            .contains(
                MessagingListResponse.Meta.builder()
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
        val messagingListResponse =
            MessagingListResponse.builder()
                .addData(
                    MessagingListResponse.Data.builder()
                        .id("2126210528794641864")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .features(
                            MessagingListResponse.Data.Features.builder()
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
                        .recordType(MessagingListResponse.Data.RecordType.MESSAGING_SETTINGS)
                        .trafficType("P2P")
                        .type(MessagingListResponse.Data.Type.LONGCODE)
                        .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .build()
                )
                .meta(
                    MessagingListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingListResponse),
                jacksonTypeRef<MessagingListResponse>(),
            )

        assertThat(roundtrippedMessagingListResponse).isEqualTo(messagingListResponse)
    }
}
