// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterReplaceResponseTest {

    @Test
    fun create() {
        val filterReplaceResponse =
            FilterReplaceResponse.builder()
                .data(
                    FilterReplaceResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterReplaceResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        assertThat(filterReplaceResponse.data())
            .isEqualTo(
                FilterReplaceResponse.Data.builder()
                    .addAllowlist("@example.com")
                    .addBlocklist("@example.com")
                    .recordType(FilterReplaceResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterReplaceResponse =
            FilterReplaceResponse.builder()
                .data(
                    FilterReplaceResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterReplaceResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        val roundtrippedFilterReplaceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterReplaceResponse),
                jacksonTypeRef<FilterReplaceResponse>(),
            )

        assertThat(roundtrippedFilterReplaceResponse).isEqualTo(filterReplaceResponse)
    }
}
