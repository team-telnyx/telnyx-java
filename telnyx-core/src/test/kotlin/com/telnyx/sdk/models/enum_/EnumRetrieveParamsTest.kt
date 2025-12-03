// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enum_

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumRetrieveParamsTest {

    @Test
    fun create() {
        EnumRetrieveParams.builder().endpoint(EnumRetrieveParams.Endpoint.MNO).build()
    }

    @Test
    fun pathParams() {
        val params = EnumRetrieveParams.builder().endpoint(EnumRetrieveParams.Endpoint.MNO).build()

        assertThat(params._pathParam(0)).isEqualTo("mno")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
