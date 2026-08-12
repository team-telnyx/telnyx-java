// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents.testdevices

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestDeviceResponseTest {

    @Test
    fun create() {
        val testDeviceResponse =
            TestDeviceResponse.builder()
                .inviteStatus(TestDeviceResponse.InviteStatus.ACCEPTED)
                .phoneNumber("+13125550123")
                .testDeviceId("44444444-4444-4444-8444-444444444444")
                .build()

        assertThat(testDeviceResponse.inviteStatus())
            .isEqualTo(TestDeviceResponse.InviteStatus.ACCEPTED)
        assertThat(testDeviceResponse.phoneNumber()).isEqualTo("+13125550123")
        assertThat(testDeviceResponse.testDeviceId())
            .isEqualTo("44444444-4444-4444-8444-444444444444")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testDeviceResponse =
            TestDeviceResponse.builder()
                .inviteStatus(TestDeviceResponse.InviteStatus.ACCEPTED)
                .phoneNumber("+13125550123")
                .testDeviceId("44444444-4444-4444-8444-444444444444")
                .build()

        val roundtrippedTestDeviceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testDeviceResponse),
                jacksonTypeRef<TestDeviceResponse>(),
            )

        assertThat(roundtrippedTestDeviceResponse).isEqualTo(testDeviceResponse)
    }
}
