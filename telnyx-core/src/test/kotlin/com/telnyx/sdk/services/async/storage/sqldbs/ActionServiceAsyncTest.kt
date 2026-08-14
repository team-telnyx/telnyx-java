// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.sqldbs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.sqldbs.actions.ActionQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.storage().sqldbs().actions()

        val responseFuture =
            actionServiceAsync.query(
                ActionQueryParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sql("SELECT * FROM users WHERE name = ?")
                    .addParam("alice")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
