// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceCommandResultTest {

    @Test
    fun create() {
        val conferenceCommandResult = ConferenceCommandResult.builder().result("ok").build()

        assertThat(conferenceCommandResult.result()).isEqualTo("ok")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceCommandResult = ConferenceCommandResult.builder().result("ok").build()

        val roundtrippedConferenceCommandResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceCommandResult),
                jacksonTypeRef<ConferenceCommandResult>(),
            )

        assertThat(roundtrippedConferenceCommandResult).isEqualTo(conferenceCommandResult)
    }
}
