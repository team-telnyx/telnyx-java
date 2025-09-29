// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.civicaddresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CivicAddressRetrieveParamsTest {

    @Test
    fun create() {
        CivicAddressRetrieveParams.builder()
            .id("id")
            .addressId("318fb664-d341-44d2-8405-e6bfb9ced6d9")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CivicAddressRetrieveParams.builder()
                .id("id")
                .addressId("318fb664-d341-44d2-8405-e6bfb9ced6d9")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("318fb664-d341-44d2-8405-e6bfb9ced6d9")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
