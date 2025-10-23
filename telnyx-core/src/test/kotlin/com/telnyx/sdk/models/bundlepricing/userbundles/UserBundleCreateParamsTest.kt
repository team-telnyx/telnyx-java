// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.userbundles

import com.telnyx.sdk.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleCreateParamsTest {

    @Test
    fun create() {
        UserBundleCreateParams.builder()
            .authorizationBearer("authorization_bearer")
            .idempotencyKey("12ade33a-21c0-473b-b055-b3c836e1c292")
            .addItem(
                UserBundleCreateParams.Item.builder()
                    .billingBundleId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .quantity(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            UserBundleCreateParams.builder()
                .authorizationBearer("authorization_bearer")
                .idempotencyKey("12ade33a-21c0-473b-b055-b3c836e1c292")
                .addItem(
                    UserBundleCreateParams.Item.builder()
                        .billingBundleId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .quantity(0L)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("authorization_bearer", "authorization_bearer").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = UserBundleCreateParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            UserBundleCreateParams.builder()
                .authorizationBearer("authorization_bearer")
                .idempotencyKey("12ade33a-21c0-473b-b055-b3c836e1c292")
                .addItem(
                    UserBundleCreateParams.Item.builder()
                        .billingBundleId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .quantity(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.idempotencyKey()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(body.items().getOrNull())
            .containsExactly(
                UserBundleCreateParams.Item.builder()
                    .billingBundleId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .quantity(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserBundleCreateParams.builder().build()

        val body = params._body()
    }
}
