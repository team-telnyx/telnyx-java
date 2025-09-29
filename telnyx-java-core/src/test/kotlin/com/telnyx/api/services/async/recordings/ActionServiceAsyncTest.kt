// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.recordings

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.recordings.actions.ActionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.recordings().actions()

        val future =
            actionServiceAsync.delete(
                ActionDeleteParams.builder()
                    .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .addId("428c31b6-7af4-4bcb-b7f5-5013ef9657c2")
                    .build()
            )

        val response = future.get()
    }
}
