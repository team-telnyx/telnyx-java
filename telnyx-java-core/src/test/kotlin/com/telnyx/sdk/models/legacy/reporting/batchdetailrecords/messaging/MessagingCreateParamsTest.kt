// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingCreateParamsTest {

    @Test
    fun create() {
        MessagingCreateParams.builder()
            .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
            .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
            .addConnection(123L)
            .addConnection(456L)
            .addDirection(1)
            .addDirection(2)
            .addFilter(
                MessagingCreateParams.Filter.builder()
                    .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                    .cld("+13129457420")
                    .cldFilter(MessagingCreateParams.Filter.CldFilter.CONTAINS)
                    .cli("+13129457420")
                    .cliFilter(MessagingCreateParams.Filter.CliFilter.CONTAINS)
                    .filterType(MessagingCreateParams.Filter.FilterType.AND)
                    .tagsList("tag1")
                    .build()
            )
            .includeMessageBody(true)
            .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
            .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
            .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
            .addRecordType(1)
            .addRecordType(2)
            .reportName("My MDR Report")
            .selectAllManagedAccounts(false)
            .timezone("UTC")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessagingCreateParams.builder()
                .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
                .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .addConnection(123L)
                .addConnection(456L)
                .addDirection(1)
                .addDirection(2)
                .addFilter(
                    MessagingCreateParams.Filter.builder()
                        .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                        .cld("+13129457420")
                        .cldFilter(MessagingCreateParams.Filter.CldFilter.CONTAINS)
                        .cli("+13129457420")
                        .cliFilter(MessagingCreateParams.Filter.CliFilter.CONTAINS)
                        .filterType(MessagingCreateParams.Filter.FilterType.AND)
                        .tagsList("tag1")
                        .build()
                )
                .includeMessageBody(true)
                .addManagedAccount("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .addManagedAccount("6ba7b810-9dad-11d1-80b4-00c04fd430c8")
                .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                .addRecordType(1)
                .addRecordType(2)
                .reportName("My MDR Report")
                .selectAllManagedAccounts(false)
                .timezone("UTC")
                .build()

        val body = params._body()

        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
        assertThat(body.connections().getOrNull()).containsExactly(123L, 456L)
        assertThat(body.directions().getOrNull()).containsExactly(1, 2)
        assertThat(body.filters().getOrNull())
            .containsExactly(
                MessagingCreateParams.Filter.builder()
                    .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                    .cld("+13129457420")
                    .cldFilter(MessagingCreateParams.Filter.CldFilter.CONTAINS)
                    .cli("+13129457420")
                    .cliFilter(MessagingCreateParams.Filter.CliFilter.CONTAINS)
                    .filterType(MessagingCreateParams.Filter.FilterType.AND)
                    .tagsList("tag1")
                    .build()
            )
        assertThat(body.includeMessageBody()).contains(true)
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
        assertThat(body.recordTypes().getOrNull()).containsExactly(1, 2)
        assertThat(body.reportName()).contains("My MDR Report")
        assertThat(body.selectAllManagedAccounts()).contains(false)
        assertThat(body.timezone()).contains("UTC")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessagingCreateParams.builder()
                .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
                .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.endTime()).isEqualTo(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
    }
}
