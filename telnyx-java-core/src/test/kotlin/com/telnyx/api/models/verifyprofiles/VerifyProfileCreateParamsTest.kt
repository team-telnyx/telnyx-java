// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifyprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.name()).isEqualTo("Test Profile")
        assertThat(body.call())
            .contains(
                VerifyProfileCreateParams.Call.builder()
                    .appName("Example Secure App")
                    .codeLength(6L)
                    .defaultVerificationTimeoutSecs(300L)
                    .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                    .addWhitelistedDestination("US")
                    .addWhitelistedDestination("CA")
                    .build()
            )
        assertThat(body.flashcall())
            .contains(
                VerifyProfileCreateParams.Flashcall.builder()
                    .defaultVerificationTimeoutSecs(300L)
                    .addWhitelistedDestination("US")
                    .addWhitelistedDestination("CA")
                    .build()
            )
        assertThat(body.language()).contains("en-US")
        assertThat(body.sms())
            .contains(
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
        assertThat(body.webhookFailoverUrl()).contains("http://example.com/webhook/failover")
        assertThat(body.webhookUrl()).contains("http://example.com/webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VerifyProfileCreateParams.builder().name("Test Profile").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Test Profile")
    }
}
