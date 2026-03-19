// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappProfileDataTest {

    @Test
    fun create() {
        val whatsappProfileData =
            WhatsappProfileData.builder()
                .id("id")
                .about("about")
                .address("address")
                .category("category")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("display_name")
                .email("email")
                .phoneNumberId("phone_number_id")
                .profilePhotoUrl("profile_photo_url")
                .recordType("whatsapp_phone_number_profiles")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .website("website")
                .build()

        assertThat(whatsappProfileData.id()).contains("id")
        assertThat(whatsappProfileData.about()).contains("about")
        assertThat(whatsappProfileData.address()).contains("address")
        assertThat(whatsappProfileData.category()).contains("category")
        assertThat(whatsappProfileData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappProfileData.description()).contains("description")
        assertThat(whatsappProfileData.displayName()).contains("display_name")
        assertThat(whatsappProfileData.email()).contains("email")
        assertThat(whatsappProfileData.phoneNumberId()).contains("phone_number_id")
        assertThat(whatsappProfileData.profilePhotoUrl()).contains("profile_photo_url")
        assertThat(whatsappProfileData.recordType()).contains("whatsapp_phone_number_profiles")
        assertThat(whatsappProfileData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(whatsappProfileData.website()).contains("website")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappProfileData =
            WhatsappProfileData.builder()
                .id("id")
                .about("about")
                .address("address")
                .category("category")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .displayName("display_name")
                .email("email")
                .phoneNumberId("phone_number_id")
                .profilePhotoUrl("profile_photo_url")
                .recordType("whatsapp_phone_number_profiles")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .website("website")
                .build()

        val roundtrippedWhatsappProfileData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappProfileData),
                jacksonTypeRef<WhatsappProfileData>(),
            )

        assertThat(roundtrippedWhatsappProfileData).isEqualTo(whatsappProfileData)
    }
}
