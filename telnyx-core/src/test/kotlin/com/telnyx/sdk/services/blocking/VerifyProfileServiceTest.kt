// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VerifyProfileServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val verifyProfileData =
            verifyProfileService.create(
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

        verifyProfileData.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val verifyProfileData =
            verifyProfileService.retrieve("12ade33a-21c0-473b-b055-b3c836e1c292")

        verifyProfileData.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val verifyProfileData =
            verifyProfileService.update(
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

        verifyProfileData.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val page = verifyProfileService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val verifyProfileData = verifyProfileService.delete("12ade33a-21c0-473b-b055-b3c836e1c292")

        verifyProfileData.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createTemplate() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val messageTemplate =
            verifyProfileService.createTemplate(
                VerifyProfileCreateTemplateParams.builder()
                    .text("Your {{app_name}} verification code is: {{code}}.")
                    .build()
            )

        messageTemplate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveTemplates() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val response = verifyProfileService.retrieveTemplates()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateTemplate() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verifyProfileService = client.verifyProfiles()

        val messageTemplate =
            verifyProfileService.updateTemplate(
                VerifyProfileUpdateTemplateParams.builder()
                    .templateId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .text("Your {{app_name}} verification code is: {{code}}.")
                    .build()
            )

        messageTemplate.validate()
    }
}
