// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.MissionCreateParams
import com.telnyx.sdk.models.ai.missions.MissionUpdateMissionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MissionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        val mission =
            missionService.create(
                MissionCreateParams.builder()
                    .name("name")
                    .description("description")
                    .executionMode(MissionCreateParams.ExecutionMode.EXTERNAL)
                    .instructions("instructions")
                    .metadata(
                        MissionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .model("model")
                    .build()
            )

        mission.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        val mission = missionService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        mission.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        val page = missionService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cloneMission() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        val response = missionService.cloneMission("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteMission() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        missionService.deleteMission("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEvents() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        val page = missionService.listEvents()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateMission() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val missionService = client.ai().missions()

        val response =
            missionService.updateMission(
                MissionUpdateMissionParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .executionMode(MissionUpdateMissionParams.ExecutionMode.EXTERNAL)
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

        response.validate()
    }
}
