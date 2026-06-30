// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.actions.purchase

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PurchaseCreateParamsTest {

    @Test
    fun create() {
        PurchaseCreateParams.builder()
            .amount(10L)
            .product("whitelabel")
            .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .status(PurchaseCreateParams.Status.STANDBY)
            .tags(listOf("personal", "customers", "active-customers"))
            .whitelabelName("Custom SPN")
            .build()
    }

    @Test
    fun body() {
        val params =
            PurchaseCreateParams.builder()
                .amount(10L)
                .product("whitelabel")
                .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(PurchaseCreateParams.Status.STANDBY)
                .tags(listOf("personal", "customers", "active-customers"))
                .whitelabelName("Custom SPN")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(10L)
        assertThat(body.product()).contains("whitelabel")
        assertThat(body.simCardGroupId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.status()).contains(PurchaseCreateParams.Status.STANDBY)
        assertThat(body.tags().getOrNull())
            .containsExactly("personal", "customers", "active-customers")
        assertThat(body.whitelabelName()).contains("Custom SPN")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PurchaseCreateParams.builder().amount(10L).build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(10L)
    }
}
