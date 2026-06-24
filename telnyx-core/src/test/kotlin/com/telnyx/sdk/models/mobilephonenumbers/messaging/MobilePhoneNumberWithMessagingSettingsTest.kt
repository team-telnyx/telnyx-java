// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilephonenumbers.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingFeatureSet
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePhoneNumberWithMessagingSettingsTest {

    @Test
    fun create() {
        val mobilePhoneNumberWithMessagingSettings =
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
                .recordType(MobilePhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
                .addTag("string")
                .trafficType("P2P")
                .type(MobilePhoneNumberWithMessagingSettings.Type.LONGCODE)
                .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .build()

        assertThat(mobilePhoneNumberWithMessagingSettings.id()).contains("2126210528794641864")
        assertThat(mobilePhoneNumberWithMessagingSettings.countryCode()).contains("US")
        assertThat(mobilePhoneNumberWithMessagingSettings.createdAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(mobilePhoneNumberWithMessagingSettings.features())
            .contains(
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
        assertThat(mobilePhoneNumberWithMessagingSettings.messagingProduct()).contains("P2P")
        assertThat(mobilePhoneNumberWithMessagingSettings.messagingProfileId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(mobilePhoneNumberWithMessagingSettings.organizationId())
            .contains("organization_id")
        assertThat(mobilePhoneNumberWithMessagingSettings.phoneNumber()).contains("++13127367407")
        assertThat(mobilePhoneNumberWithMessagingSettings.recordType())
            .contains(MobilePhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
        assertThat(mobilePhoneNumberWithMessagingSettings.tags().getOrNull())
            .containsExactly("string")
        assertThat(mobilePhoneNumberWithMessagingSettings.trafficType()).contains("P2P")
        assertThat(mobilePhoneNumberWithMessagingSettings.type())
            .contains(MobilePhoneNumberWithMessagingSettings.Type.LONGCODE)
        assertThat(mobilePhoneNumberWithMessagingSettings.updatedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobilePhoneNumberWithMessagingSettings =
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
                .recordType(MobilePhoneNumberWithMessagingSettings.RecordType.MESSAGING_SETTINGS)
                .addTag("string")
                .trafficType("P2P")
                .type(MobilePhoneNumberWithMessagingSettings.Type.LONGCODE)
                .updatedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .build()

        val roundtrippedMobilePhoneNumberWithMessagingSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobilePhoneNumberWithMessagingSettings),
                jacksonTypeRef<MobilePhoneNumberWithMessagingSettings>(),
            )

        assertThat(roundtrippedMobilePhoneNumberWithMessagingSettings)
            .isEqualTo(mobilePhoneNumberWithMessagingSettings)
    }
}
