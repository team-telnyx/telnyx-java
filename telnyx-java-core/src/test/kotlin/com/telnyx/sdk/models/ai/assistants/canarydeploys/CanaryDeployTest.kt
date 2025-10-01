// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CanaryDeployTest {

    @Test
    fun create() {
        val canaryDeploy =
            CanaryDeploy.builder()
                .addVersion(VersionConfig.builder().percentage(1.0).versionId("version_id").build())
                .build()

        assertThat(canaryDeploy.versions())
            .containsExactly(
                VersionConfig.builder().percentage(1.0).versionId("version_id").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val canaryDeploy =
            CanaryDeploy.builder()
                .addVersion(VersionConfig.builder().percentage(1.0).versionId("version_id").build())
                .build()

        val roundtrippedCanaryDeploy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(canaryDeploy),
                jacksonTypeRef<CanaryDeploy>(),
            )

        assertThat(roundtrippedCanaryDeploy).isEqualTo(canaryDeploy)
    }
}
