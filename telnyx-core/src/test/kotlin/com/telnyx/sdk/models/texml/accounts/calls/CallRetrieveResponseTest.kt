// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveResponseTest {

    @Test
    fun create() {
        val callRetrieveResponse =
            CallRetrieveResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .answeredBy(CallRetrieveResponse.AnsweredBy.HUMAN)
                .callerName("+13122010094")
                .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                .direction(CallRetrieveResponse.Direction.INBOUND)
                .duration("11")
                .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                .from("+13123456789")
                .fromFormatted("(312) 345-6789")
                .price("0.10")
                .priceUnit("USD")
                .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                .status(CallRetrieveResponse.Status.COMPLETED)
                .to("+13987654321")
                .toFormatted("(398) 765-4321")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                )
                .build()

        assertThat(callRetrieveResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(callRetrieveResponse.answeredBy())
            .contains(CallRetrieveResponse.AnsweredBy.HUMAN)
        assertThat(callRetrieveResponse.callerName()).contains("+13122010094")
        assertThat(callRetrieveResponse.dateCreated()).contains("Thu, 15 Jun 2023 09:56:45 +0000")
        assertThat(callRetrieveResponse.dateUpdated()).contains("Thu, 15 Jun 2023 09:56:56 +0000")
        assertThat(callRetrieveResponse.direction())
            .contains(CallRetrieveResponse.Direction.INBOUND)
        assertThat(callRetrieveResponse.duration()).contains("11")
        assertThat(callRetrieveResponse.endTime()).contains("Thu, 15 Jun 2023 09:56:56 +0000")
        assertThat(callRetrieveResponse.from()).contains("+13123456789")
        assertThat(callRetrieveResponse.fromFormatted()).contains("(312) 345-6789")
        assertThat(callRetrieveResponse.price()).contains("0.10")
        assertThat(callRetrieveResponse.priceUnit()).contains("USD")
        assertThat(callRetrieveResponse.sid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(callRetrieveResponse.startTime()).contains("Thu, 15 Jun 2023 09:56:45 +0000")
        assertThat(callRetrieveResponse.status()).contains(CallRetrieveResponse.Status.COMPLETED)
        assertThat(callRetrieveResponse.to()).contains("+13987654321")
        assertThat(callRetrieveResponse.toFormatted()).contains("(398) 765-4321")
        assertThat(callRetrieveResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRetrieveResponse =
            CallRetrieveResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .answeredBy(CallRetrieveResponse.AnsweredBy.HUMAN)
                .callerName("+13122010094")
                .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                .direction(CallRetrieveResponse.Direction.INBOUND)
                .duration("11")
                .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                .from("+13123456789")
                .fromFormatted("(312) 345-6789")
                .price("0.10")
                .priceUnit("USD")
                .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                .status(CallRetrieveResponse.Status.COMPLETED)
                .to("+13987654321")
                .toFormatted("(398) 765-4321")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                )
                .build()

        val roundtrippedCallRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRetrieveResponse),
                jacksonTypeRef<CallRetrieveResponse>(),
            )

        assertThat(roundtrippedCallRetrieveResponse).isEqualTo(callRetrieveResponse)
    }
}
