// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiRetrieveModelsResponseTest {

    @Test
    fun create() {
        val aiRetrieveModelsResponse =
            AiRetrieveModelsResponse.builder()
                .addData(
                    AiRetrieveModelsResponse.Data.builder()
                        .id("id")
                        .created(0L)
                        .ownedBy("owned_by")
                        .object_("object")
                        .build()
                )
                .object_("object")
                .build()

        assertThat(aiRetrieveModelsResponse.data())
            .containsExactly(
                AiRetrieveModelsResponse.Data.builder()
                    .id("id")
                    .created(0L)
                    .ownedBy("owned_by")
                    .object_("object")
                    .build()
            )
        assertThat(aiRetrieveModelsResponse.object_()).contains("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiRetrieveModelsResponse =
            AiRetrieveModelsResponse.builder()
                .addData(
                    AiRetrieveModelsResponse.Data.builder()
                        .id("id")
                        .created(0L)
                        .ownedBy("owned_by")
                        .object_("object")
                        .build()
                )
                .object_("object")
                .build()

        val roundtrippedAiRetrieveModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiRetrieveModelsResponse),
                jacksonTypeRef<AiRetrieveModelsResponse>(),
            )

        assertThat(roundtrippedAiRetrieveModelsResponse).isEqualTo(aiRetrieveModelsResponse)
    }
}
