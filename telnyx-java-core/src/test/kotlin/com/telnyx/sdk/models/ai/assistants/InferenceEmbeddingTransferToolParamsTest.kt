// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceEmbeddingTransferToolParamsTest {

    @Test
    fun create() {
        val inferenceEmbeddingTransferToolParams =
            InferenceEmbeddingTransferToolParams.builder()
                .from("+35319605860")
                .addTarget(
                    InferenceEmbeddingTransferToolParams.Target.builder()
                        .name("Support")
                        .to("+13129457420")
                        .build()
                )
                .addCustomHeader(
                    InferenceEmbeddingTransferToolParams.CustomHeader.builder()
                        .name("name")
                        .value("value")
                        .build()
                )
                .warmTransferInstructions(
                    "Briefly greet the transfer recipient and provide any relevant information from the call. Let them know you will bridge the call right after."
                )
                .build()

        assertThat(inferenceEmbeddingTransferToolParams.from()).isEqualTo("+35319605860")
        assertThat(inferenceEmbeddingTransferToolParams.targets())
            .containsExactly(
                InferenceEmbeddingTransferToolParams.Target.builder()
                    .name("Support")
                    .to("+13129457420")
                    .build()
            )
        assertThat(inferenceEmbeddingTransferToolParams.customHeaders().getOrNull())
            .containsExactly(
                InferenceEmbeddingTransferToolParams.CustomHeader.builder()
                    .name("name")
                    .value("value")
                    .build()
            )
        assertThat(inferenceEmbeddingTransferToolParams.warmTransferInstructions())
            .contains(
                "Briefly greet the transfer recipient and provide any relevant information from the call. Let them know you will bridge the call right after."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceEmbeddingTransferToolParams =
            InferenceEmbeddingTransferToolParams.builder()
                .from("+35319605860")
                .addTarget(
                    InferenceEmbeddingTransferToolParams.Target.builder()
                        .name("Support")
                        .to("+13129457420")
                        .build()
                )
                .addCustomHeader(
                    InferenceEmbeddingTransferToolParams.CustomHeader.builder()
                        .name("name")
                        .value("value")
                        .build()
                )
                .warmTransferInstructions(
                    "Briefly greet the transfer recipient and provide any relevant information from the call. Let them know you will bridge the call right after."
                )
                .build()

        val roundtrippedInferenceEmbeddingTransferToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceEmbeddingTransferToolParams),
                jacksonTypeRef<InferenceEmbeddingTransferToolParams>(),
            )

        assertThat(roundtrippedInferenceEmbeddingTransferToolParams)
            .isEqualTo(inferenceEmbeddingTransferToolParams)
    }
}
