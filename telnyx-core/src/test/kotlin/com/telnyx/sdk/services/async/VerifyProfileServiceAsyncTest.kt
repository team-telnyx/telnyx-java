// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val verifyProfileDataFuture =
            verifyProfileServiceAsync.create(
                VerifyProfileCreateParams.builder()
                    .name("Test Profile")
                    .call(
                        VerifyProfileCreateParams.Call.builder()
                            .appName("Example Secure App")
                            .codeLength(6L)
                            .defaultVerificationTimeoutSecs(300L)
                            .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
                    .flashcall(
                        VerifyProfileCreateParams.Flashcall.builder()
                            .defaultVerificationTimeoutSecs(300L)
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
                    .language("en-US")
                    .sms(
                        VerifyProfileCreateParams.Sms.builder()
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .alphaSender("sqF")
                            .appName("Example Secure App")
                            .codeLength(6L)
                            .defaultVerificationTimeoutSecs(300L)
                            .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                            .build()
                    )
                    .webhookFailoverUrl("http://example.com/webhook/failover")
                    .webhookUrl("http://example.com/webhook")
                    .build()
            )

        val verifyProfileData = verifyProfileDataFuture.get()
        verifyProfileData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val verifyProfileDataFuture =
            verifyProfileServiceAsync.retrieve("12ade33a-21c0-473b-b055-b3c836e1c292")

        val verifyProfileData = verifyProfileDataFuture.get()
        verifyProfileData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val verifyProfileDataFuture =
            verifyProfileServiceAsync.update(
                VerifyProfileUpdateParams.builder()
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .call(
                        VerifyProfileUpdateParams.Call.builder()
                            .appName("Example Secure App")
                            .codeLength(6L)
                            .defaultVerificationTimeoutSecs(300L)
                            .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
                    .flashcall(
                        VerifyProfileUpdateParams.Flashcall.builder()
                            .defaultVerificationTimeoutSecs(300L)
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
                    .language("en-US")
                    .name("Test Profile")
                    .sms(
                        VerifyProfileUpdateParams.Sms.builder()
                            .alphaSender("sqF")
                            .appName("Example Secure App")
                            .codeLength(6L)
                            .defaultVerificationTimeoutSecs(300L)
                            .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
                    .webhookFailoverUrl("http://example.com/webhook/failover")
                    .webhookUrl("http://example.com/webhook")
                    .build()
            )

        val verifyProfileData = verifyProfileDataFuture.get()
        verifyProfileData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val pageFuture = verifyProfileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val verifyProfileDataFuture =
            verifyProfileServiceAsync.delete("12ade33a-21c0-473b-b055-b3c836e1c292")

        val verifyProfileData = verifyProfileDataFuture.get()
        verifyProfileData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createTemplate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val messageTemplateFuture =
            verifyProfileServiceAsync.createTemplate(
                VerifyProfileCreateTemplateParams.builder()
                    .text("Your {{app_name}} verification code is: {{code}}.")
                    .build()
            )

        val messageTemplate = messageTemplateFuture.get()
        messageTemplate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveTemplates() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val responseFuture = verifyProfileServiceAsync.retrieveTemplates()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateTemplate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyProfileServiceAsync = client.verifyProfiles()

        val messageTemplateFuture =
            verifyProfileServiceAsync.updateTemplate(
                VerifyProfileUpdateTemplateParams.builder()
                    .templateId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .text("Your {{app_name}} verification code is: {{code}}.")
                    .build()
            )

        val messageTemplate = messageTemplateFuture.get()
        messageTemplate.validate()
    }
}
