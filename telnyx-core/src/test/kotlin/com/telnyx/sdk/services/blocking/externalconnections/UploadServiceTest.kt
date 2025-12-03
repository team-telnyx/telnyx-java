// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.externalConnections().uploads()

        val upload =
            uploadService.create(
                UploadCreateParams.builder()
                    .id("id")
                    .numberIds(
                        listOf(
                            "3920457616934164700",
                            "3920457616934164701",
                            "3920457616934164702",
                            "3920457616934164703",
                        )
                    )
                    .addAdditionalUsage(UploadCreateParams.AdditionalUsage.CALLING_USER_ASSIGNMENT)
                    .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .locationId("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2")
                    .usage(UploadCreateParams.Usage.FIRST_PARTY_APP_ASSIGNMENT)
                    .build()
            )

        upload.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.externalConnections().uploads()

        val upload =
            uploadService.retrieve(
                UploadRetrieveParams.builder()
                    .id("id")
                    .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        upload.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.externalConnections().uploads()

        val page = uploadService.list("id")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pendingCount() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.externalConnections().uploads()

        val response = uploadService.pendingCount("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refreshStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.externalConnections().uploads()

        val response = uploadService.refreshStatus("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retry() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.externalConnections().uploads()

        val response =
            uploadService.retry(
                UploadRetryParams.builder()
                    .id("id")
                    .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        response.validate()
    }
}
