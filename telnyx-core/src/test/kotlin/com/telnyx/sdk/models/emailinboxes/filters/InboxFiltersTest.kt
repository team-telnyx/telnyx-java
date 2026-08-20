// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.filters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxFiltersTest {

    @Test
    fun create() {
        val inboxFilters =
            InboxFilters.builder()
                .addAllowlist("@example.com")
                .addBlocklist("@example.com")
                .recordType(InboxFilters.RecordType.EMAIL_INBOX_FILTERS)
                .build()

        assertThat(inboxFilters.allowlist()).containsExactly("@example.com")
        assertThat(inboxFilters.blocklist()).containsExactly("@example.com")
        assertThat(inboxFilters.recordType()).isEqualTo(InboxFilters.RecordType.EMAIL_INBOX_FILTERS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboxFilters =
            InboxFilters.builder()
                .addAllowlist("@example.com")
                .addBlocklist("@example.com")
                .recordType(InboxFilters.RecordType.EMAIL_INBOX_FILTERS)
                .build()

        val roundtrippedInboxFilters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboxFilters),
                jacksonTypeRef<InboxFilters>(),
            )

        assertThat(roundtrippedInboxFilters).isEqualTo(inboxFilters)
    }
}
