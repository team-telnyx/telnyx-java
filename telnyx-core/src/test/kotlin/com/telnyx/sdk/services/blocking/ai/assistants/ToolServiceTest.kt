// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.ai().assistants().tools()

        val response =
            toolService.test(
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

        response.validate()
    }
}
