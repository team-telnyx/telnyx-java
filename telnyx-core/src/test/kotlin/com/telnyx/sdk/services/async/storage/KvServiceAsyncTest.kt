// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.kvs.KvCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KvServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val kvServiceAsync = client.storage().kvs()

        val kvNamespaceResponseWrapperFuture =
            kvServiceAsync.create(KvCreateParams.builder().name("my-cache").build())

        val kvNamespaceResponseWrapper = kvNamespaceResponseWrapperFuture.get()
        kvNamespaceResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val kvServiceAsync = client.storage().kvs()

        val kvNamespaceResponseWrapperFuture =
            kvServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val kvNamespaceResponseWrapper = kvNamespaceResponseWrapperFuture.get()
        kvNamespaceResponseWrapper.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val kvServiceAsync = client.storage().kvs()

        val pageFuture = kvServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val kvServiceAsync = client.storage().kvs()

        val kvNamespaceResponseWrapperFuture =
            kvServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val kvNamespaceResponseWrapper = kvNamespaceResponseWrapperFuture.get()
        kvNamespaceResponseWrapper.validate()
    }
}
