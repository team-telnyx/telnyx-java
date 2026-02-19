// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.usertags.UserTagListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserTagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userTagService = client.userTags()

        val userTags =
            userTagService.list(
                UserTagListParams.builder()
                    .filter(UserTagListParams.Filter.builder().startsWith("my-tag").build())
                    .build()
            )

        userTags.validate()
    }
}
