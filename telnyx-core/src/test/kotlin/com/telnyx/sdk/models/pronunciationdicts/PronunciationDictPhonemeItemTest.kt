// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictPhonemeItemTest {

    @Test
    fun create() {
        val pronunciationDictPhonemeItem =
            PronunciationDictPhonemeItem.builder()
                .alphabet(PronunciationDictPhonemeItem.Alphabet.IPA)
                .phoneme("ˈtɛl.nɪks")
                .text("Telnyx")
                .type(PronunciationDictPhonemeItem.Type.PHONEME)
                .build()

        assertThat(pronunciationDictPhonemeItem.alphabet())
            .isEqualTo(PronunciationDictPhonemeItem.Alphabet.IPA)
        assertThat(pronunciationDictPhonemeItem.phoneme()).isEqualTo("ˈtɛl.nɪks")
        assertThat(pronunciationDictPhonemeItem.text()).isEqualTo("Telnyx")
        assertThat(pronunciationDictPhonemeItem.type())
            .isEqualTo(PronunciationDictPhonemeItem.Type.PHONEME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictPhonemeItem =
            PronunciationDictPhonemeItem.builder()
                .alphabet(PronunciationDictPhonemeItem.Alphabet.IPA)
                .phoneme("ˈtɛl.nɪks")
                .text("Telnyx")
                .type(PronunciationDictPhonemeItem.Type.PHONEME)
                .build()

        val roundtrippedPronunciationDictPhonemeItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictPhonemeItem),
                jacksonTypeRef<PronunciationDictPhonemeItem>(),
            )

        assertThat(roundtrippedPronunciationDictPhonemeItem).isEqualTo(pronunciationDictPhonemeItem)
    }
}
