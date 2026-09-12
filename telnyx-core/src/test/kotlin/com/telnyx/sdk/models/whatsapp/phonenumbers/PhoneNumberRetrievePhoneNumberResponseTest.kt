// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRetrievePhoneNumberResponseTest {

    @Test
    fun create() {
        val phoneNumberRetrievePhoneNumberResponse =
            PhoneNumberRetrievePhoneNumberResponse.builder()
                .data(
                    PhoneNumberRetrievePhoneNumberResponse.Data.builder()
                        .callingEnabled(true)
                        .coexistenceState(
                            PhoneNumberRetrievePhoneNumberResponse.Data.CoexistenceState
                                .PENDING_ONBOARDING
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .enabled(true)
                        .isOnBizApp(true)
                        .phoneNumber("phone_number")
                        .phoneNumberId("phone_number_id")
                        .qualityRating("quality_rating")
                        .recordType("whatsapp_business_phone_number")
                        .status("status")
                        .syncDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .syncProgress(
                            PhoneNumberRetrievePhoneNumberResponse.Data.SyncProgress.builder()
                                .contactsStatus("contacts_status")
                                .historyChunkOrder(0L)
                                .historyPhase(0L)
                                .historyProgress(0L)
                                .historyStatus("history_status")
                                .build()
                        )
                        .userId("user_id")
                        .wabaId("waba_id")
                        .build()
                )
                .build()

        assertThat(phoneNumberRetrievePhoneNumberResponse.data())
            .isEqualTo(
                PhoneNumberRetrievePhoneNumberResponse.Data.builder()
                    .callingEnabled(true)
                    .coexistenceState(
                        PhoneNumberRetrievePhoneNumberResponse.Data.CoexistenceState
                            .PENDING_ONBOARDING
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("display_name")
                    .enabled(true)
                    .isOnBizApp(true)
                    .phoneNumber("phone_number")
                    .phoneNumberId("phone_number_id")
                    .qualityRating("quality_rating")
                    .recordType("whatsapp_business_phone_number")
                    .status("status")
                    .syncDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .syncProgress(
                        PhoneNumberRetrievePhoneNumberResponse.Data.SyncProgress.builder()
                            .contactsStatus("contacts_status")
                            .historyChunkOrder(0L)
                            .historyPhase(0L)
                            .historyProgress(0L)
                            .historyStatus("history_status")
                            .build()
                    )
                    .userId("user_id")
                    .wabaId("waba_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberRetrievePhoneNumberResponse =
            PhoneNumberRetrievePhoneNumberResponse.builder()
                .data(
                    PhoneNumberRetrievePhoneNumberResponse.Data.builder()
                        .callingEnabled(true)
                        .coexistenceState(
                            PhoneNumberRetrievePhoneNumberResponse.Data.CoexistenceState
                                .PENDING_ONBOARDING
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("display_name")
                        .enabled(true)
                        .isOnBizApp(true)
                        .phoneNumber("phone_number")
                        .phoneNumberId("phone_number_id")
                        .qualityRating("quality_rating")
                        .recordType("whatsapp_business_phone_number")
                        .status("status")
                        .syncDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .syncProgress(
                            PhoneNumberRetrievePhoneNumberResponse.Data.SyncProgress.builder()
                                .contactsStatus("contacts_status")
                                .historyChunkOrder(0L)
                                .historyPhase(0L)
                                .historyProgress(0L)
                                .historyStatus("history_status")
                                .build()
                        )
                        .userId("user_id")
                        .wabaId("waba_id")
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberRetrievePhoneNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberRetrievePhoneNumberResponse),
                jacksonTypeRef<PhoneNumberRetrievePhoneNumberResponse>(),
            )

        assertThat(roundtrippedPhoneNumberRetrievePhoneNumberResponse)
            .isEqualTo(phoneNumberRetrievePhoneNumberResponse)
    }
}
