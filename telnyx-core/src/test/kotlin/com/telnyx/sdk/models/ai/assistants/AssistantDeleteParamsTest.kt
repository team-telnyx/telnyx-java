// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantDeleteParamsTest {

    @Test
    fun create() {
        AssistantDeleteParams.builder().assistantId("assistant_id").hardDelete(true).build()
    }

    @Test
    fun pathParams() {
        val params = AssistantDeleteParams.builder().assistantId("assistant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AssistantDeleteParams.builder().assistantId("assistant_id").hardDelete(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("hard_delete", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AssistantDeleteParams.builder().assistantId("assistant_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
