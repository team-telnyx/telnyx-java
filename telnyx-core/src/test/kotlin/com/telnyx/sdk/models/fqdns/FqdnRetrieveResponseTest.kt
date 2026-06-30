// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnRetrieveResponseTest {

    @Test
    fun create() {
        val fqdnRetrieveResponse =
            FqdnRetrieveResponse.builder()
                .data(
                    Fqdn.builder()
                        .id("1293384261075731499")
                        .connectionId("1516447646313612565")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dnsRecordType("a")
                        .fqdn("example.com")
                        .port(5060L)
                        .recordType("fqdn")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(fqdnRetrieveResponse.data())
            .contains(
                Fqdn.builder()
                    .id("1293384261075731499")
                    .connectionId("1516447646313612565")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .dnsRecordType("a")
                    .fqdn("example.com")
                    .port(5060L)
                    .recordType("fqdn")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fqdnRetrieveResponse =
            FqdnRetrieveResponse.builder()
                .data(
                    Fqdn.builder()
                        .id("1293384261075731499")
                        .connectionId("1516447646313612565")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dnsRecordType("a")
                        .fqdn("example.com")
                        .port(5060L)
                        .recordType("fqdn")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedFqdnRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fqdnRetrieveResponse),
                jacksonTypeRef<FqdnRetrieveResponse>(),
            )

        assertThat(roundtrippedFqdnRetrieveResponse).isEqualTo(fqdnRetrieveResponse)
    }
}
