// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.usertags.UserTagListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserTagServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
