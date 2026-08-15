// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingsessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactCreateParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ArtifactServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val artifactServiceAsync = client.meetingSessions().artifacts()

        val meetingSessionArtifactResponseFuture =
            artifactServiceAsync.create(
                ArtifactCreateParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .type(ArtifactCreateParams.Type.SUMMARY)
                    .build()
            )

        val meetingSessionArtifactResponse = meetingSessionArtifactResponseFuture.get()
        meetingSessionArtifactResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val artifactServiceAsync = client.meetingSessions().artifacts()

        val meetingSessionArtifactResponseFuture =
            artifactServiceAsync.retrieve(
                ArtifactRetrieveParams.builder()
                    .id("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .artifactId("mtgart_b2c3d4e5-f6a7-8901-bcde-f23456789012")
                    .build()
            )

        val meetingSessionArtifactResponse = meetingSessionArtifactResponseFuture.get()
        meetingSessionArtifactResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val artifactServiceAsync = client.meetingSessions().artifacts()

        val artifactsFuture =
            artifactServiceAsync.list("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")

        val artifacts = artifactsFuture.get()
        artifacts.validate()
    }
}
