// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.managedaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManagedAccountUpdateParamsTest {

    @Test
    fun create() {
        ManagedAccountUpdateParams.builder().id("id").managedAccountAllowCustomPricing(true).build()
    }

    @Test
    fun pathParams() {
        val params = ManagedAccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ManagedAccountUpdateParams.builder()
                .id("id")
                .managedAccountAllowCustomPricing(true)
                .build()

        val body = params._body()

        assertThat(body.managedAccountAllowCustomPricing()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ManagedAccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
