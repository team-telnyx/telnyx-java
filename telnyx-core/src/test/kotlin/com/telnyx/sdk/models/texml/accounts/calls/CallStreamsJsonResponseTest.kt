// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamsJsonResponseTest {

    @Test
    fun create() {
        val callStreamsJsonResponse =
            CallStreamsJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("My stream")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(CallStreamsJsonResponse.Status.IN_PROGRESS)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(callStreamsJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(callStreamsJsonResponse.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(callStreamsJsonResponse.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(callStreamsJsonResponse.name()).contains("My stream")
        assertThat(callStreamsJsonResponse.sid()).contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(callStreamsJsonResponse.status())
            .contains(CallStreamsJsonResponse.Status.IN_PROGRESS)
        assertThat(callStreamsJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callStreamsJsonResponse =
            CallStreamsJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("My stream")
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(CallStreamsJsonResponse.Status.IN_PROGRESS)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedCallStreamsJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callStreamsJsonResponse),
                jacksonTypeRef<CallStreamsJsonResponse>(),
            )

        assertThat(roundtrippedCallStreamsJsonResponse).isEqualTo(callStreamsJsonResponse)
    }
}
