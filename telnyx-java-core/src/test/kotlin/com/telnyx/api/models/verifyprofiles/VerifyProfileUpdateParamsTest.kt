// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifyprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            VerifyProfileUpdateParams.builder()
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.call())
            .contains(
                VerifyProfileUpdateParams.Call.builder()
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
                VerifyProfileUpdateParams.Flashcall.builder()
                    .defaultVerificationTimeoutSecs(300L)
                    .addWhitelistedDestination("US")
                    .addWhitelistedDestination("CA")
                    .build()
            )
        assertThat(body.language()).contains("en-US")
        assertThat(body.name()).contains("Test Profile")
        assertThat(body.sms())
            .contains(
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
        assertThat(body.webhookFailoverUrl()).contains("http://example.com/webhook/failover")
        assertThat(body.webhookUrl()).contains("http://example.com/webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerifyProfileUpdateParams.builder()
                .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        val body = params._body()
    }
}
