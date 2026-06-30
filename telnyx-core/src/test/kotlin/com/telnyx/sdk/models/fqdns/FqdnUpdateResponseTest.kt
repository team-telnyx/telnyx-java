// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnUpdateResponseTest {

    @Test
    fun create() {
        val fqdnUpdateResponse =
            FqdnUpdateResponse.builder()
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

        assertThat(fqdnUpdateResponse.data())
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
        val fqdnUpdateResponse =
            FqdnUpdateResponse.builder()
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

        val roundtrippedFqdnUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fqdnUpdateResponse),
                jacksonTypeRef<FqdnUpdateResponse>(),
            )

        assertThat(roundtrippedFqdnUpdateResponse).isEqualTo(fqdnUpdateResponse)
    }
}
