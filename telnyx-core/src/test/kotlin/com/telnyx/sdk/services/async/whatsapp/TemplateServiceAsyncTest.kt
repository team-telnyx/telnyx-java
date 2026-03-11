// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.whatsapp.templates.TemplateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.whatsapp().templates()

        val templateFuture =
            templateServiceAsync.create(
                TemplateCreateParams.builder()
                    .category(TemplateCreateParams.Category.MARKETING)
                    .addComponent(
                        TemplateCreateParams.Component.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .language("language")
                    .name("name")
                    .wabaId("waba_id")
                    .build()
            )

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.whatsapp().templates()

        val pageFuture = templateServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
