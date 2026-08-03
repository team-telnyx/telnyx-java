// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterAddResponseTest {

    @Test
    fun create() {
        val filterAddResponse =
            FilterAddResponse.builder()
                .data(
                    FilterAddResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterAddResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        assertThat(filterAddResponse.data())
            .isEqualTo(
                FilterAddResponse.Data.builder()
                    .addAllowlist("@example.com")
                    .addBlocklist("@example.com")
                    .recordType(FilterAddResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterAddResponse =
            FilterAddResponse.builder()
                .data(
                    FilterAddResponse.Data.builder()
                        .addAllowlist("@example.com")
                        .addBlocklist("@example.com")
                        .recordType(FilterAddResponse.Data.RecordType.EMAIL_INBOX_FILTERS)
                        .build()
                )
                .build()

        val roundtrippedFilterAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterAddResponse),
                jacksonTypeRef<FilterAddResponse>(),
            )

        assertThat(roundtrippedFilterAddResponse).isEqualTo(filterAddResponse)
    }
}
