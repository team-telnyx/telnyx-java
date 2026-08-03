// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailblocks

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailblocks.import_.ImportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ImportServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val importServiceAsync = client.emailBlocks().import_()

        val emailBlockImportResponseFuture =
            importServiceAsync.create(
                ImportCreateParams.builder()
                    .file("Example data".byteInputStream())
                    .blockTtlDays(1L)
                    .build()
            )

        val emailBlockImportResponse = emailBlockImportResponseFuture.get()
        emailBlockImportResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val importServiceAsync = client.emailBlocks().import_()

        val emailBlockImportResponseFuture =
            importServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailBlockImportResponse = emailBlockImportResponseFuture.get()
        emailBlockImportResponse.validate()
    }
}
