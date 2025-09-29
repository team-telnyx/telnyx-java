// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportMetadataTest {

    @Test
    fun create() {
        val importMetadata =
            ImportMetadata.builder()
                .importId("import_id")
                .importProvider(ImportMetadata.ImportProvider.ELEVENLABS)
                .build()

        assertThat(importMetadata.importId()).contains("import_id")
        assertThat(importMetadata.importProvider())
            .contains(ImportMetadata.ImportProvider.ELEVENLABS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importMetadata =
            ImportMetadata.builder()
                .importId("import_id")
                .importProvider(ImportMetadata.ImportProvider.ELEVENLABS)
                .build()

        val roundtrippedImportMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(importMetadata),
                jacksonTypeRef<ImportMetadata>(),
            )

        assertThat(roundtrippedImportMetadata).isEqualTo(importMetadata)
    }
}
