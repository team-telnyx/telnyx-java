// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomUpdateParamsTest {

    @Test
    fun create() {
        RoomUpdateParams.builder()
            .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .enableRecording(true)
            .maxParticipants(10L)
            .uniqueName("My room")
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoomUpdateParams.builder().roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0").build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RoomUpdateParams.builder()
                .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
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
        val params =
            RoomUpdateParams.builder().roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0").build()

        val body = params._body()
    }
}
