// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappMessageTemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappMessageTemplateServiceAsync = client.whatsappMessageTemplates()

        val whatsappMessageTemplateFuture = whatsappMessageTemplateServiceAsync.retrieve("id")

        val whatsappMessageTemplate = whatsappMessageTemplateFuture.get()
        whatsappMessageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappMessageTemplateServiceAsync = client.whatsappMessageTemplates()

        val whatsappMessageTemplateFuture =
            whatsappMessageTemplateServiceAsync.update(
                WhatsappMessageTemplateUpdateParams.builder()
                    .id("id")
                    .category(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
                    .addComponent(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val whatsappMessageTemplate = whatsappMessageTemplateFuture.get()
        whatsappMessageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val whatsappMessageTemplateServiceAsync = client.whatsappMessageTemplates()

        val future = whatsappMessageTemplateServiceAsync.delete("id")

        val response = future.get()
    }
}
