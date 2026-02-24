// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.batchdetailrecords

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.Filter
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging.MessagingCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.legacy().reporting().batchDetailRecords().messaging()

        val messaging =
            messagingService.create(
                MessagingCreateParams.builder()
                    .endTime(OffsetDateTime.parse("2024-02-12T23:59:59Z"))
                    .startTime(OffsetDateTime.parse("2024-02-01T00:00:00Z"))
                    .addConnection(123L)
                    .addConnection(456L)
                    .addDirection(1)
                    .addDirection(2)
                    .addFilter(
                        Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(Filter.CliFilter.CONTAINS)
                            .filterType(Filter.FilterType.AND)
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
            )

        messaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.legacy().reporting().batchDetailRecords().messaging()

        val messaging = messagingService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        messaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.legacy().reporting().batchDetailRecords().messaging()

        val messagings = messagingService.list()

        messagings.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.legacy().reporting().batchDetailRecords().messaging()

        val messaging = messagingService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        messaging.validate()
    }
}
