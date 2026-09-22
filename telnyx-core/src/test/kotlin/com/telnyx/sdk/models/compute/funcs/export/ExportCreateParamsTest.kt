// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs.export

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportCreateParamsTest {

    @Test
    fun create() {
        ExportCreateParams.builder()
            .id("id")
            .endpoint("https://api.honeycomb.io/v1/logs")
            .headers(
                ExportCreateParams.Headers.builder()
                    .putAdditionalProperty("x-honeycomb-team", JsonValue.from("abc123"))
                    .build()
            )
            .invocationExportEnabled(true)
            .runtimeExportEnabled(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExportCreateParams.builder()
                .id("id")
                .endpoint("https://api.honeycomb.io/v1/logs")
                .headers(
                    ExportCreateParams.Headers.builder()
                        .putAdditionalProperty("x-honeycomb-team", JsonValue.from("abc123"))
                        .build()
                )
                .invocationExportEnabled(true)
                .runtimeExportEnabled(true)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExportCreateParams.builder()
                .id("id")
                .endpoint("https://api.honeycomb.io/v1/logs")
                .headers(
                    ExportCreateParams.Headers.builder()
                        .putAdditionalProperty("x-honeycomb-team", JsonValue.from("abc123"))
                        .build()
                )
                .invocationExportEnabled(true)
                .runtimeExportEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.endpoint()).isEqualTo("https://api.honeycomb.io/v1/logs")
        assertThat(body.headers())
            .isEqualTo(
                ExportCreateParams.Headers.builder()
                    .putAdditionalProperty("x-honeycomb-team", JsonValue.from("abc123"))
                    .build()
            )
        assertThat(body.invocationExportEnabled()).isEqualTo(true)
        assertThat(body.runtimeExportEnabled()).isEqualTo(true)
    }
}
