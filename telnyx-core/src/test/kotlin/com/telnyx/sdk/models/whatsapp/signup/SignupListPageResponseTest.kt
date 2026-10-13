// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignupListPageResponseTest {

    @Test
    fun create() {
        val signupListPageResponse =
            SignupListPageResponse.builder()
                .addData(
                    SignupListResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .addError("string")
                        .recordType(SignupListResponse.RecordType.WHATSAPP_SESSION_ID)
                        .sessionId("session_id")
                        .state(SignupListResponse.State.SUBSCRIBE_WEBHOOKS)
                        .status(SignupListResponse.Status.INCOMPLETE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .wabaId("waba_id")
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(signupListPageResponse.data().getOrNull())
            .containsExactly(
                SignupListResponse.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .addError("string")
                    .recordType(SignupListResponse.RecordType.WHATSAPP_SESSION_ID)
                    .sessionId("session_id")
                    .state(SignupListResponse.State.SUBSCRIBE_WEBHOOKS)
                    .status(SignupListResponse.Status.INCOMPLETE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .wabaId("waba_id")
                    .build()
            )
        assertThat(signupListPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
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
        val signupListPageResponse =
            SignupListPageResponse.builder()
                .addData(
                    SignupListResponse.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .addError("string")
                        .recordType(SignupListResponse.RecordType.WHATSAPP_SESSION_ID)
                        .sessionId("session_id")
                        .state(SignupListResponse.State.SUBSCRIBE_WEBHOOKS)
                        .status(SignupListResponse.Status.INCOMPLETE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .wabaId("waba_id")
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedSignupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signupListPageResponse),
                jacksonTypeRef<SignupListPageResponse>(),
            )

        assertThat(roundtrippedSignupListPageResponse).isEqualTo(signupListPageResponse)
    }
}
