// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileListResponseTest {

    @Test
    fun create() {
        val verifyProfileListResponse =
            VerifyProfileListResponse.builder()
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
                        .flashcall(
                            VerifyProfile.Flashcall.builder()
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
                        .build()
                )
                .meta(
                    VerifyProfileListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(verifyProfileListResponse.data())
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
                    .flashcall(
                        VerifyProfile.Flashcall.builder()
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
                    .build()
            )
        assertThat(verifyProfileListResponse.meta())
            .isEqualTo(
                VerifyProfileListResponse.Meta.builder()
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
        val verifyProfileListResponse =
            VerifyProfileListResponse.builder()
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
                        .flashcall(
                            VerifyProfile.Flashcall.builder()
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
                        .build()
                )
                .meta(
                    VerifyProfileListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedVerifyProfileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyProfileListResponse),
                jacksonTypeRef<VerifyProfileListResponse>(),
            )

        assertThat(roundtrippedVerifyProfileListResponse).isEqualTo(verifyProfileListResponse)
    }
}
