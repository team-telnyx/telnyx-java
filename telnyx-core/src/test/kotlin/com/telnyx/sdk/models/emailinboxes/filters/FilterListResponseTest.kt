// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterListResponseTest {

    @Test
    fun create() {
        val filterListResponse =
            FilterListResponse.builder()
                .data(
                    FilterListResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterListResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        assertThat(filterListResponse.data())
            .isEqualTo(
                FilterListResponse.Data.builder()
                    .addAllowlist("@example.com")
                    .addBlocklist("@example.com")
                    .recordType(FilterListResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterListResponse =
            FilterListResponse.builder()
                .data(
                    FilterListResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterListResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        val roundtrippedFilterListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterListResponse),
                jacksonTypeRef<FilterListResponse>(),
            )

        assertThat(roundtrippedFilterListResponse).isEqualTo(filterListResponse)
    }
}
