// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpPoolCreateParamsTest {

    @Test
    fun create() {
        IpPoolCreateParams.builder()
            .name("primary-pool")
            .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .isDefault(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            IpPoolCreateParams.builder()
                .name("primary-pool")
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isDefault(true)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("primary-pool")
        assertThat(body.domainId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.isDefault()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IpPoolCreateParams.builder().name("primary-pool").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("primary-pool")
    }
}
