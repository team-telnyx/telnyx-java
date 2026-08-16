// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.meetingsessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactCreateParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ArtifactServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val artifactService = client.meetingSessions().artifacts()

        val meetingSessionArtifactResponse =
            artifactService.create(
                ArtifactCreateParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .type(ArtifactCreateParams.Type.SUMMARY)
                    .build()
            )

        meetingSessionArtifactResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val artifactService = client.meetingSessions().artifacts()

        val meetingSessionArtifactResponse =
            artifactService.retrieve(
                ArtifactRetrieveParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .artifactId("mtgart_b2c3d4e5-f6a7-8901-bcde-f23456789012")
                    .build()
            )

        meetingSessionArtifactResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val artifactService = client.meetingSessions().artifacts()

        val artifacts = artifactService.list("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        artifacts.validate()
    }
}
