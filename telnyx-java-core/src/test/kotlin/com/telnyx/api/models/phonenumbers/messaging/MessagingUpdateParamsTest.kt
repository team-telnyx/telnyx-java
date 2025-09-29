// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.messaging

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingUpdateParamsTest {

    @Test
    fun create() {
        MessagingUpdateParams.builder()
            .id("id")
            .messagingProduct("P2P")
            .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessagingUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessagingUpdateParams.builder()
                .id("id")
                .messagingProduct("P2P")
                .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                .build()

        val body = params._body()

        assertThat(body.messagingProduct()).contains("P2P")
        assertThat(body.messagingProfileId()).contains("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessagingUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
