// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplacedLinkClickTest {

    @Test
    fun create() {
        val replacedLinkClick =
            ReplacedLinkClick.builder()
                .messageId("7ee4241c-f127-47e5-9c34-3aac291f8058")
                .recordType("link_clicked")
                .timeClicked(OffsetDateTime.parse("2019-04-01T14:45:45.450Z"))
                .to("18445550001")
                .url("https://telnyx.com")
                .build()

        assertThat(replacedLinkClick.messageId()).contains("7ee4241c-f127-47e5-9c34-3aac291f8058")
        assertThat(replacedLinkClick.recordType()).contains("link_clicked")
        assertThat(replacedLinkClick.timeClicked())
            .contains(OffsetDateTime.parse("2019-04-01T14:45:45.450Z"))
        assertThat(replacedLinkClick.to()).contains("18445550001")
        assertThat(replacedLinkClick.url()).contains("https://telnyx.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replacedLinkClick =
            ReplacedLinkClick.builder()
                .messageId("7ee4241c-f127-47e5-9c34-3aac291f8058")
                .recordType("link_clicked")
                .timeClicked(OffsetDateTime.parse("2019-04-01T14:45:45.450Z"))
                .to("18445550001")
                .url("https://telnyx.com")
                .build()

        val roundtrippedReplacedLinkClick =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replacedLinkClick),
                jacksonTypeRef<ReplacedLinkClick>(),
            )

        assertThat(roundtrippedReplacedLinkClick).isEqualTo(replacedLinkClick)
    }
}
