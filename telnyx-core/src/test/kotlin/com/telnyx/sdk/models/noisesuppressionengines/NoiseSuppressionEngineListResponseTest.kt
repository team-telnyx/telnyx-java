// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.noisesuppressionengines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NoiseSuppressionEngineListResponseTest {

    @Test
    fun create() {
        val noiseSuppressionEngineListResponse =
            NoiseSuppressionEngineListResponse.builder()
                .addData(
                    NoiseSuppressionEngineListResponse.Data.builder()
                        .defaultAttenuationLevel(0L)
                        .label("Denoiser")
                        .value("denoiser")
                        .build()
                )
                .build()

        assertThat(noiseSuppressionEngineListResponse.data())
            .containsExactly(
                NoiseSuppressionEngineListResponse.Data.builder()
                    .defaultAttenuationLevel(0L)
                    .label("Denoiser")
                    .value("denoiser")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val noiseSuppressionEngineListResponse =
            NoiseSuppressionEngineListResponse.builder()
                .addData(
                    NoiseSuppressionEngineListResponse.Data.builder()
                        .defaultAttenuationLevel(0L)
                        .label("Denoiser")
                        .value("denoiser")
                        .build()
                )
                .build()

        val roundtrippedNoiseSuppressionEngineListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(noiseSuppressionEngineListResponse),
                jacksonTypeRef<NoiseSuppressionEngineListResponse>(),
            )

        assertThat(roundtrippedNoiseSuppressionEngineListResponse)
            .isEqualTo(noiseSuppressionEngineListResponse)
    }
}
