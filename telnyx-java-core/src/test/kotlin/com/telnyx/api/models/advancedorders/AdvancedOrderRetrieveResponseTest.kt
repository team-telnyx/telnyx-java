// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderRetrieveResponseTest {

    @Test
    fun create() {
        val advancedOrderRetrieveResponse = AdvancedOrderRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderRetrieveResponse = AdvancedOrderRetrieveResponse.builder().build()

        val roundtrippedAdvancedOrderRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderRetrieveResponse),
                jacksonTypeRef<AdvancedOrderRetrieveResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderRetrieveResponse)
            .isEqualTo(advancedOrderRetrieveResponse)
    }
}
