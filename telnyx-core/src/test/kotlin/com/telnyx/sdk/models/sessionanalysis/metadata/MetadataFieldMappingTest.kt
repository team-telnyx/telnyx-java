// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.sessionanalysis.metadata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataFieldMappingTest {

    @Test
    fun create() {
        val metadataFieldMapping =
            MetadataFieldMapping.builder()
                .localField("local_field")
                .parentField("parent_field")
                .build()

        assertThat(metadataFieldMapping.localField()).isEqualTo("local_field")
        assertThat(metadataFieldMapping.parentField()).isEqualTo("parent_field")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadataFieldMapping =
            MetadataFieldMapping.builder()
                .localField("local_field")
                .parentField("parent_field")
                .build()

        val roundtrippedMetadataFieldMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadataFieldMapping),
                jacksonTypeRef<MetadataFieldMapping>(),
            )

        assertThat(roundtrippedMetadataFieldMapping).isEqualTo(metadataFieldMapping)
    }
}
