// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.canarydeploys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ServeTest {

    @Test
    fun create() {
        val serve =
            Serve.builder()
                .addRollout(RolloutSlot.builder().versionId("version_id").weight(0.0).build())
                .versionId("version_id")
                .build()

        assertThat(serve.rollout().getOrNull())
            .containsExactly(RolloutSlot.builder().versionId("version_id").weight(0.0).build())
        assertThat(serve.versionId()).contains("version_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val serve =
            Serve.builder()
                .addRollout(RolloutSlot.builder().versionId("version_id").weight(0.0).build())
                .versionId("version_id")
                .build()

        val roundtrippedServe =
            jsonMapper.readValue(jsonMapper.writeValueAsString(serve), jacksonTypeRef<Serve>())

        assertThat(roundtrippedServe).isEqualTo(serve)
    }
}
