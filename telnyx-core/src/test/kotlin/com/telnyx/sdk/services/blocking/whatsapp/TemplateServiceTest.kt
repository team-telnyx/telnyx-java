// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.templates.TemplateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.whatsapp().templates()

        val template =
            templateService.create(
                TemplateCreateParams.builder()
                    .category(TemplateCreateParams.Category.MARKETING)
                    .addComponent(
                        TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.builder()
                            .format(
                                TemplateCreateParams.Component.WhatsappTemplateHeaderComponent
                                    .Format
                                    .TEXT
                            )
                            .type(
                                TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Type
                                    .HEADER
                            )
                            .example(
                                TemplateCreateParams.Component.WhatsappTemplateHeaderComponent
                                    .Example
                                    .builder()
                                    .addHeaderHandle("string")
                                    .addHeaderText("string")
                                    .build()
                            )
                            .text("text")
                            .build()
                    )
                    .language("language")
                    .name("name")
                    .wabaId("waba_id")
                    .build()
            )

        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val templateService = client.whatsapp().templates()

        val page = templateService.list()

        page.response().validate()
    }
}
