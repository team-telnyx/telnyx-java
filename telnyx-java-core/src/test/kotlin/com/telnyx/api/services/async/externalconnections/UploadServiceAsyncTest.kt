// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.externalconnections

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.api.models.externalconnections.uploads.UploadListParams
import com.telnyx.api.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.api.models.externalconnections.uploads.UploadRetryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val uploadsFuture =
            uploadServiceAsync.list(
                UploadListParams.builder()
                    .id("id")
                    .filter(
                        UploadListParams.Filter.builder()
                            .civicAddressId(
                                UploadListParams.Filter.CivicAddressId.builder()
                                    .eq("19990261512338516954")
                                    .build()
                            )
                            .locationId(
                                UploadListParams.Filter.LocationId.builder()
                                    .eq("19995665508264022121")
                                    .build()
                            )
                            .phoneNumber(
                                UploadListParams.Filter.PhoneNumber.builder()
                                    .contains("+1970")
                                    .eq("+19705555098")
                                    .build()
                            )
                            .status(
                                UploadListParams.Filter.Status.builder()
                                    .addEq(UploadListParams.Filter.Status.Eq.PENDING_UPLOAD)
                                    .addEq(UploadListParams.Filter.Status.Eq.PENDING)
                                    .build()
                            )
                            .build()
                    )
                    .page(UploadListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val uploads = uploadsFuture.get()
        uploads.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun pendingCount() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val responseFuture = uploadServiceAsync.pendingCount("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refreshStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.externalConnections().uploads()

        val responseFuture = uploadServiceAsync.refreshStatus("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retry() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
