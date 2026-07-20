// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfUpdateParamsTest {

    @Test
    fun create() {
        CloudfUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("agent-fs")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CloudfUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CloudfUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("agent-fs")
                .build()

        val body = params._body()

        assertThat(body.name()).contains("agent-fs")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CloudfUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
