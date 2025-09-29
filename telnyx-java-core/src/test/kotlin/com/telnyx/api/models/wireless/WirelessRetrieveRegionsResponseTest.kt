// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wireless

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessRetrieveRegionsResponseTest {

    @Test
    fun create() {
        val wirelessRetrieveRegionsResponse =
            WirelessRetrieveRegionsResponse.builder()
                .addData(
                    WirelessRetrieveRegionsResponse.Data.builder()
                        .code("dc2")
                        .name("Washington DC, US")
                        .insertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(wirelessRetrieveRegionsResponse.data().getOrNull())
            .containsExactly(
                WirelessRetrieveRegionsResponse.Data.builder()
                    .code("dc2")
                    .name("Washington DC, US")
                    .insertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessRetrieveRegionsResponse =
            WirelessRetrieveRegionsResponse.builder()
                .addData(
                    WirelessRetrieveRegionsResponse.Data.builder()
                        .code("dc2")
                        .name("Washington DC, US")
                        .insertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedWirelessRetrieveRegionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessRetrieveRegionsResponse),
                jacksonTypeRef<WirelessRetrieveRegionsResponse>(),
            )

        assertThat(roundtrippedWirelessRetrieveRegionsResponse)
            .isEqualTo(wirelessRetrieveRegionsResponse)
    }
}
