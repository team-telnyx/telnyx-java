// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceSettingsTest {

    @Test
    fun create() {
        val namespaceSettings =
            NamespaceSettings.builder()
                .summary(SummarySettings.builder().instructions("instructions").build())
                .build()

        assertThat(namespaceSettings.summary())
            .contains(SummarySettings.builder().instructions("instructions").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespaceSettings =
            NamespaceSettings.builder()
                .summary(SummarySettings.builder().instructions("instructions").build())
                .build()

        val roundtrippedNamespaceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespaceSettings),
                jacksonTypeRef<NamespaceSettings>(),
            )

        assertThat(roundtrippedNamespaceSettings).isEqualTo(namespaceSettings)
    }
}
