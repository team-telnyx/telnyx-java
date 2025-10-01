// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messsages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsCardContentTest {

    @Test
    fun create() {
        val rcsCardContent =
            RcsCardContent.builder()
                .description("description")
                .media(
                    RcsCardContent.Media.builder()
                        .contentInfo(
                            RcsContentInfo.builder()
                                .fileUrl("https://example.com/elephant.jpg")
                                .forceRefresh(true)
                                .thumbnailUrl("thumbnail_url")
                                .build()
                        )
                        .height(RcsCardContent.Media.Height.MEDIUM)
                        .build()
                )
                .addSuggestion(
                    RcsSuggestion.builder()
                        .action(
                            RcsSuggestion.Action.builder()
                                .createCalendarEventAction(
                                    RcsSuggestion.Action.CreateCalendarEventAction.builder()
                                        .description("description")
                                        .endTime(OffsetDateTime.parse("2024-10-02T15:02:31Z"))
                                        .startTime(OffsetDateTime.parse("2024-10-02T15:01:23Z"))
                                        .title("title")
                                        .build()
                                )
                                .dialAction(
                                    RcsSuggestion.Action.DialAction.builder()
                                        .phoneNumber("+13125551234")
                                        .build()
                                )
                                .fallbackUrl("fallback_url")
                                .openUrlAction(
                                    RcsSuggestion.Action.OpenUrlAction.builder()
                                        .application(
                                            RcsSuggestion.Action.OpenUrlAction.Application.BROWSER
                                        )
                                        .url("http://example.com")
                                        .webviewViewMode(
                                            RcsSuggestion.Action.OpenUrlAction.WebviewViewMode.HALF
                                        )
                                        .description("description")
                                        .build()
                                )
                                .postbackData("postback_data")
                                .shareLocationAction(JsonValue.from(mapOf<String, Any>()))
                                .text("Hello world")
                                .viewLocationAction(
                                    RcsSuggestion.Action.ViewLocationAction.builder()
                                        .label("label")
                                        .latLong(
                                            RcsSuggestion.Action.ViewLocationAction.LatLong
                                                .builder()
                                                .latitude(41.8)
                                                .longitude(-87.6)
                                                .build()
                                        )
                                        .query("query")
                                        .build()
                                )
                                .build()
                        )
                        .reply(
                            RcsSuggestion.Reply.builder()
                                .postbackData("postback_data")
                                .text("text")
                                .build()
                        )
                        .build()
                )
                .title("Elephant")
                .build()

        assertThat(rcsCardContent.description()).contains("description")
        assertThat(rcsCardContent.media())
            .contains(
                RcsCardContent.Media.builder()
                    .contentInfo(
                        RcsContentInfo.builder()
                            .fileUrl("https://example.com/elephant.jpg")
                            .forceRefresh(true)
                            .thumbnailUrl("thumbnail_url")
                            .build()
                    )
                    .height(RcsCardContent.Media.Height.MEDIUM)
                    .build()
            )
        assertThat(rcsCardContent.suggestions().getOrNull())
            .containsExactly(
                RcsSuggestion.builder()
                    .action(
                        RcsSuggestion.Action.builder()
                            .createCalendarEventAction(
                                RcsSuggestion.Action.CreateCalendarEventAction.builder()
                                    .description("description")
                                    .endTime(OffsetDateTime.parse("2024-10-02T15:02:31Z"))
                                    .startTime(OffsetDateTime.parse("2024-10-02T15:01:23Z"))
                                    .title("title")
                                    .build()
                            )
                            .dialAction(
                                RcsSuggestion.Action.DialAction.builder()
                                    .phoneNumber("+13125551234")
                                    .build()
                            )
                            .fallbackUrl("fallback_url")
                            .openUrlAction(
                                RcsSuggestion.Action.OpenUrlAction.builder()
                                    .application(
                                        RcsSuggestion.Action.OpenUrlAction.Application.BROWSER
                                    )
                                    .url("http://example.com")
                                    .webviewViewMode(
                                        RcsSuggestion.Action.OpenUrlAction.WebviewViewMode.HALF
                                    )
                                    .description("description")
                                    .build()
                            )
                            .postbackData("postback_data")
                            .shareLocationAction(JsonValue.from(mapOf<String, Any>()))
                            .text("Hello world")
                            .viewLocationAction(
                                RcsSuggestion.Action.ViewLocationAction.builder()
                                    .label("label")
                                    .latLong(
                                        RcsSuggestion.Action.ViewLocationAction.LatLong.builder()
                                            .latitude(41.8)
                                            .longitude(-87.6)
                                            .build()
                                    )
                                    .query("query")
                                    .build()
                            )
                            .build()
                    )
                    .reply(
                        RcsSuggestion.Reply.builder()
                            .postbackData("postback_data")
                            .text("text")
                            .build()
                    )
                    .build()
            )
        assertThat(rcsCardContent.title()).contains("Elephant")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsCardContent =
            RcsCardContent.builder()
                .description("description")
                .media(
                    RcsCardContent.Media.builder()
                        .contentInfo(
                            RcsContentInfo.builder()
                                .fileUrl("https://example.com/elephant.jpg")
                                .forceRefresh(true)
                                .thumbnailUrl("thumbnail_url")
                                .build()
                        )
                        .height(RcsCardContent.Media.Height.MEDIUM)
                        .build()
                )
                .addSuggestion(
                    RcsSuggestion.builder()
                        .action(
                            RcsSuggestion.Action.builder()
                                .createCalendarEventAction(
                                    RcsSuggestion.Action.CreateCalendarEventAction.builder()
                                        .description("description")
                                        .endTime(OffsetDateTime.parse("2024-10-02T15:02:31Z"))
                                        .startTime(OffsetDateTime.parse("2024-10-02T15:01:23Z"))
                                        .title("title")
                                        .build()
                                )
                                .dialAction(
                                    RcsSuggestion.Action.DialAction.builder()
                                        .phoneNumber("+13125551234")
                                        .build()
                                )
                                .fallbackUrl("fallback_url")
                                .openUrlAction(
                                    RcsSuggestion.Action.OpenUrlAction.builder()
                                        .application(
                                            RcsSuggestion.Action.OpenUrlAction.Application.BROWSER
                                        )
                                        .url("http://example.com")
                                        .webviewViewMode(
                                            RcsSuggestion.Action.OpenUrlAction.WebviewViewMode.HALF
                                        )
                                        .description("description")
                                        .build()
                                )
                                .postbackData("postback_data")
                                .shareLocationAction(JsonValue.from(mapOf<String, Any>()))
                                .text("Hello world")
                                .viewLocationAction(
                                    RcsSuggestion.Action.ViewLocationAction.builder()
                                        .label("label")
                                        .latLong(
                                            RcsSuggestion.Action.ViewLocationAction.LatLong
                                                .builder()
                                                .latitude(41.8)
                                                .longitude(-87.6)
                                                .build()
                                        )
                                        .query("query")
                                        .build()
                                )
                                .build()
                        )
                        .reply(
                            RcsSuggestion.Reply.builder()
                                .postbackData("postback_data")
                                .text("text")
                                .build()
                        )
                        .build()
                )
                .title("Elephant")
                .build()

        val roundtrippedRcsCardContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsCardContent),
                jacksonTypeRef<RcsCardContent>(),
            )

        assertThat(roundtrippedRcsCardContent).isEqualTo(rcsCardContent)
    }
}
