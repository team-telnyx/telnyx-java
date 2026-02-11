// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionCloneMissionResponseTest {

    @Test
    fun create() {
        val missionCloneMissionResponse = MissionCloneMissionResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionCloneMissionResponse = MissionCloneMissionResponse.builder().build()

        val roundtrippedMissionCloneMissionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionCloneMissionResponse),
                jacksonTypeRef<MissionCloneMissionResponse>(),
            )

        assertThat(roundtrippedMissionCloneMissionResponse).isEqualTo(missionCloneMissionResponse)
    }
}
