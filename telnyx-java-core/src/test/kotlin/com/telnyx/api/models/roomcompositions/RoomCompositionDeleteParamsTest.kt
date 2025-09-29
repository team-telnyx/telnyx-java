// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.roomcompositions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomCompositionDeleteParamsTest {

    @Test
    fun create() {
        RoomCompositionDeleteParams.builder()
            .roomCompositionId("5219b3af-87c6-4c08-9b58-5a533d893e21")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoomCompositionDeleteParams.builder()
                .roomCompositionId("5219b3af-87c6-4c08-9b58-5a533d893e21")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("5219b3af-87c6-4c08-9b58-5a533d893e21")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
