// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.billinggroups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingGroupUpdateParamsTest {

    @Test
    fun create() {
        BillingGroupUpdateParams.builder()
            .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
            .name("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BillingGroupUpdateParams.builder().id("f5586561-8ff0-4291-a0ac-84fe544797bd").build()

        assertThat(params._pathParam(0)).isEqualTo("f5586561-8ff0-4291-a0ac-84fe544797bd")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BillingGroupUpdateParams.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .name("string")
                .build()

        val body = params._body()

        assertThat(body.name()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BillingGroupUpdateParams.builder().id("f5586561-8ff0-4291-a0ac-84fe544797bd").build()

        val body = params._body()
    }
}
