// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomCompositionCreateParamsTest {

    @Test
    fun create() {
        RoomCompositionCreateParams.builder()
            .format("mp4")
            .resolution("800x600")
            .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777b0")
            .videoLayout(
                RoomCompositionCreateParams.VideoLayout.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "height" to 360,
                                "max_columns" to 3,
                                "max_rows" to 3,
                                "video_sources" to listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                "width" to 480,
                                "x_pos" to 100,
                                "y_pos" to 100,
                                "z_pos" to 1,
                            )
                        ),
                    )
                    .build()
            )
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookEventUrl("https://example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun body() {
        val params =
            RoomCompositionCreateParams.builder()
                .format("mp4")
                .resolution("800x600")
                .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777b0")
                .videoLayout(
                    RoomCompositionCreateParams.VideoLayout.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "height" to 360,
                                    "max_columns" to 3,
                                    "max_rows" to 3,
                                    "video_sources" to
                                        listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                    "width" to 480,
                                    "x_pos" to 100,
                                    "y_pos" to 100,
                                    "z_pos" to 1,
                                )
                            ),
                        )
                        .build()
                )
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.format()).contains("mp4")
        assertThat(body.resolution()).contains("800x600")
        assertThat(body.sessionId()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777b0")
        assertThat(body.videoLayout())
            .contains(
                RoomCompositionCreateParams.VideoLayout.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "height" to 360,
                                "max_columns" to 3,
                                "max_rows" to 3,
                                "video_sources" to listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                "width" to 480,
                                "x_pos" to 100,
                                "y_pos" to 100,
                                "z_pos" to 1,
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookEventUrl()).contains("https://example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RoomCompositionCreateParams.builder().build()

        val body = params._body()
    }
}
