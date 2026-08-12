// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insightgroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupInsightGroupsParamsTest {

    @Test
    fun create() {
        InsightGroupInsightGroupsParams.builder()
            .name("Name")
            .description("Description")
            .webhook("")
            .build()
    }

    @Test
    fun body() {
        val params =
            InsightGroupInsightGroupsParams.builder()
                .name("Name")
                .description("Description")
                .webhook("")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Name")
        assertThat(body.description()).contains("Description")
        assertThat(body.webhook()).contains("")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InsightGroupInsightGroupsParams.builder().name("Name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Name")
    }
}
