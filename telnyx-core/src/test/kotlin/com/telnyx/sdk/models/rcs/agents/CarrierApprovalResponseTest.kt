// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarrierApprovalResponseTest {

    @Test
    fun create() {
        val carrierApprovalResponse =
            CarrierApprovalResponse.builder()
                .approvalId("33333333-3333-4333-8333-333333333333")
                .approvedAt(null)
                .carrier(null)
                .rejectedReason(null)
                .scopeType(CarrierApprovalResponse.ScopeType.HUB)
                .status(CarrierApprovalResponse.Status.SUBMITTED)
                .submittedAt(OffsetDateTime.parse("2026-08-10T12:00:00Z"))
                .build()

        assertThat(carrierApprovalResponse.approvalId())
            .isEqualTo("33333333-3333-4333-8333-333333333333")
        assertThat(carrierApprovalResponse.approvedAt()).isEmpty
        assertThat(carrierApprovalResponse.carrier()).isEmpty
        assertThat(carrierApprovalResponse.rejectedReason()).isEmpty
        assertThat(carrierApprovalResponse.scopeType())
            .isEqualTo(CarrierApprovalResponse.ScopeType.HUB)
        assertThat(carrierApprovalResponse.status())
            .isEqualTo(CarrierApprovalResponse.Status.SUBMITTED)
        assertThat(carrierApprovalResponse.submittedAt())
            .contains(OffsetDateTime.parse("2026-08-10T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val carrierApprovalResponse =
            CarrierApprovalResponse.builder()
                .approvalId("33333333-3333-4333-8333-333333333333")
                .approvedAt(null)
                .carrier(null)
                .rejectedReason(null)
                .scopeType(CarrierApprovalResponse.ScopeType.HUB)
                .status(CarrierApprovalResponse.Status.SUBMITTED)
                .submittedAt(OffsetDateTime.parse("2026-08-10T12:00:00Z"))
                .build()

        val roundtrippedCarrierApprovalResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(carrierApprovalResponse),
                jacksonTypeRef<CarrierApprovalResponse>(),
            )

        assertThat(roundtrippedCarrierApprovalResponse).isEqualTo(carrierApprovalResponse)
    }
}
