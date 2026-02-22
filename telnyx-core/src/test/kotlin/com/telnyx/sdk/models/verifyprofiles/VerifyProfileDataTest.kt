// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileDataTest {

    @Test
    fun create() {
        val verifyProfileData =
            VerifyProfileData.builder()
                .data(
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
                            VerifyProfile.Flashcall.builder()
                                .appName("Example Secure App")
                                .defaultVerificationTimeoutSecs(300L)
                                .build()
                        )
                        .language("en-US")
                        .name("Test Profile")
                        .rcs(
                            VerifyProfile.Rcs.builder()
                                .appName("Example Secure App")
                                .codeLength(6L)
                                .defaultVerificationTimeoutSecs(300L)
                                .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                                .smsFallback(true)
                                .addWhitelistedDestination("US")
                                .addWhitelistedDestination("CA")
                                .build()
                        )
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
                )
                .build()

        assertThat(verifyProfileData.data())
            .contains(
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
                        VerifyProfile.Flashcall.builder()
                            .appName("Example Secure App")
                            .defaultVerificationTimeoutSecs(300L)
                            .build()
                    )
                    .language("en-US")
                    .name("Test Profile")
                    .rcs(
                        VerifyProfile.Rcs.builder()
                            .appName("Example Secure App")
                            .codeLength(6L)
                            .defaultVerificationTimeoutSecs(300L)
                            .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                            .smsFallback(true)
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyProfileData =
            VerifyProfileData.builder()
                .data(
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
                            VerifyProfile.Flashcall.builder()
                                .appName("Example Secure App")
                                .defaultVerificationTimeoutSecs(300L)
                                .build()
                        )
                        .language("en-US")
                        .name("Test Profile")
                        .rcs(
                            VerifyProfile.Rcs.builder()
                                .appName("Example Secure App")
                                .codeLength(6L)
                                .defaultVerificationTimeoutSecs(300L)
                                .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                                .smsFallback(true)
                                .addWhitelistedDestination("US")
                                .addWhitelistedDestination("CA")
                                .build()
                        )
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
                )
                .build()

        val roundtrippedVerifyProfileData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfileData),
                jacksonTypeRef<VerifyProfileData>(),
            )

        assertThat(roundtrippedVerifyProfileData).isEqualTo(verifyProfileData)
    }
}
