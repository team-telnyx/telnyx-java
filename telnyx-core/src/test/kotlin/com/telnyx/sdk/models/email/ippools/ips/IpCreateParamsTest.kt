// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools.ips

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpCreateParamsTest {

    @Test
    fun create() {
        IpCreateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dedicatedIpId("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
            .weight(100L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IpCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dedicatedIpId("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IpCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dedicatedIpId("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
                .weight(100L)
                .build()

        val body = params._body()

        assertThat(body.dedicatedIpId()).isEqualTo("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
        assertThat(body.weight()).contains(100L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IpCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dedicatedIpId("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
                .build()

        val body = params._body()

        assertThat(body.dedicatedIpId()).isEqualTo("6a7f9a30-1234-4b5c-8d9e-0f1a2b3c4d5e")
    }
}
