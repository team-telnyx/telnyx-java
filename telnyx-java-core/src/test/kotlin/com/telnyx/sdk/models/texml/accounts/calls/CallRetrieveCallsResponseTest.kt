// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveCallsResponseTest {

    @Test
    fun create() {
        val callRetrieveCallsResponse =
            CallRetrieveCallsResponse.builder()
                .addCall(
                    CallRetrieveCallsResponse.Call.builder()
                        .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                        .answeredBy(CallRetrieveCallsResponse.Call.AnsweredBy.HUMAN)
                        .callerName("+13122010094")
                        .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                        .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                        .direction(CallRetrieveCallsResponse.Call.Direction.INBOUND)
                        .duration("11")
                        .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                        .from("+13123456789")
                        .fromFormatted("(312) 345-6789")
                        .price("0.10")
                        .priceUnit("USD")
                        .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                        .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                        .status(CallRetrieveCallsResponse.Call.Status.COMPLETED)
                        .to("+13987654321")
                        .toFormatted("(398) 765-4321")
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                        )
                        .build()
                )
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
                )
                .page(0L)
                .pageSize(1L)
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1"
                )
                .build()

        assertThat(callRetrieveCallsResponse.calls().getOrNull())
            .containsExactly(
                CallRetrieveCallsResponse.Call.builder()
                    .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                    .answeredBy(CallRetrieveCallsResponse.Call.AnsweredBy.HUMAN)
                    .callerName("+13122010094")
                    .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                    .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                    .direction(CallRetrieveCallsResponse.Call.Direction.INBOUND)
                    .duration("11")
                    .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                    .from("+13123456789")
                    .fromFormatted("(312) 345-6789")
                    .price("0.10")
                    .priceUnit("USD")
                    .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                    .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                    .status(CallRetrieveCallsResponse.Call.Status.COMPLETED)
                    .to("+13987654321")
                    .toFormatted("(398) 765-4321")
                    .uri(
                        "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                    )
                    .build()
            )
        assertThat(callRetrieveCallsResponse.end()).contains(0L)
        assertThat(callRetrieveCallsResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1"
            )
        assertThat(callRetrieveCallsResponse.nextPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
            )
        assertThat(callRetrieveCallsResponse.page()).contains(0L)
        assertThat(callRetrieveCallsResponse.pageSize()).contains(1L)
        assertThat(callRetrieveCallsResponse.start()).contains(0L)
        assertThat(callRetrieveCallsResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRetrieveCallsResponse =
            CallRetrieveCallsResponse.builder()
                .addCall(
                    CallRetrieveCallsResponse.Call.builder()
                        .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                        .answeredBy(CallRetrieveCallsResponse.Call.AnsweredBy.HUMAN)
                        .callerName("+13122010094")
                        .dateCreated("Thu, 15 Jun 2023 09:56:45 +0000")
                        .dateUpdated("Thu, 15 Jun 2023 09:56:56 +0000")
                        .direction(CallRetrieveCallsResponse.Call.Direction.INBOUND)
                        .duration("11")
                        .endTime("Thu, 15 Jun 2023 09:56:56 +0000")
                        .from("+13123456789")
                        .fromFormatted("(312) 345-6789")
                        .price("0.10")
                        .priceUnit("USD")
                        .sid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                        .startTime("Thu, 15 Jun 2023 09:56:45 +0000")
                        .status(CallRetrieveCallsResponse.Call.Status.COMPLETED)
                        .to("+13987654321")
                        .toFormatted("(398) 765-4321")
                        .uri(
                            "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA.json"
                        )
                        .build()
                )
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1"
                )
                .nextPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=1&PageSize=1&PageToken=MTY4AjgyNDkwNzIxMQ"
                )
                .page(0L)
                .pageSize(1L)
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls.json?Page=0&PageSize=1"
                )
                .build()

        val roundtrippedCallRetrieveCallsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRetrieveCallsResponse),
                jacksonTypeRef<CallRetrieveCallsResponse>(),
            )

        assertThat(roundtrippedCallRetrieveCallsResponse).isEqualTo(callRetrieveCallsResponse)
    }
}
