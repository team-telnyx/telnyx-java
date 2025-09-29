// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.telephonycredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialCreateParamsTest {

    @Test
    fun create() {
        TelephonyCredentialCreateParams.builder()
            .connectionId("1234567890")
            .expiresAt("2018-02-02T22:25:27.521Z")
            .name("My-new-credential")
            .tag("some_tag")
            .build()
    }

    @Test
    fun body() {
        val params =
            TelephonyCredentialCreateParams.builder()
                .connectionId("1234567890")
                .expiresAt("2018-02-02T22:25:27.521Z")
                .name("My-new-credential")
                .tag("some_tag")
                .build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("1234567890")
        assertThat(body.expiresAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.name()).contains("My-new-credential")
        assertThat(body.tag()).contains("some_tag")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TelephonyCredentialCreateParams.builder().connectionId("1234567890").build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("1234567890")
    }
}
