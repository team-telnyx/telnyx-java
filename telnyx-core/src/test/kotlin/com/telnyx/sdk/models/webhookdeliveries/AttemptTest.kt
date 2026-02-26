// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttemptTest {

    @Test
    fun create() {
        val attempt =
            Attempt.builder()
                .addError(0L)
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .http(
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
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Attempt.Status.DELIVERED)
                .build()

        assertThat(attempt.errors().getOrNull()).containsExactly(0L)
        assertThat(attempt.finishedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(attempt.http())
            .contains(
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
            )
        assertThat(attempt.startedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(attempt.status()).contains(Attempt.Status.DELIVERED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attempt =
            Attempt.builder()
                .addError(0L)
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .http(
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
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Attempt.Status.DELIVERED)
                .build()

        val roundtrippedAttempt =
            jsonMapper.readValue(jsonMapper.writeValueAsString(attempt), jacksonTypeRef<Attempt>())

        assertThat(roundtrippedAttempt).isEqualTo(attempt)
    }
}
