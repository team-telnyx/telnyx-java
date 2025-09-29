// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.media

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaResourceTest {

    @Test
    fun create() {
        val mediaResource =
            MediaResource.builder()
                .contentType("application/xml")
                .createdAt("2019-01-23T18:10:02.574Z")
                .expiresAt("2020-01-23T18:10:02.574Z")
                .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        assertThat(mediaResource.contentType()).contains("application/xml")
        assertThat(mediaResource.createdAt()).contains("2019-01-23T18:10:02.574Z")
        assertThat(mediaResource.expiresAt()).contains("2020-01-23T18:10:02.574Z")
        assertThat(mediaResource.mediaName()).contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(mediaResource.updatedAt()).contains("2019-01-23T18:10:02.574Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaResource =
            MediaResource.builder()
                .contentType("application/xml")
                .createdAt("2019-01-23T18:10:02.574Z")
                .expiresAt("2020-01-23T18:10:02.574Z")
                .mediaName("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .updatedAt("2019-01-23T18:10:02.574Z")
                .build()

        val roundtrippedMediaResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaResource),
                jacksonTypeRef<MediaResource>(),
            )

        assertThat(roundtrippedMediaResource).isEqualTo(mediaResource)
    }
}
