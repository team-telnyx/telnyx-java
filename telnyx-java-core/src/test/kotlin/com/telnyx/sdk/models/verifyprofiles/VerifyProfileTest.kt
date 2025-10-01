// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileTest {

    @Test
    fun create() {
        val verifyProfile =
            VerifyProfile.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .call(
                    VerifyProfile.Call.builder()
                        .appName("Example Secure App")
                        .codeLength(6L)
                        .defaultVerificationTimeoutSecs(300L)
                        .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .addWhitelistedDestination("US")
                        .addWhitelistedDestination("CA")
                        .build()
                )
                .createdAt("2020-09-14T17:03:32.965812")
                .flashcall(
                    VerifyProfile.Flashcall.builder().defaultVerificationTimeoutSecs(300L).build()
                )
                .language("en-US")
                .name("Test Profile")
                .recordType(VerifyProfile.RecordType.VERIFICATION_PROFILE)
                .sms(
                    VerifyProfile.Sms.builder()
                        .alphaSender("sqF")
                        .appName("Example Secure App")
                        .codeLength(6L)
                        .defaultVerificationTimeoutSecs(300L)
                        .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .addWhitelistedDestination("US")
                        .addWhitelistedDestination("CA")
                        .build()
                )
                .updatedAt("2020-09-14T17:03:32.965812")
                .webhookFailoverUrl("http://example.com/webhook/failover")
                .webhookUrl("http://example.com/webhook")
                .build()

        assertThat(verifyProfile.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(verifyProfile.call())
            .contains(
                VerifyProfile.Call.builder()
                    .appName("Example Secure App")
                    .codeLength(6L)
                    .defaultVerificationTimeoutSecs(300L)
                    .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                    .addWhitelistedDestination("US")
                    .addWhitelistedDestination("CA")
                    .build()
            )
        assertThat(verifyProfile.createdAt()).contains("2020-09-14T17:03:32.965812")
        assertThat(verifyProfile.flashcall())
            .contains(
                VerifyProfile.Flashcall.builder().defaultVerificationTimeoutSecs(300L).build()
            )
        assertThat(verifyProfile.language()).contains("en-US")
        assertThat(verifyProfile.name()).contains("Test Profile")
        assertThat(verifyProfile.recordType())
            .contains(VerifyProfile.RecordType.VERIFICATION_PROFILE)
        assertThat(verifyProfile.sms())
            .contains(
                VerifyProfile.Sms.builder()
                    .alphaSender("sqF")
                    .appName("Example Secure App")
                    .codeLength(6L)
                    .defaultVerificationTimeoutSecs(300L)
                    .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                    .addWhitelistedDestination("US")
                    .addWhitelistedDestination("CA")
                    .build()
            )
        assertThat(verifyProfile.updatedAt()).contains("2020-09-14T17:03:32.965812")
        assertThat(verifyProfile.webhookFailoverUrl())
            .contains("http://example.com/webhook/failover")
        assertThat(verifyProfile.webhookUrl()).contains("http://example.com/webhook")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyProfile =
            VerifyProfile.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .call(
                    VerifyProfile.Call.builder()
                        .appName("Example Secure App")
                        .codeLength(6L)
                        .defaultVerificationTimeoutSecs(300L)
                        .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .addWhitelistedDestination("US")
                        .addWhitelistedDestination("CA")
                        .build()
                )
                .createdAt("2020-09-14T17:03:32.965812")
                .flashcall(
                    VerifyProfile.Flashcall.builder().defaultVerificationTimeoutSecs(300L).build()
                )
                .language("en-US")
                .name("Test Profile")
                .recordType(VerifyProfile.RecordType.VERIFICATION_PROFILE)
                .sms(
                    VerifyProfile.Sms.builder()
                        .alphaSender("sqF")
                        .appName("Example Secure App")
                        .codeLength(6L)
                        .defaultVerificationTimeoutSecs(300L)
                        .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                        .addWhitelistedDestination("US")
                        .addWhitelistedDestination("CA")
                        .build()
                )
                .updatedAt("2020-09-14T17:03:32.965812")
                .webhookFailoverUrl("http://example.com/webhook/failover")
                .webhookUrl("http://example.com/webhook")
                .build()

        val roundtrippedVerifyProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfile),
                jacksonTypeRef<VerifyProfile>(),
            )

        assertThat(roundtrippedVerifyProfile).isEqualTo(verifyProfile)
    }
}
