// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.profile

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhotoServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val photoService = client.whatsapp().phoneNumbers().profile().photo()

        photoService.delete("phone_number")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val photoService = client.whatsapp().phoneNumbers().profile().photo()

        val response =
            photoService.upload(
                PhotoUploadParams.builder()
                    .phoneNumber("phone_number")
                    .file("Example data".byteInputStream())
                    .build()
            )

        response.validate()
    }
}
