// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.audio

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AudioTranscribeParamsTest {

    @Test
    fun create() {
        AudioTranscribeParams.builder()
            .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
            .file("some content".byteInputStream())
            .fileUrl("https://example.com/file.mp3")
            .language("en-US")
            .modelConfig(
                AudioTranscribeParams.ModelConfig.builder()
                    .putAdditionalProperty("smart_format", JsonValue.from("bar"))
                    .putAdditionalProperty("punctuate", JsonValue.from("bar"))
                    .build()
            )
            .responseFormat(AudioTranscribeParams.ResponseFormat.JSON)
            .timestampGranularities(AudioTranscribeParams.TimestampGranularities.SEGMENT)
            .build()
    }

    @Test
    fun body() {
        val params =
            AudioTranscribeParams.builder()
                .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                .file("some content".byteInputStream())
                .fileUrl("https://example.com/file.mp3")
                .language("en-US")
                .modelConfig(
                    AudioTranscribeParams.ModelConfig.builder()
                        .putAdditionalProperty("smart_format", JsonValue.from("bar"))
                        .putAdditionalProperty("punctuate", JsonValue.from("bar"))
                        .build()
                )
                .responseFormat(AudioTranscribeParams.ResponseFormat.JSON)
                .timestampGranularities(AudioTranscribeParams.TimestampGranularities.SEGMENT)
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
                        "model" to
                            MultipartField.of(
                                AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2
                            ),
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "file_url" to MultipartField.of("https://example.com/file.mp3"),
                        "language" to MultipartField.of("en-US"),
                        "model_config" to
                            MultipartField.of(
                                AudioTranscribeParams.ModelConfig.builder()
                                    .putAdditionalProperty("smart_format", JsonValue.from("bar"))
                                    .putAdditionalProperty("punctuate", JsonValue.from("bar"))
                                    .build()
                            ),
                        "response_format" to
                            MultipartField.of(AudioTranscribeParams.ResponseFormat.JSON),
                        "timestamp_granularities[]" to
                            MultipartField.of(AudioTranscribeParams.TimestampGranularities.SEGMENT),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AudioTranscribeParams.builder()
                .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
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
                        "model" to
                            MultipartField.of(
                                AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2
                            )
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
