// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionDeleteParamsTest {

    @Test
    fun create() {
        ActionDeleteParams.builder()
            .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
            .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c2")
            .build()
    }

    @Test
    fun body() {
        val params =
            ActionDeleteParams.builder()
                .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c2")
                .build()

        val body = params._body()

        assertThat(body.ids())
            .containsExactly(
                "428c31b6-7af4-4bcb-b7f5-5013ef9657c1",
                "428c31b6-7af4-4bcb-b7f5-5013ef9657c2",
            )
    }
}
