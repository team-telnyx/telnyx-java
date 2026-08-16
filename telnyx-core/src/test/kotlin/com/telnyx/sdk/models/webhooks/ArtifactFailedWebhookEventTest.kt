// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactFailedWebhookEventTest {

    @Test
    fun create() {
        val artifactFailedWebhookEvent =
            ArtifactFailedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    ArtifactFailedWebhookEvent.Data.builder()
                        .artifactId("mtgart_4e7c...")
                        .sessionId("mtgsess_9b2f...")
                        .type(ArtifactFailedWebhookEvent.Data.Type.SUMMARY)
                        .build()
                )
                .event(ArtifactFailedWebhookEvent.Event.ARTIFACT_FAILED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(artifactFailedWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(artifactFailedWebhookEvent.data())
            .isEqualTo(
                ArtifactFailedWebhookEvent.Data.builder()
                    .artifactId("mtgart_4e7c...")
                    .sessionId("mtgsess_9b2f...")
                    .type(ArtifactFailedWebhookEvent.Data.Type.SUMMARY)
                    .build()
            )
        assertThat(artifactFailedWebhookEvent.event())
            .isEqualTo(ArtifactFailedWebhookEvent.Event.ARTIFACT_FAILED)
        assertThat(artifactFailedWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(artifactFailedWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artifactFailedWebhookEvent =
            ArtifactFailedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    ArtifactFailedWebhookEvent.Data.builder()
                        .artifactId("mtgart_4e7c...")
                        .sessionId("mtgsess_9b2f...")
                        .type(ArtifactFailedWebhookEvent.Data.Type.SUMMARY)
                        .build()
                )
                .event(ArtifactFailedWebhookEvent.Event.ARTIFACT_FAILED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedArtifactFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artifactFailedWebhookEvent),
                jacksonTypeRef<ArtifactFailedWebhookEvent>(),
            )

        assertThat(roundtrippedArtifactFailedWebhookEvent).isEqualTo(artifactFailedWebhookEvent)
    }
}
