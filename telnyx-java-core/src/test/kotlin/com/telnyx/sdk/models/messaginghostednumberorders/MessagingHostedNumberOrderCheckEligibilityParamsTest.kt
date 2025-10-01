// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderCheckEligibilityParamsTest {

    @Test
    fun create() {
        MessagingHostedNumberOrderCheckEligibilityParams.builder().addPhoneNumber("string").build()
    }

    @Test
    fun body() {
        val params =
            MessagingHostedNumberOrderCheckEligibilityParams.builder()
                .addPhoneNumber("string")
                .build()

        val body = params._body()

        assertThat(body.phoneNumbers()).containsExactly("string")
    }
}
