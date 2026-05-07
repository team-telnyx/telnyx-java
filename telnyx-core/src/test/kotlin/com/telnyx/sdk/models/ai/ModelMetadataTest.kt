// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelMetadataTest {

    @Test
    fun create() {
        val modelMetadata =
            ModelMetadata.builder()
                .id("id")
                .created(0L)
                .ownedBy("owned_by")
                .modelObject("object")
                .build()

        assertThat(modelMetadata.id()).isEqualTo("id")
        assertThat(modelMetadata.created()).isEqualTo(0L)
        assertThat(modelMetadata.ownedBy()).isEqualTo("owned_by")
        assertThat(modelMetadata.modelObject()).contains("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelMetadata =
            ModelMetadata.builder()
                .id("id")
                .created(0L)
                .ownedBy("owned_by")
                .modelObject("object")
                .build()

        val roundtrippedModelMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelMetadata),
                jacksonTypeRef<ModelMetadata>(),
            )

        assertThat(roundtrippedModelMetadata).isEqualTo(modelMetadata)
    }
}
