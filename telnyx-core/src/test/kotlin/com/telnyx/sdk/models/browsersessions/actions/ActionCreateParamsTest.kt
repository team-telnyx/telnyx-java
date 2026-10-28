// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionCreateParamsTest {

    @Test
    fun create() {
        ActionCreateParams.builder()
            .id("id")
            .waitSeconds(0L)
            .body(
                NavigateAction.builder()
                    .url("https://example.com/")
                    .idempotencyKey("x")
                    .includeObservation(true)
                    .waitUntil(NavigateAction.WaitUntil.LOAD)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionCreateParams.builder()
                .id("id")
                .body(NavigateAction.builder().url("https://example.com/").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ActionCreateParams.builder()
                .id("id")
                .waitSeconds(0L)
                .body(
                    NavigateAction.builder()
                        .url("https://example.com/")
                        .idempotencyKey("x")
                        .includeObservation(true)
                        .waitUntil(NavigateAction.WaitUntil.LOAD)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("wait_seconds", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ActionCreateParams.builder()
                .id("id")
                .body(NavigateAction.builder().url("https://example.com/").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ActionCreateParams.builder()
                .id("id")
                .waitSeconds(0L)
                .body(
                    NavigateAction.builder()
                        .url("https://example.com/")
                        .idempotencyKey("x")
                        .includeObservation(true)
                        .waitUntil(NavigateAction.WaitUntil.LOAD)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ActionCreateParams.Body.ofNavigateAction(
                    NavigateAction.builder()
                        .url("https://example.com/")
                        .idempotencyKey("x")
                        .includeObservation(true)
                        .waitUntil(NavigateAction.WaitUntil.LOAD)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionCreateParams.builder()
                .id("id")
                .body(NavigateAction.builder().url("https://example.com/").build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ActionCreateParams.Body.ofNavigateAction(
                    NavigateAction.builder().url("https://example.com/").build()
                )
            )
    }
}
