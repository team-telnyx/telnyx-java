// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomCompositionTest {

    @Test
    fun create() {
        val roomComposition =
            RoomComposition.builder()
                .id("7103dc53-ee59-4b54-a58b-c77d99ceb037")
                .completedAt(OffsetDateTime.parse("2022-02-25T05:39:56.377426Z"))
                .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                .downloadUrl("https://example.com")
                .durationSecs(84L)
                .endedAt(OffsetDateTime.parse("2022-02-24T23:22:24.577677Z"))
                .format(RoomComposition.Format.MP4)
                .recordType("composition")
                .roomId("f981dbb3-228a-44e9-ac54-e87f0e2658b0")
                .sessionId("8f728d7b-00e2-4c59-8c27-f564b828df87")
                .sizeMb(6.0f)
                .startedAt(OffsetDateTime.parse("2022-02-24T23:21:00.077209Z"))
                .status(RoomComposition.Status.ENQUEUED)
                .updatedAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                .userId("12a04ec9-0f91-4a91-9f3a-a19d9931182e")
                .videoLayout(
                    RoomComposition.VideoLayout.builder()
                        .putAdditionalProperty(
                            "first",
                            JsonValue.from(
                                mapOf(
                                    "height" to 720,
                                    "max_columns" to 3,
                                    "max_rows" to 3,
                                    "video_sources" to
                                        listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                    "width" to 1280,
                                    "x_pos" to 0,
                                    "y_pos" to 0,
                                    "z_pos" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://webhook.site/544663ce-b692-4f9c-80ed-e5ad97cd5c02")
                .webhookTimeoutSecs(25L)
                .build()

        assertThat(roomComposition.id()).contains("7103dc53-ee59-4b54-a58b-c77d99ceb037")
        assertThat(roomComposition.completedAt())
            .contains(OffsetDateTime.parse("2022-02-25T05:39:56.377426Z"))
        assertThat(roomComposition.createdAt())
            .contains(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
        assertThat(roomComposition.downloadUrl()).contains("https://example.com")
        assertThat(roomComposition.durationSecs()).contains(84L)
        assertThat(roomComposition.endedAt())
            .contains(OffsetDateTime.parse("2022-02-24T23:22:24.577677Z"))
        assertThat(roomComposition.format()).contains(RoomComposition.Format.MP4)
        assertThat(roomComposition.recordType()).contains("composition")
        assertThat(roomComposition.roomId()).contains("f981dbb3-228a-44e9-ac54-e87f0e2658b0")
        assertThat(roomComposition.sessionId()).contains("8f728d7b-00e2-4c59-8c27-f564b828df87")
        assertThat(roomComposition.sizeMb()).contains(6.0f)
        assertThat(roomComposition.startedAt())
            .contains(OffsetDateTime.parse("2022-02-24T23:21:00.077209Z"))
        assertThat(roomComposition.status()).contains(RoomComposition.Status.ENQUEUED)
        assertThat(roomComposition.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
        assertThat(roomComposition.userId()).contains("12a04ec9-0f91-4a91-9f3a-a19d9931182e")
        assertThat(roomComposition.videoLayout())
            .contains(
                RoomComposition.VideoLayout.builder()
                    .putAdditionalProperty(
                        "first",
                        JsonValue.from(
                            mapOf(
                                "height" to 720,
                                "max_columns" to 3,
                                "max_rows" to 3,
                                "video_sources" to listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                "width" to 1280,
                                "x_pos" to 0,
                                "y_pos" to 0,
                                "z_pos" to 0,
                            )
                        ),
                    )
                    .build()
            )
        assertThat(roomComposition.webhookEventFailoverUrl())
            .contains("https://failover.example.com")
        assertThat(roomComposition.webhookEventUrl())
            .contains("https://webhook.site/544663ce-b692-4f9c-80ed-e5ad97cd5c02")
        assertThat(roomComposition.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomComposition =
            RoomComposition.builder()
                .id("7103dc53-ee59-4b54-a58b-c77d99ceb037")
                .completedAt(OffsetDateTime.parse("2022-02-25T05:39:56.377426Z"))
                .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                .downloadUrl("https://example.com")
                .durationSecs(84L)
                .endedAt(OffsetDateTime.parse("2022-02-24T23:22:24.577677Z"))
                .format(RoomComposition.Format.MP4)
                .recordType("composition")
                .roomId("f981dbb3-228a-44e9-ac54-e87f0e2658b0")
                .sessionId("8f728d7b-00e2-4c59-8c27-f564b828df87")
                .sizeMb(6.0f)
                .startedAt(OffsetDateTime.parse("2022-02-24T23:21:00.077209Z"))
                .status(RoomComposition.Status.ENQUEUED)
                .updatedAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                .userId("12a04ec9-0f91-4a91-9f3a-a19d9931182e")
                .videoLayout(
                    RoomComposition.VideoLayout.builder()
                        .putAdditionalProperty(
                            "first",
                            JsonValue.from(
                                mapOf(
                                    "height" to 720,
                                    "max_columns" to 3,
                                    "max_rows" to 3,
                                    "video_sources" to
                                        listOf("7b61621f-62e0-4aad-ab11-9fd19e272e73"),
                                    "width" to 1280,
                                    "x_pos" to 0,
                                    "y_pos" to 0,
                                    "z_pos" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://webhook.site/544663ce-b692-4f9c-80ed-e5ad97cd5c02")
                .webhookTimeoutSecs(25L)
                .build()

        val roundtrippedRoomComposition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomComposition),
                jacksonTypeRef<RoomComposition>(),
            )

        assertThat(roundtrippedRoomComposition).isEqualTo(roomComposition)
    }
}
