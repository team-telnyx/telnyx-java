// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.usertags.UserTagListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserTagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userTagServiceAsync = client.userTags()

        val userTagsFuture =
            userTagServiceAsync.list(
                UserTagListParams.builder()
                    .filter(UserTagListParams.Filter.builder().startsWith("my-tag").build())
                    .build()
            )

        val userTags = userTagsFuture.get()
        userTags.validate()
    }
}
