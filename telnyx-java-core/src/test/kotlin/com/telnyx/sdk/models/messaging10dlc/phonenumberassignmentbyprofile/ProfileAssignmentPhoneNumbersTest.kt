// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileAssignmentPhoneNumbersTest {

    @Test
    fun create() {
        val profileAssignmentPhoneNumbers =
            ProfileAssignmentPhoneNumbers.builder()
                .phoneNumber("+12024567890")
                .status("pending")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .build()

        assertThat(profileAssignmentPhoneNumbers.phoneNumber()).isEqualTo("+12024567890")
        assertThat(profileAssignmentPhoneNumbers.status()).isEqualTo("pending")
        assertThat(profileAssignmentPhoneNumbers.taskId())
            .isEqualTo("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileAssignmentPhoneNumbers =
            ProfileAssignmentPhoneNumbers.builder()
                .phoneNumber("+12024567890")
                .status("pending")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .build()

        val roundtrippedProfileAssignmentPhoneNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileAssignmentPhoneNumbers),
                jacksonTypeRef<ProfileAssignmentPhoneNumbers>(),
            )

        assertThat(roundtrippedProfileAssignmentPhoneNumbers)
            .isEqualTo(profileAssignmentPhoneNumbers)
    }
}
