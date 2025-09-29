// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaRetrieveResponseTest {

    @Test
    fun create() {
        val mediaRetrieveResponse =
            MediaRetrieveResponse.builder()
                .data(
                    MediaResource.builder()
                        .contentType("application/xml")
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .expiresAt("2020-01-23T18:10:02.574Z")
                        .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        assertThat(mediaRetrieveResponse.data())
            .contains(
                MediaResource.builder()
                    .contentType("application/xml")
                    .createdAt("2019-01-23T18:10:02.574Z")
                    .expiresAt("2020-01-23T18:10:02.574Z")
                    .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .updatedAt("2019-01-23T18:10:02.574Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaRetrieveResponse =
            MediaRetrieveResponse.builder()
                .data(
                    MediaResource.builder()
                        .contentType("application/xml")
                        .createdAt("2019-01-23T18:10:02.574Z")
                        .expiresAt("2020-01-23T18:10:02.574Z")
                        .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .updatedAt("2019-01-23T18:10:02.574Z")
                        .build()
                )
                .build()

        val roundtrippedMediaRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaRetrieveResponse),
                jacksonTypeRef<MediaRetrieveResponse>(),
            )

        assertThat(roundtrippedMediaRetrieveResponse).isEqualTo(mediaRetrieveResponse)
    }
}
