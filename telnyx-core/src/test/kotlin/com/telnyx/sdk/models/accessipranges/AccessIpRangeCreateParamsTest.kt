// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipranges

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeCreateParamsTest {

    @Test
    fun create() {
        AccessIpRangeCreateParams.builder()
            .cidrBlock("Cidr Block")
            .description("Description")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessIpRangeCreateParams.builder()
                .cidrBlock("Cidr Block")
                .description("Description")
                .build()

        val body = params._body()

        assertThat(body.cidrBlock()).isEqualTo("Cidr Block")
        assertThat(body.description()).contains("Description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessIpRangeCreateParams.builder().cidrBlock("Cidr Block").build()

        val body = params._body()

        assertThat(body.cidrBlock()).isEqualTo("Cidr Block")
    }
}
