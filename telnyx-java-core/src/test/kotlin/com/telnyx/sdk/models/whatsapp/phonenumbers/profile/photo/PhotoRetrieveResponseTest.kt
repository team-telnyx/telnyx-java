// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhotoRetrieveResponseTest {

    @Test
    fun create() {
        val photoRetrieveResponse =
            PhotoRetrieveResponse.builder()
                .data(
                    PhotoRetrieveResponse.Data.builder()
                        .phoneNumberId("phone_number_id")
                        .profilePhotoUrl("profile_photo_url")
                        .recordType("whatsapp_phone_number_profile_photos")
                        .build()
                )
                .build()

        assertThat(photoRetrieveResponse.data())
            .contains(
                PhotoRetrieveResponse.Data.builder()
                    .phoneNumberId("phone_number_id")
                    .profilePhotoUrl("profile_photo_url")
                    .recordType("whatsapp_phone_number_profile_photos")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val photoRetrieveResponse =
            PhotoRetrieveResponse.builder()
                .data(
                    PhotoRetrieveResponse.Data.builder()
                        .phoneNumberId("phone_number_id")
                        .profilePhotoUrl("profile_photo_url")
                        .recordType("whatsapp_phone_number_profile_photos")
                        .build()
                )
                .build()

        val roundtrippedPhotoRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(photoRetrieveResponse),
                jacksonTypeRef<PhotoRetrieveResponse>(),
            )

        assertThat(roundtrippedPhotoRetrieveResponse).isEqualTo(photoRetrieveResponse)
    }
}
