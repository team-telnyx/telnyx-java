// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyRetrieveParamsTest {

    @Test
    fun create() {
        KeyRetrieveParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").key("key").build()
    }

    @Test
    fun pathParams() {
        val params =
            KeyRetrieveParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
