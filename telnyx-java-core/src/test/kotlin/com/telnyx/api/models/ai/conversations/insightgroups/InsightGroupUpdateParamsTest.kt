// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insightgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupUpdateParamsTest {

    @Test
    fun create() {
        InsightGroupUpdateParams.builder()
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .name("name")
            .webhook("webhook")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InsightGroupUpdateParams.builder()
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InsightGroupUpdateParams.builder()
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .name("name")
                .webhook("webhook")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.webhook()).contains("webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InsightGroupUpdateParams.builder()
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
