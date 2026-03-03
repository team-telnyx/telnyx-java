// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChildRelationshipInfoTest {

    @Test
    fun create() {
        val childRelationshipInfo =
            ChildRelationshipInfo.builder()
                .childEvent("child_event")
                .childProduct("child_product")
                .childRecordType("child_record_type")
                .costRollup(true)
                .description("description")
                .relationshipType("relationship_type")
                .traversalEnabled(true)
                .via(
                    MetadataFieldMapping.builder()
                        .localField("local_field")
                        .parentField("parent_field")
                        .build()
                )
                .build()

        assertThat(childRelationshipInfo.childEvent()).isEqualTo("child_event")
        assertThat(childRelationshipInfo.childProduct()).isEqualTo("child_product")
        assertThat(childRelationshipInfo.childRecordType()).isEqualTo("child_record_type")
        assertThat(childRelationshipInfo.costRollup()).isEqualTo(true)
        assertThat(childRelationshipInfo.description()).isEqualTo("description")
        assertThat(childRelationshipInfo.relationshipType()).isEqualTo("relationship_type")
        assertThat(childRelationshipInfo.traversalEnabled()).isEqualTo(true)
        assertThat(childRelationshipInfo.via())
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
        val childRelationshipInfo =
            ChildRelationshipInfo.builder()
                .childEvent("child_event")
                .childProduct("child_product")
                .childRecordType("child_record_type")
                .costRollup(true)
                .description("description")
                .relationshipType("relationship_type")
                .traversalEnabled(true)
                .via(
                    MetadataFieldMapping.builder()
                        .localField("local_field")
                        .parentField("parent_field")
                        .build()
                )
                .build()

        val roundtrippedChildRelationshipInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(childRelationshipInfo),
                jacksonTypeRef<ChildRelationshipInfo>(),
            )

        assertThat(roundtrippedChildRelationshipInfo).isEqualTo(childRelationshipInfo)
    }
}
