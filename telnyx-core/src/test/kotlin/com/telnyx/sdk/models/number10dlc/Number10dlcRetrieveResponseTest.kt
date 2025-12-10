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

internal class Number10dlcRetrieveResponseTest {

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

        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumStringList(enumStringList)

        assertThat(number10dlcRetrieveResponse.enumStringList()).contains(enumStringList)
        assertThat(number10dlcRetrieveResponse.enumObjectList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumStringListRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumStringList(
                listOf(
                    "BASIC_ACCOUNT",
                    "SMALL_ACCOUNT",
                    "MEDIUM_ACCOUNT",
                    "LARGE_ACCOUNT",
                    "KEY_ACCOUNT",
                )
            )

        val roundtrippedNumber10dlcRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcRetrieveResponse),
                jacksonTypeRef<Number10dlcRetrieveResponse>(),
            )

        assertThat(roundtrippedNumber10dlcRetrieveResponse).isEqualTo(number10dlcRetrieveResponse)
    }

    @Test
    fun ofEnumObjectList() {
        val enumObjectList =
            listOf(
                Number10dlcRetrieveResponse.UnnamedSchemaWithArrayParent0.builder()
                    .putAdditionalProperty("networkId", JsonValue.from("bar"))
                    .putAdditionalProperty("displayName", JsonValue.from("bar"))
                    .putAdditionalProperty("osrBitmaskIndex", JsonValue.from("bar"))
                    .build()
            )

        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumObjectList(enumObjectList)

        assertThat(number10dlcRetrieveResponse.enumStringList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectList()).contains(enumObjectList)
        assertThat(number10dlcRetrieveResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectListRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumObjectList(
                listOf(
                    Number10dlcRetrieveResponse.UnnamedSchemaWithArrayParent0.builder()
                        .putAdditionalProperty("networkId", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .putAdditionalProperty("osrBitmaskIndex", JsonValue.from("bar"))
                        .build()
                )
            )

        val roundtrippedNumber10dlcRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcRetrieveResponse),
                jacksonTypeRef<Number10dlcRetrieveResponse>(),
            )

        assertThat(roundtrippedNumber10dlcRetrieveResponse).isEqualTo(number10dlcRetrieveResponse)
    }

    @Test
    fun ofEnumObjectToString() {
        val enumObjectToString =
            Number10dlcRetrieveResponse.EnumObjectToStringResponse.builder()
                .putAdditionalProperty("AREIS", JsonValue.from("bar"))
                .putAdditionalProperty("BANDW", JsonValue.from("bar"))
                .putAdditionalProperty("SINCH", JsonValue.from("bar"))
                .build()

        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumObjectToString(enumObjectToString)

        assertThat(number10dlcRetrieveResponse.enumStringList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectToString()).contains(enumObjectToString)
        assertThat(number10dlcRetrieveResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectToStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumObjectToString(
                Number10dlcRetrieveResponse.EnumObjectToStringResponse.builder()
                    .putAdditionalProperty("AREIS", JsonValue.from("bar"))
                    .putAdditionalProperty("BANDW", JsonValue.from("bar"))
                    .putAdditionalProperty("SINCH", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedNumber10dlcRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcRetrieveResponse),
                jacksonTypeRef<Number10dlcRetrieveResponse>(),
            )

        assertThat(roundtrippedNumber10dlcRetrieveResponse).isEqualTo(number10dlcRetrieveResponse)
    }

    @Test
    fun ofEnumObjecToObjectt() {
        val enumObjecToObjectt =
            Number10dlcRetrieveResponse.EnumObjecToObjecttResponse.builder()
                .putAdditionalProperty("PROFESSIONAL", JsonValue.from("bar"))
                .putAdditionalProperty("REAL_ESTATE", JsonValue.from("bar"))
                .build()

        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumObjecToObjectt(enumObjecToObjectt)

        assertThat(number10dlcRetrieveResponse.enumStringList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjecToObjectt()).contains(enumObjecToObjectt)
        assertThat(number10dlcRetrieveResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjecToObjecttRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumObjecToObjectt(
                Number10dlcRetrieveResponse.EnumObjecToObjecttResponse.builder()
                    .putAdditionalProperty("PROFESSIONAL", JsonValue.from("bar"))
                    .putAdditionalProperty("REAL_ESTATE", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedNumber10dlcRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcRetrieveResponse),
                jacksonTypeRef<Number10dlcRetrieveResponse>(),
            )

        assertThat(roundtrippedNumber10dlcRetrieveResponse).isEqualTo(number10dlcRetrieveResponse)
    }

    @Test
    fun ofEnumPaginated() {
        val enumPaginated =
            Number10dlcRetrieveResponse.EnumPaginatedResponse.builder()
                .page(1L)
                .addRecord(
                    Number10dlcRetrieveResponse.EnumPaginatedResponse.Record.builder()
                        .putAdditionalProperty("isin", JsonValue.from("bar"))
                        .putAdditionalProperty("iso2", JsonValue.from("bar"))
                        .putAdditionalProperty("symbol", JsonValue.from("bar"))
                        .putAdditionalProperty("exchange", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .build()
                )
                .addRecord(
                    Number10dlcRetrieveResponse.EnumPaginatedResponse.Record.builder()
                        .putAdditionalProperty("isin", JsonValue.from("bar"))
                        .putAdditionalProperty("iso2", JsonValue.from("bar"))
                        .putAdditionalProperty("symbol", JsonValue.from("bar"))
                        .putAdditionalProperty("exchange", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .build()
                )
                .totalRecords(2L)
                .build()

        val number10dlcRetrieveResponse = Number10dlcRetrieveResponse.ofEnumPaginated(enumPaginated)

        assertThat(number10dlcRetrieveResponse.enumStringList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectList()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjectToString()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumObjecToObjectt()).isEmpty
        assertThat(number10dlcRetrieveResponse.enumPaginated()).contains(enumPaginated)
    }

    @Test
    fun ofEnumPaginatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val number10dlcRetrieveResponse =
            Number10dlcRetrieveResponse.ofEnumPaginated(
                Number10dlcRetrieveResponse.EnumPaginatedResponse.builder()
                    .page(1L)
                    .addRecord(
                        Number10dlcRetrieveResponse.EnumPaginatedResponse.Record.builder()
                            .putAdditionalProperty("isin", JsonValue.from("bar"))
                            .putAdditionalProperty("iso2", JsonValue.from("bar"))
                            .putAdditionalProperty("symbol", JsonValue.from("bar"))
                            .putAdditionalProperty("exchange", JsonValue.from("bar"))
                            .putAdditionalProperty("displayName", JsonValue.from("bar"))
                            .build()
                    )
                    .addRecord(
                        Number10dlcRetrieveResponse.EnumPaginatedResponse.Record.builder()
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

        val roundtrippedNumber10dlcRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(number10dlcRetrieveResponse),
                jacksonTypeRef<Number10dlcRetrieveResponse>(),
            )

        assertThat(roundtrippedNumber10dlcRetrieveResponse).isEqualTo(number10dlcRetrieveResponse)
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
        val number10dlcRetrieveResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<Number10dlcRetrieveResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { number10dlcRetrieveResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
