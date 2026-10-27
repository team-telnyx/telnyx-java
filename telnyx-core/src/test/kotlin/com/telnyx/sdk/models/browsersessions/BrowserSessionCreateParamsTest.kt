// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrowserSessionCreateParamsTest {

    @Test
    fun create() {
        BrowserSessionCreateParams.builder()
            .policy(
                BrowserSessionCreateParams.Policy.builder().addAllowedDomain("example.com").build()
            )
            .idempotencyKey("x")
            .limits(
                BrowserSessionCreateParams.Limits.builder().idleTimeoutS(30L).lifetimeS(60L).build()
            )
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun body() {
        val params =
            BrowserSessionCreateParams.builder()
                .policy(
                    BrowserSessionCreateParams.Policy.builder()
                        .addAllowedDomain("example.com")
                        .build()
                )
                .idempotencyKey("x")
                .limits(
                    BrowserSessionCreateParams.Limits.builder()
                        .idleTimeoutS(30L)
                        .lifetimeS(60L)
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.policy())
            .isEqualTo(
                BrowserSessionCreateParams.Policy.builder().addAllowedDomain("example.com").build()
            )
        assertThat(body.idempotencyKey()).contains("x")
        assertThat(body.limits())
            .contains(
                BrowserSessionCreateParams.Limits.builder().idleTimeoutS(30L).lifetimeS(60L).build()
            )
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BrowserSessionCreateParams.builder()
                .policy(
                    BrowserSessionCreateParams.Policy.builder()
                        .addAllowedDomain("example.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.policy())
            .isEqualTo(
                BrowserSessionCreateParams.Policy.builder().addAllowedDomain("example.com").build()
            )
    }
}
