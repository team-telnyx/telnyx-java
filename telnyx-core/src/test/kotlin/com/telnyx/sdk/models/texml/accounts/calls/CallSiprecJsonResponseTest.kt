// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecJsonResponseTest {

    @Test
    fun create() {
        val callSiprecJsonResponse =
            CallSiprecJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .dateCreated("Fri, 11 Aug 2023 19:12:11 +0000")
                .dateUpdated("Fri, 11 Aug 2023 19:12:11 +0000")
                .errorCode("error_code")
                .sid("61bf923e-5e4d-4595-a110-56190ea18123")
                .startTime("Fri, 11 Aug 2023 19:12:11 +0000")
                .status(CallSiprecJsonResponse.Status.IN_PROGRESS)
                .track(CallSiprecJsonResponse.Track.BOTH_TRACKS)
                .uri(
                    "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123"
                )
                .build()

        assertThat(callSiprecJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(callSiprecJsonResponse.callSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(callSiprecJsonResponse.dateCreated()).contains("Fri, 11 Aug 2023 19:12:11 +0000")
        assertThat(callSiprecJsonResponse.dateUpdated()).contains("Fri, 11 Aug 2023 19:12:11 +0000")
        assertThat(callSiprecJsonResponse.errorCode()).contains("error_code")
        assertThat(callSiprecJsonResponse.sid()).contains("61bf923e-5e4d-4595-a110-56190ea18123")
        assertThat(callSiprecJsonResponse.startTime()).contains("Fri, 11 Aug 2023 19:12:11 +0000")
        assertThat(callSiprecJsonResponse.status())
            .contains(CallSiprecJsonResponse.Status.IN_PROGRESS)
        assertThat(callSiprecJsonResponse.track())
            .contains(CallSiprecJsonResponse.Track.BOTH_TRACKS)
        assertThat(callSiprecJsonResponse.uri())
            .contains(
                "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSiprecJsonResponse =
            CallSiprecJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .dateCreated("Fri, 11 Aug 2023 19:12:11 +0000")
                .dateUpdated("Fri, 11 Aug 2023 19:12:11 +0000")
                .errorCode("error_code")
                .sid("61bf923e-5e4d-4595-a110-56190ea18123")
                .startTime("Fri, 11 Aug 2023 19:12:11 +0000")
                .status(CallSiprecJsonResponse.Status.IN_PROGRESS)
                .track(CallSiprecJsonResponse.Track.BOTH_TRACKS)
                .uri(
                    "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123"
                )
                .build()

        val roundtrippedCallSiprecJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSiprecJsonResponse),
                jacksonTypeRef<CallSiprecJsonResponse>(),
            )

        assertThat(roundtrippedCallSiprecJsonResponse).isEqualTo(callSiprecJsonResponse)
    }
}
