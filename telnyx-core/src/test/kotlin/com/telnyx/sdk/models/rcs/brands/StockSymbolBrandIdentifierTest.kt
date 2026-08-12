// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StockSymbolBrandIdentifierTest {

    @Test
    fun create() {
        val stockSymbolBrandIdentifier =
            StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()

        assertThat(stockSymbolBrandIdentifier.value()).isEqualTo("J!Q0Ok0bzJb7:pro")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stockSymbolBrandIdentifier =
            StockSymbolBrandIdentifier.builder().value("J!Q0Ok0bzJb7:pro").build()

        val roundtrippedStockSymbolBrandIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stockSymbolBrandIdentifier),
                jacksonTypeRef<StockSymbolBrandIdentifier>(),
            )

        assertThat(roundtrippedStockSymbolBrandIdentifier).isEqualTo(stockSymbolBrandIdentifier)
    }
}
