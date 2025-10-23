// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventDeleteResponseTest {

    @Test
    fun create() {
        val scheduledEventDeleteResponse = ScheduledEventDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventDeleteResponse = ScheduledEventDeleteResponse.builder().build()

        val roundtrippedScheduledEventDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventDeleteResponse),
                jacksonTypeRef<ScheduledEventDeleteResponse>(),
            )

        assertThat(roundtrippedScheduledEventDeleteResponse).isEqualTo(scheduledEventDeleteResponse)
    }
}
