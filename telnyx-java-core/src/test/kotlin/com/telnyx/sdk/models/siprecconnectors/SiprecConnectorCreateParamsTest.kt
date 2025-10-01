// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.siprecconnectors

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecConnectorCreateParamsTest {

    @Test
    fun create() {
        SiprecConnectorCreateParams.builder()
            .host("siprec.telnyx.com")
            .name("my-siprec-connector")
            .port(5060L)
            .appSubdomain("my-app")
            .build()
    }

    @Test
    fun body() {
        val params =
            SiprecConnectorCreateParams.builder()
                .host("siprec.telnyx.com")
                .name("my-siprec-connector")
                .port(5060L)
                .appSubdomain("my-app")
                .build()

        val body = params._body()

        assertThat(body.host()).isEqualTo("siprec.telnyx.com")
        assertThat(body.name()).isEqualTo("my-siprec-connector")
        assertThat(body.port()).isEqualTo(5060L)
        assertThat(body.appSubdomain()).contains("my-app")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SiprecConnectorCreateParams.builder()
                .host("siprec.telnyx.com")
                .name("my-siprec-connector")
                .port(5060L)
                .build()

        val body = params._body()

        assertThat(body.host()).isEqualTo("siprec.telnyx.com")
        assertThat(body.name()).isEqualTo("my-siprec-connector")
        assertThat(body.port()).isEqualTo(5060L)
    }
}
