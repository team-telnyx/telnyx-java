// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReasonValidateResponseTest {

    @Test
    fun create() {
        val callReasonValidateResponse =
            CallReasonValidateResponse.builder()
                .data(
                    CallReasonValidateResponse.Data.builder()
                        .allPreApproved(false)
                        .addNonApprovedReason("Appointment reminders")
                        .addNonApprovedReason("Billing inquiries")
                        .requiresManualVetting(true)
                        .build()
                )
                .build()

        assertThat(callReasonValidateResponse.data())
            .isEqualTo(
                CallReasonValidateResponse.Data.builder()
                    .allPreApproved(false)
                    .addNonApprovedReason("Appointment reminders")
                    .addNonApprovedReason("Billing inquiries")
                    .requiresManualVetting(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callReasonValidateResponse =
            CallReasonValidateResponse.builder()
                .data(
                    CallReasonValidateResponse.Data.builder()
                        .allPreApproved(false)
                        .addNonApprovedReason("Appointment reminders")
                        .addNonApprovedReason("Billing inquiries")
                        .requiresManualVetting(true)
                        .build()
                )
                .build()

        val roundtrippedCallReasonValidateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callReasonValidateResponse),
                jacksonTypeRef<CallReasonValidateResponse>(),
            )

        assertThat(roundtrippedCallReasonValidateResponse).isEqualTo(callReasonValidateResponse)
    }
}
