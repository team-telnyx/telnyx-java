// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.sessionanalysis

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetadataServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metadataService = client.sessionAnalysis().metadata()

        val metadata = metadataService.retrieve()

        metadata.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveRecordType() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metadataService = client.sessionAnalysis().metadata()

        val response = metadataService.retrieveRecordType("record_type")

        response.validate()
    }
}
