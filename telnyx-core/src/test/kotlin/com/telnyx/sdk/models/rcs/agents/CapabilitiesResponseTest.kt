// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CapabilitiesResponseTest {

    @Test
    fun create() {
        val capabilitiesResponse =
            CapabilitiesResponse.builder()
                .brandEntity(true)
                .brandVerification(true)
                .campaigns(true)
                .distinctLaunchPhase(true)
                .inviteTestDevices(true)
                .perCarrierApproval(true)
                .submissionSections(true)
                .templates(true)
                .vendorWebhooks(true)
                .build()

        assertThat(capabilitiesResponse.brandEntity()).isEqualTo(true)
        assertThat(capabilitiesResponse.brandVerification()).isEqualTo(true)
        assertThat(capabilitiesResponse.campaigns()).isEqualTo(true)
        assertThat(capabilitiesResponse.distinctLaunchPhase()).isEqualTo(true)
        assertThat(capabilitiesResponse.inviteTestDevices()).isEqualTo(true)
        assertThat(capabilitiesResponse.perCarrierApproval()).isEqualTo(true)
        assertThat(capabilitiesResponse.submissionSections()).isEqualTo(true)
        assertThat(capabilitiesResponse.templates()).isEqualTo(true)
        assertThat(capabilitiesResponse.vendorWebhooks()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val capabilitiesResponse =
            CapabilitiesResponse.builder()
                .brandEntity(true)
                .brandVerification(true)
                .campaigns(true)
                .distinctLaunchPhase(true)
                .inviteTestDevices(true)
                .perCarrierApproval(true)
                .submissionSections(true)
                .templates(true)
                .vendorWebhooks(true)
                .build()

        val roundtrippedCapabilitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(capabilitiesResponse),
                jacksonTypeRef<CapabilitiesResponse>(),
            )

        assertThat(roundtrippedCapabilitiesResponse).isEqualTo(capabilitiesResponse)
    }
}
