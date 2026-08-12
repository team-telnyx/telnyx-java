// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettingsWrapper
import com.telnyx.sdk.models.ai.collections.sources.SourceRequest
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionCreateParamsTest {

    @Test
    fun create() {
        CollectionCreateParams.builder()
            .name("Support Transcripts")
            .description("All customer support voice transcripts.")
            .settings(
                RetrievalSettingsWrapper.builder()
                    .recordType("ai_collection_settings")
                    .retrieval(
                        RetrievalSettings.builder()
                            .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                            .topK(5L)
                            .build()
                    )
                    .build()
            )
            .slug("support-transcripts")
            .addSource(
                SourceRequest.builder().sourceType(SourceType.VOICE).bucketId("policy-docs").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CollectionCreateParams.builder()
                .name("Support Transcripts")
                .description("All customer support voice transcripts.")
                .settings(
                    RetrievalSettingsWrapper.builder()
                        .recordType("ai_collection_settings")
                        .retrieval(
                            RetrievalSettings.builder()
                                .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                .topK(5L)
                                .build()
                        )
                        .build()
                )
                .slug("support-transcripts")
                .addSource(
                    SourceRequest.builder()
                        .sourceType(SourceType.VOICE)
                        .bucketId("policy-docs")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Support Transcripts")
        assertThat(body.description()).contains("All customer support voice transcripts.")
        assertThat(body.settings())
            .contains(
                RetrievalSettingsWrapper.builder()
                    .recordType("ai_collection_settings")
                    .retrieval(
                        RetrievalSettings.builder()
                            .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                            .topK(5L)
                            .build()
                    )
                    .build()
            )
        assertThat(body.slug()).contains("support-transcripts")
        assertThat(body.sources().getOrNull())
            .containsExactly(
                SourceRequest.builder().sourceType(SourceType.VOICE).bucketId("policy-docs").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CollectionCreateParams.builder().name("Support Transcripts").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Support Transcripts")
    }
}
