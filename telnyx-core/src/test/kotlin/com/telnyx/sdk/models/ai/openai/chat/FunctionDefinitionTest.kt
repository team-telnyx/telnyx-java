// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionDefinitionTest {

    @Test
    fun create() {
        val functionDefinition =
            FunctionDefinition.builder()
                .name("name")
                .description("description")
                .parameters(
                    FunctionDefinition.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(functionDefinition.name()).isEqualTo("name")
        assertThat(functionDefinition.description()).contains("description")
        assertThat(functionDefinition.parameters())
            .contains(
                FunctionDefinition.Parameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionDefinition =
            FunctionDefinition.builder()
                .name("name")
                .description("description")
                .parameters(
                    FunctionDefinition.Parameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedFunctionDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionDefinition),
                jacksonTypeRef<FunctionDefinition>(),
            )

        assertThat(roundtrippedFunctionDefinition).isEqualTo(functionDefinition)
    }
}
