// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventNodeTest {

    @Test
    fun create() {
        val eventNode =
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

        assertThat(eventNode.id()).isEqualTo("id")
        assertThat(eventNode.children()).containsExactly()
        assertThat(eventNode.cost())
            .isEqualTo(
                EventNode.Cost.builder()
                    .cumulativeCost("cumulative_cost")
                    .currency("currency")
                    .eventCost("event_cost")
                    .build()
            )
        assertThat(eventNode.eventName()).isEqualTo("event_name")
        assertThat(eventNode.links())
            .isEqualTo(EventNode.Links.builder().records("records").self("self").build())
        assertThat(eventNode.product()).isEqualTo("product")
        assertThat(eventNode.record())
            .isEqualTo(
                EventNode.Record.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(eventNode.relationship())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventNode =
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

        val roundtrippedEventNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventNode),
                jacksonTypeRef<EventNode>(),
            )

        assertThat(roundtrippedEventNode).isEqualTo(eventNode)
    }
}
