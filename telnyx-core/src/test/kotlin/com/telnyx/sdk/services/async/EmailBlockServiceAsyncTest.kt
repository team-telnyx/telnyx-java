// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailblocks.EmailBlockCreateParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveExportParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailBlockServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailBlockServiceAsync = client.emailBlocks()

        val emailBlockResponseFuture =
            emailBlockServiceAsync.create(
                EmailBlockCreateParams.builder()
                    .to("spammer@bad.tld")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                    .from("from")
                    .build()
            )

        val emailBlockResponse = emailBlockResponseFuture.get()
        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailBlockServiceAsync = client.emailBlocks()

        val emailBlockResponseFuture =
            emailBlockServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailBlockResponse = emailBlockResponseFuture.get()
        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailBlockServiceAsync = client.emailBlocks()

        val pageFuture = emailBlockServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailBlockServiceAsync = client.emailBlocks()

        val emailBlockResponseFuture =
            emailBlockServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailBlockResponse = emailBlockResponseFuture.get()
        emailBlockResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailBlockServiceAsync = client.emailBlocks()

        val responseFuture =
            emailBlockServiceAsync.retrieveEvents(
                EmailBlockRetrieveEventsParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveExport() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailBlockServiceAsync = client.emailBlocks()

        val responseFuture =
            emailBlockServiceAsync.retrieveExport(
                EmailBlockRetrieveExportParams.builder()
                    .filterCreatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filterCreatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filterDomainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterReason(EmailBlockRetrieveExportParams.FilterReason.HARD_BOUNCE)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .sort(EmailBlockRetrieveExportParams.Sort.CREATED_AT)
                    .build()
            )

        val response = responseFuture.get()
    }
}
