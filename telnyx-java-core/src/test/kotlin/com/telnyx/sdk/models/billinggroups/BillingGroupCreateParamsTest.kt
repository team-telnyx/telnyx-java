// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.billinggroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupCreateParamsTest {

    @Test
    fun create() {
        BillingGroupCreateParams.builder().name("string").build()
    }

    @Test
    fun body() {
        val params = BillingGroupCreateParams.builder().name("string").build()

        val body = params._body()

        assertThat(body.name()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillingGroupCreateParams.builder().build()

        val body = params._body()
    }
}
