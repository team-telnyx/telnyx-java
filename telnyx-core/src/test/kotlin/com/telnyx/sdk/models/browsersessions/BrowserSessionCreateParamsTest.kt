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
            .metadata(
                BrowserSessionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
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
                .metadata(
                    BrowserSessionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
        assertThat(body.metadata())
            .contains(
                BrowserSessionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
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
