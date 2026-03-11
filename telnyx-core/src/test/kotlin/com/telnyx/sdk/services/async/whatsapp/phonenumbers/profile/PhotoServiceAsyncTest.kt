// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers.profile

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.photo.PhotoUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhotoServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val photoServiceAsync = client.whatsapp().phoneNumbers().profile().photo()

        val future = photoServiceAsync.delete("phone_number")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val photoServiceAsync = client.whatsapp().phoneNumbers().profile().photo()

        val responseFuture =
            photoServiceAsync.upload(
                PhotoUploadParams.builder()
                    .phoneNumber("phone_number")
                    .file("Example data".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
