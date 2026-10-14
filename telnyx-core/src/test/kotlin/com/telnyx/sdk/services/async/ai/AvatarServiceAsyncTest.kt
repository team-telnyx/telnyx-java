// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.avatars.AvatarCreateParams
import com.telnyx.sdk.models.ai.avatars.AvatarId
import com.telnyx.sdk.models.ai.avatars.AvatarUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AvatarServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val avatarServiceAsync = client.ai().avatars()

        val avatarResponseFuture =
            avatarServiceAsync.create(
                AvatarCreateParams.builder()
                    .imageFile("Example data".byteInputStream())
                    .name("Customer portrait")
                    .build()
            )

        val avatarResponse = avatarResponseFuture.get()
        avatarResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val avatarServiceAsync = client.ai().avatars()

        val avatarResponseFuture = avatarServiceAsync.retrieve(AvatarId.ELENA)

        val avatarResponse = avatarResponseFuture.get()
        avatarResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val avatarServiceAsync = client.ai().avatars()

        val avatarResponseFuture =
            avatarServiceAsync.update(
                AvatarUpdateParams.builder()
                    .avatarId(AvatarId.ELENA)
                    .name("Updated portrait")
                    .build()
            )

        val avatarResponse = avatarResponseFuture.get()
        avatarResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val avatarServiceAsync = client.ai().avatars()

        val pageFuture = avatarServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
