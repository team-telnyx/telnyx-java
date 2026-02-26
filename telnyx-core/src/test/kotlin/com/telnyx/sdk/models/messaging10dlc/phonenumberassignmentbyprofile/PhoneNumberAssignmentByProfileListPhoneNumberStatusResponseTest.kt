// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileListPhoneNumberStatusResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse.builder()
                .addRecord(
                    ProfileAssignmentPhoneNumbers.builder()
                        .phoneNumber("+12024567890")
                        .status("pending")
                        .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                        .build()
                )
                .build()

        assertThat(phoneNumberAssignmentByProfileListPhoneNumberStatusResponse.records())
            .containsExactly(
                ProfileAssignmentPhoneNumbers.builder()
                    .phoneNumber("+12024567890")
                    .status("pending")
                    .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse.builder()
                .addRecord(
                    ProfileAssignmentPhoneNumbers.builder()
                        .phoneNumber("+12024567890")
                        .status("pending")
                        .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    phoneNumberAssignmentByProfileListPhoneNumberStatusResponse
                ),
                jacksonTypeRef<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileListPhoneNumberStatusResponse)
            .isEqualTo(phoneNumberAssignmentByProfileListPhoneNumberStatusResponse)
    }
}
