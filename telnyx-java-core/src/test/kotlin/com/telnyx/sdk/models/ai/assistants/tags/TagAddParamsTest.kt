// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagAddParamsTest {

    @Test
    fun create() {
        TagAddParams.builder().assistantId("assistant_id").tag("tag").build()
    }

    @Test
    fun pathParams() {
        val params = TagAddParams.builder().assistantId("assistant_id").tag("tag").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = TagAddParams.builder().assistantId("assistant_id").tag("tag").build()

        val body = params._body()

        assertThat(body.tag()).isEqualTo("tag")
    }
}
