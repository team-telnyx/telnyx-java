// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionVerifyOwnershipParamsTest {

    @Test
    fun create() {
        ActionVerifyOwnershipParams.builder().addPhoneNumber("+15551234567").build()
    }

    @Test
    fun body() {
        val params = ActionVerifyOwnershipParams.builder().addPhoneNumber("+15551234567").build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("+15551234567")
    }
}
