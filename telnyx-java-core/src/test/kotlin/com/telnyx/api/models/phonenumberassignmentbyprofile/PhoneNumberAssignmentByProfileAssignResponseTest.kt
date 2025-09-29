// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumberassignmentbyprofile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PhoneNumberAssignmentByProfileAssignResponseTest {

    @Test
    fun ofAssignProfileToCampaign() {
        val assignProfileToCampaign =
            PhoneNumberAssignmentByProfileAssignResponse.AssignProfileToCampaignResponse.builder()
                .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                .tcrCampaignId("CWZTFH1")
                .build()

        val phoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse.ofAssignProfileToCampaign(
                assignProfileToCampaign
            )

        assertThat(phoneNumberAssignmentByProfileAssignResponse.assignProfileToCampaign())
            .contains(assignProfileToCampaign)
        assertThat(phoneNumberAssignmentByProfileAssignResponse.settingsDataErrorMessage()).isEmpty
    }

    @Test
    fun ofAssignProfileToCampaignRoundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse.ofAssignProfileToCampaign(
                PhoneNumberAssignmentByProfileAssignResponse.AssignProfileToCampaignResponse
                    .builder()
                    .messagingProfileId("4001767e-ce0f-4cae-9d5f-0d5e636e7809")
                    .taskId("667a80f8-b0a9-49d0-b9ab-a7a1bcc45086")
                    .campaignId("4b300178-131c-d902-d54e-72d90ba1620j")
                    .tcrCampaignId("CWZTFH1")
                    .build()
            )

        val roundtrippedPhoneNumberAssignmentByProfileAssignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignmentByProfileAssignResponse),
                jacksonTypeRef<PhoneNumberAssignmentByProfileAssignResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileAssignResponse)
            .isEqualTo(phoneNumberAssignmentByProfileAssignResponse)
    }

    @Test
    fun ofSettingsDataErrorMessage() {
        val settingsDataErrorMessage =
            PhoneNumberAssignmentByProfileAssignResponse.SettingsDataErrorMessage.builder()
                .message("message")
                .build()

        val phoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse.ofSettingsDataErrorMessage(
                settingsDataErrorMessage
            )

        assertThat(phoneNumberAssignmentByProfileAssignResponse.assignProfileToCampaign()).isEmpty
        assertThat(phoneNumberAssignmentByProfileAssignResponse.settingsDataErrorMessage())
            .contains(settingsDataErrorMessage)
    }

    @Test
    fun ofSettingsDataErrorMessageRoundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberAssignmentByProfileAssignResponse =
            PhoneNumberAssignmentByProfileAssignResponse.ofSettingsDataErrorMessage(
                PhoneNumberAssignmentByProfileAssignResponse.SettingsDataErrorMessage.builder()
                    .message("message")
                    .build()
            )

        val roundtrippedPhoneNumberAssignmentByProfileAssignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberAssignmentByProfileAssignResponse),
                jacksonTypeRef<PhoneNumberAssignmentByProfileAssignResponse>(),
            )

        assertThat(roundtrippedPhoneNumberAssignmentByProfileAssignResponse)
            .isEqualTo(phoneNumberAssignmentByProfileAssignResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val phoneNumberAssignmentByProfileAssignResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<PhoneNumberAssignmentByProfileAssignResponse>(),
                )

        val e =
            assertThrows<TelnyxInvalidDataException> {
                phoneNumberAssignmentByProfileAssignResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
