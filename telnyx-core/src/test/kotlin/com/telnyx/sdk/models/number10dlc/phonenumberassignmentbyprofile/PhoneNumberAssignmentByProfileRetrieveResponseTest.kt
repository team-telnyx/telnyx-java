// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileRetrieveResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileRetrieveResponse =
            PhoneNumberAssignmentByProfileRetrieveResponse.builder()
                .status(PhoneNumberAssignmentByProfileRetrieveResponse.Status.PENDING)
                .taskId("taskId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(phoneNumberAssignmentByProfileRetrieveResponse.status())
            .isEqualTo(PhoneNumberAssignmentByProfileRetrieveResponse.Status.PENDING)
        assertThat(phoneNumberAssignmentByProfileRetrieveResponse.taskId()).isEqualTo("taskId")
        assertThat(phoneNumberAssignmentByProfileRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(phoneNumberAssignmentByProfileRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileRetrieveResponse =
            PhoneNumberAssignmentByProfileRetrieveResponse.builder()
                .status(PhoneNumberAssignmentByProfileRetrieveResponse.Status.PENDING)
                .taskId("taskId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignmentByProfileRetrieveResponse),
                jacksonTypeRef<PhoneNumberAssignmentByProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileRetrieveResponse)
            .isEqualTo(phoneNumberAssignmentByProfileRetrieveResponse)
    }
}
