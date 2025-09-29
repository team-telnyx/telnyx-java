// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaListResponseTest {

    @Test
    fun create() {
        val mediaListResponse =
            MediaListResponse.builder()
                .addData(
                    MediaResource.builder()
                        .contentType("application/xml")
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .expiresAt("2020-01-23T18:10:02.574Z")
                        .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(mediaListResponse.data().getOrNull())
            .containsExactly(
                MediaResource.builder()
                    .contentType("application/xml")
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .expiresAt("2020-01-23T18:10:02.574Z")
                    .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
        assertThat(mediaListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaListResponse =
            MediaListResponse.builder()
                .addData(
                    MediaResource.builder()
                        .contentType("application/xml")
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .expiresAt("2020-01-23T18:10:02.574Z")
                        .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMediaListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaListResponse),
                jacksonTypeRef<MediaListResponse>(),
            )

        assertThat(roundtrippedMediaListResponse).isEqualTo(mediaListResponse)
    }
}
