// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpPoolUpdateParamsTest {

    @Test
    fun create() {
        IpPoolUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .isDefault(true)
            .name("renamed-pool")
            .build()
    }

    @Test
    fun pathParams() {
        val params = IpPoolUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IpPoolUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isDefault(true)
                .name("renamed-pool")
                .build()

        val body = params._body()

        assertThat(body.domainId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.isDefault()).contains(true)
        assertThat(body.name()).contains("renamed-pool")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IpPoolUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
