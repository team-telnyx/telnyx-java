// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.avatars.AvatarCreateParams
import com.telnyx.sdk.models.ai.avatars.AvatarUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AvatarServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val avatarService = client.ai().avatars()

        val avatarResponse =
            avatarService.create(
                AvatarCreateParams.builder()
                    .imageFile("Example data".byteInputStream())
                    .name("Customer portrait")
                    .build()
            )

        avatarResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val avatarService = client.ai().avatars()

        val avatarResponse = avatarService.retrieve("avatar_0123456789abcdef0123456789abcdef")

        avatarResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val avatarService = client.ai().avatars()

        val avatarResponse =
            avatarService.update(
                AvatarUpdateParams.builder()
                    .avatarId("avatar_0123456789abcdef0123456789abcdef")
                    .name("Updated portrait")
                    .build()
            )

        avatarResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val avatarService = client.ai().avatars()

        val page = avatarService.list()

        page.response().validate()
    }
}
