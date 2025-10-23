// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging.rcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcInviteTestNumberResponseTest {

    @Test
    fun create() {
        val rcInviteTestNumberResponse =
            RcInviteTestNumberResponse.builder()
                .data(
                    RcInviteTestNumberResponse.Data.builder()
                        .agentId("TestAgent")
                        .phoneNumber("+13125551234")
                        .recordType(
                            RcInviteTestNumberResponse.Data.RecordType.RCS_TEST_NUMBER_INVITE
                        )
                        .status("PENDING")
                        .build()
                )
                .build()

        assertThat(rcInviteTestNumberResponse.data())
            .isEqualTo(
                RcInviteTestNumberResponse.Data.builder()
                    .agentId("TestAgent")
                    .phoneNumber("+13125551234")
                    .recordType(RcInviteTestNumberResponse.Data.RecordType.RCS_TEST_NUMBER_INVITE)
                    .status("PENDING")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcInviteTestNumberResponse =
            RcInviteTestNumberResponse.builder()
                .data(
                    RcInviteTestNumberResponse.Data.builder()
                        .agentId("TestAgent")
                        .phoneNumber("+13125551234")
                        .recordType(
                            RcInviteTestNumberResponse.Data.RecordType.RCS_TEST_NUMBER_INVITE
                        )
                        .status("PENDING")
                        .build()
                )
                .build()

        val roundtrippedRcInviteTestNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcInviteTestNumberResponse),
                jacksonTypeRef<RcInviteTestNumberResponse>(),
            )

        assertThat(roundtrippedRcInviteTestNumberResponse).isEqualTo(rcInviteTestNumberResponse)
    }
}
