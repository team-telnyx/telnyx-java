// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignupListResponseTest {

    @Test
    fun create() {
        val signupListResponse =
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

        assertThat(signupListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(signupListResponse.customerId()).contains("customer_id")
        assertThat(signupListResponse.errors().getOrNull()).containsExactly("string")
        assertThat(signupListResponse.recordType())
            .contains(SignupListResponse.RecordType.WHATSAPP_SESSION_ID)
        assertThat(signupListResponse.sessionId()).contains("session_id")
        assertThat(signupListResponse.state()).contains(SignupListResponse.State.SUBSCRIBE_WEBHOOKS)
        assertThat(signupListResponse.status()).contains(SignupListResponse.Status.INCOMPLETE)
        assertThat(signupListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(signupListResponse.userId()).contains("user_id")
        assertThat(signupListResponse.wabaId()).contains("waba_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signupListResponse =
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

        val roundtrippedSignupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signupListResponse),
                jacksonTypeRef<SignupListResponse>(),
            )

        assertThat(roundtrippedSignupListResponse).isEqualTo(signupListResponse)
    }
}
