// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneCreateFromUploadParamsTest {

    @Test
    fun create() {
        VoiceCloneCreateFromUploadParams.builder()
            .audioFile("Example data".byteInputStream())
            .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
            .name("name")
            .gender(VoiceCloneCreateFromUploadParams.Gender.MALE)
            .label("label")
            .provider(VoiceCloneCreateFromUploadParams.Provider.TELNYX)
            .refText("ref_text")
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceCloneCreateFromUploadParams.builder()
                .audioFile("Example data".byteInputStream())
                .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                .name("name")
                .gender(VoiceCloneCreateFromUploadParams.Gender.MALE)
                .label("label")
                .provider(VoiceCloneCreateFromUploadParams.Provider.TELNYX)
                .refText("ref_text")
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
                        "audio_file" to MultipartField.of("Example data".byteInputStream()),
                        "language" to MultipartField.of("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf"),
                        "name" to MultipartField.of("name"),
                        "gender" to MultipartField.of(VoiceCloneCreateFromUploadParams.Gender.MALE),
                        "label" to MultipartField.of("label"),
                        "provider" to
                            MultipartField.of(VoiceCloneCreateFromUploadParams.Provider.TELNYX),
                        "ref_text" to MultipartField.of("ref_text"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceCloneCreateFromUploadParams.builder()
                .audioFile("Example data".byteInputStream())
                .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                .name("name")
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
                        "audio_file" to MultipartField.of("Example data".byteInputStream()),
                        "language" to MultipartField.of("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf"),
                        "name" to MultipartField.of("name"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
