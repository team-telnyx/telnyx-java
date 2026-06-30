// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictAliasItemTest {

    @Test
    fun create() {
        val pronunciationDictAliasItem =
            PronunciationDictAliasItem.builder()
                .alias("tel-nicks")
                .text("Telnyx")
                .type(PronunciationDictAliasItem.Type.ALIAS)
                .build()

        assertThat(pronunciationDictAliasItem.alias()).isEqualTo("tel-nicks")
        assertThat(pronunciationDictAliasItem.text()).isEqualTo("Telnyx")
        assertThat(pronunciationDictAliasItem.type())
            .isEqualTo(PronunciationDictAliasItem.Type.ALIAS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictAliasItem =
            PronunciationDictAliasItem.builder()
                .alias("tel-nicks")
                .text("Telnyx")
                .type(PronunciationDictAliasItem.Type.ALIAS)
                .build()

        val roundtrippedPronunciationDictAliasItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictAliasItem),
                jacksonTypeRef<PronunciationDictAliasItem>(),
            )

        assertThat(roundtrippedPronunciationDictAliasItem).isEqualTo(pronunciationDictAliasItem)
    }
}
