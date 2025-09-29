// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadCreateParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CsvDownloadServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val csvDownloadService = client.phoneNumbers().csvDownloads()

        val csvDownload =
            csvDownloadService.create(
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

        csvDownload.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val csvDownloadService = client.phoneNumbers().csvDownloads()

        val csvDownload = csvDownloadService.retrieve("id")

        csvDownload.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val csvDownloadService = client.phoneNumbers().csvDownloads()

        val csvDownloads =
            csvDownloadService.list(
                CsvDownloadListParams.builder()
                    .page(CsvDownloadListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        csvDownloads.validate()
    }
}
