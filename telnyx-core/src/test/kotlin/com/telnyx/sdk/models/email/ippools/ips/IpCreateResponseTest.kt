// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools.ips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpCreateResponseTest {

    @Test
    fun create() {
        val ipCreateResponse =
            IpCreateResponse.builder()
                .data(
                    IpCreateResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dedicatedIpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .poolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .weight(1L)
                        .build()
                )
                .build()

        assertThat(ipCreateResponse.data())
            .isEqualTo(
                IpCreateResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dedicatedIpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .poolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .weight(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipCreateResponse =
            IpCreateResponse.builder()
                .data(
                    IpCreateResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dedicatedIpId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .poolId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .weight(1L)
                        .build()
                )
                .build()

        val roundtrippedIpCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipCreateResponse),
                jacksonTypeRef<IpCreateResponse>(),
            )

        assertThat(roundtrippedIpCreateResponse).isEqualTo(ipCreateResponse)
    }
}
