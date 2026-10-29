// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionResponseTest {

    @Test
    fun create() {
        val actionResponse =
            ActionResponse.builder()
                .id("bact_075cfdc9-...")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(ActionResponse.Error.builder().code("code").retryable(true).build())
                .request(
                    ActionResponse.Request.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .result(
                    ActionResponse.Result.builder()
                        .artifact(
                            ActionResponse.Result.Artifact.builder()
                                .artifactId("artifact_id")
                                .contentType("content_type")
                                .sizeBytes(0L)
                                .build()
                        )
                        .observation(
                            ActionResponse.Result.Observation.builder()
                                .observationId("observation_id")
                                .refCount(0L)
                                .refs(
                                    ActionResponse.Result.Observation.Refs.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .title("title")
                                .tree("tree")
                                .truncated(true)
                                .url("url")
                                .build()
                        )
                        .addResult(
                            ActionResponse.Result.InnerResult.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .title("title")
                        .url("url")
                        .build()
                )
                .seq(0L)
                .sessionId("session_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponse.Status.QUEUED)
                .type("type")
                .build()

        assertThat(actionResponse.id()).isEqualTo("bact_075cfdc9-...")
        assertThat(actionResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponse.error())
            .contains(ActionResponse.Error.builder().code("code").retryable(true).build())
        assertThat(actionResponse.request())
            .isEqualTo(
                ActionResponse.Request.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(actionResponse.result())
            .contains(
                ActionResponse.Result.builder()
                    .artifact(
                        ActionResponse.Result.Artifact.builder()
                            .artifactId("artifact_id")
                            .contentType("content_type")
                            .sizeBytes(0L)
                            .build()
                    )
                    .observation(
                        ActionResponse.Result.Observation.builder()
                            .observationId("observation_id")
                            .refCount(0L)
                            .refs(
                                ActionResponse.Result.Observation.Refs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .title("title")
                            .tree("tree")
                            .truncated(true)
                            .url("url")
                            .build()
                    )
                    .addResult(
                        ActionResponse.Result.InnerResult.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(actionResponse.seq()).isEqualTo(0L)
        assertThat(actionResponse.sessionId()).isEqualTo("session_id")
        assertThat(actionResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(actionResponse.status()).isEqualTo(ActionResponse.Status.QUEUED)
        assertThat(actionResponse.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionResponse =
            ActionResponse.builder()
                .id("bact_075cfdc9-...")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(ActionResponse.Error.builder().code("code").retryable(true).build())
                .request(
                    ActionResponse.Request.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .result(
                    ActionResponse.Result.builder()
                        .artifact(
                            ActionResponse.Result.Artifact.builder()
                                .artifactId("artifact_id")
                                .contentType("content_type")
                                .sizeBytes(0L)
                                .build()
                        )
                        .observation(
                            ActionResponse.Result.Observation.builder()
                                .observationId("observation_id")
                                .refCount(0L)
                                .refs(
                                    ActionResponse.Result.Observation.Refs.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .title("title")
                                .tree("tree")
                                .truncated(true)
                                .url("url")
                                .build()
                        )
                        .addResult(
                            ActionResponse.Result.InnerResult.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .title("title")
                        .url("url")
                        .build()
                )
                .seq(0L)
                .sessionId("session_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(ActionResponse.Status.QUEUED)
                .type("type")
                .build()

        val roundtrippedActionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionResponse),
                jacksonTypeRef<ActionResponse>(),
            )

        assertThat(roundtrippedActionResponse).isEqualTo(actionResponse)
    }
}
