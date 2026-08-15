// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArtifactCompletedWebhookEventTest {

    @Test
    fun create() {
        val artifactCompletedWebhookEvent =
            ArtifactCompletedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    ArtifactCompletedWebhookEvent.Data.builder()
                        .artifactId("mtgart_4e7c...")
                        .content(
                            ArtifactCompletedWebhookEvent.Data.Content.builder()
                                .text("text")
                                .build()
                        )
                        .modelProvenance(
                            ArtifactCompletedWebhookEvent.Data.ModelProvenance.builder()
                                .model("model")
                                .provider("provider")
                                .build()
                        )
                        .sessionId("mtgsess_9b2f...")
                        .type(ArtifactCompletedWebhookEvent.Data.Type.SUMMARY)
                        .build()
                )
                .event(ArtifactCompletedWebhookEvent.Event.ARTIFACT_COMPLETED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(artifactCompletedWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(artifactCompletedWebhookEvent.data())
            .isEqualTo(
                ArtifactCompletedWebhookEvent.Data.builder()
                    .artifactId("mtgart_4e7c...")
                    .content(
                        ArtifactCompletedWebhookEvent.Data.Content.builder().text("text").build()
                    )
                    .modelProvenance(
                        ArtifactCompletedWebhookEvent.Data.ModelProvenance.builder()
                            .model("model")
                            .provider("provider")
                            .build()
                    )
                    .sessionId("mtgsess_9b2f...")
                    .type(ArtifactCompletedWebhookEvent.Data.Type.SUMMARY)
                    .build()
            )
        assertThat(artifactCompletedWebhookEvent.event())
            .isEqualTo(ArtifactCompletedWebhookEvent.Event.ARTIFACT_COMPLETED)
        assertThat(artifactCompletedWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(artifactCompletedWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artifactCompletedWebhookEvent =
            ArtifactCompletedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    ArtifactCompletedWebhookEvent.Data.builder()
                        .artifactId("mtgart_4e7c...")
                        .content(
                            ArtifactCompletedWebhookEvent.Data.Content.builder()
                                .text("text")
                                .build()
                        )
                        .modelProvenance(
                            ArtifactCompletedWebhookEvent.Data.ModelProvenance.builder()
                                .model("model")
                                .provider("provider")
                                .build()
                        )
                        .sessionId("mtgsess_9b2f...")
                        .type(ArtifactCompletedWebhookEvent.Data.Type.SUMMARY)
                        .build()
                )
                .event(ArtifactCompletedWebhookEvent.Event.ARTIFACT_COMPLETED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedArtifactCompletedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artifactCompletedWebhookEvent),
                jacksonTypeRef<ArtifactCompletedWebhookEvent>(),
            )

        assertThat(roundtrippedArtifactCompletedWebhookEvent)
            .isEqualTo(artifactCompletedWebhookEvent)
    }
}
