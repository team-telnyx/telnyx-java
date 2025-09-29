// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.recordings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingRetrieveParamsTest {

    @Test
    fun create() {
        RecordingRetrieveParams.builder().recordingId("recording_id").build()
    }

    @Test
    fun pathParams() {
        val params = RecordingRetrieveParams.builder().recordingId("recording_id").build()

        assertThat(params._pathParam(0)).isEqualTo("recording_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
