// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightUpdateParamsTest {

    @Test
    fun create() {
        InsightUpdateParams.builder()
            .insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .instructions("Instructions")
            .jsonSchema("string")
            .name("Name")
            .webhook("Webhook")
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
                .instructions("Instructions")
                .jsonSchema("string")
                .name("Name")
                .webhook("Webhook")
                .build()

        val body = params._body()

        assertThat(body.instructions()).contains("Instructions")
        assertThat(body.jsonSchema()).contains(InsightUpdateParams.JsonSchema.ofString("string"))
        assertThat(body.name()).contains("Name")
        assertThat(body.webhook()).contains("Webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InsightUpdateParams.builder().insightId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
