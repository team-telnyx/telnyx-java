// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingPatchAllParamsTest {

    @Test
    fun create() {
        SettingPatchAllParams.builder()
            .namespace("namespace")
            .summary(
                SettingPatchAllParams.Summary.builder()
                    .instructions("Lead with the customer's plan tier. Keep it under 100 words.")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = SettingPatchAllParams.builder().namespace("namespace").build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SettingPatchAllParams.builder()
                .namespace("namespace")
                .summary(
                    SettingPatchAllParams.Summary.builder()
                        .instructions(
                            "Lead with the customer's plan tier. Keep it under 100 words."
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.summary())
            .contains(
                SettingPatchAllParams.Summary.builder()
                    .instructions("Lead with the customer's plan tier. Keep it under 100 words.")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SettingPatchAllParams.builder().namespace("namespace").build()

        val body = params._body()
    }
}
