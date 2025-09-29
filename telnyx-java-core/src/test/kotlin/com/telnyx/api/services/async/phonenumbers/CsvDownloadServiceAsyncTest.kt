// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadCreateParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CsvDownloadServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val csvDownloadServiceAsync = client.phoneNumbers().csvDownloads()

        val csvDownloadFuture =
            csvDownloadServiceAsync.create(
                CsvDownloadCreateParams.builder()
                    .csvFormat(CsvDownloadCreateParams.CsvFormat.V2)
                    .filter(
                        CsvDownloadCreateParams.Filter.builder()
                            .billingGroupId("62e4bf2e-c278-4282-b524-488d9c9c43b2")
                            .connectionId("1521916448077776306")
                            .customerReference("customer_reference")
                            .emergencyAddressId("9102160989215728032")
                            .hasBundle("has_bundle")
                            .phoneNumber("phone_number")
                            .status(CsvDownloadCreateParams.Filter.Status.ACTIVE)
                            .tag("tag")
                            .voiceConnectionName(
                                CsvDownloadCreateParams.Filter.VoiceConnectionName.builder()
                                    .contains("test")
                                    .endsWith("test")
                                    .eq("test")
                                    .startsWith("test")
                                    .build()
                            )
                            .voiceUsagePaymentMethod(
                                CsvDownloadCreateParams.Filter.VoiceUsagePaymentMethod.CHANNEL
                            )
                            .build()
                    )
                    .build()
            )

        val csvDownload = csvDownloadFuture.get()
        csvDownload.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val csvDownloadServiceAsync = client.phoneNumbers().csvDownloads()

        val csvDownloadFuture = csvDownloadServiceAsync.retrieve("id")

        val csvDownload = csvDownloadFuture.get()
        csvDownload.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val csvDownloadServiceAsync = client.phoneNumbers().csvDownloads()

        val csvDownloadsFuture =
            csvDownloadServiceAsync.list(
                CsvDownloadListParams.builder()
                    .page(CsvDownloadListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val csvDownloads = csvDownloadsFuture.get()
        csvDownloads.validate()
    }
}
