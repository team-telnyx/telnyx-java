// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.missions.tools.ToolDeleteToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolGetToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolUpdateToolParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ToolServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createTool() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.ai().missions().tools()

        val response = toolService.createTool("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteTool() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.ai().missions().tools()

        toolService.deleteTool(
            ToolDeleteToolParams.builder().missionId("mission_id").toolId("tool_id").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getTool() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.ai().missions().tools()

        val response =
            toolService.getTool(
                ToolGetToolParams.builder().missionId("mission_id").toolId("tool_id").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTools() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.ai().missions().tools()

        val response = toolService.listTools("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateTool() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.ai().missions().tools()

        val response =
            toolService.updateTool(
                ToolUpdateToolParams.builder().missionId("mission_id").toolId("tool_id").build()
            )

        response.validate()
    }
}
