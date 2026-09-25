// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceRetrieveResponseTest {

    @Test
    fun create() {
        val sourceRetrieveResponse =
            SourceRetrieveResponse.builder()
                .data(
                    SourceRetrieveResponse.Data.builder()
                        .id("id")
                        .content(
                            SourceRetrieveResponse.Data.Content.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .memoryCount(0L)
                        .sessionId("session_id")
                        .createdAt("created_at")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(sourceRetrieveResponse.data())
            .isEqualTo(
                SourceRetrieveResponse.Data.builder()
                    .id("id")
                    .content(
                        SourceRetrieveResponse.Data.Content.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .memoryCount(0L)
                    .sessionId("session_id")
                    .createdAt("created_at")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceRetrieveResponse =
            SourceRetrieveResponse.builder()
                .data(
                    SourceRetrieveResponse.Data.builder()
                        .id("id")
                        .content(
                            SourceRetrieveResponse.Data.Content.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .memoryCount(0L)
                        .sessionId("session_id")
                        .createdAt("created_at")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedSourceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceRetrieveResponse),
                jacksonTypeRef<SourceRetrieveResponse>(),
            )

        assertThat(roundtrippedSourceRetrieveResponse).isEqualTo(sourceRetrieveResponse)
    }
}
