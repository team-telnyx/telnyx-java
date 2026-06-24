// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallResourceTest {

    @Test
    fun create() {
        val callResource =
            CallResource.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .answeredBy(CallResource.AnsweredBy.HUMAN)
                .callerName("+13122010094")
                .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                .direction(CallResource.Direction.INBOUND)
                .duration("11")
                .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                .from("+13123456789")
                .fromFormatted("(312) 345-6789")
                .price("0.10")
                .priceUnit("USD")
                .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                .status(CallResource.Status.COMPLETED)
                .to("+13987654321")
                .toFormatted("(398) 765-4321")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                )
                .build()

        assertThat(callResource.accountSid()).contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(callResource.answeredBy()).contains(CallResource.AnsweredBy.HUMAN)
        assertThat(callResource.callerName()).contains("+13122010094")
        assertThat(callResource.dateCreated()).contains("Thu, 15 Jun 2023 09:56:45 +0000")
        assertThat(callResource.dateUpdated()).contains("Thu, 15 Jun 2023 09:56:56 +0000")
        assertThat(callResource.direction()).contains(CallResource.Direction.INBOUND)
        assertThat(callResource.duration()).contains("11")
        assertThat(callResource.endTime()).contains("Thu, 15 Jun 2023 09:56:56 +0000")
        assertThat(callResource.from()).contains("+13123456789")
        assertThat(callResource.fromFormatted()).contains("(312) 345-6789")
        assertThat(callResource.price()).contains("0.10")
        assertThat(callResource.priceUnit()).contains("USD")
        assertThat(callResource.sid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(callResource.startTime()).contains("Thu, 15 Jun 2023 09:56:45 +0000")
        assertThat(callResource.status()).contains(CallResource.Status.COMPLETED)
        assertThat(callResource.to()).contains("+13987654321")
        assertThat(callResource.toFormatted()).contains("(398) 765-4321")
        assertThat(callResource.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callResource =
            CallResource.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .answeredBy(CallResource.AnsweredBy.HUMAN)
                .callerName("+13122010094")
                .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                .direction(CallResource.Direction.INBOUND)
                .duration("11")
                .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                .from("+13123456789")
                .fromFormatted("(312) 345-6789")
                .price("0.10")
                .priceUnit("USD")
                .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                .status(CallResource.Status.COMPLETED)
                .to("+13987654321")
                .toFormatted("(398) 765-4321")
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                )
                .build()

        val roundtrippedCallResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callResource),
                jacksonTypeRef<CallResource>(),
            )

        assertThat(roundtrippedCallResource).isEqualTo(callResource)
    }
}
