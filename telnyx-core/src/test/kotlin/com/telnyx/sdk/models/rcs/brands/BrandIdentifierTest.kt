// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class BrandIdentifierTest {

    @Test
    fun ofEin() {
        val ein = EinBrandIdentifier.builder().value("29-1051329").build()

        val brandIdentifier = BrandIdentifier.ofEin(ein)

        assertThat(brandIdentifier.ein()).contains(ein)
        assertThat(brandIdentifier.stockSymbol()).isEmpty
    }

    @Test
    fun ofEinRoundtrip() {
        val jsonMapper = jsonMapper()
        val brandIdentifier =
            BrandIdentifier.ofEin(EinBrandIdentifier.builder().value("29-1051329").build())

        val roundtrippedBrandIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandIdentifier),
                jacksonTypeRef<BrandIdentifier>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedBrandIdentifier))
            .isEqualTo(jsonMapper.writeValueAsString(brandIdentifier))
    }

    @Test
    fun ofStockSymbol() {
        val stockSymbol = StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()

        val brandIdentifier = BrandIdentifier.ofStockSymbol(stockSymbol)

        assertThat(brandIdentifier.ein()).isEmpty
        assertThat(brandIdentifier.stockSymbol()).contains(stockSymbol)
    }

    @Test
    fun ofStockSymbolRoundtrip() {
        val jsonMapper = jsonMapper()
        val brandIdentifier =
            BrandIdentifier.ofStockSymbol(
                StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()
            )

        val roundtrippedBrandIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandIdentifier),
                jacksonTypeRef<BrandIdentifier>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedBrandIdentifier))
            .isEqualTo(jsonMapper.writeValueAsString(brandIdentifier))
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
        val brandIdentifier =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<BrandIdentifier>())

        val e = assertThrows<TelnyxInvalidDataException> { brandIdentifier.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
