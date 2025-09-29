// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.telephonycredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialUpdateParamsTest {

    @Test
    fun create() {
        TelephonyCredentialUpdateParams.builder()
            .id("id")
            .connectionId("987654321")
            .expiresAt("2018-02-02T22:25:27.521Z")
            .name("My-new-updated-credential")
            .tag("some_tag")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TelephonyCredentialUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TelephonyCredentialUpdateParams.builder()
                .id("id")
                .connectionId("987654321")
                .expiresAt("2018-02-02T22:25:27.521Z")
                .name("My-new-updated-credential")
                .tag("some_tag")
                .build()

        val body = params._body()

        assertThat(body.connectionId()).contains("987654321")
        assertThat(body.expiresAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.name()).contains("My-new-updated-credential")
        assertThat(body.tag()).contains("some_tag")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TelephonyCredentialUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
