// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging.MessagingCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessagingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingServiceAsync = client.legacy().reporting().batchDetailRecords().messaging()

        val messagingFuture =
            messagingServiceAsync.create(
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
            )

        val messaging = messagingFuture.get()
        messaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingServiceAsync = client.legacy().reporting().batchDetailRecords().messaging()

        val messagingFuture = messagingServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val messaging = messagingFuture.get()
        messaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingServiceAsync = client.legacy().reporting().batchDetailRecords().messaging()

        val messagingsFuture = messagingServiceAsync.list()

        val messagings = messagingsFuture.get()
        messagings.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingServiceAsync = client.legacy().reporting().batchDetailRecords().messaging()

        val messagingFuture = messagingServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val messaging = messagingFuture.get()
        messaging.validate()
    }
}
