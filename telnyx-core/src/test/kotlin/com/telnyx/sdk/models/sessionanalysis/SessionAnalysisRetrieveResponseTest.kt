// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
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
                .meta(
                    SessionAnalysisRetrieveResponse.Meta.builder()
                        .eventCount(0L)
                        .addProduct("string")
                        .build()
                )
                .root(
                    EventNode.builder()
                        .id("id")
                        .children(listOf())
                        .cost(
                            EventNode.Cost.builder()
                                .cumulativeCost("cumulative_cost")
                                .currency("currency")
                                .eventCost("event_cost")
                                .build()
                        )
                        .eventName("event_name")
                        .links(EventNode.Links.builder().records("records").self("self").build())
                        .product("product")
                        .record(
                            EventNode.Record.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .relationship(
                            EventNode.Relationship.builder()
                                .parentId("parent_id")
                                .type("type")
                                .via(
                                    EventNode.Relationship.Via.builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .sessionId("session_id")
                .build()

        assertThat(sessionAnalysisRetrieveResponse.cost())
            .isEqualTo(
                SessionAnalysisRetrieveResponse.Cost.builder()
                    .currency("currency")
                    .total("total")
                    .build()
            )
        assertThat(sessionAnalysisRetrieveResponse.meta())
            .isEqualTo(
                SessionAnalysisRetrieveResponse.Meta.builder()
                    .eventCount(0L)
                    .addProduct("string")
                    .build()
            )
        assertThat(sessionAnalysisRetrieveResponse.root())
            .isEqualTo(
                EventNode.builder()
                    .id("id")
                    .children(listOf())
                    .cost(
                        EventNode.Cost.builder()
                            .cumulativeCost("cumulative_cost")
                            .currency("currency")
                            .eventCost("event_cost")
                            .build()
                    )
                    .eventName("event_name")
                    .links(EventNode.Links.builder().records("records").self("self").build())
                    .product("product")
                    .record(
                        EventNode.Record.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .relationship(
                        EventNode.Relationship.builder()
                            .parentId("parent_id")
                            .type("type")
                            .via(
                                EventNode.Relationship.Via.builder()
                                    .localField("local_field")
                                    .parentField("parent_field")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(sessionAnalysisRetrieveResponse.sessionId()).isEqualTo("session_id")
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
                .meta(
                    SessionAnalysisRetrieveResponse.Meta.builder()
                        .eventCount(0L)
                        .addProduct("string")
                        .build()
                )
                .root(
                    EventNode.builder()
                        .id("id")
                        .children(listOf())
                        .cost(
                            EventNode.Cost.builder()
                                .cumulativeCost("cumulative_cost")
                                .currency("currency")
                                .eventCost("event_cost")
                                .build()
                        )
                        .eventName("event_name")
                        .links(EventNode.Links.builder().records("records").self("self").build())
                        .product("product")
                        .record(
                            EventNode.Record.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .relationship(
                            EventNode.Relationship.builder()
                                .parentId("parent_id")
                                .type("type")
                                .via(
                                    EventNode.Relationship.Via.builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .sessionId("session_id")
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
