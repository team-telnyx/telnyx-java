// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.ai().assistants().tools()

        val responseFuture =
            toolServiceAsync.test(
                ToolTestParams.builder()
                    .assistantId("assistant_id")
                    .toolId("tool_id")
                    .arguments(
                        ToolTestParams.Arguments.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .dynamicVariables(
                        ToolTestParams.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
