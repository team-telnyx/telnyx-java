// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateParams
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

        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageTemplateService = client.whatsapp().messageTemplates()

        val messageTemplate = messageTemplateService.retrieve("id")

        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageTemplateService = client.whatsapp().messageTemplates()

        val messageTemplate =
            messageTemplateService.update(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageTemplateService = client.whatsapp().messageTemplates()

        messageTemplateService.delete("id")
    }
}
