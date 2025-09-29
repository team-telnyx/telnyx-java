// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.media

import com.telnyx.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaUploadParamsTest {

    @Test
    fun create() {
        MediaUploadParams.builder()
            .mediaUrl("http://www.example.com/audio.mp3")
            .mediaName("my-file")
            .ttlSecs(86400L)
            .build()
    }

    @Test
    fun body() {
        val params =
            MediaUploadParams.builder()
                .mediaUrl("http://www.example.com/audio.mp3")
                .mediaName("my-file")
                .ttlSecs(86400L)
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "media_url" to MultipartField.of("http://www.example.com/audio.mp3"),
                        "media_name" to MultipartField.of("my-file"),
                        "ttl_secs" to MultipartField.of(86400L),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaUploadParams.builder().mediaUrl("http://www.example.com/audio.mp3").build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("media_url" to MultipartField.of("http://www.example.com/audio.mp3"))
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
