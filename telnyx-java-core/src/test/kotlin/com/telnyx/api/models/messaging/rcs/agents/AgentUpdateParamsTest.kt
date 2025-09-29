// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaging.rcs.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .id("id")
            .profileId("4001932a-b8a3-42fc-9389-021be6388909")
            .webhookFailoverUrl("http://example.com")
            .webhookUrl("http://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .id("id")
                .profileId("4001932a-b8a3-42fc-9389-021be6388909")
                .webhookFailoverUrl("http://example.com")
                .webhookUrl("http://example.com")
                .build()

        val body = params._body()

        assertThat(body.profileId()).contains("4001932a-b8a3-42fc-9389-021be6388909")
        assertThat(body.webhookFailoverUrl()).contains("http://example.com")
        assertThat(body.webhookUrl()).contains("http://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
