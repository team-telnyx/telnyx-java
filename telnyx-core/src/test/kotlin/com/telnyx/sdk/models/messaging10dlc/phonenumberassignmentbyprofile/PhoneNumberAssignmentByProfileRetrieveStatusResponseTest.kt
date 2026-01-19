// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileRetrieveStatusResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileRetrieveStatusResponse =
            PhoneNumberAssignmentByProfileRetrieveStatusResponse.builder()
                .status(PhoneNumberAssignmentByProfileRetrieveStatusResponse.Status.PENDING)
                .taskId("taskId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(phoneNumberAssignmentByProfileRetrieveStatusResponse.status())
            .isEqualTo(PhoneNumberAssignmentByProfileRetrieveStatusResponse.Status.PENDING)
        assertThat(phoneNumberAssignmentByProfileRetrieveStatusResponse.taskId())
            .isEqualTo("taskId")
        assertThat(phoneNumberAssignmentByProfileRetrieveStatusResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(phoneNumberAssignmentByProfileRetrieveStatusResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileRetrieveStatusResponse =
            PhoneNumberAssignmentByProfileRetrieveStatusResponse.builder()
                .status(PhoneNumberAssignmentByProfileRetrieveStatusResponse.Status.PENDING)
                .taskId("taskId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignmentByProfileRetrieveStatusResponse),
                jacksonTypeRef<PhoneNumberAssignmentByProfileRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileRetrieveStatusResponse)
            .isEqualTo(phoneNumberAssignmentByProfileRetrieveStatusResponse)
    }
}
