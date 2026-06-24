// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PronunciationDictItemTest {

    @Test
    fun ofAlias() {
        val alias =
            PronunciationDictAliasItem.builder()
                .alias("tel-nicks")
                .text("Telnyx")
                .type(PronunciationDictAliasItem.Type.ALIAS)
                .build()

        val pronunciationDictItem = PronunciationDictItem.ofAlias(alias)

        assertThat(pronunciationDictItem.alias()).contains(alias)
        assertThat(pronunciationDictItem.phoneme()).isEmpty
    }

    @Test
    fun ofAliasRoundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictItem =
            PronunciationDictItem.ofAlias(
                PronunciationDictAliasItem.builder()
                    .alias("tel-nicks")
                    .text("Telnyx")
                    .type(PronunciationDictAliasItem.Type.ALIAS)
                    .build()
            )

        val roundtrippedPronunciationDictItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictItem),
                jacksonTypeRef<PronunciationDictItem>(),
            )

        assertThat(roundtrippedPronunciationDictItem).isEqualTo(pronunciationDictItem)
    }

    @Test
    fun ofPhoneme() {
        val phoneme =
            PronunciationDictPhonemeItem.builder()
                .alphabet(PronunciationDictPhonemeItem.Alphabet.IPA)
                .phoneme("ˈtɛl.nɪks")
                .text("Telnyx")
                .type(PronunciationDictPhonemeItem.Type.PHONEME)
                .build()

        val pronunciationDictItem = PronunciationDictItem.ofPhoneme(phoneme)

        assertThat(pronunciationDictItem.alias()).isEmpty
        assertThat(pronunciationDictItem.phoneme()).contains(phoneme)
    }

    @Test
    fun ofPhonemeRoundtrip() {
        val jsonMapper = jsonMapper()
        val pronunciationDictItem =
            PronunciationDictItem.ofPhoneme(
                PronunciationDictPhonemeItem.builder()
                    .alphabet(PronunciationDictPhonemeItem.Alphabet.IPA)
                    .phoneme("ˈtɛl.nɪks")
                    .text("Telnyx")
                    .type(PronunciationDictPhonemeItem.Type.PHONEME)
                    .build()
            )

        val roundtrippedPronunciationDictItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pronunciationDictItem),
                jacksonTypeRef<PronunciationDictItem>(),
            )

        assertThat(roundtrippedPronunciationDictItem).isEqualTo(pronunciationDictItem)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val pronunciationDictItem =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PronunciationDictItem>())

        val e = assertThrows<TelnyxInvalidDataException> { pronunciationDictItem.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
