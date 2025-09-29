// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.siprecconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecConnectorCreateResponseTest {

    @Test
    fun create() {
        val siprecConnectorCreateResponse =
            SiprecConnectorCreateResponse.builder()
                .data(
                    SiprecConnectorCreateResponse.Data.builder()
                        .appSubdomain("my-app-domain")
                        .createdAt("2024-01-23T18:10:02.574Z")
                        .host("siprec.telnyx.com")
                        .name("siprec-connector")
                        .port(5060L)
                        .recordType("siprec_connector")
                        .updatedAt("2024-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        assertThat(siprecConnectorCreateResponse.data())
            .isEqualTo(
                SiprecConnectorCreateResponse.Data.builder()
                    .appSubdomain("my-app-domain")
                    .createdAt("2024-01-23T18:10:02.574Z")
                    .host("siprec.telnyx.com")
                    .name("siprec-connector")
                    .port(5060L)
                    .recordType("siprec_connector")
                    .updatedAt("2024-01-23T18:10:02.574Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siprecConnectorCreateResponse =
            SiprecConnectorCreateResponse.builder()
                .data(
                    SiprecConnectorCreateResponse.Data.builder()
                        .appSubdomain("my-app-domain")
                        .createdAt("2024-01-23T18:10:02.574Z")
                        .host("siprec.telnyx.com")
                        .name("siprec-connector")
                        .port(5060L)
                        .recordType("siprec_connector")
                        .updatedAt("2024-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        val roundtrippedSiprecConnectorCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siprecConnectorCreateResponse),
                jacksonTypeRef<SiprecConnectorCreateResponse>(),
            )

        assertThat(roundtrippedSiprecConnectorCreateResponse)
            .isEqualTo(siprecConnectorCreateResponse)
    }
}
