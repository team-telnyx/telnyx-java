// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.signup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SignupRetrieveStatusResponseTest {

    @Test
    fun create() {
        val signupRetrieveStatusResponse =
            SignupRetrieveStatusResponse.builder()
                .data(
                    SignupRetrieveStatusResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .addError("string")
                        .recordType(
                            SignupRetrieveStatusResponse.Data.RecordType.WHATSAPP_SESSION_ID
                        )
                        .sessionId("session_id")
                        .state(SignupRetrieveStatusResponse.Data.State.SUBSCRIBE_WEBHOOKS)
                        .status(SignupRetrieveStatusResponse.Data.Status.INCOMPLETE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .wabaId("waba_id")
                        .build()
                )
                .build()

        assertThat(signupRetrieveStatusResponse.data())
            .contains(
                SignupRetrieveStatusResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .addError("string")
                    .recordType(SignupRetrieveStatusResponse.Data.RecordType.WHATSAPP_SESSION_ID)
                    .sessionId("session_id")
                    .state(SignupRetrieveStatusResponse.Data.State.SUBSCRIBE_WEBHOOKS)
                    .status(SignupRetrieveStatusResponse.Data.Status.INCOMPLETE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .wabaId("waba_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signupRetrieveStatusResponse =
            SignupRetrieveStatusResponse.builder()
                .data(
                    SignupRetrieveStatusResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customerId("customer_id")
                        .addError("string")
                        .recordType(
                            SignupRetrieveStatusResponse.Data.RecordType.WHATSAPP_SESSION_ID
                        )
                        .sessionId("session_id")
                        .state(SignupRetrieveStatusResponse.Data.State.SUBSCRIBE_WEBHOOKS)
                        .status(SignupRetrieveStatusResponse.Data.Status.INCOMPLETE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .wabaId("waba_id")
                        .build()
                )
                .build()

        val roundtrippedSignupRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(signupRetrieveStatusResponse),
                jacksonTypeRef<SignupRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedSignupRetrieveStatusResponse).isEqualTo(signupRetrieveStatusResponse)
    }
}
