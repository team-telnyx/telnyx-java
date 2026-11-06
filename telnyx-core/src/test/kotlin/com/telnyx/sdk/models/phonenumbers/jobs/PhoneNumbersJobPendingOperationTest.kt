// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumbersJobPendingOperationTest {

    @Test
    fun create() {
        val phoneNumbersJobPendingOperation =
            PhoneNumbersJobPendingOperation.builder().id("id").phoneNumber("phone_number").build()

        assertThat(phoneNumbersJobPendingOperation.id()).contains("id")
        assertThat(phoneNumbersJobPendingOperation.phoneNumber()).contains("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumbersJobPendingOperation =
            PhoneNumbersJobPendingOperation.builder().id("id").phoneNumber("phone_number").build()

        val roundtrippedPhoneNumbersJobPendingOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumbersJobPendingOperation),
                jacksonTypeRef<PhoneNumbersJobPendingOperation>(),
            )

        assertThat(roundtrippedPhoneNumbersJobPendingOperation)
            .isEqualTo(phoneNumbersJobPendingOperation)
    }
}
