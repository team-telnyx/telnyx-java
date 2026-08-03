// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailtemplates.EmailTemplateCreateParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateListParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRenderParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateReplaceParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateUpdateParams
import com.telnyx.sdk.models.emailtemplates.UpdateEmailTemplateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailTemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val emailTemplateResponseFuture =
            emailTemplateServiceAsync.create(
                EmailTemplateCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .name("Welcome Email")
                    .htmlBody("<h1>Hello {{ first_name }}</h1>")
                    .subject("Welcome, {{ first_name }}!")
                    .textBody("Hello {{ first_name }}")
                    .addVariable("string")
                    .build()
            )

        val emailTemplateResponse = emailTemplateResponseFuture.get()
        emailTemplateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val emailTemplateResponseFuture =
            emailTemplateServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailTemplateResponse = emailTemplateResponseFuture.get()
        emailTemplateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val emailTemplateResponseFuture =
            emailTemplateServiceAsync.update(
                EmailTemplateUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updateEmailTemplateRequest(
                        UpdateEmailTemplateRequest.builder()
                            .htmlBody("html_body")
                            .name("name")
                            .subject("subject")
                            .textBody("text_body")
                            .addVariable("string")
                            .build()
                    )
                    .build()
            )

        val emailTemplateResponse = emailTemplateResponseFuture.get()
        emailTemplateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val emailTemplatesFuture =
            emailTemplateServiceAsync.list(
                EmailTemplateListParams.builder().pageCursor("page_cursor").pageSize(1L).build()
            )

        val emailTemplates = emailTemplatesFuture.get()
        emailTemplates.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val future = emailTemplateServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun render() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val responseFuture =
            emailTemplateServiceAsync.render(
                EmailTemplateRenderParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .templateVariables(
                        EmailTemplateRenderParams.TemplateVariables.builder()
                            .putAdditionalProperty("first_name", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailTemplateServiceAsync = client.emailTemplates()

        val emailTemplateResponseFuture =
            emailTemplateServiceAsync.replace(
                EmailTemplateReplaceParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .updateEmailTemplateRequest(
                        UpdateEmailTemplateRequest.builder()
                            .htmlBody("html_body")
                            .name("name")
                            .subject("subject")
                            .textBody("text_body")
                            .addVariable("string")
                            .build()
                    )
                    .build()
            )

        val emailTemplateResponse = emailTemplateResponseFuture.get()
        emailTemplateResponse.validate()
    }
}
