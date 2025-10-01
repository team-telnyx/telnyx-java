// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.comments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentRetrieveParamsTest {

    @Test
    fun create() {
        CommentRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = CommentRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
