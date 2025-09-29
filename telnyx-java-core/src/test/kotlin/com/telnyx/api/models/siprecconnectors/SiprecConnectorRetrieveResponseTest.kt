// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.siprecconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecConnectorRetrieveResponseTest {

    @Test
    fun create() {
        val siprecConnectorRetrieveResponse =
            SiprecConnectorRetrieveResponse.builder()
                .data(
                    SiprecConnectorRetrieveResponse.Data.builder()
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

        assertThat(siprecConnectorRetrieveResponse.data())
            .isEqualTo(
                SiprecConnectorRetrieveResponse.Data.builder()
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
        val siprecConnectorRetrieveResponse =
            SiprecConnectorRetrieveResponse.builder()
                .data(
                    SiprecConnectorRetrieveResponse.Data.builder()
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

        val roundtrippedSiprecConnectorRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siprecConnectorRetrieveResponse),
                jacksonTypeRef<SiprecConnectorRetrieveResponse>(),
            )

        assertThat(roundtrippedSiprecConnectorRetrieveResponse)
            .isEqualTo(siprecConnectorRetrieveResponse)
    }
}
