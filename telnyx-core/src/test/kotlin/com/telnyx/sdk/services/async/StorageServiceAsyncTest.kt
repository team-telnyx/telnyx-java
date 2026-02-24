// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StorageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMigrationSourceCoverage() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val storageServiceAsync = client.storage()

        val responseFuture = storageServiceAsync.listMigrationSourceCoverage()

        val response = responseFuture.get()
        response.validate()
    }
}
