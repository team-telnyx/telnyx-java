// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TfPhoneNumberTest {

    @Test
    fun create() {
        val tfPhoneNumber = TfPhoneNumber.builder().phoneNumber("phoneNumber").build()

        assertThat(tfPhoneNumber.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tfPhoneNumber = TfPhoneNumber.builder().phoneNumber("phoneNumber").build()

        val roundtrippedTfPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tfPhoneNumber),
                jacksonTypeRef<TfPhoneNumber>(),
            )

        assertThat(roundtrippedTfPhoneNumber).isEqualTo(tfPhoneNumber)
    }
}
