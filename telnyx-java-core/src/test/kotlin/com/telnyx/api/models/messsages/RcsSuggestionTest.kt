// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messsages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsSuggestionTest {

    @Test
    fun create() {
        val rcsSuggestion =
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
                                .application(RcsSuggestion.Action.OpenUrlAction.Application.BROWSER)
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
                    RcsSuggestion.Reply.builder().postbackData("postback_data").text("text").build()
                )
                .build()

        assertThat(rcsSuggestion.action())
            .contains(
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
                            .application(RcsSuggestion.Action.OpenUrlAction.Application.BROWSER)
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
        assertThat(rcsSuggestion.reply())
            .contains(
                RcsSuggestion.Reply.builder().postbackData("postback_data").text("text").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsSuggestion =
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
                                .application(RcsSuggestion.Action.OpenUrlAction.Application.BROWSER)
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
                    RcsSuggestion.Reply.builder().postbackData("postback_data").text("text").build()
                )
                .build()

        val roundtrippedRcsSuggestion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsSuggestion),
                jacksonTypeRef<RcsSuggestion>(),
            )

        assertThat(roundtrippedRcsSuggestion).isEqualTo(rcsSuggestion)
    }
}
