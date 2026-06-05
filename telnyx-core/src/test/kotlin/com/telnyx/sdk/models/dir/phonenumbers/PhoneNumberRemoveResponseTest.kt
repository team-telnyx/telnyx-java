// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRemoveResponseTest {

    @Test
    fun create() {
        val phoneNumberRemoveResponse =
            PhoneNumberRemoveResponse.builder()
                .addData("+19493253498")
                .meta(
                    PhoneNumberRemoveResponse.Meta.builder()
                        .addError(
                            PhoneNumberRemoveResponse.Meta.Error.builder()
                                .code(PhoneNumberRemoveResponse.Meta.Error.Code.NOT_ASSOCIATED)
                                .detail("Phone number not associated with this DIR.")
                                .phoneNumber("+19493253498")
                                .title("Phone number not associated")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(phoneNumberRemoveResponse.data()).containsExactly("+19493253498")
        assertThat(phoneNumberRemoveResponse.meta())
            .isEqualTo(
                PhoneNumberRemoveResponse.Meta.builder()
                    .addError(
                        PhoneNumberRemoveResponse.Meta.Error.builder()
                            .code(PhoneNumberRemoveResponse.Meta.Error.Code.NOT_ASSOCIATED)
                            .detail("Phone number not associated with this DIR.")
                            .phoneNumber("+19493253498")
                            .title("Phone number not associated")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberRemoveResponse =
            PhoneNumberRemoveResponse.builder()
                .addData("+19493253498")
                .meta(
                    PhoneNumberRemoveResponse.Meta.builder()
                        .addError(
                            PhoneNumberRemoveResponse.Meta.Error.builder()
                                .code(PhoneNumberRemoveResponse.Meta.Error.Code.NOT_ASSOCIATED)
                                .detail("Phone number not associated with this DIR.")
                                .phoneNumber("+19493253498")
                                .title("Phone number not associated")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberRemoveResponse),
                jacksonTypeRef<PhoneNumberRemoveResponse>(),
            )

        assertThat(roundtrippedPhoneNumberRemoveResponse).isEqualTo(phoneNumberRemoveResponse)
    }
}
