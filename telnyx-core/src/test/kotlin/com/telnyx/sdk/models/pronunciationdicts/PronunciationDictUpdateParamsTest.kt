// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictUpdateParamsTest {

    @Test
    fun create() {
        PronunciationDictUpdateParams.builder()
            .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
            .addItem(
                PronunciationDictAliasItem.builder()
                    .alias("tel-nicks")
                    .text("Telnyx")
                    .type(PronunciationDictAliasItem.Type.ALIAS)
                    .build()
            )
            .name("Updated Brand Names")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PronunciationDictUpdateParams.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PronunciationDictUpdateParams.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .addItem(
                    PronunciationDictAliasItem.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .type(PronunciationDictAliasItem.Type.ALIAS)
                        .build()
                )
                .name("Updated Brand Names")
                .build()

        val body = params._body()

        assertThat(body.items().getOrNull())
            .containsExactly(
                PronunciationDictUpdateParams.Item.ofAlias(
                    PronunciationDictAliasItem.builder()
                        .alias("tel-nicks")
                        .text("Telnyx")
                        .type(PronunciationDictAliasItem.Type.ALIAS)
                        .build()
                )
            )
        assertThat(body.name()).contains("Updated Brand Names")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PronunciationDictUpdateParams.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .build()

        val body = params._body()
    }
}
