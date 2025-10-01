// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterTest {

    @Test
    fun create() {
        val filter =
            Filter.builder()
                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                .cld("+13129457420")
                .cldFilter(Filter.CldFilter.CONTAINS)
                .cli("+13129457420")
                .cliFilter(Filter.CliFilter.CONTAINS)
                .filterType(Filter.FilterType.AND)
                .tagsList("tag1")
                .build()

        assertThat(filter.billingGroup()).contains("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
        assertThat(filter.cld()).contains("+13129457420")
        assertThat(filter.cldFilter()).contains(Filter.CldFilter.CONTAINS)
        assertThat(filter.cli()).contains("+13129457420")
        assertThat(filter.cliFilter()).contains(Filter.CliFilter.CONTAINS)
        assertThat(filter.filterType()).contains(Filter.FilterType.AND)
        assertThat(filter.tagsList()).contains("tag1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filter =
            Filter.builder()
                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                .cld("+13129457420")
                .cldFilter(Filter.CldFilter.CONTAINS)
                .cli("+13129457420")
                .cliFilter(Filter.CliFilter.CONTAINS)
                .filterType(Filter.FilterType.AND)
                .tagsList("tag1")
                .build()

        val roundtrippedFilter =
            jsonMapper.readValue(jsonMapper.writeValueAsString(filter), jacksonTypeRef<Filter>())

        assertThat(roundtrippedFilter).isEqualTo(filter)
    }
}
