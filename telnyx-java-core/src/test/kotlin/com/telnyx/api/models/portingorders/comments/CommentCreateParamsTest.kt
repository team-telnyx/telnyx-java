// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.comments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateParamsTest {

    @Test
    fun create() {
        CommentCreateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body("Please, let me know when the port completes")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentCreateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body("Please, let me know when the port completes")
                .build()

        val body = params._body()

        assertThat(body.body()).contains("Please, let me know when the port completes")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommentCreateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
