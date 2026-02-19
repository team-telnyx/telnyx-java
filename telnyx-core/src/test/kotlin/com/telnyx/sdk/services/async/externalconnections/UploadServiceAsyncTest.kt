// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UploadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val uploadFuture =
            uploadServiceAsync.create(
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

        val upload = uploadFuture.get()
        upload.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val uploadFuture =
            uploadServiceAsync.retrieve(
                UploadRetrieveParams.builder()
                    .id("id")
                    .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        val upload = uploadFuture.get()
        upload.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val pageFuture = uploadServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pendingCount() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val responseFuture = uploadServiceAsync.pendingCount("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refreshStatus() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val responseFuture = uploadServiceAsync.refreshStatus("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retry() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val responseFuture =
            uploadServiceAsync.retry(
                UploadRetryParams.builder()
                    .id("id")
                    .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
