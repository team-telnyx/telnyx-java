// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.verifications.byphonenumber.VerifyMeta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileListPageResponseTest {

    @Test
    fun create() {
        val verifyProfileListPageResponse =
            VerifyProfileListPageResponse.builder()
                .addData(
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
                        .dailySpendLimit(100.0)
                        .dailySpendLimitEnabled(true)
                        .flashcall(
                            VerifyProfile.Flashcall.builder()
                                .appName("Example Secure App")
                                .defaultVerificationTimeoutSecs(300L)
                                .build()
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
                        .whatsapp(
                            VerifyProfile.Whatsapp.builder()
                                .appName("Example Secure App")
                                .codeLength(6L)
                                .defaultVerificationTimeoutSecs(300L)
                                .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                                .senderPhoneNumber("+13035551234")
                                .templateId("authentication_template_name")
                                .wabaId("1234567890")
                                .addWhitelistedDestination("US")
                                .addWhitelistedDestination("CA")
                                .build()
                        )
                        .build()
                )
                .meta(
                    VerifyMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(verifyProfileListPageResponse.data())
            .containsExactly(
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
                    .dailySpendLimit(100.0)
                    .dailySpendLimitEnabled(true)
                    .flashcall(
                        VerifyProfile.Flashcall.builder()
                            .appName("Example Secure App")
                            .defaultVerificationTimeoutSecs(300L)
                            .build()
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
                    .whatsapp(
                        VerifyProfile.Whatsapp.builder()
                            .appName("Example Secure App")
                            .codeLength(6L)
                            .defaultVerificationTimeoutSecs(300L)
                            .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                            .senderPhoneNumber("+13035551234")
                            .templateId("authentication_template_name")
                            .wabaId("1234567890")
                            .addWhitelistedDestination("US")
                            .addWhitelistedDestination("CA")
                            .build()
                    )
                    .build()
            )
        assertThat(verifyProfileListPageResponse.meta())
            .isEqualTo(
                VerifyMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyProfileListPageResponse =
            VerifyProfileListPageResponse.builder()
                .addData(
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
                        .dailySpendLimit(100.0)
                        .dailySpendLimitEnabled(true)
                        .flashcall(
                            VerifyProfile.Flashcall.builder()
                                .appName("Example Secure App")
                                .defaultVerificationTimeoutSecs(300L)
                                .build()
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
                        .whatsapp(
                            VerifyProfile.Whatsapp.builder()
                                .appName("Example Secure App")
                                .codeLength(6L)
                                .defaultVerificationTimeoutSecs(300L)
                                .messagingTemplateId("0abb5b4f-459f-445a-bfcd-488998b7572d")
                                .senderPhoneNumber("+13035551234")
                                .templateId("authentication_template_name")
                                .wabaId("1234567890")
                                .addWhitelistedDestination("US")
                                .addWhitelistedDestination("CA")
                                .build()
                        )
                        .build()
                )
                .meta(
                    VerifyMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedVerifyProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfileListPageResponse),
                jacksonTypeRef<VerifyProfileListPageResponse>(),
            )

        assertThat(roundtrippedVerifyProfileListPageResponse)
            .isEqualTo(verifyProfileListPageResponse)
    }
}
