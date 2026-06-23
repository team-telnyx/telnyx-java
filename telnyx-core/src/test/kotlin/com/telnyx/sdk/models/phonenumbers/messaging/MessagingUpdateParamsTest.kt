// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.messaging

import com.telnyx.sdk.models.messaginghostednumbers.UpdatePhoneNumberMessagingSettingsRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingUpdateParamsTest {

    @Test
    fun create() {
        MessagingUpdateParams.builder()
            .id("id")
            .updatePhoneNumberMessagingSettingsRequest(
                UpdatePhoneNumberMessagingSettingsRequest.builder()
                    .messagingProduct("P2P")
                    .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                    .addTag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessagingUpdateParams.builder()
                .id("id")
                .updatePhoneNumberMessagingSettingsRequest(
                    UpdatePhoneNumberMessagingSettingsRequest.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessagingUpdateParams.builder()
                .id("id")
                .updatePhoneNumberMessagingSettingsRequest(
                    UpdatePhoneNumberMessagingSettingsRequest.builder()
                        .messagingProduct("P2P")
                        .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                        .addTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdatePhoneNumberMessagingSettingsRequest.builder()
                    .messagingProduct("P2P")
                    .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                    .addTag("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessagingUpdateParams.builder()
                .id("id")
                .updatePhoneNumberMessagingSettingsRequest(
                    UpdatePhoneNumberMessagingSettingsRequest.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdatePhoneNumberMessagingSettingsRequest.builder().build())
    }
}
