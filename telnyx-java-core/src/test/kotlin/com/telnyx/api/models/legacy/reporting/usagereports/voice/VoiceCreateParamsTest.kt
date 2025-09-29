// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.usagereports.voice

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCreateParamsTest {

    @Test
    fun create() {
        VoiceCreateParams.builder()
            .endTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
            .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
            .aggregationType(0)
            .addConnection(123L)
            .addConnection(456L)
            .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
            .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
            .productBreakdown(0)
            .selectAllManagedAccounts(false)
            .build()
    }

    @Test
    fun body() {
        val params =
            VoiceCreateParams.builder()
                .endTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .aggregationType(0)
                .addConnection(123L)
                .addConnection(456L)
                .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                .productBreakdown(0)
                .selectAllManagedAccounts(false)
                .build()

        val body = params._body()

        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
        assertThat(body.aggregationType()).contains(0)
        assertThat(body.connections().getOrNull()).containsExactly(123L, 456L)
        assertThat(body.managedAccounts().getOrNull())
            .containsExactly(
                "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "6ba7b810-9dad-11d1-80b4-00c04fd430c8",
            )
        assertThat(body.productBreakdown()).contains(0)
        assertThat(body.selectAllManagedAccounts()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VoiceCreateParams.builder()
                .endTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
    }
}
