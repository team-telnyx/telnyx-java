// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiRetrieveModelsResponseTest {

    @Test
    fun create() {
        val aiRetrieveModelsResponse =
            AiRetrieveModelsResponse.builder()
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
                                .putAdditionalProperty("prompt", JsonValue.from("0.300000"))
                                .putAdditionalProperty("completion", JsonValue.from("1.200000"))
                                .putAdditionalProperty("cached_prompt", JsonValue.from("0.060000"))
                                .putAdditionalProperty("currency", JsonValue.from("USD"))
                                .putAdditionalProperty("unit", JsonValue.from("1M_tokens"))
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

        assertThat(aiRetrieveModelsResponse.data())
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
                            .putAdditionalProperty("prompt", JsonValue.from("0.300000"))
                            .putAdditionalProperty("completion", JsonValue.from("1.200000"))
                            .putAdditionalProperty("cached_prompt", JsonValue.from("0.060000"))
                            .putAdditionalProperty("currency", JsonValue.from("USD"))
                            .putAdditionalProperty("unit", JsonValue.from("1M_tokens"))
                            .build()
                    )
                    .recommendedForAssistants(true)
                    .addRegion("us-central-1")
                    .addRegion("us-east-1")
                    .task("text-generation")
                    .build()
            )
        assertThat(aiRetrieveModelsResponse.modelObject()).contains("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiRetrieveModelsResponse =
            AiRetrieveModelsResponse.builder()
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
                                .putAdditionalProperty("prompt", JsonValue.from("0.300000"))
                                .putAdditionalProperty("completion", JsonValue.from("1.200000"))
                                .putAdditionalProperty("cached_prompt", JsonValue.from("0.060000"))
                                .putAdditionalProperty("currency", JsonValue.from("USD"))
                                .putAdditionalProperty("unit", JsonValue.from("1M_tokens"))
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

        val roundtrippedAiRetrieveModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiRetrieveModelsResponse),
                jacksonTypeRef<AiRetrieveModelsResponse>(),
            )

        assertThat(roundtrippedAiRetrieveModelsResponse).isEqualTo(aiRetrieveModelsResponse)
    }
}
