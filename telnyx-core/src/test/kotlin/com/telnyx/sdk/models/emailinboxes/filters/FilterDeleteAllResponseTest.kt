// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterDeleteAllResponseTest {

    @Test
    fun create() {
        val filterDeleteAllResponse =
            FilterDeleteAllResponse.builder()
                .data(
                    FilterDeleteAllResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterDeleteAllResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        assertThat(filterDeleteAllResponse.data())
            .isEqualTo(
                FilterDeleteAllResponse.Data.builder()
                    .addAllowlist("@example.com")
                    .addBlocklist("@example.com")
                    .recordType(FilterDeleteAllResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterDeleteAllResponse =
            FilterDeleteAllResponse.builder()
                .data(
                    FilterDeleteAllResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterDeleteAllResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        val roundtrippedFilterDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterDeleteAllResponse),
                jacksonTypeRef<FilterDeleteAllResponse>(),
            )

        assertThat(roundtrippedFilterDeleteAllResponse).isEqualTo(filterDeleteAllResponse)
    }
}
