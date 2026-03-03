// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataRetrieveRecordTypeResponseTest {

    @Test
    fun create() {
        val metadataRetrieveRecordTypeResponse =
            MetadataRetrieveRecordTypeResponse.builder()
                .addAlias("string")
                .addChildRelationship(
                    MetadataRetrieveRecordTypeResponse.ChildRelationship.builder()
                        .childEvent("child_event")
                        .childProduct("child_product")
                        .childRecordType("child_record_type")
                        .costRollup(true)
                        .description("description")
                        .relationshipType("relationship_type")
                        .traversalEnabled(true)
                        .via(
                            MetadataRetrieveRecordTypeResponse.ChildRelationship.Via.builder()
                                .localField("local_field")
                                .parentField("parent_field")
                                .build()
                        )
                        .build()
                )
                .event("event")
                .examples(
                    MetadataRetrieveRecordTypeResponse.Examples.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .meta(
                    MetadataRetrieveRecordTypeResponse.Meta.builder()
                        .maxRecommendedDepth(0L)
                        .totalChildren(0L)
                        .totalParents(0L)
                        .totalSiblings(0L)
                        .build()
                )
                .addParentRelationship(
                    MetadataRetrieveRecordTypeResponse.ParentRelationship.builder()
                        .costRollup(true)
                        .description("description")
                        .parentEvent("parent_event")
                        .parentProduct("parent_product")
                        .parentRecordType("parent_record_type")
                        .relationshipType("relationship_type")
                        .traversalEnabled(true)
                        .via(
                            MetadataRetrieveRecordTypeResponse.ParentRelationship.Via.builder()
                                .localField("local_field")
                                .parentField("parent_field")
                                .build()
                        )
                        .build()
                )
                .product("product")
                .recordType("record_type")
                .build()

        assertThat(metadataRetrieveRecordTypeResponse.aliases()).containsExactly("string")
        assertThat(metadataRetrieveRecordTypeResponse.childRelationships())
            .containsExactly(
                MetadataRetrieveRecordTypeResponse.ChildRelationship.builder()
                    .childEvent("child_event")
                    .childProduct("child_product")
                    .childRecordType("child_record_type")
                    .costRollup(true)
                    .description("description")
                    .relationshipType("relationship_type")
                    .traversalEnabled(true)
                    .via(
                        MetadataRetrieveRecordTypeResponse.ChildRelationship.Via.builder()
                            .localField("local_field")
                            .parentField("parent_field")
                            .build()
                    )
                    .build()
            )
        assertThat(metadataRetrieveRecordTypeResponse.event()).isEqualTo("event")
        assertThat(metadataRetrieveRecordTypeResponse.examples())
            .isEqualTo(
                MetadataRetrieveRecordTypeResponse.Examples.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(metadataRetrieveRecordTypeResponse.meta())
            .isEqualTo(
                MetadataRetrieveRecordTypeResponse.Meta.builder()
                    .maxRecommendedDepth(0L)
                    .totalChildren(0L)
                    .totalParents(0L)
                    .totalSiblings(0L)
                    .build()
            )
        assertThat(metadataRetrieveRecordTypeResponse.parentRelationships())
            .containsExactly(
                MetadataRetrieveRecordTypeResponse.ParentRelationship.builder()
                    .costRollup(true)
                    .description("description")
                    .parentEvent("parent_event")
                    .parentProduct("parent_product")
                    .parentRecordType("parent_record_type")
                    .relationshipType("relationship_type")
                    .traversalEnabled(true)
                    .via(
                        MetadataRetrieveRecordTypeResponse.ParentRelationship.Via.builder()
                            .localField("local_field")
                            .parentField("parent_field")
                            .build()
                    )
                    .build()
            )
        assertThat(metadataRetrieveRecordTypeResponse.product()).isEqualTo("product")
        assertThat(metadataRetrieveRecordTypeResponse.recordType()).isEqualTo("record_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadataRetrieveRecordTypeResponse =
            MetadataRetrieveRecordTypeResponse.builder()
                .addAlias("string")
                .addChildRelationship(
                    MetadataRetrieveRecordTypeResponse.ChildRelationship.builder()
                        .childEvent("child_event")
                        .childProduct("child_product")
                        .childRecordType("child_record_type")
                        .costRollup(true)
                        .description("description")
                        .relationshipType("relationship_type")
                        .traversalEnabled(true)
                        .via(
                            MetadataRetrieveRecordTypeResponse.ChildRelationship.Via.builder()
                                .localField("local_field")
                                .parentField("parent_field")
                                .build()
                        )
                        .build()
                )
                .event("event")
                .examples(
                    MetadataRetrieveRecordTypeResponse.Examples.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .meta(
                    MetadataRetrieveRecordTypeResponse.Meta.builder()
                        .maxRecommendedDepth(0L)
                        .totalChildren(0L)
                        .totalParents(0L)
                        .totalSiblings(0L)
                        .build()
                )
                .addParentRelationship(
                    MetadataRetrieveRecordTypeResponse.ParentRelationship.builder()
                        .costRollup(true)
                        .description("description")
                        .parentEvent("parent_event")
                        .parentProduct("parent_product")
                        .parentRecordType("parent_record_type")
                        .relationshipType("relationship_type")
                        .traversalEnabled(true)
                        .via(
                            MetadataRetrieveRecordTypeResponse.ParentRelationship.Via.builder()
                                .localField("local_field")
                                .parentField("parent_field")
                                .build()
                        )
                        .build()
                )
                .product("product")
                .recordType("record_type")
                .build()

        val roundtrippedMetadataRetrieveRecordTypeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadataRetrieveRecordTypeResponse),
                jacksonTypeRef<MetadataRetrieveRecordTypeResponse>(),
            )

        assertThat(roundtrippedMetadataRetrieveRecordTypeResponse)
            .isEqualTo(metadataRetrieveRecordTypeResponse)
    }
}
