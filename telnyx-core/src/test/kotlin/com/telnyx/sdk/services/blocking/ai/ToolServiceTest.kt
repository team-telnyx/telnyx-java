// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.tools.ToolCreateParams
import com.telnyx.sdk.models.ai.tools.ToolUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.ai().tools()

        val tool =
            toolService.create(
                ToolCreateParams.builder()
                    .displayName("display_name")
                    .type("type")
                    .function(
                        ToolCreateParams.Function.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .handoff(
                        ToolCreateParams.Handoff.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .invite(
                        ToolCreateParams.Invite.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .retrieval(
                        ToolCreateParams.Retrieval.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timeoutMs(0L)
                    .webhook(
                        ToolCreateParams.Webhook.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.ai().tools()

        val tool = toolService.retrieve("tool_id")

        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.ai().tools()

        val tool =
            toolService.update(
                ToolUpdateParams.builder()
                    .toolId("tool_id")
                    .displayName("display_name")
                    .function(
                        ToolUpdateParams.Function.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .handoff(
                        ToolUpdateParams.Handoff.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .invite(
                        ToolUpdateParams.Invite.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .retrieval(
                        ToolUpdateParams.Retrieval.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timeoutMs(0L)
                    .type("type")
                    .webhook(
                        ToolUpdateParams.Webhook.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        tool.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.ai().tools()

        val page = toolService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolService = client.ai().tools()

        val tool = toolService.delete("tool_id")

        tool.validate()
    }
}
