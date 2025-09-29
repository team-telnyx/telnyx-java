// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.siprecconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecConnectorUpdateResponseTest {

    @Test
    fun create() {
        val siprecConnectorUpdateResponse =
            SiprecConnectorUpdateResponse.builder()
                .data(
                    SiprecConnectorUpdateResponse.Data.builder()
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

        assertThat(siprecConnectorUpdateResponse.data())
            .isEqualTo(
                SiprecConnectorUpdateResponse.Data.builder()
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
        val siprecConnectorUpdateResponse =
            SiprecConnectorUpdateResponse.builder()
                .data(
                    SiprecConnectorUpdateResponse.Data.builder()
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

        val roundtrippedSiprecConnectorUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siprecConnectorUpdateResponse),
                jacksonTypeRef<SiprecConnectorUpdateResponse>(),
            )

        assertThat(roundtrippedSiprecConnectorUpdateResponse)
            .isEqualTo(siprecConnectorUpdateResponse)
    }
}
