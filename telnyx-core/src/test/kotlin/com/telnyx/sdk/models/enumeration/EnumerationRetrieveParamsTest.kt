// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enumeration

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumerationRetrieveParamsTest {

    @Test
    fun create() {
        EnumerationRetrieveParams.builder().endpoint(EnumerationRetrieveParams.Endpoint.MNO).build()
    }

    @Test
    fun pathParams() {
        val params =
            EnumerationRetrieveParams.builder()
                .endpoint(EnumerationRetrieveParams.Endpoint.MNO)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mno")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
