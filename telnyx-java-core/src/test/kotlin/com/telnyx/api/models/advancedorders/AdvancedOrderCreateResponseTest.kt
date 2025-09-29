// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.advancedorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedOrderCreateResponseTest {

    @Test
    fun create() {
        val advancedOrderCreateResponse = AdvancedOrderCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedOrderCreateResponse = AdvancedOrderCreateResponse.builder().build()

        val roundtrippedAdvancedOrderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedOrderCreateResponse),
                jacksonTypeRef<AdvancedOrderCreateResponse>(),
            )

        assertThat(roundtrippedAdvancedOrderCreateResponse).isEqualTo(advancedOrderCreateResponse)
    }
}
