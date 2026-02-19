// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRetrieveParticipantParamsTest {

    @Test
    fun create() {
        ConferenceRetrieveParticipantParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .participantId("participant_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConferenceRetrieveParticipantParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .participantId("participant_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("participant_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
