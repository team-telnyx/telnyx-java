// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.browsersessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.browsersessions.actions.ActionCreateParams
import com.telnyx.sdk.models.browsersessions.actions.ActionRetrieveParams
import com.telnyx.sdk.models.browsersessions.actions.NavigateAction
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.browserSessions().actions()

        val actionFuture =
            actionServiceAsync.create(
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

        val action = actionFuture.get()
        action.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.browserSessions().actions()

        val actionFuture =
            actionServiceAsync.retrieve(
                ActionRetrieveParams.builder().id("id").actionId("actionId").build()
            )

        val action = actionFuture.get()
        action.validate()
    }
}
