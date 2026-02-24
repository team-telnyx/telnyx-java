// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UploadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uploadService = client.externalConnections().uploads()

        val upload =
            uploadService.create(
                UploadCreateParams.builder()
                    .id("1293384261075731499")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uploadService = client.externalConnections().uploads()

        val upload =
            uploadService.retrieve(
                UploadRetrieveParams.builder()
                    .id("1293384261075731499")
                    .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        upload.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uploadService = client.externalConnections().uploads()

        val page = uploadService.list("1293384261075731499")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pendingCount() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uploadService = client.externalConnections().uploads()

        val response = uploadService.pendingCount("1293384261075731499")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refreshStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uploadService = client.externalConnections().uploads()

        val response = uploadService.refreshStatus("1293384261075731499")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retry() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val uploadService = client.externalConnections().uploads()

        val response =
            uploadService.retry(
                UploadRetryParams.builder()
                    .id("1293384261075731499")
                    .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        response.validate()
    }
}
