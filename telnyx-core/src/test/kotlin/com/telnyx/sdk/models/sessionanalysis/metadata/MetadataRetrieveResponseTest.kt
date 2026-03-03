// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataRetrieveResponseTest {

    @Test
    fun create() {
        val metadataRetrieveResponse =
            MetadataRetrieveResponse.builder()
                .meta(
                    MetadataRetrieveResponse.Meta.builder()
                        .lastUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalRecordTypes(0L)
                        .build()
                )
                .queryParameters(
                    MetadataRetrieveResponse.QueryParameters.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "default" to "default",
                                    "description" to "description",
                                    "type" to "type",
                                    "enum_values" to listOf("string"),
                                    "max" to 0,
                                    "min" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .addRecordType(
                    MetadataRetrieveResponse.RecordType.builder()
                        .addAlias("string")
                        .addChildRelationship(
                            MetadataRetrieveResponse.RecordType.ChildRelationship.builder()
                                .childEvent("child_event")
                                .childProduct("child_product")
                                .childRecordType("child_record_type")
                                .costRollup(true)
                                .description("description")
                                .relationshipType("relationship_type")
                                .traversalEnabled(true)
                                .via(
                                    MetadataRetrieveResponse.RecordType.ChildRelationship.Via
                                        .builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .description("description")
                        .event("event")
                        .addParentRelationship(
                            MetadataRetrieveResponse.RecordType.ParentRelationship.builder()
                                .costRollup(true)
                                .description("description")
                                .parentEvent("parent_event")
                                .parentProduct("parent_product")
                                .parentRecordType("parent_record_type")
                                .relationshipType("relationship_type")
                                .traversalEnabled(true)
                                .via(
                                    MetadataRetrieveResponse.RecordType.ParentRelationship.Via
                                        .builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .product("product")
                        .recordType("record_type")
                        .build()
                )
                .build()

        assertThat(metadataRetrieveResponse.meta())
            .isEqualTo(
                MetadataRetrieveResponse.Meta.builder()
                    .lastUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .totalRecordTypes(0L)
                    .build()
            )
        assertThat(metadataRetrieveResponse.queryParameters())
            .isEqualTo(
                MetadataRetrieveResponse.QueryParameters.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "default" to "default",
                                "description" to "description",
                                "type" to "type",
                                "enum_values" to listOf("string"),
                                "max" to 0,
                                "min" to 0,
                            )
                        ),
                    )
                    .build()
            )
        assertThat(metadataRetrieveResponse.recordTypes())
            .containsExactly(
                MetadataRetrieveResponse.RecordType.builder()
                    .addAlias("string")
                    .addChildRelationship(
                        MetadataRetrieveResponse.RecordType.ChildRelationship.builder()
                            .childEvent("child_event")
                            .childProduct("child_product")
                            .childRecordType("child_record_type")
                            .costRollup(true)
                            .description("description")
                            .relationshipType("relationship_type")
                            .traversalEnabled(true)
                            .via(
                                MetadataRetrieveResponse.RecordType.ChildRelationship.Via.builder()
                                    .localField("local_field")
                                    .parentField("parent_field")
                                    .build()
                            )
                            .build()
                    )
                    .description("description")
                    .event("event")
                    .addParentRelationship(
                        MetadataRetrieveResponse.RecordType.ParentRelationship.builder()
                            .costRollup(true)
                            .description("description")
                            .parentEvent("parent_event")
                            .parentProduct("parent_product")
                            .parentRecordType("parent_record_type")
                            .relationshipType("relationship_type")
                            .traversalEnabled(true)
                            .via(
                                MetadataRetrieveResponse.RecordType.ParentRelationship.Via.builder()
                                    .localField("local_field")
                                    .parentField("parent_field")
                                    .build()
                            )
                            .build()
                    )
                    .product("product")
                    .recordType("record_type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadataRetrieveResponse =
            MetadataRetrieveResponse.builder()
                .meta(
                    MetadataRetrieveResponse.Meta.builder()
                        .lastUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .totalRecordTypes(0L)
                        .build()
                )
                .queryParameters(
                    MetadataRetrieveResponse.QueryParameters.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "default" to "default",
                                    "description" to "description",
                                    "type" to "type",
                                    "enum_values" to listOf("string"),
                                    "max" to 0,
                                    "min" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .addRecordType(
                    MetadataRetrieveResponse.RecordType.builder()
                        .addAlias("string")
                        .addChildRelationship(
                            MetadataRetrieveResponse.RecordType.ChildRelationship.builder()
                                .childEvent("child_event")
                                .childProduct("child_product")
                                .childRecordType("child_record_type")
                                .costRollup(true)
                                .description("description")
                                .relationshipType("relationship_type")
                                .traversalEnabled(true)
                                .via(
                                    MetadataRetrieveResponse.RecordType.ChildRelationship.Via
                                        .builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .description("description")
                        .event("event")
                        .addParentRelationship(
                            MetadataRetrieveResponse.RecordType.ParentRelationship.builder()
                                .costRollup(true)
                                .description("description")
                                .parentEvent("parent_event")
                                .parentProduct("parent_product")
                                .parentRecordType("parent_record_type")
                                .relationshipType("relationship_type")
                                .traversalEnabled(true)
                                .via(
                                    MetadataRetrieveResponse.RecordType.ParentRelationship.Via
                                        .builder()
                                        .localField("local_field")
                                        .parentField("parent_field")
                                        .build()
                                )
                                .build()
                        )
                        .product("product")
                        .recordType("record_type")
                        .build()
                )
                .build()

        val roundtrippedMetadataRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadataRetrieveResponse),
                jacksonTypeRef<MetadataRetrieveResponse>(),
            )

        assertThat(roundtrippedMetadataRetrieveResponse).isEqualTo(metadataRetrieveResponse)
    }
}
