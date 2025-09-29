// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionConfigTest {

    @Test
    fun create() {
        val versionConfig = VersionConfig.builder().percentage(1.0).versionId("version_id").build()

        assertThat(versionConfig.percentage()).isEqualTo(1.0)
        assertThat(versionConfig.versionId()).isEqualTo("version_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionConfig = VersionConfig.builder().percentage(1.0).versionId("version_id").build()

        val roundtrippedVersionConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionConfig),
                jacksonTypeRef<VersionConfig>(),
            )

        assertThat(roundtrippedVersionConfig).isEqualTo(versionConfig)
    }
}
