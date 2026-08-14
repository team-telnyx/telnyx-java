// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqldbCreateParamsTest {

    @Test
    fun create() {
        SqldbCreateParams.builder().name("my-database").build()
    }

    @Test
    fun body() {
        val params = SqldbCreateParams.builder().name("my-database").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("my-database")
    }
}
