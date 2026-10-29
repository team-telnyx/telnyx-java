// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumbersJobSuccessfulOperationTest {

    @Test
    fun create() {
        val phoneNumbersJobSuccessfulOperation =
            PhoneNumbersJobSuccessfulOperation.builder()
                .id("id")
                .phoneNumber("phone_number")
                .build()

        assertThat(phoneNumbersJobSuccessfulOperation.id()).contains("id")
        assertThat(phoneNumbersJobSuccessfulOperation.phoneNumber()).contains("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumbersJobSuccessfulOperation =
            PhoneNumbersJobSuccessfulOperation.builder()
                .id("id")
                .phoneNumber("phone_number")
                .build()

        val roundtrippedPhoneNumbersJobSuccessfulOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumbersJobSuccessfulOperation),
                jacksonTypeRef<PhoneNumbersJobSuccessfulOperation>(),
            )

        assertThat(roundtrippedPhoneNumbersJobSuccessfulOperation)
            .isEqualTo(phoneNumbersJobSuccessfulOperation)
    }
}
