// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.profile

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileUpdateResponseTest {

    @Test
    fun create() {
        val profileUpdateResponse =
            ProfileUpdateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(profileUpdateResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileUpdateResponse =
            ProfileUpdateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedProfileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileUpdateResponse),
                jacksonTypeRef<ProfileUpdateResponse>(),
            )

        assertThat(roundtrippedProfileUpdateResponse).isEqualTo(profileUpdateResponse)
    }
}
