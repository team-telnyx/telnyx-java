// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class Messaging10dlcGetEnumResponseTest {

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

        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumStringList(enumStringList)

        assertThat(messaging10dlcGetEnumResponse.enumStringList()).contains(enumStringList)
        assertThat(messaging10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumStringListRoundtrip() {
        val jsonMapper = jsonMapper()
        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumStringList(
                listOf(
                    "BASIC_ACCOUNT",
                    "SMALL_ACCOUNT",
                    "MEDIUM_ACCOUNT",
                    "LARGE_ACCOUNT",
                    "KEY_ACCOUNT",
                )
            )

        val roundtrippedMessaging10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messaging10dlcGetEnumResponse),
                jacksonTypeRef<Messaging10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedMessaging10dlcGetEnumResponse)
            .isEqualTo(messaging10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumObjectList() {
        val enumObjectList =
            listOf(
                Messaging10dlcGetEnumResponse.EnumObject.builder()
                    .putAdditionalProperty("networkId", JsonValue.from("bar"))
                    .putAdditionalProperty("displayName", JsonValue.from("bar"))
                    .putAdditionalProperty("osrBitmaskIndex", JsonValue.from("bar"))
                    .build()
            )

        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumObjectList(enumObjectList)

        assertThat(messaging10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectList()).contains(enumObjectList)
        assertThat(messaging10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectListRoundtrip() {
        val jsonMapper = jsonMapper()
        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumObjectList(
                listOf(
                    Messaging10dlcGetEnumResponse.EnumObject.builder()
                        .putAdditionalProperty("networkId", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .putAdditionalProperty("osrBitmaskIndex", JsonValue.from("bar"))
                        .build()
                )
            )

        val roundtrippedMessaging10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messaging10dlcGetEnumResponse),
                jacksonTypeRef<Messaging10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedMessaging10dlcGetEnumResponse)
            .isEqualTo(messaging10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumObjectToString() {
        val enumObjectToString =
            Messaging10dlcGetEnumResponse.EnumObjectToStringResponse.builder()
                .putAdditionalProperty("AREIS", JsonValue.from("bar"))
                .putAdditionalProperty("BANDW", JsonValue.from("bar"))
                .putAdditionalProperty("SINCH", JsonValue.from("bar"))
                .build()

        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumObjectToString(enumObjectToString)

        assertThat(messaging10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectToString()).contains(enumObjectToString)
        assertThat(messaging10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjectToStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumObjectToString(
                Messaging10dlcGetEnumResponse.EnumObjectToStringResponse.builder()
                    .putAdditionalProperty("AREIS", JsonValue.from("bar"))
                    .putAdditionalProperty("BANDW", JsonValue.from("bar"))
                    .putAdditionalProperty("SINCH", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedMessaging10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messaging10dlcGetEnumResponse),
                jacksonTypeRef<Messaging10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedMessaging10dlcGetEnumResponse)
            .isEqualTo(messaging10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumObjecToObjectt() {
        val enumObjecToObjectt =
            Messaging10dlcGetEnumResponse.EnumObjecToObjecttResponse.builder()
                .putAdditionalProperty("PROFESSIONAL", JsonValue.from("bar"))
                .putAdditionalProperty("REAL_ESTATE", JsonValue.from("bar"))
                .build()

        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumObjecToObjectt(enumObjecToObjectt)

        assertThat(messaging10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjecToObjectt()).contains(enumObjecToObjectt)
        assertThat(messaging10dlcGetEnumResponse.enumPaginated()).isEmpty
    }

    @Test
    fun ofEnumObjecToObjecttRoundtrip() {
        val jsonMapper = jsonMapper()
        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumObjecToObjectt(
                Messaging10dlcGetEnumResponse.EnumObjecToObjecttResponse.builder()
                    .putAdditionalProperty("PROFESSIONAL", JsonValue.from("bar"))
                    .putAdditionalProperty("REAL_ESTATE", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedMessaging10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messaging10dlcGetEnumResponse),
                jacksonTypeRef<Messaging10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedMessaging10dlcGetEnumResponse)
            .isEqualTo(messaging10dlcGetEnumResponse)
    }

    @Test
    fun ofEnumPaginated() {
        val enumPaginated =
            Messaging10dlcGetEnumResponse.EnumPaginatedResponse.builder()
                .page(1L)
                .addRecord(
                    Messaging10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                        .putAdditionalProperty("isin", JsonValue.from("bar"))
                        .putAdditionalProperty("iso2", JsonValue.from("bar"))
                        .putAdditionalProperty("symbol", JsonValue.from("bar"))
                        .putAdditionalProperty("exchange", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .build()
                )
                .addRecord(
                    Messaging10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                        .putAdditionalProperty("isin", JsonValue.from("bar"))
                        .putAdditionalProperty("iso2", JsonValue.from("bar"))
                        .putAdditionalProperty("symbol", JsonValue.from("bar"))
                        .putAdditionalProperty("exchange", JsonValue.from("bar"))
                        .putAdditionalProperty("displayName", JsonValue.from("bar"))
                        .build()
                )
                .totalRecords(2L)
                .build()

        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumPaginated(enumPaginated)

        assertThat(messaging10dlcGetEnumResponse.enumStringList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectList()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjectToString()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumObjecToObjectt()).isEmpty
        assertThat(messaging10dlcGetEnumResponse.enumPaginated()).contains(enumPaginated)
    }

    @Test
    fun ofEnumPaginatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val messaging10dlcGetEnumResponse =
            Messaging10dlcGetEnumResponse.ofEnumPaginated(
                Messaging10dlcGetEnumResponse.EnumPaginatedResponse.builder()
                    .page(1L)
                    .addRecord(
                        Messaging10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
                            .putAdditionalProperty("isin", JsonValue.from("bar"))
                            .putAdditionalProperty("iso2", JsonValue.from("bar"))
                            .putAdditionalProperty("symbol", JsonValue.from("bar"))
                            .putAdditionalProperty("exchange", JsonValue.from("bar"))
                            .putAdditionalProperty("displayName", JsonValue.from("bar"))
                            .build()
                    )
                    .addRecord(
                        Messaging10dlcGetEnumResponse.EnumPaginatedResponse.Record.builder()
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

        val roundtrippedMessaging10dlcGetEnumResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messaging10dlcGetEnumResponse),
                jacksonTypeRef<Messaging10dlcGetEnumResponse>(),
            )

        assertThat(roundtrippedMessaging10dlcGetEnumResponse)
            .isEqualTo(messaging10dlcGetEnumResponse)
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
        val messaging10dlcGetEnumResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<Messaging10dlcGetEnumResponse>())

        val e =
            assertThrows<TelnyxInvalidDataException> { messaging10dlcGetEnumResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
