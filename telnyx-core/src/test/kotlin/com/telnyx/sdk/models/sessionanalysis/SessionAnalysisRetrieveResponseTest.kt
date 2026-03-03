// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionAnalysisRetrieveResponseTest {

    @Test
    fun create() {
        val sessionAnalysisRetrieveResponse =
            SessionAnalysisRetrieveResponse.builder()
                .cost(
                    SessionAnalysisRetrieveResponse.Cost.builder()
                        .currency("currency")
                        .total("total")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .meta(
                    SessionAnalysisRetrieveResponse.Meta.builder()
                        .eventCount(0L)
                        .addProduct("string")
                        .build()
                )
                .root(
                    SessionAnalysisRetrieveResponse.Root.builder()
                        .id("id")
                        .addChild(JsonValue.from(mapOf<String, Any>()))
                        .cost(
                            SessionAnalysisRetrieveResponse.Root.Cost.builder()
                                .cumulativeCost("cumulative_cost")
                                .currency("currency")
                                .eventCost("event_cost")
                                .build()
                        )
                        .eventName("event_name")
                        .links(
                            SessionAnalysisRetrieveResponse.Root.Links.builder()
                                .records("records")
                                .self("self")
                                .build()
                        )
                        .product("product")
                        .record(
                            SessionAnalysisRetrieveResponse.Root.Record.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .relationship(
                            SessionAnalysisRetrieveResponse.Root.Relationship.builder()
                                .parentId("parent_id")
                                .type("type")
                                .via(
                                    SessionAnalysisRetrieveResponse.Root.Relationship.Via.builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .sessionId("session_id")
                .status("status")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(sessionAnalysisRetrieveResponse.cost())
            .isEqualTo(
                SessionAnalysisRetrieveResponse.Cost.builder()
                    .currency("currency")
                    .total("total")
                    .build()
            )
        assertThat(sessionAnalysisRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sessionAnalysisRetrieveResponse.meta())
            .isEqualTo(
                SessionAnalysisRetrieveResponse.Meta.builder()
                    .eventCount(0L)
                    .addProduct("string")
                    .build()
            )
        assertThat(sessionAnalysisRetrieveResponse.root())
            .isEqualTo(
                SessionAnalysisRetrieveResponse.Root.builder()
                    .id("id")
                    .addChild(JsonValue.from(mapOf<String, Any>()))
                    .cost(
                        SessionAnalysisRetrieveResponse.Root.Cost.builder()
                            .cumulativeCost("cumulative_cost")
                            .currency("currency")
                            .eventCost("event_cost")
                            .build()
                    )
                    .eventName("event_name")
                    .links(
                        SessionAnalysisRetrieveResponse.Root.Links.builder()
                            .records("records")
                            .self("self")
                            .build()
                    )
                    .product("product")
                    .record(
                        SessionAnalysisRetrieveResponse.Root.Record.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .relationship(
                        SessionAnalysisRetrieveResponse.Root.Relationship.builder()
                            .parentId("parent_id")
                            .type("type")
                            .via(
                                SessionAnalysisRetrieveResponse.Root.Relationship.Via.builder()
                                    .localField("local_field")
                                    .parentField("parent_field")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(sessionAnalysisRetrieveResponse.sessionId()).isEqualTo("session_id")
        assertThat(sessionAnalysisRetrieveResponse.status()).isEqualTo("status")
        assertThat(sessionAnalysisRetrieveResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionAnalysisRetrieveResponse =
            SessionAnalysisRetrieveResponse.builder()
                .cost(
                    SessionAnalysisRetrieveResponse.Cost.builder()
                        .currency("currency")
                        .total("total")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .meta(
                    SessionAnalysisRetrieveResponse.Meta.builder()
                        .eventCount(0L)
                        .addProduct("string")
                        .build()
                )
                .root(
                    SessionAnalysisRetrieveResponse.Root.builder()
                        .id("id")
                        .addChild(JsonValue.from(mapOf<String, Any>()))
                        .cost(
                            SessionAnalysisRetrieveResponse.Root.Cost.builder()
                                .cumulativeCost("cumulative_cost")
                                .currency("currency")
                                .eventCost("event_cost")
                                .build()
                        )
                        .eventName("event_name")
                        .links(
                            SessionAnalysisRetrieveResponse.Root.Links.builder()
                                .records("records")
                                .self("self")
                                .build()
                        )
                        .product("product")
                        .record(
                            SessionAnalysisRetrieveResponse.Root.Record.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .relationship(
                            SessionAnalysisRetrieveResponse.Root.Relationship.builder()
                                .parentId("parent_id")
                                .type("type")
                                .via(
                                    SessionAnalysisRetrieveResponse.Root.Relationship.Via.builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .sessionId("session_id")
                .status("status")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSessionAnalysisRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionAnalysisRetrieveResponse),
                jacksonTypeRef<SessionAnalysisRetrieveResponse>(),
            )

        assertThat(roundtrippedSessionAnalysisRetrieveResponse)
            .isEqualTo(sessionAnalysisRetrieveResponse)
    }
}
