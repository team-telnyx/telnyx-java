// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.conversations.insightgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupInsightGroupsParamsTest {

    @Test
    fun create() {
        InsightGroupInsightGroupsParams.builder()
            .name("name")
            .description("description")
            .webhook("webhook")
            .build()
    }

    @Test
    fun body() {
        val params =
            InsightGroupInsightGroupsParams.builder()
                .name("name")
                .description("description")
                .webhook("webhook")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.webhook()).contains("webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InsightGroupInsightGroupsParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
