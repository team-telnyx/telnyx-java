// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationSecretListPageResponseTest {

    @Test
    fun create() {
        val integrationSecretListPageResponse =
            IntegrationSecretListPageResponse.builder()
                .addData(
                    IntegrationSecret.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .identifier("identifier")
                        .recordType("integration_secret")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    IntegrationSecretListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(25L)
                        .totalPages(10L)
                        .totalResults(250L)
                        .build()
                )
                .build()

        assertThat(integrationSecretListPageResponse.data())
            .containsExactly(
                IntegrationSecret.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .identifier("identifier")
                    .recordType("integration_secret")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(integrationSecretListPageResponse.meta())
            .isEqualTo(
                IntegrationSecretListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(25L)
                    .totalPages(10L)
                    .totalResults(250L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integrationSecretListPageResponse =
            IntegrationSecretListPageResponse.builder()
                .addData(
                    IntegrationSecret.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .identifier("identifier")
                        .recordType("integration_secret")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    IntegrationSecretListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(25L)
                        .totalPages(10L)
                        .totalResults(250L)
                        .build()
                )
                .build()

        val roundtrippedIntegrationSecretListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationSecretListPageResponse),
                jacksonTypeRef<IntegrationSecretListPageResponse>(),
            )

        assertThat(roundtrippedIntegrationSecretListPageResponse)
            .isEqualTo(integrationSecretListPageResponse)
    }
}
