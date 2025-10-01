// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationSecretTest {

    @Test
    fun create() {
        val integrationSecret =
            IntegrationSecret.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .identifier("identifier")
                .recordType("integration_secret")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(integrationSecret.id()).isEqualTo("id")
        assertThat(integrationSecret.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(integrationSecret.identifier()).isEqualTo("identifier")
        assertThat(integrationSecret.recordType()).isEqualTo("integration_secret")
        assertThat(integrationSecret.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationSecret =
            IntegrationSecret.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .identifier("identifier")
                .recordType("integration_secret")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIntegrationSecret =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationSecret),
                jacksonTypeRef<IntegrationSecret>(),
            )

        assertThat(roundtrippedIntegrationSecret).isEqualTo(integrationSecret)
    }
}
