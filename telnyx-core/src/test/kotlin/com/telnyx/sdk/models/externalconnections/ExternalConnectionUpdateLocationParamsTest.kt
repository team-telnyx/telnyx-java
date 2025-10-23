// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionUpdateLocationParamsTest {

    @Test
    fun create() {
        ExternalConnectionUpdateLocationParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalConnectionUpdateLocationParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalConnectionUpdateLocationParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .staticEmergencyAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.staticEmergencyAddressId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
