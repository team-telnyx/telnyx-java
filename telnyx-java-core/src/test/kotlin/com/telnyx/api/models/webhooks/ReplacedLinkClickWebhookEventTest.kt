// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplacedLinkClickWebhookEventTest {

    @Test
    fun create() {
        val replacedLinkClickWebhookEvent =
            ReplacedLinkClickWebhookEvent.builder()
                .data(
                    ReplacedLinkClickWebhookEvent.Data.builder()
                        .messageId("7ee4241c-f127-47e5-9c34-3aac291f8058")
                        .recordType("link_clicked")
                        .timeClicked(OffsetDateTime.parse("2019-04-01T14:45:45.450Z"))
                        .to("18445550001")
                        .url("https://telnyx.com")
                        .build()
                )
                .build()

        assertThat(replacedLinkClickWebhookEvent.data())
            .contains(
                ReplacedLinkClickWebhookEvent.Data.builder()
                    .messageId("7ee4241c-f127-47e5-9c34-3aac291f8058")
                    .recordType("link_clicked")
                    .timeClicked(OffsetDateTime.parse("2019-04-01T14:45:45.450Z"))
                    .to("18445550001")
                    .url("https://telnyx.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replacedLinkClickWebhookEvent =
            ReplacedLinkClickWebhookEvent.builder()
                .data(
                    ReplacedLinkClickWebhookEvent.Data.builder()
                        .messageId("7ee4241c-f127-47e5-9c34-3aac291f8058")
                        .recordType("link_clicked")
                        .timeClicked(OffsetDateTime.parse("2019-04-01T14:45:45.450Z"))
                        .to("18445550001")
                        .url("https://telnyx.com")
                        .build()
                )
                .build()

        val roundtrippedReplacedLinkClickWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replacedLinkClickWebhookEvent),
                jacksonTypeRef<ReplacedLinkClickWebhookEvent>(),
            )

        assertThat(roundtrippedReplacedLinkClickWebhookEvent)
            .isEqualTo(replacedLinkClickWebhookEvent)
    }
}
