// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionValidateRegistrationCodesParamsTest {

    @Test
    fun create() {
        ActionValidateRegistrationCodesParams.builder()
            .addRegistrationCode("123456780")
            .addRegistrationCode("1231231230")
            .build()
    }

    @Test
    fun body() {
        val params =
            ActionValidateRegistrationCodesParams.builder()
                .addRegistrationCode("123456780")
                .addRegistrationCode("1231231230")
                .build()

        val body = params._body()

        assertThat(body.registrationCodes().getOrNull()).containsExactly("123456780", "1231231230")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionValidateRegistrationCodesParams.builder().build()

        val body = params._body()
    }
}
