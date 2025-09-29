// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderUpdateResponseTest {

    @Test
    fun create() {
        val advancedOrderUpdateResponse = AdvancedOrderUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderUpdateResponse = AdvancedOrderUpdateResponse.builder().build()

        val roundtrippedAdvancedOrderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderUpdateResponse),
                jacksonTypeRef<AdvancedOrderUpdateResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderUpdateResponse).isEqualTo(advancedOrderUpdateResponse)
    }
}
