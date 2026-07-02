// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KvCreateParamsTest {

    @Test
    fun create() {
        KvCreateParams.builder().name("my-cache").build()
    }

    @Test
    fun body() {
        val params = KvCreateParams.builder().name("my-cache").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("my-cache")
    }
}
