// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResearchRetrieveResponseTest {

    @Test
    fun create() {
        val researchRetrieveResponse =
            ResearchRetrieveResponse.builder()
                .data(
                    ResearchRetrieveResponse.Data.builder()
                        .status(ResearchRetrieveResponse.Data.Status.PENDING)
                        .taskId("task_id")
                        .answer("answer")
                        .addCitation(
                            ResearchCitation.builder()
                                .title("title")
                                .url("https://example.com")
                                .snippet("snippet")
                                .build()
                        )
                        .error("error")
                        .build()
                )
                .build()

        assertThat(researchRetrieveResponse.data())
            .contains(
                ResearchRetrieveResponse.Data.builder()
                    .status(ResearchRetrieveResponse.Data.Status.PENDING)
                    .taskId("task_id")
                    .answer("answer")
                    .addCitation(
                        ResearchCitation.builder()
                            .title("title")
                            .url("https://example.com")
                            .snippet("snippet")
                            .build()
                    )
                    .error("error")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val researchRetrieveResponse =
            ResearchRetrieveResponse.builder()
                .data(
                    ResearchRetrieveResponse.Data.builder()
                        .status(ResearchRetrieveResponse.Data.Status.PENDING)
                        .taskId("task_id")
                        .answer("answer")
                        .addCitation(
                            ResearchCitation.builder()
                                .title("title")
                                .url("https://example.com")
                                .snippet("snippet")
                                .build()
                        )
                        .error("error")
                        .build()
                )
                .build()

        val roundtrippedResearchRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(researchRetrieveResponse),
                jacksonTypeRef<ResearchRetrieveResponse>(),
            )

        assertThat(roundtrippedResearchRetrieveResponse).isEqualTo(researchRetrieveResponse)
    }
}
