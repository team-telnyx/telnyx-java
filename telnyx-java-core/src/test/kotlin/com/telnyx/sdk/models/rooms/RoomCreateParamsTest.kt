// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomCreateParamsTest {

    @Test
    fun create() {
        RoomCreateParams.builder()
            .enableRecording(true)
            .maxParticipants(10L)
            .uniqueName("My room")
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
            RoomCreateParams.builder()
                .enableRecording(true)
                .maxParticipants(10L)
                .uniqueName("My room")
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.enableRecording()).contains(true)
        assertThat(body.maxParticipants()).contains(10L)
        assertThat(body.uniqueName()).contains("My room")
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RoomCreateParams.builder().build()

        val body = params._body()
    }
}
