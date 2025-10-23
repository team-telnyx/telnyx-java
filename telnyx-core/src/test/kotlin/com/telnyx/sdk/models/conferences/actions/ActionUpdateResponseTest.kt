// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUpdateResponseTest {

    @Test
    fun create() {
        val actionUpdateResponse =
            ActionUpdateResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionUpdateResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionUpdateResponse =
            ActionUpdateResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionUpdateResponse),
                jacksonTypeRef<ActionUpdateResponse>(),
            )

        assertThat(roundtrippedActionUpdateResponse).isEqualTo(actionUpdateResponse)
    }
}
