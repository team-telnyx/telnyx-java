// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationSecretCreateResponseTest {

    @Test
    fun create() {
        val integrationSecretCreateResponse =
            IntegrationSecretCreateResponse.builder()
                .data(
                    IntegrationSecret.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .identifier("identifier")
                        .recordType("integration_secret")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(integrationSecretCreateResponse.data())
            .isEqualTo(
                IntegrationSecret.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .identifier("identifier")
                    .recordType("integration_secret")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationSecretCreateResponse =
            IntegrationSecretCreateResponse.builder()
                .data(
                    IntegrationSecret.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .identifier("identifier")
                        .recordType("integration_secret")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedIntegrationSecretCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationSecretCreateResponse),
                jacksonTypeRef<IntegrationSecretCreateResponse>(),
            )

        assertThat(roundtrippedIntegrationSecretCreateResponse)
            .isEqualTo(integrationSecretCreateResponse)
    }
}
