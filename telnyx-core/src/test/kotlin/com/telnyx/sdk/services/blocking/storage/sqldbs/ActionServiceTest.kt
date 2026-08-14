// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.sqldbs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.sqldbs.actions.ActionQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.storage().sqldbs().actions()

        val response =
            actionService.query(
                ActionQueryParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sql("SELECT * FROM users WHERE name = ?")
                    .addParam("alice")
                    .build()
            )

        response.validate()
    }
}
