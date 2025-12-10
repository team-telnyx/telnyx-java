// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationSecretListResponseTest {

    @Test
    fun create() {
        val integrationSecretListResponse =
            IntegrationSecretListResponse.builder()
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
                    IntegrationSecretListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(25L)
                        .totalPages(10L)
                        .totalResults(250L)
                        .build()
                )
                .build()

        assertThat(integrationSecretListResponse.data())
            .containsExactly(
                IntegrationSecret.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .identifier("identifier")
                    .recordType("integration_secret")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(integrationSecretListResponse.meta())
            .isEqualTo(
                IntegrationSecretListResponse.Meta.builder()
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
        val integrationSecretListResponse =
            IntegrationSecretListResponse.builder()
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
                    IntegrationSecretListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(25L)
                        .totalPages(10L)
                        .totalResults(250L)
                        .build()
                )
                .build()

        val roundtrippedIntegrationSecretListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integrationSecretListResponse),
                jacksonTypeRef<IntegrationSecretListResponse>(),
            )

        assertThat(roundtrippedIntegrationSecretListResponse)
            .isEqualTo(integrationSecretListResponse)
    }
}
