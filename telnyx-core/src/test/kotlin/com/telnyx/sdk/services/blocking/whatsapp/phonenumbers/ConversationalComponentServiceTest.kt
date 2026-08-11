// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationalComponentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationalComponentService =
            client.whatsapp().phoneNumbers().conversationalComponents()

        val conversationalComponents = conversationalComponentService.list("phone_number")

        conversationalComponents.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val conversationalComponentService =
            client.whatsapp().phoneNumbers().conversationalComponents()

        val response =
            conversationalComponentService.patchAll(
                ConversationalComponentPatchAllParams.builder()
                    .phoneNumber("phone_number")
                    .addCommand(
                        ConversationalComponentPatchAllParams.Command.builder()
                            .command("string")
                            .description("string")
                            .build()
                    )
                    .addIceBreaker("string")
                    .build()
            )

        response.validate()
    }
}
