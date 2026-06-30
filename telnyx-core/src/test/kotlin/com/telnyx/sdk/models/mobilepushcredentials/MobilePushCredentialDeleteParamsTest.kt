// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilepushcredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobilePushCredentialDeleteParamsTest {

    @Test
    fun create() {
        MobilePushCredentialDeleteParams.builder()
            .pushCredentialId("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MobilePushCredentialDeleteParams.builder()
                .pushCredentialId("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
