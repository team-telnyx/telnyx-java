// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class Number10dlcGetEnumResponseTest {

    @Test
    fun ofEnumStringList() {
        val enumStringList =
            listOf(
                "BASIC_ACCOUNT",
                "SMALL_ACCOUNT",
                "MEDIUM_ACCOUNT",
                "LARGE_ACCOUNT",
                "KEY_ACCOUNT",
            )

        val number10dlcGetEnumResponse = Number10dlcGetEnumResponse.ofEnumStringList(enumStringList)

        assertThat(number10dlcGetEnumResponse.enumStringList()).contains(enumStringList)
        assertThat(number10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumStringListRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumStringList(
                listOf(
                    "BASIC_ACCOUNT",
                    "SMALL_ACCOUNT",
                    "MEDIUM_ACCOUNT",
                    "LARGE_ACCOUNT",
                    "KEY_ACCOUNT",
                )
            )

        val roundtrippedNumber10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcGetEnumResponse),
                jacksonTypeRef<Number10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedNumber10dlcGetEnumResponse).isEqualTo(number10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumObjectList() {
        val enumObjectList =
            listOf(
                Number10dlcGetEnumResponse.UnnamedSchemaWithArrayParent0.builder()
                    .putAdditionalProperty("networkId", JsonValue.from("bar"))
                    .putAdditionalProperty("displayName", JsonValue.from("bar"))
                    .putAdditionalProperty("osrBitmaskIndex", JsonValue.from("bar"))
                    .build()
            )

        val number10dlcGetEnumResponse = Number10dlcGetEnumResponse.ofEnumObjectList(enumObjectList)

        assertThat(number10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectList()).contains(enumObjectList)
        assertThat(number10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectListRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumObjectList(
                listOf(
                    Number10dlcGetEnumResponse.UnnamedSchemaWithArrayParent0.builder()
                        .putAdditionalProperty("networkId", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .putAdditionalProperty("osrBitmaskIndex", JsonValue.from("bar"))
                        .build()
                )
            )

        val roundtrippedNumber10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcGetEnumResponse),
                jacksonTypeRef<Number10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedNumber10dlcGetEnumResponse).isEqualTo(number10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumObjectToString() {
        val enumObjectToString =
            Number10dlcGetEnumResponse.EnumObjectToStringResponse.builder()
                .putAdditionalProperty("AREIS", JsonValue.from("bar"))
                .putAdditionalProperty("BANDW", JsonValue.from("bar"))
                .putAdditionalProperty("SINCH", JsonValue.from("bar"))
                .build()

        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumObjectToString(enumObjectToString)

        assertThat(number10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectToString()).contains(enumObjectToString)
        assertThat(number10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectToStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumObjectToString(
                Number10dlcGetEnumResponse.EnumObjectToStringResponse.builder()
                    .putAdditionalProperty("AREIS", JsonValue.from("bar"))
                    .putAdditionalProperty("BANDW", JsonValue.from("bar"))
                    .putAdditionalProperty("SINCH", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedNumber10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcGetEnumResponse),
                jacksonTypeRef<Number10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedNumber10dlcGetEnumResponse).isEqualTo(number10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumObjecToObjectt() {
        val enumObjecToObjectt =
            Number10dlcGetEnumResponse.EnumObjecToObjecttResponse.builder()
                .putAdditionalProperty("PROFESSIONAL", JsonValue.from("bar"))
                .putAdditionalProperty("REAL_ESTATE", JsonValue.from("bar"))
                .build()

        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumObjecToObjectt(enumObjecToObjectt)

        assertThat(number10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjecToObjectt()).contains(enumObjecToObjectt)
        assertThat(number10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjecToObjecttRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumObjecToObjectt(
                Number10dlcGetEnumResponse.EnumObjecToObjecttResponse.builder()
                    .putAdditionalProperty("PROFESSIONAL", JsonValue.from("bar"))
                    .putAdditionalProperty("REAL_ESTATE", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedNumber10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcGetEnumResponse),
                jacksonTypeRef<Number10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedNumber10dlcGetEnumResponse).isEqualTo(number10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumPaginated() {
        val enumPaginated =
            Number10dlcGetEnumResponse.EnumPaginatedResponse.builder()
                .page(1L)
                .addRecord(
                    Number10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                        .putAdditionalProperty("isin", JsonValue.from("bar"))
                        .putAdditionalProperty("iso2", JsonValue.from("bar"))
                        .putAdditionalProperty("symbol", JsonValue.from("bar"))
                        .putAdditionalProperty("exchange", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .build()
                )
                .addRecord(
                    Number10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                        .putAdditionalProperty("isin", JsonValue.from("bar"))
                        .putAdditionalProperty("iso2", JsonValue.from("bar"))
                        .putAdditionalProperty("symbol", JsonValue.from("bar"))
                        .putAdditionalProperty("exchange", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .build()
                )
                .totalRecords(2L)
                .build()

        val number10dlcGetEnumResponse = Number10dlcGetEnumResponse.ofEnumPaginated(enumPaginated)

        assertThat(number10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcGetEnumResponse.enumPaginated()).contains(enumPaginated)
    }

    @Test
    fun ofEnumPaginatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcGetEnumResponse =
            Number10dlcGetEnumResponse.ofEnumPaginated(
                Number10dlcGetEnumResponse.EnumPaginatedResponse.builder()
                    .page(1L)
                    .addRecord(
                        Number10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                            .putAdditionalProperty("isin", JsonValue.from("bar"))
                            .putAdditionalProperty("iso2", JsonValue.from("bar"))
                            .putAdditionalProperty("symbol", JsonValue.from("bar"))
                            .putAdditionalProperty("exchange", JsonValue.from("bar"))
                            .putAdditionalProperty("displayName", JsonValue.from("bar"))
                            .build()
                    )
                    .addRecord(
                        Number10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                            .putAdditionalProperty("isin", JsonValue.from("bar"))
                            .putAdditionalProperty("iso2", JsonValue.from("bar"))
                            .putAdditionalProperty("symbol", JsonValue.from("bar"))
                            .putAdditionalProperty("exchange", JsonValue.from("bar"))
                            .putAdditionalProperty("displayName", JsonValue.from("bar"))
                            .build()
                    )
                    .totalRecords(2L)
                    .build()
            )

        val roundtrippedNumber10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcGetEnumResponse),
                jacksonTypeRef<Number10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedNumber10dlcGetEnumResponse).isEqualTo(number10dlcGetEnumResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val number10dlcGetEnumResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<Number10dlcGetEnumResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { number10dlcGetEnumResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
