// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls.siprec

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecSiprecSidJsonResponseTest {

    @Test
    fun create() {
        val siprecSiprecSidJsonResponse =
            SiprecSiprecSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .dateUpdated("Fri, 11 Aug 2023 19:12:11 +0000")
                .errorCode("error_code")
                .sid("61bf923e-5e4d-4595-a110-56190ea18123")
                .status(SiprecSiprecSidJsonResponse.Status.IN_PROGRESS)
                .uri(
                    "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123"
                )
                .build()

        assertThat(siprecSiprecSidJsonResponse.accountSid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18a1b")
        assertThat(siprecSiprecSidJsonResponse.callSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(siprecSiprecSidJsonResponse.dateUpdated())
            .contains("Fri, 11 Aug 2023 19:12:11 +0000")
        assertThat(siprecSiprecSidJsonResponse.errorCode()).contains("error_code")
        assertThat(siprecSiprecSidJsonResponse.sid())
            .contains("61bf923e-5e4d-4595-a110-56190ea18123")
        assertThat(siprecSiprecSidJsonResponse.status())
            .contains(SiprecSiprecSidJsonResponse.Status.IN_PROGRESS)
        assertThat(siprecSiprecSidJsonResponse.uri())
            .contains(
                "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siprecSiprecSidJsonResponse =
            SiprecSiprecSidJsonResponse.builder()
                .accountSid("61bf923e-5e4d-4595-a110-56190ea18a1b")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .dateUpdated("Fri, 11 Aug 2023 19:12:11 +0000")
                .errorCode("error_code")
                .sid("61bf923e-5e4d-4595-a110-56190ea18123")
                .status(SiprecSiprecSidJsonResponse.Status.IN_PROGRESS)
                .uri(
                    "https://api.telnyx.com/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18123/Calls/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-ai/Siprec/61bf923e-5e4d-4595-a110-56190ea18123"
                )
                .build()

        val roundtrippedSiprecSiprecSidJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siprecSiprecSidJsonResponse),
                jacksonTypeRef<SiprecSiprecSidJsonResponse>(),
            )

        assertThat(roundtrippedSiprecSiprecSidJsonResponse).isEqualTo(siprecSiprecSidJsonResponse)
    }
}
