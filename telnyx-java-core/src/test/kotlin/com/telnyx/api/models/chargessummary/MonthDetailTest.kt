// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.chargessummary

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonthDetailTest {

    @Test
    fun create() {
        val monthDetail = MonthDetail.builder().mrc("25.50").quantity(10L).otc("5.00").build()

        assertThat(monthDetail.mrc()).isEqualTo("25.50")
        assertThat(monthDetail.quantity()).isEqualTo(10L)
        assertThat(monthDetail.otc()).contains("5.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monthDetail = MonthDetail.builder().mrc("25.50").quantity(10L).otc("5.00").build()

        val roundtrippedMonthDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monthDetail),
                jacksonTypeRef<MonthDetail>(),
            )

        assertThat(roundtrippedMonthDetail).isEqualTo(monthDetail)
    }
}
