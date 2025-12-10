// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse.builder()
                .addRecord(
                    PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse.Record.builder()
                        .phoneNumber("+12024567890")
                        .status("pending")
                        .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                        .build()
                )
                .build()

        assertThat(phoneNumberAssignmentByProfileRetrievePhoneNumbersResponse.records())
            .containsExactly(
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse.Record.builder()
                    .phoneNumber("+12024567890")
                    .status("pending")
                    .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse.builder()
                .addRecord(
                    PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse.Record.builder()
                        .phoneNumber("+12024567890")
                        .status("pending")
                        .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    phoneNumberAssignmentByProfileRetrievePhoneNumbersResponse
                ),
                jacksonTypeRef<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse)
            .isEqualTo(phoneNumberAssignmentByProfileRetrievePhoneNumbersResponse)
    }
}
