// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrowserSessionRetrieveArtifactResponseTest {

    @Test
    fun create() {
        val browserSessionRetrieveArtifactResponse =
            BrowserSessionRetrieveArtifactResponse.builder()
                .data(
                    BrowserSessionRetrieveArtifactResponse.Data.builder()
                        .id("bart_75975c73-...")
                        .actionId("action_id")
                        .checksum("checksum")
                        .contentType("content_type")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .downloadUrl("download_url")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sessionId("session_id")
                        .sizeBytes(0L)
                        .type("type")
                        .build()
                )
                .build()

        assertThat(browserSessionRetrieveArtifactResponse.data())
            .contains(
                BrowserSessionRetrieveArtifactResponse.Data.builder()
                    .id("bart_75975c73-...")
                    .actionId("action_id")
                    .checksum("checksum")
                    .contentType("content_type")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .downloadUrl("download_url")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sessionId("session_id")
                    .sizeBytes(0L)
                    .type("type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val browserSessionRetrieveArtifactResponse =
            BrowserSessionRetrieveArtifactResponse.builder()
                .data(
                    BrowserSessionRetrieveArtifactResponse.Data.builder()
                        .id("bart_75975c73-...")
                        .actionId("action_id")
                        .checksum("checksum")
                        .contentType("content_type")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .downloadUrl("download_url")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sessionId("session_id")
                        .sizeBytes(0L)
                        .type("type")
                        .build()
                )
                .build()

        val roundtrippedBrowserSessionRetrieveArtifactResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(browserSessionRetrieveArtifactResponse),
                jacksonTypeRef<BrowserSessionRetrieveArtifactResponse>(),
            )

        assertThat(roundtrippedBrowserSessionRetrieveArtifactResponse)
            .isEqualTo(browserSessionRetrieveArtifactResponse)
    }
}
