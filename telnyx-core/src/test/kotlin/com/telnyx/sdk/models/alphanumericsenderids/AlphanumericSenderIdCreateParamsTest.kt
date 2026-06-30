// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdCreateParamsTest {

    @Test
    fun create() {
        AlphanumericSenderIdCreateParams.builder()
            .alphanumericSenderId("MyCompany")
            .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .usLongCodeFallback("+15551234567")
            .build()
    }

    @Test
    fun body() {
        val params =
            AlphanumericSenderIdCreateParams.builder()
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .usLongCodeFallback("+15551234567")
                .build()

        val body = params._body()

        assertThat(body.alphanumericSenderId()).isEqualTo("MyCompany")
        assertThat(body.messagingProfileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.usLongCodeFallback()).contains("+15551234567")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlphanumericSenderIdCreateParams.builder()
                .alphanumericSenderId("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.alphanumericSenderId()).isEqualTo("MyCompany")
        assertThat(body.messagingProfileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
