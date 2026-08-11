// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingPatchAllParamsTest {

    @Test
    fun create() {
        SettingPatchAllParams.builder()
            .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
            .settingsRequest(
                SettingsRequest.builder()
                    .retrieval(
                        RetrievalSettings.builder()
                            .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                            .topK(5L)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SettingPatchAllParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .settingsRequest(SettingsRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SettingPatchAllParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .settingsRequest(
                    SettingsRequest.builder()
                        .retrieval(
                            RetrievalSettings.builder()
                                .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                .topK(5L)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SettingsRequest.builder()
                    .retrieval(
                        RetrievalSettings.builder()
                            .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                            .topK(5L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SettingPatchAllParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .settingsRequest(SettingsRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SettingsRequest.builder().build())
    }
}
