// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlSecretsParamsTest {

    @Test
    fun create() {
        TexmlSecretsParams.builder().name("My Secret Name").value("My Secret Value").build()
    }

    @Test
    fun body() {
        val params =
            TexmlSecretsParams.builder().name("My Secret Name").value("My Secret Value").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Secret Name")
        assertThat(body.value()).isEqualTo("My Secret Value")
    }
}
