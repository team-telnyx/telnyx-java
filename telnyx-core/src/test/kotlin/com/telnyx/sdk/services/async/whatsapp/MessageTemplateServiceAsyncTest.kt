// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageTemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageTemplateServiceAsync = client.whatsapp().messageTemplates()

        val messageTemplateFuture =
            messageTemplateServiceAsync.create(
                MessageTemplateCreateParams.builder()
                    .category(MessageTemplateCreateParams.Category.MARKETING)
                    .addComponent(
                        MessageTemplateCreateParams.Component.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .language("language")
                    .name("name")
                    .wabaId("waba_id")
                    .build()
            )

        val messageTemplate = messageTemplateFuture.get()
        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageTemplateServiceAsync = client.whatsapp().messageTemplates()

        val messageTemplateFuture = messageTemplateServiceAsync.retrieve("id")

        val messageTemplate = messageTemplateFuture.get()
        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageTemplateServiceAsync = client.whatsapp().messageTemplates()

        val messageTemplateFuture =
            messageTemplateServiceAsync.update(
                MessageTemplateUpdateParams.builder()
                    .id("id")
                    .category(MessageTemplateUpdateParams.Category.MARKETING)
                    .addComponent(
                        MessageTemplateUpdateParams.Component.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val messageTemplate = messageTemplateFuture.get()
        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageTemplateServiceAsync = client.whatsapp().messageTemplates()

        val pageFuture = messageTemplateServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageTemplateServiceAsync = client.whatsapp().messageTemplates()

        val future = messageTemplateServiceAsync.delete("id")

        val response = future.get()
    }
}
