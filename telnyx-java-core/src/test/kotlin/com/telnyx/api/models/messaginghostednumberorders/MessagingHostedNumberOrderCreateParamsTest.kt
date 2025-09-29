// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messaginghostednumberorders

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderCreateParamsTest {

    @Test
    fun create() {
        MessagingHostedNumberOrderCreateParams.builder()
            .messagingProfileId("dc8f39ac-953d-4520-b93b-786ae87db0da")
            .addPhoneNumber("+18665550001")
            .addPhoneNumber("+18665550002")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessagingHostedNumberOrderCreateParams.builder()
                .messagingProfileId("dc8f39ac-953d-4520-b93b-786ae87db0da")
                .addPhoneNumber("+18665550001")
                .addPhoneNumber("+18665550002")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).contains("dc8f39ac-953d-4520-b93b-786ae87db0da")
        assertThat(body.phoneNumbers().getOrNull()).containsExactly("+18665550001", "+18665550002")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessagingHostedNumberOrderCreateParams.builder().build()

        val body = params._body()
    }
}
