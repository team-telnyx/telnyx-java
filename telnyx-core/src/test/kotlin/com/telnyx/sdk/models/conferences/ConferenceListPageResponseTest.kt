// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceListPageResponseTest {

    @Test
    fun create() {
        val conferenceListPageResponse =
            ConferenceListPageResponse.builder()
                .addData(
                    Conference.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .expiresAt("2019-01-23T18:10:02.574Z")
                        .name("All hands meeting")
                        .recordType(Conference.RecordType.CONFERENCE)
                        .connectionId("3fa85f64-9191-4567-b3fc-2c963f66afa6")
                        .endReason(Conference.EndReason.ALL_LEFT)
                        .endedBy(
                            Conference.EndedBy.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ=="
                                )
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .build()
                        )
                        .region("sv1")
                        .status(Conference.Status.COMPLETED)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(conferenceListPageResponse.data().getOrNull())
            .containsExactly(
                Conference.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .expiresAt("2019-01-23T18:10:02.574Z")
                    .name("All hands meeting")
                    .recordType(Conference.RecordType.CONFERENCE)
                    .connectionId("3fa85f64-9191-4567-b3fc-2c963f66afa6")
                    .endReason(Conference.EndReason.ALL_LEFT)
                    .endedBy(
                        Conference.EndedBy.builder()
                            .callControlId(
                                "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ=="
                            )
                            .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .build()
                    )
                    .region("sv1")
                    .status(Conference.Status.COMPLETED)
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
        assertThat(conferenceListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceListPageResponse =
            ConferenceListPageResponse.builder()
                .addData(
                    Conference.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .expiresAt("2019-01-23T18:10:02.574Z")
                        .name("All hands meeting")
                        .recordType(Conference.RecordType.CONFERENCE)
                        .connectionId("3fa85f64-9191-4567-b3fc-2c963f66afa6")
                        .endReason(Conference.EndReason.ALL_LEFT)
                        .endedBy(
                            Conference.EndedBy.builder()
                                .callControlId(
                                    "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ=="
                                )
                                .callSessionId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .build()
                        )
                        .region("sv1")
                        .status(Conference.Status.COMPLETED)
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedConferenceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceListPageResponse),
                jacksonTypeRef<ConferenceListPageResponse>(),
            )

        assertThat(roundtrippedConferenceListPageResponse).isEqualTo(conferenceListPageResponse)
    }
}
