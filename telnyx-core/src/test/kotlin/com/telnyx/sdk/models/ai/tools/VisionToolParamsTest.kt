// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VisionToolParamsTest {

    @Test
    fun create() {
        val visionToolParams = VisionToolParams.builder().maxFrameAgeSecs(1L).build()

        assertThat(visionToolParams.maxFrameAgeSecs()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val visionToolParams = VisionToolParams.builder().maxFrameAgeSecs(1L).build()

        val roundtrippedVisionToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(visionToolParams),
                jacksonTypeRef<VisionToolParams>(),
            )

        assertThat(roundtrippedVisionToolParams).isEqualTo(visionToolParams)
    }
}
