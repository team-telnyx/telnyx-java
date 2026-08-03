// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.conversationalcomponents.ConversationalComponentPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConversationalComponentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationalComponentServiceAsync =
            client.whatsapp().phoneNumbers().conversationalComponents()

        val conversationalComponentsFuture =
            conversationalComponentServiceAsync.list("phone_number")

        val conversationalComponents = conversationalComponentsFuture.get()
        conversationalComponents.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conversationalComponentServiceAsync =
            client.whatsapp().phoneNumbers().conversationalComponents()

        val responseFuture =
            conversationalComponentServiceAsync.patchAll(
                ConversationalComponentPatchAllParams.builder()
                    .phoneNumber("phone_number")
                    .addCommand(
                        ConversationalComponentPatchAllParams.Command.builder()
                            .command("command")
                            .description("description")
                            .build()
                    )
                    .addIceBreaker("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
