// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.accessipranges

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeCreateParamsTest {

    @Test
    fun create() {
        AccessIpRangeCreateParams.builder()
            .cidrBlock("cidr_block")
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessIpRangeCreateParams.builder()
                .cidrBlock("cidr_block")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.cidrBlock()).isEqualTo("cidr_block")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessIpRangeCreateParams.builder().cidrBlock("cidr_block").build()

        val body = params._body()

        assertThat(body.cidrBlock()).isEqualTo("cidr_block")
    }
}
