// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployResponseTest {

    @Test
    fun create() {
        val canaryDeployResponse =
            CanaryDeployResponse.builder()
                .assistantId("assistant_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVersion(VersionConfig.builder().percentage(1.0).versionId("version_id").build())
                .build()

        assertThat(canaryDeployResponse.assistantId()).isEqualTo("assistant_id")
        assertThat(canaryDeployResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(canaryDeployResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(canaryDeployResponse.versions())
            .containsExactly(
                VersionConfig.builder().percentage(1.0).versionId("version_id").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val canaryDeployResponse =
            CanaryDeployResponse.builder()
                .assistantId("assistant_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVersion(VersionConfig.builder().percentage(1.0).versionId("version_id").build())
                .build()

        val roundtrippedCanaryDeployResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(canaryDeployResponse),
                jacksonTypeRef<CanaryDeployResponse>(),
            )

        assertThat(roundtrippedCanaryDeployResponse).isEqualTo(canaryDeployResponse)
    }
}
