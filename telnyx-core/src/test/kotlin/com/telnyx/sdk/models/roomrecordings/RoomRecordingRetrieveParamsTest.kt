// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingRetrieveParamsTest {

    @Test
    fun create() {
        RoomRecordingRetrieveParams.builder()
            .roomRecordingId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoomRecordingRetrieveParams.builder()
                .roomRecordingId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
