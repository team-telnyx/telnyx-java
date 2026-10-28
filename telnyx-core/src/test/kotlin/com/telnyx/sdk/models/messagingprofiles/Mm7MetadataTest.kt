// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Mm7MetadataTest {

    @Test
    fun create() {
        val mm7Metadata =
            Mm7Metadata.builder()
                .mm7FailoverWebhookUrl("mm7_failover_webhook_url")
                .mm7WebhookUrl("mm7_webhook_url")
                .build()

        assertThat(mm7Metadata.mm7FailoverWebhookUrl()).contains("mm7_failover_webhook_url")
        assertThat(mm7Metadata.mm7WebhookUrl()).contains("mm7_webhook_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mm7Metadata =
            Mm7Metadata.builder()
                .mm7FailoverWebhookUrl("mm7_failover_webhook_url")
                .mm7WebhookUrl("mm7_webhook_url")
                .build()

        val roundtrippedMm7Metadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mm7Metadata),
                jacksonTypeRef<Mm7Metadata>(),
            )

        assertThat(roundtrippedMm7Metadata).isEqualTo(mm7Metadata)
    }
}
