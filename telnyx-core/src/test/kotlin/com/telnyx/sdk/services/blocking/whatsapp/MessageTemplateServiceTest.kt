// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageTemplateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageTemplateService = client.whatsapp().messageTemplates()

        val messageTemplate =
            messageTemplateService.create(
                MessageTemplateCreateParams.builder()
                    .category(MessageTemplateCreateParams.Category.MARKETING)
                    .addComponent(JsonValue.from(mapOf<String, Any>()))
                    .language("language")
                    .name("name")
                    .wabaId("waba_id")
                    .build()
            )

        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageTemplateService = client.whatsapp().messageTemplates()

        val page = messageTemplateService.list()

        page.response().validate()
    }
}
