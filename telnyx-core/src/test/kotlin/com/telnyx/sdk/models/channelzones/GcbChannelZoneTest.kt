// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.channelzones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GcbChannelZoneTest {

    @Test
    fun create() {
        val gcbChannelZone =
            GcbChannelZone.builder()
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
                .recordType(GcbChannelZone.RecordType.CHANNEL_ZONE)
                .createdAt("2019-01-23T18:10:02.574Z")
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        assertThat(gcbChannelZone.id()).isEqualTo("1653e6a1-4bfd-4857-97c6-6a51e1c34477")
        assertThat(gcbChannelZone.channels()).isEqualTo(7L)
        assertThat(gcbChannelZone.countries())
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
        assertThat(gcbChannelZone.name()).isEqualTo("Euro channel zone")
        assertThat(gcbChannelZone.recordType()).isEqualTo(GcbChannelZone.RecordType.CHANNEL_ZONE)
        assertThat(gcbChannelZone.createdAt()).contains("2019-01-23T18:10:02.574Z")
        assertThat(gcbChannelZone.updatedAt()).contains("2019-01-23T18:10:02.574Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gcbChannelZone =
            GcbChannelZone.builder()
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
                .recordType(GcbChannelZone.RecordType.CHANNEL_ZONE)
                .createdAt("2019-01-23T18:10:02.574Z")
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        val roundtrippedGcbChannelZone =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gcbChannelZone),
                jacksonTypeRef<GcbChannelZone>(),
            )

        assertThat(roundtrippedGcbChannelZone).isEqualTo(gcbChannelZone)
    }
}
