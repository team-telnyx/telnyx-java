// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderListResponseTest {

    @Test
    fun create() {
        val advancedOrderListResponse = AdvancedOrderListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderListResponse = AdvancedOrderListResponse.builder().build()

        val roundtrippedAdvancedOrderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderListResponse),
                jacksonTypeRef<AdvancedOrderListResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderListResponse).isEqualTo(advancedOrderListResponse)
    }
}
