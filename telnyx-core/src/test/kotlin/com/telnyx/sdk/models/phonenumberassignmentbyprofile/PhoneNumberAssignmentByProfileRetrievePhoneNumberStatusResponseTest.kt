// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.builder()
                .addRecord(
                    PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.Record.builder()
                        .phoneNumber("+12024567890")
                        .status("pending")
                        .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                        .build()
                )
                .build()

        assertThat(phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.records())
            .containsExactly(
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.Record.builder()
                    .phoneNumber("+12024567890")
                    .status("pending")
                    .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.builder()
                .addRecord(
                    PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse.Record.builder()
                        .phoneNumber("+12024567890")
                        .status("pending")
                        .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
                ),
                jacksonTypeRef<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse)
            .isEqualTo(phoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse)
    }
}
