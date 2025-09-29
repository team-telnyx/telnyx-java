// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.usagereports.messaging

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingCreateParamsTest {

    @Test
    fun create() {
        MessagingCreateParams.builder()
            .aggregationType(0)
            .endTime(OffsetDateTime.parse("2020-01-02T00:00:00Z"))
            .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
            .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
            .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
            .selectAllManagedAccounts(true)
            .startTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            MessagingCreateParams.builder()
                .aggregationType(0)
                .endTime(OffsetDateTime.parse("2020-01-02T00:00:00Z"))
                .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                .selectAllManagedAccounts(true)
                .startTime(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.aggregationType()).isEqualTo(0)
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2020-01-02T00:00:00Z"))
        assertThat(body.managedAccounts().getOrNull())
            .containsExactly(
                "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                "6ba7b810-9dad-11d1-80b4-00c04fd430c8",
            )
        assertThat(body.profiles().getOrNull())
            .containsExactly(
                "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                "7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f",
            )
        assertThat(body.selectAllManagedAccounts()).contains(true)
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessagingCreateParams.builder().aggregationType(0).build()

        val body = params._body()

        assertThat(body.aggregationType()).isEqualTo(0)
    }
}
