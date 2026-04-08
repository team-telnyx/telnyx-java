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
            .params(
                VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.builder()
                    .audioFile("Example data".byteInputStream())
                    .gender(VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Gender.MALE)
                    .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                    .name("name")
                    .provider(
                        VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Provider.TELNYX
                    )
                    .label("label")
                    .modelId(
                        VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.ModelId
                            .QWEN3_TTS
                    )
                    .refText("ref_text")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceCloneCreateFromUploadParams.builder()
                .params(
                    VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.builder()
                        .audioFile("Example data".byteInputStream())
                        .gender(
                            VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Gender.MALE
                        )
                        .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                        .name("name")
                        .provider(
                            VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Provider
                                .TELNYX
                        )
                        .label("label")
                        .modelId(
                            VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.ModelId
                                .QWEN3_TTS
                        )
                        .refText("ref_text")
                        .build()
                )
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
                        "params" to
                            MultipartField.builder<VoiceCloneCreateFromUploadParams.Params>()
                                .value(
                                    VoiceCloneCreateFromUploadParams.Params.ofTelnyxQwen3TtsClone(
                                        VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone
                                            .builder()
                                            .audioFile("Example data".byteInputStream())
                                            .gender(
                                                VoiceCloneCreateFromUploadParams.Params
                                                    .TelnyxQwen3TtsClone
                                                    .Gender
                                                    .MALE
                                            )
                                            .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                                            .name("name")
                                            .provider(
                                                VoiceCloneCreateFromUploadParams.Params
                                                    .TelnyxQwen3TtsClone
                                                    .Provider
                                                    .TELNYX
                                            )
                                            .label("label")
                                            .modelId(
                                                VoiceCloneCreateFromUploadParams.Params
                                                    .TelnyxQwen3TtsClone
                                                    .ModelId
                                                    .QWEN3_TTS
                                            )
                                            .refText("ref_text")
                                            .build()
                                    )
                                )
                                .contentType("application/octet-stream")
                                .build()
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
                .params(
                    VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.builder()
                        .audioFile("Example data".byteInputStream())
                        .gender(
                            VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Gender.MALE
                        )
                        .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                        .name("name")
                        .provider(
                            VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone.Provider
                                .TELNYX
                        )
                        .build()
                )
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
                        "params" to
                            MultipartField.builder<VoiceCloneCreateFromUploadParams.Params>()
                                .value(
                                    VoiceCloneCreateFromUploadParams.Params.ofTelnyxQwen3TtsClone(
                                        VoiceCloneCreateFromUploadParams.Params.TelnyxQwen3TtsClone
                                            .builder()
                                            .audioFile("Example data".byteInputStream())
                                            .gender(
                                                VoiceCloneCreateFromUploadParams.Params
                                                    .TelnyxQwen3TtsClone
                                                    .Gender
                                                    .MALE
                                            )
                                            .language("lkf-Lz1vLbBu-9uDh-9AHaOS2D-Cbf")
                                            .name("name")
                                            .provider(
                                                VoiceCloneCreateFromUploadParams.Params
                                                    .TelnyxQwen3TtsClone
                                                    .Provider
                                                    .TELNYX
                                            )
                                            .build()
                                    )
                                )
                                .contentType("application/octet-stream")
                                .build()
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
