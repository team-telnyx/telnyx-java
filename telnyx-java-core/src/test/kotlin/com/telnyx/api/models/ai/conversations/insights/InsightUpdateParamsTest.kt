// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insights

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightUpdateParamsTest {

    @Test
    fun create() {
        InsightUpdateParams.builder()
            .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .instructions("instructions")
            .jsonSchema("string")
            .name("name")
            .webhook("webhook")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InsightUpdateParams.builder().insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InsightUpdateParams.builder()
                .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instructions("instructions")
                .jsonSchema("string")
                .name("name")
                .webhook("webhook")
                .build()

        val body = params._body()

        assertThat(body.instructions()).contains("instructions")
        assertThat(body.jsonSchema()).contains(InsightUpdateParams.JsonSchema.ofString("string"))
        assertThat(body.name()).contains("name")
        assertThat(body.webhook()).contains("webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InsightUpdateParams.builder().insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
