// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NamespaceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val namespaceService = client.ai().memory().namespaces()

        val namespace =
            namespaceService.retrieve(
                NamespaceRetrieveParams.builder()
                    .namespace("namespace")
                    .operationId("operation_id")
                    .build()
            )

        namespace.validate()
    }
}
