// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListResponseTest {

    @Test
    fun create() {
        val phoneNumberListResponse =
            PhoneNumberListResponse.builder()
                .callingEnabled(true)
                .coexistenceState(PhoneNumberListResponse.CoexistenceState.PENDING_ONBOARDING)
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
                    PhoneNumberListResponse.SyncProgress.builder()
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

        assertThat(phoneNumberListResponse.callingEnabled()).contains(true)
        assertThat(phoneNumberListResponse.coexistenceState())
            .contains(PhoneNumberListResponse.CoexistenceState.PENDING_ONBOARDING)
        assertThat(phoneNumberListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(phoneNumberListResponse.displayName()).contains("display_name")
        assertThat(phoneNumberListResponse.enabled()).contains(true)
        assertThat(phoneNumberListResponse.isOnBizApp()).contains(true)
        assertThat(phoneNumberListResponse.phoneNumber()).contains("phone_number")
        assertThat(phoneNumberListResponse.phoneNumberId()).contains("phone_number_id")
        assertThat(phoneNumberListResponse.qualityRating()).contains("quality_rating")
        assertThat(phoneNumberListResponse.recordType()).contains("whatsapp_business_phone_number")
        assertThat(phoneNumberListResponse.status()).contains("status")
        assertThat(phoneNumberListResponse.syncDeadline())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(phoneNumberListResponse.syncProgress())
            .contains(
                PhoneNumberListResponse.SyncProgress.builder()
                    .contactsStatus("contacts_status")
                    .historyChunkOrder(0L)
                    .historyPhase(0L)
                    .historyProgress(0L)
                    .historyStatus("history_status")
                    .build()
            )
        assertThat(phoneNumberListResponse.userId()).contains("user_id")
        assertThat(phoneNumberListResponse.wabaId()).contains("waba_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberListResponse =
            PhoneNumberListResponse.builder()
                .callingEnabled(true)
                .coexistenceState(PhoneNumberListResponse.CoexistenceState.PENDING_ONBOARDING)
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
                    PhoneNumberListResponse.SyncProgress.builder()
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

        val roundtrippedPhoneNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberListResponse),
                jacksonTypeRef<PhoneNumberListResponse>(),
            )

        assertThat(roundtrippedPhoneNumberListResponse).isEqualTo(phoneNumberListResponse)
    }
}
