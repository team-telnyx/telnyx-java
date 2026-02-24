// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.recordings

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.recordings.actions.ActionDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
