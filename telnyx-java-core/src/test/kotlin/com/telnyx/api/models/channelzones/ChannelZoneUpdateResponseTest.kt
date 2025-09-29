// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.channelzones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelZoneUpdateResponseTest {

    @Test
    fun create() {
        val channelZoneUpdateResponse =
            ChannelZoneUpdateResponse.builder()
                .id("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
                .channels(7L)
                .countries(
                    listOf(
                        "BE",
                        "EL",
                        "LT",
                        "PT",
                        "BG",
                        "ES",
                        "LU",
                        "RO",
                        "CZ",
                        "FR",
                        "HU",
                        "SI",
                        "DK",
                        "HR",
                        "MT",
                        "SK",
                        "DE",
                        "IT",
                        "NL",
                        "FI",
                        "EE",
                        "CY",
                        "AT",
                        "SE",
                        "IE",
                        "LV",
                        "PL",
                    )
                )
                .name("Euro channel zone")
                .recordType(ChannelZoneUpdateResponse.RecordType.CHANNEL_ZONE)
                .createdAt("2019-01-23T18:10:02.574Z")
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        assertThat(channelZoneUpdateResponse.id()).isEqualTo("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
        assertThat(channelZoneUpdateResponse.channels()).isEqualTo(7L)
        assertThat(channelZoneUpdateResponse.countries())
            .containsExactly(
                "BE",
                "EL",
                "LT",
                "PT",
                "BG",
                "ES",
                "LU",
                "RO",
                "CZ",
                "FR",
                "HU",
                "SI",
                "DK",
                "HR",
                "MT",
                "SK",
                "DE",
                "IT",
                "NL",
                "FI",
                "EE",
                "CY",
                "AT",
                "SE",
                "IE",
                "LV",
                "PL",
            )
        assertThat(channelZoneUpdateResponse.name()).isEqualTo("Euro channel zone")
        assertThat(channelZoneUpdateResponse.recordType())
            .isEqualTo(ChannelZoneUpdateResponse.RecordType.CHANNEL_ZONE)
        assertThat(channelZoneUpdateResponse.createdAt()).contains("2019-01-23T18:10:02.574Z")
        assertThat(channelZoneUpdateResponse.updatedAt()).contains("2019-01-23T18:10:02.574Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelZoneUpdateResponse =
            ChannelZoneUpdateResponse.builder()
                .id("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
                .channels(7L)
                .countries(
                    listOf(
                        "BE",
                        "EL",
                        "LT",
                        "PT",
                        "BG",
                        "ES",
                        "LU",
                        "RO",
                        "CZ",
                        "FR",
                        "HU",
                        "SI",
                        "DK",
                        "HR",
                        "MT",
                        "SK",
                        "DE",
                        "IT",
                        "NL",
                        "FI",
                        "EE",
                        "CY",
                        "AT",
                        "SE",
                        "IE",
                        "LV",
                        "PL",
                    )
                )
                .name("Euro channel zone")
                .recordType(ChannelZoneUpdateResponse.RecordType.CHANNEL_ZONE)
                .createdAt("2019-01-23T18:10:02.574Z")
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        val roundtrippedChannelZoneUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelZoneUpdateResponse),
                jacksonTypeRef<ChannelZoneUpdateResponse>(),
            )

        assertThat(roundtrippedChannelZoneUpdateResponse).isEqualTo(channelZoneUpdateResponse)
    }
}
