// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagDeleteParamsTest {

    @Test
    fun create() {
        TagDeleteParams.builder().assistantId("assistant_id").tag("tag").build()
    }

    @Test
    fun pathParams() {
        val params = TagDeleteParams.builder().assistantId("assistant_id").tag("tag").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        assertThat(params._pathParam(1)).isEqualTo("tag")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
