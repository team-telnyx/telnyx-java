// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.channelzones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelZoneListResponseTest {

    @Test
    fun create() {
        val channelZoneListResponse =
            ChannelZoneListResponse.builder()
                .addData(
                    ChannelZoneListResponse.Data.builder()
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
                        .recordType(ChannelZoneListResponse.Data.RecordType.CHANNEL_ZONE)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(channelZoneListResponse.data().getOrNull())
            .containsExactly(
                ChannelZoneListResponse.Data.builder()
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
                    .recordType(ChannelZoneListResponse.Data.RecordType.CHANNEL_ZONE)
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
        assertThat(channelZoneListResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val channelZoneListResponse =
            ChannelZoneListResponse.builder()
                .addData(
                    ChannelZoneListResponse.Data.builder()
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
                        .recordType(ChannelZoneListResponse.Data.RecordType.CHANNEL_ZONE)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedChannelZoneListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelZoneListResponse),
                jacksonTypeRef<ChannelZoneListResponse>(),
            )

        assertThat(roundtrippedChannelZoneListResponse).isEqualTo(channelZoneListResponse)
    }
}
