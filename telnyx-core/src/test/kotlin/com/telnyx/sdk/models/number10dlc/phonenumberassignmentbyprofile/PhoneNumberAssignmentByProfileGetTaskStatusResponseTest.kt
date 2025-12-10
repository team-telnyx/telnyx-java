// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberAssignmentByProfileGetTaskStatusResponseTest {

    @Test
    fun create() {
        val phoneNumberAssignmentByProfileGetTaskStatusResponse =
            PhoneNumberAssignmentByProfileGetTaskStatusResponse.builder()
                .status(PhoneNumberAssignmentByProfileGetTaskStatusResponse.Status.PENDING)
                .taskId("taskId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(phoneNumberAssignmentByProfileGetTaskStatusResponse.status())
            .isEqualTo(PhoneNumberAssignmentByProfileGetTaskStatusResponse.Status.PENDING)
        assertThat(phoneNumberAssignmentByProfileGetTaskStatusResponse.taskId()).isEqualTo("taskId")
        assertThat(phoneNumberAssignmentByProfileGetTaskStatusResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(phoneNumberAssignmentByProfileGetTaskStatusResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileGetTaskStatusResponse =
            PhoneNumberAssignmentByProfileGetTaskStatusResponse.builder()
                .status(PhoneNumberAssignmentByProfileGetTaskStatusResponse.Status.PENDING)
                .taskId("taskId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPhoneNumberAssignmentByProfileGetTaskStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignmentByProfileGetTaskStatusResponse),
                jacksonTypeRef<PhoneNumberAssignmentByProfileGetTaskStatusResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileGetTaskStatusResponse)
            .isEqualTo(phoneNumberAssignmentByProfileGetTaskStatusResponse)
    }
}
