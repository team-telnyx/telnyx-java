// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceSettingsResponseTest {

    @Test
    fun create() {
        val namespaceSettingsResponse =
            NamespaceSettingsResponse.builder()
                .data(
                    NamespaceSettingsResponse.Data.builder()
                        .summary(
                            NamespaceSettingsResponse.Data.Summary.builder()
                                .instructions("instructions")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(namespaceSettingsResponse.data())
            .isEqualTo(
                NamespaceSettingsResponse.Data.builder()
                    .summary(
                        NamespaceSettingsResponse.Data.Summary.builder()
                            .instructions("instructions")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespaceSettingsResponse =
            NamespaceSettingsResponse.builder()
                .data(
                    NamespaceSettingsResponse.Data.builder()
                        .summary(
                            NamespaceSettingsResponse.Data.Summary.builder()
                                .instructions("instructions")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedNamespaceSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespaceSettingsResponse),
                jacksonTypeRef<NamespaceSettingsResponse>(),
            )

        assertThat(roundtrippedNamespaceSettingsResponse).isEqualTo(namespaceSettingsResponse)
    }
}
