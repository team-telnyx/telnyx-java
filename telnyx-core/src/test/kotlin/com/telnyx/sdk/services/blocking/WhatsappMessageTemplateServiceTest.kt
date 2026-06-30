// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsappmessagetemplates.WhatsappMessageTemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WhatsappMessageTemplateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappMessageTemplateService = client.whatsappMessageTemplates()

        val whatsappMessageTemplate = whatsappMessageTemplateService.retrieve("id")

        whatsappMessageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappMessageTemplateService = client.whatsappMessageTemplates()

        val whatsappMessageTemplate =
            whatsappMessageTemplateService.update(
                WhatsappMessageTemplateUpdateParams.builder()
                    .id("id")
                    .category(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
                    .addComponent(
                        WhatsappMessageTemplateUpdateParams.Component.Header.builder()
                            .format(
                                WhatsappMessageTemplateUpdateParams.Component.Header.Format.TEXT
                            )
                            .example(
                                WhatsappMessageTemplateUpdateParams.Component.Header.Example
                                    .builder()
                                    .addHeaderHandle("string")
                                    .addHeaderText("string")
                                    .build()
                            )
                            .text("text")
                            .build()
                    )
                    .build()
            )

        whatsappMessageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val whatsappMessageTemplateService = client.whatsappMessageTemplates()

        whatsappMessageTemplateService.delete("id")
    }
}
