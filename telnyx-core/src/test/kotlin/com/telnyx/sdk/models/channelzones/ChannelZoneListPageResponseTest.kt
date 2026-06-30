// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.channelzones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelZoneListPageResponseTest {

    @Test
    fun create() {
        val channelZoneListPageResponse =
            ChannelZoneListPageResponse.builder()
                .addData(
                    ChannelZoneListResponse.builder()
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
                        .recordType(ChannelZoneListResponse.RecordType.CHANNEL_ZONE)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(channelZoneListPageResponse.data().getOrNull())
            .containsExactly(
                ChannelZoneListResponse.builder()
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
                    .recordType(ChannelZoneListResponse.RecordType.CHANNEL_ZONE)
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
        assertThat(channelZoneListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val channelZoneListPageResponse =
            ChannelZoneListPageResponse.builder()
                .addData(
                    ChannelZoneListResponse.builder()
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
                        .recordType(ChannelZoneListResponse.RecordType.CHANNEL_ZONE)
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedChannelZoneListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(channelZoneListPageResponse),
                jacksonTypeRef<ChannelZoneListPageResponse>(),
            )

        assertThat(roundtrippedChannelZoneListPageResponse).isEqualTo(channelZoneListPageResponse)
    }
}
