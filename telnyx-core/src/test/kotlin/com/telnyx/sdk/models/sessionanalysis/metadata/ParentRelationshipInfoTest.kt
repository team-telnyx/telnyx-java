// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParentRelationshipInfoTest {

    @Test
    fun create() {
        val parentRelationshipInfo =
            ParentRelationshipInfo.builder()
                .costRollup(true)
                .description("description")
                .parentEvent("parent_event")
                .parentProduct("parent_product")
                .parentRecordType("parent_record_type")
                .relationshipType("relationship_type")
                .traversalEnabled(true)
                .via(
                    MetadataFieldMapping.builder()
                        .localField("local_field")
                        .parentField("parent_field")
                        .build()
                )
                .build()

        assertThat(parentRelationshipInfo.costRollup()).isEqualTo(true)
        assertThat(parentRelationshipInfo.description()).isEqualTo("description")
        assertThat(parentRelationshipInfo.parentEvent()).isEqualTo("parent_event")
        assertThat(parentRelationshipInfo.parentProduct()).isEqualTo("parent_product")
        assertThat(parentRelationshipInfo.parentRecordType()).isEqualTo("parent_record_type")
        assertThat(parentRelationshipInfo.relationshipType()).isEqualTo("relationship_type")
        assertThat(parentRelationshipInfo.traversalEnabled()).isEqualTo(true)
        assertThat(parentRelationshipInfo.via())
            .isEqualTo(
                MetadataFieldMapping.builder()
                    .localField("local_field")
                    .parentField("parent_field")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parentRelationshipInfo =
            ParentRelationshipInfo.builder()
                .costRollup(true)
                .description("description")
                .parentEvent("parent_event")
                .parentProduct("parent_product")
                .parentRecordType("parent_record_type")
                .relationshipType("relationship_type")
                .traversalEnabled(true)
                .via(
                    MetadataFieldMapping.builder()
                        .localField("local_field")
                        .parentField("parent_field")
                        .build()
                )
                .build()

        val roundtrippedParentRelationshipInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parentRelationshipInfo),
                jacksonTypeRef<ParentRelationshipInfo>(),
            )

        assertThat(roundtrippedParentRelationshipInfo).isEqualTo(parentRelationshipInfo)
    }
}
