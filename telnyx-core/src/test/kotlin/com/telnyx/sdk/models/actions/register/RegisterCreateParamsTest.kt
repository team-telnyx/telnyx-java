// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.actions.register

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegisterCreateParamsTest {

    @Test
    fun create() {
        RegisterCreateParams.builder()
            .registrationCodes(listOf("0000000001", "0000000002", "0000000003"))
            .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .status(RegisterCreateParams.Status.STANDBY)
            .tags(listOf("personal", "customers", "active-customers"))
            .build()
    }

    @Test
    fun body() {
        val params =
            RegisterCreateParams.builder()
                .registrationCodes(listOf("0000000001", "0000000002", "0000000003"))
                .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(RegisterCreateParams.Status.STANDBY)
                .tags(listOf("personal", "customers", "active-customers"))
                .build()

        val body = params._body()

        assertThat(body.registrationCodes())
            .containsExactly("0000000001", "0000000002", "0000000003")
        assertThat(body.simCardGroupId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.status()).contains(RegisterCreateParams.Status.STANDBY)
        assertThat(body.tags().getOrNull())
            .containsExactly("personal", "customers", "active-customers")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RegisterCreateParams.builder()
                .registrationCodes(listOf("0000000001", "0000000002", "0000000003"))
                .build()

        val body = params._body()

        assertThat(body.registrationCodes())
            .containsExactly("0000000001", "0000000002", "0000000003")
    }
}
