// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.sessionanalysis

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetadataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val metadataServiceAsync = client.sessionAnalysis().metadata()

        val metadataFuture = metadataServiceAsync.retrieve()

        val metadata = metadataFuture.get()
        metadata.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordType() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val metadataServiceAsync = client.sessionAnalysis().metadata()

        val responseFuture = metadataServiceAsync.retrieveRecordType("record_type")

        val response = responseFuture.get()
        response.validate()
    }
}
