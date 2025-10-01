// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaUpdateResponseTest {

    @Test
    fun create() {
        val mediaUpdateResponse =
            MediaUpdateResponse.builder()
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

        assertThat(mediaUpdateResponse.data())
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
        val mediaUpdateResponse =
            MediaUpdateResponse.builder()
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

        val roundtrippedMediaUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaUpdateResponse),
                jacksonTypeRef<MediaUpdateResponse>(),
            )

        assertThat(roundtrippedMediaUpdateResponse).isEqualTo(mediaUpdateResponse)
    }
}
