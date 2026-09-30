// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NamespaceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val namespaceServiceAsync = client.ai().memory().namespaces()

        val namespaceFuture =
            namespaceServiceAsync.create(NamespaceCreateParams.builder().name("staging").build())

        val namespace = namespaceFuture.get()
        namespace.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val namespaceServiceAsync = client.ai().memory().namespaces()

        val namespaceFuture =
            namespaceServiceAsync.retrieve(
                NamespaceRetrieveParams.builder()
                    .namespace("namespace")
                    .operationId("operation_id")
                    .build()
            )

        val namespace = namespaceFuture.get()
        namespace.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val namespaceServiceAsync = client.ai().memory().namespaces()

        val namespacesFuture = namespaceServiceAsync.list()

        val namespaces = namespacesFuture.get()
        namespaces.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val namespaceServiceAsync = client.ai().memory().namespaces()

        val future = namespaceServiceAsync.delete("namespace")

        val response = future.get()
    }
}
