// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallUpdateResponseTest {

    @Test
    fun create() {
        val callUpdateResponse =
            CallUpdateResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .answeredBy(CallUpdateResponse.AnsweredBy.HUMAN)
                .callerName("+13122010094")
                .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                .direction(CallUpdateResponse.Direction.INBOUND)
                .duration("11")
                .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                .from("+13123456789")
                .fromFormatted("(312) 345-6789")
                .price("price")
                .priceUnit("price_unit")
                .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                .status(CallUpdateResponse.Status.COMPLETED)
                .to("+13987654321")
                .toFormatted("(398) 765-4321")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                )
                .build()

        assertThat(callUpdateResponse.accountSid()).contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(callUpdateResponse.answeredBy()).contains(CallUpdateResponse.AnsweredBy.HUMAN)
        assertThat(callUpdateResponse.callerName()).contains("+13122010094")
        assertThat(callUpdateResponse.dateCreated()).contains("Thu, 15 Jun 2023 09:56:45 +0000")
        assertThat(callUpdateResponse.dateUpdated()).contains("Thu, 15 Jun 2023 09:56:56 +0000")
        assertThat(callUpdateResponse.direction()).contains(CallUpdateResponse.Direction.INBOUND)
        assertThat(callUpdateResponse.duration()).contains("11")
        assertThat(callUpdateResponse.endTime()).contains("Thu, 15 Jun 2023 09:56:56 +0000")
        assertThat(callUpdateResponse.from()).contains("+13123456789")
        assertThat(callUpdateResponse.fromFormatted()).contains("(312) 345-6789")
        assertThat(callUpdateResponse.price()).contains("price")
        assertThat(callUpdateResponse.priceUnit()).contains("price_unit")
        assertThat(callUpdateResponse.sid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(callUpdateResponse.startTime()).contains("Thu, 15 Jun 2023 09:56:45 +0000")
        assertThat(callUpdateResponse.status()).contains(CallUpdateResponse.Status.COMPLETED)
        assertThat(callUpdateResponse.to()).contains("+13987654321")
        assertThat(callUpdateResponse.toFormatted()).contains("(398) 765-4321")
        assertThat(callUpdateResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callUpdateResponse =
            CallUpdateResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .answeredBy(CallUpdateResponse.AnsweredBy.HUMAN)
                .callerName("+13122010094")
                .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                .direction(CallUpdateResponse.Direction.INBOUND)
                .duration("11")
                .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                .from("+13123456789")
                .fromFormatted("(312) 345-6789")
                .price("price")
                .priceUnit("price_unit")
                .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                .status(CallUpdateResponse.Status.COMPLETED)
                .to("+13987654321")
                .toFormatted("(398) 765-4321")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                )
                .build()

        val roundtrippedCallUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callUpdateResponse),
                jacksonTypeRef<CallUpdateResponse>(),
            )

        assertThat(roundtrippedCallUpdateResponse).isEqualTo(callUpdateResponse)
    }
}
