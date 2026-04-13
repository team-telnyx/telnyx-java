// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictCreateParamsTest {

    @Test
    fun create() {
        PronunciationDictCreateParams.builder()
            .addItem(
                PronunciationDictAliasItem.builder()
                    .alias("tel-nicks")
                    .text("Telnyx")
                    .type(PronunciationDictAliasItem.Type.ALIAS)
                    .build()
            )
            .name("Brand Names")
            .build()
    }

    @Test
    fun body() {
        val params =
            PronunciationDictCreateParams.builder()
                .addItem(
                    PronunciationDictAliasItem.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .type(PronunciationDictAliasItem.Type.ALIAS)
                        .build()
                )
                .name("Brand Names")
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
                        "items" to
                            MultipartField.of(
                                listOf(
                                    PronunciationDictCreateParams.Item.ofAlias(
                                        PronunciationDictAliasItem.builder()
                                            .alias("tel-nicks")
                                            .text("Telnyx")
                                            .type(PronunciationDictAliasItem.Type.ALIAS)
                                            .build()
                                    )
                                )
                            ),
                        "name" to MultipartField.of("Brand Names"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
