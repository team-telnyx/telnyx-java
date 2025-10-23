// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionValidateRegistrationCodesResponseTest {

    @Test
    fun create() {
        val actionValidateRegistrationCodesResponse =
            ActionValidateRegistrationCodesResponse.builder()
                .addData(
                    ActionValidateRegistrationCodesResponse.Data.builder()
                        .invalidDetail("This code has already been used.")
                        .recordType("sim_card_registration_code_validation")
                        .registrationCode("0123456789")
                        .valid(false)
                        .build()
                )
                .build()

        assertThat(actionValidateRegistrationCodesResponse.data().getOrNull())
            .containsExactly(
                ActionValidateRegistrationCodesResponse.Data.builder()
                    .invalidDetail("This code has already been used.")
                    .recordType("sim_card_registration_code_validation")
                    .registrationCode("0123456789")
                    .valid(false)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionValidateRegistrationCodesResponse =
            ActionValidateRegistrationCodesResponse.builder()
                .addData(
                    ActionValidateRegistrationCodesResponse.Data.builder()
                        .invalidDetail("This code has already been used.")
                        .recordType("sim_card_registration_code_validation")
                        .registrationCode("0123456789")
                        .valid(false)
                        .build()
                )
                .build()

        val roundtrippedActionValidateRegistrationCodesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionValidateRegistrationCodesResponse),
                jacksonTypeRef<ActionValidateRegistrationCodesResponse>(),
            )

        assertThat(roundtrippedActionValidateRegistrationCodesResponse)
            .isEqualTo(actionValidateRegistrationCodesResponse)
    }
}
