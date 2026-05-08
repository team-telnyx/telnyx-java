// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.ModelMetadata
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAIListModelsResponseTest {

    @Test
    fun create() {
        val openaiListModelsResponse =
            OpenAIListModelsResponse.builder()
                .addData(
                    ModelMetadata.builder()
                        .id("moonshotai/Kimi-K2.6")
                        .contextLength(262144L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addLanguage("string")
                        .license("license")
                        .organization("moonshotai")
                        .ownedBy("Telnyx")
                        .parameters(1000000000000L)
                        .tier(ModelMetadata.Tier.SMALL)
                        .baseModel("base_model")
                        .description("description")
                        .isFineTunable(true)
                        .isVisionSupported(true)
                        .maxCompletionTokens(0L)
                        .modelObject("object")
                        .parametersStr("1.0T")
                        .pricing(
                            ModelMetadata.Pricing.builder()
                                .putAdditionalProperty("input", JsonValue.from("0.60"))
                                .putAdditionalProperty("output", JsonValue.from("2.50"))
                                .build()
                        )
                        .recommendedForAssistants(true)
                        .addRegion("us-central-1")
                        .addRegion("us-east-1")
                        .task("text-generation")
                        .build()
                )
                .modelObject("object")
                .build()

        assertThat(openaiListModelsResponse.data())
            .containsExactly(
                ModelMetadata.builder()
                    .id("moonshotai/Kimi-K2.6")
                    .contextLength(262144L)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addLanguage("string")
                    .license("license")
                    .organization("moonshotai")
                    .ownedBy("Telnyx")
                    .parameters(1000000000000L)
                    .tier(ModelMetadata.Tier.SMALL)
                    .baseModel("base_model")
                    .description("description")
                    .isFineTunable(true)
                    .isVisionSupported(true)
                    .maxCompletionTokens(0L)
                    .modelObject("object")
                    .parametersStr("1.0T")
                    .pricing(
                        ModelMetadata.Pricing.builder()
                            .putAdditionalProperty("input", JsonValue.from("0.60"))
                            .putAdditionalProperty("output", JsonValue.from("2.50"))
                            .build()
                    )
                    .recommendedForAssistants(true)
                    .addRegion("us-central-1")
                    .addRegion("us-east-1")
                    .task("text-generation")
                    .build()
            )
        assertThat(openaiListModelsResponse.modelObject()).contains("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiListModelsResponse =
            OpenAIListModelsResponse.builder()
                .addData(
                    ModelMetadata.builder()
                        .id("moonshotai/Kimi-K2.6")
                        .contextLength(262144L)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addLanguage("string")
                        .license("license")
                        .organization("moonshotai")
                        .ownedBy("Telnyx")
                        .parameters(1000000000000L)
                        .tier(ModelMetadata.Tier.SMALL)
                        .baseModel("base_model")
                        .description("description")
                        .isFineTunable(true)
                        .isVisionSupported(true)
                        .maxCompletionTokens(0L)
                        .modelObject("object")
                        .parametersStr("1.0T")
                        .pricing(
                            ModelMetadata.Pricing.builder()
                                .putAdditionalProperty("input", JsonValue.from("0.60"))
                                .putAdditionalProperty("output", JsonValue.from("2.50"))
                                .build()
                        )
                        .recommendedForAssistants(true)
                        .addRegion("us-central-1")
                        .addRegion("us-east-1")
                        .task("text-generation")
                        .build()
                )
                .modelObject("object")
                .build()

        val roundtrippedOpenAIListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiListModelsResponse),
                jacksonTypeRef<OpenAIListModelsResponse>(),
            )

        assertThat(roundtrippedOpenAIListModelsResponse).isEqualTo(openaiListModelsResponse)
    }
}
