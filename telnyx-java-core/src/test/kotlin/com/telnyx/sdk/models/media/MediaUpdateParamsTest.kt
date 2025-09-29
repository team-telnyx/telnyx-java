// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.media

import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaUpdateParamsTest {

    @Test
    fun create() {
        MediaUpdateParams.builder()
            .mediaName("media_name")
            .mediaUrl("http://www.example.com/audio.mp3")
            .ttlSecs(86400L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = MediaUpdateParams.builder().mediaName("media_name").build()

        assertThat(params._pathParam(0)).isEqualTo("media_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaUpdateParams.builder()
                .mediaName("media_name")
                .mediaUrl("http://www.example.com/audio.mp3")
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
                        "ttl_secs" to MultipartField.of(86400L),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MediaUpdateParams.builder().mediaName("media_name").build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() }).isEmpty()
    }
}
