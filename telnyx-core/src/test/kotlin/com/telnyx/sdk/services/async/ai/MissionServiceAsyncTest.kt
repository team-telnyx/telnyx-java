// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.ExecutionMode
import com.telnyx.sdk.models.ai.missions.MissionCreateParams
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MissionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val missionResponseFuture =
            missionServiceAsync.create(
                MissionCreateParams.builder()
                    .name("name")
                    .description("description")
                    .executionMode(ExecutionMode.EXTERNAL)
                    .instructions("instructions")
                    .metadata(
                        MissionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .model("model")
                    .build()
            )

        val missionResponse = missionResponseFuture.get()
        missionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val missionResponseFuture =
            missionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val missionResponse = missionResponseFuture.get()
        missionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val pageFuture = missionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cloneMission() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val responseFuture = missionServiceAsync.cloneMission("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteMission() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val future = missionServiceAsync.deleteMission("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEvents() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val pageFuture = missionServiceAsync.listEvents()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateMission() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val missionServiceAsync = client.ai().missions()

        val missionResponseFuture =
            missionServiceAsync.updateMission(
                MissionUpdateMissionParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .executionMode(ExecutionMode.EXTERNAL)
                    .instructions("instructions")
                    .metadata(
                        MissionUpdateMissionParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .model("model")
                    .name("name")
                    .build()
            )

        val missionResponse = missionResponseFuture.get()
        missionResponse.validate()
    }
}
