// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetappsCursorPaginationMetaTest {

    @Test
    fun create() {
        val netappsCursorPaginationMeta =
            NetappsCursorPaginationMeta.builder()
                .cursors(
                    NetappsCursorPaginationMeta.Cursors.builder()
                        .after("after")
                        .before("before")
                        .build()
                )
                .next(
                    "/v2/network_routes?filter%5Bnetwork_id%5D=91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24&page%5Bafter%5D=MjAyNi0xMC0yMVQxNjowNjowMC4wNDMwNDRa&page%5Blimit%5D=1"
                )
                .previous("previous")
                .build()

        assertThat(netappsCursorPaginationMeta.cursors())
            .contains(
                NetappsCursorPaginationMeta.Cursors.builder()
                    .after("after")
                    .before("before")
                    .build()
            )
        assertThat(netappsCursorPaginationMeta.next())
            .contains(
                "/v2/network_routes?filter%5Bnetwork_id%5D=91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24&page%5Bafter%5D=MjAyNi0xMC0yMVQxNjowNjowMC4wNDMwNDRa&page%5Blimit%5D=1"
            )
        assertThat(netappsCursorPaginationMeta.previous()).contains("previous")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val netappsCursorPaginationMeta =
            NetappsCursorPaginationMeta.builder()
                .cursors(
                    NetappsCursorPaginationMeta.Cursors.builder()
                        .after("after")
                        .before("before")
                        .build()
                )
                .next(
                    "/v2/network_routes?filter%5Bnetwork_id%5D=91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24&page%5Bafter%5D=MjAyNi0xMC0yMVQxNjowNjowMC4wNDMwNDRa&page%5Blimit%5D=1"
                )
                .previous("previous")
                .build()

        val roundtrippedNetappsCursorPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(netappsCursorPaginationMeta),
                jacksonTypeRef<NetappsCursorPaginationMeta>(),
            )

        assertThat(roundtrippedNetappsCursorPaginationMeta).isEqualTo(netappsCursorPaginationMeta)
    }
}
