// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomcompositions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomCompositionCreateResponseTest {

    @Test
    fun create() {
        val roomCompositionCreateResponse =
            RoomCompositionCreateResponse.builder()
                .data(
                    RoomComposition.builder()
                        .id("7103dc53-ee59-4b54-a58b-c77d99ceb037")
                        .completedAt(OffsetDateTime.parse("2022-02-25T05:39:56.377426Z"))
                        .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                        .downloadUrl("download_url")
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
                                            "video_sources" to listOf("*"),
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
                        .webhookEventUrl(
                            "https://webhook.site/544663ce-b692-4f9c-80ed-e5ad97cd5c02"
                        )
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .build()

        assertThat(roomCompositionCreateResponse.data())
            .contains(
                RoomComposition.builder()
                    .id("7103dc53-ee59-4b54-a58b-c77d99ceb037")
                    .completedAt(OffsetDateTime.parse("2022-02-25T05:39:56.377426Z"))
                    .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                    .downloadUrl("download_url")
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
                                        "video_sources" to listOf("*"),
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomCompositionCreateResponse =
            RoomCompositionCreateResponse.builder()
                .data(
                    RoomComposition.builder()
                        .id("7103dc53-ee59-4b54-a58b-c77d99ceb037")
                        .completedAt(OffsetDateTime.parse("2022-02-25T05:39:56.377426Z"))
                        .createdAt(OffsetDateTime.parse("2021-03-26T17:51:59.588408Z"))
                        .downloadUrl("download_url")
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
                                            "video_sources" to listOf("*"),
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
                        .webhookEventUrl(
                            "https://webhook.site/544663ce-b692-4f9c-80ed-e5ad97cd5c02"
                        )
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .build()

        val roundtrippedRoomCompositionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomCompositionCreateResponse),
                jacksonTypeRef<RoomCompositionCreateResponse>(),
            )

        assertThat(roundtrippedRoomCompositionCreateResponse)
            .isEqualTo(roomCompositionCreateResponse)
    }
}
