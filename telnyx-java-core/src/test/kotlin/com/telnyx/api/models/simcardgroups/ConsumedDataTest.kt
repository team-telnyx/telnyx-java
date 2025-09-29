// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsumedDataTest {

    @Test
    fun create() {
        val consumedData = ConsumedData.builder().amount("2048.1").unit("MB").build()

        assertThat(consumedData.amount()).contains("2048.1")
        assertThat(consumedData.unit()).contains("MB")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val consumedData = ConsumedData.builder().amount("2048.1").unit("MB").build()

        val roundtrippedConsumedData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(consumedData),
                jacksonTypeRef<ConsumedData>(),
            )

        assertThat(roundtrippedConsumedData).isEqualTo(consumedData)
    }
}
