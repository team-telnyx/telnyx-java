// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls.streams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamStreamingSidJsonResponseTest {

    @Test
    fun create() {
        val streamStreamingSidJsonResponse =
            StreamStreamingSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(StreamStreamingSidJsonResponse.Status.STOPPED)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        assertThat(streamStreamingSidJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(streamStreamingSidJsonResponse.callSid())
            .contains("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
        assertThat(streamStreamingSidJsonResponse.dateUpdated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(streamStreamingSidJsonResponse.sid())
            .contains("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
        assertThat(streamStreamingSidJsonResponse.status())
            .contains(StreamStreamingSidJsonResponse.Status.STOPPED)
        assertThat(streamStreamingSidJsonResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamStreamingSidJsonResponse =
            StreamStreamingSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA")
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sid("e9cea0be-7dbd-4b98-98b1-c0089d9d43b0")
                .status(StreamStreamingSidJsonResponse.Status.STOPPED)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Calls/v3:KBnLO0ZK3DhKM5s7bE9VluaSmKsOchKht_fUYvxcp8ysbmzCCtpkmA/Streams/b08f0fa1-a32c-4218-b3b5-9cf78941ccac.json"
                )
                .build()

        val roundtrippedStreamStreamingSidJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamStreamingSidJsonResponse),
                jacksonTypeRef<StreamStreamingSidJsonResponse>(),
            )

        assertThat(roundtrippedStreamStreamingSidJsonResponse)
            .isEqualTo(streamStreamingSidJsonResponse)
    }
}
