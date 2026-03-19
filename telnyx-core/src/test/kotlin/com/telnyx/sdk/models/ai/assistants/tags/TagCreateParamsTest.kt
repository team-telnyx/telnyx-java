// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCreateParamsTest {

    @Test
    fun create() {
        TagCreateParams.builder().assistantId("assistant_id").tag("tag").build()
    }

    @Test
    fun pathParams() {
        val params = TagCreateParams.builder().assistantId("assistant_id").tag("tag").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = TagCreateParams.builder().assistantId("assistant_id").tag("tag").build()

        val body = params._body()

        assertThat(body.tag()).isEqualTo("tag")
    }
}
