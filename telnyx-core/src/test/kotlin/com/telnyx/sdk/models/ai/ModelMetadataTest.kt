// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelMetadataTest {

    @Test
    fun create() {
        val modelMetadata =
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

        assertThat(modelMetadata.id()).isEqualTo("moonshotai/Kimi-K2.6")
        assertThat(modelMetadata.contextLength()).isEqualTo(262144L)
        assertThat(modelMetadata.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(modelMetadata.languages()).containsExactly("string")
        assertThat(modelMetadata.license()).isEqualTo("license")
        assertThat(modelMetadata.organization()).isEqualTo("moonshotai")
        assertThat(modelMetadata.ownedBy()).isEqualTo("Telnyx")
        assertThat(modelMetadata.parameters()).isEqualTo(1000000000000L)
        assertThat(modelMetadata.tier()).isEqualTo(ModelMetadata.Tier.SMALL)
        assertThat(modelMetadata.baseModel()).contains("base_model")
        assertThat(modelMetadata.description()).contains("description")
        assertThat(modelMetadata.isFineTunable()).contains(true)
        assertThat(modelMetadata.isVisionSupported()).contains(true)
        assertThat(modelMetadata.maxCompletionTokens()).contains(0L)
        assertThat(modelMetadata.modelObject()).contains("object")
        assertThat(modelMetadata.parametersStr()).contains("1.0T")
        assertThat(modelMetadata.pricing())
            .contains(
                ModelMetadata.Pricing.builder()
                    .putAdditionalProperty("prompt", JsonValue.from("0.300000"))
                    .putAdditionalProperty("completion", JsonValue.from("1.200000"))
                    .putAdditionalProperty("cached_prompt", JsonValue.from("0.060000"))
                    .putAdditionalProperty("currency", JsonValue.from("USD"))
                    .putAdditionalProperty("unit", JsonValue.from("1M_tokens"))
                    .build()
            )
        assertThat(modelMetadata.recommendedForAssistants()).contains(true)
        assertThat(modelMetadata.regions().getOrNull()).containsExactly("us-central-1", "us-east-1")
        assertThat(modelMetadata.task()).contains("text-generation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelMetadata =
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

        val roundtrippedModelMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelMetadata),
                jacksonTypeRef<ModelMetadata>(),
            )

        assertThat(roundtrippedModelMetadata).isEqualTo(modelMetadata)
    }
}
