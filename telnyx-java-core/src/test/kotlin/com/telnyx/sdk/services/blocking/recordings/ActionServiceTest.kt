// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.recordings

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.recordings.actions.ActionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.recordings().actions()

        actionService.delete(
            ActionDeleteParams.builder()
                .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c2")
                .build()
        )
    }
}
