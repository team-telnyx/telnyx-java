// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HttpTest {

    @Test
    fun create() {
        val http =
            Http.builder()
                .request(
                    Http.Request.builder()
                        .addHeader(listOf("header_name", "header_value"))
                        .url("https://example.com/webhooks")
                        .build()
                )
                .response(
                    Http.Response.builder()
                        .body("body")
                        .addHeader(listOf("header_name", "header_value"))
                        .status(200L)
                        .build()
                )
                .build()

        assertThat(http.request())
            .contains(
                Http.Request.builder()
                    .addHeader(listOf("header_name", "header_value"))
                    .url("https://example.com/webhooks")
                    .build()
            )
        assertThat(http.response())
            .contains(
                Http.Response.builder()
                    .body("body")
                    .addHeader(listOf("header_name", "header_value"))
                    .status(200L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val http =
            Http.builder()
                .request(
                    Http.Request.builder()
                        .addHeader(listOf("header_name", "header_value"))
                        .url("https://example.com/webhooks")
                        .build()
                )
                .response(
                    Http.Response.builder()
                        .body("body")
                        .addHeader(listOf("header_name", "header_value"))
                        .status(200L)
                        .build()
                )
                .build()

        val roundtrippedHttp =
            jsonMapper.readValue(jsonMapper.writeValueAsString(http), jacksonTypeRef<Http>())

        assertThat(roundtrippedHttp).isEqualTo(http)
    }
}
