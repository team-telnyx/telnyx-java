// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumbersJobPhoneNumberTest {

    @Test
    fun create() {
        val phoneNumbersJobPhoneNumber =
            PhoneNumbersJobPhoneNumber.builder().id("id").phoneNumber("+19705555000").build()

        assertThat(phoneNumbersJobPhoneNumber.id()).contains("id")
        assertThat(phoneNumbersJobPhoneNumber.phoneNumber()).contains("+19705555000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumbersJobPhoneNumber =
            PhoneNumbersJobPhoneNumber.builder().id("id").phoneNumber("+19705555000").build()

        val roundtrippedPhoneNumbersJobPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumbersJobPhoneNumber),
                jacksonTypeRef<PhoneNumbersJobPhoneNumber>(),
            )

        assertThat(roundtrippedPhoneNumbersJobPhoneNumber).isEqualTo(phoneNumbersJobPhoneNumber)
    }
}
