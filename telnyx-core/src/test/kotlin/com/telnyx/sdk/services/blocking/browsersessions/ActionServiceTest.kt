// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.browsersessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.browsersessions.actions.ActionCreateParams
import com.telnyx.sdk.models.browsersessions.actions.ActionRetrieveParams
import com.telnyx.sdk.models.browsersessions.actions.NavigateAction
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.browserSessions().actions()

        val action =
            actionService.create(
                ActionCreateParams.builder()
                    .id("id")
                    .waitSeconds(0L)
                    .body(
                        NavigateAction.builder()
                            .url("https://example.com/")
                            .idempotencyKey("x")
                            .includeObservation(true)
                            .waitUntil(NavigateAction.WaitUntil.LOAD)
                            .build()
                    )
                    .build()
            )

        action.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.browserSessions().actions()

        val action =
            actionService.retrieve(
                ActionRetrieveParams.builder().id("id").actionId("actionId").build()
            )

        action.validate()
    }
}
