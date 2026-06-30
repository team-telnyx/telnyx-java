// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portabilitychecks

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortabilityCheckRunParamsTest {

    @Test
    fun create() {
        PortabilityCheckRunParams.builder()
            .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
            .build()
    }

    @Test
    fun body() {
        val params =
            PortabilityCheckRunParams.builder()
                .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers().getOrNull())
            .containsExactly("+13035550000", "+13035550001", "+13035550002")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PortabilityCheckRunParams.builder().build()

        val body = params._body()
    }
}
