// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberDeleteAllResponseTest {

    @Test
    fun create() {
        val phoneNumberDeleteAllResponse =
            PhoneNumberDeleteAllResponse.builder()
                .addData("+19493253498")
                .meta(
                    PhoneNumberDeleteAllResponse.Meta.builder()
                        .addError(
                            PhoneNumberDeleteAllResponse.Meta.Error.builder()
                                .code(PhoneNumberDeleteAllResponse.Meta.Error.Code.NOT_ASSOCIATED)
                                .detail("Phone number not associated with this DIR.")
                                .phoneNumber("+19493253498")
                                .title("Phone number not associated")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(phoneNumberDeleteAllResponse.data()).containsExactly("+19493253498")
        assertThat(phoneNumberDeleteAllResponse.meta())
            .isEqualTo(
                PhoneNumberDeleteAllResponse.Meta.builder()
                    .addError(
                        PhoneNumberDeleteAllResponse.Meta.Error.builder()
                            .code(PhoneNumberDeleteAllResponse.Meta.Error.Code.NOT_ASSOCIATED)
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
        val phoneNumberDeleteAllResponse =
            PhoneNumberDeleteAllResponse.builder()
                .addData("+19493253498")
                .meta(
                    PhoneNumberDeleteAllResponse.Meta.builder()
                        .addError(
                            PhoneNumberDeleteAllResponse.Meta.Error.builder()
                                .code(PhoneNumberDeleteAllResponse.Meta.Error.Code.NOT_ASSOCIATED)
                                .detail("Phone number not associated with this DIR.")
                                .phoneNumber("+19493253498")
                                .title("Phone number not associated")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberDeleteAllResponse),
                jacksonTypeRef<PhoneNumberDeleteAllResponse>(),
            )

        assertThat(roundtrippedPhoneNumberDeleteAllResponse).isEqualTo(phoneNumberDeleteAllResponse)
    }
}
