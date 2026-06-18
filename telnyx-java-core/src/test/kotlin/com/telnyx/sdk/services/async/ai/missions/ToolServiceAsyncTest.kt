// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.missions.tools.ToolDeleteToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolGetToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolUpdateToolParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createTool() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.ai().missions().tools()

        val responseFuture = toolServiceAsync.createTool("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteTool() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.ai().missions().tools()

        val future =
            toolServiceAsync.deleteTool(
                ToolDeleteToolParams.builder().missionId("mission_id").toolId("tool_id").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTool() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.ai().missions().tools()

        val responseFuture =
            toolServiceAsync.getTool(
                ToolGetToolParams.builder().missionId("mission_id").toolId("tool_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTools() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.ai().missions().tools()

        val responseFuture = toolServiceAsync.listTools("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateTool() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolServiceAsync = client.ai().missions().tools()

        val responseFuture =
            toolServiceAsync.updateTool(
                ToolUpdateToolParams.builder().missionId("mission_id").toolId("tool_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
