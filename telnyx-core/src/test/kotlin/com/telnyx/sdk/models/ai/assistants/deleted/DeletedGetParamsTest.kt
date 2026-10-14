// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.deleted

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeletedGetParamsTest {

    @Test
    fun create() {
        DeletedGetParams.builder().assistantId("assistant_id").build()
    }

    @Test
    fun pathParams() {
        val params = DeletedGetParams.builder().assistantId("assistant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
