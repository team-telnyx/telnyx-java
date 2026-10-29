// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappPhoneResponseTest {

    @Test
    fun create() {
        val whatsappPhoneResponse =
            WhatsappPhoneResponse.builder()
                .callingEnabled(true)
                .coexistenceState(WhatsappPhoneResponse.CoexistenceState.PENDING_ONBOARDING)
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
                    WhatsappPhoneResponse.SyncProgress.builder()
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

        assertThat(whatsappPhoneResponse.callingEnabled()).contains(true)
        assertThat(whatsappPhoneResponse.coexistenceState())
            .contains(WhatsappPhoneResponse.CoexistenceState.PENDING_ONBOARDING)
        assertThat(whatsappPhoneResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappPhoneResponse.displayName()).contains("display_name")
        assertThat(whatsappPhoneResponse.enabled()).contains(true)
        assertThat(whatsappPhoneResponse.isOnBizApp()).contains(true)
        assertThat(whatsappPhoneResponse.phoneNumber()).contains("phone_number")
        assertThat(whatsappPhoneResponse.phoneNumberId()).contains("phone_number_id")
        assertThat(whatsappPhoneResponse.qualityRating()).contains("quality_rating")
        assertThat(whatsappPhoneResponse.recordType()).contains("whatsapp_business_phone_number")
        assertThat(whatsappPhoneResponse.status()).contains("status")
        assertThat(whatsappPhoneResponse.syncDeadline())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappPhoneResponse.syncProgress())
            .contains(
                WhatsappPhoneResponse.SyncProgress.builder()
                    .contactsStatus("contacts_status")
                    .historyChunkOrder(0L)
                    .historyPhase(0L)
                    .historyProgress(0L)
                    .historyStatus("history_status")
                    .build()
            )
        assertThat(whatsappPhoneResponse.userId()).contains("user_id")
        assertThat(whatsappPhoneResponse.wabaId()).contains("waba_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappPhoneResponse =
            WhatsappPhoneResponse.builder()
                .callingEnabled(true)
                .coexistenceState(WhatsappPhoneResponse.CoexistenceState.PENDING_ONBOARDING)
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
                    WhatsappPhoneResponse.SyncProgress.builder()
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

        val roundtrippedWhatsappPhoneResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappPhoneResponse),
                jacksonTypeRef<WhatsappPhoneResponse>(),
            )

        assertThat(roundtrippedWhatsappPhoneResponse).isEqualTo(whatsappPhoneResponse)
    }
}
