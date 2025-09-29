// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.recordings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingDeleteParamsTest {

    @Test
    fun create() {
        RecordingDeleteParams.builder().recordingId("recording_id").build()
    }

    @Test
    fun pathParams() {
        val params = RecordingDeleteParams.builder().recordingId("recording_id").build()

        assertThat(params._pathParam(0)).isEqualTo("recording_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
